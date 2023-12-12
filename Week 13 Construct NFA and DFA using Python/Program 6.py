#Python script to minimize a simple DFA with three states by merging equivalent states.


def minimize_dfa(dfa):
    # Initialize a table for marking equivalent and non-equivalent states
    n = len(dfa)
    marked = [[False] * n for _ in range(n)]

    # Initialize the equivalence classes
    equiv_classes = [set(), set()]

    # Initialize the distinguishable states
    distinguishable = False

    # Mark pairs of states that are distinguishable (non-equivalent)
    for i in range(n - 1):
        for j in range(i + 1, n):
            if (i in dfa['accept'] and j not in dfa['accept']) or (i not in dfa['accept'] and j in dfa['accept']):
                marked[i][j] = marked[j][i] = True
                distinguishable = True

    # Continue marking pairs of states until no more distinguishable states are found
    while distinguishable:
        distinguishable = False

        for i in range(n - 1):
            for j in range(i + 1, n):
                if not marked[i][j]:
                    for k in range(n):
                        if marked[dfa['transitions'][i][k]][dfa['transitions'][j][k]]:
                            marked[i][j] = marked[j][i] = True
                            distinguishable = True

    # Partition states into equivalence classes
    for i in range(n):
        for j in range(n):
            if not marked[i][j]:
                equiv_classes[i].add(j)

    # Remove equivalent states and update transitions
    new_dfa = {'states': [], 'alphabet': dfa['alphabet'], 'transitions': [], 'start': dfa['start'], 'accept': []}
    for eq_class in equiv_classes:
        if eq_class:
            new_dfa['states'].append(list(eq_class)[0])

    for i, state in enumerate(new_dfa['states']):
        new_dfa['transitions'].append([])
        if state in dfa['accept']:
            new_dfa['accept'].append(i)
        for symbol in dfa['alphabet']:
            next_state = dfa['transitions'][state][symbol]
            for j, eq_class in enumerate(equiv_classes):
                if next_state in eq_class:
                    new_dfa['transitions'][i].append(j)
                    break

    return new_dfa

# Example usage:
simple_dfa = {
    'states': [0, 1, 2],
    'alphabet': {'0', '1'},
    'transitions': {0: {'0': 1, '1': 2}, 1: {'0': 2, '1': 0}, 2: {'0': 1, '1': 2}},
    'start': 0,
    'accept': [1]
}

minimized_dfa = minimize_dfa(simple_dfa)
print("Minimized DFA:")
print(minimized_dfa)


