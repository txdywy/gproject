package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.at.k;
import com.google.android.finsky.billing.common.b;
import com.google.android.finsky.billing.common.h;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.h.a.h;
import java.util.ArrayList;

public final class SwitchFamilyInstrumentActivity extends com.google.android.finsky.billing.common.h implements AdapterView$OnItemClickListener, com.google.android.finsky.at.m, com.google.android.finsky.billing.common.t, com.google.android.finsky.frameworkviews.b
{

    public com.google.android.finsky.billing.myaccount.bu n;
    public ListView o;
    public View p;
    public View q;
    public ButtonBar r;
    public ao[] s;

    SwitchFamilyInstrumentActivity() {
        com.google.android.finsky.billing.common.h();
    }

    private final void c(int p0) {
        this.setResult(p0);
        this.finish();
    }

    private final void h() {
        if (this.o.getCheckedItemPosition() != -1)
            v0 = 1;
        else
            v0 = 0;
        this.r.setPositiveButtonEnabled(v0);
    }

    private final void i() {
        this.p.setVisibility(4);
        this.q.setVisibility(0);
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 0)
            this.i();
    }

    public final void a(com.google.android.finsky.billing.common.s p0) {
        if (p0.l == 2)
            this.c(-1);
        else if (p0.l == 1) {
            this.q.setVisibility(4);
            this.p.setVisibility(0);
        }
        else if (p0.l == 3) {
            v1 = new com.google.android.finsky.at.k();
            v1.a(this.n.b).d(2131952688).a(0, 0, 0);
            v1.a().a(this.H_(), "SwitchFamilyInstrumentActivity.error_dialog");
        }
    }

    public final void b(int p0, Bundle p1) {
    }

    protected final int f() {
        return 5200;
    }

    public final void f_(int p0) {
    }

    protected void onCreate(Bundle p0) {
        super.onCreate(p0);
        this.setContentView(2130968648);
        this.o = (ListView)this.findViewById(2131755382);
        this.p = this.findViewById(2131755380);
        this.q = this.findViewById(2131755381);
        this.r = (ButtonBar)this.findViewById(2131755403);
        this.r.setPositiveButtonTitle(2131952688);
        this.r.setNegativeButtonTitle(2131951799);
        this.r.setClickListener(this);
        this.s = (ao[])ParcelableProtoArray.a(this.getIntent(), "SwitchFamilyInstrumentActivity.instruments");
        v4 = new ArrayList(this.s.length);
        v0 = 0;
        v2 = -1;
        while (v0 < this.s.length) {
            if (this.s[v0].w != 0)
                v2 = v0;
            this.E.a(new com.google.android.finsky.d.p().b(this).a(818).a(this.s[v0].v));
            v4.add(v0, this.s[v0].d);
            v0 = v0 + 1;
        }
        this.o.setAdapter(new ArrayAdapter(this, 17367055, v4));
        this.o.setItemsCanFocus(0);
        this.o.setChoiceMode(1);
        this.o.setOnItemClickListener(this);
        if (v2 != -1)
            this.o.setItemChecked(v2, 1);
        this.h();
        this.i();
        if (p0 == 0) {
            this.n = com.google.android.finsky.billing.myaccount.bu.a(this.B);
            this.H_().a().a(this.n, "SwitchFamilyInstrumentActivity.sidecar").c();
        }
        else
            this.n = (com.google.android.finsky.billing.myaccount.bu)this.H_().a("SwitchFamilyInstrumentActivity.sidecar");
    }

    public void onItemClick(AdapterView p0, View p1, int p2, long p3) {
        this.h();
    }

    protected void onRestoreInstanceState(Bundle p0) {
        super.onRestoreInstanceState(p0);
        this.h();
    }

    protected void onStart() {
        super.onStart();
        this.n.a(this);
    }

    protected void onStop() {
        this.n.a(0);
        super.onStop();
    }

    public final void u_() {
        v0 = this.s[this.o.getCheckedItemPosition()];
        this.E.b(new com.google.android.finsky.d.d(this).a(5201).a(v0.v));
        if (v0.w == 0) {
            this.E.a(new com.google.android.finsky.d.c(345));
            v3 = new com.google.wireless.android.finsky.dfe.h.a.h();
            v3.a = v0;
            this.n.c.a(v3, new com.google.android.finsky.billing.myaccount.bw(this.n, this.E), new com.google.android.finsky.billing.myaccount.bv(this.n, this.E));
            this.n.b(1, 0);
        }
        else
            this.c(0);
    }

    public final void v_() {
        this.c(0);
    }

}
