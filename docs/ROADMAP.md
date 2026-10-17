# Roteiro de desenvolvimento da F.R.I.D.A.Y.

A F.R.I.D.A.Y. será construída aos poucos, conforme eu aprender os fundamentos e as ferramentas necessárias. **As versões são objetivos, não funcionalidades prontas.**

## v0.1 — Assistente por texto (foco atual)

**Conhecimentos:** `Scanner`, `if/else`, `switch`, `while`/`do while`, variáveis.

- [ ] Mostrar uma saudação inicial.
- [ ] Ler comandos pelo terminal.
- [ ] Responder a `ajuda`, `status`, `estudar`, `jogar` e `sair` (no começo, só texto).
- [ ] Exibir uma mensagem para comando desconhecido.
- [ ] Encerrar apenas com `sair`.
- [ ] Testar entradas diferentes e revisar o código.

**Concluído quando:** eu consigo demonstrar um fluxo de conversa por comandos, sem travamentos em entradas comuns.

## v0.2 — Automação local

**Aprender:** métodos, entrada e saída do Java, `Desktop.browse`, `ProcessBuilder` e cuidados de segurança.

- [ ] Abrir uma página de estudos escolhida pelo usuário.
- [ ] Abrir aplicativos previamente configurados.
- [ ] Definir uma rotina `estudar` com vários aplicativos.
- [ ] Trabalhar apenas com uma lista permitida de ações; não executar texto arbitrário como comandos do sistema.

## v0.3 — Preferências persistentes

**Aprender:** modelagem de dados, SQL básico, SQLite e JDBC.

- [ ] Salvar rotinas personalizadas.
- [ ] Consultar, editar e remover preferências.
- [ ] Tratar erros e entradas inválidas.

## v0.4 — Conversa por texto

**Aprender:** HTTP, JSON, APIs, proteção de chaves, histórico de contexto.

- [ ] Integrar um modelo de linguagem local ou remoto.
- [ ] Distinguir conversa livre de comandos que alteram o computador.
- [ ] Não executar ações sensíveis sem confirmação explícita.

## v0.5 — Voz

**Aprender:** captura de áudio, reconhecimento de fala e síntese de voz.

- [ ] Transformar fala em texto.
- [ ] Responder por áudio.
- [ ] Oferecer controles claros de microfone e privacidade.

## v0.6+ — Integrações

**Aprender:** APIs oficiais e autenticação/autorização.

- [ ] Pesquisar integrações com serviços como Gmail.
- [ ] Preparar rascunhos; **enviar somente após confirmação**.
- [ ] Guardar tokens com segurança, fora do repositório.

## Qualidade para portfólio (ao longo de todas as versões)

- [ ] README atualizado conforme o programa evolui.
- [ ] Commits que expliquem mudanças reais.
- [ ] Testes adequados a cada etapa.
- [ ] Instruções reproduzíveis para executar a aplicação.
- [ ] Capturas ou vídeo quando houver algo demonstrável.
