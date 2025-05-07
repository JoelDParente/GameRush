# 🎮 Loja de Jogos - GameRush

Sistema completo de uma loja virtual de jogos digitais, desenvolvido em **Java** com integração ao banco de dados **MySQL** e servidor local de imagens via **XAMPP**. A aplicação simula funcionalidades reais de uma loja como Steam ou Epic Games, com foco em usabilidade, performance e arquitetura limpa.

---

## 🚀 Funcionalidades

- Cadastro e login de usuários
- Armazenamento seguro de senhas (criptografia recomendada)
- Catálogo de jogos com imagem, gênero, estúdio, preço e plataforma
- Compra e histórico individual de jogos por usuário
- Armazenamento e exibição de imagens via XAMPP
- Interface amigável e estrutura modular

---

## 🧱 Tecnologias utilizadas

| Tecnologia     | Descrição                            |
|----------------|----------------------------------------|
| Java           | Lógica da aplicação                    |
| MySQL          | Banco de dados relacional              |
| JDBC           | Integração entre Java e MySQL          |
| XAMPP (Apache) | Servidor local para imagens `.jpg`     |
| Git & GitHub   | Versionamento e repositório remoto     |

---

## 🗃 Estrutura do banco de dados

**Tabela `usuarios`**:

```sql
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_usuario VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL
);
