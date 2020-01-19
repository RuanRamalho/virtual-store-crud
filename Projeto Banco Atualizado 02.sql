Create database Projeto;

Create table pessoa (
codigo_pessoa int (11)  primary key  auto_increment,
nome_pessoa varchar (100),
cpf_pessoa varchar (100),
endereco_pessoa varchar (100),
email_pessoa varchar (100),
senha_pessoa varchar(20)
);

Create table produto(
             codigo_produto int(11) primary key auto_increment,
             descricao_produto varchar(100),
             preco_produto double(15,2)
);

Create table carrinho(
       codigo_pessoa int(11),
       codigo_produto int(11),
       preco_produto double(15,2)
);

drop table carrinho;

alter table carrinho add constraint foreign key (codigo_pessoa) references pessoa(codigo_pessoa);
alter table carrinho add constraint foreign key (codigo_produto) references produto(codigo_produto);

alter table carrinho add primary key(codigo_pessoa,codigo_produto);

Create table Frete(
		codigo_envio int auto_increment primary key,
		endereco_pessoa varchar(100),
		complemento varchar(225),
		cep varchar(8)
);

Create table Pagamento(
		codigo_pagamento int auto_increment primary key,
		descricao_produto varchar(255),
		preco_produto double(15,2)
);



