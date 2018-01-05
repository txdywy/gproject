package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.support.v4.app.Fragment;
import android.support.v4.c.a.a;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.e.a;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.billing.e.j;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.f;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.g;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.t;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.a.a.k;

public final class com.google.android.finsky.billing.lightpurchase.e.b extends com.google.android.finsky.billing.lightpurchase.e.g implements CompoundButton$OnCheckedChangeListener
{

    public final com.google.android.finsky.d.t a;
    public TextView af;
    public com.google.android.finsky.billing.lightpurchase.e.s ag;
    public com.google.android.finsky.billing.e.e ah;
    public CheckBox aj;
    public boolean ak;
    public boolean al;
    public boolean am;
    public com.google.wireless.android.finsky.a.a.k b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public TextView g;
    public Button h;
    public CheckBox i;

    b() {
        com.google.android.finsky.billing.lightpurchase.e.g(750);
        this.a = com.google.android.finsky.m.a.aP();
        this.f = -1;
    }

    private final CharSequence a(int p0) {
        v0 = new Object[2];
        v0[0] = "SETTINGS_ACTIVITY_SENTINEL";
        v0[1] = com.google.android.finsky.aa.b.C.b();
        v0 = Html.fromHtml(this.a(p0, v0));
        UrlSpanUtils.a(v0, "SETTINGS_ACTIVITY_SENTINEL", new com.google.android.finsky.billing.lightpurchase.e.f(this));
        return v0;
    }

    private final CharSequence a(CharSequence p0) {
        if (com.google.android.finsky.m.a.j(this.an.name).a(12609807)) {
            v1 = new Object[1];
            v1[0] = com.google.android.finsky.aa.b.C.b();
            v0 = Html.fromHtml(this.a(2131951728, v1));
            if (android.support.v4.view.ai.a.k(this.g) == 1) {
                v1 = new CharSequence[3];
                v1[0] = v0;
                v1[1] = "  ";
                v1[2] = p0;
                p0 = TextUtils.concat(v1);
            }
            else {
                v1 = new CharSequence[3];
                v1[0] = p0;
                v1[1] = "  ";
                v1[2] = v0;
                p0 = TextUtils.concat(v1);
            }
        }
        return p0;
    }

    private final CharSequence ag() {
        v1 = this.ao.b(this.an.name);
        v2 = new Object[1];
        v2[0] = v1;
        v0 = Html.fromHtml(this.a(this.ao.e(), v2));
        UrlSpanUtils.a(v0, v1, new com.google.android.finsky.billing.lightpurchase.e.e(this));
        return v0;
    }

    private final void ah() {
        v1 = 0;
        if (this.h != 0) {
            if (this.e != 0 || this.as != 0)
                v0 = 1;
            else
                v0 = 0;
            if (v0 == 0)
                v1 = 8;
            this.h.setVisibility(v1);
        }
    }

    public final void X() {
        if (this.ao.a() == 3)
            this.ad();
        else
            this.b(0);
    }

