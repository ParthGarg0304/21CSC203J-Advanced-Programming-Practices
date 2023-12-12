class NFA:
    def __init__(self):
        self.states = {'q0', 'q1', 'q2', 'q3', 'q4'}
        self.alphabet = {'0', '1'}
        self.transitions = {
            'q0': {'0': {'q1'}},
            'q1': {'0': {'q2'}, '1': {'q1'}},
            'q2': {'0': {'q4'}, '1': {'q2'}},
            'q3': {'0': {'q3'}, '1': {'q3'}},
            'q4': {'0': {'q4'}, '1': {'q4'}}
        }
        self.start_state = 'q0'
        self.accept_states = {'q4'}

    def accepts(self, input_string):
        current_states = {self.start_state}
        for symbol in input_string:
            next_states = set()
            for state in current_states:
                if symbol in self.transitions[state]:
                    next_states.update(self.transitions[state][symbol])
            current_states = next_states
        return any(state in current_states for state in self.accept_states)

# Test the NFA
if __name__ == '__main__':
    nfa = NFA()
    test_strings = ["000", "010", "0000", "0110", "001100", "111", "010101", "101010"]

    for string in test_strings:
        if nfa.accepts(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')

