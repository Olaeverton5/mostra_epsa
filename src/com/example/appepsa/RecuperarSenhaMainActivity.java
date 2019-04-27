package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class RecuperarSenhaMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recuperar_senha_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recuperar_senha_main, menu);
		return true;
	}

	// FUNÇÃO DO BOTÃO VOLTAR DA TELA RECUPERAR SENHA
	public void voltar(View v) {
		Intent it = new Intent(this, MainActivity.class);
		startActivity(it);
	}
	
	// FUNÇÃO DO BOTÃO ENVIAR DA TELA RECUPERAR SENHA
		public void enviar(View v) {
			Intent it = new Intent(this, MainActivity.class);
			startActivity(it);
		}

	// FUNÇÃO DO BOTÃO LIMPAR DA RECUPERAR SENHA
	public void limpar(View v) {
		EditText cpf = (EditText) findViewById(R.id.eTinformeseucpf);
		EditText email = (EditText) findViewById(R.id.eTemail);

		cpf.setText("");
		email.setText("");

		cpf.requestFocus();
	}

}
