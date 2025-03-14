# Documentação da API EasyDeal

## Visão Geral
A API **EasyDeal** é um sistema de **e-commerce** desenvolvido com o objetivo de treinar habilidades em **desenvolvimento back-end** utilizando tecnologias modernas. O sistema permite o gerenciamento de usuários, produtos, pedidos e categorias.

## Tecnologias Utilizadas
A API foi desenvolvida utilizando as seguintes tecnologias:
- **Java 21**
- **Spring Boot 3.4.3**
  - Spring Boot Starter Web
  - Spring Boot Starter Data JPA
  - Spring Boot Starter Validation
  - Spring Boot DevTools
- **Banco de Dados MySQL**
- **Lombok** (para redução de boilerplate)
- **SpringDoc OpenAPI** (para documentação da API)

## Endpoints

### User Controller

#### Buscar Usuário por ID
**GET** `/users/{id}`

**Parâmetros:**
- `id` (Integer) - ID do usuário a ser buscado

**Resposta:**
```json
{
  "id": 1,
  "name": "João Silva",
  "email": "joao@email.com",
  "phone": "(11) 99999-9999"
}
```

#### Criar Novo Usuário
**POST** `/users`

**Corpo da Requisição:**
```json
{
  "name": "Maria Oliveira",
  "email": "maria@email.com",
  "phone": "(11) 98888-8888",
  "password": "senha123"
}
```

**Resposta:**
```json
{
  "id": 2,
  "name": "Maria Oliveira",
  "email": "maria@email.com",
  "phone": "(11) 98888-8888"
}
```

---

### Product Controller

#### Listar Produtos
**GET** `/products`

**Resposta:**
```json
[
  {
    "id": 1,
    "name": "Smartphone XYZ",
    "description": "Smartphone com tela AMOLED e 128GB de armazenamento",
    "price": 1999.99,
    "imgUrl": "https://example.com/image.jpg",
    "categories": [
      {
        "id": 1,
        "name": "Eletrônicos"
      }
    ]
  }
]
```

#### Buscar Produto por ID
**GET** `/products/{id}`

**Parâmetros:**
- `id` (Integer) - ID do produto a ser buscado

**Resposta:**
```json
{
  "id": 1,
  "name": "Smartphone XYZ",
  "description": "Smartphone com tela AMOLED e 128GB de armazenamento",
  "price": 1999.99,
  "imgUrl": "https://example.com/image.jpg",
  "categories": [
    {
      "id": 1,
      "name": "Eletrônicos"
    }
  ]
}
```

---

### Order Controller

#### Listar Pedidos
**GET** `/orders`

**Resposta:**
```json
[
  {
    "id": 1,
    "moment": "2025-03-14T21:14:39.218Z",
    "orderStatus": "WAITING_PAYMENT",
    "client": {
      "id": 1,
      "name": "João Silva"
    },
    "total": 2599.98
  }
]
```

---

Essa documentação resume os principais endpoints da API EasyDeal. Para mais detalhes sobre a implementação e novos recursos, a documentação pode ser expandida conforme necessário.

