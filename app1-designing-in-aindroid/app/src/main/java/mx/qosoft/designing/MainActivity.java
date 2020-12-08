package mx.qosoft.designing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void miBoton(View view) {
        Toast.makeText(this, "Button Clicked...", Toast.LENGTH_LONG).show();
    }
}