package com.caniss.mysimplecalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Tembea,Ondoka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tembea = findViewById(R.id.btnMove);
        Ondoka = findViewById(R.id.btnExit);

        //Start setting the onclick listeners
        Tembea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Write the code to move from one Activity to another
                Intent songa = new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(songa);
            }
        });

        Ondoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Write the code to exit someone from the app
                //Start by creating the alert dialog using the AlertDialog Builder
                AlertDialog.Builder builder  = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Exiting App");
                builder.setMessage("Are you sure you want to exit?");
                //Set the negative button
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       //Do the action required when someone has clicked NO

                    }
                });
                //Set the positive(YES) button
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Do the action when someone clicks Yes
                        //In this case, Exiting the app using the exit function
                        System.exit(0);
                    }
                });
                builder.create();
                builder.show();
            }
        });
    }
}
