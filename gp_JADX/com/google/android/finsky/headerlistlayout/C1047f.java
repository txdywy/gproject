package com.google.android.finsky.headerlistlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.headerlist.i;
import com.google.android.play.search.PlaySearchToolbar;

public abstract class C1047f extends i {
    public View f6436e;

    public C1047f(Context context) {
        super(context);
    }

    public abstract int mo1305a();

    public void mo1395a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    protected final void m6281c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int v = mo3042v();
        if (v <= 0) {
            this.f6436e = layoutInflater.inflate(mo1305a(), viewGroup, false);
            viewGroup.addView(this.f6436e);
            return;
        }
        layoutInflater.inflate(mo1305a(), viewGroup, true);
        this.f6436e = viewGroup.findViewById(v);
    }

    public int mo3042v() {
        return -1;
    }

    public void mo1396a(ViewGroup viewGroup) {
    }

    public int mo1440t() {
        return PlaySearchToolbar.a(this.f);
    }

    public boolean mo1398f() {
        return false;
    }

    public int mo1441u() {
        return 2;
    }

    public int mo1399i() {
        return 0;
    }

    public int mo1403q() {
        return 0;
    }

    public boolean mo1400j() {
        return true;
    }

    public int mo1397d() {
        return 1;
    }

    public int mo1394a(Context context) {
        return PlaySearchToolbar.a(context);
    }

    public int mo1401o() {
        return 0;
    }

    public C3161c mo1402p() {
        return null;
    }
}
