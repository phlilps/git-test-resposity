

**@Author: Dong Weiming; mailbox 1219914605@qq.com **

#Supermarket order management system

####Introduction

Introduce modern office software into supermarket management to realize the control and transmission of huge commodities in supermarkets, so as to facilitate the management and decision-making of the sales industry and relieve the worries of supermarkets and supermarket managers. A good supermarket sales management system should be able to help the sales department improve work efficiency, help the supermarket staff use the computer, very convenient to manage, input, output, search and other relevant operations on the relevant data of the supermarket, so that the chaotic supermarket data can be specific, intuitive and reasonable.

####Software architecture

The MySQL + bootstrap + HTML + CSS + Javascript + SSM (Spring + springmvc + mybatis) framework set is integrated by spring and mybatis (spring MVC is part of spring). It is often used as a framework for web projects with simple data sources.

####System development process

The main function of the system is to realize the supermarket order management function, so as to provide order details and contact information for supermarkets, chain stores and other principals. The main functions of the system include the following five aspects, as shown in Figure 3-1

! [enter picture description]（ https://images.gitee.com/uploads/images/2021/1118/151133_f90219e1_8746031.jpeg "System development process. JPG")

Figure 3-1 system development flow chart

####User login process

In order to ensure the security of supermarket order management, we must first manage the users of supermarket order management. The first step is to log in to the system. As shown in Figure 3-2.

! [login flowchart]（ https://images.gitee.com/uploads/images/2021/1118/151251_31b6dba6_8746031.png "Login flowchart. PNG")

Figure 3-2 login flow chart

####User system operation process

If the user can log in successfully, a user interface will be displayed first, and the user will enter the main function interface of the system. The user can add, delete, modify and view various information in the account. The operation flow is shown in Figure 3-3.

! [user operation flow chart]（ https://images.gitee.com/uploads/images/2021/1118/151541_0dd23fcc_8746031.jpeg "User operation flowchart. JPG")

Figure 3-3 user operation flow chart

####Supply information process

Click supplier on the left to enter the supplier management function interface of the system. You can add, delete, modify and view various information in the supplier. The operation process is shown in 3-4.

! [supplier information flow chart]（ https://images.gitee.com/uploads/images/2021/1118/151704_92bea7e1_8746031.jpeg "Supplier information flow chart. JPG")

Figure 3-4 supplier information flow chart

####Order information process

Click supplier on the left to enter the supplier management function interface of the system. You can add, delete, modify and view various information in the order. The information process is shown in Figure 3-5.

! [order information flow chart]（ https://images.gitee.com/uploads/images/2021/1118/152224_99df7e19_8746031.jpeg "Order information flowchart. JPG")

Figure 3-5 order information flow chart

system design

####System overview

The development language used by the system is Java. Java has the characteristics of simplicity, object-oriented, distributed, robustness, security, platform independence and portability, multithreading and so on. Java can write desktop applications, web applications, distributed system applications, etc. It is precisely because the Java language has so many excellent features that we chose it as the supermarket order management system to make the whole development and debugging process more efficient.

The working principle of the system is shown in Figure 4-1:

! [schematic diagram of system operation]（ https://images.gitee.com/uploads/images/2021/1118/152337_112080f5_8746031.jpeg "System schematic diagram. JPG")

Figure 4-1 system working principle diagram

####System structure design

The system architecture diagram is determined in the project design stage and is the product of the project design stage. The overall architecture design of the system determines the quality of the whole system mode. Therefore, the overall architecture of the system is the basis of the system. The overall structure design of this personal supermarket management system is shown in Figure 4-2.

! [system structure diagram]（ https://images.gitee.com/uploads/images/2021/1118/152510_621ef43b_8746031.jpeg "System structure diagram. JPG")

Figure 4-2 system structure

####Database design

Database design is usually divided into six stages: 1 (requirement analysis: analyze user requirements, including data, function and performance requirements;

2. Conceptual structure design: mainly use E-R model for design, including drawing E-R diagram;

3 logical structure design: the transformation from E-R model to relational model is realized by converting E-R diagram into table;

4. Database physical design: it is mainly to select the appropriate storage structure and access path for the designed database;

5 database implementation: including programming, testing and trial operation; 6 database operation and maintenance: system operation and database daily maintenance.) the third stage, logic design, is mainly discussed.

Database design principles

1) Consistency principle: conduct unified and systematic analysis and design of data sources, coordinate various data sources, and ensure the consistency and effectiveness of data.

2) Integrity principle: database integrity refers to the correctness and compatibility of data. It is necessary to prevent legal users from adding non semantic data to the database when using the database. There should be an audit and constraint mechanism for the data input into the database.

