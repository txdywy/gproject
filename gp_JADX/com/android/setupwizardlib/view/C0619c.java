package com.android.setupwizardlib.view;

import android.support.v7.widget.em;
import android.support.v7.widget.eo;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public final class C0619c extends em {
    public em f3995c;
    public View f3996d;
    public final eo f3997e = new C0620d(this);

    public C0619c(em emVar) {
        this.f3995c = emVar;
        this.f3995c.mo5196a(this.f3997e);
        b_(this.f3995c.f3434b);
    }

    public final fr mo1041a(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.f3995c.mo1041a(viewGroup, i);
        }
        View frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new LayoutParams(-1, -2));
        return new C0621e(frameLayout);
    }

    public final void mo1042a(fr frVar, int i) {
        if (this.f3996d != null) {
            i--;
        }
        if (!(frVar instanceof C0621e)) {
            this.f3995c.mo1042a(frVar, i);
        } else if (this.f3996d == null) {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        } else {
            if (this.f3996d.getParent() != null) {
                ((ViewGroup) this.f3996d.getParent()).removeView(this.f3996d);
            }
            ((FrameLayout) frVar.f3211a).addView(this.f3996d);
        }
    }

    public final int mo1040a(int i) {
        if (this.f3996d != null) {
            i--;
        }
        if (i < 0) {
            return Integer.MAX_VALUE;
        }
        return this.f3995c.mo1040a(i);
    }

    public final int mo1039a() {
        int a = this.f3995c.mo1039a();
        if (this.f3996d != null) {
            return a + 1;
        }
        return a;
    }

    public final long mo1043b(int i) {
        if (this.f3996d != null) {
            i--;
        }
        if (i < 0) {
            return Long.MAX_VALUE;
        }
        return this.f3995c.mo1043b(i);
    }
}
