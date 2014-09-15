package com.github.ksoichiro.uishowcase;

import android.annotation.TargetApi;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * @author Soichiro Kashima
 */
public class AboutActivity extends ActionBarActivity {

    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);

        if (Build.VERSION_CODES.HONEYCOMB <= Build.VERSION.SDK_INT) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
            if (Build.VERSION_CODES.ICE_CREAM_SANDWICH <= Build.VERSION.SDK_INT) {
                getActionBar().setHomeButtonEnabled(true);
            }
        }

        ((TextView) findViewById(R.id.version_name)).setText(getVersionName());
        ((TextView) findViewById(R.id.copyright)).setText(Html
                .fromHtml(getString(R.string.msg_copyright)));
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem menu) {
        int id = menu.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return false;
    }

    private String getVersionName() {
        final PackageManager manager = getPackageManager();
        String versionName;
        try {
            final PackageInfo info = manager.getPackageInfo(
                    getPackageName(),
                    PackageManager.GET_META_DATA);
            versionName = info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            versionName = "";
        }
        return versionName;
    }

}
