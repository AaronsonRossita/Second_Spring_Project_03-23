DROP TABLE IF EXISTS employee;

CREATE TABLE employee(
    id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL DEFAULT '',
    job_title VARCHAR(255) NOT NULL DEFAULT '',
    PRIMARY KEY(id)
);

INSERT INTO employee (name,job_title)
VALUES ('Tom','qa'),
        ('Jack','fullstack'),
        ('Marry','cyber'),
        ('Adam','qa');