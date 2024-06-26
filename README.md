# ToDo-List Versão 1

## Atividade - Unidade 2

Configuração e implementação de um projeto autoral implementando os métodos HTTP.

Enunciado:

Você foi designado para desenvolver um aplicativo de gerenciamento de tarefas pessoais. Este aplicativo permitirá que os usuários criem, atualizem, visualizem e excluam suas tarefas de forma eficiente. Sua tarefa é configurar e implementar os métodos HTTP necessários para suportar essas operações básicas no aplicativo.

Descrição da Atividade:

1. Configuração do Projeto:

   - Configure um novo projeto utilizando a estrutura do Spring Boot.

   - Certifique-se de incluir todas as dependências necessárias para desenvolver uma API RESTful.

2. Implementação dos Métodos HTTP:

   - Implemente os seguintes métodos HTTP para manipular as tarefas:

     - GET: Recupere uma lista de todas as tarefas do usuário.

     - POST: Adicione uma nova tarefa.

     - PUT: Atualize uma tarefa existente.

     - DELETE: Exclua uma tarefa.

3. Teste da API:

   - Utilize ferramentas como Insomnia, Postman ou cURL para testar cada método HTTP e garantir que eles estejam funcionando conforme o esperado.

   - Certifique-se de lidar adequadamente com os casos de sucesso e falha para cada operação.

4. Documentação da API:

   - Crie uma documentação simples descrevendo os endpoints da API, os parâmetros aceitos e os códigos de resposta possíveis.

Entrega:

- Envie o código-fonte do seu projeto, juntamente com a documentação da API, para avaliação.

- Evidencie que o seu código está contemplando os aspectos dessa unidade.

---

# Documentação da API Versão 1

### Endpoints

#### **GET /todos**

- **Descrição:** Retorna uma lista de tarefas.

- **Códigos de Resposta:**

  - `200 OK:` Sucesso.
  - `400 Bad Request:` Parâmetro inválido.
  - `500 Internal Server Error:` Erro no servidor.

### **POST /todos**

- **Descrição:** Cria uma nova tarefa.
- **Parâmetros:**

  - `title (obrigatório):` Titulo da tarefa.
  - `description (obrigatório):` Descrição da tarefa.
  - `status (obrigatório):` O status da tarefa.
  - `priority (obrigatório):` Prioridade da tarefa.
  
- **Códigos de Resposta:**

  - `201 Created:` Tarefa criada com sucesso.
  - `400 Bad Request:` Dados inválidos.
  - `500 Internal Server Error:` Erro no servidor.

### **PUT /todos**

- **Descrição:** Atualiza as informações de uma tarefa específica.
- **Parâmetros:**

  - `id (obrigatório):` ID da tarefa.
  - `title (opcional):` Titulo da tarefa.
  - `description (opcional):` Descrição da tarefa.
  - `status (opcional):` O status da tarefa.
  - `priority (opcional):` Prioridade da tarefa.

- **Códigos de Resposta:**

  - `200 OK:` Atualização bem-sucedida.
  - `400 Bad Request:` Dados inválidos.
  - `404 Not Found:` Tarefa não encontrado.
  - `500 Internal Server Error:` Erro no servidor.

### **DELETE /todos/{id}**

- **Descrição:** Remove uma tarefa específico.
- **Parâmetros:**

  - `id (obrigatório):` ID da tarefa.

- **Códigos de Resposta:**

  - `200 OK:` Remoção bem-sucedida.
  - `404 Not Found:` Tarefa não encontrada.
  - `500 Internal Server Error:` Erro no servidor
