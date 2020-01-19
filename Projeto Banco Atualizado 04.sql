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
       codigo_carrinho int primary key auto_increment, 
       codigo_pessoa int(11),
       codigo_produto int(11),
       preco_produto double(15,2)
);

Create table Frete(
		codigo_envio int not null auto_increment primary key,
        codigo_pessoa int(11),
		endereco_pessoa varchar(100),
		complemento varchar(225),
		cep varchar(8)
);

Create table Pagamento(
		codigo_pagamento int auto_increment primary key,
        codigo_pessoa int(11) not null,
		nome_titular varchar(100),
		numero_cartao varchar(16) not null
);
drop table pagamento;

/*Create table Compra(
	codigo_compra int auto_increment,
    codigo_pessoa int,
    codigo_produto int,
    descricao_produto varchar(225)
);*/

alter table carrinho add constraint foreign key (codigo_pessoa) references pessoa(codigo_pessoa);
alter table carrinho add constraint foreign key (codigo_produto) references produto(codigo_produto);

alter table frete add constraint foreign key (codigo_pessoa) references pessoa(codigo_pessoa);
alter table frete add primary key(codigo_pessoa,codigo_envio);

alter table pagamento add constraint foreign key (codigo_pessoa) references pessoa (codigo_pessoa);
alter table carrinho add column descricao_produto varchar(200);

select * from carrinho;
drop table carrinho;

drop table pagamento;

select * from pessoa;
select * from pagamento;
select * from carrinho;

drop table carrinho;

SELECT codigo_pessoa FROM pessoa where email_pessoa = 'adm' and senha_pessoa = '123';