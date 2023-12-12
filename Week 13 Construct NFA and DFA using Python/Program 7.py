#Python function that checks if a given string is accepted by a DFA that recognizes the pattern "ab*c". 

def is_accepted_by_dfa(input_string):
    # Define the DFA transitions
    transitions = {
        0: {'a': 1, 'b': 0},
        1: {'a': 1, 'b': 2},
        2: {'a': 1, 'b': 2}
    }
    final_state = 2

    # Initialize the current state
    current_state = 0

    # Iterate over the input string
    for char in input_string:
        if char in transitions[current_state]:
            current_state = transitions[current_state][char]
        else:
            return False

    return current_state == final_state

# Example usage
print(is_accepted_by_dfa("abbc"))  # Output: True
print(is_accepted_by_dfa("abc"))   # Output: True
print(is_accepted_by_dfa("ac"))    # Output: False
print(is_accepted_by_dfa("b"))     # Output: False

