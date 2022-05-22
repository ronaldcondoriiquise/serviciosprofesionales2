package app.servicio.profesional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import app.servicio.profesional.R;

public class EnviarActivity extends AppCompatActivity {

    Button brnAceptar;
    EditText txtNombre;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar);

        txtNombre = findViewById(R.id.txtNombre);
        txtView = findViewById(R.id.textView);

        String datos= "Nombre :" + getIntent().getStringExtra("txtNombre") +
                "\nApellidos :" + getIntent().getStringExtra("txtApellidos") +
                "\nTelefono :" + getIntent().getStringExtra("txtTelefono") +
                "\nCorreo Electronico: " + getIntent().getStringExtra("txtEmail") +
                "\nHorario de Atencion :" + getIntent().getStringExtra("cbxDeptos") +
                "\nPago Realizado :" + getIntent().getStringExtra("Tiempo")  +
                "\nDoctor :" + getIntent().getStringExtra("textNombre")  +
                "\nDireccion :" + getIntent().getStringExtra("textDireccion");

        txtNombre.setText(getIntent().getStringExtra("txtNombre"));
        txtView.setText(datos);

        brnAceptar =(Button)findViewById(R.id.btnAceptar);
        brnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EnviarActivity.this, DetailsActivity.class);
                startActivity(i);

            }
        });

    }
}