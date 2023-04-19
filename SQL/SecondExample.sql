CREATE TABLE users (
	userID int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    username varchar (45) NOT NULL,
    password varchar(45) NOT NULL,
    fullName varchar(100) NOT NULL,
    email varchar(45)
);

INSERT INTO users (username, password, fullname, email)
VALUES ('trumwall', 'mexico', 'Donald Trump', 'maga@gmail.com');

INSERT INTO users (username, password, fullname)
VALUES ('joeRogan', '12345678', ' Joe Rogan');

INSERT INTO users (username, password, email)
VALUES ('Obama333', '123', 'obama@gmail.com');

select * from users;