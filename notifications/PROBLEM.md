<h2>Observer Pattern</h2>

<p>
Aqui está um problema que pode ser resolvido utilizando o Observer Pattern:

Problema:
Você está desenvolvendo um sistema de notificações para uma plataforma de streaming de filmes e séries. A ideia é que os usuários possam se inscrever para receber notificações sempre que um novo episódio de suas séries favoritas for lançado ou quando um novo filme que possa ser do seu interesse for adicionado ao catálogo.

Requisitos:

Os usuários podem se inscrever em várias séries ou categorias de filmes para receber notificações.
Quando um novo episódio de uma série ou um novo filme é adicionado ao catálogo, todos os usuários inscritos na série ou categoria devem ser notificados.
O sistema deve permitir que os usuários se inscrevam e cancelem sua inscrição a qualquer momento.
O sistema deve ser escalável, permitindo várias séries, filmes e usuários inscritos.
Exemplo:
O usuário A está inscrito na série "Breaking Bad" e na categoria de filmes de ação.
O usuário B está inscrito na série "Game of Thrones" e também na categoria de filmes de ficção científica.
Quando um novo episódio de "Breaking Bad" é adicionado, o usuário A deve ser notificado.
Quando um novo filme de ação é adicionado, o usuário A deve ser notificado.
O usuário B não recebe notificações sobre "Breaking Bad", mas é notificado quando um novo episódio de "Game of Thrones" ou um novo filme de ficção científica é adicionado.
Objetivo:
Implemente um sistema que utilize o Observer Pattern para gerenciar as inscrições e as notificações entre séries, categorias de filmes e usuários.</p>