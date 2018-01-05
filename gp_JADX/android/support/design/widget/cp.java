package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class cp extends an {
    public cq f547o;
    public int f548p = 0;
    public int f549q = 0;

    public cp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean mo69a(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo87b(coordinatorLayout, view, i);
        if (this.f547o == null) {
            this.f547o = new cq(view);
        }
        cq cqVar = this.f547o;
        cqVar.f959b = cqVar.f958a.getTop();
        cqVar.f960c = cqVar.f958a.getLeft();
        cqVar.m771a();
        if (this.f548p != 0) {
            this.f547o.m772a(this.f548p);
            this.f548p = 0;
        }
        if (this.f549q != 0) {
            cqVar = this.f547o;
            int i2 = this.f549q;
            if (cqVar.f962e != i2) {
                cqVar.f962e = i2;
                cqVar.m771a();
            }
            this.f549q = 0;
        }
        return true;
    }

    protected void mo87b(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m460a(view, i);
    }

    public boolean a_(int i) {
        if (this.f547o != null) {
            return this.f547o.m772a(i);
        }
        this.f548p = i;
        return false;
    }

    public int mo86c() {
        if (this.f547o != null) {
            return this.f547o.f961d;
        }
        return 0;
    }
}
