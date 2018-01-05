package com.google.android.finsky.stream.base.horizontalclusters.view;

import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.squareup.leakcanary.C7582R;
import java.util.HashSet;

public final class C4271d extends C1137h {
    public C4257k f21556c;
    public HashSet f21557d = new HashSet();
    public ad f21558e;
    public C4267f f21559f;
    public C4273g f21560g;
    public int f21561h;

    public C4271d(C4257k c4257k, C4267f c4267f, ad adVar, C4273g c4273g) {
        this.f21559f = c4267f;
        m19832a(c4257k, adVar, c4273g);
    }

    public final void m19832a(C4257k c4257k, ad adVar, C4273g c4273g) {
        this.f21556c = c4257k;
        this.f21560g = c4273g;
        this.f21561h = this.f21560g.f21570h ? 1 : 0;
        this.f21558e = adVar;
    }

    public final int mo1040a(int i) {
        if (i < this.f21560g.f21563a) {
            return 0;
        }
        int a = mo1039a();
        if (this.f21561h == 1) {
            if (i == a - this.f21560g.f21563a) {
                return 2;
            }
            if (this.f21560g.f21565c && i == a - this.f21560g.f21564b) {
                return 1;
            }
        } else if (this.f21560g.f21565c && i == a - this.f21560g.f21563a) {
            return 1;
        }
        return ((C4260a) this.f21560g.f21569g.get(i - this.f21560g.f21563a)).mo4068a();
    }

    public final void m19831a(C4272e c4272e) {
        if (this.f21557d.remove(c4272e)) {
            int i = c4272e.f3216f;
            if (i != 0 && i != 2 && i != 1) {
                C4260a c4260a = c4272e.f21562t;
                c4272e.f21562t = null;
                c4260a.mo4075c(c4272e.a);
            } else if (c4272e instanceof ae) {
                ((ae) c4272e).Z_();
            }
        }
    }

    public final int mo1039a() {
        if (this.f21556c == null) {
            return 0;
        }
        return this.f21560g.f21568f + this.f21560g.f21569g.size();
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C4272e c4272e = (C4272e) frVar;
        this.f21557d.add(c4272e);
        int i2 = c4272e.f3216f;
        LayoutParams layoutParams = c4272e.a.getLayoutParams();
        if (i2 == 0) {
            layoutParams.width = (this.f21559f.getLeadingPixelGap() + this.f21560g.f21566d) + this.f21559f.getSpacerExtraWidth();
        } else if (i2 == 1) {
            layoutParams.width = this.f21560g.f21566d + this.f21559f.getSpacerExtraWidth();
        } else if (i2 != 2) {
            int i3 = i - this.f21560g.f21563a;
            C4260a c4260a = (C4260a) this.f21560g.f21569g.get(i3);
            c4272e.f21562t = c4260a;
            this.f21556c.mo4067c(i3);
            c4260a.mo4071a(c4272e.a, this.f21558e);
            if (this.f21560g.f21567e != 3) {
                layoutParams.width = this.f21559f.getFixedChildWidth();
            }
            if (layoutParams.height != -1) {
                layoutParams.height = c4260a.mo4069a(layoutParams.width);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = this.f21559f.getAvailableContentHeight() - layoutParams.height;
                c4272e.a.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        if (i == 0 || i == 1) {
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new LayoutParams(-2, -1));
            view.setTag("tagIsSpacer");
            return new C4272e(view);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 2) {
            return new C4272e(from.inflate(i, viewGroup, false));
        }
        view = from.inflate(C7582R.layout.cluster_loading_cell, viewGroup, false);
        view.setTag("tagIsSpacer");
        return new C4272e(view);
    }
}
