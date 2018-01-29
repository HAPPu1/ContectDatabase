package com.example.happu.contectdatabase;

/**
 * Created by happu on 29/1/18.
 */

public class UserInfoContract {
    private UserInfoContract(){}
    public static class UserEntry {
        public static final String TABLE_NAME = "entry";
        public static final String FIRST_NAME= "first_name";
        public static final String LAST_NAME = "last_name";
        public static final String PHONE="phone";
        public static final String PASSWORD="password";

    }

}
