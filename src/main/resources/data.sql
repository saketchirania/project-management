-- INSERT EMPLOYEES
insert into employee (employee_id, first_name, last_name, email) values (31, 'John', 'Warton', 'warton@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (32, 'Mike', 'Lanister', 'lanister@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (33, 'Steve', 'Reeves', 'Reeves@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (34, 'Ronald', 'Connor', 'connor@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (35, 'Jim', 'Salvator', 'Sal@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (36, 'Peter', 'Henley', 'henley@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (37, 'Richard', 'Carson', 'carson@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (38, 'Honor', 'Miles', 'miles@gmail.com');
insert into employee (employee_id, first_name, last_name, email) values (39, 'Tony', 'Roggers', 'roggers@gmail.com');

-- INSERT PROJECTS
insert into project (project_id, name, stage, description) values (1000, 'Large Production Deploy', 'NOTSTARTED', 'This requires all hands on deck for the final deployment of the software into production');
insert into project (project_id, name, stage, description) values (1001, 'New Employee Budget',  'COMPLETED', 'Decide on a new employee bonus budget for the year and figureout who will be promoted');
insert into project (project_id, name, stage, description) values (1002, 'Office Reconstruction', 'INPROGRESS', 'The office building in Monroe has been damaged due to hurricane in the region. This needs to be reconstructed');
insert into project (project_id, name, stage, description) values (1003, 'Improve Intranet Security', 'INPROGRESS', 'With the recent data hack, the office security needs to be improved and proper security team needs to be hired for implementation');

-- INSERT PROJECT_EMPLOYEE_RELATION (Removed duplicates from video)
insert into project_employee (employee_id, project_id) values (31,1000);
insert into project_employee (employee_id, project_id) values (31,1001);
insert into project_employee (employee_id, project_id) values (31,1002);
insert into project_employee (employee_id, project_id) values (33,1000);
insert into project_employee (employee_id, project_id) values (36,1002);
insert into project_employee (employee_id, project_id) values (3 6,1003);
