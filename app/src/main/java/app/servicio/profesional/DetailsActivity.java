package app.servicio.profesional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.servicio.profesional.R;

public class DetailsActivity extends AppCompatActivity {
    Button sigint;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        sigint =(Button)findViewById(R.id.buttoncita);
        sigint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this, CitaActivity.class);
                startActivity(i);

            }
        });

    }
}
