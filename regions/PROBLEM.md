<h2>Abstract Factory Pattern</h2>

<p>Aqui está um problema que pode ser resolvido utilizando o Abstract Factory Pattern:

Problema:
Você está desenvolvendo um sistema de e-commerce que atende clientes de diferentes regiões do mundo. O sistema precisa ser adaptável para oferecer uma interface de usuário (UI) e métodos de pagamento personalizados para cada região. Dependendo da localização do cliente (por exemplo, América do Norte, Europa, Ásia), o sistema deve apresentar uma UI diferente e disponibilizar métodos de pagamento específicos.

Requisitos:

Para cada região, o sistema deve fornecer:
Temas de interface de usuário específicos (por exemplo, cores, fontes, layout).
Métodos de pagamento que sejam aceitos na região (cartão de crédito, PayPal, transferência bancária, etc.).
O sistema deve ser capaz de criar uma fábrica que gera os componentes de UI e métodos de pagamento correspondentes à região do cliente.
As regiões suportadas inicialmente são:
América do Norte: tema de UI com cores claras, fontes grandes e métodos de pagamento como cartão de crédito e PayPal.
Europa: tema de UI com cores neutras, fontes médias e métodos de pagamento como transferência bancária e cartão de débito.
Ásia: tema de UI com cores vivas, fontes pequenas e métodos de pagamento como e-wallet e cartão de crédito.
O sistema deve ser flexível para que novas regiões possam ser adicionadas facilmente no futuro.
Exemplo:
Um cliente da América do Norte acessa o sistema → o sistema deve exibir uma UI com tema de cores claras e fontes grandes e oferecer cartão de crédito e PayPal como métodos de pagamento.
Um cliente da Europa acessa o sistema → o sistema deve exibir uma UI com cores neutras e fontes médias, além de oferecer transferência bancária e cartão de débito como opções de pagamento.
No futuro, o sistema pode adicionar uma nova fábrica para América do Sul, com seu próprio tema de UI e métodos de pagamento.
Objetivo:
Implemente um sistema que utilize o Abstract Factory Pattern para criar objetos relacionados à UI e métodos de pagamento para diferentes regiões. O sistema deve permitir que novas regiões sejam adicionadas facilmente, mantendo a separação entre a lógica de criação dos componentes para cada região.</p>