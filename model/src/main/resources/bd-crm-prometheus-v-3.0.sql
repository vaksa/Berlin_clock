-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2015-11-24 09:19:06.153




-- tables
-- Table: Attachments
CREATE TABLE Attachments (
    ID int  NOT NULL,
    DateOfCreate date  NOT NULL,
    Record_ID int  NOT NULL,
    Data bytea  NULL,
    Link varchar(255)  NULL,
    User_ID int  NOT NULL,
    Tables_Name varchar(50)  NOT NULL,
    CONSTRAINT Attachments_pk PRIMARY KEY (ID)
);



-- Table: Comments
CREATE TABLE Comments (
    ID int  NOT NULL,
    DateOfCreate date  NOT NULL,
    Record_ID int  NOT NULL,
    Comment text  NOT NULL,
    User_ID int  NOT NULL,
    Tables_Name varchar(50)  NOT NULL,
    CONSTRAINT Comments_pk PRIMARY KEY (ID)
);



-- Table: CommunicationForms
CREATE TABLE CommunicationForms (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    CommunicationType_ID int  NOT NULL,
    CONSTRAINT CommunicationForms_pk PRIMARY KEY (ID)
);



-- Table: CommunicationTypes
CREATE TABLE CommunicationTypes (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    CONSTRAINT CommunicationTypes_pk PRIMARY KEY (ID)
);



-- Table: Companies
CREATE TABLE Companies (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    User_ID int  NOT NULL,
    CONSTRAINT Companies_pk PRIMARY KEY (ID)
);



-- Table: CompanyCommunications
CREATE TABLE CompanyCommunications (
    ID int  NOT NULL,
    Value varchar(255)  NOT NULL,
    Company_ID int  NOT NULL,
    CommunicationForm_ID int  NOT NULL,
    CONSTRAINT CompanyCommunications_pk PRIMARY KEY (ID)
);



-- Table: ConnectionsHistory
CREATE TABLE ConnectionsHistory (
    ID int  NOT NULL,
    Date date  NOT NULL,
    IP varchar(20)  NOT NULL,
    Browser varchar(20)  NOT NULL,
    User_ID int  NOT NULL,
    CONSTRAINT ConnectionsHistory_pk PRIMARY KEY (ID)
);



-- Table: ContactCommunications
CREATE TABLE ContactCommunications (
    ID int  NOT NULL,
    Value varchar(255)  NOT NULL,
    Contact_ID int  NOT NULL,
    CommunicationForm_ID int  NOT NULL,
    CONSTRAINT ContactCommunications_pk PRIMARY KEY (ID)
);



-- Table: Contacts
CREATE TABLE Contacts (
    ID int  NOT NULL,
    DateOfCreate date  NOT NULL,
    LastName varchar(255)  NOT NULL,
    FirstName varchar(255)  NOT NULL,
    Company_ID int  NOT NULL,
    Owner_ID int  NOT NULL,
    Position_ID int  NOT NULL,
    CONSTRAINT Contacts_pk PRIMARY KEY (ID)
);



-- Table: Currencies
CREATE TABLE Currencies (
    ID int  NOT NULL,
    Code varchar(50)  NOT NULL,
    Name varchar(255)  NOT NULL,
    CONSTRAINT Currencies_pk PRIMARY KEY (ID)
);



-- Table: CurrencyExchangeRate
CREATE TABLE CurrencyExchangeRate (
    Date date  NOT NULL,
    Currency_ID int  NOT NULL,
    ExchangeCurrency_ID int  NOT NULL,
    Rate decimal(12,6)  NOT NULL,
    Multiplicity int  NOT NULL,
    CONSTRAINT CurrencyExchangeRate_pk PRIMARY KEY (Date,Currency_ID,ExchangeCurrency_ID)
);



-- Table: CustomFields
CREATE TABLE CustomFields (
    ID int  NOT NULL,
    Tables_Name varchar(50)  NOT NULL,
    Name varchar(100)  NOT NULL,
    IsNotNull boolean  NOT NULL,
    CONSTRAINT CustomFields_pk PRIMARY KEY (ID)
);



-- Table: CustomFieldsType
CREATE TABLE CustomFieldsType (
    CustomFields_ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    smplType text  NOT NULL,
    refType_TableName varchar(50)  NOT NULL,
    CONSTRAINT CustomFieldsType_pk PRIMARY KEY (CustomFields_ID)
);



