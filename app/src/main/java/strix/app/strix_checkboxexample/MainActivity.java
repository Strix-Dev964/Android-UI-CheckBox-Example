package strix.app.strix_checkboxexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/*
Created by Strix - http://strixdev.co.uk
*/

public class MainActivity extends AppCompatActivity {

    private CheckBox chkBox_1, chkBox_2, chkBox_3;
    private Button btnCheckBoxes;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        createButtonListener();

    }

    public void createButtonListener() {

        chkBox_1 = findViewById(R.id.chkBox1);
        chkBox_2 = findViewById(R.id.chkBox2);
        chkBox_3 = findViewById(R.id.chkBox3);
        btnCheckBoxes = findViewById(R.id.btnDisplay);

        btnCheckBoxes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String result = "Box1 check : " + chkBox_1.isChecked() +
                        "\nBox2 check : " + chkBox_2.isChecked() +
                        "\nBox3 check : " + chkBox_3.isChecked();
                Toast.makeText(context, result,
                        Toast.LENGTH_LONG).show();

            }
        });

    }
}