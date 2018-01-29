package com.example.happu.contectdatabase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.settings){
            Toast.makeText(getBaseContext(),"Settings clicked",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.sign_up){
            Toast.makeText(getBaseContext(),"Sign Up Clicked",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,SignUpActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
