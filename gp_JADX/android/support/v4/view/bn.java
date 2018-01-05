package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

final class bn implements Comparator {
    bn() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bf bfVar = (bf) ((View) obj).getLayoutParams();
        bf bfVar2 = (bf) ((View) obj2).getLayoutParams();
        if (bfVar.f1874a != bfVar2.f1874a) {
            return bfVar.f1874a ? 1 : -1;
        } else {
            return bfVar.f1878e - bfVar2.f1878e;
        }
    }
}
