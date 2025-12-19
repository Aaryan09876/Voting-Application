# Voting-Application
The VotingApplication is a lightweight, web‑based voting platform built with Spring Boot. Its purpose is to let organizations run quick, secure polls or elections without the overhead of a full‑featured election system.The VotingSystem project is a secure, web-based platform designed to streamline elections and polls. It lets admins create and manage elections, voters cast ballots online, and results are tallied and audited automatically. Key features include role-based access, flexible ballot types, real-time results, and an immutable audit trail—all built with Spring Boot for reliability and scalability.

Key highlights:

- *Simple user flow* – Users can register, log in, view active polls, cast a vote, and see results once the poll closes.
- *Role‑based access* – Administrators manage polls and view results; regular users only vote.
- *Flexible ballot types* – Supports single‑choice, multiple‑choice, and yes/no questions.
- *Secure handling* – Passwords are hashed with BCrypt, and each vote is stored as an immutable record with a timestamp.
- *Audit trail* – All actions (poll creation, voting, result viewing) are logged for transparency.
  
The project is structured as a typical Spring Boot MVC application: controllers handle requests, services contain business logic, and JPA repositories persist data to a relational database (e.g., MySQL). It’s packaged as an executable JAR and can be deployed on any Java‑compatible server or containerized with Docker.

