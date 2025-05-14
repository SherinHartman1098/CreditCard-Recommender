# 💳 Credit Card Recommender

This is a simple full-stack web application that recommends a credit card based on a user's income. It is built with:

- ⚙️ **Spring Boot** for the backend REST API
- ⚛️ **React.js** for the frontend user interface

---

## 📌 Features

- User inputs their monthly income
- Backend recommends a credit card type based on income range
- Interactive UI with real-time recommendation
- Axios used for HTTP requests
- Dev proxy setup for seamless frontend-backend communication

---

## 📁 Project Structure
CreditCard-Recommender/
├── src/
│   └── main/
│       └── java/com/example/demo/Controller/
│           └── CreditCardController.java
├── credit-card-ui/
│   └── src/App.js
│   └── package.json
└── README.md

---

## 🚀 Getting Started

### 1️⃣ Backend (Spring Boot)

**Requirements:**
- Java 17+
- Maven

**Steps:**

```bash
# Navigate to project root
cd CreditCard-Recommender

# Run Spring Boot application
./mvnw spring-boot:run

This will start the backend on http://localhost:8080.

Test endpoint in browser:
http://localhost:8080/api/recommend?income=30000

2️⃣ Frontend (React.js)

Requirements:
	•	Node.js
	•	npm

Steps:
# Navigate to React app
cd credit-card-ui

# Install dependencies
npm install

# Start the frontend
npm start

This will start the frontend on http://localhost:3000.

🌐 API Endpoint

GET /api/recommend

Query Parameter:
	•	income (int): The user’s monthly income
Response:
	•	"Student Card" if income < 20000
	•	"Cashback" if income < 50000
	•	"Premium Card" if income >= 50000
