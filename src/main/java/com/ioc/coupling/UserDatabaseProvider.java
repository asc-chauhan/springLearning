package com.ioc.coupling;

// A - MYSQL, POSTGRESQL
// B - Web Service, MongoDB

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "User details From Database";
    }
}
