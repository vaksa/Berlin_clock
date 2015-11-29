-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2015-11-29 10:16:00.939




-- tables
-- Table: comment
CREATE TABLE comment (
    id int  NOT NULL,
    date_of_create date  NOT NULL,
    record_id int  NOT NULL,
    comment text  NOT NULL,
    user_id int  NOT NULL,
    table_name varchar(50)  NOT NULL,
    CONSTRAINT comment_pk PRIMARY KEY (id)
);



-- Table: communication_form
CREATE TABLE communication_form (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    communication_type_id int  NOT NULL,
    CONSTRAINT communication_form_pk PRIMARY KEY (id)
);



-- Table: communication_type
CREATE TABLE communication_type (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT communication_type_pk PRIMARY KEY (id)
);



-- Table: company
CREATE TABLE company (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    user_id int  NOT NULL,
    CONSTRAINT company_pk PRIMARY KEY (id)
);



-- Table: company_communication
CREATE TABLE company_communication (
    id int  NOT NULL,
    value varchar(255)  NOT NULL,
    company_id int  NOT NULL,
    communication_form_id int  NOT NULL,
    CONSTRAINT company_communication_pk PRIMARY KEY (id)
);



-- Table: connection_history
CREATE TABLE connection_history (
    id int  NOT NULL,
    date date  NOT NULL,
    ip varchar(20)  NOT NULL,
    browser varchar(20)  NOT NULL,
    user_id int  NOT NULL,
    CONSTRAINT connection_history_pk PRIMARY KEY (id)
);



-- Table: contact
CREATE TABLE contact (
    id int  NOT NULL,
    date_of_create date  NOT NULL,
    name varchar(255)  NOT NULL,
    company_id int  NOT NULL,
    owner_id int  NOT NULL,
    position_id int  NOT NULL,
    CONSTRAINT contact_pk PRIMARY KEY (id)
);



-- Table: contact_communication
CREATE TABLE contact_communication (
    id int  NOT NULL,
    value varchar(255)  NOT NULL,
    contact_id int  NOT NULL,
    communication_form_id int  NOT NULL,
    CONSTRAINT contact_communication_pk PRIMARY KEY (id)
);



-- Table: currency
CREATE TABLE currency (
    id int  NOT NULL,
    code varchar(50)  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT currency_pk PRIMARY KEY (id)
);



-- Table: currency_exchange_rate
CREATE TABLE currency_exchange_rate (
    date date  NOT NULL,
    currency_id int  NOT NULL,
    exchange_currency_id int  NOT NULL,
    rate decimal(12,6)  NOT NULL,
    multiplicity int  NOT NULL,
    CONSTRAINT currency_exchange_rate_pk PRIMARY KEY (date,currency_id,exchange_currency_id)
);



-- Table: custom_field
CREATE TABLE custom_field (
    id int  NOT NULL,
    table_name varchar(50)  NOT NULL,
    name varchar(100)  NOT NULL,
    is_not_null boolean  NOT NULL,
    CONSTRAINT custom_field_pk PRIMARY KEY (id)
);



-- Table: custom_field_type
CREATE TABLE custom_field_type (
    custom_field_id int  NOT NULL,
    name varchar(255)  NOT NULL,
    smpl_type text  NOT NULL,
    ref_type varchar(50)  NOT NULL,
    CONSTRAINT custom_field_type_pk PRIMARY KEY (custom_field_id)
);



-- Table: custom_field_value
CREATE TABLE custom_field_value (
    custom_field_id int  NOT NULL,
    record_id int  NOT NULL,
    value varchar(255)  NOT NULL,
    CONSTRAINT custom_field_value_pk PRIMARY KEY (custom_field_id,record_id)
);



-- Table: deal
CREATE TABLE deal (
    id int  NOT NULL,
    date_of_create varchar(255)  NOT NULL,
    name varchar(255)  NOT NULL,
    budget decimal(20,2)  NOT NULL,
    owner_id int  NOT NULL,
    deal_type_id int  NOT NULL,
    deal_status_id int  NOT NULL,
    currency_id int  NOT NULL,
    CONSTRAINT deal_pk PRIMARY KEY (id)
);



-- Table: deal_contact
CREATE TABLE deal_contact (
    id int  NOT NULL,
    is_main boolean  NOT NULL,
    contact_id int  NOT NULL,
    deal_id int  NOT NULL,
    CONSTRAINT deal_contact_pk PRIMARY KEY (id)
);



-- Table: deal_status
CREATE TABLE deal_status (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    is_finish boolean  NOT NULL,
    CONSTRAINT deal_status_pk PRIMARY KEY (id)
);



-- Table: deal_type
CREATE TABLE deal_type (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT deal_type_pk PRIMARY KEY (id)
);



