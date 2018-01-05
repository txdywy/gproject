package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.p037h.C0305a;
import android.view.View;

final class ba implements Runnable {
    public final /* synthetic */ Fragment f1371a;
    public final /* synthetic */ Fragment f1372b;
    public final /* synthetic */ boolean f1373c;
    public final /* synthetic */ C0305a f1374d;
    public final /* synthetic */ View f1375e;
    public final /* synthetic */ Rect f1376f;

    ba(Fragment fragment, Fragment fragment2, boolean z, C0305a c0305a, View view, Rect rect) {
        this.f1371a = fragment;
        this.f1372b = fragment2;
        this.f1373c = z;
        this.f1374d = c0305a;
        this.f1375e = view;
        this.f1376f = rect;
    }

    public final void run() {
        ax.m1317a(this.f1371a, this.f1372b, this.f1373c, this.f1374d, false);
        if (this.f1375e != null) {
            bi.m1010a(this.f1375e, this.f1376f);
        }
    }
}
