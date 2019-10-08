create table movies(
m_id VARCHAR(150),
m_title VARCHAR(150),
m_ibmdbid varchar(150),
m_spantit VARCHAR(150),
m_picurl VARCHAR(150),
m_year VARCHAR(150),
m_rtmid VARCHAR(150),
rtallcritrat VARCHAR(150),
rtallcritratnoofrev VARCHAR(150),
rtallcriticsnumfre VARCHAR(150),
rtallcriticsnumrot VARCHAR(150),
rtallcritscor VARCHAR(150),
rttopcrit VARCHAR(150),
rttcr VARCHAR(150),
rttopcritnumfre VARCHAR(150),
rttopcriticnumrot VARCHAR(150),
rttcprst VARCHAR(150),
rtaudrating VARCHAR(150),
rtaudnumrating VARCHAR(150),
rtaudscore VARCHAR(150),
rtpicurl VARCHAR(150),
);

create table m_actors(
a_id varchar(60),
Tag_value varchar(60),
a_name varchar(60),
a_name varchar(60)
);

create table m_countries(
m_id varchar(60),
m_country varchar(60),
);

create table m_genres(
m_id varchar(150),
m_genres varchar2(50),
);

create table m_directors(
m_id varchar(150),
d_Id varchar(150),
d_Name varchar(150),
);

create table tags(
t_id varchar(150),
t_value varchar(150),
);


create table m_tags(
m_id varchar(150),
m_tagid varchar(150),
m_tagwt varchar(150),
);

create table userratedmovies_ts(
u_id varchar(150),
m_id varchar(150),
m_rating varchar(150),
m_ts varchar(150)
);

create table usertaggedmovies_ts(
u_id varchar(150),
m_id varchar(150),
tagid varchar(150),
ts varchar(150)
);

Create table m_locations(
m_id varchar(150),
m_loc1 varchar(150),
m_loc2 varchar(150),
m_loc3 varchar(150),
m_loc4 varchar(150),
);



