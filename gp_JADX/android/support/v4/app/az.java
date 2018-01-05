package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;

final class az implements Runnable {
    public final /* synthetic */ Object f1360a;
    public final /* synthetic */ bi f1361b;
    public final /* synthetic */ View f1362c;
    public final /* synthetic */ Fragment f1363d;
    public final /* synthetic */ ArrayList f1364e;
    public final /* synthetic */ ArrayList f1365f;
    public final /* synthetic */ ArrayList f1366g;
    public final /* synthetic */ Object f1367h;

    az(Object obj, bi biVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f1360a = obj;
        this.f1361b = biVar;
        this.f1362c = view;
        this.f1363d = fragment;
        this.f1364e = arrayList;
        this.f1365f = arrayList2;
        this.f1366g = arrayList3;
        this.f1367h = obj2;
    }

    public final void run() {
        if (this.f1360a != null) {
            this.f1361b.mo265c(this.f1360a, this.f1362c);
            this.f1365f.addAll(ax.m1315a(this.f1361b, this.f1360a, this.f1363d, this.f1364e, this.f1362c));
        }
        if (this.f1366g != null) {
            if (this.f1367h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1362c);
                this.f1361b.mo263b(this.f1367h, this.f1366g, arrayList);
            }
            this.f1366g.clear();
            this.f1366g.add(this.f1362c);
        }
    }
}
