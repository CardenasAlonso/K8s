CREATE TABLE IF NO EXISTS personas (
    id BIGINT AUTO_INCREMENT PRIMARY_KEY,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
)

INSERT INTO personas (nombre, apellido, email) VALUES ('Alonso',  'Cardenas', 'hancel.cardenas@vallegrande.edu.pe');
INSERT INTO personas (nombre, apellido, email) VALUES ('Alonso',  'Cardenas', 'hancel.cardenas@vallegrande.edu.pe');