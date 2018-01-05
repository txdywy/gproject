package com.google.android.finsky.billing.acquire;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.billing.common.C1801q;
import com.google.android.finsky.billing.common.C1803u;
import com.google.android.finsky.billing.p130b.C1760b;
import com.google.android.finsky.billing.p130b.C1761c;
import com.google.android.finsky.billing.p130b.C1763d;
import com.google.android.finsky.billing.p130b.C1764f;
import com.google.android.finsky.billing.p130b.C1767g;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.billing.p153c.C1684f;
import com.google.android.finsky.billing.p153c.C1779a;
import com.google.android.finsky.billing.p153c.C1780b;
import com.google.android.finsky.billing.p153c.C1781c;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dialogbuilder.C1682a;
import com.google.android.finsky.dialogbuilder.C2794b;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bb;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.c.a.a;
import com.google.wireless.android.finsky.dfe.c.a.aq;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.dx;
import com.google.wireless.android.finsky.dfe.c.a.ea;
import com.google.wireless.android.finsky.dfe.c.a.g;
import com.google.wireless.android.finsky.dfe.c.a.k;
import com.google.wireless.android.finsky.dfe.c.a.p;
import com.google.wireless.android.finsky.dfe.c.a.y;

public final class C1683a implements C1682a {
    public C1801q f8710a;
    public C1803u f8711b;
    public C2171b f8712c;
    public C1655h f8713d;
    public C2794b f8714e;
    public final Account f8715f;
    public final Document f8716g;
    public final Activity f8717h;
    public final C1779a f8718i;
    public final C1780b f8719j;
    public final C1767g f8720k;
    public final C2792h f8721l;
    public final C1764f f8722m;
    public final C2495w f8723n;
    public final C1763d f8724o;
    public final C1761c f8725p;
    public final C1760b f8726q;
    public final Bundle f8727r;

    public C1683a(Account account, Document document, Activity activity, C1779a c1779a, C1780b c1780b, C1767g c1767g, C2792h c2792h, C1764f c1764f, C2495w c2495w, C1763d c1763d, C1761c c1761c, C1760b c1760b, Bundle bundle) {
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1726a(this);
        this.f8715f = account;
        this.f8716g = document;
        this.f8717h = activity;
        this.f8718i = c1779a;
        this.f8719j = c1780b;
        this.f8720k = c1767g;
        this.f8721l = c2792h;
        this.f8722m = c1764f;
        this.f8723n = c2495w;
        this.f8724o = c1763d;
        this.f8725p = c1761c;
        this.f8726q = c1760b;
        if (bundle == null) {
            this.f8727r = new Bundle();
        } else {
            this.f8727r = bundle.getBundle("AcquireActionHandler.actionBundle");
        }
    }

    public final void mo2387a(C2794b c2794b) {
        this.f8714e = c2794b;
        this.f8720k.f9112H = c2794b;
    }

