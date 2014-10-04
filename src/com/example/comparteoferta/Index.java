package com.example.comparteoferta;

import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Index extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index);
		
		//Localizar los controles
        TextView saludo1 = (TextView)findViewById(R.id.saludo1);
        TextView saludo2 = (TextView)findViewById(R.id.saludo2);
        
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        
        //Construimos el mensaje a mostrar
        saludo1.setText("Usuario " + bundle.getString("NOMBRE"));
        //saludo2.setText("Password " + bundle.getString("PASSWORD"));
	}
	
}
