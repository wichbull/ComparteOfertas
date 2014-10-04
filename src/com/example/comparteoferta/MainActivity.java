package com.example.comparteoferta;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Crea una referencia para el usuario, contraseña y el boton
        
        final EditText nombre = (EditText)findViewById(R.id.usuario);
        final EditText password = (EditText)findViewById(R.id.password);
        final Button ingresar = (Button)findViewById(R.id.ingresar);
        
        ingresar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                //Creamos el Intent
            	Intent intent = new Intent(MainActivity.this, MainActivity.class);
            	
            	//Creamos la información a pasar entre actividades
            	Bundle b = new Bundle();
            	//Bundle c = new Bundle();
            	b.putString("NOMBRE", nombre.getText().toString());
            	//c.putString("PASSWORD", password.getText().toString());
            	//Añadimos la información al intent
            	intent.putExtras(b);
            	
            	//Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
