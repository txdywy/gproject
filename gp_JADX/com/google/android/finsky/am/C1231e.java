package com.google.android.finsky.am;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;

final class C1231e extends BroadcastReceiver {
    public final /* synthetic */ C1229c f7378a;

    C1231e(C1229c c1229c) {
        this.f7378a = c1229c;
    }

    public final void onReceive(Context context, Intent intent) {
        C2495w c2495w;
        if (this.f7378a.f7371h != null) {
            c2495w = this.f7378a.f7371h;
        } else {
            c2495w = this.f7378a.f7368e.dd();
        }
        c2495w.m13379b(new C2475d(this.f7378a.f7365b));
        this.f7378a.m7230c();
    }
}
