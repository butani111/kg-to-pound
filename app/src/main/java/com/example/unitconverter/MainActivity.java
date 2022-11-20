package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submitBtn;
    private TextView outputText;
    private EditText inputVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submitBtn);
        outputText = findViewById(R.id.outputValue);
        inputVal = findViewById(R.id.inputValue);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Answer is available above submit button. Thanks.", Toast.LENGTH_SHORT).show();
                int kg = Integer.parseInt(inputVal.getText().toString());
                double pound = 2.205 * kg;
                outputText.setText("The value in pound is: " + pound);
            }
        });
    }
}