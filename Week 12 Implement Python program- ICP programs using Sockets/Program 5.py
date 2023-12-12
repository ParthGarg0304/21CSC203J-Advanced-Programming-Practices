#Python program to create a UDP server that listens on port 54321. Ensure the server can receive UDP packets from clients.

import socket


# Server information
server_port = 54321  # Port to listen on


# Create a UDP socket
server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)


# Bind the socket to the server address and port
server_socket.bind(('', server_port))
print(f"Server is listening for incoming UDP packets on port {server_port}...")


while True:
    # Receive data from a client
    data, client_address = server_socket.recvfrom(1024)
    print(f"Received from {client_address}: {data.decode()}")


# Close the server socket (You can use Ctrl+C to stop the server)
server_socket.close()



