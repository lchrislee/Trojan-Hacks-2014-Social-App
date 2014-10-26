package com.example.hello;

import com.example.hello.chat.ChatActivity;

import messageAdapter.MessageAdapter;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class feedActivity extends Activity {

	private ImageButton imbnFind;
	private ImageButton imbnSort;
	private ImageButton imbnChat;
	private ImageButton imbnSettings;
	private ListView lsvwPosts;
	
	private int sortPriority = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_status_screen);
		
		imbnFind = (ImageButton) findViewById(R.id.imbnFind);
		imbnSort = (ImageButton) findViewById(R.id.imbnSort);
		imbnChat = (ImageButton) findViewById(R.id.imbnChat);
		imbnSettings = (ImageButton) findViewById(R.id.imbnSettings);
		lsvwPosts = (ListView) findViewById(R.id.lsvwEvents);
		lsvwPosts.setAdapter(new MessageAdapter());
		
		assignListeners();
	}

	private void assignListeners(){
		imbnFind.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				Intent i = new Intent(Find.class);
//				startActivity(i);
			}
		});
		
		imbnSort.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder adBuilder = new AlertDialog.Builder(getApplicationContext());
				adBuilder.setTitle("Sort By:").setSingleChoiceItems(new String[] {"hello", "Pick Me", "TRY ME"}, -1, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						sortPriority = which;
					}
				});
				AlertDialog ad = adBuilder.create();
				ad.show();
			}
		});
		
		imbnChat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), ChatActivity.class);
				startActivity(i);
			}
		});
		
		imbnSettings.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			}
		});
		
		lsvwPosts.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
			}
		});
	}
}