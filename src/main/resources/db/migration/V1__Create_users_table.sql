CREATE TABLE users (
    id BIGINT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    other_name VARCHAR(255),
    gender VARCHAR(255),
    address VARCHAR(255),
    state_of_origin VARCHAR(255),
    account_number VARCHAR(255) UNIQUE NOT NULL,
    account_balance DECIMAL(19, 2),
    email VARCHAR(255) UNIQUE,
    phone_number VARCHAR(255),
    alternative_phone_number VARCHAR(255),
    status VARCHAR(255),
    created_at TIMESTAMP,
    modified_at TIMESTAMP,
    PRIMARY KEY (id)
);