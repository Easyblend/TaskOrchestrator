# 🌀 TaskOrchestratorPro

[💥 Try to break it →](https://taskorchestratorpro-dsbpceamfsdrb3a6.francecentral-01.azurewebsites.net/swagger)

> A Spring Boot–powered orchestration platform deployed on **Azure App Service (Linux)** with a **PostgreSQL database hosted on AWS RDS**.  
> Built for experimentation, performance testing, and cross-cloud architecture fun — because who says your backend and database have to live in the same cloud? ☁️⚡  
> _aka: The Overengineered To-Do List._

---

## ⚙️ Tech Stack

| Layer           | Technology                  | Notes                         |
|-----------------|-----------------------------|-------------------------------|
| Backend         | Spring Boot (Java)          | REST APIs & orchestration     |
| Database        | PostgreSQL (AWS RDS)        | Cross-cloud fun              |
| Deployment      | Azure App Service (Linux)   | CI/CD ready                  |
| Build Tool      | Maven                       | Dependency & build management |
| Containerization| Docker & Docker Compose      | Local dev/testing             |
| Chaos Level     | ☁️ 100%                     | Cross-cloud experiments       |

---

## 🧩 Architecture Overview

TaskOrchestratorPro is designed for **experimenters, testers, and cloud adventurers**:

- 🚀 **Cross-cloud latency & performance** — backend on Azure, database on AWS.
- 🛠 **Microservice-style orchestration** with Spring Boot.
- 📋 **Scalable to-do workflows** that can be triggered, monitored, and tested via APIs.

Perfect for **performance testing**, **integration experiments**, or just saying:  
*"Look, I made something ridiculously overengineered."*

---

## 🚀 Interacting with the API

Explore and interact with the API using **Swagger UI**:

🔗 [https://taskorchestratorpro-dsbpceamfsdrb3a6.francecentral-01.azurewebsites.net/swagger](https://taskorchestratorpro-dsbpceamfsdrb3a6.francecentral-01.azurewebsites.net/swagger)

Swagger lets you:

- 🔍 View all endpoints and request/response models.
- 🧪 Test API calls in real time without writing code.
- 📝 Generate sample requests for Postman or scripts.

> 💡 Pro Tip: This is the fastest way to see how your cross-cloud to-do workflows behave.

---

## 🏃 Quickstart Examples

Here’s how to get started fast:

### 1️⃣ Create a Task
```bash
POST /tasks
{
  "title": "Test Task",
  "description": "This is a task for testing purposes",
  "priority": "HIGH"
}
