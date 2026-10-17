# Primeira missão — Faça a F.R.I.D.A.Y. responder a comandos

**Meta:** uma versão simples e funcional que roda no terminal. Ainda não teremos voz, IA, banco de dados ou automação real.

## O problema

A aplicação deve continuar recebendo mensagens até o usuário digitar `sair`.

Comandos para começar:

| Comando digitado | Resposta esperada |
| --- | --- |
| `ajuda` | Mostra os comandos disponíveis |
| `status` | Informa que a F.R.I.D.A.Y. está funcionando |
| `estudar` | Diz que está preparando o ambiente de estudos (simulado) |
| `jogar` | Diz que está preparando o ambiente de jogos (simulado) |
| `sair` | Se despede e encerra |
| qualquer outro | Informa que ainda não conhece o comando |

## Um exemplo de interação (ainda a implementar)

```text
F.R.I.D.A.Y.: Olá! Como posso ajudar?
Você: ajuda
F.R.I.D.A.Y.: Comandos: ajuda, status, estudar, jogar, sair.
Você: estudar
F.R.I.D.A.Y.: Preparando seu ambiente de estudos...
Você: sair
F.R.I.D.A.Y.: Até logo!
```

## Pistas, sem entregar a solução

- `Scanner` pode ler uma linha digitada.
- `while` ou `do while` pode manter a aplicação ativa.
- `switch` ou `if/else` pode decidir qual resposta mostrar.
- Uma variável pode indicar quando encerrar.
- Pense no que deve acontecer com comandos desconhecidos e letras maiúsculas.

## Critérios de conclusão

- [ ] Consigo digitar vários comandos na mesma execução.
- [ ] `sair` encerra o programa.
- [ ] Comandos conhecidos apresentam a resposta adequada.
- [ ] Entradas desconhecidas não encerram inesperadamente o programa.
- [ ] Consigo explicar como meu código funciona.

## Ao terminar

1. Teste o programa no IntelliJ.
2. Faça um commit descrevendo a implementação: `feat: adiciona comandos basicos no terminal`.
3. Atualize o README marcando a versão 0.1 como funcional **somente quando ela realmente funcionar**.

> Esta missão foi escolhida por usar conhecimentos de Java que já estudei. A ideia é escrever a implementação por conta própria e pedir orientação quando necessário.
