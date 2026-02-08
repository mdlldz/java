CREATE TABLE t17 (
    id INT PRIMARY KEY,
    `name` VARCHAR(32),
    email VARCHAR(32)
);
INSERT INTO t17 VALUES(1, 'jack', 'jack@sohu.com');
INSERT INTO t17 VALUES(2, 'tom', 'tom@sohu.com');
INSERT INTO t17 VALUES(1, 'mdl', 'mdl@sohu.com');
SELECT * FROM t17;
CREATE TABLE t18 (
    id INT PRIMARY KEY,
    `name` VARCHAR(32),
    email VARCHAR(32),
    PRIMARY KEY (id, `name`)
);
CREATE TABLE t21 (
    id INT UNIQUE,
    `name` VARCHAR(32),
    email VARCHAR(32)
);
CREATE TABLE t22 (
    id INT UNIQUE,      
    `name` VARCHAR(32) UNIQUE,
    email VARCHAR(32)
);
DESC t22;
CREATE TABLE my_class (
    id INT PRIMARY KEY,
    `name` VARCHAR(32) NOT NULL DEFAULT ''
);
CREATE TABLE my_stu (
    id INT PRIMARY KEY,
    `name` VARCHAR(32) NOT NULL DEFAULT '',
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES my_class(id);
INSERT INTO my_class VALUES(100, 'java'), (200, 'web');
SELECT * FROM my_class;
INSERT INTO my_stu VALUES(1, 'tom', 100);
INSERT INTO my_stu VALUES(2, 'jack', 200);
INSERT INTO my_stu VALUES(3, 'mdl', 200);
CREATE DATABASE shop_db;
CREATE TABLE goods (
    goods_id INT PRIMARY KEY,
    goods_name VARCHAR(64) NOT NULL DEFAULT '',
    unitprice DECIMAL(10,2) NOT NULL DEFAULT 0
        CHECK (unitprice >= 1.0 AND unitprice <= 9999.99),
    category INT NOT NULL DEFAULT 0,
    provider VARCHAR(64) NOT NULL DEFAULT ''
);
CREATE TABLE customer (
    customer_id CHAR(8) PRIMARY KEY,
    `name` VARCHAR(64) NOT NULL DEFAULT '',
    address VARCHAR(64) NOT NULL DEFAULT '',
    email VARCHAR(64) UNIQUE NOT NULL,
    sex ENUM('男','女') NOT NULL,
    card_Id CHAR(18)
);
CREATE TABLE purchase (
    order_id INT UNSIGNED PRIMARY KEY,
    customer_id CHAR(8) NOT NULL DEFAULT '', 
    goods_id INT NOT NULL DEFAULT 0,        
    nums INT NOT NULL DEFAULT 0,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);

DESC goods;