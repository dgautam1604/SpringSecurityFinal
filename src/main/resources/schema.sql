create table users(
                      username varchar(255) not null primary key ,
                      password varchar(255),
                      enabled boolean
);
create table authorities(
                      username varchar(255) not null primary key ,
                      authority varchar(255),
                      constraint fk_auth foreign key (username) references users(username)
);
create unique index idx_auth on authorities(username,authority);
