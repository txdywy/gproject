package com.google.android.finsky.stream.controllers.assist.p253a;

import android.content.Context;
import android.text.format.Formatter;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dk.C2826c;
import com.google.android.finsky.dk.C2829f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.controllers.assist.C4304f;
import com.google.android.finsky.stream.controllers.view.MyAppsAssistDataCard;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C4305a extends C4304f implements C2829f {
    public final C2826c f21753p;
    public OnClickListener f21754q;
    public OnClickListener f21755r;

    public C4305a(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0988c c0988c, C2826c c2826c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, "LOW_STORAGE", c0988c);
        this.f21753p = c2826c;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21753p.m14951a(this);
        this.f21753p.m14955c();
    }

    public final void mo4061q() {
        super.mo4061q();
        this.f21753p.m14954b(this);
        this.f21754q = null;
        this.f21755r = null;
    }

    public final void cc_() {
        m20016e();
    }

    protected final int mo4110b() {
        return 2829;
    }

    protected final int mo4111c() {
        return C7582R.layout.my_apps_assist_data_card;
    }

    protected final void mo4109a(View view) {
        if (this.f21753p.m14952a()) {
            this.f21753p.m14955c();
            double max = Math.max(1.0d - (((double) this.f21753p.f15205g) / ((double) this.f21753p.f15204f)), 0.0625d);
            if (this.f21754q == null) {
                this.f21754q = new C4306b(this);
            }
            if (this.f21755r == null) {
                this.f21755r = new C4307c(this);
            }
            ((MyAppsAssistDataCard) view).m21028a(this.e.getString(C7582R.string.myapps_low_storage_assist_title), this.e.getString(C7582R.string.myapps_low_storage_assist_description), Formatter.formatShortFileSize(this.e, this.f21753p.f15205g), max, 1, this.e.getString(C7582R.string.myapps_low_storage_assist_action_button), this.f21754q, this.f21755r);
            return;
        }
        FinskyLog.m21669e("Tried to render storage card without storage data", new Object[0]);
    }

    public final boolean mo4113d() {
        if (!this.a.m20032b() && this.f21753p.m14952a() && this.f21753p.m14953b() == 1) {
            return true;
        }
        return false;
    }

    final void m20020b(int i) {
        if (this.i != null) {
            this.i.m13379b(new C2475d(this).m13256a(i));
        }
    }
}