    protected final void Y() {
        super.Y();
        if (com.google.android.finsky.m.a.j(this.an.name).a(12609806) && !com.google.android.finsky.m.a.j(this.an.name).a(12609807))
            this.a(1);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
 13:    this.b(p0.inflate(2130969074, p1, 0));
 34:    if (!TextUtils.isEmpty(this.b.j)) {
 45:        v0 = (TextView)this.aw.findViewById(2131756147);
 51:        v0.setText(this.b.j);
 54:        v0.setVisibility(0);
 57:        v3 = v0;
        }
        else
539:        v3 = 0;
 66:    if (!TextUtils.isEmpty(this.b.k)) {
 77:        v0 = (TextView)this.aw.findViewById(2131756148);
 83:        v0.setText(this.b.k);
 86:        v0.setVisibility(0);
        }
 97:    if (!TextUtils.isEmpty(this.b.l)) {
108:        v0 = (TextView)this.aw.findViewById(2131756151);
114:        v0.setText(this.b.l);
117:        v0.setTextColor(com.google.android.finsky.bg.h.c(this.h(), this.ap));
120:        v0.setVisibility(0);
123:        v5 = v0;
        }
        else
536:        v5 = 0;
132:    if (!TextUtils.isEmpty(this.b.v)) {
143:        v0 = (TextView)this.aw.findViewById(2131755852);
149:        v0.setText(this.b.v);
152:        v0.setVisibility(0);
        }
163:    if (!TextUtils.isEmpty(this.b.w)) {
174:        v0 = (TextView)this.aw.findViewById(2131755853);
180:        v0.setText(this.b.w);
183:        v0.setVisibility(0);
        }
192:    if (com.google.android.finsky.dfemodel.q.b(this.c)) goto 416;
194:    v0 = 1;
195:    if (v0 != 0)
216:        this.aq.a((FifeImageView)this.aw.findViewById(2131755855), this.b.u, this.c);
252:    ((TextView)this.aw.findViewById(2131755114)).setText(this.ao.d());
266:    ((TextView)this.aw.findViewById(2131755755)).setText(((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ai().name);
273:    if (!TextUtils.isEmpty(this.b.m)) {
277:        v0 = this.aw.findViewById(2131756170);
283:        ((TextView)v0).setText(this.b.m);
286:        ((TextView)v0).setVisibility(0);
        }
300:    this.af = (TextView)this.aw.findViewById(2131756019);
313:    this.i = (CheckBox)this.aw.findViewById(2131756191);
323:    if (!TextUtils.isEmpty(this.b.n)) {
334:        v0 = (TextView)this.aw.findViewById(2131756189);
344:        v0.setText(Html.fromHtml(this.b.n));
347:        v0.setVisibility(0);
        }
360:    if (com.google.android.finsky.bg.a.a(this.aw.getContext())) {
373:        this.h = (Button)this.aw.findViewById(2131756192);
377:        this.h.setOnClickListener(this);
        }
382:    v0 = this.ao.a();
386:    switch (v0) {
            case 1:
529:            this.a(2131755081, 2131951893, this.b.p);
532:            this.ab();
541:            break;
            case 2:
512:            this.a(2131755182, 2131951895, this.b.q);
515:            this.ab();
541:            break;
            case 3:
428:            this.aw.findViewById(2131756185).setVisibility(0);
431:            this.ak = 1;
469:            this.ag = new com.google.android.finsky.billing.lightpurchase.e.s(this.g(), (ImageView)this.aw.findViewById(2131756186), (TextView)this.aw.findViewById(2131756187), new com.google.android.finsky.billing.lightpurchase.e.c(this));
541:            break;
            default:
415:            throw new IllegalStateException(34 + "Unexpected auth method " + v0);
        }
416:    v0 = 0;
417:    goto 195;
498:    com.google.android.finsky.m.a.aH().a(this.q, this.aw, v3, 0, v5, (TextView)this.aw.findViewById(2131756170), 0, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ao());
501:    return this.aw;
    }

    protected final void a(int p0, int p1, String p2) {
        super.a(p0, p1, p2);
        if (this.ah.a()) {
            this.aj = (CheckBox)this.aw.findViewById(2131756190);
            this.ak = this.ah.a(this.an.name);
            if (((Boolean)com.google.android.finsky.billing.e.a.e.b(this.an.name).a()).booleanValue() && !this.ah.e())
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                v0 = (TextView)this.aw.findViewById(2131756184);
                if (this.ao.a() == 2)
                    v1 = 2131952195;
                else
                    v1 = 2131952194;
                v0.setText(v1);
                v0.setVisibility(0);
                this.ak = 1;
            }
            if (this.ak == 0) {
                this.aj.setVisibility(0);
                this.aj.setOnCheckedChangeListener(this);
            }
        }
        else
            this.aw.findViewById(2131756191).setVisibility(0);
        if (com.google.android.finsky.m.a.j(this.an.name).a(12609807))
            this.ay.setVisibility(8);
        this.g = (TextView)this.aw.findViewById(2131756188);
        this.g.setMovementMethod(LinkMovementMethod.getInstance());
        if (com.google.android.finsky.m.a.j(this.an.name).a(12605725))
            v0 = this.ag();
        else {
            v1 = new Object[1];
            v1[0] = this.ao.a(this.an.name);
            v0 = UrlSpanUtils.b(Html.fromHtml(this.a(this.ao.e(), v1)), this.ao.a(this.an.name), new com.google.android.finsky.billing.lightpurchase.e.d(this));
        }
        this.g.setText(this.a(v0));
        this.af = (TextView)this.aw.findViewById(2131756019);
        this.af.setText(this.a(2131952951));
        this.af.setMovementMethod(LinkMovementMethod.getInstance());
        this.i = (CheckBox)this.aw.findViewById(2131756191);
        if (this.b.h == 0)
            this.i.setVisibility(8);
        else {
            this.i.setOnCheckedChangeListener(this);
            v0 = this.q.getString("AuthChallengeStep.challengeGaiaOptOutLabel");
            if (TextUtils.isEmpty(v0))
                v0 = this.c(2131951730);
            this.i.setText(v0);
            this.e = this.b.h.d;
            this.i.setChecked(this.e);
        }
    }

    protected final void a(Bundle p0) {
        p0.putString(this.b.d, String.valueOf(this.d));
        if (this.e != 0) {
            v3 = com.google.android.finsky.billing.e.j.b(this.an.name);
            if (v3 == 0) {
                v1 = new Object[1];
                v1[0] = Integer.valueOf(v3);
                FinskyLog.e("Got through auth while opted out? Previous=%d", v1);
            }
            com.google.android.finsky.m.a.aQ().a(this.an.name, 0, Integer.valueOf(v3), "purchase-auth-screen", ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am());
        }
        com.google.android.finsky.billing.e.j.a(this.an.name, this.ak, "purchase-auth-screen", ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am());
        com.google.android.finsky.aa.a.W.b(this.an.name).a(Long.valueOf(System.currentTimeMillis()));
    }

    protected final void a(boolean p0) {
        this.as = p0;
        this.ab();
    }

    public final void ab() {
        v0 = 2131952950;
        v1 = 1;
        v2 = 0;
        v4 = com.google.android.finsky.billing.e.j.b(this.an.name);
        if (v4 == 0)
            v1 = 0;
        else if (this.b.o == 0)
            v1 = 0;
        else {
            if (v4 == 1)
                v0 = 2131952952;
            else if (v4 != 2) {
                v1 = new Object[1];
                v1[0] = Integer.valueOf(v4);
                FinskyLog.e("Unexpected value for PurchaseAuth message %d", v1);
                v1 = 0;
            }
            this.aA.setText(this.a(v0));
        }
        if (v1 != 0 && this.as != 0)
            v0 = 0;
        else
            v0 = 8;
        this.aA.setVisibility(v0);
        if (com.google.android.finsky.m.a.j(this.an.name).a(12609807))
            v0 = this.g;
        else {
            v0 = this.g;
            if (this.as == 0)
                v2 = 8;
        }
        v0.setVisibility(v2);
        this.ah();
    }

    protected final void ac() {
        this.ar.a(this.an.name, this.ax.getText().toString(), ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am());
    }

    final void ad() {
        this.e(0);
        this.ao.k = 0;
        ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).a(this.b, this.ao);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.b = (com.google.wireless.android.finsky.a.a.k)ParcelableProto.a(this.q, "AuthChallengeStep.challenge");
        this.c = this.q.getInt("AuthChallengeStep.documentType");
        this.e = 0;
        this.ak = 0;
        if (p0 != 0) {
            this.d = p0.getInt("AuthChallengeStep.retryCount");
            this.e = p0.getBoolean("AuthChallengeStep.optOutSelected");
            this.ak = p0.getBoolean("AuthChallengeStep.fingerprintOptInSelected");
            this.al = p0.getBoolean("AuthChallengeStep.fingerprintAuthenticationComplete");
            this.f = p0.getInt("AuthChallengeStep.PurchaseAuthBeforeManageSettings");
            this.am = p0.getBoolean("AuthChallengeStep.stepFragmentReadyLogged");
        }
        this.ah = new com.google.android.finsky.billing.e.e(android.support.v4.c.a.a.a(this.g()));
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putInt("AuthChallengeStep.retryCount", this.d);
        p0.putBoolean("AuthChallengeStep.optOutSelected", this.e);
        p0.putBoolean("AuthChallengeStep.fingerprintOptInSelected", this.ak);
        p0.putBoolean("AuthChallengeStep.fingerprintAuthenticationComplete", this.al);
        p0.putBoolean("AuthChallengeStep.stepFragmentReadyLogged", this.am);
        p0.putInt("AuthChallengeStep.PurchaseAuthBeforeManageSettings", this.f);
    }

