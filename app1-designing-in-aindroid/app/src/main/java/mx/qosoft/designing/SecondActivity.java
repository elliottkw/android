package mx.qosoft.designing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewMain;
    private Button buttonGoSharing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMain = findViewById(R.id.textViewMain);
        buttonGoSharing = findViewById(R.id.buttonGoSharing);

        // Take the data of intent.
        Bundle bundle = getIntent().getExtras();
        if(bundle != null && bundle.getString("greeter") != null) {
            String greeter = bundle.getString("greeter");
            Toast.makeText(SecondActivity.this, greeter, Toast.LENGTH_LONG).show();
            textViewMain.setText(greeter);
        } else {
            Toast.makeText(SecondActivity.this, "It is empty!", Toast.LENGTH_LONG).show();
        }

        buttonGoSharing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}