#Create a Python UDP client that sends a random number to the UDP server. The server should check if the number is even or odd and send the result back to the client.

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
    received_number = int(data.decode())
    
    # Determine if the number is even or odd
    result = "Even" if received_number % 2 == 0 else "Odd"
    
    # Send the result back to the client
    server_socket.sendto(result.encode(), client_address)



