# Spring security model

- define a framework for security

- implement using servlet filters in the background:

    + Servlet Filters are used to pre-process / post-process web requests
    + Servlet Filters can route web requests based on security logic
    + Spring provides a bulk of security functionality with servlet filters

- two methods of securing an app: 
    + declarative: Define application's security constraints in configuration, all Java config: @Configuration
    + programmatic: provides greater customization for specfic app requirements

# Security concept

- Authentication: Check user id and password with credentials (thông tin xác thực) stored in app/db
- Authorization: Check to see if user has an authorized role
