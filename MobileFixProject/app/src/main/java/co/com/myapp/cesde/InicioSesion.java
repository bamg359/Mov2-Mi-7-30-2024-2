package co.com.myapp.cesde;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InicioSesion extends AppCompatActivity {


    Button btnIniciarSesion;

    Button btnVolverHome2;

    EditText inputCorreoSesion;

    EditText inputPasswordSesion;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        btnIniciarSesion = findViewById(R.id.btn_iniciar_sesion);
        btnVolverHome2 = findViewById(R.id.btn_volver_iniciosesion);
        inputCorreoSesion = findViewById(R.id.input_email);
        inputPasswordSesion = findViewById(R.id.input_password);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irDashboardDesdeInicioSesion();
            }
        });

        //EdgeToEdge.enable(this);
        //
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {

            //return insets;
        //});
    }

    public void irDashboardDesdeInicioSesion(){

        Intent intent = new Intent(this, DashBoard.class);
        startActivity(intent);
    }

}