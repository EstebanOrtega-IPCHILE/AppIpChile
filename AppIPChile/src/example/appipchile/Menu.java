package example.appipchile;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends Activity {
	
	private ImageView logo;
	private ImageView nota;
	private ImageView contacto;
	private ImageView sede;
	private ImageView horario;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        logo = (ImageView) findViewById(R.id.ivLogo);
        nota = (ImageView) findViewById(R.id.ivNota);
        contacto = (ImageView) findViewById(R.id.ivContacto);
        sede = (ImageView) findViewById(R.id.ivSede);
        horario = (ImageView) findViewById(R.id.ivHorario);
        
//        if (android.os.Build.VERSION.SDK_INT > 9) {
//        	StrictMode.ThreadPolicy policy =
//        	new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        	StrictMode.setThreadPolicy(policy);
//        }     
    
	
	
	
	}
	
	

}
