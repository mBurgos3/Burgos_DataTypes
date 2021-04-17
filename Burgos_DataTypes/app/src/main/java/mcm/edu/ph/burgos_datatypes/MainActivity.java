package mcm.edu.ph.burgos_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.Text);

        String textdisplay = "\b"+"Burgos, Mars";

        display.setText(textdisplay);

        double Power_Level = 9000.0;

        double WAWARTS = 1000000.0;

        int Age = 18;

        //double into String
        //Double.parsedouble => converts datatypes to double
        //integer.parseInt => converts datatypes to int
        //String.valueOf => converts datatypes to string


        //String.valueOf(Power_Level);
        display.setText(String.valueOf(Power_Level));
        display.setText("I wasborn with a name of:"+textdisplay+ "\n"+"V-Bucks:"+"\b"+(String.valueOf(WAWARTS) + "\n "+"Power Level:\b"+String.valueOf(Power_Level)+"\nBirthdate: 12/06/2002"+"\nAge:\b"+(String.valueOf(Age))));

        boolean Naa_Bay_Uyab = false;

    }
}