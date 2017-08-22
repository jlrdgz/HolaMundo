package jlrdgz.com.mx.nombre;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.EditText;
import android.widget.TextView;

import jlrdgz.com.mx.holamundo.R;

public class Main2ActivityNombre extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_nombre);
        textField = (EditText) findViewById(R.id.nombre);
                View boton = findViewById(R.id.bienvenido);
        tv = (TextView) findViewById(R.id.nombre);

    }
    EditText textField;
    String nombre;
    TextView tv;

    @Override
    public void onClick(View view) {
        nombre=textField.getText().toString();
        tv.append("Bienvenido, "+nombre);

    }
}
