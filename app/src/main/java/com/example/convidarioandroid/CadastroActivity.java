package com.example.convidarioandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroActivity extends AppCompatActivity {
    private Button Cadastrar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro); // Recupera a View activity_cadastro.

        // Identifica e recupera o botão voltar da  activiry_cadastro.

        FloatingActionButton botaovoltar = findViewById(R.id.floatingActionButtonvoltar);
        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cria uma intenção para para que o botão possa acessar a View activity_principal.

                Intent activityvoltar = new Intent(CadastroActivity.this, PrincipalActivity.class);
                startActivity(activityvoltar);
            }
        });

        // Identifica e recupera o botão Cadastrar na View activiry_cadasro.

        Cadastrar = findViewById(R.id.activity_botao_cadastrar);
        Cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean temErro = false;
                Paciente paciente = new Paciente();

                EditText campoNome = findViewById(R.id.activity_cadastro_nome);
                EditText campoDataNascimento = findViewById(R.id.activity_cadastro_data_nascimento);
                EditText campoDataHoje = findViewById(R.id.activity_cadastro_data_hoje);
                EditText campolocal = findViewById(R.id.activity_cadastro_local);

                paciente.setNome(campoNome.getText().toString());
                try {
                    paciente.setDataNascimento(new SimpleDateFormat("dd/MM/yyy").parse(campoDataNascimento.getText().toString()));
                    paciente.setDataHoje(new SimpleDateFormat("dd,MM,yyyy").parse(campoDataHoje.getText().toString()));
                } catch (ParseException e) {

                    Toast.makeText(CadastroActivity.this, "Digite o o valor da data no formato dd/mm/yyyy.", Toast.LENGTH_LONG).show();
                    temErro = true;
                }
                paciente.setLocal(campolocal.getText().toString());

                // Cria uma intenção para para que o botão possa acessar a activity_principal.
                Intent telaEnviadora = new Intent(CadastroActivity.this, PrincipalActivity.class);

                // putExtras, carrega as informações dos parametros na intenão criada anteriormente.
                if (!temErro) {
                    startActivity(telaEnviadora);
                }
            }
            });

        }

    }

