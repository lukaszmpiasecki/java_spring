create table task (
    id integer not null auto_increment,
    taskname varchar(255) not null,
    taskdesc varchar(255),
    taskdate date not null,
    primary key (id)
) engine=InnoDB;
insert into task(taskname, taskdesc, taskdate)
values
("Lekarz", "Wizyta u ortopedy, 17:50","2021-09-08"),
("Wynieś śmieci", "","2021-02-03"),
("Zrób pranie", "Białe i kolorowe","2021-02-01");