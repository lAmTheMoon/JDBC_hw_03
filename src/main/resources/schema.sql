CREATE TABLE CUSTOMERS
(
    id           integer auto_increment primary key,
    name         varchar(255) not null,
    surname      varchar(255) not null,
    age          integer      not null,
    phone_number integer      not null unique
);

CREATE TABLE ORDERS
(
    id           integer auto_increment primary key,
    date         timestamp    not null default now(),
    customer_id  integer references customers (id),
    product_name varchar(255) not null,
    amount       integer      not null
);