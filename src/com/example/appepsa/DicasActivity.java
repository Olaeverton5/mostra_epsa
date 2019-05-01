package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class DicasActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dicas);
		
		EditText livros = (EditText)findViewById(R.id.tVLivrosDicas);
		Intent it = new Intent (this, LivrosActivity.class);
		startActivity(it);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dicas, menu);
		return true;
		
	}

}
