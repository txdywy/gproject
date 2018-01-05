package com.google.android.finsky.setup;

import android.view.View;
import android.view.View.OnClickListener;

final class ai implements OnClickListener {
    public final /* synthetic */ RestoreAppsActivity f20770a;

    ai(RestoreAppsActivity restoreAppsActivity) {
        this.f20770a = restoreAppsActivity;
    }

    public final void onClick(View view) {
        this.f20770a.setResult(0);
        this.f20770a.finish();
    }
}
