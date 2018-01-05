package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.ai;
import android.support.v4.view.p038a.C0333b;
import android.support.v4.view.p038a.C0337f;

final class ah extends C0337f {
    public final /* synthetic */ ae f2073b;

    ah(ae aeVar) {
        this.f2073b = aeVar;
    }

    public final C0333b mo457a(int i) {
        return C0333b.m1763a(this.f2073b.m2164a(i));
    }

    public final boolean mo458a(int i, int i2, Bundle bundle) {
        ae aeVar = this.f2073b;
        switch (i) {
            case -1:
                return ai.f1848a.mo389a(aeVar.f2068j, i2, bundle);
            default:
                switch (i2) {
                    case 1:
                        if (!aeVar.f2068j.isFocused() && !aeVar.f2068j.requestFocus()) {
                            return false;
                        }
                        if (aeVar.f2071m == i) {
                            return false;
                        }
                        if (aeVar.f2071m != Integer.MIN_VALUE) {
                            aeVar.m2173c(aeVar.f2071m);
                        }
                        aeVar.f2071m = i;
                        aeVar.m2169a(i, 8);
                        return true;
                    case 2:
                        return aeVar.m2173c(i);
                    case 64:
                        if (!aeVar.f2067i.isEnabled() || !aeVar.f2067i.isTouchExplorationEnabled()) {
                            return false;
                        }
                        if (aeVar.f2070l == i) {
                            return false;
                        }
                        if (aeVar.f2070l != Integer.MIN_VALUE) {
                            aeVar.m2171b(aeVar.f2070l);
                        }
                        aeVar.f2070l = i;
                        aeVar.f2068j.invalidate();
                        aeVar.m2169a(i, 32768);
                        return true;
                    case 128:
                        return aeVar.m2171b(i);
                    default:
                        return aeVar.mo1026b(i, i2);
                }
        }
    }

    public final C0333b mo459b(int i) {
        int i2;
        if (i == 2) {
            i2 = this.f2073b.f2070l;
        } else {
            i2 = this.f2073b.f2071m;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo457a(i2);
    }
}
