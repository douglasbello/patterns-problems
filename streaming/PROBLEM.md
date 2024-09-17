<h2>Proxy Pattern</h2>

<p>Problema:
Você está desenvolvendo um sistema de controle de acesso a vídeos em uma plataforma de streaming. Alguns vídeos são gratuitos, enquanto outros estão disponíveis apenas para usuários premium. Quando um usuário tenta acessar um vídeo premium, o sistema deve verificar se o usuário tem uma assinatura ativa antes de permitir o acesso.

A solução deve garantir que a lógica de verificação de acesso seja executada antes de qualquer tentativa de carregar o vídeo premium, sem modificar diretamente a classe responsável por fornecer o vídeo.

Como você implementaria isso utilizando o Proxy?</p>