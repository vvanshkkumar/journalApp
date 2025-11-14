📘 JournalApp – REST API (Spring Boot)

JournalApp is a lightweight Spring Boot application that provides a simple REST API for creating and retrieving journal entries.
This version uses in-memory storage (HashMap) — no database required.

🚀 Features

📄 Create a journal entry

📚 Get all journal entries

🔍 Get entry by ID

🧠 Stores data in memory

💻 Built using Spring Boot + Spring Web

🛠️ Tech Stack

Java 17

Spring Boot 3.x

Spring Web

Maven

📂 Project Structure
src/main/java/com/project/journalApp/journalApp
 ├── Controller
 │     └── JournalEntryController.java
 ├── Entity
 │     └── JournalEntry.java
 └── JournalAppApplication.java

▶️ Running the Project
1. Clone the repository
git clone https://github.com/your-username/journalApp.git

2. Navigate into the project
cd journalApp

3. Run the Spring Boot app
mvn spring-boot:run

4. The server will start at:
http://localhost:8080

📌 API Endpoints
GET /journals

Fetch all journal entries.

Response Example

[
  {
    "id": 1,
    "title": "My First Entry",
    "content": "This is a sample journal entry"
  }
]

POST /journals

Create a new journal entry.

Request Body

{
  "id": 1,
  "title": "New Entry",
  "content": "This is a journal entry"
}


Response

true

GET /journals/id/{id}

Fetch a single journal entry by its ID.

Example:

GET /journals/id/1

🧠 How Data Is Stored

This project uses:

Map<Long, JournalEntry> entries = new HashMap<>();


This means:

Data is stored in RAM

Data is not persisted

When the server restarts → all entries are cleared

Perfect for learning APIs before adding a real database.

📌 Future Improvements

Add a real database (MySQL/PostgreSQL/MongoDB)

Add update & delete operations

Add timestamps for entries

Add authentication

Add validation

🤝 Contributing

Pull requests and suggestions are welcome!

📜 License

This project is open-source and free to use.
