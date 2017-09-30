# jokerquickweb

快速web开发框架-无spring框架版

# 功能描述

* 只需继承则可使用基本的增删改查等操作
* 高扩展性，用户可根据用户的习惯编码

# demo

控制层

`用户可添加自定义的控制层函数。`

```java
@Controller
@RequestMapping(value="/user")
public class UserController extends AbstractBaseController<User> {
	
}
```

服务层

```java
public class UserServiceImpl extends CommonServiceImpl<UserDao,User> implements UserService {
	
}
```

数据访问层类似


