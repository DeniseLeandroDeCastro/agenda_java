package com.android.agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        setTitle("Lista de alunos");

        List<String> alunos = new ArrayList<>(Arrays.asList(
                "Aluno 1", "Aluno 2", "Aluno 3", "Aluno 4"));
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_list_view);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, alunos));
    }
}