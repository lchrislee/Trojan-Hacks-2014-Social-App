package com.example.hello.chat;

import messageAdapter.Message;
import messageAdapter.MessageAdapter;

import com.example.hello.R;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.ListView;

public class ChatActivity extends Activity {

	private ListView lsvwMessages;
	private EditText txdtInput;
	private User currentUser;
	private MessageAdapter myAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chat);
		
		myAdapter = new MessageAdapter();
		lsvwMessages = (ListView) findViewById(R.id.lsvwChat);
		lsvwMessages.setAdapter(myAdapter);
		
		txdtInput = (EditText) findViewById(R.id.edtxInput);
		txdtInput.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if (KeyEvent.KEYCODE_ENTER == keyCode){
					SharedPreferences shared = getSharedPreferences("settings", MODE_PRIVATE);
					Message m = new Message(shared.getString("NAME", ""), txdtInput.getText().toString(), shared.getString("NAME", ""), new ImageTHING(shared.getString("IMAGE", "")));
					myAdapter.addMessage(m);
					//send m to other user;
				}
				return false;
			}
		});
	}
	
}