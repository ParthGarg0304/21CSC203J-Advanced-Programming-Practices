#Python program of TCP, client that can connect to the server and
#client can send a "Hello, Server!" message to the server.

import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port


# Create a TCP socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


try:
    # Connect to the server
    client_socket.connect((server_ip, server_port))


    # Send a message to the server
    message = "Hello, Server!"
    client_socket.send(message.encode())


    # Receive a response from the server
    response = client_socket.recv(1024)
    print("Server response: ", response.decode())


except ConnectionRefusedError:
    print("Connection to the server failed. Make sure the server is running.")
finally:
    # Close the client socket
    client_socket.close()



