package com.example.practica1javatarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnPulsar;
    private Button btnLimpiar;
    private Button btnCerrar;
    private EditText txtNombre;
    private TextView lbSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPulsar= (Button) findViewById(R.id.btnSaludar);
        btnLimpiar=(Button) findViewById(R.id.btnLimpiar);
        btnCerrar=(Button) findViewById(R.id.btnCerrar);
        txtNombre=(EditText) findViewById(R.id.txtNombre);
        lbSaludo=(TextView) findViewById(R.id.lbSaludo);




        btnPulsar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNombre.getText().toString().matches(""))
                {
                    Toast.makeText(MainActivity.this,"Llene todos los campos",Toast.LENGTH_SHORT).show();
                }
                else {
                    String mensaje= "Hola "+txtNombre.getText().toString()+" ¿Como estas?";
                    lbSaludo.setText(mensaje.toString());
                }
            }
        });


        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNombre.setText("");
                lbSaludo.setText(":: ::");
            }
        });

        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}