package com.example.happu.contectdatabase;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText eFirstName,eLastName,ePhone,ePassword;
    MyDbHelper myDbHelper;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        eFirstName=findViewById(R.id.FirstNameEditText);
        eLastName=findViewById(R.id.LastNameEditText);
        ePhone=findViewById(R.id.MobileEditText);
        ePassword=findViewById(R.id.PasswordEditText);
    }
    public void signUp(View view){
        String first_name=eFirstName.getText().toString();
        String last_name=eLastName.getText().toString();
        String phone=ePhone.getText().toString();
        String password=ePassword.getText().toString();
        myDbHelper=new MyDbHelper(getBaseContext());
        sqLiteDatabase=myDbHelper.getWritableDatabase();
        myDbHelper.insertContact(first_name,last_name,phone,password,sqLiteDatabase);
        Toast.makeText(this,"DATA SAVED",Toast.LENGTH_SHORT).show();
    }

}
