package com.ghavinj.acrestosquarefeet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    1 Acre = 43560 SqrFt
     */

    private Button convertAcresButton;
    private TextView resultTextView;
    private EditText acresEnteredEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertAcresButton = (Button)findViewById(R.id.convertAcresButton);
        resultTextView = (TextView) findViewById(R.id.resultTextView);
        acresEnteredEditText = (EditText)findViewById(R.id.acresEnteredEditText);

        convertAcresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}
