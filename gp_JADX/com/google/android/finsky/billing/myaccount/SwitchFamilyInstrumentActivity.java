package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.frameworkviews.ButtonBar;
import com.google.android.finsky.frameworkviews.C1056b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.h.a.h;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class SwitchFamilyInstrumentActivity extends C1647h implements OnItemClickListener, C0998m, C1087t, C1056b {
    public bu f10157n;
    public ListView f10158o;
    public View f10159p;
    public View f10160q;
    public ButtonBar f10161r;
    public ao[] f10162s;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C7582R.layout.billing_family_instrument_chooser);
        this.f10158o = (ListView) findViewById(C7582R.id.choices);
        this.f10159p = findViewById(C7582R.id.progress_bar);
        this.f10160q = findViewById(C7582R.id.chooser_content);
        this.f10161r = (ButtonBar) findViewById(C7582R.id.button_bar);
        this.f10161r.setPositiveButtonTitle((int) C7582R.string.ok);
        this.f10161r.setNegativeButtonTitle((int) C7582R.string.cancel);
        this.f10161r.setClickListener(this);
        this.f10162s = (ao[]) ParcelableProtoArray.m21676a(getIntent(), "SwitchFamilyInstrumentActivity.instruments");
        List arrayList = new ArrayList(this.f10162s.length);
        int i = -1;
        for (int i2 = 0; i2 < this.f10162s.length; i2++) {
            if (this.f10162s[i2].w != null) {
                i = i2;
            }
            this.E.m13370a(new C2488p().m13345b(this).m13340a(818).m13343a(this.f10162s[i2].v));
            arrayList.add(i2, this.f10162s[i2].d);
        }
        this.f10158o.setAdapter(new ArrayAdapter(this, 17367055, arrayList));
        this.f10158o.setItemsCanFocus(false);
        this.f10158o.setChoiceMode(1);
        this.f10158o.setOnItemClickListener(this);
        if (i != -1) {
            this.f10158o.setItemChecked(i, true);
        }
        m10547h();
        m10548i();
        if (bundle == null) {
            this.f10157n = bu.m10620a(this.B);
            H_().mo284a().mo328a(this.f10157n, "SwitchFamilyInstrumentActivity.sidecar").mo334c();
            return;
        }
        this.f10157n = (bu) H_().mo283a("SwitchFamilyInstrumentActivity.sidecar");
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        m10547h();
    }

    protected void onStart() {
        super.onStart();
        this.f10157n.m6757a((C1087t) this);
    }

    protected void onStop() {
        this.f10157n.m6757a(null);
        super.onStop();
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m10547h();
    }

    private final void m10546c(int i) {
        setResult(i);
        finish();
    }

    private final void m10547h() {
        this.f10161r.setPositiveButtonEnabled(this.f10158o.getCheckedItemPosition() != -1);
    }

    private final void m10548i() {
        this.f10159p.setVisibility(4);
        this.f10160q.setVisibility(0);
    }

    public final void u_() {
        ao aoVar = this.f10162s[this.f10158o.getCheckedItemPosition()];
        this.E.m13379b(new C2475d(this).m13256a(5201).m13258a(aoVar.v));
        if (aoVar.w == null) {
            C1089s c1089s = this.f10157n;
            C2495w c2495w = this.E;
            c2495w.m13367a(new C2474c(345));
            h hVar = new h();
            hVar.a = aoVar;
            c1089s.f10277c.mo1569a(hVar, new bw(c1089s, c2495w), new bv(c1089s, c2495w));
            c1089s.m6758b(1, 0);
            return;
        }
        m10546c(0);
    }

    public final void v_() {
        m10546c(0);
    }

    public final void mo1423a(C1089s c1089s) {
        int i = c1089s.f6948l;
        if (i == 2) {
            m10546c(-1);
        } else if (i == 1) {
            this.f10160q.setVisibility(4);
            this.f10159p.setVisibility(0);
        } else if (c1089s.f6948l == 3) {
            String str = this.f10157n.f10276b;
            C1508k c1508k = new C1508k();
            c1508k.m8852a(str).m8860d((int) C7582R.string.ok).m8851a(null, 0, null);
            c1508k.mo2272a().m625a(H_(), "SwitchFamilyInstrumentActivity.error_dialog");
        }
    }

    protected final int mo2368f() {
        return 5200;
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 0) {
            m10548i();
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
    }
}
