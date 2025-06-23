--liquibase formatted sql
--changeset joao:202506231432
--comment: product table create

CREATE TABLE product (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price NUMERIC(19,2) NOT NULL,
    stock INTEGER NOT NULL
);

--rollback DROP TABLE PRODUCT