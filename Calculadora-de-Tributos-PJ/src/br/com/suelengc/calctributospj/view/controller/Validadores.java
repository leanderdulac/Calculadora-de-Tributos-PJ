package br.com.suelengc.calctributospj.view.controller;

import android.widget.EditText;

public class Validadores {

	public static boolean ValidaEditText(EditText editText) {
		boolean retorno = true;
		
		if (editText.getText().toString().equals("")) 
		{
			editText.setError("Campo obrigat�rio.");
			editText.requestFocus();
			retorno = false;
		}	
		
		return retorno;
	}
}