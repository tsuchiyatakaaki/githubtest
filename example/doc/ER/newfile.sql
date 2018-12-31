
/* Drop Tables */

DROP TABLE [Tally];
DROP TABLE [Teams];
DROP TABLE [test];
DROP TABLE [test2];




/* Create Tables */

CREATE TABLE [Tally]
(
	[Num] integer NOT NULL,
	PRIMARY KEY ([Num])
);


CREATE TABLE [Teams]
(
	[TeamId] integer NOT NULL,
	[TeamName] text NOT NULL,
	[CaptainId] integer,
	PRIMARY KEY ([TeamId])
);


CREATE TABLE [test]
(
	[id] text NOT NULL,
	[val] text,
	PRIMARY KEY ([id])
);


CREATE TABLE [test2]
(
	[id] text NOT NULL,
	[val] text,
	PRIMARY KEY ([id])
);



