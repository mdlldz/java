SELECT @@tx_isolation;  
-- +-----------------+
-- | @@tx_isolation  |
-- +-----------------+
-- | REPEATABLE-READ |
-- +-----------------+
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;
START TRANSACTION;
CREATE TABLE `account` (
    id INT,
    `name` VARCHAR(32),
    money INT
);
INSERT INTO ACCOUNT VALUES(100,'tom',1000);
SELECT * FROM `account`;
SELECT * @@global.tx_isolation;
