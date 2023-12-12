# Create a Python UDP client that sends a "UDP Message" packet to a UDP server. Demonstrate the sending and receiving of the packet.


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
    # Receive data from the client
    data, client_address = server_socket.recvfrom(1024)
    print(f"Received from {client_address}: {data.decode()}")


import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port


# Create a UDP socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)


# Message to send
message = "UDP Message"


# Send the message to the server
client_socket.sendto(message.encode(), (server_ip, server_port))


# Close the client socket
client_socket.close()



