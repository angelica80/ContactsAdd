package com.example.pink.contactsadd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class ContactActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.contact, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case R.id.action_contact:
                Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show();
                return true;

            //Intent newContact;
            //newContact = new Intent(this, new ContactActivity);
            //startActivity(newContact);

            //kopplar meny till ny aktivitet - contact
            //break;

            case R.id.action_random:
                //Intent newRandom;
                // newRandom = new Intent(this, new RandomActivity);
                // startActivity(newRandom);
                Toast.makeText(this, "Random", Toast.LENGTH_SHORT).show();

                return true;

            //kopplar meny till ny aktivitet - random
            // break;

            case R.id.action_color:
                // Intent newColor;
                //newColor = new Intent(this, new ChangeColorActivity);
                //startActivity(newColor);
                Toast.makeText(this, "Color", Toast.LENGTH_SHORT).show();

                return true;

            //kopplar meny till ny aktivitet - color
            // break;

        }
        return super.onOptionsItemSelected(item);
    }
}

