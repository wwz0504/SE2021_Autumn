/*package com.michaldabski.filemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
}*/
package com.michaldabski.filemanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.michaldabski.filemanager.about.AboutActivity;


public class MessageActivity extends android.app.Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
    public void onClick(View view){
        try{
            Intent MessageIntent = new Intent(this, com.michaldabski.filemanager.about.AboutActivity.class);
            startActivity(MessageIntent);
        }
        catch (Exception e)
        {
            Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
        }
    }

}