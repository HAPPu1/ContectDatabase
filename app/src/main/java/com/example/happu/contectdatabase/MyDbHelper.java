package com.example.happu.contectdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by happu on 29/1/18.
 */

public class MyDbHelper extends SQLiteOpenHelper {
    private static  final String DATABASE_NAME="contact.db";
    private static  final  int  DATABASE_VERSION=1;
    private static  final String SQL_CREATE_ENTERY="CREATE TABLE "+ UserInfoContract.UserEntry.TABLE_NAME+"("+
            UserInfoContract.UserEntry.FIRST_NAME+" TEXT,"+ UserInfoContract.UserEntry.LAST_NAME+" TEXT,"+
            UserInfoContract.UserEntry.PHONE+" TEXT,"+ UserInfoContract.UserEntry.PASSWORD+" TEXT"+");";
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + UserInfoContract.UserEntry.TABLE_NAME;
    public MyDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTERY);
        Log.e("CREATE TABLE","TABLE CREATED SUCCESSFULLY");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void insertContact(String first_name,String last_name,String phone,String password,SQLiteDatabase db){
        ContentValues contentValues=new ContentValues();
        contentValues.put(UserInfoContract.UserEntry.FIRST_NAME,first_name);
        contentValues.put(UserInfoContract.UserEntry.LAST_NAME,last_name);
        contentValues.put(UserInfoContract.UserEntry.PHONE,phone);
        contentValues.put(UserInfoContract.UserEntry.PASSWORD,password);
        db.insert(UserInfoContract.UserEntry.TABLE_NAME,null,contentValues);
        Log.e("DATABASE OPERATION","ONE ROW INSERTED");
    }
}
