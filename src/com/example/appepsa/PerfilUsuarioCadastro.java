package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class PerfilUsuarioCadastro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil_usuario_cadastro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro, menu);
		return true;
	}
	
	//FUNÇÃO DO BOTÃO VOLTAR DA TELA DE CADASTRO
	public void voltar(View v) {
        Intent it = new Intent(this, PerfilUsuarioMainActivity.class);
        startActivity(it);
	}
	
	//FUNÇÃO DO BOTÃO LIMPAR DA TELA DE CADASTRO
	public void limpar(View v) {
		EditText nome = (EditText) findViewById(R.id.eTnomecompleto);
		EditText email = (EditText) findViewById(R.id.eTemailcadastro);
		EditText cpf = (EditText) findViewById(R.id.eTcpf);
		EditText datanasc = (EditText) findViewById(R.id.eTdatanascimento);
		EditText celular = (EditText) findViewById(R.id.eTcelular);
		EditText senha = (EditText) findViewById(R.id.eTsenhacadastro);
		EditText confirmesenha = (EditText) findViewById(R.id.eTconfirmesenha);

		nome.setText("");
		email.setText("");
		cpf.setText("");
		datanasc.setText("");
		celular.setText("");
		senha.setText("");
		confirmesenha.setText("");
		nome.requestFocus();
	}

}
