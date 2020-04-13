package com.example.android_222;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Toolbar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, R.string.open_note_book, Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_open_calendar) {
            Toast.makeText(MainActivity.this, R.string.open_calendar, Toast.LENGTH_LONG).show();
            Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentCalendar);
            return true;
        }

        if (id == R.id.action_open_address) {
            Toast.makeText(MainActivity.this, R.string.open_address, Toast.LENGTH_LONG).show();
            Intent intentAddress = new Intent(MainActivity.this, AddressActivity.class);
            startActivity(intentAddress);
            return true;
        }
        if (id == R.id.action_open_money) {
            Toast.makeText(MainActivity.this, R.string.open_money, Toast.LENGTH_LONG).show();
            Intent intentMoney = new Intent(MainActivity.this, MoneyActivity.class);
            startActivity(intentMoney);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
