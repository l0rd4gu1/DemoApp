package mx.lxtrack.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup contenedorRadios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenedorRadios = (RadioGroup) findViewById(R.id.myRadiogroup);
        contenedorRadios.check(R.id.radioSuma);

    }

    public void onClickOperar (View v){
        EditText numeroA, numeroB;
        int a, b, resultado = 0;

        numeroA = (EditText) findViewById(R.id.editNumeroA);
        numeroB = (EditText) findViewById(R.id.editNumeroB);

        a = Integer.parseInt(numeroA.getText().toString());
        b = Integer.parseInt(numeroB.getText().toString());

        switch (contenedorRadios.getCheckedRadioButtonId()){
            case R.id.radioSuma:
                resultado = a + b;
                break;
            case R.id.radioResta:
                resultado = a - b;
                break;
            case R.id.radioMultiplicacion:
                resultado = a * b;
                break;
            case R.id.radioDivision:
                resultado = a / b;
                break;
        }

        ((TextView) findViewById(R.id.textResult)).setText(String.valueOf(resultado));
    }
}
