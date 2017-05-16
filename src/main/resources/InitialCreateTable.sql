create table users (
id int not null auto_increment,
first_name varchar(255) not null,
last_name varchar(255) not null,
primary key (id) );

create table travellers (
id int not null auto_increment,
user_id int not null,
trip_id int not null,
dob date,
firts_name varchar(255),
last_name varchar(255),
address varchar(255),
primary key (id),
foreign key (user_id) references users(id),
foreign key (trip_id) references trips(id) );

create table trips (
id int not null auto_increment,
user_id int not null,
start_date date,
end_date date,
num_travellers int,
primary key (id),
foreign key (user_id) references users(id) );

create table destinations (
id int not null auto_increment,
dest_code int,
city varchar(255) not null,
state varchar(255),
country varchar(255) not null,
primary key (id) );

create table trip_destination (
id int not null auto_increment,
trip_id int not null,
destination_id int not null,
primary key (id),
foreign key (trip_id) references trips(id),
foreign key (destination_id) references destinations(id) );

create table trip_hotels (
id int not null auto_increment,
trip_id int not null,
hotel_name varchar(255),
start_date date,
end_date date,
primary key (id),
foreign key (trip_id) references trips(id) );

create table destination_activities (
id int not null auto_increment,
primary key (id) );

create table trip_cars (
id int not null auto_increment,
primary key (id) );

create table trip_flights (
id int not null auto_increment,
primary key (id) );

create table activities (
id int not null auto_increment,
primary key (id) );

create table request_log (
id int not null auto_increment,
primary key (id) );

create table OAUTH_tokens (
id int not null auto_increment,
primary key (id) );


