    public final void onCheckedChanged(CompoundButton p0, boolean p1) {
        if (p0 == this.i) {
            this.a(753, 0);
            this.e = p1;
            if (p1 != 0) {
                this.a(0);
                this.af.setVisibility(0);
            }
            else
                this.af.setVisibility(8);
            this.ah();
        }
        else if (p0 == this.aj) {
            this.a(755, 0);
            this.ak = p1;
        }
    }

    public final void onClick(View p0) {
        v0 = 0;
        if (p0 == this.ay) {
            this.a(752, 0);
            if (this.as == 0)
                v0 = 1;
            this.a(v0);
        }
        else if (p0 == this.h) {
            this.f = com.google.android.finsky.billing.e.j.b(this.an.name);
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).af();
        }
    }

    public final void u() {
        super.u();
        if (Build$VERSION.SDK_INT >= 23 && this.ag != 0 && this.al == 0) {
            if (!this.ag.g.a())
                this.ag.e.b();
            else {
                this.ag.f = new CancellationSignal();
                this.ag.h = 0;
                this.ag.b.authenticate(0, this.ag.f, 0, this.ag, 0);
                this.ag.d.setTextColor(this.ag.d.getResources().getColor(2131558503, 0));
                this.ag.d.setText(this.ag.d.getResources().getString(2131952199));
                this.ag.c.setImageResource(2130837715);
            }
        }
        if (this.g != 0 && com.google.android.finsky.m.a.j(this.an.name).a(12605725))
            this.g.setText(this.a(this.ag()));
        if (this.ax != 0 && !this.aa().al() && this.ax.getVisibility() == 0)
            com.google.android.finsky.bg.s.a(this.h(), this.ax);
        if (this.am == 0) {
            this.a.c(((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am(), "purchase_fragment_auth_challenge");
            this.am = 1;
        }
    }

    public final void v() {
        super.v();
        if (Build$VERSION.SDK_INT >= 23 && this.ag != 0)
            this.ag.a();
    }

}
