#Python program that takes a list of numbers and removes all duplicates from the list, preserving the original order of elements.


def remove_duplicates(input_list):
    seen = set()
    output_list = []

    for item in input_list:
        if item not in seen:
            seen.add(item)
            output_list.append(item)

    return output_list

# Test the function
input_list = [1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8]
result = remove_duplicates(input_list)

print("Original list:", input_list)
print("List with duplicates removed:", result)
