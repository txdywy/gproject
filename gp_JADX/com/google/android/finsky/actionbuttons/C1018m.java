package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cw.C2454a;

final class C1018m implements OnClickListener {
    public final /* synthetic */ C2454a f6250a;
    public final /* synthetic */ Context f6251b;

    C1018m(C2454a c2454a, Context context) {
        this.f6250a = c2454a;
        this.f6251b = context;
    }

    public final void onClick(View view) {
        this.f6251b.getPackageManager().setApplicationEnabledSetting(this.f6250a.f13237h.f14885a.f12096c, 1, 0);
    }
}
