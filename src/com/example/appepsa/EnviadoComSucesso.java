package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class EnviadoComSucesso extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enviado_com_sucesso);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enviado_com_sucesso, menu);
		return true;
	}
	//FUN��O CHAMAR TELA DE MENU
	public void menuprincipal(View v) {
        Intent it = new Intent(this, PerfilUsuarioMenuAlunoFuncionario.class);
        startActivity(it);
	}

}
