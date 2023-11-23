package com.marcin.kontrolkalistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        content = (TextView) findViewById(R.id.textView);

        String[] values = new String[]{"opcja wejściowa","opcja wejściowa","opcja wyjściowa",
                "opcja specjalna","opcja na obejście","opcja ekstremalna",
                "opcja standardowa","opcja wielozadaniowa"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,values);

        ListView list = (ListView) findViewById(R.id.lista);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int itemPosition = i+1;
                String itemValue = (String)adapterView.getItemAtPosition(i);
                content.setText("kliknięto:\npozycja: " + itemPosition + "\nwartośćc opcji: " + itemValue);
            }
        });


    }
}
