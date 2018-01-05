package com.google.android.finsky.family.p201c;

import android.os.Bundle;
import android.support.v7.widget.em;
import com.android.volley.C0660x;
import com.google.android.finsky.billing.myaccount.C1998e;
import com.google.wireless.android.finsky.dfe.h.a.ak;
import com.google.wireless.android.finsky.dfe.h.a.al;
import com.google.wireless.android.finsky.dfe.h.a.am;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C3048i extends C1998e implements C0660x, C3047k {
    public al[] ag;
    public List f15916h = new ArrayList();

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        C3049j.f15917a = this;
    }

    public final void mo1346w() {
        super.mo1346w();
        C3049j.f15917a = null;
    }

    public final boolean ah() {
        return this.f15916h.size() != 0;
    }

    protected final void aa() {
        this.bo.mo1648f(this, this);
    }

    protected final em ai() {
        return new C3044f(m603h(), this.bp, this.ag, this.f15916h, this.a, this, this.bw);
    }

    protected final int aj() {
        return C7582R.string.family_library_settings_title;
    }

    protected final int ao() {
        return 2670;
    }

    public final void mo3277a(int i, boolean z) {
        for (ak akVar : this.f15916h) {
            if (akVar.c == i) {
                akVar.a(z);
                m_();
                return;
            }
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        am amVar = (am) obj;
        this.f15916h.clear();
        Collections.addAll(this.f15916h, amVar.a);
        this.ag = amVar.b;
        m_();
    }
}
