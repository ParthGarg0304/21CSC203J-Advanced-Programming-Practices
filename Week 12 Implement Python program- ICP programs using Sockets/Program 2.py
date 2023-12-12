#Python program that allows the TCP client to send a list of numbers to the server. The server should calculate and return the sum of the numbers to the client.

import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port


# Create a TCP socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


# Bind the socket to the server address and port
server_socket.bind((server_ip, server_port))


# Listen for incoming connections
server_socket.listen(5)
print("Server is listening for incoming connections...")


while True:
    # Accept a connection from a client
    client_socket, client_address = server_socket.accept()
    print("Accepted connection from", client_address)


    # Receive data from the client
    data = client_socket.recv(1024).decode()
    numbers = list(map(int, data.split(','))


    # Calculate the sum of the numbers
    total = sum(numbers)


    # Send the result back to the client
    client_socket.send(str(total).encode())


    # Close the client socket
    client_socket.close()


import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port


# Create a TCP socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


try:
    # Connect to the server
    client_socket.connect((server_ip, server_port))


    # Send a list of numbers to the server
    numbers = [1, 2, 3, 4, 5]  # Replace with your list of numbers
    numbers_str = ','.join(map(str, numbers))
    client_socket.send(numbers_str.encode())


    # Receive the sum from the server
    total = client_socket.recv(1024).decode()
    print("Sum of numbers received from the server:", total)


except ConnectionRefusedError:
    print("Connection to the server failed. Make sure the server is running.")
finally:
    # Close the client socket
    client_socket.close()



