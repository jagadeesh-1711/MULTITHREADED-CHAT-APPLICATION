# MULTITHREADED-CHAT-APPLICATION

*COMPANY*:CODTECH IT SOLUTIONS

*NAME* : JAGADEESHWARAN T

*INTERN ID*: CT04DZ410

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# 💬 Java Multithreaded Chat Application

## 📝 Description

This project is a **Multithreaded Client-Server Chat Application** developed using **Java Sockets** and **Multithreading**. It enables multiple clients to connect to a central server and exchange real-time text-based messages, making it a foundational model for understanding how messaging systems and communication protocols work at a low level.

The main objective of this application is to simulate a **real-time chatroom** where multiple users (clients) can simultaneously send and receive messages from one another via a central server. Each client is handled independently by the server using multithreading, ensuring smooth message exchange even when many users are connected.

At its core, the application uses the **TCP/IP protocol** for communication between the server and clients. The server listens for incoming connections on a specific port, and for each new connection, it spawns a dedicated thread to manage communication with that client. On the client side, users can input messages via the console, and those messages are sent to the server, which then broadcasts them to all connected clients.

One of the key learning outcomes of this project is understanding how to build **concurrent applications** using multithreading. Thread safety is achieved by synchronizing shared resources — in this case, a list of output streams to all clients — to prevent data corruption and race conditions.

Another aspect is working with **Java I/O Streams** — the `BufferedReader`, `PrintWriter`, and `InputStreamReader` classes are used extensively to handle message input and output efficiently. This project also provides insight into socket-level programming, helping students and developers grasp the basic mechanics behind chat servers, multiplayer games, file transfer tools, and more.

This project is intentionally kept console-based and simple to focus on networking concepts and thread handling. However, the current version can be extended with a **Graphical User Interface (GUI)** using Java Swing or JavaFX, message encryption, authentication systems, message storage, and integration with databases.

Whether you are a beginner in networking or preparing for an advanced project in Java, this application gives hands-on experience and strengthens your understanding of how **clients, servers, and sockets** interact in the real world. It can serve as a base to build more complex systems such as **real-time collaboration tools, online classrooms, messaging apps,** or even **chatbots** that integrate with AI models.

---

## 🛠️ Tools & Technologies Used

| Tool / Technology              | Purpose                                                  |
|-------------------------------|----------------------------------------------------------|
| Java SE (JDK 8 or later)      | Core language for development                            |
| Java Sockets (`java.net`)     | TCP-based client-server communication                    |
| Java Threads (`java.lang`)    | Handle multiple clients concurrently                     |
| Java I/O (`BufferedReader`)   | Efficient stream-based input and output                  |
| Command Line / PowerShell     | Compile and run server & client programs                 |
| Git & GitHub                  | Version control and project hosting                      |
| Markdown & README.md          | Documentation and GitHub display                         |

---

## 🌍 Where This is Used

This kind of multithreaded chat application is widely applicable and forms the foundation of many modern communication systems, including:

### 1. Real-Time Messaging Platforms
Applications like WhatsApp, Telegram, Slack, and Discord use similar principles of client-server communication.

### 2. Multiplayer Gaming Chat
In multiplayer games, players communicate in real time using integrated chat systems based on similar server-client architecture.

### 3. Online Collaboration Tools
Platforms like Google Meet or Microsoft Teams integrate chat features that operate on the same principle.

### 4. Customer Support Systems
Chatbots and live agent chat services use socket-based or web-based chat to allow users to interact with support teams in real time.

### 5. Educational Simulations
Ideal for demonstrating networking concepts in:
- Computer Networks Lab
- Distributed Systems
- Operating Systems (threading)

### 6. Backend of Messaging Microservices
Helps developers design low-latency, message-driven microservice systems.

### 7. Chatbots & AI Communication Systems
Socket-based messaging forms the backbone of conversational AI tools in enterprise and automation systems.

---

## ▶️ How to Compile and Run

> Make sure you have **JDK 8+ installed** and the files are in the same directory.

### ✅ Step 1: Compile the Code

Open Command Prompt or PowerShell and navigate to the project folder:

``bash

cd path/to/Java_ChatApplication

javac Server.java

javac Client.java

##SERVER

``bash

java Server

##CLIENT

java Client

