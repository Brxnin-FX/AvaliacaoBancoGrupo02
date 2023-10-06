-- Consultas MySQL Prova --
-- Grupo 2 --

-- 1) Selecione os nomes dos professores que têm especialidade em "Tecnologia da Informação" (não devem ser exibidos nomes iguais).
SELECT DISTINCT nome_professores FROM professor WHERE especialidade = "Tecnologia da Informação";

-- 2) Liste o nome das disciplinas cujo nome contém a palavra "Web".
SELECT nome_disciplinas FROM disciplina WHERE nome_disciplinas LIKE '%Web%';

-- 3) Liste o nome do professor mais antigo (com base na data de admissão).
SELECT nome_professores FROM professor ORDER BY data_admissao ASC LIMIT 1;

-- 4) Selecione os nomes das disciplinas lecionadas por professores com
-- especialidade em "Tecnologia da Informação":
SELECT nome_disciplinas FROM disciplinas WHERE professor.especialidade IN (SELECT especialidade WHERE especialidade LIKE '%Tecnologia da Informação%');

-- 5) Liste o nome da disciplina e a especialidade do professor que a ministra,
-- ordene por nome de disciplina:
SELECT disciplina.nome_disciplinas, silaDisc FROM professor WHERE disciplina.siglaDisc = professor.siglaDisc;