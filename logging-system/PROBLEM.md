<h2>Singleton Pattern</h2>

<p>
Aqui está um problema que você pode resolver utilizando o Singleton:

Problema:
Você está desenvolvendo um sistema de logging para uma aplicação grande, onde múltiplas partes do sistema precisam gravar logs (erros, avisos, informações). Para garantir que todos os logs sejam consistentes e gravados no mesmo local (arquivo, console, banco de dados), você quer garantir que exista apenas uma única instância da classe responsável pelo logging em toda a aplicação.

A classe de logging deve ser acessível por diferentes partes da aplicação, mas sempre retornar a mesma instância para evitar que múltiplas instâncias criem logs dispersos e inconsistentes.

Como você implementaria essa solução utilizando o Singleton para garantir que apenas uma instância da classe de logging seja criada em toda a aplicação?</p>