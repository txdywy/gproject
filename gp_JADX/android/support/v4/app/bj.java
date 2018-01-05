package android.support.v4.app;

import android.support.v4.view.ai;
import android.view.View;
import java.util.ArrayList;

final class bj implements Runnable {
    public final /* synthetic */ int f1406a;
    public final /* synthetic */ ArrayList f1407b;
    public final /* synthetic */ ArrayList f1408c;
    public final /* synthetic */ ArrayList f1409d;
    public final /* synthetic */ ArrayList f1410e;

    bj(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1406a = i;
        this.f1407b = arrayList;
        this.f1408c = arrayList2;
        this.f1409d = arrayList3;
        this.f1410e = arrayList4;
    }

    public final void run() {
        for (int i = 0; i < this.f1406a; i++) {
            ai.m1832a((View) this.f1407b.get(i), (String) this.f1408c.get(i));
            ai.m1832a((View) this.f1409d.get(i), (String) this.f1410e.get(i));
        }
    }
}
