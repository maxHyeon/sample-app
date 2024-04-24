CREATE DATABASE sample;

GRANT ALL PRIVILEGES ON *.* TO sample;
GRANT ALL PRIVILEGES ON sample.* TO sample;

create table sample.tenant
(
    id   bigint
        primary key,
    name varchar(20) null
);
