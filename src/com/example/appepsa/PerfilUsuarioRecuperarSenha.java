package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class PerfilUsuarioRecuperarSenha extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil_usuario_recuperar_senha);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.recuperar_senha_main, menu);
		return true;
	}

	// FUN��O DO BOT�O VOLTAR DA TELA RECUPERAR SENHA
	public void voltar(View v) {
		Intent it = new Intent(this, PerfilUsuarioMainActivity.class);
		startActivity(it);
	}

	// FUN��O DO BOT�O ENVIAR DA TELA RECUPERAR SENHA
	public void enviar(View v) {
		Intent it = new Intent(this, PerfilUsuarioMainActivity.class);
		startActivity(it);
	}

	// FUN��O DO BOT�O LIMPAR DA RECUPERAR SENHA
	public void limpar(View v) {

		EditText email = (EditText) findViewById(R.id.eTemailinforme);
		email.setText("");
		email.requestFocus();
	}

}
