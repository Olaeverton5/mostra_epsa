package com.example.appepsa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class PerfilUsuarioAluno extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.perfil_usuario_aluno);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.perfil_usuario_aluno, menu);
		return true;
	}

	// FUN��O DO BOT�O MENU PRINCIPAL DA TELA DE PERFIL DE USU�RIO ALUNO
	public void menuprincipal(View v) {
		Intent it = new Intent(this, PerfilUsuarioMenuAlunoFuncionario.class);
		startActivity(it);
	}

	// FUN��O DO BOT�O LIMPAR DA PERFIL USU�RIO ALUNO
	public void limparperfilusuario(View v) {
		EditText nome = (EditText) findViewById(R.id.eTnomecompletoperfil);
		EditText email = (EditText) findViewById(R.id.eTemailperfil);
		EditText cpf = (EditText) findViewById(R.id.eTcpfperfil);
		EditText datanasc = (EditText) findViewById(R.id.eTdatanascimentoperfil);
		EditText celular = (EditText) findViewById(R.id.eTcelularperfil);

		nome.setText("");
		email.setText("");
		cpf.setText("");
		datanasc.setText("");
		celular.setText("");

		nome.requestFocus();
	}

}
