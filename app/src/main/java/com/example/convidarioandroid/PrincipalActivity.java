package com.example.convidarioandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PrincipalActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Recupera a View activiry_principal.
        setContentView(R.layout.activity_principal);

        //Recupera a lista da View activiry_principal.
        ListView listaPacientesListVew = findViewById(R.id.activity_principal_lista_pacinetes);
        ArrayList<String> listapacientes = new ArrayList<>();



        listaPacientesListVew.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listapacientes));


        FloatingActionButton botaoCadastro = findViewById(R.id.activity_botao_cadastro);
        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activitycadastro = new Intent(PrincipalActivity.this, CadastroActivity.class);
                startActivity(activitycadastro);
            }
        });

    }




}


