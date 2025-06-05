# 🐾 API de Serviços - PetShop

API REST desenvolvida em **Spring Boot** com **MongoDB** para gerenciamento de serviços realizados em animais (ex: banho, vacinação, consulta etc.).

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
- Postman ou Insomnia (para testes)

---

## 📦 Endpoints Disponíveis

### ✅ Cadastrar Serviço
```http
POST /api/servicos
```
**Body JSON:**
```json
{
  "tipo": "Vacinação",
  "data": "2025-06-04",
  "valor": 80.0,
  "status": "Agendado",
  "idAnimal": "123"
}
```

---

### 📋 Listar Todos os Serviços
```http
GET /api/servicos
```

---

### 🔍 Buscar Serviço por ID
```http
GET /api/servicos/{id}
```

---

### ✏️ Atualizar Serviço
```http
PUT /api/servicos/{id}
```
**Body JSON:** (mesma estrutura do POST)

---

### ❌ Deletar Serviço
```http
DELETE /api/servicos/{id}
```

---

### 🐶 Buscar Serviços por ID do Animal
```http
GET /api/servicos/animal/{idAnimal}
```

---

## 📁 Estrutura do Projeto

```
src/
├── controller/
│   └── ServicoController.java
├── model/
│   └── Servico.java
├── repository/
│   └── ServicoRepository.java
├── service/
│   └── ServicoService.java
```

---

## ⚠️ Validações Sugeridas (não implementadas ainda)

- Tipo, Status e idAnimal obrigatórios
- Valor positivo
- Data não pode ser nula

---

## ▶️ Como Executar

1. **Pré-requisitos:**
    - Java 17+
    - MongoDB rodando localmente na porta padrão (`27017`)

2. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/api-servicos.git
cd api-servicos
```

3. **Verifique o arquivo `application.properties`:**
```properties
server.port=8087
spring.data.mongodb.uri=mongodb://localhost:27017/api-servicos-db
```

4. **Execute a aplicação:**
```bash
./mvnw spring-boot:run
```

5. **Acesse a API:**
- http://localhost:8087/api/servicos

---

## 📫 Contato

Desenvolvido por Matheus 