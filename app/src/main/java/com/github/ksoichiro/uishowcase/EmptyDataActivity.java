package com.github.ksoichiro.uishowcase;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        findViewById(R.id.create).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(EmptyDataActivity.this, "Congratulations!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem menu) {
        if (menu.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return false;
    }

}
