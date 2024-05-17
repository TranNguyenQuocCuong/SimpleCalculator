package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public String snum1;
    public String snum2;
    public double dnum1;
    public double dnum2;
    public double dresult;
    public EditText num1;
    public EditText num2;
    public Button add;
    public Button sub;
    public Button mul;
    public Button div;
    public EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        result = findViewById(R.id.result);
    }

    public void onAdd(View view) {
        snum1 = num1.getText().toString();
        snum2 = num2.getText().toString();
        try {
            dnum1 = Double.parseDouble(snum1);
            dnum2 = Double.parseDouble(snum2);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
        }
        dresult = dnum1 + dnum2;
        result.setText(String.valueOf(Math.round(dresult * 100.0) / 100.0));
    }

    public void onSub(View view) {
        snum1 = num1.getText().toString();
        snum2 = num2.getText().toString();
        try {
            dnum1 = Double.parseDouble(snum1);
            dnum2 = Double.parseDouble(snum2);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
        }
        dresult = dnum1 - dnum2;
        result.setText(String.valueOf(Math.round(dresult * 100.0) / 100.0));
    }

    public void onMul(View view) {
        snum1 = num1.getText().toString();
        snum2 = num2.getText().toString();
        try {
            dnum1 = Double.parseDouble(snum1);
            dnum2 = Double.parseDouble(snum2);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
        }
        dresult = dnum1 * dnum2;
        result.setText(String.valueOf(Math.round(dresult * 100.0) / 100.0));
    }

    public void onDiv(View view) {
        snum1 = num1.getText().toString();
        snum2 = num2.getText().toString();
        try {
            dnum1 = Double.parseDouble(snum1);
            dnum2 = Double.parseDouble(snum2);
        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
        }
        if (dnum2 == 0) {
            Toast.makeText(getApplicationContext(), "Cannot divide by 0", Toast.LENGTH_SHORT).show();
            return;
        }
        dresult = dnum1 / dnum2;
        result.setText(String.valueOf(Math.round(dresult * 100.0) / 100.0));
    }
}
