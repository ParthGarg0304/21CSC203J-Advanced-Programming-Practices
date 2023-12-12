#Implement a Python program that calculates and displays the time taken for a TCP
client to connect to the server and receive a response. Measure the time elapsed in
Seconds.

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


    # Send a response back to the client
    client_socket.send(data.encode())


    # Close the client socket
    client_socket.close()


import socket
import time


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port


# Create a TCP socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


# Start measuring time
start_time = time.time()


try:
    # Connect to the server
    client_socket.connect((server_ip, server_port))


    # Send a message to the server
    message = "Hello, Server!"
    client_socket.send(message.encode())


    # Receive a response from the server
    response = client_socket.recv(1024).decode()
    print("Server response: ", response)


except ConnectionRefusedError:
    print("Connection to the server failed. Make sure the server is running.")
finally:
    # Close the client socket
    client_socket.close()


# Stop measuring time and calculate the elapsed time in seconds
end_time = time.time()
elapsed_time = end_time - start_time
print(f"Time taken for the client to connect and receive a response: {elapsed_time:.4f} seconds")




