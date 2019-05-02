package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class PerfilUsuarioAlterarSenha extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil_usuario_alterar_senha);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.perfil_usuario_alterar_senha, menu);
		return true;
	}

	// FUNÇÃO VOLTAR TELA ALTERAR SENHA
	public void voltar(View v) {
		Intent it = new Intent(this, PerfilUsuarioAluno.class);
		startActivity(it);
	}

	// FUNÇÃO SALVAR TELA ALTERAR SENHA
	public void salvar(View v) {
		Intent it = new Intent(this, PerfilUsuarioMenuAlunoFuncionario.class);
		startActivity(it);
	}

	// FUNÇÃO DO BOTÃO LIMPAR DA TELA ALTERAR SENHA
	public void limpar(View v) {
		EditText senhaatual = (EditText) findViewById(R.id.eTsenhaatual);
		EditText novasenha = (EditText) findViewById(R.id.eTnovasenha);
		EditText confirmenovasenha = (EditText) findViewById(R.id.eTconfirmenovasenha);
		

		senhaatual.setText("");
		novasenha.setText("");
		confirmenovasenha.setText("");
		
		senhaatual.requestFocus();
	}

}