-- Table: CustomFieldsValue
CREATE TABLE CustomFieldsValue (
    CustomFields_ID int  NOT NULL,
    Record_ID int  NOT NULL,
    Value varchar(255)  NOT NULL,
    CONSTRAINT CustomFieldsValue_pk PRIMARY KEY (CustomFields_ID,Record_ID)
);



-- Table: DealContacts
CREATE TABLE DealContacts (
    ID int  NOT NULL,
    isMain boolean  NOT NULL,
    Contact_ID int  NOT NULL,
    Deal_ID int  NOT NULL,
    CONSTRAINT DealContacts_pk PRIMARY KEY (ID)
);



-- Table: DealStatus
CREATE TABLE DealStatus (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    isFinish boolean  NOT NULL,
    CONSTRAINT DealStatus_pk PRIMARY KEY (ID)
);



-- Table: DealTypes
CREATE TABLE DealTypes (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    CONSTRAINT DealTypes_pk PRIMARY KEY (ID)
);



-- Table: Deals
CREATE TABLE Deals (
    ID int  NOT NULL,
    DateOfCreate varchar(255)  NOT NULL,
    Name varchar(255)  NOT NULL,
    Budget decimal(20,2)  NOT NULL,
    Owner_ID int  NOT NULL,
    DealType_ID int  NOT NULL,
    DealStatus_ID int  NOT NULL,
    Currency_ID int  NOT NULL,
    CONSTRAINT Deals_pk PRIMARY KEY (ID)
);



-- Table: Options
CREATE TABLE Options (
    ID int  NOT NULL,
    Currency_ID int  NOT NULL,
    TimeZone_ID int  NOT NULL,
    CONSTRAINT Options_pk PRIMARY KEY (ID)
);



-- Table: Permitions
CREATE TABLE Permitions (
    CanRead boolean  NOT NULL,
    CanWrite boolean  NOT NULL,
    CanDelete boolean  NOT NULL,
    Tables_Name varchar(50)  NOT NULL,
    Role_ID int  NOT NULL,
    CONSTRAINT Permitions_pk PRIMARY KEY (Tables_Name)
);



-- Table: Positions
CREATE TABLE Positions (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    CONSTRAINT Positions_pk PRIMARY KEY (ID)
);



-- Table: RoleTypes
CREATE TABLE RoleTypes (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    CONSTRAINT RoleTypes_pk PRIMARY KEY (ID)
);



-- Table: Roles
CREATE TABLE Roles (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    RoleType_ID int  NOT NULL,
    CONSTRAINT Roles_pk PRIMARY KEY (ID)
);



-- Table: Tables
CREATE TABLE Tables (
    Name varchar(50)  NOT NULL,
    CONSTRAINT Tables_pk PRIMARY KEY (Name)
);



-- Table: Tags
CREATE TABLE Tags (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    Record_ID int  NOT NULL,
    Tables_Name varchar(50)  NOT NULL,
    CONSTRAINT Tags_pk PRIMARY KEY (ID)
);



-- Table: TaskStatus
CREATE TABLE TaskStatus (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    CONSTRAINT TaskStatus_pk PRIMARY KEY (ID)
);



-- Table: TaskTypes
CREATE TABLE TaskTypes (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    CONSTRAINT TaskTypes_pk PRIMARY KEY (ID)
);



-- Table: Tasks
CREATE TABLE Tasks (
    ID int  NOT NULL,
    DateOfCreate date  NOT NULL,
    FinishDate date  NOT NULL,
    Subject varchar(255)  NOT NULL,
    Note text  NULL,
    Company_ID int  NULL,
    Deal_ID int  NOT NULL,
    Contact_ID int  NULL,
    Owner_ID int  NOT NULL,
    TaskType_ID int  NOT NULL,
    TaskStatus_ID int  NOT NULL,
    CONSTRAINT Tasks_pk PRIMARY KEY (ID)
);



-- Table: TimeZone
CREATE TABLE TimeZone (
    ID int  NOT NULL,
    Name varchar(255)  NOT NULL,
    TimeElation int  NOT NULL,
    CONSTRAINT TimeZone_pk PRIMARY KEY (ID)
);



