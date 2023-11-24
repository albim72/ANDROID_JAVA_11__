package com.marcin.xmlparse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView output = (TextView) findViewById(R.id.textView);
        final Button bparseXML = (Button) findViewById(R.id.button);
        final String XMLData = "<?xml version=\"1.0\"?><login><status>OK</status><jobs><job><id>4</id><company_id>44</company_id><company>Android Corp</company><address>adres 1</address><city>Tokyo</city><state>Tokyo Dep</state> <postal_code>44444</postal_code><country>Japan</country><telephone>5454534543</telephone><fax>545454</fax><date>2016-10-10</date></job> <job><id>45</id><company_id>11</company_id><company>IOS Corp</company><address>adres 2</address><city>Sacramento</city><state>California</state><postal_code>222111</postal_code><country>USA</country><telephone>43333</telephone><fax>1111</fax><date>2016-10-21</date></job></jobs></login>";
        output.setText(XMLData);
    }
}
