#Python script that converts a simple NFA into a DFA with two states. 


class NFAtoDFAConverter:
    def __init__(self, nfa_transitions, nfa_accept_states):
        self.nfa_transitions = nfa_transitions
        self.nfa_accept_states = nfa_accept_states
        self.dfa_states = []
        self.dfa_transitions = {}
        self.dfa_accept_states = []
        self.visited_states = set()
        self.nfa_states = set()

    def epsilon_closure(self, states):
        closure = set(states)
        stack = list(states)

        while stack:
            state = stack.pop()
            if state in self.nfa_transitions and 'ε' in self.nfa_transitions[state]:
                epsilon_transitions = self.nfa_transitions[state]['ε']
                for next_state in epsilon_transitions:
                    if next_state not in closure:
                        closure.add(next_state)
                        stack.append(next_state)

        return closure

    def move(self, states, symbol):
        result = set()
        for state in states:
            if state in self.nfa_transitions and symbol in self.nfa_transitions[state]:
                result.update(self.nfa_transitions[state][symbol])
        return result

    def get_dfa_state(self, states):
        if len(states) == 0:
            return None

        state_name = ",".join(sorted(states))
        if state_name not in self.dfa_states:
            self.dfa_states.append(state_name)
            self.visited_states.add(state_name)
            self.dfa_transitions[state_name] = {}

            for symbol in self.nfa_states:
                move_result = self.move(states, symbol)
                epsilon_result = self.epsilon_closure(move_result)

                if len(epsilon_result) > 0:
                    epsilon_state_name = ",".join(sorted(epsilon_result))
                    self.dfa_transitions[state_name][symbol] = epsilon_state_name

                if epsilon_state_name not in self.visited_states:
                    self.get_dfa_state(epsilon_result)

                if epsilon_state_name in self.nfa_accept_states:
                    self.dfa_accept_states.append(state_name)

        return state_name

    def convert(self):
        # Get the initial state of the DFA
        self.nfa_states = set(self.nfa_transitions.keys())
        initial_state = self.epsilon_closure(self.nfa_states)
        initial_dfa_state = self.get_dfa_state(initial_state)

        return initial_dfa_state

def main():
    nfa_transitions = {
        'q0': {'0': ['q0', 'q1'], 'ε': ['q1']},
        'q1': {'1': ['q2']}
    }

    nfa_accept_states = {'q2'}

    converter = NFAtoDFAConverter(nfa_transitions, nfa_accept_states)
    initial_dfa_state = converter.convert()

    print("NFA Transitions:")
    for state, transitions in nfa_transitions.items():
        print(f"{state}: {transitions}")

    print("\nNFA Accept States:")
    print(nfa_accept_states)

    print("\nDFA States:")
    print(converter.dfa_states)

    print("\nDFA Transitions:")
    print(converter.dfa_transitions)

    print("\nDFA Accept States:")
    print(converter.dfa_accept_states)

if __name__ == "__main__":
    main()

