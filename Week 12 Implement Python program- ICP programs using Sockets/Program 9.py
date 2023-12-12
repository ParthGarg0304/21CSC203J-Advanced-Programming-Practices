#Develop a simple Python program that sends a small text file from a TCP client to a TCP server. Confirm that the file is received and saved correctly.

import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port
output_file = "received_file.txt"  # Name of the file where the data will be saved


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


    # Receive the file data from the client and save it to a file
    with open(output_file, "wb") as file:
        data = client_socket.recv(1024)
        while data:
            file.write(data)
            data = client_socket.recv(1024)
        print("File received and saved as", output_file)


    # Close the client socket
    client_socket.close()


import socket


# Server information
server_ip = "127.0.0.1"  # Change this to the server's IP address
server_port = 12345  # Change this to the server's port
input_file = "text_file.txt"  # Name of the text file to be sent


# Create a TCP socket
client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)


try:
    # Connect to the server
    client_socket.connect((server_ip, server_port))


    # Read the text file and send it to the server
    with open(input_file, "rb") as file:
        data = file.read(1024)
        while data:
            client_socket.send(data)
            data = file.read(1024)
        print(f"File {input_file} sent to the server")


except ConnectionRefusedError:
    print("Connection to the server failed. Make sure the server is running.")
finally:
    # Close the client socket
    client_socket.close()



