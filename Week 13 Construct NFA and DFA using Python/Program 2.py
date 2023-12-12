#Python function to check if a given string is accepted by an NFA that recognizes the pattern "ab|ba" (either "ab" or "ba"). 


def is_accepted_by_nfa(input_string):
    # Define the NFA transitions using a dictionary
    transitions = {
        0: {'a': [1, 3], 'b': [2, 4]},
        1: {'a': [5], 'b': [6]},
        2: {'a': [6], 'b': [5]},
        3: {'a': [7], 'b': [8]},
        4: {'a': [8], 'b': [7]},
        5: {'a': [5], 'b': [5]},
        6: {'a': [6], 'b': [6]},
        7: {'a': [7], 'b': [7]},
        8: {'a': [8], 'b': [8],
    }
    
    # Initial state
    current_state = 0
    
    # Iterate through the input string
    for char in input_string:
        if char in transitions[current_state]:
            current_state = transitions[current_state][char][0]
        else:
            return False
    
    # Check if the final state is an accepting state
    return current_state in {1, 2, 5, 6}

# Test the function
input_string = "ab"
if is_accepted_by_nfa(input_string):
    print(f"The string '{input_string}' is accepted by the NFA.")
else:
    print(f"The string '{input_string}' is not accepted by the NFA.")

