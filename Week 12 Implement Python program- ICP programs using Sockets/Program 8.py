#Create a TCP server that echoes back any message it receives from a client. Develop a Python client to send messages to the server and display the echoed response.

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
    print(f"Received from {client_address}: {data}")


    # Send the received data back to the client
    client_socket.send(data.encode())


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


    while True:
        # Send a message to the server
        message = input("Enter a message (or 'exit' to quit): ")
        if message.lower() == 'exit':
            break
        client_socket.send(message.encode())


        # Receive the echoed response from the server
        response = client_socket.recv(1024).decode()
        print("Server response: ", response)


except ConnectionRefusedError:
    print("Connection to the server failed. Make sure the server is running.")
finally:
    # Close the client socket
    client_socket.close()




