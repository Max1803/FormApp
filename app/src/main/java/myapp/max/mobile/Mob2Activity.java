package myapp.max.mobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Mob2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob2);
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

    public void vyc2(View view) {
        EditText sum = (EditText) findViewById(R.id.et);
        TextView tv = (TextView) findViewById(R.id.sk);
        TextView tv2 = (TextView) findViewById(R.id.sm);
        String sm = sum.getText().toString();

        double s = Double.valueOf(sm);
        if (s > 500 && s < 1000) {
            tv.setText("3%");
            tv2.setText("" + s * 0.97);
        }
        if (s > 1000) {
            tv.setText("5%");
            tv2.setText("" + s * 0.95);
        }
    }

}
