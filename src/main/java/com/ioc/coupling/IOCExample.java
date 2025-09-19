package com.ioc.coupling;

public class IOCExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newDatabaseProvider = new NewDataBaseProvider();
        UserManager userManagerWithNewDB = new UserManager(newDatabaseProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
