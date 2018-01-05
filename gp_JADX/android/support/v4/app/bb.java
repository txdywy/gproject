package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.p037h.C0305a;
import android.view.View;
import java.util.ArrayList;

final class bb implements Runnable {
    public final /* synthetic */ bi f1377a;
    public final /* synthetic */ C0305a f1378b;
    public final /* synthetic */ Object f1379c;
    public final /* synthetic */ bc f1380d;
    public final /* synthetic */ ArrayList f1381e;
    public final /* synthetic */ View f1382f;
    public final /* synthetic */ Fragment f1383g;
    public final /* synthetic */ Fragment f1384h;
    public final /* synthetic */ boolean f1385i;
    public final /* synthetic */ ArrayList f1386j;
    public final /* synthetic */ Object f1387k;
    public final /* synthetic */ Rect f1388l;

    bb(bi biVar, C0305a c0305a, Object obj, bc bcVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f1377a = biVar;
        this.f1378b = c0305a;
        this.f1379c = obj;
        this.f1380d = bcVar;
        this.f1381e = arrayList;
        this.f1382f = view;
        this.f1383g = fragment;
        this.f1384h = fragment2;
        this.f1385i = z;
        this.f1386j = arrayList2;
        this.f1387k = obj2;
        this.f1388l = rect;
    }

    public final void run() {
        C0305a a = ax.m1309a(this.f1377a, this.f1378b, this.f1379c, this.f1380d);
        if (a != null) {
            this.f1381e.addAll(a.values());
            this.f1381e.add(this.f1382f);
        }
        ax.m1317a(this.f1383g, this.f1384h, this.f1385i, a, false);
        if (this.f1379c != null) {
            this.f1377a.mo257a(this.f1379c, this.f1386j, this.f1381e);
            View a2 = ax.m1310a(a, this.f1380d, this.f1387k, this.f1385i);
            if (a2 != null) {
                bi.m1010a(a2, this.f1388l);
            }
        }
    }
}
