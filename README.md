# AvaliacaoBancoGrupo02
Ao começarmos o projeto dividimos as tarefas para cada integrante do grupo

Bruno ficou com a parte de realizar os Creates

Felipe ficou com a parte de realizar o Diagrama

Kaique ficou com a parte de escrever os Inserts

Miguel ficou com a parte de realizar as Consultas   

A sigla da disciplina como seria algo pequedo decidimos colocar um limite de 5 caraceres, já o nome não vimos necessidade de setar algo pequeno então deixamos 45 caracteres, a ementa vimos que poderia ser algo grande, sabendo disso decidimos setar o limite para 100 caracteres

Já na tabela Professor decimidos deixar o código do professor como varchar por conta que se fosse inteiro isso dificultaria alguns processor no banco, nome também deixamos como um VARCHAR(45) “Padrão” , sigla_disciplina como um Varchar(5), especialidade como poderia ser algo grande como “Tecologia da Informação” deixamos com o limite de 30 caracteres

Setamos a chave primaria da tabela professor como uma chave-conjunta , juntando o código do professor com a disciplina que ele leciona

Decidimos colocar o ON DELETE CASCADE junto com o ON UPDATE CASCADE para quando fomos atualizar ou deletar uma disciplina não precisemos atualizar ou deletar o professor também economizando tempo.
