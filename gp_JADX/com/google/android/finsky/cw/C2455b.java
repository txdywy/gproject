package com.google.android.finsky.cw;

import android.accounts.Account;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.aa;
import com.google.wireless.android.finsky.b.z;

public final class C2455b {
    public boolean f13240a;
    public boolean f13241b;
    public int f13242c;
    public int f13243d;
    public int f13244e;
    public String f13245f;
    public String f13246g;
    public final C2454a[] f13247h = new C2454a[2];
    public final C1531a f13248i;

    C2455b(C1531a c1531a) {
        this.f13248i = c1531a;
        for (int i = 0; i < 2; i++) {
            this.f13247h[i] = new C2454a();
        }
        m13142a();
    }

    public final void m13142a() {
        int i = 0;
        this.f13241b = false;
        this.f13240a = false;
        this.f13243d = 0;
        this.f13242c = -1;
        this.f13244e = 0;
        this.f13245f = null;
        this.f13246g = null;
        while (i < 2) {
            this.f13247h[i].m13137a();
            i++;
        }
    }

    public final boolean m13146b() {
        return this.f13244e > 0;
    }

    public final boolean m13147c() {
        return this.f13243d != 0;
    }

    private final void m13139a(int i, String str, String str2, boolean z, int i2, C2731v c2731v, Document document, Account account, int i3) {
        if (this.f13244e < 2) {
            this.f13247h[this.f13244e].m13137a();
            this.f13247h[this.f13244e].f13230a = i;
            this.f13247h[this.f13244e].f13231b = str;
            this.f13247h[this.f13244e].f13232c = str2;
            this.f13247h[this.f13244e].f13233d = z;
            this.f13247h[this.f13244e].f13234e = i2;
            this.f13247h[this.f13244e].f13235f = c2731v;
            this.f13247h[this.f13244e].f13236g = this.f13248i.m8962c(document);
            this.f13247h[this.f13244e].f13237h = document;
            this.f13247h[this.f13244e].f13238i = account;
            this.f13247h[this.f13244e].f13239j = i3;
            this.f13244e++;
            return;
        }
        FinskyLog.m21669e("Trying to add action %d but no more room for actions", Integer.valueOf(i));
    }

    private final void m13138a(int i, String str, String str2, boolean z, int i2, C2731v c2731v, Document document, Account account) {
        m13139a(i, str, str2, z, i2, c2731v, document, account, 0);
    }

    public final void m13143a(int i, bl blVar, Document document, Account account) {
        String str;
        String str2;
        if (this.f13242c == 4 && blVar.m4919a(aa.a)) {
            z zVar = (z) blVar.m4921b(aa.a);
            if (zVar.d()) {
                str = blVar.f11917g;
                if (C2457d.m13152a(blVar)) {
                    str2 = blVar.f11922l;
                } else {
                    str2 = null;
                }
                m13139a(i, str, str2, false, blVar.f11926p, null, document, account, zVar.b);
                return;
            }
            str = blVar.f11917g;
            if (C2457d.m13152a(blVar)) {
                str2 = blVar.f11922l;
            } else {
                str2 = null;
            }
            m13138a(i, str, str2, false, blVar.f11926p, null, document, account);
            return;
        }
        str = blVar.f11917g;
        if (C2457d.m13152a(blVar)) {
            str2 = blVar.f11922l;
        } else {
            str2 = null;
        }
        m13138a(i, str, str2, false, blVar.f11926p, null, document, account);
    }

    public final void m13144a(int i, bl blVar, boolean z, Document document, Account account) {
        String str;
        String str2 = blVar.f11917g;
        if (C2457d.m13152a(blVar)) {
            str = blVar.f11922l;
        } else {
            str = null;
        }
        m13138a(i, str2, str, z, 0, null, document, account);
    }

    public final void m13145a(int i, Document document, Account account) {
        m13138a(i, null, null, false, -1, null, document, account);
    }

    public final int m13140a(int i, bl[] blVarArr, C2731v c2731v, C2731v c2731v2, Document document, Account account) {
        int i2 = 0;
        bl blVar = null;
        int length = blVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4;
            bl blVar2 = blVarArr[i3];
            if (c2731v.m14768a(blVar2.f11926p)) {
                i4 = i2 + 1;
            } else {
                blVar2 = blVar;
                i4 = i2;
            }
            i3++;
            i2 = i4;
            blVar = blVar2;
        }
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            m13143a(i, blVar, document, account);
            return 1;
        }
        String str;
        String str2;
        blVar = C2288b.m11786a(blVarArr, true, c2731v);
        boolean z = true;
        if (c2731v2 != c2731v) {
            blVar2 = C2288b.m11786a(blVarArr, true, c2731v2);
            if (!(blVar2 == null || blVar2 == blVar)) {
                z = false;
                str = blVar2.f11917g;
                if (C2457d.m13152a(blVar2)) {
                    str2 = null;
                } else {
                    str2 = blVar2.f11922l;
                }
                m13138a(i, str, str2, z, 0, c2731v, document, account);
                return i2;
            }
        }
        blVar2 = blVar;
        str = blVar2.f11917g;
        if (C2457d.m13152a(blVar2)) {
            str2 = null;
        } else {
            str2 = blVar2.f11922l;
        }
        m13138a(i, str, str2, z, 0, c2731v, document, account);
        return i2;
    }

    public final C2454a m13141a(int i) {
        if (i < this.f13244e) {
            return this.f13247h[i];
        }
        FinskyLog.m21669e("Request for invalid action #%d (%d available actions)", Integer.valueOf(i), Integer.valueOf(this.f13244e));
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.f13244e; i++) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.f13247h[i].f13230a);
        }
        return stringBuilder.toString();
    }
}
