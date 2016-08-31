package korp.basic_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button addb,subb,mulb,divb;
    EditText number1,number2;
    TextView tvres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addb=(Button)findViewById(R.id.add);
        subb=(Button)findViewById(R.id.sub);
        mulb=(Button)findViewById(R.id.mul);
        divb=(Button)findViewById(R.id.div);
        number1=(EditText)findViewById(R.id.num1);
        number2=(EditText)findViewById(R.id.num2);
        tvres=(TextView)findViewById(R.id.result);
    }

public void result(View view) {
    String num1=number1.getText().toString();
    String num2=number2.getText().toString();

    switch (view.getId())
    {
        case R.id.add:
            int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
            tvres.setText(String.valueOf(addition));
            break;
        case R.id.sub:
            int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
            tvres.setText(String.valueOf(subtraction));
            break;
        case R.id.div:
            try {
                int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                tvres.setText(String.valueOf(division));

            } catch (Exception e) {
                tvres.setText("Cannot DIVIDE!!");
            }
            break;
        case R.id.mul:
            int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
            tvres.setText(String.valueOf(multiplication));
            break;
    }
}
}
