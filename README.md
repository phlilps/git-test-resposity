# 超市订单管理系统

#### 介绍
在超市管理中引进现代化的办公软件，实现超市庞大商品的控制和传输，从而方便销售行业的管理和决策，为超市和超市管理人员解除后顾之忧。一款好的超市销售管理系统，应该是可以帮助销售部门提高工作效率，帮助超市工作人员利用计算机，极为方便的对超市的有关数据进行管理、输入、输出、查找等有关操作，使杂乱的超市数据能够具体化、直观化、合理化等。

#### 软件架构
mysql+Bootstrap+html+css+javascrip+SSM（Spring+SpringMVC+MyBatis）框架集由Spring、MyBatis两个开源框架整合而成（SpringMVC是Spring中的部分内容）。常作为数据源较简单的web项目的框架。



#### 系统开发流程	
本系统主要的功能是实现超市订单管理功能，以便为超市、连锁店提供以及其他负责人提供订单详情、联系方式等，系统的主要功能有以下五个方面如图3-1所示

  ![输入图片说明](https://images.gitee.com/uploads/images/2021/1118/151133_f90219e1_8746031.jpeg "系统开发流程.jpg")

图3-1系统开发流程图

#### 用户登录流程
为了保证超市订单管理的安全性，首先要对超市订单管理的用户进行管理，第一步先要登陆到系统中。如图3-2所示。

![登录流程图](https://images.gitee.com/uploads/images/2021/1118/151251_31b6dba6_8746031.png "登录流程图.png")

图3-2 登录流程图

#### 用户系统操作流程
如果用户能够成功登录，首先会先显示一个用户的界面，则用户会进入到系统的主要功能界面，用用户可以对账号内的各种信息进行添加、删除、修改以及查看等操作。操作流程如图3-3所示。
![用户操作流程图](https://images.gitee.com/uploads/images/2021/1118/151541_0dd23fcc_8746031.jpeg "用户操作流程图.jpg")

图3-3 用户操作流程图

#### 供应信息流程
在左边点击供应商，则用户会进入到系统的供应商管理功能界面，用用户可以对供应商内的各种信息进行添加、删除、修改以及查看等操作。操作流程此过程如3-4所示。

 ![供应商信息流程图](https://images.gitee.com/uploads/images/2021/1118/151704_92bea7e1_8746031.jpeg "供应商信息流程图.jpg")

图3-4 供应商信息流程图

#### 订单信息流程
在左边点击供应商，则用户会进入到系统的供应商管理功能界面，用用户可以对订单内的各种信息进行添加、删除、修改以及查看等操作。信息过程如图3-5所示。
![订单信息流程图](https://images.gitee.com/uploads/images/2021/1118/152224_99df7e19_8746031.jpeg "订单信息流程图.jpg")

图3-5 订单信息流程图



系统设计
#### 系统概述
系统使用的开发语言是Java。Java具有简单性、面向对象、分布式、健壮性、安全性、平台独立与可移植性、多线程等特点。Java可以编写桌面应用程序、Web应用程序、分布式系统应用程序等。正是因为Java语言拥有如此诸多的优秀特性，所以我们选择了它作为开发超市订单管理系统，使得整个开发、调试过程更加高效。


系统工作原理图4-1所示：
 
![系统工作原理图](https://images.gitee.com/uploads/images/2021/1118/152337_112080f5_8746031.jpeg "系统工作原理图.jpg")

图4-1 系统工作原理图
#### 系统结构设计
系统架构图，是在项目设计的阶段所确定的，是项目设计阶段产物。系统的总体架构设计的好坏，决定了整个系统模式的好坏。所以说，系统的总体架构是系统的基础。此个人超市管理系统，整体的结构设计如图4-2所示。

 
![系统结构图](https://images.gitee.com/uploads/images/2021/1118/152510_621ef43b_8746031.jpeg "系统结构图.jpg")

图4-2 系统结构图
#### 数据库设计
数据库设计通常分为6个阶段1（需求分析：分析用户的需求，包括数据、功能和性能需求；2概念结构设计：主要采用E-R模型进行设计，包括画E-R图；3逻辑结构设计：通过将E-R图转换成表，实现从E-R模型到关系模型的转换；4数据库物理设计：主要是为所设计的数据库选择合适的存储结构和存取路径；5数据库的实施：包括编程、测试和试运行；6数据库运行与维护：系统的运行与数据库的日常维护。）,主要讨论其中的第3个阶段,即逻辑设计。
4.3.1 数据库设计原则
1)一致性原则:对数据来源进行统一、系统的分析与设计，协调好各种数据源，保证数据的一致性和有效性。
2)完整性原则:数据库的完整性是指数据的正确性和相容性。要防止合法用户使用数据库时向数据库加入不合语义的数据。对输入到数据库中的数据要有审核和约束机制。
3)安全性原则:数据库的安全性是指保护数据，防止非法用户使用数据库或合法用户非法使用数据库造成数据泄露、更改或破坏。要有认证和授权机制。
4)可伸缩性与可扩展性原则:数据库结构的设计应充分考虑发展的需要、移植的需要，具有良好的扩展性、伸缩性和适度冗余。规范化:数据库的设计应遵循规范化理论。规范化的数据库设计，可以减少数据库插入、删除、修改等操作时的异常和错误，降低数据冗余度等。

#### 数据库实体
实体（Entity）在数据模型中，对应了现实生活中可区别于其他对象的“事件”或“事物”。例如说，商店里的每个商品。
本系统的功能实体联系图如下图所示：


1、商品订单信息实体图如图4-3所示：

![商品订单信息实体图如图](https://images.gitee.com/uploads/images/2021/1118/152537_a11c0b06_8746031.png "商品订单信息实体图如图.png")

图4-3商品订单信息实体图


2、货品供应商信息实体图如图4-4所示：

![货品供应商信息实体图如图](https://images.gitee.com/uploads/images/2021/1118/155215_31f6f18c_8746031.png "货品供应商信息实体图如图.png") 

图4-4货品供应商信息实体图


3、店员信息实体图如图4-5所示：

![店员信息实体图如图](https://images.gitee.com/uploads/images/2021/1118/152622_4db4cef1_8746031.png "店员信息实体图如图.png") 

图4-5店员信息实体图


4、商品订单收货地址信息实体图如图4-6所示：

![商品订单收货地址信息实体图如图](https://images.gitee.com/uploads/images/2021/1118/152632_9d287bdc_8746031.png "商品订单收货地址信息实体图如图.png")
 
图4-6商品订单收货地址信息实体图


5、店员的角色信息实体图如图4-7所示：

![店员的角色信息实体图如图](https://images.gitee.com/uploads/images/2021/1118/152641_9481c405_8746031.png "店员的角色信息实体图如图.png")
 
图4-7店员的角色信息实体图


#### 数据库表设计
数据库的表信息属于设计的一部分，下面介绍数据库中的各个表的详细信息。
表4-1商品订单收货地址信息表
字段名称	字段意义	字段类型	字段长度	键码	能否为空

id	序号	bigint	20	主键	否

commodityCode	商品编码	varchar	20		是

commodityName	商品名称	varchar	20		是

commodityDesc	商品描述	varchar	50		是

commodityUnit	商品单位	varchar	10		是

commodityNum	商品数量	varchar	22		是

totalPrice	商品总额	varchar	22		是

providerId	是否支付（1：未支付 2：已支付）	int	10		是

providerId	供应商ID	int	20		否



表4-2店员的角色信息表
字段名称	字段意义	字段类型	字段长度	键码	能否为空

id	序号	bigint	20	主键	否

userName	用户名称	varchar	15		是

password	用户密码	varchar	15		是

gender	性别	varchar	10		是

birthday	出生日期	varchar	20		是

phoneNum	手机	varchar	15		是

site	地址	varchar	30		是

userRole	用户角色（取自角色表-角色id	int	10		是


表4-3 货品供应商信息表
字段名称	字段意义	字段类型	字段长度	键码	能否为空

id	序号	bigint	20	主键	否

companyCode	供应商编码	varchar	20		否

companyName	供应商名称	varchar	20		否

companyDesc	供应商详细描述	varchar	50		否

companyUser	供应商联系人	varchar	20		否

comPhoneNum	联系电话	varchar	20		否

companySite	地址	varchar	50		否


表4-4 商品订单收货地址信息表

字段名称	字段意义	字段类型	字段长度	键码	能否为空

id	序号	int	20	主键	否

contact	联系人姓名	varchar	15		否

siteDesc	收货地址明细	varchar	50	外键	否

postCode	邮编	varchar	15		否

telPhoneNum	联系人电话	varchar	20		否

userId	用户ID	bigint	20		否


表4-5 私聊信息表
字段名称	字段意义	字段类型	字段长度	键码	能否为空

id	序号	bigint	11	主键	否

roleCode	角色编码	varchar	15		否

roleName	角色名称	varchar	15		否


 系统界面实现
####  登录
当用户输入个人账号密码尝试登录系统时，系统就会将用户输入的信息，与数据库所储存的信息对比。如果用户输入的账号、密码不正确，系统会弹出用户输入的信息有误，同时会让用户重新输入账号密码，直到输入的账号密码与数据库储存的信息相匹配，才会成功登陆。登录页面效果图，如图5-1所示：

![登录](https://images.gitee.com/uploads/images/2021/1118/152821_80f7daed_8746031.png "登录.png")

图5-1登录界面

####  用户管理
用户管理页面，通过输入用户名和身份查询用户。当不记得用户名的具体名字时，只输入用户名的其中一个字，会检索出所有带这个字的用户，方便用户查询管理。点击右边链接添加和修改用户，会连接到相关网页添加和修改用户信息。点击操作里的查看、修改等可以进行相应的改、删、查操作。程序成效图如下图5-2所示:

 
 ![用户管理](https://images.gitee.com/uploads/images/2021/1118/152836_6be426ac_8746031.png "用户管理.png")
![用户管理](https://images.gitee.com/uploads/images/2021/1118/152842_148369a0_8746031.png "用户管理.png")

图5-2 用户账号管理界面图

####  角色管理
角色管理页面，通过输入用角色名字和身份查询角色。当不记得用角色的具体名字时，只输入角色名字的其中一个字，会检索出所有带这个字的角色，方便用户查询管理。点击右边链接修改角色，会连接到相关网页修改角色信息。点击操作里的查看、修改等可以进行相应的改、删、查操作。效果图如图5-3所示：

 
 ![角色管理](https://images.gitee.com/uploads/images/2021/1118/152904_4a3ed92d_8746031.png "角色管理.png")
![角色管理](https://images.gitee.com/uploads/images/2021/1118/152909_7da327ba_8746031.png "角色管理.png")

图5-3角色管理界面

####  供应商管理
供应商管理页面，通过输入用供应商名字和身份查询供应商。当不记得用供应商的具体名字时，只输入供应商名字的其中一个字，会检索出所有带这个字的供应商，方便用户查询管理。点击右边链接修改供应商，会连接到相关网页修改供应商信息。点击操作里的查看、修改等可以进行相应的改、删、查操作。效果图如图5-4所示：


![供应商管理](https://images.gitee.com/uploads/images/2021/1118/152915_042f7041_8746031.png "供应商管理.png")
![供应商管理](https://images.gitee.com/uploads/images/2021/1118/152926_6a174917_8746031.png "供应商管理.png")

图5-4供应商管理界面

#### 商品管理
商品管理页面，通过输入用商品名字和身份查询商品。当不记得用商品的具体名字时，只输入商品名字的其中一个字，会检索出所有带这个字的商品，方便用户查询管理。点击右边链接修改商品，会连接到相关网页修改商品信息。点击操作里的查看、修改等可以进行相应的改、删、查操作。效果图如图5-5所示：


![商品管理](https://images.gitee.com/uploads/images/2021/1118/152940_b93f72c1_8746031.png "商品管理.png")
![商品管理](https://images.gitee.com/uploads/images/2021/1118/152945_6ea9e108_8746031.png "商品管理.png")

图5-5商品管理界面

#### 订单管理
订单管理页面，通过输入用订单名字和身份查询订单。当不记得用订单的具体名字时，只输入订单名字的其中一个字，会检索出所有带这个字的订单，方便用户查询管理。点击右边链接修改订单，会连接到相关网页修改订单信息。点击操作里的查看、修改等可以进行相应的改、删、查操作。如下图5-6所示：


 ![订单管理](https://images.gitee.com/uploads/images/2021/1118/152951_87154c4f_8746031.png "订单管理.png")
 ![订单管理](https://images.gitee.com/uploads/images/2021/1118/152956_14262c38_8746031.png "订单管理.png")

图5-6评论管理界面

####  用户退出
用户信息进行退出等操作。如图5-7所示：
 ![用户退出](https://images.gitee.com/uploads/images/2021/1118/153001_1107fa24_8746031.png "用户退出.png")

图5-7退出界面


