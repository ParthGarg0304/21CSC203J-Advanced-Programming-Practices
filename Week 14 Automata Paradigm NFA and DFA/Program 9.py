def run_nfa(nfa, test_strings):
    for string in test_strings:
        current_state = nfa["start_state"]
        for symbol in string:
            if symbol in nfa["transitions"].get(current_state, {}):
                current_state = nfa["transitions"][current_state][symbol].pop()
            else:
                current_state = None
                break
        if current_state in nfa["accept_states"]:
            print(f'String "{string}" is accepted.')
        else:
            print(f'String "{string}" is not accepted.')

# NFA for {}
nfa_empty = {
    "states": set(),
    "alphabet": set(),
    "transitions": {},
    "start_state": None,
    "accept_states": set(),
}

# NFA for {ε}
nfa_epsilon = {
    "states": {"q0"},
    "alphabet": set(),
    "transitions": {},
    "start_state": "q0",
    "accept_states": {"q0"},
}

# NFA for (ab)*
nfa_ab_star = {
    "states": {"q0", "q1"},
    "alphabet": {"a", "b"},
    "transitions": {
        "q0": {"a": {"q1"}},
        "q1": {"b": {"q0"}},
    },
    "start_state": "q0",
    "accept_states": {"q0"},
}

test_strings = ["", "ab", "abab", "abababab", "a", "b", "ba", "aba", "abba", "ababa"]
print("NFA for {} (Empty Set):")
run_nfa(nfa_empty, test_strings)

print("\nNFA for {ε} (Epsilon):")
run_nfa(nfa_epsilon, test_strings)

print("\nNFA for (ab)*:")
run_nfa(nfa_ab_star, test_strings)

