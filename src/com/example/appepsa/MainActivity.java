package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//FUN��O CHAMAR TELA CADASTRO
	public void cadastro(View v) {
        Intent it = new Intent(this, CadastroActivity.class);
        startActivity(it);
	}
	
	
	//FUN��O CHAMAR TELA MENU PRINCIPAL
	public void menuprincipal(View v) {
        Intent it = new Intent(this, MenuAlunoeFuncionario.class);
        startActivity(it);
	}
	
	
	//FUN��O CHAMAR TELA RECUPERAR SENHA
	public void recuperarsenha(View v) {
        Intent it = new Intent(this, RecuperarSenhaMainActivity.class);
        startActivity(it);
	}

}
