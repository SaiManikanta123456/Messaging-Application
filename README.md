💬 **Real-Time Messaging Application**

📋 **Project Overview**
This project is a real-time chat application designed with a focus on efficient message queuing, scalability, and secure communication.
It supports both personal and group chats with advanced features like sent/seen status tracking and timestamp management to ensure seamless user experience.

The system uses RabbitMQ for reliable, asynchronous message delivery and is backed by a Spring Boot microservice architecture with MySQL for message storage.
To ensure data privacy and security, all messages are encrypted before being persisted.




🛠️ **Tech Stack**

**Backend**: Spring Boot

**Messaging**: RabbitMQ

**Database**: MySQL

**Security**: Encrypted message storage

**Architecture**: Asynchronous, scalable, real-time messaging




⚙️ **Key Features**

✅ Real-time personal messaging

✅ Real-time group messaging

✅ Sent/seen status tracking

✅ Secure timestamp management

✅ Encrypted message storage for enhanced security

✅ Reliable, asynchronous message delivery using RabbitMQ

✅ Scalable microservices architecture




📂 **Project Structure**

real-time-messaging-app/
├── user-service/
├── chat-service/
├── notification-service/
├── rabbitmq-config/
├── database/
├── README.md




📈 **Future Enhancements**
Implement WebSocket integration for real-time message pushing to UI.

Build a lightweight React or Angular frontend.

Add user authentication and role-based access control using JWT or OAuth2.

Deploy with Docker and Kubernetes for container orchestration.
