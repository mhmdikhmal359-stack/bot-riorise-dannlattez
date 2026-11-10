package com.riorise.bot;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    TextView status;
    Button start, stop;
    boolean botActive = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(20, 20, 30));

        TextView title = new TextView(this);
        title.setText("BOT RIORISE DANNLATTE");
        title.setTextSize(25);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        status = new TextView(this);
        status.setText("STATUS: OFF");
        status.setTextSize(20);
        status.setTextColor(Color.RED);
        status.setGravity(Gravity.CENTER);

        start = new Button(this);
        start.setText("START BOT");

        stop = new Button(this);
        stop.setText("STOP BOT");

        start.setOnClickListener(v -> {
            botActive = true;
            status.setText("STATUS: ON");
            status.setTextColor(Color.GREEN);
        });

        stop.setOnClickListener(v -> {
            botActive = false;
            status.setText("STATUS: OFF");
            status.setTextColor(Color.RED);
        });

        layout.addView(title);
        layout.addView(status);
        layout.addView(start);
        layout.addView(stop);

        setContentView(layout);
    }
}
