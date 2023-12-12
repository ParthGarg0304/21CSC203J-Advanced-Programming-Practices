#Python function that takes an NFA and returns the set of states that can be reached from a given state on a specific input symbol.


def get_states_on_input_symbol(nfa_transitions, current_states, input_symbol):
    next_states = set()

    for state in current_states:
        if state in nfa_transitions and input_symbol in nfa_transitions[state]:
            next_states.update(nfa_transitions[state][input_symbol])

    return next_states

# Example usage:
nfa_transitions = {
    'q0': {'a': ['q1'], 'b': ['q0', 'q2']},
    'q1': {'a': ['q1'], 'b': ['q2']},
    'q2': {'a': ['q0']},
}

current_state = 'q0'
input_symbol = 'a'
reachable_states = get_states_on_input_symbol(nfa_transitions, {current_state}, input_symbol)

print(f"From state {current_state} on input '{input_symbol}', you can reach states: {reachable_states}")

