
class NFA:
    def __init__(self):
        self.states = {'q0', 'q1'}
        self.alphabet = {'0', '1'}
        self.transitions = {
            'q0': {'0': {'q0'}, '1': {'q1'}},
            'q1': {'0': {'q1'}, '1': {'q1'}},
        }
        self.start_state = 'q0'
        self.accept_states = {'q1'}

    def accepts(self, input_string):
        current_state = self.start_state
        for symbol in input_string:
            if symbol not in self.alphabet:
                return False
            if symbol in self.transitions[current_state]:
                current_state = self.transitions[current_state][symbol].pop()
            else:
                return False
        return current_state in self.accept_states

# Test the NFA
if __name__ == '__main__':
    nfa = NFA()
    test_strings = ["01", "001", "101", "00101", "1101", "0101", "0", "1", "0010", "010"]

    for string in test_strings:
        if nfa.accepts(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')
