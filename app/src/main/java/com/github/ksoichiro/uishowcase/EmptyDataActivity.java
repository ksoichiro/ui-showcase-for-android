package com.github.ksoichiro.uishowcase;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;

/**
 * @author Soichiro Kashima
 */
public class EmptyDataActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_data);

        findViewById(R.id.create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EmptyDataActivity.this, "Congratulations!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
