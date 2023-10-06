CREATE DATABASE bancoGrupo02;
use bancoGrupo02;

CREATE TABLE disciplina (
	sigla_disciplina VARCHAR(15),
    nome VARCHAR(45) NOT NULL,
    ementa VARCHAR(255),
    PRIMARY KEY (sigla_disciplina)
);

CREATE TABLE professor(
	cod_professor VARCHAR(15) ,
    nome VARCHAR(45) NOT NULL,
    sigla_disciplina VARCHAR(15),
    especialidade VARCHAR(30), 
    data_admissao DATE NOT NULL,
    PRIMARY KEY (cod_professor , sigla_disciplina),
    CONSTRAINT fk_sigla_disciplina FOREIGN KEY (sigla_disciplina) REFERENCES disciplina(sigla_disciplina)  ON DELETE CASCADE ON UPDATE CASCADE
);