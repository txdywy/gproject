package com.squareup.leakcanary.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.Toast;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.squareup.leakcanary.C7582R;

@TargetApi(23)
public class RequestStoragePermissionActivity extends Activity {
    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return c.b(this);
    }

    public Resources getResources() {
        return c.a(this);
    }

    public Theme getTheme() {
        return c.c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        c.a(this, i);
    }

    public static PendingIntent createPendingIntent(Context context) {
        LeakCanaryInternals.setEnabledBlocking(context, RequestStoragePermissionActivity.class, true);
        Intent intent = new Intent(context, RequestStoragePermissionActivity.class);
        intent.setFlags(335544320);
        return PendingIntent.getActivity(context, 1, intent, 134217728);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        if (hasStoragePermission()) {
            finish();
            return;
        }
        requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 42);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!hasStoragePermission()) {
            Toast.makeText(getApplication(), C7582R.string.leak_canary_permission_not_granted, 1).show();
        }
        finish();
    }

    private boolean hasStoragePermission() {
        return checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
