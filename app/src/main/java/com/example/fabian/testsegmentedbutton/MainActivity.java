package com.example.fabian.testsegmentedbutton;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final RadioButton rb1 = (RadioButton) findViewById( R.id.rb1 );
        final RadioButton rb2 = (RadioButton) findViewById( R.id.rb2 );
        RadioGroup radioGroup = (RadioGroup) findViewById( R.id.rGroup );

        //Cambia el color del texto dependiendo de si esta seleccionado o no
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if( checkedId == R.id.rb1 ){
                    rb1.setTextColor( getResources().getColor( R.color.background ) );
                    rb2.setTextColor( getResources().getColor( R.color.white ));
                }
                if( checkedId == R.id.rb2 ){
                    rb2.setTextColor( getResources().getColor( R.color.background ) );
                    rb1.setTextColor( getResources().getColor( R.color.white ) );
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
