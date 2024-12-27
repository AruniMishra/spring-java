
create sequence person_id_seq start with 1 increment by 10;

create table persons (
    id bigint not null default nextval('person_id_seq'),
    name varchar(255) not null,
    email varchar(255) not null unique,
    password varchar(255) not null,
    dob date,
    active boolean not null,
    primary key (id)
);

create table phone_numbers (
    owner_id bigint not null references persons(id),
    phone_number varchar(255)
);