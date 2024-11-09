# Gerenciamento de Cursos e Matrículas

## Descrição do Projeto
Este projeto é uma aplicação web de gerenciamento de cursos e matrículas que oferece funcionalidades distintas para diferentes tipos de usuários, garantindo autenticação e autorização. Os usuários podem acessar as funcionalidades de acordo com suas permissões: **ADMIN** para gerenciamento de cursos e visualização de matrículas, e **ALUNO** para visualização e matrícula em cursos.

## Funcionalidades

### Autenticação e Autorização
- Sistema de login seguro usando **Spring Security**.
- Controle de acesso com dois tipos de usuários:
  - **ADMIN**: Acesso a todas as funcionalidades de gerenciamento de cursos e visualização de matrículas.
  - **ALUNO**: Acesso à visualização de cursos e matrícula.
- Redirecionamento pós-login:
  - **ADMIN** é direcionado para a página de administração.
  - **ALUNO** é direcionado para a página de usuário.

### Funcionalidades do Sistema
- **Tela de Login**: Permite que os usuários façam login com autenticação baseada em credenciais.
- **Tela de Gerenciamento de Cursos** (ADMIN):
  - Adicionar, editar, visualizar e excluir cursos.
- **Tela de Visualização de Cursos**:
  - Permite que **ADMIN** e **ALUNO** visualizem os cursos disponíveis.
- **Tela de Matrículas**:
  - **ALUNO** pode se matricular nos cursos e visualizar suas matrículas.
  - **ADMIN** pode visualizar todas as matrículas e os alunos inscritos em cada curso.

## Tecnologias Utilizadas
- **Java 17** com **Spring Boot** para o backend.
- **Spring Security** para controle de autenticação e autorização.
- **Thymeleaf** para renderização de páginas HTML.
- **Jakarta Persistence API (JPA)** para interação com o banco de dados.
- **Banco de dados Oracle** (pode ser adaptado para outros bancos de dados relacionais).
- **HTML5 e CSS3** para o frontend.

## Configuração do Banco de Dados
Verifique o arquivo `application.properties` para garantir que as configurações de conexão com o banco de dados estão corretas:

```properties
spring.datasource.url=jdbc:oracle:thin:@<HOST>:<PORT>:<SID>
spring.datasource.username=<USUARIO>
spring.datasource.password=<SENHA>
spring.jpa.hibernate.ddl-auto=update

## Como Rodar o Projeto

1. Clonar o Repositório
bash
Copiar código
git clone https://github.com/seu-usuario/nome-do-repositorio.git
2. Importar o Projeto na IDE
3. Compilar o Projeto
mvn clean install
4. Executar a Aplicação
mvn spring-boot:run
Ou execute GerenciamentoApplication pela IDE.

6. Acessar a Aplicação
URL: http://localhost:8080/home
Use as credenciais padrão ou crie novos usuários no banco de dados.
