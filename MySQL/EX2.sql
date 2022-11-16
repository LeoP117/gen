create database db_produtos;

use db_produtos;

create table produtos(id int auto_increment not null ,nome varchar(100),valor float,categoria varchar(100),matricula int (10),primary key(id));


insert into produtos(id,nome,valor,categoria,matricula)values(null,'Tenia Adidas',250.0,'calçados',123004);
insert into produtos(id,nome,valor,categoria,matricula)values(null,'Jaqueta jeans',340.0,'rupas',45030);
insert into produtos(id,nome,valor,categoria,matricula)values(null,'Camisa Branca',150.0,'acessórios',1345000);
insert into produtos(id,nome,valor,categoria,matricula)values(null,'Par de Meias',50.0,'roupa',12345);
insert into produtos(id,nome,valor,categoria,matricula)values(null,'camisa Amarela',100.0,'roupas',312000);
insert into produtos(id,nome,valor,categoria,matricula)values(null,'calça moletom',700.0,'roupas',120301);
insert into produtos(id,nome,valor,categoria,matricula)values(null,'Blusa de Moletom',500.0,'roupas',230394);
insert into produtos(id,nome,valor,categoria,matricula)values(null,'gorro algodão',100.0,'roupas',932932);

select * from produtos where valor > 500.0;

select * from produtos where valor < 500.0;

update produtos set valor = 340.0 where id = 1;