package com.google.android.wallet.ui.p400b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.a.a.a.a.b.a.a.e.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.co;
import com.google.android.wallet.ui.common.cp;
import java.util.ArrayList;
import java.util.List;

public final class C6731a extends au {
    public View[] f33197a;
    public ArrayList f33198b = new ArrayList();
    public final C6506n f33199c = new C6506n(1637);

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutParams layoutParams;
        int i = 0;
        View linearLayout = new LinearLayout(this.bd);
        int length = ((a) this.aD).d.length;
        if (length <= 3) {
            layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        } else {
            linearLayout.setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        this.f33197a = new View[length];
        while (i < length) {
            View[] viewArr = this.f33197a;
            co coVar = new co(((a) this.aD).d[i], this.be, au(), linearLayout);
            coVar.f33651d = h();
            coVar.f33653f = as();
            coVar.f33655h = this;
            coVar.f33657j = this;
            viewArr[i] = coVar.m30899a();
            linearLayout.addView(this.f33197a[i], layoutParams);
            long j = ((a) this.aD).d[i].d;
            Object obj = this.f33197a[i];
            cp.m30910b(((a) this.aD).d[i]);
            C6749z c6749z = new C6749z(j, obj);
            this.f33198b.add(c6749z);
            if (getExpandable() != null) {
                getExpandable().m31010a(c6749z);
            }
            i++;
        }
        if (getExpandable() != null) {
            getExpandable().m31018c();
        }
        return linearLayout;
    }

    protected final void mo5533W() {
        if (this.f33197a != null) {
            boolean z = this.aH;
            for (View enabled : this.f33197a) {
                enabled.setEnabled(z);
            }
        }
    }

    public final boolean mo5534X() {
        return this.f33197a != null;
    }

    public final C6506n getUiElement() {
        return this.f33199c;
    }

    public final List getChildren() {
        return null;
    }

    public final ArrayList aa() {
        return this.f33198b;
    }

    public final long mo5520Y() {
        ao();
        return ((a) this.aD).b;
    }

    protected final h mo5521Z() {
        return null;
    }

    public final boolean mo5535a(g gVar) {
        if (!gVar.b.b.equals(((a) this.aD).a)) {
            return false;
        }
        if (gVar.b.c != 1) {
            throw new IllegalArgumentException(String.format("Unknown FormFieldReference fieldId: %d", new Object[]{Integer.valueOf(gVar.b.c)}));
        }
        cp.m30903a(this.f33197a[gVar.b.d], gVar.c);
        return true;
    }

    public final String mo5522a(String str) {
        String str2 = null;
        if (!mo5608a(null, false)) {
            return "";
        }
        String string = i().getString(C6625i.wallet_uic_name_list_append_to_end);
        for (View a : this.f33197a) {
            CharSequence a2 = cp.m30902a(a);
            if (!TextUtils.isEmpty(a2)) {
                if (str2 == null) {
                    str2 = a2;
                } else {
                    str2 = String.format(string, new Object[]{str2, a2});
                }
            }
        }
        return str2;
    }
}