-- Table: file
CREATE TABLE file (
    id int  NOT NULL,
    date_of_create date  NOT NULL,
    record_id int  NOT NULL,
    data bytea  NULL,
    link varchar(255)  NULL,
    user_id int  NOT NULL,
    table_name varchar(50)  NOT NULL,
    CONSTRAINT file_pk PRIMARY KEY (id)
);



-- Table: option
CREATE TABLE option (
    id int  NOT NULL,
    currency_id int  NOT NULL,
    time_zone_id int  NOT NULL,
    CONSTRAINT option_pk PRIMARY KEY (id)
);



-- Table: permition
CREATE TABLE permition (
    can_read boolean  NOT NULL,
    can_write boolean  NOT NULL,
    can_delete boolean  NOT NULL,
    table_name varchar(50)  NOT NULL,
    role_id int  NOT NULL,
    CONSTRAINT permition_pk PRIMARY KEY (table_name,role_id)
);



-- Table: position
CREATE TABLE position (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT position_pk PRIMARY KEY (id)
);



-- Table: role
CREATE TABLE role (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    role_type_id int  NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);



-- Table: role_type
CREATE TABLE role_type (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT role_type_pk PRIMARY KEY (id)
);



-- Table: "table"
CREATE TABLE "table" (
    name varchar(50)  NOT NULL,
    CONSTRAINT table_pk PRIMARY KEY (name)
);



-- Table: tag
CREATE TABLE tag (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    record_id int  NOT NULL,
    table_name varchar(50)  NOT NULL,
    CONSTRAINT tag_pk PRIMARY KEY (id)
);



-- Table: task
CREATE TABLE task (
    id int  NOT NULL,
    date_of_create date  NOT NULL,
    finish_date date  NOT NULL,
    subject varchar(255)  NOT NULL,
    note text  NULL,
    company_id int  NULL,
    deal_id int  NOT NULL,
    contact_id int  NULL,
    owner_id int  NOT NULL,
    task_type_id int  NOT NULL,
    task_status_id int  NOT NULL,
    CONSTRAINT task_pk PRIMARY KEY (id)
);



-- Table: task_status
CREATE TABLE task_status (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT task_status_pk PRIMARY KEY (id)
);



-- Table: task_type
CREATE TABLE task_type (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    CONSTRAINT task_type_pk PRIMARY KEY (id)
);



-- Table: time_zone
CREATE TABLE time_zone (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    time_elation int  NOT NULL,
    CONSTRAINT time_zone_pk PRIMARY KEY (id)
);



-- Table: "user"
CREATE TABLE "user" (
    id int  NOT NULL,
    name varchar(255)  NOT NULL,
    login varchar(255)  NOT NULL,
    password varchar(255)  NOT NULL,
    email varchar(255)  NOT NULL,
    white_list_ip varchar(255)  NOT NULL,
    role_id int  NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);







-- foreign keys
-- Reference:  Attachments_Tables (table: file)


