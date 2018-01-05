package android.support.v7.widget;

import java.util.Comparator;

final class cw implements Comparator {
    cw() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        cy cyVar = (cy) obj;
        cy cyVar2 = (cy) obj2;
        if ((cyVar.f3344d == null ? 1 : 0) != (cyVar2.f3344d == null ? 1 : 0)) {
            if (cyVar.f3344d == null) {
                return 1;
            }
            return -1;
        } else if (cyVar.f3341a == cyVar2.f3341a) {
            int i = cyVar2.f3342b - cyVar.f3342b;
            if (i != 0) {
                return i;
            }
            i = cyVar.f3343c - cyVar2.f3343c;
            if (i == 0) {
                return 0;
            }
            return i;
        } else if (cyVar.f3341a) {
            return -1;
        } else {
            return 1;
        }
    }
}
