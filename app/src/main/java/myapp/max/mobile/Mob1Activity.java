package myapp.max.mobile;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Mob1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void vyc1(View view) {
        EditText t1 = (EditText) findViewById(R.id.et1);
        EditText t2 = (EditText) findViewById(R.id.et2);
        EditText t3 = (EditText) findViewById(R.id.et3);
        TextView tv = (TextView) findViewById(R.id.res);
        String num1 = t1.getText().toString();
        String num2 = t2.getText().toString();
        String day = t3.getText().toString();

        double sumRes = 0;
        double dis = 0;
        if (day.equals("") || num1.equals("") || num2.equals("")) {
            Toast ts = Toast.makeText(this, "Нет такого дня недели, введите день недели и остальные поля", Toast.LENGTH_LONG);
            ts.show();
        } else {
            if (day.equals("Surtuday") || day.equals("Sunday")) {
                sumRes = Integer.valueOf(num1) * Double.valueOf(num2) * 0.8;
                tv.setText("Ваша скидка выходного дня :" + dis + "сом." + "Счет за разговоры с учетом скидки " + String.valueOf(sumRes) + "сом");
            } else {
                sumRes = Integer.valueOf(num1) * Double.valueOf(num2);
                tv.setText("Ваша скидка " + dis + "сом." + "Счет за разговоры " + String.valueOf(sumRes) + "сом.");
            }
        }

    }

}
