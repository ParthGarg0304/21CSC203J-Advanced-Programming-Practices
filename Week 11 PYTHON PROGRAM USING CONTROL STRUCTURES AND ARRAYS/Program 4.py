#Python program that takes a sentence as input and identifies and prints all the palindromic words in the sentence. Use an array to store the palindromic words.


def is_palindrome(word):
    return word == word[::-1]

def find_palindromic_words(sentence):
    words = sentence.split()
    palindromic_words = []

    for word in words:
        if is_palindrome(word):
            palindromic_words.append(word)

    return palindromic_words

# Get the sentence from the user
sentence = input("Enter a sentence: ")

palindromic_words = find_palindromic_words(sentence)

if palindromic_words:
    print("Palindromic words in the sentence:")
    for word in palindromic_words:
        print(word)
else:
    print("No palindromic words found in the sentence.")