3) Security principle: database security refers to the protection of data to prevent illegal users from using the database or legal users from illegally using the database, resulting in data leakage, change or destruction. There should be authentication and authorization mechanisms.

4) Principle of scalability and scalability: the design of database structure should fully consider the needs of development and transplantation, with good scalability, scalability and moderate redundancy. Standardization: the design of database should follow the standardization theory. Standardized database design can reduce exceptions and errors in database insertion, deletion, modification and other operations, and reduce data redundancy.

####Database entity

In the data model, entities correspond to "events" or "things" that can be distinguished from other objects in real life. For example, every item in the store.

The functional entity contact diagram of the system is shown in the figure below:

1. The entity diagram of commodity order information is shown in Figure 4-3:

! [entity diagram of commodity order information is shown in the figure]（ https://images.gitee.com/uploads/images/2021/1118/152537_a11c0b06_8746031.png "Entity diagram of commodity order information (as shown in figure. PNG")

Figure 4-3 entity diagram of commodity order information

2. The entity diagram of goods supplier information is shown in Figure 4-4:

! [the entity diagram of goods supplier information is shown in the figure]（ https://images.gitee.com/uploads/images/2021/1118/155215_31f6f18c_8746031.png "Entity diagram of goods supplier information (as shown in figure. PNG")

Figure 4-4 entity diagram of goods supplier information

3. The physical diagram of clerk information is shown in Figure 4-5:

! [the physical diagram of clerk information is shown in the figure]（ https://images.gitee.com/uploads/images/2021/1118/152622_4db4cef1_8746031.png "Employee information entity diagram (as shown in figure. PNG")

Figure 4-5 employee information entity diagram

4. The entity diagram of goods order receiving address information is shown in Figure 4-6:

! [entity diagram of goods order receiving address information is shown in the figure]（ https://images.gitee.com/uploads/images/2021/1118/152632_9d287bdc_8746031.png "Entity diagram of goods order receiving address information (as shown in figure. PNG")

Figure 4-6 entity diagram of goods order receiving address information

5. The role information entity diagram of the clerk is shown in Figure 4-7:

! [the role information entity diagram of the clerk is shown in the figure]（ https://images.gitee.com/uploads/images/2021/1118/152641_9481c405_8746031.png "The role information entity diagram of the clerk is shown in figure. PNG")

Figure 4-7 entity diagram of role information of clerk

####Database table design

The table information of the database is a part of the design. The following describes the details of each table in the database.

Table 4-1 information of goods order receiving address

! [information table of goods order receiving address]（ https://images.gitee.com/uploads/images/2021/1118/160456_64c6b5ea_8746031.png "Goods order receiving address information form. PNG")

Field name Field meaning Field type Field length key Can it be empty

id Serial number bigint twenty Primary key no

commodityCode Commodity code varchar twenty yes

commodityName Trade name varchar twenty yes

commodityDesc Product description varchar fifty yes

commodityUnit Commodity unit varchar ten yes

commodityNum Quantity of goods varchar twenty-two yes

totalPrice Total goods varchar twenty-two yes

providerId Paid or not (1: unpaid 2: paid) int ten yes

providerId Supplier ID int twenty no

Table 4-2 role information of clerk