ALTER TABLE file ADD CONSTRAINT Attachments_Tables 
    FOREIGN KEY (table_name)
    REFERENCES "table" (name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Attachments_User (table: file)


ALTER TABLE file ADD CONSTRAINT Attachments_User 
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Comments_Tables (table: comment)


ALTER TABLE comment ADD CONSTRAINT Comments_Tables 
    FOREIGN KEY (table_name)
    REFERENCES "table" (name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Comments_User (table: comment)


ALTER TABLE comment ADD CONSTRAINT Comments_User 
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CommunicationForm_CommunicationType (table: communication_form)


ALTER TABLE communication_form ADD CONSTRAINT CommunicationForm_CommunicationType 
    FOREIGN KEY (communication_type_id)
    REFERENCES communication_type (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CompanyCommunication_CommunicationType (table: company_communication)


ALTER TABLE company_communication ADD CONSTRAINT CompanyCommunication_CommunicationType 
    FOREIGN KEY (communication_form_id)
    REFERENCES communication_form (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CompanyCommunication_Company (table: company_communication)


ALTER TABLE company_communication ADD CONSTRAINT CompanyCommunication_Company 
    FOREIGN KEY (company_id)
    REFERENCES company (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Company_User (table: company)


ALTER TABLE company ADD CONSTRAINT Company_User 
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  ConnectHistory_User (table: connection_history)


ALTER TABLE connection_history ADD CONSTRAINT ConnectHistory_User 
    FOREIGN KEY (user_id)
    REFERENCES "user" (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  ContactCommunication_CommunicationType (table: contact_communication)


ALTER TABLE contact_communication ADD CONSTRAINT ContactCommunication_CommunicationType 
    FOREIGN KEY (communication_form_id)
    REFERENCES communication_form (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  ContactCommunication_Contact (table: contact_communication)


ALTER TABLE contact_communication ADD CONSTRAINT ContactCommunication_Contact 
    FOREIGN KEY (contact_id)
    REFERENCES contact (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Contact_Company (table: contact)


ALTER TABLE contact ADD CONSTRAINT Contact_Company 
    FOREIGN KEY (company_id)
    REFERENCES company (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Contact_Position (table: contact)


ALTER TABLE contact ADD CONSTRAINT Contact_Position 
    FOREIGN KEY (position_id)
    REFERENCES position (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Contact_User (table: contact)


ALTER TABLE contact ADD CONSTRAINT Contact_User 
    FOREIGN KEY (owner_id)
    REFERENCES "user" (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CurrencyExchangeRate_Currency (table: currency_exchange_rate)


ALTER TABLE currency_exchange_rate ADD CONSTRAINT CurrencyExchangeRate_Currency 
    FOREIGN KEY (currency_id)
    REFERENCES currency (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFieldsType_CustomFields (table: custom_field_type)


ALTER TABLE custom_field_type ADD CONSTRAINT CustomFieldsType_CustomFields 
    FOREIGN KEY (custom_field_id)
    REFERENCES custom_field (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFieldsType_Tables (table: custom_field_type)


ALTER TABLE custom_field_type ADD CONSTRAINT CustomFieldsType_Tables 
    FOREIGN KEY (ref_type)
    REFERENCES "table" (name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFieldsValue_CustomFields (table: custom_field_value)


ALTER TABLE custom_field_value ADD CONSTRAINT CustomFieldsValue_CustomFields 
    FOREIGN KEY (custom_field_id)
    REFERENCES custom_field (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFields_Tables (table: custom_field)


ALTER TABLE custom_field ADD CONSTRAINT CustomFields_Tables 
    FOREIGN KEY (table_name)
    REFERENCES "table" (name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  DealContact_Contact (table: deal_contact)


ALTER TABLE deal_contact ADD CONSTRAINT DealContact_Contact 
    FOREIGN KEY (contact_id)
    REFERENCES contact (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  DealContact_Deal (table: deal_contact)


ALTER TABLE deal_contact ADD CONSTRAINT DealContact_Deal 
    FOREIGN KEY (deal_id)
    REFERENCES deal (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_Currency (table: deal)


ALTER TABLE deal ADD CONSTRAINT Deal_Currency 
    FOREIGN KEY (currency_id)
    REFERENCES currency (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_DealStatus (table: deal)


ALTER TABLE deal ADD CONSTRAINT Deal_DealStatus 
    FOREIGN KEY (deal_status_id)
    REFERENCES deal_status (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_DealType (table: deal)


ALTER TABLE deal ADD CONSTRAINT Deal_DealType 
    FOREIGN KEY (deal_type_id)
    REFERENCES deal_type (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_User (table: deal)


ALTER TABLE deal ADD CONSTRAINT Deal_User 
    FOREIGN KEY (owner_id)
    REFERENCES "user" (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Options_Currency (table: option)


ALTER TABLE option ADD CONSTRAINT Options_Currency 
    FOREIGN KEY (currency_id)
    REFERENCES currency (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Options_TimeZone (table: option)


ALTER TABLE option ADD CONSTRAINT Options_TimeZone 
    FOREIGN KEY (time_zone_id)
    REFERENCES time_zone (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Role_RoleType (table: role)


ALTER TABLE role ADD CONSTRAINT Role_RoleType 
    FOREIGN KEY (role_type_id)
    REFERENCES role_type (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Tags_Tables (table: tag)


ALTER TABLE tag ADD CONSTRAINT Tags_Tables 
    FOREIGN KEY (table_name)
    REFERENCES "table" (name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_Company (table: task)


ALTER TABLE task ADD CONSTRAINT Task_Company 
    FOREIGN KEY (company_id)
    REFERENCES company (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_Contact (table: task)


ALTER TABLE task ADD CONSTRAINT Task_Contact 
    FOREIGN KEY (contact_id)
    REFERENCES contact (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_Deal (table: task)


ALTER TABLE task ADD CONSTRAINT Task_Deal 
    FOREIGN KEY (deal_id)
    REFERENCES deal (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_TaskStatus (table: task)


ALTER TABLE task ADD CONSTRAINT Task_TaskStatus 
    FOREIGN KEY (task_status_id)
    REFERENCES task_status (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_TaskType (table: task)


ALTER TABLE task ADD CONSTRAINT Task_TaskType 
    FOREIGN KEY (task_type_id)
    REFERENCES task_type (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_User (table: task)


ALTER TABLE task ADD CONSTRAINT Task_User 
    FOREIGN KEY (owner_id)
    REFERENCES "user" (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  UserPermition_Role (table: permition)


ALTER TABLE permition ADD CONSTRAINT UserPermition_Role 
    FOREIGN KEY (role_id)
    REFERENCES role (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  UserPermition_Tables (table: permition)


ALTER TABLE permition ADD CONSTRAINT UserPermition_Tables 
    FOREIGN KEY (table_name)
    REFERENCES "table" (name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Users_Roles (table: "user")


ALTER TABLE "user" ADD CONSTRAINT Users_Roles 
    FOREIGN KEY (role_id)
    REFERENCES role (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;






-- End of file.

