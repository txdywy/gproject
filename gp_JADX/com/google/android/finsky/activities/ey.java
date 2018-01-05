package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;

final class ey implements OnClickListener {
    public final /* synthetic */ MainActivity f6776a;

    ey(MainActivity mainActivity) {
        this.f6776a = mainActivity;
    }

    public final void onClick(View view) {
        String db = C1473m.f7980a.db();
        if (db == null) {
            FinskyLog.m21659a("No account, restarting activity after network error", new Object[0]);
            this.f6776a.m6077x();
            return;
        }
        FinskyLog.m21659a("b/5160617: Reinitialize account %s on retry button click", FinskyLog.m21655a(C1473m.f7980a.mo2041U().mo1183b(db).name));
        this.f6776a.m6056a(r0, null, false, "toc_auth_error");
        this.f6776a.m6166D();
        this.f6776a.mo1250t();
    }
}
