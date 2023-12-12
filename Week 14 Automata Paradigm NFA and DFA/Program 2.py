
class DFA:
    def __init__(self):
        self.states = {'q0', 'q1', 'q2'}
        self.alphabet = {'a', 'b'}
        self.transition_table = {
            'q0': {'a': 'q1', 'b': 'q0'},
            'q1': {'a': 'q1', 'b': 'q2'},
            'q2': {'a': 'q2', 'b': 'q2'}
        }
        self.start_state = 'q0'
        self.accept_states = {'q2'}

    def accepts(self, input_string):
        current_state = self.start_state
        for symbol in input_string:
            if symbol not in self.alphabet:
                return False
            current_state = self.transition_table[current_state][symbol]
        return current_state in self.accept_states

# Test the DFA
if __name__ == '__main__':
    dfa = DFA()
    test_strings = ["abracadabra", "abracadab", "abcd", "ba", "ab", "b"]

    for string in test_strings:
        if dfa.accepts(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')
