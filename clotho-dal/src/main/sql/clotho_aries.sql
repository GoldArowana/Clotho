CREATE DATABASE `clotho_aries` character set utf8mb4;

create table authority
(
	id bigint auto_increment,
	name varchar(50) null,
	url varchar(200) null,
	constraint authority_pk
		primary key (id)
);


create table role
(
	id bigint auto_increment,
	name varchar(20) null,
	constraint role_pk
		primary key (id)
);

create table role_authority
(
	id bigint auto_increment,
	role_id bigint null,
	authority_id bigint null,
	constraint role_authority_pk
		primary key (id)
);

create index role_authority_role_id_authority_id_index
	on role_authority (role_id, authority_id);




create table user_role
(
	id bigint auto_increment,
	user_uid bigint null,
	role_id bigint null,
	constraint user_role_pk
		primary key (id)
);