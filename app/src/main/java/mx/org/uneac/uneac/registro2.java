package mx.org.uneac.uneac;

/**
 * Created by s.Selene on 28/10/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class registro2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //La siguiente línea yo la agrego para manipular mi título en el Layout
        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        //La siguiente línea se crea automáticamente con el Layout
        setContentView(R.layout.activity_registro2);

        //La siguiente línea yo la agrego para manipular mi título en el Layout
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.activity_registro2);

    }
}