! [clerk's role information table]（ https://images.gitee.com/uploads/images/2021/1118/160522_2f443644_8746031.png "Clerk's role information table. PNG")

Field name Field meaning Field type Field length Key code Can it be empty

id Serial number bigint twenty Primary key no

userName User name varchar fifteen yes

password User password varchar fifteen yes

gender Gender varchar ten yes

birthday date of birth varchar twenty yes

phoneNum mobile phone varchar fifteen yes

site address varchar thirty yes

userRole User role (from role table - role ID) int ten yes

Table 4-3 information of goods suppliers

! [goods supplier information sheet]（ https://images.gitee.com/uploads/images/2021/1118/160549_ce3c8553_8746031.png "Goods supplier information form. PNG")

Field name Field meaning Field type Field length Key code Can it be empty

id Serial number bigint twenty Primary key no

companyCode Supplier code varchar twenty no

companyName Supplier name varchar twenty no

companyDesc Detailed description of supplier varchar fifty no

companyUser Supplier Contact varchar twenty no

comPhoneNum contact number varchar twenty no

companySite address varchar fifty no

Table 4-4 information of goods order receiving address

! [information table of goods order receiving address]（ https://images.gitee.com/uploads/images/2021/1118/164201_bd27179c_8746031.png "Goods order receiving address information form. PNG")

Field name Field meaning Field type Field length Key code Can it be empty

id Serial number int twenty Primary key no

contact Contact name varchar fifteen no

siteDesc Receiving address details varchar fifty Foreign key no

postCode Zip code varchar fifteen no

telPhoneNum Contact telephone varchar twenty no

userId User ID bigint twenty no

Table 4-5 private chat information 


Table 4-5 private chat information

! [private chat information form]（ https://images.gitee.com/uploads/images/2021/1118/164220_76b1f65c_8746031.png "Private chat information form. PNG")

Field name Field meaning Field type Field length Key code Can it be empty

id Serial number bigint eleven Primary key no

roleCode Role code varchar fifteen no

roleName Role name varchar fifteen no

System interface implementation

####Login

When the user enters the personal account password to try to log in to the system, the system will compare the information entered by the user with the information stored in the database. If the account and password entered by the user are incorrect, the system will pop up that the information entered by the user is incorrect. At the same time, the user will be asked to re-enter the account and password until the entered account and password match the information stored in the database. The effect diagram of login page is shown in Figure 5-1:

! [login]（ https://images.gitee.com/uploads/images/2021/1118/152821_80f7daed_8746031.png "Login. PNG")

Figure 5-1 login interface

####User management

On the user management page, query the user by entering the user name and identity. When you don't remember the specific name of the user name, just enter one word of the user name, and all users with this word will be retrieved to facilitate user query and management. Click the link on the right to add and modify users, which will connect to relevant web pages to add and modify user information. Click View and modify in the operation to modify, delete and query accordingly. The program effectiveness diagram is shown in Figure 5-2 below:

! [user management]（ https://images.gitee.com/uploads/images/2021/1118/152836_6be426ac_8746031.png "User management (. PNG")

! [user management]（ https://images.gitee.com/uploads/images/2021/1118/152842_148369a0_8746031.png "User management (. PNG")

Figure 5-2 user account management interface

####Role management

On the role management page, query the role by entering the role name and identity. When you don't remember to use the specific name of the role, only enter one word of the role name, and all roles with this word will be retrieved to facilitate user query and management. Click the link on the right to modify the role, which will connect to the relevant web page to modify the role information. Click View and modify in the operation to modify, delete and query accordingly. The effect diagram is shown in Figure 5-3:

! [role management]（ https://images.gitee.com/uploads/images/2021/1118/152904_4a3ed92d_8746031.png "Role management. PNG")

! [role management]（ https://images.gitee.com/uploads/images/2021/1118/152909_7da327ba_8746031.png "Role management. PNG")

Figure 5-3 role management interface

####Supplier management

On the supplier management page, you can query suppliers by entering their names and identities. When you don't remember to use the supplier's specific name, just enter one word of the supplier's name, and all suppliers with this word will be retrieved to facilitate user query and management. Click the link on the right to modify the supplier, which will connect to the relevant web page to modify the supplier information. Click View and modify in the operation to modify, delete and query accordingly. The effect diagram is shown in Figure 5-4:

! [Supplier Management]（ https://images.gitee.com/uploads/images/2021/1118/152915_042f7041_8746031.png "Supplier management. PNG")

! [Supplier Management]（ https://images.gitee.com/uploads/images/2021/1118/152926_6a174917_8746031.png "Supplier management. PNG")

Figure 5-4 supplier management interface

####Commodity management

On the commodity management page, query the commodity by entering the commodity name and identity. When you don't remember to use the specific name of the commodity, only one word of the commodity name will be entered, and all commodities with this word will be retrieved to facilitate user query and management. Click the link on the right to modify the product, which will connect to the relevant web page to modify the product information. Click View and modify in the operation to modify, delete and query accordingly. The effect diagram is shown in Figure 5-5:

! [commodity management]（ https://images.gitee.com/uploads/images/2021/1118/152940_b93f72c1_8746031.png "Commodity management. PNG")

! [commodity management]（ https://images.gitee.com/uploads/images/2021/1118/152945_6ea9e108_8746031.png "Commodity management. PNG")

Figure 5-5 commodity management interface

####Order management

On the order management page, query the order by entering the order name and identity. When you don't remember to use the specific name of the order, only enter one word of the order name, and all orders with this word will be retrieved to facilitate user query and management. Click the link on the right to modify the order, which will connect to the relevant web page to modify the order information. Click View and modify in the operation to modify, delete and query accordingly. As shown in Figure 5-6 below:

! [order management]（ https://images.gitee.com/uploads/images/2021/1118/152951_87154c4f_8746031.png "Order management. PNG")

! [order management]（ https://images.gitee.com/uploads/images/2021/1118/152956_14262c38_8746031.png "Order management. PNG")

Figure 5-6 comment management interface

####User exit

Exit and other operations based on user information. As shown in Figure 5-7: 
Exit and other operations based on user information. As shown in Figure 5-7:

! [user exit]（ https://images.gitee.com/uploads/images/2021/1118/153001_1107fa24_8746031.png "User exit. PNG")

Figure 5-7 exit interface