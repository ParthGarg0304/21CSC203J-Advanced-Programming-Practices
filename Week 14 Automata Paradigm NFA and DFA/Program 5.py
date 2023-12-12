
class DFA:
    def __init__(self):
        self.states = {'q0', 'q1', 'q2', 'q3', 'q4'}
        self.alphabet = {'0', '1'}
        self.transition_table = {
            'q0': {'0': 'q1', '1': 'q3'},
            'q1': {'0': 'q2', '1': 'q3'},
            'q2': {'0': 'q2', '1': 'q3'},
            'q3': {'0': 'q1', '1': 'q4'},
            'q4': {'0': 'q1', '1': 'q4'},
        }
        self.start_state = 'q0'
        self.accept_states = {'q2', 'q4'}

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
    test_strings = ["00100", "11011", "001", "110", "010", "101"]

    for string in test_strings:
        if dfa.accepts(string):
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')
