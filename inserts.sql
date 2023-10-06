INSERT INTO disciplina (sigla_disc, nome_disc, ementa)
VALUES 
('PWBE', 'Programação Web para Back-End. ', 'Tal disciplina aborda conceitos
e técnicas para desenvolvimento de aplicativos web no lado do servidor, com
foco em back-end.'),
('PWFE', 'Programação Web para Front-End.', 'Esta disciplina explora as
tecnologias e práticas para desenvolvimento de aplicações web e com foco
em front-end.'),
('IDM', 'Interface para Dispositivos Móveis.', 'A disciplina, aborda projetar e
desenvolver interfaces de usuário para aplicativos móveis, com foco nos
princípios de design e usabilidade.'),
('BD', 'Banco de Dados.', 'Tal disciplina contempla conceitos fundamentais de
bancos de dados, modelagem de dados e linguagens de consulta SQL.' ),
('REDES', 'Redes de Computadores.', ' Esta disciplina aborda conceitos
introdutórios sobre redes de computadores, topologias e padrões.'),
('SO', 'Sistemas Operacionais.', 'A disciplina contempla conceitos fundamentais
sobre sistemas operacionais, apresentando as funcionalidades dos sistemas
operacionais baseados nas plataformas Windows e Linux.');

INSERT INTO professor (cod_professor, nome_professor, sigla_disc, especialidade, data_admissao)
VALUES 
(101, 'Eduardo Nascimento', 'PWFE e BD', 'Tecnologia da Informação', ' 2023-01-15'),
(102, 'Matheus Michilino,', 'IDM', 'Mecatrônica e Interfaces Robóticas', ' 2020-01-01'),
(103, 'Rafael Selvagio', 'PWBE', 'Tecnologia da Informação', ' 2023-06-01'),
(104, 'Rafael Rizzi,', 'REDES,', 'Eng. Elétrica', '2022-01-01');
