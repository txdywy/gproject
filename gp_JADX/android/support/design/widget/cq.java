package android.support.design.widget;

import android.support.v4.view.ai;
import android.view.View;

final class cq {
    public final View f958a;
    public int f959b;
    public int f960c;
    public int f961d;
    public int f962e;

    public cq(View view) {
        this.f958a = view;
    }

    final void m771a() {
        ai.m1844d(this.f958a, this.f961d - (this.f958a.getTop() - this.f959b));
        ai.m1847e(this.f958a, this.f962e - (this.f958a.getLeft() - this.f960c));
    }

    public final boolean m772a(int i) {
        if (this.f961d == i) {
            return false;
        }
        this.f961d = i;
        m771a();
        return true;
    }
}
