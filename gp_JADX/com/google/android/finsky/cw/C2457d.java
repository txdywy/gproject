package com.google.android.finsky.cw;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public final class C2457d {
    public final C3027b f13250a;
    public final C3028c f13251b;
    public final Context f13252c;
    public final C1531a f13253d;
    public final C1461c f13254e;
    public final C1557b f13255f;
    public final C1467c f13256g;
    public final C3340g f13257h;
    public final C2206c f13258i;
    public final C2288b f13259j;
    public final C3934g f13260k;
    public final C2833a f13261l;
    public final C2885b f13262m;
    public final C2233o f13263n;
    public String f13264o;
    public boolean f13265p;
    public boolean f13266q;
    public boolean f13267r;
    public boolean f13268s;
    public boolean f13269t;
    public boolean f13270u;

    public C2457d(C3027b c3027b, C3028c c3028c, Context context, C1531a c1531a, C1461c c1461c, C1557b c1557b, C1467c c1467c, C3340g c3340g, C2206c c2206c, C2233o c2233o, C2288b c2288b, C3934g c3934g, C2833a c2833a, C2885b c2885b) {
        this.f13250a = c3027b;
        this.f13251b = c3028c;
        this.f13252c = context;
        this.f13253d = c1531a;
        this.f13254e = c1461c;
        this.f13255f = c1557b;
        this.f13256g = c1467c;
        this.f13257h = c3340g;
        this.f13258i = c2206c;
        this.f13263n = c2233o;
        this.f13259j = c2288b;
        this.f13260k = c3934g;
        this.f13261l = c2833a;
        this.f13262m = c2885b;
    }

    public final void m13154a(Account account, DfeToc dfeToc, int i, Document document, C2455b c2455b) {
        Object obj;
        c2455b.m13142a();
        c2455b.f13242c = document.f14885a.f12099f;
        C2196e a = this.f13258i.mo2811a(account);
        bl a2 = this.f13259j.m11788a(document, dfeToc, a);
        Account a3 = this.f13263n.m11642a(document, account);
        boolean z = a3 != null;
        Object obj2 = (z && this.f13263n.m11655c(document, a)) ? 1 : null;
        if (z || !this.f13263n.m11656d(document, a)) {
            obj = null;
        } else {
            obj = 1;
        }
        if (i == 4 && document.f14885a.f12098e == 18 && !document.f14885a.f12092I) {
            c2455b.m13145a(20, document, account);
        }
        if (this.f13254e.dj().mo2294a(12622545) && i == 4 && document.f14885a.f12098e == 19 && document.f14885a.f12107n.length == 0) {
            c2455b.m13145a(20, document, account);
        }
        if (a2 != null || obj2 != null || obj != null || document.ae()) {
            c2455b.f13240a = z;
            if (this.f13255f.mo2306a(account.name).mo2319a(document.f14885a.f12099f)) {
                C2227g b = this.f13263n.m11652b(document.m14646d(), a);
                boolean z2 = z && b != null && (b.f11111r != null || b.f11110q);
                c2455b.f13241b = z2;
            }
            Object obj3;
            switch (c2455b.f13242c) {
                case 1:
                case 2:
                case 4:
                    if (z) {
                        if (obj2 != null) {
                            c2455b.m13145a(9, document, a3);
                            c2455b.f13243d = 3;
                            return;
                        }
                        c2455b.m13145a(6, document, a3);
                        if (this.f13263n.m11648a(document, a, 3) || this.f13263n.m11648a(document, a, 4)) {
                            c2455b.f13243d = 7;
                        } else if (c2455b.f13241b) {
                            c2455b.f13243d = 13;
                        } else {
                            c2455b.f13243d = 6;
                        }
                        if (c2455b.f13242c == 4 && !k.a(this.f13252c) && !document.bp() && document.f14885a.f12098e != 19) {
                            c2455b.m13145a(12, document, account);
                            return;
                        }
                        return;
                    } else if (obj != null) {
                        c2455b.m13145a(15, document, account);
                        return;
                    } else if (this.f13263n.m11649a(document, dfeToc, a)) {
                        m13151a(document, a2, account, a, i, c2455b);
                        return;
                    } else {
                        return;
                    }
                case 3:
                    m13150a(account);
                    c2455b.f13240a = false;
                    if (a3 == null) {
                        a3 = account;
                    }
                    if (a2 != null) {
                        if (document.f14885a.f12098e == 1) {
                            C2441n N = document.m14625N();
                            C3026a a4 = this.f13250a.m15626a(N.f13171k);
                            if (a4.f15820h) {
                                if (a4.f15833u) {
                                    c2455b.f13243d = 2;
                                    if (a4.m15621a()) {
                                        c2455b.m13145a(14, document, a3);
                                    }
                                } else if (!a4.m15624b(document) || this.f13261l.m14986a(document)) {
                                    if (!this.f13262m.m15130c(N.f13171k)) {
                                        c2455b.m13145a(6, document, a3);
                                    }
                                } else if (this.f13257h.mo3482b(N.f13171k) != 0) {
                                    c2455b.f13243d = 9;
                                } else {
                                    int i2;
                                    int i3;
                                    if (this.f13268s && i == 2 && this.f13253d.m8962c(document) > 0) {
                                        i2 = 19;
                                    } else {
                                        i2 = 8;
                                    }
                                    if (!this.f13269t || this.f13253d.m8962c(document) <= 0) {
                                        i3 = 5;
                                    } else {
                                        i3 = 14;
                                    }
                                    c2455b.m13143a(i2, a2, document, a3);
                                    c2455b.f13243d = i3;
                                }
                                c2455b.f13240a = true;
                                return;
                            }
                            String str = N.f13171k;
                            int b2 = this.f13257h.mo3482b(str);
                            if ((b2 == 2 || b2 == 1) && this.f13270u && this.f13251b.m15636a(str, this.f13256g.dt())) {
                                c2455b.f13243d = 12;
                                return;
                            } else if (b2 != 0) {
                                c2455b.f13243d = 1;
                                return;
                            } else if (this.f13262m.m15130c(N.f13171k)) {
                                return;
                            }
                        }
                        if (!this.f13263n.m11649a(document, dfeToc, a)) {
                            return;
                        }
                        if (z && a2.f11924n) {
                            obj3 = (this.f13268s && i == 2 && this.f13253d.m8962c(document) > 0) ? 1 : null;
                            c2455b.f13240a = true;
                            c2455b.m13143a(obj3 != null ? 17 : 7, a2, document, a3);
                            if (c2455b.f13241b) {
                                c2455b.f13243d = 13;
                                return;
                            } else {
                                c2455b.f13243d = 6;
                                return;
                            }
                        } else if (this.f13263n.m11649a(document, dfeToc, a)) {
                            m13151a(document, a2, a3, a, i, c2455b);
                            return;
                        } else {
                            return;
                        }
                    } else if (!document.ae()) {
                        return;
                    } else {
                        if (this.f13260k.m18640a(document.f14885a.f12096c, a3)) {
                            c2455b.f13243d = 11;
                            return;
                        } else {
                            c2455b.f13243d = 10;
                            return;
                        }
                    }
                case 6:
                    Document document2;
                    Document bk;
                    if (a2 != null) {
                        c2455b.f13245f = a2.f11917g;
                        if (C2457d.m13152a(a2)) {
                            c2455b.f13246g = a2.f11922l;
                        }
                    }
                    if (document.f14885a.f12098e == 17 || document.f14885a.f12098e == 25) {
                        document2 = document;
                    } else {
                        document2 = null;
                    }
                    if (document.f14885a.f12098e == 16 || document.f14885a.f12098e == 24) {
                        bk = document.bk();
                    } else {
                        bk = document2;
                    }
                    obj3 = null;
                    if (!(bk == null || this.f13263n.m11642a(bk, account) == null)) {
                        obj3 = 1;
                        c2455b.f13240a = true;
                        c2455b.m13145a(6, bk, account);
                    }
                    if (document.bj()) {
                        if (this.f13263n.m11643a(document.bl(), account) != null) {
                            if (bk == null) {
                                c2455b.f13240a = true;
                                c2455b.m13145a(6, document, account);
                            }
                            c2455b.f13243d = 8;
                        } else if (this.f13263n.m11649a(document, dfeToc, a)) {
                            c2455b.m13144a(2, a2, false, document, account);
                        }
                    }
                    if (obj3 == null && bk != null && this.f13263n.m11649a(bk, dfeToc, a)) {
                        a2 = this.f13259j.m11789b(bk, dfeToc, a);
                        if (a2 != null) {
                            if (a2.f11924n) {
                                c2455b.m13143a(a2.f11915e > 0 ? 4 : 7, a2, bk, account);
                            } else {
                                c2455b.m13143a(18, a2, bk, account);
                            }
                        }
                        if (!c2455b.m13147c()) {
                            c2455b.f13243d = 4;
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    FinskyLog.m21669e("Unsupported backend: %d", Integer.valueOf(document.f14885a.f12099f));
                    if (this.f13263n.m11649a(document, dfeToc, a)) {
                        m13151a(document, a2, account, a, i, c2455b);
                        return;
                    }
                    return;
            }
        }
    }

    static boolean m13152a(bl blVar) {
        return blVar.m12278d() && blVar.m12279e() && blVar.f11921k > blVar.f11915e;
    }

    private final synchronized void m13150a(Account account) {
        if (!TextUtils.equals(this.f13264o, account.name)) {
            C1552e j = this.f13254e.mo2249j(account.name);
            this.f13265p = j.mo2294a(12602778);
            boolean z = !this.f13265p && j.mo2294a(12602779);
            this.f13266q = z;
            this.f13267r = j.mo2294a(12602780);
            this.f13268s = j.mo2294a(12603516);
            this.f13269t = j.mo2294a(12603329);
            this.f13270u = j.mo2294a(12607073);
            this.f13264o = account.name;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.finsky.cv.p177a.bl m13153a(com.google.android.finsky.dfemodel.Document r12, com.google.android.finsky.cv.p177a.bl r13, int r14) {
        /*
        r11 = this;
        r10 = 7;
        r2 = 0;
        r9 = 4;
        r1 = 0;
        r4 = 1;
        if (r14 != 0) goto L_0x0008;
    L_0x0007:
        return r13;
    L_0x0008:
        if (r14 != r4) goto L_0x0092;
    L_0x000a:
        r0 = r12.ad();
        if (r0 == 0) goto L_0x0048;
    L_0x0010:
        r0 = r12.f14885a;
        r0 = r0.f12115v;
        if (r0 == 0) goto L_0x002c;
    L_0x0016:
        r0 = r12.f14885a;
        r0 = r0.f12115v;
        r0 = r0.f13102I;
        r5 = r0;
    L_0x001d:
        if (r13 == 0) goto L_0x0030;
    L_0x001f:
        r0 = r13.f11907B;
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x0030;
    L_0x0027:
        r0 = r13;
    L_0x0028:
        if (r0 == 0) goto L_0x0048;
    L_0x002a:
        r13 = r0;
        goto L_0x0007;
    L_0x002c:
        r0 = "";
        r5 = r0;
        goto L_0x001d;
    L_0x0030:
        r0 = r12.f14885a;
        r6 = r0.f12107n;
        r7 = r6.length;
        r3 = r1;
    L_0x0036:
        if (r3 >= r7) goto L_0x0046;
    L_0x0038:
        r0 = r6[r3];
        r8 = r0.f11907B;
        r8 = r5.equals(r8);
        if (r8 != 0) goto L_0x0028;
    L_0x0042:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0036;
    L_0x0046:
        r0 = r2;
        goto L_0x0028;
    L_0x0048:
        r0 = r12.ac();
        if (r0 == 0) goto L_0x0092;
    L_0x004e:
        r0 = r12.f14885a;
        r0 = r0.f12115v;
        r5 = r0.f13101H;
        r0 = r12.f14885a;
        r6 = r0.f12107n;
        if (r5 == r9) goto L_0x005c;
    L_0x005a:
        if (r5 != r10) goto L_0x006a;
    L_0x005c:
        r0 = r4;
    L_0x005d:
        if (r0 == 0) goto L_0x007a;
    L_0x005f:
        if (r13 == 0) goto L_0x006c;
    L_0x0061:
        r0 = r13.f11926p;
        if (r0 != r5) goto L_0x006c;
    L_0x0065:
        r0 = r13;
    L_0x0066:
        if (r0 == 0) goto L_0x0092;
    L_0x0068:
        r13 = r0;
        goto L_0x0007;
    L_0x006a:
        r0 = r1;
        goto L_0x005d;
    L_0x006c:
        r7 = r6.length;
        r3 = r1;
    L_0x006e:
        if (r3 >= r7) goto L_0x007a;
    L_0x0070:
        r0 = r6[r3];
        r8 = r0.f11926p;
        if (r8 == r5) goto L_0x0066;
    L_0x0076:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x006e;
    L_0x007a:
        if (r5 == r4) goto L_0x007e;
    L_0x007c:
        if (r5 != r10) goto L_0x008a;
    L_0x007e:
        r0 = com.google.android.finsky.dfemodel.C2731v.PURCHASE;
    L_0x0080:
        if (r0 == 0) goto L_0x0088;
    L_0x0082:
        r0 = com.google.android.finsky.ck.C2288b.m11786a(r6, r4, r0);
        if (r0 != 0) goto L_0x0066;
    L_0x0088:
        r0 = r2;
        goto L_0x0066;
    L_0x008a:
        r0 = 3;
        if (r5 == r0) goto L_0x008f;
    L_0x008d:
        if (r5 != r9) goto L_0x00ca;
    L_0x008f:
        r0 = com.google.android.finsky.dfemodel.C2731v.RENTAL;
        goto L_0x0080;
    L_0x0092:
        r0 = r12.f14885a;
        r0 = r0.f12099f;
        if (r0 != r9) goto L_0x0007;
    L_0x0098:
        switch(r14) {
            case 1: goto L_0x00c1;
            case 2: goto L_0x00c4;
            case 3: goto L_0x00c4;
            default: goto L_0x009b;
        };
    L_0x009b:
        r0 = r1;
    L_0x009c:
        if (r0 == 0) goto L_0x0007;
    L_0x009e:
        r0 = com.google.android.finsky.dfemodel.C2731v.HIGH_DEF;
        r1 = r13.f11926p;
        r0 = r0.m14768a(r1);
        if (r0 != 0) goto L_0x0007;
    L_0x00a8:
        r0 = com.google.android.finsky.dfemodel.C2731v.RENTAL;
        r1 = r13.f11926p;
        r0 = r0.m14768a(r1);
        if (r0 == 0) goto L_0x00c7;
    L_0x00b2:
        r0 = com.google.android.finsky.dfemodel.C2731v.RENTAL_HIGH_DEF;
    L_0x00b4:
        r1 = r12.f14885a;
        r1 = r1.f12107n;
        r0 = com.google.android.finsky.ck.C2288b.m11786a(r1, r4, r0);
        if (r0 == 0) goto L_0x0007;
    L_0x00be:
        r13 = r0;
        goto L_0x0007;
    L_0x00c1:
        r0 = r11.f13266q;
        goto L_0x009c;
    L_0x00c4:
        r0 = r11.f13267r;
        goto L_0x009c;
    L_0x00c7:
        r0 = com.google.android.finsky.dfemodel.C2731v.PURCHASE_HIGH_DEF;
        goto L_0x00b4;
    L_0x00ca:
        r0 = r2;
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.cw.d.a(com.google.android.finsky.dfemodel.Document, com.google.android.finsky.cv.a.bl, int):com.google.android.finsky.cv.a.bl");
    }

    private final void m13151a(Document document, bl blVar, Account account, C2196e c2196e, int i, C2455b c2455b) {
        bl blVar2;
        m13150a(account);
        bl a = m13153a(document, blVar, i);
        if (document.bW()) {
            c2455b.f13243d = 15;
        } else {
            c2455b.f13243d = 4;
        }
        if (!(i == 1 && document.f14885a.f12099f == 4 && this.f13265p)) {
            c2455b.f13245f = a.f11917g;
            if (C2457d.m13152a(a)) {
                c2455b.f13246g = a.f11922l;
            }
        }
        bl[] blVarArr = document.f14885a.f12107n;
        for (bl blVar3 : blVarArr) {
            if (blVar3.f11926p == 2) {
                blVar2 = blVar3;
                break;
            }
        }
        blVar2 = null;
        Object obj = blVar2 != null ? 1 : null;
        int i2 = 2 - (obj != null ? 1 : 0);
        Object obj2;
        if (blVarArr.length <= 2) {
            for (bl blVar4 : blVarArr) {
                i2 = blVar4.f11926p;
                if (!(i2 == 2 || i2 == 11)) {
                    if (Document.m14611a(blVar4)) {
                        c2455b.m13143a(5, blVar4, document, account);
                    } else if (C2731v.RENTAL.m14768a(i2)) {
                        c2455b.m13143a(3, blVar4, document, account);
                    } else if (C2731v.PURCHASE.m14768a(i2)) {
                        obj2 = document.f14885a.f12099f == 3 ? 1 : null;
                        Object obj3 = this.f13253d.m8962c(document) > 0 ? 1 : null;
                        Object obj4 = (this.f13268s && i == 2) ? 1 : null;
                        Object obj5 = (this.f13269t && i == 1) ? 1 : null;
                        obj2 = (obj2 == null || obj3 == null || (obj4 == null && obj5 == null)) ? null : 1;
                        if (!document.bX()) {
                            if (blVar4.f11915e == 0) {
                                if (obj2 != null) {
                                    i2 = 17;
                                } else {
                                    i2 = 7;
                                }
                                c2455b.m13143a(i2, blVar4, document, account);
                            } else {
                                c2455b.m13143a(obj2 != null ? 16 : 1, blVar4, document, account);
                            }
                        }
                    } else {
                        FinskyLog.m21665c("Don't know how to show action for offer type %d on document %s", Integer.valueOf(i2), document);
                    }
                }
            }
        } else if (i2 >= 2) {
            obj2 = (document.f14885a.f12099f == 4 && ((i == 2 || i == 3) && this.f13267r)) ? 1 : null;
            if (c2455b.m13140a(3, blVarArr, C2731v.RENTAL, obj2 != null ? C2731v.RENTAL_HIGH_DEF : C2731v.RENTAL, document, account) + (c2455b.m13140a(1, blVarArr, C2731v.PURCHASE, obj2 != null ? C2731v.PURCHASE_HIGH_DEF : C2731v.PURCHASE, document, account) + 0) != blVarArr.length) {
                FinskyLog.m21669e("Could only handle %d of %d offers", Integer.valueOf(c2455b.m13140a(3, blVarArr, C2731v.RENTAL, obj2 != null ? C2731v.RENTAL_HIGH_DEF : C2731v.RENTAL, document, account) + (c2455b.m13140a(1, blVarArr, C2731v.PURCHASE, obj2 != null ? C2731v.PURCHASE_HIGH_DEF : C2731v.PURCHASE, document, account) + 0)), Integer.valueOf(blVarArr.length));
            }
        } else {
            c2455b.m13144a(13, a, a == blVar, document, account);
        }
        if (obj == null) {
            return;
        }
        if (this.f13254e.dj().mo2294a(12633045) && document.f14885a.f12098e == 64) {
            if (document.bO()) {
                c2455b.m13143a(21, blVar2, document, account);
            }
        } else if (this.f13263n.m11648a(document, c2196e, 2)) {
            c2455b.m13143a(10, blVar2, document, account);
        } else {
            c2455b.m13143a(11, blVar2, document, account);
        }
    }

    public final void m13156a(C2454a c2454a, int i, C2458e c2458e) {
        m13157a(c2454a, i, false, true, 1, c2458e);
    }

    public final void m13155a(C2454a c2454a, int i, int i2, C2458e c2458e) {
        m13157a(c2454a, i, false, true, i2, c2458e);
    }

    public final void m13158b(C2454a c2454a, int i, int i2, C2458e c2458e) {
        m13157a(c2454a, i, true, true, i2, c2458e);
    }

    public final void m13159b(C2454a c2454a, int i, C2458e c2458e) {
        m13157a(c2454a, i, true, true, 0, c2458e);
    }

    public final void m13157a(C2454a c2454a, int i, boolean z, boolean z2, int i2, C2458e c2458e) {
        int i3 = C7582R.string.buy;
        c2458e.m13161a();
        switch (c2454a.f13230a) {
            case 1:
                if (c2454a.f13234e == 0) {
                    if (c2454a.f13233d) {
                        i3 = C7582R.string.purchase_resolution;
                    }
                    if (i == 1) {
                        i3 = m13149a(c2454a, i3);
                    }
                    c2458e.f13271a = i3;
                } else if (i == 3) {
                    if (!z2) {
                        i3 = -1;
                    }
                    c2458e.f13271a = i3;
                } else {
                    C2458e c2458e2;
                    if (i == 4) {
                        if (c2454a.f13239j > 0) {
                            switch (c2454a.f13239j) {
                                case 2:
                                    i3 = C7582R.string.buy_hd;
                                    c2458e2 = c2458e;
                                    break;
                                case 3:
                                    i3 = C7582R.string.buy_uhd;
                                    c2458e2 = c2458e;
                                    break;
                                default:
                                    i3 = C7582R.string.buy_sd;
                                    c2458e2 = c2458e;
                                    break;
                            }
                        } else if (c2454a.f13234e == 7) {
                            i3 = C7582R.string.buy_hd;
                            c2458e2 = c2458e;
                        } else {
                            i3 = C7582R.string.buy_sd;
                            c2458e2 = c2458e;
                        }
                    } else if (z2) {
                        if (i == 1) {
                            i3 = m13149a(c2454a, C7582R.string.buy);
                        }
                        c2458e.f13271a = i3;
                    } else if (i == 1) {
                        i3 = m13149a(c2454a, -1);
                        c2458e2 = c2458e;
                    } else {
                        i3 = -1;
                        c2458e2 = c2458e;
                    }
                    c2458e2.f13271a = i3;
                }
                c2458e.f13272b = c2454a.f13231b;
                c2458e.f13273c = c2454a.f13232c;
                return;
            case 2:
                c2458e.f13271a = C7582R.string.magazine_subscribe;
                return;
            case 3:
                if (c2454a.f13234e == 0) {
                    if (c2454a.f13233d) {
                        i3 = C7582R.string.rent_resolution;
                    } else {
                        i3 = C7582R.string.rent;
                    }
                    c2458e.f13271a = i3;
                } else if (i != 4) {
                    c2458e.f13271a = C7582R.string.rent;
                } else if (c2454a.f13239j > 0) {
                    switch (c2454a.f13239j) {
                        case 2:
                            c2458e.f13271a = C7582R.string.rent_hd;
                            break;
                        case 3:
                            c2458e.f13271a = C7582R.string.rent_uhd;
                            break;
                        default:
                            c2458e.f13271a = C7582R.string.rent_sd;
                            break;
                    }
                } else if (c2454a.f13234e == 4) {
                    c2458e.f13271a = C7582R.string.rent_hd;
                } else {
                    c2458e.f13271a = C7582R.string.rent_sd;
                }
                c2458e.f13272b = c2454a.f13231b;
                c2458e.f13273c = c2454a.f13232c;
                return;
            case 4:
                c2458e.f13271a = z ? C7582R.string.magazine_buy_current_long : C7582R.string.magazine_buy_current;
                c2458e.f13272b = c2454a.f13231b;
                c2458e.f13273c = c2454a.f13232c;
                return;
            case 5:
                if (i != 4) {
                    c2458e.f13271a = C7582R.string.preorder;
                } else if (c2454a.f13234e == 7) {
                    c2458e.f13271a = C7582R.string.preorder_hd;
                } else {
                    c2458e.f13271a = C7582R.string.preorder_sd;
                }
                c2458e.f13272b = c2454a.f13231b;
                c2458e.f13273c = c2454a.f13232c;
                return;
            case 6:
                switch (i) {
                    case 1:
                    case 6:
                        if (this.f13254e.dj().mo2294a(12633045) && c2454a.f13237h.f14885a.f12098e == 64) {
                            c2458e.f13271a = C1592a.ak.intValue();
                            return;
                        } else {
                            c2458e.f13271a = C7582R.string.read;
                            return;
                        }
                    case 2:
                        c2458e.f13271a = C7582R.string.listen;
                        return;
                    case 4:
                        c2458e.f13271a = C7582R.string.play;
                        return;
                    default:
                        c2458e.f13271a = C7582R.string.open;
                        return;
                }
            case 7:
            case 18:
                if (i == 3) {
                    c2458e.f13271a = C7582R.string.install;
                    return;
                } else if (i == 6) {
                    c2458e.f13271a = C7582R.string.add_to_newsstand;
                    return;
                } else if (i == 1) {
                    if (this.f13254e.dj().mo2294a(12633045)) {
                        switch (c2454a.f13237h.f14885a.f12098e) {
                            case 5:
                                i3 = C1592a.ae.intValue();
                                break;
                            case 64:
                                i3 = C1592a.af.intValue();
                                break;
                            default:
                                i3 = C7582R.string.add_to_library;
                                break;
                        }
                    }
                    i3 = C7582R.string.add_to_library;
                    c2458e.f13271a = i3;
                    return;
                } else {
                    c2458e.f13271a = C7582R.string.add_to_library;
                    return;
                }
            case 8:
                c2458e.f13271a = C7582R.string.updates_list_state;
                return;
            case 9:
                c2458e.f13271a = C7582R.string.cancel_preorder;
                return;
            case 10:
            case 11:
                c2458e.f13271a = C7582R.string.sample;
                return;
            case 12:
                c2458e.f13271a = C7582R.string.download;
                return;
            case 13:
                c2458e.f13271a = C7582R.string.purchase_or_rent_resolution;
                c2458e.f13272b = c2454a.f13231b;
                c2458e.f13273c = c2454a.f13232c;
                return;
            case 14:
                c2458e.f13271a = C7582R.string.enable;
                return;
            case 15:
                c2458e.f13271a = C7582R.string.view_bundle;
                return;
            case 16:
                if (i == 3) {
                    c2458e.f13271a = C7582R.string.buy_with_size;
                    c2458e.f13272b = c2454a.f13231b;
                    c2458e.f13273c = c2454a.f13232c;
                    c2458e.f13274d = c2454a.f13236g;
                    return;
                }
                FinskyLog.m21669e("Unsupported backend for %d", Integer.valueOf(c2454a.f13230a));
                return;
            case 17:
                if (i == 3) {
                    c2458e.f13271a = C7582R.string.install_with_size;
                    c2458e.f13274d = c2454a.f13236g;
                    return;
                }
                FinskyLog.m21669e("Unsupported backend for %d", Integer.valueOf(c2454a.f13230a));
                return;
            case 19:
                if (i == 3) {
                    c2458e.f13271a = C7582R.string.update_with_size;
                    c2458e.f13274d = c2454a.f13236g;
                    return;
                }
                c2458e.f13271a = C7582R.string.updates_list_state;
                return;
            case 20:
                c2458e.f13271a = C7582R.string.see_episodes;
                return;
            case 21:
                switch (i2) {
                    case 1:
                    case 2:
                    case 7:
                    case 8:
                        c2458e.f13271a = C1592a.ag.intValue();
                        return;
                    case 3:
                        c2458e.f13271a = C1592a.aj.intValue();
                        return;
                    case 4:
                    case 5:
                        c2458e.f13271a = C1592a.ah.intValue();
                        return;
                    case 6:
                        c2458e.f13271a = C1592a.ai.intValue();
                        return;
                    default:
                        c2458e.f13271a = 0;
                        return;
                }
            default:
                FinskyLog.m21669e("Unrecognized action %d", Integer.valueOf(c2454a.f13230a));
                return;
        }
    }

    private final int m13149a(C2454a c2454a, int i) {
        if (!this.f13254e.dj().mo2294a(12633045)) {
            return i;
        }
        switch (c2454a.f13237h.f14885a.f12098e) {
            case 5:
                return C1592a.ac.intValue();
            case 64:
                return C1592a.ad.intValue();
            default:
                return i;
        }
    }
}
