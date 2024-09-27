Trabalho da Matéria de Sistemas Distribuídos

Faça uma aplicação distribuída java que utilize a API Java TCP para implementar um sistema de registro médico de diagnósticos.

Esta solução deverá fazer uso de Serialização e de Threads para tornar o servidor mais eficiente no atendimento das requisições dos clientes.

Do lado do cliente haverá uma interface gráfica para que o médico possa identificar os sintomas relatados por seus paciente. Para efeito de simplificação cada paciente poderá relatar até 10 sintomas (S0, S1, S2, ..., S9). O conjunto desses sintomas juntamente com o diagnóstico fornecido pelo médico (D1, D2, ... , D5) é que será enviado para o servidor. Exemplo 1: S3, S8, S9 e D4. Exemplo 2: S2, S3, S6, S7, S9 e D3.

O servidor se responsabilizará por armazená-los em um ArrayList. Ao servidor também poderá ser solicitada a apresentação de todos os casos armazenados por doença identificada (D1, D2, D3 etc).

Ele também se encarregará, quando solicitado, de efetuar o diagnóstico automático por meio de uma Rede Neural Artificial Sem Peso WiSARD treinada.

Na interface gráfica do lado do cliente devem existir três radio buttons com as opções: treinamento/avaliação/produção.

Quando a fase de treinamento estiver ativa todos os casos apresentados à RNASP WiSARD (no lado do servidor) servirão para a fase de aprendizado da rede.

Quando a fase de avaliação estiver ativa todos os casos apresentados servirão exclusivamente para o teste da rede, gerando métricas de avaliação.

Quando a fase de produção estiver ativa o cliente poderá solicitar o diagnóstico automático por parte da rede.

Nesse caso, o médico informa os sintomas detectados no paciente mas não o seu diagnóstico. Então clica no botão para geração automática do diagnóstico. Os dados são enviado para o servidor que os repassa para a RNA. O resultado gerado pela RNA será devolvido para o médico no lado do cliente.
