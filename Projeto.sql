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

Create table Carrinho(
			  codigo_pessoa int,
              codigo_produto int primary key,
              preco_produto double(15,2)
);

