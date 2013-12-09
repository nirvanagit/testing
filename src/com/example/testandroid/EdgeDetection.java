package com.example.testandroid;

import java.util.ArrayList;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class EdgeDetection extends Activity{ 

//	private String firstName;
//	private String lastName;
//	private String status;
//	private String emailId;

//	@Override
//	public final void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//
//		Log.d("test_2", savedInstanceState.toString());
//		
//	}

	@Override
	public final void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		final ArrayList<String> gUsernameList = new ArrayList<String>();
	    AccountManager accountManager = AccountManager.get(getApplicationContext());
	Account[] accounts = accountManager.getAccountsByType("com.google");
	

	gUsernameList.clear();
	//loop
	for (Account account : accounts) {
	    gUsernameList.add(account.name);
	    Log.d("test_2", gUsernameList.toString());
	}

//	AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
//	builder.setTitle("Choose you gmail-account");
//	ListView lv = new ListView(getApplicationContext());
//	ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, gUsernameList);
//	lv.setAdapter(adapter);
//	lv.setOnItemClickListener(new OnItemClickListener() {    
//	    public void onItemClick(AdapterView<?> parent,View view,int position,long id) {
//	        Log.d("You-select-gmail-account", gUsernameList.get(position));
//	    }
//	});
//	builder.setView(lv);
//	builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//	    public void onClick(DialogInterface dialog, int whichButton) {
//	        dialog.dismiss();
//	    }
//	});
//	final Dialog dialog = builder.create();
//	dialog.show();

	}

	
}
