package app.servicio.profesional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import app.servicio.profesional.R;

public class CitaActivity extends AppCompatActivity {

    EditText txtNombre, txtApellidos, txtTelefono, txtEmail;
    Button btnEnviar;
    Spinner cbxDeptos;
    RadioButton Visa, Credito;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cita);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellidos= findViewById(R.id.txtApellidos);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtEmail = findViewById(R.id.txtEmail);
        cbxDeptos= findViewById(R.id.cbxDeptos);
        Visa= findViewById(R.id.Visa);
        Credito= findViewById(R.id.Credito);
        btnEnviar= findViewById(R.id.btnEnviar);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().equals("")||txtEmail.getText().toString().equals("")){
                    Toast.makeText(CitaActivity.this, "estos campos son nesesarios", Toast.LENGTH_LONG);
                } else {

                    Intent intent = new Intent(CitaActivity.this,EnviarActivity.class);
                    intent.putExtra("txtNombre", txtNombre.getText().toString());
                    intent.putExtra("txtApellidos", txtApellidos.getText().toString());
                    intent.putExtra("txtTelefono", txtTelefono.getText().toString());
                    intent.putExtra("txtEmail", txtEmail.getText().toString());
                    intent.putExtra("cbxDeptos", cbxDeptos.getSelectedItem().toString());
                    intent.putExtra("Visa", Visa.getText().toString());
                    intent.putExtra("Credito", Credito.getText().toString());


                    String horario = "";
                    if(Visa.isChecked()){
                        horario = "Tarjeta Visa";
                    } else{
                        horario = "Tarjeta Credito";
                    }
                    intent.putExtra("Tiempo",horario);
                    startActivity(intent);

                }
            }
        });

    }
}