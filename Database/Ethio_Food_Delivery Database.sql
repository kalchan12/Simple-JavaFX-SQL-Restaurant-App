-- Create the main database for the food delivery app
create database ethiofooddelivery;

-- Select the database to use
use ethiofooddelivery;

-- Create the Registration table to store user information
create table Registration(
    Frist_Name varchar(44) not null,      -- User's first name
    Last_Name varchar(44) not null,       -- User's last name
    Username varchar(44) not null,        -- Unique username (primary key)
    Passwords varchar(44) not null,       -- User's password
    Email varchar(44) not null,           -- User's email address
    Phone_Number varchar(15) not null,    -- User's phone number
    primary key(Username)                 -- Set Username as the primary key
);

-- Create the Paymentinfo table to store payment details
create table Paymentinfo(
    Phone_Number varchar(22) not null,    -- Phone number for payment
    Email varchar(44) not null,           -- Email for payment
    Full_Name varchar(44) not null        -- Full name for payment
);

-- Select all records from the Registration table
select * from registration;

-- Select all records from the Paymentinfo table
select * from Paymentinfo;

