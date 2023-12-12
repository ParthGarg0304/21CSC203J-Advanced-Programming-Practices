#Extend the UDP server to respond to the client's "UDP Message" packet with an acknowledgment message. Provide the code for the server-client interaction.

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
    received_message = data.decode()
    print(f"Received from {client_address}: {received_message}")


    # Respond with an acknowledgment message
    acknowledgment_message = "Message Received"
    server_socket.sendto(acknowledgment_message.encode(), client_address)


import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 54321  # Change this to the server's port


# Create a UDP socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)


# Message to send
message = "UDP Message"


# Send the message to the server
client_socket.sendto(message.encode(), (server_ip, server_port))


# Receive the acknowledgment from the server
acknowledgment, server_address = client_socket.recvfrom(1024)
print(f"Server acknowledgment: {acknowledgment.decode()}")


# Close the client socket
client_socket.close()




