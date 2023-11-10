create table if not exists character(
    id serial primary key,
    name varchar(100),
    image varchar(300),
    species varchar(300)
);