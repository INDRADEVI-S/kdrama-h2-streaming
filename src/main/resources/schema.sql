CREATE TABLE kdrama (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    genre VARCHAR(255),
    description VARCHAR(1000),
    thumbnail_url VARCHAR(500),
    trailer_url VARCHAR(500)
);
