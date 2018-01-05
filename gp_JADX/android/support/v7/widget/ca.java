package android.support.v7.widget;

import java.util.ArrayList;

final class ca implements Runnable {
    public final /* synthetic */ ArrayList f3239a;
    public final /* synthetic */ bx f3240b;

    ca(bx bxVar, ArrayList arrayList) {
        this.f3240b = bxVar;
        this.f3239a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f3239a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.f3240b.animateAddImpl((fr) obj);
        }
        this.f3239a.clear();
        this.f3240b.mAdditionsList.remove(this.f3239a);
    }
}
