package org.pltw.example.numberconverter;

import java.util.Stack;
import android.app.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;

public class MyActivity extends Activity implements TextWatcher  {
    EditText txtDecimal;
    TextView txtBinary, txtOctal, txtHexadecimal;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        txtDecimal = (EditText) findViewById(R.id.txtDecimal);
        txtBinary = (TextView) findViewById(R.id.txtBinary);
        txtOctal = (TextView) findViewById(R.id.txtOctal);
        txtHexadecimal = (TextView) findViewById(R.id.txtHexadecimal);
        txtDecimal.addTextChangedListener(this);


    }

    public void beforeTextChanged(CharSequence sequence, int start, int count, int after) {
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence sequence, int start, int before, int count) {
        calculate(2, txtBinary);        // bin
        calculate(8, txtOctal);        // oct
        calculate(16, txtHexadecimal);    // hex
    }

    public void calculate(int base, TextView txtView) {
        if (txtDecimal.getText().toString().trim().length() == 0) {
            txtView.setText("");
            return;
        }
        try {
            Stack<Object> stack = new Stack<Object>();
            int number = Integer.parseInt(txtDecimal.getText().toString());
            while (number > 0) {
                int remainder = number % base; // find remainder
                if (remainder < 10)
                {
                    stack.push(remainder);
                } else {
                    switch (remainder)
                    {
                        case 10:
                            stack.push("A");
                            break;
                        case 11:
                            stack.push("B");
                            break;
                        case 12:
                            stack.push("C");
                            break;
                        case 13:
                            stack.push("D");
                            break;
                        case 14:
                            stack.push("E");
                            break;
                        case 15:
                            stack.push("F");
                            break;
                    }
                }
                number /= base;
            }
            StringBuffer buffer = new StringBuffer();
            while (!stack.isEmpty()) {
                buffer.append(stack.pop().toString());
            }
            txtView.setText(buffer.toString());
        } catch (Exception e) {
            txtView.setText(e.getMessage());
        }
    }

}