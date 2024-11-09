Gerenciamento de Cursos e Matrículas
Descrição do Projeto
Este projeto é um sistema web para gerenciar cursos e matrículas, com funcionalidades específicas para diferentes tipos de usuários (ADMIN e ALUNO). O projeto foi desenvolvido utilizando Spring Boot, Thymeleaf, Spring Security e integração com um banco de dados Jakarta Persistence API (JPA).

Funcionalidades
Autenticação e Autorização
Segurança de acesso implementada com Spring Security.
Dois tipos de usuários:
ADMIN: pode gerenciar cursos e visualizar todas as matrículas e alunos inscritos.
ALUNO: pode visualizar cursos disponíveis e se matricular.
Sistema de login com redirecionamento:
ADMIN é redirecionado para a página de administração.
ALUNO é redirecionado para a página de usuário.
Páginas e Telas
Tela de Login: Permite que os usuários façam login no sistema.
Tela de Gerenciamento de Cursos (ADMIN):
Cadastro de novos cursos.
Edição de cursos existentes.
Visualização e exclusão de cursos.
Tela de Visualização de Cursos:
Acessível para ADMIN e ALUNO para visualizar a lista de cursos disponíveis.
Tela de Matrículas:
ALUNO pode visualizar cursos e se matricular.
ADMIN pode visualizar todas as matrículas e os alunos de cada curso.
Tecnologias Utilizadas
Java com Spring Boot para o backend.
Thymeleaf para renderização do frontend.
Spring Security para autenticação e autorização.
Jakarta Persistence API (JPA) para mapeamento objeto-relacional.
Banco de dados: configuração compatível com Oracle Database.
HTML, CSS para a interface do usuário.
Estrutura do Projeto
src/main/java/CP3/Gerenciamento/:
Controller: Controladores para lidar com as requisições do usuário.
Model: Classes de entidade representando os dados do sistema.
Service: Lógica de negócios.
Repository: Interfaces para interação com o banco de dados.
src/main/resources/templates/:
Arquivos HTML para as diferentes páginas do sistema.
src/main/resources/static/:
Arquivos CSS e outros recursos estáticos.
Como Executar o Projeto
Clone o repositório:
bash
Copiar código
git clone <URL_DO_REPOSITORIO>
Importe o projeto em sua IDE preferida (recomendado: IntelliJ IDEA ou Eclipse).
Configure o banco de dados:
Verifique o arquivo application.properties para garantir que a configuração do banco de dados esteja correta.
Execute o projeto:
bash
Copiar código
mvn spring-boot:run
Acesse a aplicação em http://localhost:8080/home.
