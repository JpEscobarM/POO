create database banco_de_usuarios;

use banco_de_usuarios;

create table usuario(
	id integer auto_increment primary key,
    nome_completo varchar(200) not null,
    username varchar(100) not null unique,
    email varchar(50) not null unique,
    senha text not null,
    telefone varchar(15) not null	
);

select * from usuario;

TRUNCATE TABLE usuario; /*reseta auto increment e zera tabela;*/


insert into usuario values (null, 'Daniel2', 'danieldev2', 'daniel@email.com2', 'senhaDaniel2', '119998876762');

