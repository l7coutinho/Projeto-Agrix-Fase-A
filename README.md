# Agrix - Sistema de Gestão de Fazendas e Plantações

O Agrix é uma aplicação Spring Boot que visa gerenciar fazendas e suas plantações de forma eficiente e sustentável. Esta é a Fase A do projeto, que implementa as funcionalidades básicas do sistema.

## Funcionalidades

1. **Gestão de Fazendas**:
   - Rota `POST /farms` para cadastrar novas fazendas
   - Rota `GET /farms` para listar todas as fazendas cadastradas
   - Rota `GET /farms/{id}` para obter informações específicas de uma fazenda

2. **Gestão de Plantações**:
   - Rota `POST /farms/{farmId}/crops` para cadastrar plantações em uma fazenda
   - Rota `GET /farms/{farmId}/crops` para listar plantações de uma fazenda específica
   - Rota `GET /crops` para listar todas as plantações do sistema

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal do projeto
- **Spring Boot**: Framework para desenvolvimento da aplicação
- **Spring Data JPA**: Para persistência e gerenciamento de dados
- **MySQL**: Sistema de gerenciamento do banco de dados
- **Docker**: Para containerização da aplicação
- **Maven**: Gerenciamento de dependências e build do projeto

**Observação**: Este projeto faz parte do curso da Trybe e novas funcionalidades serão adicionadas nas próximas fases.
