package mx.qosoft.listgridviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        // Data to show
        List<String> names = new ArrayList<>();
        names.add("Alejandro");
        names.add("Fernando");
        names.add("Rubén");
        names.add("Santiago");
        names.add("Alejandro");
        names.add("Fernando");
        names.add("Rubén");
        names.add("Santiago");
        names.add("Alejandro");
        names.add("Fernando");
        names.add("Rubén");
        names.add("Santiago");

        // Adapter, the visual way we display our data.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);

        // We link the adapter with our list view.
        listView.setAdapter(adapter);
    }
}