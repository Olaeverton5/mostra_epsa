package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class FaleConosco extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fale_conosco);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fale_conosco, menu);
		return true;
	}
	//FUNÇÃO LIMPAR
	public void limpar(View v) {
		EditText faleconosco = (EditText) findViewById(R.id.eTFaleConosco);

		faleconosco.setText("");

		faleconosco.requestFocus();
	}
	//FUNÇÃO CHAMAR TELA DE MENU
	public void menuprincipal(View v) {
        Intent it = new Intent(this, PerfilUsuarioMenuAlunoFuncionario.class);
        startActivity(it);
	}
	//FUNÇÃO CHAMAR TELA DE ENVIADO COM SUCESSO
	public void enviadocomsucesso(View v) {
        Intent it = new Intent(this, EnviadoComSucesso.class);
        startActivity(it);
	}
}

