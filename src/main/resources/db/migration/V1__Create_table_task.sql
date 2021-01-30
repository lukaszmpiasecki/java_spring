create table task (
    id integer not null auto_increment,
    taskname varchar(255) not null,
    taskdesc varchar(255),
    taskdate date not null,
    primary key (id)
) engine=InnoDB;
