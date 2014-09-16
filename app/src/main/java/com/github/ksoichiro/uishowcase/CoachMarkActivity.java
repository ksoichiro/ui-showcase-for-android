package com.github.ksoichiro.uishowcase;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;

/**
 * @author Soichiro Kashima
 */
public class CoachMarkActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach_mark);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        findViewById(R.id.coach_mark).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.setVisibility(View.GONE);
            }
        });
        findViewById(R.id.again).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.coach_mark).setVisibility(View.VISIBLE);
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
