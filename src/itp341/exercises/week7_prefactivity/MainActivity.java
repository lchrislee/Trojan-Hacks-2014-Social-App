package itp341.exercises.week7_prefactivity;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button logInButton, signUpButton; 
	public static final String PREFERENCE_FILENAME = "settings";
	public static final String PREFERENCE_KEY_NAME = "pref_key_name";
	public static final String PREFERENCE_KEY_USERNAME = "pref_key_username";
	public static final String PREFERENCE_KEY_ZIPCODE = "pref_key_zipcode";
	public static final String PREFERENCE_KEY_AGE = "pref_key_age";
	public static final String PREFERENCE_KEY_GENDER = "pref_key_gender";
	
	private static final String TAG = MainActivity.class.getSimpleName();

	public EditText name, password;
	public String username = "";
	public String zipCode = "";
	public String gender = "";
	public String age = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		PreferenceManager.setDefaultValues(getApplicationContext(), 
				PREFERENCE_FILENAME,
				MODE_PRIVATE,
				R.xml.settings, 
				false);
		//updateFromPreferences();
		logInButton = (Button) findViewById(R.id.logInButton);
		name = (EditText) findViewById(R.id.editText1);
		password = (EditText) findViewById(R.id.editText2);
		
		logInButton.setOnClickListener( new OnClickListener(){
			@Override
			public void onClick(View v) {
				//Intent i = new Intent(getApplicationContext(), UserPrefActivity.class); 
				//startActivity(i);
				if( !username.equals( name.getText().toString() ) || !password.equals(password.getText().toString() )){
					Toast.makeText(getApplicationContext(), "Incorrect password or Username", Toast.LENGTH_SHORT).show();
					
					//TEST FIND
				}
				else{
					//start that menu SHIZZZ
				}
			}
		});
		signUpButton = (Button) findViewById(R.id.signUpButton);
		signUpButton.setOnClickListener( new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), UserPrefActivity.class); 
				startActivity(i);
			}
		});

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onActivityResult(int, int,
	 * android.content.Intent)
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		Log.d(TAG, "onActivityResult");
		updateFromPreferences();
	}
	private void updateFromPreferences() {
		
		//BULLSHITTTT
		SharedPreferences prefs = getSharedPreferences(PREFERENCE_FILENAME,
				MODE_PRIVATE);	
		username = prefs.getString(PREFERENCE_KEY_NAME, "No name");
		if (prefs.getBoolean(PREFERENCE_KEY_GENDER, false))
			gender = "Male";
		else {
			gender = "Female";
		}
		age = prefs.getString(PREFERENCE_KEY_AGE, "18");
		zipCode = prefs.getString(PREFERENCE_KEY_ZIPCODE, "00000");
	}

}
