package com.example.tamyprueba;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener{

	Button boton, boton2;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        boton = (Button) findViewById(R.id.Sergio);
        boton2 = (Button) findViewById(R.id.Laura);
        
        boton.setOnClickListener(this);
        boton2.setOnClickListener(this);
    }

	public void onClick(View v) {
		switch(v.getId()){
		case R.id.Sergio:
			Toast.makeText(this, "<33", Toast.LENGTH_LONG).show();
			break;
			
		case R.id.Laura:
			Toast.makeText(this, "<3", Toast.LENGTH_SHORT).show();
			break;
		}
	}

}
