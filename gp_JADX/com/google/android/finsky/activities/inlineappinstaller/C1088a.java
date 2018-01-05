package com.google.android.finsky.activities.inlineappinstaller;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.inlineappinstaller.p119a.C1078a;
import com.google.android.finsky.activities.inlineappinstaller.p119a.C1079b;
import com.google.android.finsky.activities.inlineappinstaller.p119a.C1080c;
import com.google.android.finsky.activities.inlineappinstaller.p119a.C1081d;
import com.google.android.finsky.activities.inlineappinstaller.p119a.C1082e;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.lightpurchase.ar;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.billing.lightpurchase.p118d.C1086a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1918d;
import com.google.android.finsky.billing.lightpurchase.p118d.C1920f;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.p;
import com.squareup.leakcanary.C7582R;

public final class C1088a extends C1086a implements C1087t {
    public C1090c f6940a;
    public int f6941b = -1;
    public int f6942c;
    public cv f6943d;
    public p f6944e;
    public boolean f6945f;

    public static C1088a m6747a(Account account, cv cvVar, p pVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("MultiStepFragment.account", account);
        bundle.putParcelable("mediaDoc", ParcelableProto.m21671a((C0757i) cvVar));
        if (pVar != null) {
            bundle.putParcelable("successInfo", ParcelableProto.m21671a((C0757i) pVar));
        }
        Fragment c1088a = new C1088a();
        c1088a.m600f(bundle);
        return c1088a;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (bundle != null) {
            this.f6940a = (C1090c) this.f730B.mo283a("InlineConsumptionAppInstallerFragment.sidecar");
            this.f6941b = bundle.getInt("InlineConsumptionAppInstallerFragment.handledStateInstance");
            this.f6942c = bundle.getInt("InlineConsumptionAppInstallerFragment.previousState");
        }
        Bundle bundle2 = this.f760q;
        this.f6943d = (cv) ParcelableProto.m21673a(bundle2, "mediaDoc");
        this.f6944e = (p) ParcelableProto.m21673a(bundle2, "successInfo");
    }

