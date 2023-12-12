
class NFA:
    def __init__(self):
        self.states = {'q0', 'q1', 'q2', 'q3', 'q4', 'q5'}
        self.alphabet = {'a', 'b'}
        self.transitions = {
            'q0': {'a': {'q0', 'q1'}, 'b': {'q0', 'q1'}},
            'q1': {'a': {'q0'}, 'b': {'q2'}},
            'q2': {'a': {'q3'}, 'b': {'q2'}},
            'q3': {'a': {'q3', 'q2'}, 'b': {'q3', 'q2'}},
            'q4': {'a': {'q4', 'q5'}, 'b': {'q4', 'q5'}},
            'q5': {'a': {'q5', 'q2'}, 'b': {'q5', 'q2'}},
        }
        self.start_state = 'q0'
        self.accept_states = {'q2'}

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
    test_strings = ["bb", "abb", "bba", "aabaabba", "baaabbab", "baaaabbaabba"]

    for string in test_strings:
        if nfa.accepts(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')


