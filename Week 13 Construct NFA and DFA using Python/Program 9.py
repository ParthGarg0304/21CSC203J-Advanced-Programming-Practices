#Python function that converts a simple regular expression like "a(b|c)*" into an equivalent NFA.

class NFA:
    def __init__(self, states, alphabet, transitions, start_state, accept_states):
        self.states = states
        self.alphabet = alphabet
        self.transitions = transitions
        self.start_state = start_state
        self.accept_states = accept_states

def regex_to_nfa(regex):
    states = set(range(1, len(regex) + 2))
    alphabet = set(regex) - {'(', ')', '|', '*', '+'}
    transitions = {}
    start_state = 1
    accept_states = {len(regex) + 1}

    stack = []
    state_counter = 1

    for char in regex:
        if char in alphabet:
            state_counter += 1
            transitions[(state_counter - 1, char)] = {state_counter}
            stack.append((state_counter - 1, char, state_counter))
        elif char == '(':
            stack.append('(', state_counter)
        elif char == '|':
            stack.append('|')
        elif char == ')':
            while stack and stack[-1] != '(':
                op = stack.pop()
                if op == '|':
                    a2, s2 = stack.pop()
                    a1, s1 = stack.pop()
                    state_counter += 1
                    transitions[(state_counter, '')] = {s1, s2, state_counter + 1}
                    stack.append((state_counter, s1, state_counter + 1))
                else:
                    stack.pop()
                    s1 = stack.pop()
                    s2 = stack[-1]
                    transitions[(s1, '')] = {s2}

    return NFA(states, alphabet, transitions, start_state, accept_states)

# Example usage
regex = "a(b|c)*"
nfa = regex_to_nfa(regex)
print(nfa.transitions)
