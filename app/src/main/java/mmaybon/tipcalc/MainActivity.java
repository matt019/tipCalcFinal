package mmaybon.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBill;
    EditText etPeople;
    TextView tvTotal;
    TextView tvPeople;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etBill = (EditText) findViewById(R.id.editTextBill);
        etPeople = (EditText) findViewById(R.id.editTextPeople);
        tvTotal = (TextView) findViewById(R.id.textViewTotal);
        tvPeople = (TextView) findViewById (R.id.textViewPeople);

    }

    public void onClickCalcButton(View view) {
        Double bill = Double .parseDouble(etBill.getText());
        tvTotal.setText("Tip per person" + (e)
    }
    }

