CREATE DATABASE IF NOT EXISTS Products;
USE Products;
CREATE TABLE IF NOT EXISTS Product
(
    id         INTEGER not NULL AUTO_INCREMENT,
    name       VARCHAR(255),
    price      INTEGER,
    status     VARCHAR(255),
    PRIMARY KEY (id)
);
INSERT INTO Product (name, price, status)
VALUES ('Samsung', 200, 'Out of stock') ;
INSERT INTO Product (name, price, status)
VALUES ('LG', 430, 'In of stock');
INSERT INTO Product (name, price, status)
VALUES ('Meizu', 324, 'Out of stock');
