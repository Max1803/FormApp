package myapp.max.mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Mob3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob3);
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

    public void vyc3(View view) {
        EditText et = (EditText) findViewById(R.id.et);
        TextView tv = (TextView) findViewById(R.id.tv);
        String d = et.getText().toString();
        int a = Integer.valueOf(d);
        if (a > 0 && a <= 3) {
            tv.setText("Месяц " + a + "-это время года-Весна");
        }
        if (a > 3 && a <= 6) {
            tv.setText("Месяц " + a + "-это время года-Лето");
        }
        if (a > 6 && a <= 9) {
            tv.setText("Месяц " + a + "-это время года-Осень");
        }
        if (a > 9 && a == 0) {
            tv.setText("Месяц " + a + "-это время года-Зима");
        }
    }


}
