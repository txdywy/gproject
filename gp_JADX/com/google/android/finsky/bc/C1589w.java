package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.h.a.u;
import com.google.wireless.android.finsky.dfe.h.a.z;

public final class C1589w extends Fragment implements C0657w, C0660x, C1569m {
    public C2910a f8412a;
    public C1287h f8413b;
    public C0988c f8414c;
    public C1590x f8415d;
    public C1582l f8416e;

    public final void mo1292a(Activity activity) {
        ((C1347t) C3947d.m18649a(C1347t.class)).mo1719a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        Activity h = m603h();
        if (this.f8415d == null) {
            this.f8415d = new C1590x(this, h);
            this.f8416e = C1582l.m9130a(this, this.f8415d.mo2348d(), false);
            mo2338c();
            return;
        }
        this.f8415d.f8417a.f8408c = h;
    }

    public final void mo2338c() {
        this.f8413b.mo2016a(this.f8415d.mo2344a()).mo1634c(this.f8415d.mo2349e().f8376a, false, (C0660x) this, (C0657w) this);
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f8416e.m9132b(volleyError);
    }

    public final /* synthetic */ void b_(Object obj) {
        z zVar = (z) obj;
        if (m610k()) {
            int i;
            C1585q c1585q = this.f8415d;
            for (u uVar : zVar.f) {
                c1585q.f8420d.put(uVar.c, uVar.d);
            }
            if (zVar.e != 1) {
                Object a;
                switch (zVar.e) {
                    case 2:
                        a = c1585q.mo2345a(13);
                        break;
                    case 3:
                        c1585q.f8417a.f8410e = true;
                        a = c1585q.mo2345a(14);
                        c1585q.f8425i.f8412a.m15184a(c1585q.f8418b, 7);
                        break;
                    default:
                        c1585q.f8417a.m9153a();
                        break;
                }
                if (TextUtils.isEmpty(a)) {
                    c1585q.f8417a.m9153a();
                } else {
                    C1588u c1588u = c1585q.f8417a;
                    C1573p c1586r = new C1586r();
                    c1586r.f8405a = a;
                    c1588u.m9155a(c1586r, false);
                }
            } else {
                c1585q.f8421e = zVar.h;
                c1585q.f8422f = zVar.g;
                C1588u c1588u2 = c1585q.f8417a;
                int[] iArr = zVar.d;
                if (iArr == null || iArr.length == 0) {
                    c1588u2.m9153a();
                } else {
                    c1588u2.f8406a = new C1568y[iArr.length];
                    for (i = 0; i < iArr.length; i++) {
                        C1571c c1570b;
                        C1568y[] c1568yArr = c1588u2.f8406a;
                        switch (iArr[i]) {
                            case 1:
                                c1570b = new C1570b(c1588u2.f8409d);
                                break;
                            case 2:
                                c1570b = new C1571c(c1588u2.f8409d);
                                break;
                            case 3:
                                c1570b = new aa(c1588u2.f8409d);
                                break;
                            case 4:
                                c1570b = new C1581k(c1588u2.f8409d);
                                break;
                            case 5:
                                c1570b = new C1591z(c1588u2.f8409d);
                                break;
                            case 6:
                                c1570b = new C1584o(c1588u2.f8409d);
                                break;
                            default:
                                throw new UnsupportedOperationException();
                        }
                        c1568yArr[i] = c1570b;
                    }
                    c1588u2.f8407b = 0;
                    c1588u2.f8406a[c1588u2.f8407b].mo2336a();
                }
                c1585q.f8423g = zVar.i;
                c1585q.f8424h = zVar.j;
            }
            this.f8416e = null;
        }
    }
}
