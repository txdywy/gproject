package com.google.android.finsky.stream.controllers.assist;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p167r.C3960a;
import com.squareup.leakcanary.C7582R;

final class C4312c implements OnClickListener {
    public final /* synthetic */ C4311b f21762a;

    C4312c(C4311b c4311b) {
        this.f21762a = c4311b;
    }

    public final void onClick(View view) {
        C4311b c4311b = this.f21762a;
        c4311b.m20036b(2818);
        C1473m.f7980a.mo2265x();
        C3960a.m18663a(true);
        C1473m.f7980a.mo2265x();
        C3960a.m18665b(true);
        Snackbar.m499a(view, (int) C7582R.string.myapps_auto_update_assist_enabled_toast, 0).m501a((int) C7582R.string.myapps_auto_update_assist_enabled_toast_undo, new C4314e(c4311b)).m493a();
    }
}
