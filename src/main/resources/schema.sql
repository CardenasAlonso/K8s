CREATE TABLE IF NOT EXISTS personas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO personas (nombre, apellido, email) VALUES ('Alonso', 'Cardenas', 'hancel.cardenas@vallegrande.edu.pe');
INSERT INTO personas (nombre, apellido, email) VALUES ('Maria', 'Gomez', 'maria.gomez@vallegrande.edu.pe');