#python program to find the first largest and second largest numbers in an Array. Note: should not use any built-in sorting functions or libraries.


def find_first_and_second_largest(arr):
    if len(arr) < 2:
        print("Array should contain at least two elements")
        return

    first_largest = second_largest = float('-inf')

    for num in arr:
        if num > first_largest:
            second_largest = first_largest
            first_largest = num
        elif num > second_largest and num < first_largest:
            second_largest = num

    if second_largest == float('-inf'):
        print("There is no second largest element.")
    else:
        print("First largest number:", first_largest)
        print("Second largest number:", second_largest)

# Test the function
arr = [12, 45, 1, 78, 90, 45, 23]
find_first_and_second_largest(arr)


