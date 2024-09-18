<h2>Factory Method Pattern</h2>

<p>
Aqui está um problema que pode ser resolvido utilizando o Factory Method Pattern:

Problema:
Você está desenvolvendo um sistema para uma empresa de logística que oferece diferentes tipos de serviços de transporte. O sistema precisa ser capaz de criar objetos de diferentes veículos (como carros, caminhões e drones) com base no tipo de entrega que o cliente solicita.

Requisitos:

A empresa oferece três tipos principais de transporte: entrega terrestre, entrega aérea, e entrega expressa.
Dependendo do tipo de entrega, o sistema deve criar o veículo apropriado:
Entrega terrestre: Usar carro para pequenas encomendas ou caminhão para grandes volumes.
Entrega aérea: Usar drone para pacotes leves e áreas urbanas ou avião para longas distâncias.
Entrega expressa: Usar sempre moto para garantir agilidade em entregas urgentes.
Cada veículo deve implementar uma interface comum (por exemplo, Veiculo) e ter funcionalidades específicas, como calcular tempo estimado de entrega, capacidade máxima de carga, etc.
O sistema deve ser flexível para que novos tipos de transporte possam ser adicionados no futuro (por exemplo, navios para entregas internacionais).
Exemplo:
O cliente solicita uma entrega expressa → o sistema deve criar uma moto.
O cliente solicita uma entrega terrestre com um grande volume de pacotes → o sistema deve criar um caminhão.
O cliente solicita uma entrega aérea para um pacote leve → o sistema deve criar um drone.
Objetivo:
Implemente um sistema que utilize o Factory Method Pattern para criar os objetos de diferentes veículos, de acordo com o tipo de entrega solicitada. O sistema deve ser fácil de estender, permitindo adicionar novos tipos de transporte no futuro sem alterar o código existente.</p>