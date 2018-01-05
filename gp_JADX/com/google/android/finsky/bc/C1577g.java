package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.android.volley.C0657w;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.h.a.ak;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class C1577g extends C1574v {
    public C1557b f8390a;
    public C1463g f8391c;
    public RadioButton f8392f;
    public int f8393h = 0;

    public final void mo1292a(Activity activity) {
        ((C1347t) C3947d.m18649a(C1347t.class)).mo1717a(this);
        super.mo1292a(activity);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.f8392f = (RadioButton) a.findViewById(C7582R.id.share_now);
        m9114a(a, (int) C7582R.id.past_purchase_title, 7);
        m9114a(a, (int) C7582R.id.past_purchase_body, 8);
        m9114a(a, (int) C7582R.id.share_now, 9);
        m9114a(a, (int) C7582R.id.do_it_later, 11);
        return a;
    }

    public final void mo138d() {
        super.mo138d();
        this.f8392f = null;
    }

    protected final int aj() {
        return C7582R.layout.family_library_onboarding_step2;
    }

    public final boolean am() {
        return false;
    }

    protected final void ao() {
        int i = this.f8392f.isChecked() ? 2 : 1;
        this.f8393h = 0;
        int[] iArr = new int[]{3, 4, 1};
        List arrayList = new ArrayList(3);
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (this.f8390a.mo2306a(this.ag.mo2344a()).mo2319a(i3)) {
                arrayList.add(new ak().a(i3).a(true));
            }
        }
        this.bo.mo1608a((ak[]) arrayList.toArray(new ak[arrayList.size()]), new C1578h(this, i), (C0657w) this);
        if (this.f8392f.isChecked()) {
            this.bo.mo1553a(0, true, new C1579i(this, i), new C1580j(this));
        }
    }

    protected final int ap() {
        return 5229;
    }
}
