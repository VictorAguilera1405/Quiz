package com.uca.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton si, no;
    TextView pregunta, pregunta01;
    Button siguiente, salir;
    int nota = 0;
    int Npregunta = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        si = (RadioButton) findViewById(R.id.si);
        no = (RadioButton) findViewById(R.id.no);

        pregunta01 = (TextView) findViewById(R.id.numeroPreg);
        pregunta = (TextView) findViewById(R.id.pregunta);
        siguiente = (Button) findViewById(R.id.siguiente);
        salir = (Button) findViewById(R.id.salir);
    }

    public void siguiente(View v) {
        if (si.isChecked() == false && no.isChecked() == false) {
            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();
        } else if (Npregunta == 1) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 2");
            pregunta.setText("¿Tienes temperatura?");
            si.setText("si");
            no.setText("no");

            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 2) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 3");
            pregunta.setText("¿Tienes pérdida de gusto?");
            si.setText("Ni");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 3) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 4");
            pregunta.setText("¿Tienes pérdida del olfato?");
            si.setText("Si");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 4) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 5");
            pregunta.setText("¿Tienes dolor de garganta?");
            si.setText("Si");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 5) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 6");
            pregunta.setText("¿Tienes dolor de cabeza?");
            si.setText("Si");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 6) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 7");
            pregunta.setText("¿Tienes diarrea?");
            si.setText("Si");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 7) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 8");
            pregunta.setText("¿Tienes tos constante?");
            si.setText("Si");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 8) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 9");
            pregunta.setText("¿Tienes ojos irritados o rojos?");
            si.setText("Si");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 9) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            Npregunta = Npregunta + 1;
            pregunta01.setText("Pregunta 10");
            pregunta.setText("¿Tienes dificultad para respirar?");
            si.setText("Si");
            no.setText("No");
            si.setChecked(false);
            no.setChecked(false);
        }else if(Npregunta == 10) {
            if (si.isChecked()) {
                nota = nota + 1;
            }
            pregunta01.setText("Nota obtenida: "+nota);
            if(nota >= 6){
                pregunta.setText("Estado: Probablemente tienes Covid");
            }else{
                pregunta.setText("Estado: Tienes pocas probabilidades de tener Covid");
            }
            si.setVisibility(View.GONE);
            no.setVisibility(View.GONE);
            siguiente.setVisibility(View.GONE);
        }
    }

    public void Salir(View v){
        finish();
    }
}
