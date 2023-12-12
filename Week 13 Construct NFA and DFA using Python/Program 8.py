#Python program to create an NFA that accepts strings with an odd number of '1's. 


import pygraphviz as pgv

def create_odd_ones_nfa():
    nfa = pgv.AGraph(strict=False, directed=True)
    nfa.add_node("q0", shape="ellipse", color="black", style="solid")  # Initial state
    nfa.add_node("q1", shape="doublecircle", color="black", style="solid")  # Accepting state
    nfa.add_edge("q0", "q1", label="1")  # Transition from q0 to q1 on '1'
    nfa.add_edge("q1", "q0", label="1")  # Transition from q1 to q0 on '1'
    nfa.add_edge("q0", "q0", label="0")  # Epsilon transition from q0 to q0 on '0'
    nfa.add_edge("q1", "q1", label="0")  # Epsilon transition from q1 to q1 on '0'
    return nfa

def main():
    nfa = create_odd_ones_nfa()
    output_file = "odd_ones_nfa.png"
    nfa.draw(output_file, format="png", prog="dot")
    print(f"NFA for strings with an odd number of '1's saved as {output_file}")

if __name__ == "__main__":
    main()

