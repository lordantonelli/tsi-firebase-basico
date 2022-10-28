package com.example.humberto.firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    // Atributos que representam os objetos da interface gráfica:
    private EditText txtNome;
    private EditText txtSobrenome;
    private EditText txtIdade;
    private Button btnEnviar;
    private TextView lblNome;
    private TextView lblSobrenome;
    private TextView lblIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ligando os atributos com a interface gráfica:
        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtIdade = findViewById(R.id.txtIdade);
        btnEnviar = findViewById(R.id.btnEnviar);
        lblNome = findViewById(R.id.lblNome);
        lblSobrenome = findViewById(R.id.lblSobrenome);
        lblIdade = findViewById(R.id.lblIdade);
    }

}

