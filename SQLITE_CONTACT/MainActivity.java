package com.marcin.sqlite_kontakt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView txt = (TextView) findViewById(R.id.textView);
        DatabaseHandler db = new DatabaseHandler(this);
        
        db.addContact(new Contact("Robert","9564903482384"));
        db.addContact(new Contact("Ola","9564903482384"));
        db.addContact(new Contact("Henryk","9564903482384"));
        db.addContact(new Contact("Piotr","9564903482384"));
        db.addContact(new Contact("Franek","9564903482384"));
        db.addContact(new Contact("Leon","9564903482384"));
        db.addContact(new Contact("Maria","9564903482384"));
        db.addContact(new Contact("Nadia","9564903482384"));
        
        txt.setText("czytanie: czytanie wszystkich kontaktów");
        List<Contact> contacts = db.getAllContacts();
        
        for (Contact cn:contacts) {
            String log = "ID: " + cn.getId() + ", imię: " + cn.getName() + ", telefon: " + cn.getPhone() +"\n\r";
            txt.setText(txt.getText() + "\nkontakty: " + log);
                    
        }
    }
}
