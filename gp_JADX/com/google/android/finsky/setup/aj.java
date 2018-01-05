package com.google.android.finsky.setup;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.wireless.android.finsky.dfe.nano.fp;

final class aj implements OnClickListener {
    public final /* synthetic */ RestoreAppsActivity f20771a;

    aj(RestoreAppsActivity restoreAppsActivity) {
        this.f20771a = restoreAppsActivity;
    }

    public final void onClick(View view) {
        RestoreAppsActivity restoreAppsActivity = this.f20771a;
        Intent intent = new Intent();
        fp[] b = restoreAppsActivity.f20566a.m19183b();
        String[] strArr = new String[b.length];
        for (int i = 0; i < b.length; i++) {
            strArr[i] = b[i].e.f11833b;
        }
        intent.putExtra("selected_apps", strArr);
        intent.putExtra("authAccount", restoreAppsActivity.getIntent().getStringExtra("authAccount"));
        restoreAppsActivity.setResult(-1, intent);
        restoreAppsActivity.finish();
    }
}
