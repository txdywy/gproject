package android.support.v7.widget;

import java.util.ArrayList;

final class by implements Runnable {
    public final /* synthetic */ ArrayList f3234a;
    public final /* synthetic */ bx f3235b;

    by(bx bxVar, ArrayList arrayList) {
        this.f3235b = bxVar;
        this.f3234a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f3234a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ch chVar = (ch) arrayList.get(i);
            this.f3235b.animateMoveImpl(chVar.f3269a, chVar.f3270b, chVar.f3271c, chVar.f3272d, chVar.f3273e);
            i = i2;
        }
        this.f3234a.clear();
        this.f3235b.mMovesList.remove(this.f3234a);
    }
}
