# MicroServices-SpringBoot


This project is a **complete end-to-end microservices application** built using **Spring Boot** and **Spring Cloud** ecosystem.

---

## 🔧 Tech Stack

- **Java** with Spring Boot
- **Spring Cloud Netflix Eureka** (Service Discovery)
- **Spring Cloud Gateway** (API Gateway)
- **OpenFeign** (Inter-Service Communication)
- **Micrometer + Zipkin** (Distributed Tracing)
- **Maven** for dependency management

---

## 📦 Microservices Implemented

### 1. Patient Registration Service
- Registers new patients
- Stores and exposes patient data via REST

### 2. Doctor Consultation Service
- Manages doctor availability and consultations
- Communicates with Patient service using **OpenFeign**

### 3. API Gateway
- Central entry point for all services
- Handles routing, load balancing, and filtering
- Connected to Eureka for dynamic service resolution

### 4. Eureka Server
- Acts as the service registry
- All services register themselves here

---

## 📊 Distributed Tracing with Micrometer + Zipkin
- Each request is traced across microservices
- Enables debugging and monitoring service-to-service latency
- Integrated with **Spring Cloud Sleuth** and **Micrometer Tracing**

---

## ▶️ How to Run the Project

1. **Clone the repo**
    ```bash
    git clone https://github.com/verupenudhota/MicroServices-SpringBoot.git
    ```

2. **Start Eureka Server**
    - Run the `eurekaserver` application

3. **Start API Gateway**
    - Run `APIGateWay` module

4. **Start individual services**
    - Run `PatientRegistration1` and `DoctorConsultation`

5. **Access Endpoints**
    - Access all routes via API Gateway (e.g., `http://localhost:8080/patient/register`)

6. **Zipkin (Optional - for tracing)**
    - Download and run Zipkin:
      ```bash
      java -jar zipkin.jar
      ```
    - Visit: `http://localhost:9411`

---

## 📸 Screenshots
<img width="1366" height="768" alt="Screenshot (1501)" src="https://github.com/user-attachments/assets/c5fa3c35-a867-4109-8a35-fb70a96cff9e" />
<img width="1366" height="768" alt="Screenshot (1502)" src="https://github.com/user-attachments/assets/eb8852f0-4397-41a8-8441-05734566dd98" />
<img width="1366" height="768" alt="Screenshot (1503)" src="https://github.com/user-attachments/assets/2174e985-d5cb-4bad-b696-805fdb0a72cc" />
<img width="1366" height="768" alt="Screenshot (1504)" src="https://github.com/user-attachments/assets/c069609b-c8ae-40f3-af5b-56911b724461" />
<img width="1366" height="768" alt="Screenshot (1505)" src="https://github.com/user-attachments/assets/446d7589-d73f-4077-97f7-5032100ed362" />
<img width="1366" height="768" alt="Screenshot (1506)" src="https://github.com/user-attachments/assets/4a448e80-51ab-4cb9-bccc-5f6431c287d6" />
<img width="1366" height="768" alt="Screenshot (1507)" src="https://github.com/user-attachments/assets/b88a836c-5d75-4168-9025-425c1de92538" />
<img width="1366" height="768" alt="Screenshot (1509)" src="https://github.com/user-attachments/assets/d4e36b04-ccfb-453a-9f54-925a111f6e9c" />
















---

## 👨‍💻 Author

**Verupenudhota**  
Aspiring Java Backend Developer | Microservices Enthusiast

[GitHub](https://github.com/verupenudhota) • [LinkedIn](https://linkedin.com/in/vera-penudhota-435679268) 

---

## 📌 Note
This project was developed as a self-learning and demonstration project for mastering Microservices architecture.

