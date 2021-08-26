create table tabela_livro(
ISBN bigint primary key not null,
Título varchar(100) not null,
idAutores Bigint not null,
Editora varchar(100),
DataPublicacao date,
Preço Decimal(2,2) not null,
Críticas varchar(200) not null
);