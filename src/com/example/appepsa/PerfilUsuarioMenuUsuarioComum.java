package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PerfilUsuarioMenuUsuarioComum extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil_usuario_menu_usuario_comum);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_usuario_comum, menu);
		return true;
	}

}
