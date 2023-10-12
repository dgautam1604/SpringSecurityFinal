SELECT * FROM school_db.user;

insert into school_db.user(id,username, password, role,active)
values (1,'user','pass','ROLE_USER',true);

insert into school_db.user(id,username, password, role,active)
values (2,'admin','pass','ROLE_ADMIN',true);
