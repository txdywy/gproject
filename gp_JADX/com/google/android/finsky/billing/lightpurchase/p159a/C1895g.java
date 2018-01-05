package com.google.android.finsky.billing.lightpurchase.p159a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.billing.C2101v;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.a.a.n;
import com.google.wireless.android.finsky.a.a.x;
import com.squareup.leakcanary.C7582R;
import java.util.Map;

public final class C1895g extends Fragment implements C1087t, C1892f, C1893k, C1894q {
    public final C2471a f9692a = C1473m.f7980a.aR();
    public C1896i f9693b;
    public C2101v f9694c;
    public String f9695d;
    public int f9696e;
    public String f9697f;
    public int f9698g;
    public C2495w f9699h;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f9695d = this.f760q.getString("authAccount");
        this.f9696e = this.f760q.getInt("AgeVerificationHostFragment.backend");
        this.f9697f = this.f760q.getString("AgeVerificationHostFragment.docid_str");
        if (bundle != null) {
            this.f9698g = bundle.getInt("AgeVerificationHostFragment.last_state_instance");
            this.f9699h = this.f9692a.m13179a(bundle);
            return;
        }
        this.f9699h = this.f9692a.m13179a(this.f760q);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putInt("AgeVerificationHostFragment.last_state_instance", this.f9698g);
        this.f9699h.m13377a(bundle);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C7582R.layout.age_verification_host_fragment, viewGroup, false);
    }

    public final void g_() {
        super.g_();
        this.f9693b = (C1896i) this.f730B.mo283a("AgeVerificationHostFragment.sidecar");
        if (this.f9693b == null) {
            String str = this.f9695d;
            C2495w c2495w = this.f9699h;
            Fragment c1896i = new C1896i();
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", str);
            c2495w.m13380b(str).m13377a(bundle);
            c1896i.m600f(bundle);
            this.f9693b = c1896i;
            this.f730B.mo284a().mo328a(this.f9693b, "AgeVerificationHostFragment.sidecar").mo334c();
        }
    }

    public final void mo979u() {
        super.mo979u();
        this.f9693b.m6757a((C1087t) this);
    }

    public final void mo980v() {
        super.mo980v();
        this.f9693b.m6757a(null);
    }

    public final void mo1423a(C1089s c1089s) {
        if (this.f9693b.ag <= this.f9698g) {
            FinskyLog.m21659a("Already received state instance %d, ignore.", Integer.valueOf(this.f9698g));
            return;
        }
        this.f9698g = this.f9693b.ag;
        String str;
        C1089s c1089s2;
        C0757i c0757i;
        int i;
        C2495w c2495w;
        Bundle bundle;
        Fragment c1897j;
        switch (this.f9693b.f6948l) {
            case 0:
                C0657w c0657w = this.f9693b;
                str = this.f9697f;
                if (str == null) {
                    c0657w.m6758b(4, 0);
                    return;
                }
                c0657w.f9704e = new C2719i(c0657w.f9701b, C1289l.m7694a(str));
                c0657w.f9704e.m11918a((C1031w) c0657w);
                c0657w.f9704e.m11917a(c0657w);
                c0657w.m6758b(1, 0);
                return;
            case 1:
                if (this.f9694c == null) {
                    this.f9694c = new C2101v();
                }
                m10116a(this.f9694c);
                return;
            case 2:
                m10117a(true);
                return;
            case 3:
                if (this.f9693b.af == 1) {
                    c1089s2 = this.f9693b;
                    if (c1089s2.f6948l == 3 && c1089s2.af == 1) {
                        c0757i = c1089s2.f9702c.n;
                    } else {
                        i = c1089s2.f6948l;
                        throw new IllegalStateException("Invalid state: " + i + " with substate: " + c1089s2.af);
                    }
                }
                c1089s2 = this.f9693b;
                if (c1089s2.f6948l != 3 || c1089s2.af == 1) {
                    i = c1089s2.f6948l;
                    throw new IllegalStateException("Invalid state: " + i + " with substate: " + c1089s2.af);
                }
                str = c1089s2.f9703d;
                Resources resources = m603h().getResources();
                x xVar = new x();
                String string = resources.getString(C7582R.string.ok);
                if (string == null) {
                    throw new NullPointerException();
                }
                xVar.a |= 1;
                xVar.b = string;
                xVar.a |= 4;
                xVar.d = true;
                c0757i = new n();
                String string2 = resources.getString(C7582R.string.error);
                if (string2 == null) {
                    throw new NullPointerException();
                }
                c0757i.a |= 1;
                c0757i.b = string2;
                if (str == null) {
                    throw new NullPointerException();
                }
                c0757i.a |= 2;
                c0757i.c = str;
                c0757i.d = xVar;
                str = this.f9695d;
                i = this.f9696e;
                c2495w = this.f9699h;
                bundle = new Bundle();
                bundle.putString("authAccount", str);
                bundle.putInt("ChallengeErrorFragment.backend", i);
                bundle.putParcelable("ChallengeErrorFragment.challenge", ParcelableProto.m21671a(c0757i));
                c2495w.m13380b(str).m13377a(bundle);
                c1897j = new C1897j();
                c1897j.m600f(bundle);
                m10116a(c1897j);
                return;
            case 4:
                c1089s2 = this.f9693b;
                c1089s2.f9701b.mo1644e(c1089s2, c1089s2);
                c1089s2.m6758b(1, 0);
                return;
            case 5:
                c1089s2 = this.f9693b;
                if (c1089s2.f6948l != 5) {
                    throw new IllegalStateException("Invalid state: " + c1089s2.f6948l);
                }
                c0757i = c1089s2.f9702c.d;
                str = this.f9695d;
                i = this.f9696e;
                c2495w = this.f9699h;
                bundle = new Bundle();
                bundle.putString("authAccount", str);
                bundle.putInt("AgeChallengeFragment.backend", i);
                bundle.putParcelable("AgeChallengeFragment.challenge", ParcelableProto.m21671a(c0757i));
                c2495w.m13380b(str).m13377a(bundle);
                c1897j = new C1887a();
                c1897j.m600f(bundle);
                m10116a(c1897j);
                return;
            case 6:
                c1089s2 = this.f9693b;
                if (c1089s2.f6948l != 6) {
                    throw new IllegalStateException("Invalid state: " + c1089s2.f6948l);
                }
                c0757i = c1089s2.f9702c.e;
                str = this.f9695d;
                i = this.f9696e;
                c2495w = this.f9699h;
                bundle = new Bundle();
                bundle.putString("authAccount", str);
                bundle.putInt("SmsCodeFragment.backend", i);
                bundle.putParcelable("SmsCodeFragment.challenge", ParcelableProto.m21671a(c0757i));
                c2495w.m13380b(str).m13377a(bundle);
                c1897j = new C1901o();
                c1897j.m600f(bundle);
                m10116a(c1897j);
                return;
            case 7:
                m10117a(false);
                return;
            default:
                FinskyLog.m21669e("Unexpected state: " + this.f9693b.f6948l, new Object[0]);
                return;
        }
    }

    private final void m10116a(Fragment fragment) {
        aw a = m607j().mo284a();
        a.mo331b(C7582R.id.content_frame, fragment);
        a.mo322a();
        a.mo334c();
    }

    private final void m10117a(boolean z) {
        if (z) {
            C1473m.f7980a.mo2246h(this.f9695d).f25087d = Boolean.valueOf(false);
        }
        ((C1885h) m603h()).mo2492b(true);
    }

    public final void mo2508a(String str, Map map) {
        C0660x c0660x = this.f9693b;
        c0660x.f9701b.mo1626b(str, map, c0660x, (C0657w) c0660x);
        c0660x.m6758b(1, 0);
    }

    public final void mo2506a(String str) {
        C1089s c1089s = this.f9693b;
        c1089s.f9701b.mo1655h(str, c1089s, c1089s);
        c1089s.m6758b(1, 0);
    }

    public final void mo2507a(String str, String str2, String str3) {
        C0660x c0660x = this.f9693b;
        c0660x.f9701b.mo1594a(str, str2, str3, c0660x, (C0657w) c0660x);
        c0660x.m6758b(1, 0);
    }

    public final void mo968W() {
        ((C1885h) m603h()).mo2492b(false);
    }

    public final void mo2505a(m mVar) {
        C1089s c1089s = this.f9693b;
        c1089s.f9702c = mVar;
        if (c1089s.f9702c.d != null) {
            c1089s.m6758b(5, 0);
        } else if (c1089s.f9702c.e != null) {
            c1089s.m6758b(6, 0);
        } else {
            throw new IllegalStateException("Received unknown challenge.");
        }
    }
}
