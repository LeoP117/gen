

create database db_rh;

use db_rh;

create table colaboradores (id int auto_increment not null ,nome varchar(100),salario float,cargo varchar(100),matricula int (10) ,primary key(id));
insert into colaboradores(id,nome,salario,cargo,matricula)values(null,'Pedreo Julio',2000.0,'Eletricista',203040);
insert into colaboradores(id,nome,salario,cargo,matricula)values(null,'Mario',1900.0,'Encanador',203060);
insert into colaboradores(id,nome,salario,cargo,matricula)values(null,'Eliot',5000.0,'Desenvolvedor',304050);
insert into colaboradores(id,nome,salario,cargo,matricula)values(null,'Ariel',1500.0,'Astronomo',102030);
insert into colaboradores(id,nome,salario,cargo,matricula)values(null,'Fabio Lima',2000.0,'Professor',303042);

select * from colaboradores where salario > 2000.0;

select * from colaboradores where salario < 2000.0;

update colaboradores set nome = 'Juk' where id = 1;