    public final boolean mo2388a(bl blVar) {
        aq aqVar = null;
        boolean z = true;
        if (!blVar.m4919a(a.a)) {
            return false;
        }
        a aVar = (a) blVar.m4921b(a.a);
        C0757i c0757i;
        String num;
        if (aVar.d != null) {
            c0757i = aVar.d;
            num = Integer.toString(1);
            if (this.f8727r.containsKey(num)) {
                FinskyLog.m21669e("Cannot launch multiple redeem flows simultaneously.", new Object[0]);
                return false;
            }
            this.f8727r.putParcelable(num, ParcelableProto.m21671a(c0757i));
            this.f8717h.startActivityForResult(this.f8710a.mo2638a(this.f8715f.name, c0757i.b, c0757i.c, this.f8723n), 1);
            return false;
        } else if (aVar.e != null) {
            c0757i = aVar.e;
            num = Integer.toString(2);
            if (this.f8727r.containsKey(num)) {
                FinskyLog.m21669e("Cannot launch multiple top up flows simultaneously.", new Object[0]);
                return false;
            }
            this.f8727r.putParcelable(num, ParcelableProto.m21671a(c0757i));
            this.f8717h.startActivityForResult(this.f8711b.mo2639a(this.f8715f.name, c0757i.b, this.f8723n), 2);
            return false;
        } else if (aVar.b != null) {
            this.f8718i.m9730a(aVar.b);
            this.f8714e.mo3138a(aVar.b.b);
            return false;
        } else if (aVar.c != null) {
            C1780b c1780b = this.f8719j;
            if (c1780b.f9220e == null || !c1780b.f9220e.booleanValue()) {
                r1 = false;
            } else {
                r1 = true;
            }
            if (r1) {
                this.f8714e.mo3138a(aVar.c.c);
                return false;
            }
            y yVar = aVar.c;
            c1780b = this.f8719j;
            ea eaVar = yVar.b;
            C1684f c1685b = new C1685b(this, yVar);
            if (c1780b.f9219d == null) {
                throw new IllegalStateException("User input field not set.");
            } else if (c1780b.f9222g >= eaVar.b) {
                c1685b.mo2390a(false);
                return false;
            } else if (TextUtils.isEmpty(c1780b.f9219d.mo2384a())) {
                c1780b.f9226k = true;
                c1780b.f9220e = Boolean.valueOf(false);
                c1780b.f9222g++;
                if (c1780b.f9222g >= eaVar.b) {
                    z = false;
                }
                c1685b.mo2390a(z);
                return false;
            } else {
                c1780b.f9226k = false;
                c1780b.f9220e = null;
                bb.m21792a(new C1781c(c1780b, eaVar, c1685b), c1780b.f9219d.mo2384a());
                return true;
            }
        } else if (aVar.f != null) {
            this.f8722m.m9688a(aVar.f);
            return false;
        } else if (aVar.h != null) {
            C0757i c0757i2 = aVar.h;
            r0 = Integer.toString(3);
            if (this.f8727r.containsKey(r0)) {
                FinskyLog.m21669e("Cannot launch multiple age verification flows simultaneously.", new Object[0]);
                return false;
            }
            String str;
            this.f8727r.putParcelable(r0, ParcelableProto.m21671a(c0757i2));
            r0 = this.f8712c;
            Context context = this.f8717h;
            String str2 = this.f8715f.name;
            int i = c0757i2.d;
            if ((c0757i2.a & 2) == 0) {
                z = false;
            }
            if (z) {
                str = c0757i2.e;
            } else {
                str = null;
            }
            this.f8717h.startActivityForResult(r0.mo2743a(context, str2, i, str, this.f8723n), 3);
            return false;
        } else if (aVar.g != null) {
            c0757i = aVar.g;
            num = Integer.toString(4);
            if (this.f8727r.containsKey(num)) {
                FinskyLog.m21669e("Cannot launch multiple address flows simultaneously.", new Object[0]);
                return false;
            }
            Bundle bundle = new Bundle();
            this.f8727r.putParcelable(num, ParcelableProto.m21671a(c0757i));
            this.f8717h.startActivityForResult(this.f8712c.mo2725a(c0757i.d, c0757i.e, bundle, this.f8723n), 4);
            return false;
        } else if (aVar.j != null) {
            this.f8717h.startActivity(this.f8712c.mo2749a(this.f8717h, this.f8715f.name, this.f8716g.f14885a.f12096c, this.f8716g, false, true, aVar.j.b, this.f8723n));
            return false;
        } else if (aVar.i != null) {
            C1767g c1767g = this.f8720k;
            c1767g.f9110F = aVar.i;
            switch (c1767g.mo2441a()) {
                case 1:
                    break;
                case 2:
                    c1767g.m9711f();
                    z = false;
                    break;
                default:
                    throw new RuntimeException("Unexpected state when handling refresh action!");
            }
            return z;
        } else if (aVar.k != null) {
            C1761c c1761c = this.f8725p;
            p pVar = aVar.k;
            if (pVar.b != null) {
                dx dxVar = pVar.b;
                if ((dxVar.a & 1) == 0) {
                    z = false;
                }
                if (z && dxVar.b == 2 && dxVar.c != null) {
                    c1761c.f9079a = c1761c.f9082d.m9993a(c1761c.f9081c, dxVar.c, dxVar.d, c1761c.f9080b);
                }
            }
            if (aVar.k.a == null) {
                return false;
            }
            this.f8714e.mo3138a(aVar.k.a);
            return false;
        } else if (aVar.l != null) {
            c0757i = aVar.l;
            num = Integer.toString(5);
            if (this.f8727r.containsKey(num)) {
                FinskyLog.m21669e("Cannot launch multiple web view flows simultaneously.", new Object[0]);
                return false;
            }
            this.f8727r.putParcelable(num, ParcelableProto.m21671a(c0757i));
            this.f8717h.startActivityForResult(this.f8712c.mo2733a(this.f8715f, c0757i.d, c0757i.e, this.f8723n), 5);
            return false;
        } else if (aVar.m != null) {
            C0757i c0757i3 = aVar.m;
            r0 = Integer.toString(6);
            if (this.f8727r.containsKey(r0)) {
                FinskyLog.m21669e("Cannot launch multiple light purchase flows simultaneously.", new Object[0]);
                return false;
            }
            String str3;
            boolean z2;
            int i2;
            boolean z3;
            String str4;
            int i3;
            this.f8727r.putParcelable(r0, ParcelableProto.m21671a(c0757i3));
            cv a = new cv().m12392b(c0757i3.d.f11833b).m12386a(c0757i3.d.f11834c).m12391b(c0757i3.d.f11835d).m12387a(c0757i3.j);
            a.f12107n = c0757i3.i;
            Document document = new Document(a);
            r0 = this.f8712c;
            Account account = this.f8715f;
            if ((c0757i3.a & 4) != 0) {
                str3 = c0757i3.g;
            } else {
                str3 = null;
            }
            if ((c0757i3.a & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i2 = c0757i3.f;
            } else {
                i2 = 1;
            }
            if ((c0757i3.a & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                str4 = c0757i3.e;
            } else {
                str4 = null;
            }
            if ((c0757i3.a & 8) == 0) {
                z = false;
            }
            if (z) {
                i3 = c0757i3.h;
            } else {
                i3 = 0;
            }
            this.f8717h.startActivityForResult(r0.mo2732a(account, document, str3, i2, null, str4, null, false, i3, this.f8723n), 6);
            return false;
        } else if (aVar.n != null) {
            g gVar = aVar.n;
            this.f8713d.m9407a(this.f8715f.name, this.f8724o);
            if (gVar.a == null) {
                return false;
            }
            this.f8714e.mo3138a(gVar.a);
            return false;
        } else if (aVar.o == null) {
            return false;
        } else {
            k kVar = aVar.o;
            if (kVar.a != 0) {
                z = false;
            }
            if (z) {
                C1760b c1760b = this.f8726q;
                if (kVar.a == 0) {
                    aqVar = kVar.d;
                }
                r1 = new C3654j(c1760b.f9077a).m17264a(aqVar.b).m17262a(c1760b.f9078b.mo2854a(aqVar.c)).m17269e();
            } else {
                r1 = false;
            }
            if (r1) {
                this.f8714e.mo3138a(aVar.o.b);
                return false;
            }
            this.f8714e.mo3138a(aVar.o.c);
            return false;
        }
    }
}
