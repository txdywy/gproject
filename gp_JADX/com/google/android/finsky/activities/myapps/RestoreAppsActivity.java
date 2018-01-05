package com.google.android.finsky.activities.myapps;

import android.os.Bundle;
import android.support.v4.app.C0254u;
import com.squareup.leakcanary.C7582R;

public class RestoreAppsActivity extends C0254u {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(C7582R.layout.my_apps_restore_activity);
        if (bundle == null) {
            H_().mo284a().mo325a((int) C7582R.id.container, new C1106f()).mo334c();
        }
    }
}
