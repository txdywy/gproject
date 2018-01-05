package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.Fragment;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ap.C1249a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.cw.C2455b;
import com.google.android.finsky.cw.C2456c;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C1013j {
    public static final List f6197a;
    public static final List f6198b;
    public static final List f6199c = new ArrayList();
    public static final List f6200d = new ArrayList();
    public static final Map f6201e;
    public final C0997b f6202f;
    public final C3027b f6203g;
    public final C3646a f6204h;
    public final Context f6205i;
    public final C1249a f6206j;
    public final C2456c f6207k;
    public final C1461c f6208l;
    public final C3300k f6209m;
    public final C3340g f6210n;
    public final C2206c f6211o;
    public final C2233o f6212p;
    public final C2266a f6213q;
    public final PackageManager f6214r;
    public final C3934g f6215s;
    public final C2457d f6216t;
    public final C2833a f6217u;
    public final ab f6218v;

    public C1013j(C0997b c0997b, C3027b c3027b, C3646a c3646a, Context context, C1249a c1249a, C2456c c2456c, C1461c c1461c, C3300k c3300k, C3340g c3340g, C2206c c2206c, C2233o c2233o, C2266a c2266a, PackageManager packageManager, C3934g c3934g, C2457d c2457d, C2833a c2833a, ab abVar) {
        this.f6202f = c0997b;
        this.f6203g = c3027b;
        this.f6204h = c3646a;
        this.f6205i = context;
        this.f6206j = c1249a;
        this.f6207k = c2456c;
        this.f6208l = c1461c;
        this.f6209m = c3300k;
        this.f6210n = c3340g;
        this.f6211o = c2206c;
        this.f6212p = c2233o;
        this.f6213q = c2266a;
        this.f6214r = packageManager;
        this.f6215s = c3934g;
        this.f6216t = c2457d;
        this.f6217u = c2833a;
        this.f6218v = abVar;
    }

    public final List m5993a(List list, C2495w c2495w, Fragment fragment, ad adVar, Document document, ad adVar2, String str, Context context, C3748a c3748a, int i, String str2, int i2, boolean z, boolean z2, Intent intent, an anVar, int i3) {
        C2455b c2455b;
        List arrayList = new ArrayList();
        DfeToc dn = this.f6218v.dn();
        Account b = this.f6206j.m7251b(document, str2);
        int a = C1013j.m5981a(list);
        int i4 = document.f14885a.f12099f;
        if (i4 == 1 || i4 == 6 || i4 == 4) {
            C2455b a2 = this.f6207k.m13148a();
            this.f6216t.m13154a(b, dn, i, document, a2);
            c2455b = a2;
        } else {
            c2455b = null;
        }
        int i5 = 0;
        while (i5 < list.size()) {
            int i6;
            Object aeVar;
            int intValue = ((Integer) list.get(i5)).intValue();
            if (i2 != -1) {
                i6 = i2;
            } else {
                if (C1013j.m5979a(intValue) == a) {
                    i6 = 0;
                } else {
                    i6 = 2;
                }
                if (intValue == 18) {
                    i6 = 2;
                }
                if (intValue == 19) {
                    i6 = 2;
                }
            }
            C2454a c2454a = null;
            if (c2455b != null && i5 < c2455b.f13244e) {
                boolean contains;
                i4 = document.f14885a.f12099f;
                if (i4 == 1 || i4 == 6 || i4 == 4) {
                    Set hashSet = new HashSet();
                    hashSet.add(Integer.valueOf(12));
                    hashSet.add(Integer.valueOf(20));
                    hashSet.add(Integer.valueOf(19));
                    hashSet.add(Integer.valueOf(16));
                    hashSet.add(Integer.valueOf(4));
                    hashSet.add(Integer.valueOf(13));
                    hashSet.add(Integer.valueOf(23));
                    contains = hashSet.contains(Integer.valueOf(intValue));
                } else {
                    contains = false;
                }
                if (contains) {
                    c2454a = c2455b.m13141a(i5);
                }
            }
            Account a3 = this.f6212p.m11642a(document, b);
            C0997b c0997b = this.f6202f;
            boolean a4 = m5995a();
            switch (intValue) {
                case 1:
                    aeVar = new ae(context, i6, c2495w, adVar2, document, c0997b.f6125q, c0997b.f6114f, intent);
                    break;
                case 2:
                    aeVar = new aj(context, i6, c3748a, document, adVar2, c2495w);
                    break;
                case 3:
                    aeVar = new C1027w(context, i6, document, adVar2, c2495w, c0997b.f6117i);
                    break;
                case 4:
                    aeVar = new ab(context, i6, c3748a, document, adVar2, b, c2454a, c2495w, c0997b.f6112d, c0997b.f6115g, c0997b.f6119k, c0997b.f6120l, c0997b.f6124p);
                    break;
                case 5:
                case 26:
                    aeVar = new ap(context, i6, c3748a, document, adVar2, c2495w, a4, c0997b.f6109a, c0997b.f6112d);
                    break;
                case 6:
                case 25:
                    aeVar = new ad(context, i6, c3748a, document, adVar2, b, c2495w, a4, c0997b.f6112d);
                    break;
                case 7:
                case 27:
                    aeVar = new ai(context, i6, c3748a, document, adVar2, b, c2495w, a4, c0997b.f6112d);
                    break;
                case 8:
                    aeVar = new as(context, i6, document, adVar2, fragment, c2495w, c0997b.f6111c, c0997b.f6119k, c0997b.f6115g);
                    break;
                case 9:
                    aeVar = new am(context, i6, document, adVar2, fragment, c2495w, c0997b.f6111c, c0997b.f6121m);
                    break;
                case 10:
                    aeVar = new C1030z(context, i6, document, adVar2, fragment, c2495w);
                    break;
                case 11:
                    aeVar = new av(context, i6, document, b, c3748a, str, adVar2, c2495w);
                    break;
                case 12:
                    aeVar = new ah(context, i6, c3748a, document, adVar2, b, c2454a, str, c2495w, z, c0997b.f6119k, c0997b.f6124p, c0997b.f6125q);
                    break;
                case 13:
                    C1024t c1024t = new C1024t(context, i6, document, a3, adVar2, fragment, c2495w, c2454a, c0997b.f6113e, c0997b.f6124p, c0997b.f6122n);
                    break;
                case 14:
                    aeVar = new C1029y(context, i6, document, b, adVar2, c3748a, c2495w, c0997b.f6116h);
                    break;
                case 15:
                    aeVar = new ac(context, i6, document, adVar2, c2495w);
                    break;
                case 16:
                    aq aqVar = new aq(context, i6, document, str, adVar2, b, c3748a, c2454a, c2495w, adVar, c0997b.f6118j, c0997b.f6119k, c0997b.f6124p, anVar, i3);
                    break;
                case 17:
                    aeVar = new al(context, i6, document, adVar2, c2495w, fragment, b, c0997b.f6113e, c0997b.f6123o);
                    break;
                case 18:
                    aeVar = new au(context, i6, document, adVar2, fragment, b, c2495w, c0997b.f6113e, c0997b.f6123o);
                    break;
                case 19:
                case 20:
                    C1021q c1021q = new C1021q(context, i6, document, str, adVar2, b, c3748a, c2454a, c2495w, c0997b.f6110b, c0997b.f6127s, c0997b.f6118j, c0997b.f6119k, c0997b.f6124p, c0997b.f6125q, z2);
                    break;
                case 21:
                    aeVar = new ak(context, i6, document, str, b, c3748a, adVar2, c2495w);
                    break;
                case 22:
                    aeVar = new aw(context, i6, c3748a, document, c2495w, adVar2, c0997b.f6126r, c0997b.f6109a);
                    break;
                case 23:
                    ao aoVar = new ao(context, i6, c3748a, document, adVar2, c2454a, c2495w, c0997b.f6124p);
                    break;
                default:
                    FinskyLog.m21669e("Unknown button type - %d encountered", Integer.valueOf(intValue));
                    aeVar = null;
                    break;
            }
            if (aeVar != null) {
                arrayList.add(aeVar);
            }
            i5++;
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m5994a(java.util.List r15, com.google.android.finsky.dfemodel.Document r16, android.accounts.Account r17, android.content.Intent r18) {
        /*
        r14 = this;
        r2 = r14.f6211o;
        r0 = r17;
        r3 = r2.mo2811a(r0);
        r2 = r14.f6218v;
        r4 = r2.dn();
        r2 = r14.f6212p;
        r0 = r16;
        r1 = r17;
        r7 = r2.m11642a(r0, r1);
        r2 = 0;
        r5 = 0;
        r0 = r16;
        r6 = r0.f14885a;
        r6 = r6.f12099f;
        r8 = 3;
        if (r6 != r8) goto L_0x029d;
    L_0x0023:
        r2 = r16.m14625N();
        r2 = r2.f13171k;
        r5 = r14.f6203g;
        r5 = r5.m15626a(r2);
        r9 = r2;
    L_0x0030:
        r2 = r14.f6212p;
        r0 = r16;
        r8 = r2.m11649a(r0, r4, r3);
        r2 = 0;
        r10 = r2;
    L_0x003a:
        r2 = r15.size();
        if (r10 >= r2) goto L_0x029c;
    L_0x0040:
        r2 = r15.get(r10);
        r2 = (java.lang.Integer) r2;
        r11 = r2.intValue();
        r2 = r14.f6211o;
        r0 = r17;
        r12 = r2.mo2811a(r0);
        r2 = r14.f6218v;
        r4 = r2.dn();
        r2 = r14;
        r3 = r16;
        r6 = r17;
        r2 = r2.m5996a(r3, r4, r5, r6, r7, r8);
        if (r2 != 0) goto L_0x007c;
    L_0x0063:
        r2 = 1;
    L_0x0064:
        r3 = r14.f6212p;
        r3 = r3.m11644a(r12);
        r6 = r14.f6212p;
        r0 = r16;
        r6 = r6.m11654b(r0);
        switch(r11) {
            case 1: goto L_0x0268;
            case 2: goto L_0x0213;
            case 3: goto L_0x01a8;
            case 4: goto L_0x01a0;
            case 5: goto L_0x007e;
            case 6: goto L_0x009c;
            case 7: goto L_0x00ba;
            case 8: goto L_0x00d8;
            case 9: goto L_0x00ed;
            case 10: goto L_0x010b;
            case 11: goto L_0x0121;
            case 12: goto L_0x01bf;
            case 13: goto L_0x01b0;
            case 14: goto L_0x012b;
            case 15: goto L_0x013f;
            case 16: goto L_0x0206;
            case 17: goto L_0x0159;
            case 18: goto L_0x017b;
            case 19: goto L_0x0075;
            case 20: goto L_0x01e2;
            case 21: goto L_0x01ed;
            case 22: goto L_0x0075;
            case 23: goto L_0x0075;
            case 24: goto L_0x0223;
            case 25: goto L_0x00ab;
            case 26: goto L_0x008d;
            case 27: goto L_0x00c9;
            default: goto L_0x0075;
        };
    L_0x0075:
        r2 = 1;
    L_0x0076:
        if (r2 != 0) goto L_0x0297;
    L_0x0078:
        r15.remove(r10);
        goto L_0x003a;
    L_0x007c:
        r2 = 0;
        goto L_0x0064;
    L_0x007e:
        r2 = r14.m5995a();
        if (r2 == 0) goto L_0x0086;
    L_0x0084:
        r2 = 0;
        goto L_0x0076;
    L_0x0086:
        r0 = r16;
        r2 = r14.m5987a(r0, r3, r6);
        goto L_0x0076;
    L_0x008d:
        r2 = r14.m5995a();
        if (r2 != 0) goto L_0x0095;
    L_0x0093:
        r2 = 0;
        goto L_0x0076;
    L_0x0095:
        r0 = r16;
        r2 = r14.m5987a(r0, r3, r6);
        goto L_0x0076;
    L_0x009c:
        r2 = r14.m5995a();
        if (r2 == 0) goto L_0x00a4;
    L_0x00a2:
        r2 = 0;
        goto L_0x0076;
    L_0x00a4:
        r0 = r16;
        r2 = r14.m5990b(r0, r3, r6);
        goto L_0x0076;
    L_0x00ab:
        r2 = r14.m5995a();
        if (r2 != 0) goto L_0x00b3;
    L_0x00b1:
        r2 = 0;
        goto L_0x0076;
    L_0x00b3:
        r0 = r16;
        r2 = r14.m5990b(r0, r3, r6);
        goto L_0x0076;
    L_0x00ba:
        r4 = r14.m5995a();
        if (r4 == 0) goto L_0x00c2;
    L_0x00c0:
        r2 = 0;
        goto L_0x0076;
    L_0x00c2:
        r0 = r16;
        r2 = r14.m5988a(r0, r2, r3, r6);
        goto L_0x0076;
    L_0x00c9:
        r4 = r14.m5995a();
        if (r4 != 0) goto L_0x00d1;
    L_0x00cf:
        r2 = 0;
        goto L_0x0076;
    L_0x00d1:
        r0 = r16;
        r2 = r14.m5988a(r0, r2, r3, r6);
        goto L_0x0076;
    L_0x00d8:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x00eb;
    L_0x00e1:
        r2 = r5.m15623b();
        if (r2 == 0) goto L_0x00eb;
    L_0x00e7:
        r2 = r5.f15829q;
        if (r2 == 0) goto L_0x0075;
    L_0x00eb:
        r2 = 0;
        goto L_0x0076;
    L_0x00ed:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x0108;
    L_0x00f6:
        r2 = r5.m15623b();
        if (r2 == 0) goto L_0x0100;
    L_0x00fc:
        r2 = r5.f15829q;
        goto L_0x0076;
    L_0x0100:
        r2 = r5.f15824l;
        if (r2 != 0) goto L_0x0108;
    L_0x0104:
        r2 = r5.f15829q;
        if (r2 != 0) goto L_0x0075;
    L_0x0108:
        r2 = 0;
        goto L_0x0076;
    L_0x010b:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x011e;
    L_0x0114:
        r2 = r5.m15623b();
        if (r2 != 0) goto L_0x011e;
    L_0x011a:
        r2 = r5.f15824l;
        if (r2 != 0) goto L_0x0075;
    L_0x011e:
        r2 = 0;
        goto L_0x0076;
    L_0x0121:
        r0 = r16;
        r1 = r17;
        r2 = r14.m5985a(r0, r1, r5, r4);
        goto L_0x0076;
    L_0x012b:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x013c;
    L_0x0134:
        r2 = r5.f15831s;
        if (r2 == 0) goto L_0x013c;
    L_0x0138:
        r2 = r5.f15832t;
        if (r2 != 0) goto L_0x0075;
    L_0x013c:
        r2 = 0;
        goto L_0x0076;
    L_0x013f:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x0156;
    L_0x0148:
        r2 = r5.f15831s;
        if (r2 != 0) goto L_0x0156;
    L_0x014c:
        r2 = r5.f15833u;
        if (r2 == 0) goto L_0x0156;
    L_0x0150:
        r2 = r5.m15621a();
        if (r2 != 0) goto L_0x0075;
    L_0x0156:
        r2 = 0;
        goto L_0x0076;
    L_0x0159:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x0178;
    L_0x0162:
        r2 = r16.ae();
        if (r2 == 0) goto L_0x0178;
    L_0x0168:
        r2 = r14.f6215s;
        r0 = r16;
        r3 = r0.f14885a;
        r3 = r3.f12096c;
        r0 = r17;
        r2 = r2.m18640a(r3, r0);
        if (r2 == 0) goto L_0x0075;
    L_0x0178:
        r2 = 0;
        goto L_0x0076;
    L_0x017b:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 == r3) goto L_0x0187;
    L_0x0184:
        r2 = 0;
        goto L_0x0076;
    L_0x0187:
        r2 = r16.ae();
        if (r2 != 0) goto L_0x0190;
    L_0x018d:
        r2 = 0;
        goto L_0x0076;
    L_0x0190:
        r2 = r14.f6215s;
        r0 = r16;
        r3 = r0.f14885a;
        r3 = r3.f12096c;
        r0 = r17;
        r2 = r2.m18640a(r3, r0);
        goto L_0x0076;
    L_0x01a0:
        r0 = r16;
        r2 = r14.m5986a(r0, r9, r5, r4);
        goto L_0x0076;
    L_0x01a8:
        r0 = r16;
        r2 = r14.m5986a(r0, r9, r5, r4);
        goto L_0x0076;
    L_0x01b0:
        if (r7 == 0) goto L_0x01bc;
    L_0x01b2:
        r2 = r14.f6212p;
        r0 = r16;
        r2 = r2.m11655c(r0, r12);
        if (r2 != 0) goto L_0x0075;
    L_0x01bc:
        r2 = 0;
        goto L_0x0076;
    L_0x01bf:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x01d3;
    L_0x01c8:
        r2 = r5.f15831s;
        if (r2 == 0) goto L_0x01d0;
    L_0x01cc:
        r2 = r5.f15832t;
        if (r2 == 0) goto L_0x0075;
    L_0x01d0:
        r2 = 0;
        goto L_0x0076;
    L_0x01d3:
        if (r7 == 0) goto L_0x01df;
    L_0x01d5:
        r2 = r14.f6212p;
        r0 = r16;
        r2 = r2.m11655c(r0, r12);
        if (r2 == 0) goto L_0x0075;
    L_0x01df:
        r2 = 0;
        goto L_0x0076;
    L_0x01e2:
        r2 = r14;
        r3 = r16;
        r6 = r17;
        r2 = r2.m5996a(r3, r4, r5, r6, r7, r8);
        goto L_0x0076;
    L_0x01ed:
        if (r8 == 0) goto L_0x01f1;
    L_0x01ef:
        if (r7 == 0) goto L_0x01f4;
    L_0x01f1:
        r2 = 0;
        goto L_0x0076;
    L_0x01f4:
        r2 = 1;
        r0 = r16;
        r2 = r0.m14649e(r2);
        if (r2 == 0) goto L_0x0203;
    L_0x01fd:
        r2 = r16.ab();
        if (r2 != 0) goto L_0x0075;
    L_0x0203:
        r2 = 0;
        goto L_0x0076;
    L_0x0206:
        if (r7 != 0) goto L_0x0210;
    L_0x0208:
        if (r8 == 0) goto L_0x0210;
    L_0x020a:
        r2 = r16.ag();
        if (r2 != 0) goto L_0x0075;
    L_0x0210:
        r2 = 0;
        goto L_0x0076;
    L_0x0213:
        r0 = r16;
        r2 = r0.f14885a;
        r2 = r2.f12099f;
        r3 = 3;
        if (r2 != r3) goto L_0x0220;
    L_0x021c:
        r2 = r5.f15820h;
        if (r2 == 0) goto L_0x0075;
    L_0x0220:
        r2 = 0;
        goto L_0x0076;
    L_0x0223:
        r2 = r14.f6205i;
        r2 = com.google.android.finsky.as.C1503a.m8831b(r2);
        if (r2 == 0) goto L_0x0265;
    L_0x022b:
        r2 = r5.f15820h;
        if (r2 == 0) goto L_0x0265;
    L_0x022f:
        r0 = r16;
        r1 = r17;
        r2 = r14.m5985a(r0, r1, r5, r4);
        if (r2 != 0) goto L_0x0265;
    L_0x0239:
        r2 = r16.cf();
        r3 = r14.f6205i;
        r3 = com.google.android.finsky.as.C1503a.m8831b(r3);
        if (r3 == 0) goto L_0x0265;
    L_0x0245:
        r3 = new android.content.Intent;
        r4 = "android.service.wallpaper.WallpaperService";
        r3.<init>(r4);
        r4 = "com.google.android.wearable.watchface.category.WATCH_FACE";
        r3 = r3.addCategory(r4);
        r3.setPackage(r2);
        r2 = r14.f6214r;
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2.queryIntentServices(r3, r4);
        if (r2 == 0) goto L_0x0265;
    L_0x025f:
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x0075;
    L_0x0265:
        r2 = 0;
        goto L_0x0076;
    L_0x0268:
        r2 = r14;
        r3 = r16;
        r6 = r17;
        r2 = r2.m5996a(r3, r4, r5, r6, r7, r8);
        if (r2 == 0) goto L_0x0294;
    L_0x0273:
        if (r18 == 0) goto L_0x0294;
    L_0x0275:
        r2 = r14.f6214r;
        r3 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r0 = r18;
        r2 = r2.queryIntentActivities(r0, r3);
        r2 = r2.isEmpty();
        if (r2 != 0) goto L_0x0294;
    L_0x0285:
        r2 = r14.f6208l;
        r2 = r2.dj();
        r12 = 12636357; // 0xc0d0c5 float:1.7707308E-38 double:6.24319E-317;
        r2 = r2.mo2294a(r12);
        if (r2 != 0) goto L_0x0075;
    L_0x0294:
        r2 = 0;
        goto L_0x0076;
    L_0x0297:
        r2 = r10 + 1;
        r10 = r2;
        goto L_0x003a;
    L_0x029c:
        return;
    L_0x029d:
        r9 = r2;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.actionbuttons.j.a(java.util.List, com.google.android.finsky.dfemodel.Document, android.accounts.Account, android.content.Intent):void");
    }

    final List m5992a(Account account, Document document, int i) {
        DfeToc dn = this.f6218v.dn();
        C2455b a = this.f6207k.m13148a();
        this.f6216t.m13154a(account, dn, i, document, a);
        List arrayList = new ArrayList();
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(6), Integer.valueOf(12));
        hashMap.put(Integer.valueOf(9), Integer.valueOf(13));
        hashMap.put(Integer.valueOf(11), Integer.valueOf(16));
        hashMap.put(Integer.valueOf(10), Integer.valueOf(16));
        hashMap.put(Integer.valueOf(21), Integer.valueOf(16));
        hashMap.put(Integer.valueOf(12), Integer.valueOf(4));
        hashMap.put(Integer.valueOf(20), Integer.valueOf(23));
        int i2 = 0;
        for (int i3 = 0; i3 < a.f13244e; i3++) {
            if (i3 >= 2) {
                FinskyLog.m21665c("Not supposed to have more than %d actions available", Integer.valueOf(2));
                break;
            }
            int intValue;
            C2454a a2 = a.m13141a(i3);
            if (hashMap.containsKey(Integer.valueOf(a2.f13230a))) {
                intValue = ((Integer) hashMap.get(Integer.valueOf(a2.f13230a))).intValue();
            } else {
                if (i2 == 0) {
                    intValue = 20;
                } else {
                    intValue = 19;
                }
                i2++;
            }
            arrayList.add(Integer.valueOf(intValue));
        }
        if (!a.m13146b() && document.f14885a.f12092I) {
            arrayList.add(Integer.valueOf(22));
        }
        return arrayList;
    }

    public final boolean m5996a(Document document, DfeToc dfeToc, C3026a c3026a, Account account, Account account2, boolean z) {
        if (document.f14885a.f12099f == 3) {
            if (c3026a.f15820h || document.ae() || !this.f6212p.m11649a(document, dfeToc, this.f6211o) || this.f6217u.m14989b(document) || this.f6217u.m14991c(document, account)) {
                return false;
            }
            return true;
        } else if (!z || account2 != null) {
            return false;
        } else {
            if (document.m14649e(1) == null || document.ab()) {
                return false;
            }
            return true;
        }
    }

    private final boolean m5985a(Document document, Account account, C3026a c3026a, DfeToc dfeToc) {
        if (document.f14885a.f12099f != 3) {
            return false;
        }
        C2196e a = this.f6211o.mo2811a(account);
        if ((c3026a.m15624b(document) || c3026a.m15622a(document)) && this.f6212p.m11649a(document, dfeToc, a) && !c3026a.f15833u) {
            return true;
        }
        return false;
    }

    private final boolean m5986a(Document document, String str, C3026a c3026a, DfeToc dfeToc) {
        if (document.f14885a.f12099f == 3 && !c3026a.f15820h && !document.ae() && this.f6212p.m11649a(document, dfeToc, this.f6211o)) {
            return m5997a(this.f6210n.mo3485c(str));
        }
        return false;
    }

    private final boolean m5987a(Document document, boolean z, boolean z2) {
        if (document.f14885a.f12099f == 2 && m5989a(z2) && !z) {
            return this.f6208l.dj().mo2294a(12602761);
        }
        return false;
    }

    private final boolean m5990b(Document document, boolean z, boolean z2) {
        if (document.f14885a.f12099f == 2 && m5989a(z2) && !z && !this.f6208l.dj().mo2294a(12602761)) {
            return true;
        }
        return false;
    }

    private final boolean m5988a(Document document, boolean z, boolean z2, boolean z3) {
        if (document.f14885a.f12099f == 2 && m5989a(z3) && z2 && !z) {
            return true;
        }
        return false;
    }

    private final boolean m5989a(boolean z) {
        boolean a = this.f6208l.dj().mo2294a(87);
        boolean a2 = this.f6208l.dj().mo2294a(12602761);
        if ((a || a2) && z) {
            return true;
        }
        return false;
    }

    private static int m5979a(int i) {
        switch (i) {
            case 1:
            case 16:
                return 1;
            case 2:
            case 3:
            case 23:
                return 6;
            case 4:
            case 5:
            case 6:
            case 7:
                return 5;
            case 8:
            case 9:
            case 10:
                return 4;
            case 11:
                return 3;
            case 12:
            case 13:
            case 14:
            case 15:
                return 2;
            case 17:
            case 18:
                return -1;
            case 19:
            case 20:
            case 21:
            case 22:
                return 0;
            case 25:
            case 26:
            case 27:
                return -1;
            default:
                return 0;
        }
    }

    private static int m5981a(List list) {
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int a = C1013j.m5979a(((Integer) list.get(i2)).intValue());
            if (a < i) {
                i = a;
            }
        }
        return i;
    }

    public final boolean m5997a(C3371p c3371p) {
        return this.f6208l.dj().mo2294a(12607073) && c3371p.f17279d == 196 && this.f6213q.m11722d();
    }

    public final boolean m5995a() {
        return this.f6208l.dj().mo2294a(12620773);
    }

    public final String m5991a(Context context) {
        if (this.f6208l.dj().mo2294a(12625960)) {
            for (C3647b c3647b : this.f6204h.m17245a()) {
                String string;
                String str = c3647b.f18026a;
                int b = this.f6210n.mo3482b(str);
                if (C4672c.m21804a(C4680k.m21818a((String) C0955b.ij.m28964b()), (Object) str)) {
                    string = context.getString(C7582R.string.download_pending_silent_update);
                } else {
                    string = m5983a(str);
                }
                if (b == 3) {
                    return context.getString(C7582R.string.download_pending_another_install, new Object[]{string});
                } else if (b == 2) {
                    return context.getString(C7582R.string.download_pending_another_download, new Object[]{string});
                }
            }
        }
        return context.getString(C7582R.string.download_pending);
    }

    public static boolean m5984a(C2454a c2454a) {
        return (c2454a.f13230a == 9 || c2454a.f13230a == 12 || c2454a.f13230a == 15 || c2454a.f13230a == 21) ? false : true;
    }

    public static OnClickListener m5982a(C2454a c2454a, int i, C3748a c3748a, String str, ad adVar, Context context, C2495w c2495w) {
        switch (c2454a.f13230a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 11:
            case 13:
            case 16:
            case 17:
            case 19:
                return c3748a.mo3624a(c2454a.f13238i, c2454a.f13237h, c2454a.f13234e, c2454a.f13235f, str, C1013j.m5980a(c2454a, i), adVar, c2495w);
            case 6:
            case 10:
                return c3748a.mo3626a(c2454a.f13237h, c2454a.f13238i, adVar, c2495w);
            case 14:
                return new C1018m(c2454a, context);
            case 18:
                return new C1014k(c2495w, adVar, c3748a, c2454a, str);
            case 20:
                return new C1019n(c3748a, c2454a, c2495w, adVar);
            default:
                FinskyLog.m21669e("Unrecognized action %s", c2454a);
                return null;
        }
    }

    private final String m5983a(String str) {
        String n = this.f6209m.mo3460n(str);
        if (n != null) {
            return n;
        }
        try {
            return this.f6214r.getApplicationLabel(this.f6214r.getApplicationInfo(str, 0)).toString();
        } catch (NameNotFoundException e) {
            return str;
        }
    }

    public static int m5980a(C2454a c2454a, int i) {
        switch (c2454a.f13230a) {
            case 1:
            case 13:
            case 16:
                if (c2454a.f13234e == 7) {
                    return 232;
                }
                if (i == 4) {
                    return 231;
                }
                return 200;
            case 2:
                return 226;
            case 3:
                if (c2454a.f13234e == 4) {
                    return 229;
                }
                if (i == 4) {
                    return 228;
                }
                return 200;
            case 4:
            case 5:
                return 200;
            case 6:
            case 10:
                return 218;
            case 7:
            case 17:
            case 18:
                return 221;
            case 8:
            case 19:
                return 217;
            case 9:
                return 235;
            case 11:
            case 21:
                return 222;
            case 12:
                return 224;
            case 14:
                return 220;
            case 15:
                return 2703;
            case 20:
                return 2916;
            default:
                FinskyLog.m21669e("Unrecognized action %s", Integer.valueOf(c2454a.f13230a));
                return -1;
        }
    }

    static {
        int i;
        List arrayList = new ArrayList();
        f6197a = arrayList;
        arrayList.add(Integer.valueOf(13));
        f6197a.add(Integer.valueOf(12));
        f6197a.add(Integer.valueOf(20));
        f6197a.add(Integer.valueOf(21));
        f6197a.add(Integer.valueOf(16));
        arrayList = new ArrayList();
        f6198b = arrayList;
        arrayList.add(Integer.valueOf(1));
        f6198b.add(Integer.valueOf(8));
        f6198b.add(Integer.valueOf(9));
        f6198b.add(Integer.valueOf(10));
        f6198b.add(Integer.valueOf(11));
        f6198b.add(Integer.valueOf(12));
        f6198b.add(Integer.valueOf(14));
        f6198b.add(Integer.valueOf(15));
        f6198b.add(Integer.valueOf(3));
        f6198b.add(Integer.valueOf(4));
        f6198b.add(Integer.valueOf(20));
        f6198b.add(Integer.valueOf(17));
        f6198b.add(Integer.valueOf(18));
        for (i = 0; i < f6197a.size(); i++) {
            f6199c.add((Integer) f6197a.get(i));
        }
        f6199c.add(Integer.valueOf(5));
        f6199c.add(Integer.valueOf(6));
        f6199c.add(Integer.valueOf(7));
        for (i = 0; i < f6197a.size(); i++) {
            f6200d.add((Integer) f6197a.get(i));
        }
        f6200d.add(Integer.valueOf(26));
        f6200d.add(Integer.valueOf(25));
        f6200d.add(Integer.valueOf(27));
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(12), Integer.valueOf(1));
        hashMap.put(Integer.valueOf(14), Integer.valueOf(1));
        hashMap.put(Integer.valueOf(15), Integer.valueOf(1));
        hashMap.put(Integer.valueOf(17), Integer.valueOf(0));
        hashMap.put(Integer.valueOf(18), Integer.valueOf(0));
        f6201e = Collections.unmodifiableMap(hashMap);
    }
}
