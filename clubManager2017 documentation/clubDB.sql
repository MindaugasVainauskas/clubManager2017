-- Script to create club_db database on first launch of the application.
Drop database if exists clubDB;

Show databases;
create database clubDB CHARACTER SET utf8 COLLATE UTF8_GENERAL_CI;

Use clubDB;

Show tables;
 -- Member table creation script.
 
drop table if exists members;
 
CREATE TABLE clubDB.members (
  studentId VARCHAR(10) NOT NULL,
  name VARCHAR(20) NULL,
  surname VARCHAR(20) NULL,
  phone VARCHAR(15) NULL,
  email VARCHAR(30) NULL,
  PRIMARY KEY (studentId));
  
  
  drop table if exists events;
  -- Create event table for upcoming events
  CREATE TABLE clubDB.events (
  eventId INT NOT NULL AUTO_INCREMENT,
  eventName VARCHAR(60) NULL,
  eventDate DATE NULL COMMENT 'Shows date of upcoming event.',
  eventDesc VARCHAR(200) NULL,
  PRIMARY KEY (eventId));