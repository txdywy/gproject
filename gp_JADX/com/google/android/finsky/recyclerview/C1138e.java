package com.google.android.finsky.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.frameworkviews.C1098i;
import com.google.android.finsky.frameworkviews.ErrorFooter;
import com.squareup.leakcanary.C7582R;

public abstract class C1138e extends C1137h implements C1098i {
    public final LayoutInflater f7098I;
    public final Context f7099J;
    public int f7100K;

    public C1138e(Context context, boolean z, boolean z2) {
        this.f7099J = context;
        this.f7098I = LayoutInflater.from(context);
        if (z) {
            this.f7100K = 2;
        } else if (z2) {
            this.f7100K = 1;
        } else {
            this.f7100K = 0;
        }
    }

    public abstract boolean mo1444i();

    public abstract void mo1445j();

    public abstract String mo1446l();

    public View mo1498a(ViewGroup viewGroup) {
        return m6878a(C7582R.layout.header_list_spacer, viewGroup);
    }

    public final View m6881b(View view) {
        ErrorFooter errorFooter = (ErrorFooter) view;
        errorFooter.m16021a(mo1446l(), this);
        return errorFooter;
    }

    public final long mo1043b(int i) {
        return (long) i;
    }

    public final View m6878a(int i, ViewGroup viewGroup) {
        return this.f7098I.inflate(i, viewGroup, false);
    }

    public final void m6882e(int i) {
        this.f7100K = i;
        this.f3433a.m3638b();
    }

    public final void Q_() {
        if (this.f7100K == 2) {
            mo1445j();
        }
        m6882e(1);
    }
}
