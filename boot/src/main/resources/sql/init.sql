create table public.consumers
(
    consumer_id       bigint primary key,
    organization      boolean default false not null,
    organization_name text,
    gender            varchar(1),
    first_name        text,
    middle_inital     text,
    last_name         text,
    email_id          bigint                not null,
    auth_id           bigint                not null,
    phone_id          bigint                not null,
    address_id        bigint
);

create table public.auth
(
    auth_id bigint primary key,
    login   text                    not null,
    pwd     text                    not null,
    init_dt timestamp default now() not null,
    upd_dt  timestamp
);

alter table public.consumers
    add constraint consumers_auth_auth_id_fk
        foreign key (auth_id) references public.auth;


create table public.phones
(
    phone_id bigint
        constraint phones_pk
            primary key,
    work     text,
    home     text not null,
    reserve  text
);

alter table public.consumers
    add constraint consumers_phones_phone_id_fk
        foreign key (phone_id) references public.phones;

create table public.emails
(
    email_id bigint
        constraint emails_pk
            primary key,
    work     text,
    home     text not null,
    reserve  text
);

alter table public.consumers
    add constraint consumers_emails_email_id_fk
        foreign key (email_id) references public.emails;

create table public.address
(
    address_id bigint
        constraint address_pk
            primary key,
    city       text not null,
    street     text,
    house      text,
    apartment  text,
    country    text not null
);

alter table public.consumers
    add constraint consumers_address_address_id_fk
        foreign key (address_id) references public.address;

create table public.orders
(
    order_id    bigint constraint orders_pk
        primary key,
    consumer_id bigint
        constraint orders_consumers_consumer_id_fk
            references public.consumers,
    status      text                    not null,
    dt          timestamp default now() not null
);