-- Table: Users
CREATE TABLE Users (
    ID int  NOT NULL,
    LastName varchar(255)  NOT NULL,
    FirstName varchar(255)  NOT NULL,
    Login varchar(255)  NOT NULL,
    Password varchar(255)  NOT NULL,
    Email varchar(255)  NOT NULL,
    WhiteListIP varchar(255)  NOT NULL,
    Roles_ID int  NOT NULL,
    CONSTRAINT Users_pk PRIMARY KEY (ID)
);







-- foreign keys
-- Reference:  Attachments_Tables (table: Attachments)


ALTER TABLE Attachments ADD CONSTRAINT Attachments_Tables 
    FOREIGN KEY (Tables_Name)
    REFERENCES Tables (Name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Attachments_User (table: Attachments)


ALTER TABLE Attachments ADD CONSTRAINT Attachments_User 
    FOREIGN KEY (User_ID)
    REFERENCES Users (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Comments_Tables (table: Comments)


ALTER TABLE Comments ADD CONSTRAINT Comments_Tables 
    FOREIGN KEY (Tables_Name)
    REFERENCES Tables (Name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Comments_User (table: Comments)


ALTER TABLE Comments ADD CONSTRAINT Comments_User 
    FOREIGN KEY (User_ID)
    REFERENCES Users (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CommunicationForm_CommunicationType (table: CommunicationForms)


ALTER TABLE CommunicationForms ADD CONSTRAINT CommunicationForm_CommunicationType 
    FOREIGN KEY (CommunicationType_ID)
    REFERENCES CommunicationTypes (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CompanyCommunication_CommunicationType (table: CompanyCommunications)


ALTER TABLE CompanyCommunications ADD CONSTRAINT CompanyCommunication_CommunicationType 
    FOREIGN KEY (CommunicationForm_ID)
    REFERENCES CommunicationForms (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CompanyCommunication_Company (table: CompanyCommunications)


ALTER TABLE CompanyCommunications ADD CONSTRAINT CompanyCommunication_Company 
    FOREIGN KEY (Company_ID)
    REFERENCES Companies (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Company_User (table: Companies)


ALTER TABLE Companies ADD CONSTRAINT Company_User 
    FOREIGN KEY (User_ID)
    REFERENCES Users (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  ConnectHistory_User (table: ConnectionsHistory)


ALTER TABLE ConnectionsHistory ADD CONSTRAINT ConnectHistory_User 
    FOREIGN KEY (User_ID)
    REFERENCES Users (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  ContactCommunication_CommunicationType (table: ContactCommunications)


ALTER TABLE ContactCommunications ADD CONSTRAINT ContactCommunication_CommunicationType 
    FOREIGN KEY (CommunicationForm_ID)
    REFERENCES CommunicationForms (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  ContactCommunication_Contact (table: ContactCommunications)


ALTER TABLE ContactCommunications ADD CONSTRAINT ContactCommunication_Contact 
    FOREIGN KEY (Contact_ID)
    REFERENCES Contacts (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Contact_Company (table: Contacts)


ALTER TABLE Contacts ADD CONSTRAINT Contact_Company 
    FOREIGN KEY (Company_ID)
    REFERENCES Companies (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Contact_Position (table: Contacts)


ALTER TABLE Contacts ADD CONSTRAINT Contact_Position 
    FOREIGN KEY (Position_ID)
    REFERENCES Positions (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Contact_User (table: Contacts)


ALTER TABLE Contacts ADD CONSTRAINT Contact_User 
    FOREIGN KEY (Owner_ID)
    REFERENCES Users (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CurrencyExchangeRate_Currency (table: CurrencyExchangeRate)


ALTER TABLE CurrencyExchangeRate ADD CONSTRAINT CurrencyExchangeRate_Currency 
    FOREIGN KEY (Currency_ID)
    REFERENCES Currencies (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFieldsType_CustomFields (table: CustomFieldsType)


ALTER TABLE CustomFieldsType ADD CONSTRAINT CustomFieldsType_CustomFields 
    FOREIGN KEY (CustomFields_ID)
    REFERENCES CustomFields (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFieldsType_Tables (table: CustomFieldsType)


ALTER TABLE CustomFieldsType ADD CONSTRAINT CustomFieldsType_Tables 
    FOREIGN KEY (refType_TableName)
    REFERENCES Tables (Name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFieldsValue_CustomFields (table: CustomFieldsValue)


ALTER TABLE CustomFieldsValue ADD CONSTRAINT CustomFieldsValue_CustomFields 
    FOREIGN KEY (CustomFields_ID)
    REFERENCES CustomFields (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  CustomFields_Tables (table: CustomFields)


ALTER TABLE CustomFields ADD CONSTRAINT CustomFields_Tables 
    FOREIGN KEY (Tables_Name)
    REFERENCES Tables (Name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  DealContact_Contact (table: DealContacts)


ALTER TABLE DealContacts ADD CONSTRAINT DealContact_Contact 
    FOREIGN KEY (Contact_ID)
    REFERENCES Contacts (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  DealContact_Deal (table: DealContacts)


ALTER TABLE DealContacts ADD CONSTRAINT DealContact_Deal 
    FOREIGN KEY (Deal_ID)
    REFERENCES Deals (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_Currency (table: Deals)


ALTER TABLE Deals ADD CONSTRAINT Deal_Currency 
    FOREIGN KEY (Currency_ID)
    REFERENCES Currencies (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_DealStatus (table: Deals)


ALTER TABLE Deals ADD CONSTRAINT Deal_DealStatus 
    FOREIGN KEY (DealStatus_ID)
    REFERENCES DealStatus (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_DealType (table: Deals)


ALTER TABLE Deals ADD CONSTRAINT Deal_DealType 
    FOREIGN KEY (DealType_ID)
    REFERENCES DealTypes (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Deal_User (table: Deals)


ALTER TABLE Deals ADD CONSTRAINT Deal_User 
    FOREIGN KEY (Owner_ID)
    REFERENCES Users (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Options_Currency (table: Options)


ALTER TABLE Options ADD CONSTRAINT Options_Currency 
    FOREIGN KEY (Currency_ID)
    REFERENCES Currencies (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Options_TimeZone (table: Options)


ALTER TABLE Options ADD CONSTRAINT Options_TimeZone 
    FOREIGN KEY (TimeZone_ID)
    REFERENCES TimeZone (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Role_RoleType (table: Roles)


ALTER TABLE Roles ADD CONSTRAINT Role_RoleType 
    FOREIGN KEY (RoleType_ID)
    REFERENCES RoleTypes (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Tags_Tables (table: Tags)


ALTER TABLE Tags ADD CONSTRAINT Tags_Tables 
    FOREIGN KEY (Tables_Name)
    REFERENCES Tables (Name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_Company (table: Tasks)


ALTER TABLE Tasks ADD CONSTRAINT Task_Company 
    FOREIGN KEY (Company_ID)
    REFERENCES Companies (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_Contact (table: Tasks)


ALTER TABLE Tasks ADD CONSTRAINT Task_Contact 
    FOREIGN KEY (Contact_ID)
    REFERENCES Contacts (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_Deal (table: Tasks)


ALTER TABLE Tasks ADD CONSTRAINT Task_Deal 
    FOREIGN KEY (Deal_ID)
    REFERENCES Deals (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_TaskStatus (table: Tasks)


ALTER TABLE Tasks ADD CONSTRAINT Task_TaskStatus 
    FOREIGN KEY (TaskStatus_ID)
    REFERENCES TaskStatus (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_TaskType (table: Tasks)


ALTER TABLE Tasks ADD CONSTRAINT Task_TaskType 
    FOREIGN KEY (TaskType_ID)
    REFERENCES TaskTypes (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Task_User (table: Tasks)


ALTER TABLE Tasks ADD CONSTRAINT Task_User 
    FOREIGN KEY (Owner_ID)
    REFERENCES Users (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  UserPermition_Role (table: Permitions)


ALTER TABLE Permitions ADD CONSTRAINT UserPermition_Role 
    FOREIGN KEY (Role_ID)
    REFERENCES Roles (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  UserPermition_Tables (table: Permitions)


ALTER TABLE Permitions ADD CONSTRAINT UserPermition_Tables 
    FOREIGN KEY (Tables_Name)
    REFERENCES Tables (Name)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;

-- Reference:  Users_Roles (table: Users)


ALTER TABLE Users ADD CONSTRAINT Users_Roles 
    FOREIGN KEY (Roles_ID)
    REFERENCES Roles (ID)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE 
;






-- End of file.

