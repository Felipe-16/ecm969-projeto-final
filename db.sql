create database projeto_musica;
use projeto_musica;
CREATE TABLE music (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  artist VARCHAR(255) NOT NULL,
  album VARCHAR(255)
);
select * from music;

insert into music 
(title, artist,album) 
values ('Bohemian Rhapsody','Queen','A night at the Opera');
insert into music 
(title, artist,album) 
values ('bad liar','imagine dragons','album');
insert into music 
(title, artist,album) 
values ('bones','imagine dragons','album');
insert into music 
(title, artist,album) 
values ('believer','imagine dragons','album');