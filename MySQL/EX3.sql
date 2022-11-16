create database db_escola;

use db_escola;

create table alunos(id int auto_increment not null ,nome varchar(155),idade int(3),sexo varchar(65),nota float,primary key(id));


insert into alunos(id,nome,idade,sexo,nota)values(null,'Julho',15,'masculino',7.6);
insert into alunos(id,nome,idade,sexo,nota)values(null,'Bruno Oliveira',14,'masculino',7.0);
insert into alunos(id,nome,idade,sexo,nota)values(null,'Marcia Mendez',13,'feminino',6.0);
insert into alunos(id,nome,idade,sexo,nota)values(null,'Luke Skywalker',17,'feminino',9.0);
insert into alunos(id,nome,idade,sexo,nota)values(null,'Maria Marilia',16,'masculino',5.6);
insert into alunos(id,nome,idade,sexo,nota)values(null,'Mario Luiz',17,'feminino',8.0);
insert into alunos(id,nome,idade,sexo,nota)values(null,'Harry Plancter',15,'masculino',5.0);
insert into alunos(id,nome,idade,sexo,nota)values(null,'Zeca Oliveira',17,'masculino',7.0);

select * from alunos where nota > 7.0;

select * from alunos where nota < 7.0;


update alunos set nota = 6.0 where id = 3;