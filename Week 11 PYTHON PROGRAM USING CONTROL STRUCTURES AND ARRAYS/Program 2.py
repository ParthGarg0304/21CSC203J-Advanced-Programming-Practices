#Python program to calculate the sum of even numbers and the sum of odd numbers in an array.


def sum_even_and_odd(arr):
    sum_even = 0
    sum_odd = 0

    for num in arr:
        if num % 2 == 0:
            sum_even += num
        else:
            sum_odd += num

    return sum_even, sum_odd

# Test the function
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
even_sum, odd_sum = sum_even_and_odd(arr)

print("Sum of even numbers:", even_sum)
print("Sum of odd numbers:", odd_sum)
