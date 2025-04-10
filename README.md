# 🧩 Proyecto Spring Boot con Apache Kafka

Este proyecto contiene dos aplicaciones Spring Boot:

- 🟢 `producer`: expone un endpoint REST para enviar mensajes a Kafka.
- 🟠 `consumer`: escucha y consume los mensajes del topic.

---

## ⚙️ Requisitos

- Java 17+
- Maven
- Kafka y Zookeeper (descargar binarios de https://kafka.apache.org/downloads, version usada kafka_2.13-3.9.0.tgz)

---

## 🧱 Cómo levantar Apache Kafka localmente (sin Docker)

### Paso 1: Iniciar Zookeeper

cd kafka (kafka binario)

▶️ En Linux/Mac

- bin/zookeeper-server-start.sh config/zookeeper.properties

▶️ En Windows (cmd)

- bin\windows\zookeeper-server-start.bat config\zookeeper.properties

---

### Paso 2: Iniciar Kafka

Abrir otra terminal, en la carpeta kafka/ de nuevo y ejecutar:

▶️ En Linux/Mac

- bin/kafka-server-start.sh config/server.properties

▶️ En Windows (cmd)

- bin\windows\kafka-server-start.bat config\server.properties

---

### Paso 3: Probar (opcional)

Crear un topic desde terminal para probar:

bin/kafka-topics.sh --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

Y verificar que esté creado

bin/kafka-topics.sh --list --bootstrap-server localhost:9092

---

## Levantar primero Consumer y luego Producer

---

### Comandos importantes

- netstat -ano | findstr :2181 (2181 es el puerto que usa zookeeper por defecto, esto lo revisa)
- tasklist | findstr <PID> (Ver qué es lo que lo está usando) - No es comando linux
- tasklist | findstr java
- taskkill /PID <PID> /F (Matar proceso) - No es comando linux
