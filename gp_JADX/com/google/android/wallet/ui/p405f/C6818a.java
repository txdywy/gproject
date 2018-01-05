package com.google.android.wallet.ui.p405f;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.a.j.a.a;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.co;
import com.google.android.wallet.ui.common.cp;
import java.util.ArrayList;
import java.util.List;

public final class C6818a extends au {
    public LinearLayout f33797a;
    public ArrayList f33798b = new ArrayList();
    public final C6506n f33799c = new C6506n(1666);

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C6623g.fragment_tax_info_entry, viewGroup, false);
        this.f33797a = (LinearLayout) inflate.findViewById(C6622f.tax_info_fields_container);
        this.f33797a.removeAllViews();
        this.f33798b.clear();
        al[] alVarArr = ((a) this.aD).e;
        int length = alVarArr.length;
        for (int i = 0; i < length; i++) {
            co coVar = new co(alVarArr[i], this.be, au(), this.f33797a);
            coVar.f33651d = h();
            coVar.f33653f = as();
            coVar.f33655h = this;
            View a = coVar.m30899a();
            ArrayList arrayList = this.f33798b;
            long j = alVarArr[i].d;
            cp.m30910b(alVarArr[i]);
            arrayList.add(new C6749z(j, a));
            this.f33797a.addView(a);
        }
        return inflate;
    }

    public final ArrayList aa() {
        return this.f33798b;
    }

    public final boolean mo5535a(g gVar) {
        if (!gVar.b.b.equals(((a) this.aD).c != null ? ((a) this.aD).c.a : ((a) this.aD).b)) {
            return false;
        }
        if (gVar.b.c != 1) {
            throw new IllegalArgumentException("TaxInfoForm does not support field with id: " + gVar.b.c);
        }
        int i = gVar.b.d;
        if (i < 0 || i >= ((a) this.aD).e.length) {
            throw new IllegalArgumentException("FormFieldMessage repeatedFieldIndex: " + i + " is out of range [0," + ((a) this.aD).e.length + ")");
        }
        cp.m30903a(m31038b(i), gVar.c);
        return true;
    }

    public final void mo5533W() {
        if (this.f33797a != null) {
            boolean z = this.aH;
            int childCount = this.f33797a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m31038b(i).setEnabled(z);
            }
        }
    }

    public final boolean mo5534X() {
        return true;
    }

    public final C6506n getUiElement() {
        return this.f33799c;
    }

    public final List getChildren() {
        return null;
    }

    protected final h mo5521Z() {
        ao();
        return ((a) this.aD).c;
    }

    public final View m31038b(int i) {
        return this.f33797a.getChildAt(i);
    }
}
