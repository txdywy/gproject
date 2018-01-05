package android.support.v7.widget;

import java.util.ArrayList;

final class bz implements Runnable {
    public final /* synthetic */ ArrayList f3236a;
    public final /* synthetic */ bx f3237b;

    bz(bx bxVar, ArrayList arrayList) {
        this.f3237b = bxVar;
        this.f3236a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f3236a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.f3237b.animateChangeImpl((cg) obj);
        }
        this.f3236a.clear();
        this.f3237b.mChangesList.remove(this.f3236a);
    }
}
