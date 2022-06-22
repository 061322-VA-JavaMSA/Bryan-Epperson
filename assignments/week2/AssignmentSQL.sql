drop table if exists sales_staff_members;

create table if not exists sales_staff_members(
employee_id serial primary key,
sales_person varchar(30)
DoB date,
sale_office interger references sales_offices(office_id)
);

