Create database Projeto;

create table Pessoa(
                codigo_pessoa int auto_increment primary key,
                nome_pessoa varchar (200),
                cpf_pessoa varchar (15),
                endereco_pessoa varchar(200),
                email_pessoa varchar (100),
                senha_pessoa varchar(20)
);

create table Produto(
			   codigo_produto int(11) auto_increment primary key,
               descricao_produto varchar(200),
               preco_produto double(15,2)
);

Create table carrinho(
       codigo_pessoa int(11),
       codigo_produto int(11),
       preco_produto double(15,2)
);

Create table Frete(
		codigo_envio int not null auto_increment primary key,
		endereco_pessoa varchar(100),
		complemento varchar(225),
		cep varchar(8)
);

Create table Pagamento(
		codigo_pagamento int auto_increment primary key,
		nome_titular varchar(100),
		numero_cartao varchar(16) not null
);

drop table produto;
alter table carrinho add constraint foreign key (codigo_pessoa) references pessoa(codigo_pessoa);
alter table carrinho add constraint foreign key (codigo_produto) references produto(codigo_produto);
alter table carrinho add primary key(codigo_pessoa,codigo_produto);


insert into Frete(endereco_pessoa, complemento, cep) values ("Rua 01", "T02 Ap104", "53433000");
delete from frete where codigo_envio = 3;


select frete.codigo_envio from frete where cep =  '11000953';

select * from frete;
