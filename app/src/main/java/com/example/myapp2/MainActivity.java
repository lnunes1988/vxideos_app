package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MainActivity extends AppCompatActivity {

    private TextView editTextText;
    private TextView editTextTextPassword;
    private Button confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        editTextTextPassword  = findViewById(R.id.editTextTextPassword);
        confirmar = findViewById(R.id.button);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtém os valores dos campos preenchidos
                String conteudoField1 = editTextText.getText().toString();
                String conteudoField2 = editTextTextPassword.getText().toString();

                // Cria e exibe um AlertDialog com os valores
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alerta de Conteúdo");
                builder.setMessage("Campo 1: " + conteudoField1 + "\nCampo 2: " + conteudoField2);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Fecha o alerta
                        dialog.dismiss();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }
}




 //    Aproveitando as activitys criadas dos exercícios anteriores (tela de login),
 //   na qual agora deve haver um botão de cadastro de usuário e senha.
 //       Nesta tela ao realizar o armazenamento do novo usuário, salvar numa lista.
 //       Desta forma, ao tentar fazer o login é necessário verificar se o login e senha batem
 //       com que foi cadastrado nesta tela.

