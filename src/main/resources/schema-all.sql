drop table top50 if exists;

create table top50 (
	id int identity not null primary key,
	Track_Name varchar(200),
	Artist_Name varchar(200),
	Genre varchar(200),
	Beats_Per_Minute int,
	Energy int,
	Danceability int,
	Loudness_dB int,
	Liveness int,
	Valence int,
	Length int,
	Acousticness int,
	Speechiness int,
	Popularity int
)