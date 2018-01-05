package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dialogbuilder.layout.DateSpinner;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.n;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.s;
import com.google.wireless.android.finsky.a.a.t;
import com.google.wireless.android.finsky.a.a.u;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class com.google.android.finsky.billing.lightpurchase.e.r extends com.google.android.finsky.billing.lightpurchase.d.h implements com.google.android.finsky.at.m, com.google.android.finsky.d.ad, com.google.android.finsky.dialogbuilder.layout.f
{

    public static final DateFormat a;
    public final com.google.wireless.android.a.a.a.a.ce b;
    public Account c;
    public com.google.wireless.android.finsky.a.a.s d;
    public DateSpinner e;
    public TextView f;

    static {
        com.google.android.finsky.billing.lightpurchase.e.r.a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    }

    r() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.b = com.google.android.finsky.d.j.a(1340);
    }

    public static com.google.android.finsky.billing.lightpurchase.e.r a(Account p0, com.google.wireless.android.finsky.a.a.s p1, PurchaseFlowConfig p2) {
        v0 = new Bundle();
        v0.putParcelable("FamilyAgeChallengeStep.account", p0);
        v0.putParcelable("FamilyAgeChallengeStep.challenge", ParcelableProto.a(p1));
        com.google.android.finsky.m.a.aH().b(v0, p2);
        v1 = new com.google.android.finsky.billing.lightpurchase.e.r();
        v1.f(v0);
        v1.d = p1;
        return v1;
    }

    private final int ab() {
        v0 = this.e.getCalendarDate();
        if (v0 == 0)
            v0 = -1;
        else {
            v1 = new GregorianCalendar();
            v1.setTimeInMillis(this.d.b.b);
            v0 = com.google.android.finsky.utils.n.a(v0, v1);
        }
        return v0;
    }

    public final void X() {
        this.a(1341, 0);
        v4 = new Object[1];
        v4[0] = NumberFormat.getIntegerInstance().format((long)this.ab());
        new com.google.android.finsky.at.k().c(this.d.b.c).a(String.format(this.d.b.d, v4)).d(this.d.b.e).e(this.d.b.f).a(1).a(this, 0, 0).a(1345, 0, 1346, 1347, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am()).a().a(this.B, 0);
    }

    public final void Y() {
        if (this.e.a())
            this.f.setVisibility(8);
        if (this.ab() >= 0)
            v1 = 1;
        else
            v1 = 0;
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).b(v1);
    }

    public final void Z() {
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ac();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v2 = p0.inflate(2130968832, p1, 0);
        v3 = (TextView)v2.findViewById(2131755114);
        v3.setText(this.d.a.b);
        v4 = (TextView)v2.findViewById(2131755755);
        v4.setText(((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ai().name);
        v0 = (TextView)v2.findViewById(2131755312);
        if (TextUtils.isEmpty(this.d.a.c))
            v0.setVisibility(8);
        else
            com.google.android.finsky.bg.ae.a(v0, this.d.a.c);
        this.e = (DateSpinner)v2.findViewById(2131755756);
        this.e.setOnDateChangedListener(this);
        if (com.google.android.finsky.m.a.j(this.c.name).a(12623303)) {
            this.e.removeAllViews();
            this.e.a(2130968724);
        }
        this.f = (TextView)v2.findViewById(2131755736);
        if (TextUtils.isEmpty(this.d.a.f))
            this.f.setVisibility(8);
        else
            com.google.android.finsky.bg.ae.a(this.f, this.d.a.f);
        com.google.android.finsky.m.a.aH().a(this.q, v2, v3, v4, 0, 0, 0, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ao());
        return v2;
    }

    public final String a(Resources p0) {
        return this.d.a.d;
    }

    public final void a(int p0, Bundle p1) {
        v1 = new Bundle();
        v1.putString("pcbd", com.google.android.finsky.billing.lightpurchase.e.r.a.format(this.e.getCalendarDate().getTime()));
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).a(v1);
    }

    public final void a(View p0, Bundle p1) {
        super.a(p0, p1);
        if (p1 == 0) {
            this.e.requestFocus();
            this.e.a.requestFocus();
        }
    }

    public final String b(Resources p0) {
        return this.d.a.e;
    }

    public final void b(int p0, Bundle p1) {
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.c = (Account)this.q.getParcelable("FamilyAgeChallengeStep.account");
        this.d = (com.google.wireless.android.finsky.a.a.s)ParcelableProto.a(this.q, "FamilyAgeChallengeStep.challenge");
    }

    public final void f_(int p0) {
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.b;
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.e.getContext(), this.d.a.b, this.e, 0);
        v0 = this.f.getText();
        if (!TextUtils.isEmpty(v0) && !this.e.a())
            com.google.android.finsky.bg.a.a(this.f.getContext(), v0, this.f, 0);
    }

}
