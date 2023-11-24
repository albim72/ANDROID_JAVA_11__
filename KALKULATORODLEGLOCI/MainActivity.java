package com.marcin.kalulatorodleglosci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton milaM, milaL,jard,stopa,cal;
    private Button button;
    private TextView textView;
    private EditText dist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.rgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.rbmilaM){
                    Toast.makeText(getApplicationContext(),"wybrano: mile morskie...",Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.rbmilaL){
                    Toast.makeText(getApplicationContext(),"wybrano: mile lądowe...",Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.rbjard){
                    Toast.makeText(getApplicationContext(),"wybrano: jardy...",Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.rbstopa){
                    Toast.makeText(getApplicationContext(),"wybrano: stopy...",Toast.LENGTH_SHORT).show();
                }else if(i==R.id.rbcal){
                    Toast.makeText(getApplicationContext(),"wybrano: cale...",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
