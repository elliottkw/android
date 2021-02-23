package mx.qosoft.listgridviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<String> names;

    public MyAdapter(Context context, int layout, List<String> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return names.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        // Copy the view
        view = convertView;

        // We inflate that has come to us with our custom layout.
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.list_item, null);

        // We bring the current value dependent on the position.
        String currentName = names.get(position);
        // currentName = (String) getItem(position);

        // We reference the element to modify and fill it.
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(currentName);

        // We return the view inflated and modified with our data.
        return view;
    }
}
