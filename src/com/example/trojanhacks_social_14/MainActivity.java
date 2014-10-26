package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
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
        logInButton.setOnClickListener( new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
        	
        });
        
        //RYAN^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }
}
