create table websystem.address (id_address int8 not null, apartment_number varchar(255), city varchar(255), county varchar(255), house_number varchar(255), post_code varchar(255), province varchar(255), street varchar(255), primary key (id_address))
create table websystem.category (id_category int8 not null, name varchar(255), primary key (id_category))
create table websystem.client (id_client int8 not null, company varchar(255), last_name varchar(255), login varchar(255), name varchar(255), pass varchar(255), type_of_customer varchar(255), address_id_address int8, contact_id_contact int8, primary key (id_client))
create table websystem.contact (id_contact int8 not null, email varchar(255), fax_number varchar(255), my_site varchar(255), phone_number varchar(255), primary key (id_contact))
create table websystem.employee (id_employee int8 not null, active_account boolean not null, authorizations varchar(255), date_of_employment date, dismiss_employment date, last_name varchar(255), login varchar(255), name varchar(255), pass varchar(255), address_id_address int8, contact_id_contact int8, primary key (id_employee))
create table websystem.order_products (id_order_products int8 not null, orders_id_order int8, products_id_product int8, primary key (id_order_products))
create table websystem.orders (id_order int8 not null, acceptance_order boolean not null, date_of_acceptance_order date, date_of_order date, date_of_released_order date, date_of_shipment date, order_released boolean not null, payment varchar(255), client_id_client int8, employee_id_employee int8, primary key (id_order))
create table websystem.products (id_product int8 not null, date_of_purchase date, description varchar(255), is_sale boolean not null, name_product varchar(255), price numeric(19, 2), product_code varchar(255), sale_date date, type varchar(255), version varchar(255), primary key (id_product))
create table websystem.sales_invoice (id_sales_invoice int8 not null, date_sales date, id_client int8 not null, name_bank varchar(255), number_sales_invoice varchar(255), payment_method varchar(255), price varchar(255), primary key (id_sales_invoice))
create sequence hibernate_sequence start 1 increment 1
alter table websystem.client add constraint FKogny1vmvdrj25q6mj9ayf76q0 foreign key (address_id_address) references websystem.address
alter table websystem.client add constraint FK76eu65ac5he3478hmdvl9nbyb foreign key (contact_id_contact) references websystem.contact
alter table websystem.employee add constraint FKdejh9hbbkvc0ofdufsb3kh26l foreign key (address_id_address) references websystem.address
alter table websystem.employee add constraint FKn19qmykj12gg1y6k7vkmi221l foreign key (contact_id_contact) references websystem.contact
alter table websystem.order_products add constraint FK5w8yqo8l9mbnywcu5vd45nkog foreign key (orders_id_order) references websystem.orders
alter table websystem.order_products add constraint FKa38taakhs2buojq8gmm0gfmch foreign key (products_id_product) references websystem.products
alter table websystem.orders add constraint FK68k5m1noygw6o541q5a87f3s2 foreign key (client_id_client) references websystem.client
alter table websystem.orders add constraint FKle6b7vkl0y2vt7h351s04dm9m foreign key (employee_id_employee) references websystem.employee