    public final void mo135a(Context context) {
        super.mo135a(context);
        if (!(context instanceof ad)) {
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("InlineConsumptionAppInstallerFragment.handledStateInstance", this.f6941b);
        bundle.putInt("InlineConsumptionAppInstallerFragment.previousState", this.f6942c);
    }

    public final void g_() {
        super.g_();
        if (this.f6940a == null) {
            String str = this.aw.name;
            C0757i c0757i = this.f6943d;
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", str);
            bundle.putParcelable("InlineConsumptionAppInstallerSidecar.mediaDoc", ParcelableProto.m21671a(c0757i));
            Fragment c1090c = new C1090c();
            c1090c.m600f(bundle);
            this.f6940a = c1090c;
            this.f730B.mo284a().mo328a(this.f6940a, "InlineConsumptionAppInstallerFragment.sidecar").mo334c();
        }
        this.f6940a.m6757a((C1087t) this);
    }

    public final void h_() {
        if (this.f6940a != null) {
            this.f6940a.m6757a(null);
        }
        super.h_();
    }

    protected final int mo968W() {
        return this.f6943d.f12099f;
    }

    public final void mo1423a(C1089s c1089s) {
        int i = c1089s.ag;
        Object[] objArr = new Object[]{Integer.valueOf(c1089s.f6948l), Integer.valueOf(i)};
        if (i == this.f6941b) {
            FinskyLog.m21662b("Already handled state %d", Integer.valueOf(this.f6941b));
            return;
        }
        C1076h c1082e;
        Bundle bundle;
        C1086a c1086a;
        this.f6941b = i;
        Fragment fragment;
        Parcelable parcelable;
        C1076h c1080c;
        Bundle bundle2;
        Bundle bundle3;
        switch (this.f6940a.f6948l) {
            case 0:
                C1920f c1920f = this.aI;
                if (c1920f.f9845a.az) {
                    C1086a c1086a2 = c1920f.f9845a;
                    if (c1086a2.az) {
                        c1086a2.az = false;
                        if (c1086a2.aA) {
                            super.m6742b(c1086a2.aF);
                        } else {
                            c1086a2.aF.setVisibility(4);
                        }
                    }
                }
                if (!c1920f.f9845a.ay) {
                    if (c1920f.f9845a.ax != null) {
                        fragment = c1920f.f9845a;
                        Animation loadAnimation = AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.slide_out_left);
                        loadAnimation.setAnimationListener(new C1918d(fragment));
                        fragment.aD.startAnimation(loadAnimation);
                        c1920f.f9845a.aE.setVisibility(0);
                        c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.slide_in_right));
                    } else {
                        c1920f.f9845a.aD.setVisibility(4);
                        c1920f.f9845a.aE.setVisibility(0);
                        c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.play_fade_in));
                    }
                    c1920f.f9845a.ay = true;
                    Fragment fragment2 = c1920f.f9845a;
                    fragment2.aJ.m13370a(new C2488p().m13340a(213).m13345b((ad) fragment2.m603h()));
                    break;
                }
                break;
            case 5:
                C0757i c0757i = this.f6943d;
                C0757i c0757i2 = this.f6944e;
                c1082e = new C1082e();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("mediaDoc", ParcelableProto.m21671a(c0757i));
                if (c0757i2 != null) {
                    bundle4.putParcelable("installStep", ParcelableProto.m21671a(c0757i2));
                }
                c1082e.m600f(bundle4);
                mo1411a(c1082e);
                break;
            case 6:
                parcelable = this.f6940a.f6951c;
                c1080c = new C1080c();
                bundle2 = new Bundle();
                bundle2.putParcelable("appDoc", parcelable);
                c1080c.m600f(bundle2);
                mo1411a(c1080c);
                break;
            case 7:
                parcelable = this.f6940a.f6951c;
                c1080c = new C1078a();
                bundle2 = new Bundle();
                bundle2.putParcelable("appDoc", parcelable);
                c1080c.m600f(bundle2);
                mo1411a(c1080c);
                break;
            case 8:
                Parcelable parcelable2 = this.f6940a.f6951c;
                int i2 = this.f6943d.f12098e;
                fragment = new C1081d();
                bundle3 = new Bundle();
                bundle3.putParcelable("InlineConsumptionAppInstallerReadyToReadStep.appDoc", parcelable2);
                bundle3.putInt("InlineConsumptionAppInstallerReadyToReadStep.mediaDocType", i2);
                Fragment fragment3 = fragment;
                bundle = bundle3;
                c1086a = this;
                break;
            default:
                String str = this.f6940a.f6952d;
                Parcelable parcelable3 = this.f6940a.f6951c;
                fragment = new C1079b();
                bundle3 = new Bundle();
                bundle3.putString("errorMsg", str);
                if (parcelable3 != null) {
                    bundle3.putParcelable("appDoc", parcelable3);
                }
                c1082e = fragment;
                bundle = bundle3;
                c1086a = this;
                break;
        }
        c1082e.m600f(bundle);
        c1086a.mo1411a(c1082e);
        this.f6942c = c1089s.f6948l;
    }

    public final void m6749X() {
        C1920f c1920f = this.aI;
        if (c1920f.f9845a.az) {
            C1086a c1086a = c1920f.f9845a;
            if (c1086a.az) {
                c1086a.az = false;
                if (c1086a.aA) {
                    super.m6742b(c1086a.aF);
                } else {
                    c1086a.aF.setVisibility(4);
                }
            }
        }
        if (!c1920f.f9845a.ay) {
            if (c1920f.f9845a.ax != null) {
                Fragment fragment = c1920f.f9845a;
                Animation loadAnimation = AnimationUtils.loadAnimation(fragment.m603h(), C7582R.anim.slide_out_left);
                loadAnimation.setAnimationListener(new C1918d(fragment));
                fragment.aD.startAnimation(loadAnimation);
                c1920f.f9845a.aE.setVisibility(0);
                c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.slide_in_right));
            } else {
                c1920f.f9845a.aD.setVisibility(4);
                c1920f.f9845a.aE.setVisibility(0);
                c1920f.f9845a.aE.startAnimation(AnimationUtils.loadAnimation(c1920f.f9845a.m603h(), C7582R.anim.play_fade_in));
            }
            c1920f.f9845a.ay = true;
            Fragment fragment2 = c1920f.f9845a;
            fragment2.aJ.m13370a(new C2488p().m13340a(213).m13345b((ad) fragment2.m603h()));
        }
        C1090c c1090c = this.f6940a;
        C1473m c1473m = C1473m.f7980a;
        Account b = c1090c.f6955g.mo1620b();
        if (C1473m.f7980a.mo2045Y().m11647a(c1090c.f6951c, c1473m.ah().mo2811a(b))) {
            c1090c.m6762a(b, c1090c.f6951c);
            return;
        }
        ar.m10196a(b, c1090c.f6951c, new C1092d(c1090c, c1473m), false, true, c1090c.f6949a.m13178a(b));
    }

    public final void m6752a(boolean z) {
        ((C1075b) m603h()).mo1404b(z);
    }
}
