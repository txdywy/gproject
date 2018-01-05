package com.google.android.finsky.billing.lightpurchase.p160e;

import android.accounts.Account;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.dialogbuilder.layout.C1939f;
import com.google.android.finsky.dialogbuilder.layout.DateSpinner;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4683n;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.s;
import com.google.wireless.android.finsky.a.a.t;
import com.google.wireless.android.finsky.a.a.u;
import com.squareup.leakcanary.C7582R;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class C1940r extends C1076h implements C0998m, ad, C1939f {
    public static final DateFormat f9905a = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public final ce f9906b = C2482j.m13283a(1340);
    public Account f9907c;
    public s f9908d;
    public DateSpinner f9909e;
    public TextView f9910f;

    public static C1940r m10352a(Account account, s sVar, PurchaseFlowConfig purchaseFlowConfig) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("FamilyAgeChallengeStep.account", account);
        bundle.putParcelable("FamilyAgeChallengeStep.challenge", ParcelableProto.m21671a((C0757i) sVar));
        C1473m.f7980a.aH().m9785b(bundle, purchaseFlowConfig);
        Fragment c1940r = new C1940r();
        c1940r.m600f(bundle);
        c1940r.f9908d = sVar;
        return c1940r;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        Bundle bundle2 = this.f760q;
        this.f9907c = (Account) bundle2.getParcelable("FamilyAgeChallengeStep.account");
        this.f9908d = (s) ParcelableProto.m21673a(bundle2, "FamilyAgeChallengeStep.challenge");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.family_age_verification_challenge, viewGroup, false);
        u uVar = this.f9908d.a;
        TextView textView = (TextView) inflate.findViewById(C7582R.id.title);
        textView.setText(uVar.b);
        TextView textView2 = (TextView) inflate.findViewById(C7582R.id.account);
        textView2.setText(((aq) aa()).ai().name);
        TextView textView3 = (TextView) inflate.findViewById(C7582R.id.description);
        String str = uVar.c;
        if (TextUtils.isEmpty(str)) {
            textView3.setVisibility(8);
        } else {
            ae.m9217a(textView3, str);
        }
        this.f9909e = (DateSpinner) inflate.findViewById(C7582R.id.date_spinner);
        this.f9909e.setOnDateChangedListener(this);
        if (C1473m.f7980a.mo2249j(this.f9907c.name).mo2294a(12623303)) {
            DateSpinner dateSpinner = this.f9909e;
            dateSpinner.removeAllViews();
            dateSpinner.m14909a(C7582R.layout.date_spinner_vertical);
        }
        this.f9910f = (TextView) inflate.findViewById(C7582R.id.error_message);
        String str2 = uVar.f;
        if (TextUtils.isEmpty(str2)) {
            this.f9910f.setVisibility(8);
        } else {
            ae.m9217a(this.f9910f, str2);
        }
        C1473m.f7980a.aH().m9782a(this.f760q, inflate, textView, textView2, null, null, null, ((aq) aa()).ao());
        return inflate;
    }

    public final void mo1410a(View view, Bundle bundle) {
        super.mo1410a(view, bundle);
        if (bundle == null) {
            DateSpinner dateSpinner = this.f9909e;
            dateSpinner.requestFocus();
            dateSpinner.f15132a.requestFocus();
        }
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(this.f9909e.getContext(), this.f9908d.a.b, this.f9909e, false);
        CharSequence text = this.f9910f.getText();
        if (!TextUtils.isEmpty(text) && !this.f9909e.m14910a()) {
            C1601a.m9199a(this.f9910f.getContext(), text, this.f9910f, false);
        }
    }

    public final String mo1406a(Resources resources) {
        return this.f9908d.a.d;
    }

    public final String mo2536b(Resources resources) {
        return this.f9908d.a.e;
    }

    public final void mo1405X() {
        m6694a(1341, null);
        t tVar = this.f9908d.b;
        String format = NumberFormat.getIntegerInstance().format((long) ab());
        new C1508k().m8859c(tVar.c).m8852a(String.format(tVar.d, new Object[]{format})).m8861d(tVar.e).m8863e(tVar.f).m8853a(true).m8851a(this, 0, null).m8849a(1345, null, 1346, 1347, ((aq) aa()).am()).mo2272a().m625a(this.f730B, null);
    }

    public final void mo2535Z() {
        ((aq) aa()).ac();
    }

    public final void mo2545Y() {
        if (this.f9909e.m14910a()) {
            this.f9910f.setVisibility(8);
        }
        ((aq) aa()).mo1422b(ab() >= 0);
    }

    public final void mo1202a(int i, Bundle bundle) {
        String format = f9905a.format(this.f9909e.getCalendarDate().getTime());
        Bundle bundle2 = new Bundle();
        bundle2.putString("pcbd", format);
        ((aq) aa()).mo2520a(bundle2);
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public final ce getPlayStoreUiElement() {
        return this.f9906b;
    }

    private final int ab() {
        Calendar calendarDate = this.f9909e.getCalendarDate();
        if (calendarDate == null) {
            return -1;
        }
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.f9908d.b.b);
        return C4683n.m21822a(calendarDate, gregorianCalendar);
    }
}
