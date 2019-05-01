package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class PerfilUsuarioMenuAlunoFuncionario extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil_usuario_menu_aluno_funcionario);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	//FUNÇÃO DO BOTÃO MEU PERFIL CHAMANDO A TELA DE PERFIL DE USUÁRIO ALUNO
			public void perfilusuarioaluno(View v) {
		        Intent it = new Intent(this, PerfilUsuarioAluno.class);
		        startActivity(it);
			}

}
