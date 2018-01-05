package com.google.android.finsky.family.library;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.family.p199a.C3035e;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C3057h extends C3035e implements C3056g {
    public C2162a ah = C1473m.f7980a.bn();
    public String ai;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        s_();
        this.ai = this.f760q.getString("FamilyLibraryUrl");
    }

    public final void mo2865a(Menu menu, MenuInflater menuInflater) {
        super.mo2865a(menu, menuInflater);
        menu.clear();
        menuInflater.inflate(C7582R.menu.family_library_x_vertical_destination, menu);
    }

    public final boolean mo2866a(MenuItem menuItem) {
        if (menuItem.getItemId() == C7582R.id.go_to_family_library_settings) {
            this.bp.mo3703f();
        }
        return true;
    }

    protected final int aq() {
        return 0;
    }

    protected final String ar() {
        return m592c((int) C7582R.string.family_library_label);
    }

    public final int af() {
        C3060k c3060k = (C3060k) aj();
        if (c3060k != null) {
            return C1608h.m9243a(m603h(), c3060k.f15948s);
        }
        return C1608h.m9243a(m603h(), 3);
    }

    public final void mo180b(int i) {
        super.mo180b(i);
        m15667f(as());
    }

    public final void cg_() {
        super.cg_();
        m15667f(as());
    }

    protected final List ap() {
        List arrayList = new ArrayList();
        C1552e j = C1473m.f7980a.mo2249j(this.bo.mo1636c());
        arrayList.add(m15718b(3, 0));
        if (j.mo2294a(12604246)) {
            arrayList.add(m15718b(4, 1));
        }
        if (j.mo2294a(12604245)) {
            arrayList.add(m15718b(1, 2));
        }
        return arrayList;
    }

    protected final int ao() {
        return 25;
    }

    private final C3060k m15718b(int i, int i2) {
        DfeToc dn = C1473m.f7980a.dn();
        return new C3060k(i2, dn.m14606a(i).d.toUpperCase(m605i().getConfiguration().locale), this, this.bp, this.bw, this.bo, this, i, this.ai);
    }

    public final void mo3278a(int i) {
        C3060k c3060k = (C3060k) aj();
        if (i != c3060k.f15954y) {
            c3060k.f15954y = i;
            c3060k.m_();
        }
    }

    private final int as() {
        if (aj() != null) {
            return ((C3060k) aj()).f15948s;
        }
        return 3;
    }
}
