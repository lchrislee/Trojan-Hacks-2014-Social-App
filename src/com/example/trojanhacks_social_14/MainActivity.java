package com.example.trojanhacks_social_14;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{

	//RYANvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
	private Button logInButton, signUpButton; 
	//RYAN^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //RYANvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        
        logInButton = (Button) findViewById(R.id.logInButton);
        logInButton.setOnClickListener( new View.OnClickListener(){

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        //RYAN^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }
}
