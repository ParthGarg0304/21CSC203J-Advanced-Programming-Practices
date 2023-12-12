#Python program to create an NFA that accepts strings containing only the letter 'a'.


import pygraphviz as pgv

def create_nfa_for_as_only():
    # Create a new directed graph
    nfa = pgv.AGraph(strict=False, directed=True)

    # Define the NFA states
    nfa.add_node("q0", shape="ellipse", color="black", style="solid")  # Initial state
    nfa.add_node("q1", shape="ellipse", color="black", style="solid")  # Accepting state

    # Define transitions
    nfa.add_edge("q0", "q0", label="a")  # Transition from q0 to q0 on 'a'
    nfa.add_edge("q0", "q1", label="a")  # Transition from q0 to q1 on 'a'

    # Set the initial state
    nfa.get_node("q0").attr.update(style="filled", color="blue")

    return nfa

def main():
    nfa = create_nfa_for_as_only()

    # Set the output file (in this case, we're saving it as a PNG image)
    output_file = "nfa_for_as_only.png"
    nfa.draw(output_file, format="png", prog="dot")

    print(f"NFA for strings containing 'a' only saved as {output_file}")

if __name__ == "__main__":
    main()
