## Sobre o projeto
- Criação de um microsserviço com Java e Spring, conectado a um banco de dados MySQL local
- Implementação de técnica de service discovery utilizando o Eureka
- Centralização de requisições adicionando um API Gateway ao projeto
- Projetado e implementado comunicação síncrona entre dois microsserviços com Open Feign
- Utilização de circuit breaker e fallback

## Tecnologias utilizadas
- IDE IntelliJ
- Maven
- Framework Spring
- Spring Boot version 2.6.7
- Java version 17
- Eureka
- Open Feign
- Postman

## Detalhes do trabalho
Implemente os 3 serviços abaixo, nas tecnologias API REST e WEB Service.

- Suponha que a companhia aérea LATAM deseja trabalhar com micro serviços, então para isso necessita criar o 3 serviços abaixo:

- **1º Serviço** – Calcular Tarifa -> Implemente um serviço que retorne um valor randômico de R$ 500 a 5.000. Terá como parâmetros de entrada o Destino da viagem e a data do voo;
- **2º Serviço** – Alocar Assento -> Implemente um serviço que terá como entrada o número do assento e voo. O retorno será apenas um booleano, confirmando se a mudança ocorreu;
- **3º Serviço** – Efetivar Compra Passagem -> Implemente um serviço que terá como entrada o voo, Data da viagem, Destino, CPF Cliente. O retorno será um booleano, confirmando se a compra ocorreu com sucesso.

## RoadMap

[] Calcular Tarifa
[] Alocar Assento
[x] Efetivar compra passagem - Api altera o status do pagamento para REALIZADO, CANCELADO, PAGO, NAO_AUTORIZADO, CONFIRMADO, PRONTO, SAIU_PARA_ENTREGA, ENTREGUE;
[x] Sistema de pagamento
[x] Sistema de pedidos

## Instalação
- Faça download do arquivo ou clone o repositório;
- Abra o arquivo utilizando a IDE de sua preferência. Recomendo a IDE IntelliJ, pois ela fará a configuração das dependências;
- Utilize o MySql Workbench para criação das tabelas do banco de dados. Inicie o servidor do MySql
- Altere o usuário e senha do Mysql nos arquivos application.properties, caso seu usuário e senha sejam root, não será necessária alteração.
  - caminho: api-voos/pagamentos/src/main/resources/application.properties
  - caminho: api-voos/pedidos/src/main/resources/application.properties
- Para iniciar a aplicação você deve rodar primeiro o Servidor : caminho: api-voos\server\src\main\java\br\com\apivoos\serverServerApplication
- Depois rode as aplicações:
- caminho: api-voos\gateway\src\main\java\br\com\apivoos\gateway\GatewayApplication
- caminho: api-voos\pagamentos\src\main\java\br\com\apivoos\pedidos\PagamentosApplication
- caminho: pi-voos\pedidos\src\main\java\br\com\apivoos\pedidos\PedidosAplication