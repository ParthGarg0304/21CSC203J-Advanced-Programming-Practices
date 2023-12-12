#Python program to receive UDP packets and display their content. Simulate sending UDP packets from a separate client program.

import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port


# Create a UDP socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)


# Bind the socket to the server address and port
server_socket.bind((server_ip, server_port))
print("Server is listening for incoming UDP packets...")


while True:
    # Receive data from a client
    data, client_address = server_socket.recvfrom(1024)
    received_message = data.decode()
    print(f"Received from {client_address}: {received_message}")


import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port


# Create a UDP socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)


# Send simulated UDP packets to the server
messages = ["UDP Packet 1", "UDP Packet 2", "UDP Packet 3"]


for message in messages:
    client_socket.sendto(message.encode(), (server_ip, server_port))
    print(f"Sent to server: {message}")


# Close the client socket
client_socket.close()
