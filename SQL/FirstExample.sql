/*Multi line
comment
*/
-- Single line comment
-- Creating table
CREATE TABLE persons (
	personID int,
    lastName varchar(100),
    firstName varchar(100),
    address varchar(255),
    city varchar(50),
    age	int,
    PRIMARY KEY (personID)
);

-- Delete table
DROP TABLE IF EXISTS persons;

-- insert data
INSERT INTO persons (personID, lastName, firspersonstName, address, city, age)
    VALUES (1000, 'Trump', 'Donald', 'House is 515 North County Road, Palm Beach, Florida 33480','Palm Beach',65),
    (1001, 'Trump', 'Maria', 'House is 515 North County Road, Palm Beach, Florida 33480','Palm Beach',45);

INSERT INTO persons VALUES (1002, 'Obama', 'Barack', '2500 W. Golf Road Hoffman Estates, IL 60169-1114','Washington', 55);
INSERT INTO persons (personId, lastName, firstName) values (1003, 'Baiden', 'Joe'), (1004, 'Jeorge W', 'Bush');

select * from persons;
select lastName, address from persons where city is null;

update persons SET city = 'New York' where personId = 1003;

delete from persons where where personId = 1003;


