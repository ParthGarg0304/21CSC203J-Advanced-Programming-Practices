#Python program to construct a DFA that accepts binary strings ending in '01'.

class BinaryStringDFA:
    def __init__(self):
        self.states = {'q0', 'q1', 'q2'}
        self.alphabet = {'0', '1'}
        self.start_state = 'q0'
        self.accept_states = {'q2'}
        self.transitions = {
            'q0': {'0': 'q0', '1': 'q1'},
            'q1': {'0': 'q2', '1': 'q1'},
            'q2': {'0': 'q0', '1': 'q1'}
        }

    def is_valid_input(self, input_string):
        return all(char in self.alphabet for char in input_string)

    def process_input(self, input_string):
        if not self.is_valid_input(input_string):
            return False

        current_state = self.start_state
        for char in input_string:
            current_state = self.transitions[current_state][char]

        return current_state in self.accept_states

def main():
    dfa = BinaryStringDFA()
    while True:
        input_string = input("Enter a binary string (or 'exit' to quit): ")
        if input_string.lower() == 'exit':
            break
        if dfa.process_input(input_string):
            print("Accepted")
        else:
            print("Not Accepted")

if __name__ == "__main__":
    main()

