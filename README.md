# StockApi
Creating a stock market api with java and mysql to:

- Adicionar uma nova ação ao portfólio, informando seu ticker, nome, setor e preço atual 
- Atualizar as informações de uma ação existente no portfólio 
- Excluir uma ação existente no portfólio 
- Realizar buscas por ticker, nome ou setor de uma ação

## Running

1. Baixar o `docker desktop`. Links para instalar:
   1. Windows: https://docs.docker.com/desktop/install/windows-install/
   2. Linux: https://docs.docker.com/desktop/install/ubuntu/
2. Abrir docker desktop e deixar rodando no backgroud do computador;
3. Rodar a API com docker compose:
   1. Windows (Rodar no Windows PowerShell): 
      1. cd {localdapasta}/StockApi                            -> Entrar no diretorio do projeto
      2. docker compose up                                     -> Fazer a image dos containers e build os containers
   2. Linux (Rodar no terminal):
      1. cd {localdapasta}/StockApi                            -> Entrar no diretorio do projeto
      2. docker compose up                                     -> Fazer a image dos containers e build os containers
4. A API estar disponivel em: http://127.0.0.1:8080/stocks . Acessar via Postman seria o ideal.

