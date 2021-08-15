## Software Design - Laboratory 1

This repository contains the project related to Software Design course laboratory #1 from BS Software Engineering at Pontifical Catholic University of Minas Gerais.

## Lab 1 Description (PT-BR)

Durante o laboratório 1, um sistema com as características a seguir deverá ser desenvolvido.

Uma universidade pretende informatizar seu sistema de matrículas. A secretaria da universidade gera o currículo para cada semestre e mantém as informações sobre as disciplinas, professores e alunos.

Cada curso tem um nome, um determinado número de créditos e é constituído por diversas disciplinas.

Os alunos podem se matricular em 4 disciplinas como 1ª opção (obrigatórias) e em mais 2 outras alternativas (optativas).

Há períodos para efetuar matrículas, durante os quais um aluno pode acessar o sistema para se matricular em disciplinas e/ou para cancelar matrículas feitas anteriormente.

Uma disciplina só fica ativa, isto é, só vai ocorrer no semestre seguinte se, no final do período de matrículas tiver, pelo menos, 3 alunos inscritos (matriculados). Caso contrário, a disciplina será cancelada. O número máximo de alunos inscritos a uma disciplina é de 60 e quando este número é atingido, as inscrições (matrículas) para essa disciplina são encerradas.

Após um aluno se inscrever para um semestre, o sistema de cobranças é notificado pelo sistema de matrículas, de modo que o aluno possa ser cobrado pelas disciplinas daquele semestre.

Os professores podem acessar o sistema para saber quais são os alunos que estão matriculados em cada disciplina.

Todos os usuários do sistema têm senhas que são utilizadas para validação do respectivo login.

## Development Process

The development will happen in 4 phases, A.K.A `Sprints`, as follows:

- Sprint 1
  - Analysis Model: User Case Diagram & User Stories
- Sprint 2
  - To be decided
- Sprint 3
  - To be decided
- Sprint 4
  - To be decided

## User Stories (PT-BR)

- Como aluno eu posso,
  - realizar login no sistema
  - acessar o sistema de matrícula durante o período válido
  - matricular em até 4 disciplinas obrigatórias
  - matricular em até 2 disciplinas optativas
  - cancelar matrículas efetuadas
- Como funcionario (secretaria) eu posso,
  - realizar login no sistema
  - cadastrar novas disciplinas
  - cadastrar professores
  - cadastrar alunos
- Como professor eu posso,
  - realizar login no sistema
  - listar os alunos matriculados em uma disciplina que eu ministro
- Como sistema de matriculas eu posso,
  - notificar sistema de cobranças a respeito dos alunos matriculados em uma disciplina
- Como sistema de cobrança eu posso,
  - enviar cobrança para alunos matriculados em uma disciplina