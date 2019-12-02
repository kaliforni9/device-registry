create sequence user_seq;
create sequence device_seq;
create table usr
(
    id       bigint       not null
        constraint pk_user_id primary key,
    username     varchar(300) not null,
    password varchar(300),
    active   boolean
);
create table device
(
    id          uuid        not null
        constraint pk_device_id primary key,
    serial_no   varchar(2048) not null,
    type varchar(4096),
    description varchar(4096),
    created_at date,
    owner_id   bigint        not null
        constraint fk_user_id references usr
);