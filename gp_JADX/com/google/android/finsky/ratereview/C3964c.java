package com.google.android.finsky.ratereview;

import android.content.Context;
import android.support.v4.app.C0254u;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.kd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.dfe.api.C1460g;
import com.google.wireless.android.finsky.dfe.nano.ft;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class C3964c {
    public static final int[] f20003a = new int[]{C7582R.string.review_dialog_unrated, C7582R.string.review_dialog_poor, C7582R.string.review_dialog_below_average, C7582R.string.review_dialog_average, C7582R.string.review_dialog_above_average, C7582R.string.review_dialog_excellent};
    public final C1469x f20004b;
    public final C1287h f20005c;
    public final C1460g f20006d;
    public final ab f20007e;
    public final C1463g f20008f;
    public final C3963b f20009g;

    public static iu m18673a(ft ftVar, boolean z) {
        if (ftVar == null || ftVar.b == null || ftVar.b.b == null) {
            return null;
        }
        for (iu iuVar : ftVar.b.b) {
            if (z && iuVar.f12733u) {
                return iuVar;
            }
            if (!z && !iuVar.f12733u) {
                return iuVar;
            }
        }
        return null;
    }

    public C3964c(C1469x c1469x, C1287h c1287h, C1460g c1460g, ab abVar, C1463g c1463g, C3963b c3963b) {
        this.f20004b = c1469x;
        this.f20005c = c1287h;
        this.f20006d = c1460g;
        this.f20007e = abVar;
        this.f20008f = c1463g;
        this.f20009g = c3963b;
    }

    public final void m18679a(C0254u c0254u, C2651l c2651l, boolean z) {
        this.f20006d.mo2019a(null).mo5377a(new C3965d(this, c0254u, c2651l, z), new C3966e(c0254u, c2651l), true);
    }

    public final void m18682a(String str, String str2, String str3, int i, String str4, String str5, Document document, Context context, C2642m c2642m, int i2, boolean z) {
        m18677a(str, str2, str3, i, str4, str5, null, document, context, c2642m, i2, null, false, z);
    }

    public final void m18681a(String str, String str2, String str3, int i, String str4, String str5, kd kdVar, Document document, Context context, C2642m c2642m, ad adVar, boolean z) {
        m18677a(str, str2, str3, i, str4, str5, kdVar, document, context, c2642m, adVar.getPlayStoreUiElement().c, adVar, z, false);
    }

    private final void m18677a(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24, com.google.android.finsky.cv.p177a.kd r25, com.google.android.finsky.dfemodel.Document r26, android.content.Context r27, com.google.android.finsky.ratereview.C2642m r28, int r29, com.google.android.finsky.p111d.ad r30, boolean r31, boolean r32) {
        /* JADX: method processing error */
/*
Error: java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
	at java.util.BitSet.get(BitSet.java:623)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.usedArgAssign(CodeShrinker.java:138)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.canMove(CodeShrinker.java:129)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.checkInline(CodeShrinker.java:92)
	at jadx.core.dex.visitors.CodeShrinker.shrinkBlock(CodeShrinker.java:223)
	at jadx.core.dex.visitors.CodeShrinker.shrinkMethod(CodeShrinker.java:38)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:196)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:119)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:65)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r18 = this;
        if (r31 == 0) goto L_0x0033;
    L_0x0002:
        r0 = r18;
        r2 = r0.f20009g;
        r2 = r2.m18672a();
        if (r2 != 0) goto L_0x0033;
    L_0x000c:
        r0 = r18;
        r2 = r0.f20009g;
        r3 = r2.f20002b;
        r3 = r3.dj();
        r4 = 12637755; // 0xc0d63b float:1.7709267E-38 double:6.2438806E-317;
        r3 = r3.mo2294a(r4);
        if (r3 == 0) goto L_0x00da;
    L_0x001f:
        r3 = com.google.android.finsky.aa.C0954a.ad;
        r2 = r2.f20001a;
        r2 = r2.cZ();
        r2 = r3.m5777b(r2);
        r3 = 1;
        r3 = java.lang.Boolean.valueOf(r3);
        r2.m5763a(r3);
    L_0x0033:
        r0 = r18;
        r2 = r0.f20004b;
        r0 = r19;
        r2 = r2.mo2248i(r0);
        r3 = android.text.TextUtils.isEmpty(r24);
        if (r3 == 0) goto L_0x0137;
    L_0x0043:
        r3 = android.text.TextUtils.isEmpty(r23);
        if (r3 != 0) goto L_0x0137;
    L_0x0049:
        r5 = "";
        r6 = r23;
    L_0x004d:
        r3 = r20;
        r4 = r22;
        r7 = r25;
        r8 = r26;
        r9 = r21;
        r10 = r32;
        r2.m18690a(r3, r4, r5, r6, r7, r8, r9, r10);
        r7 = r18;
        r8 = r19;
        r9 = r20;
        r10 = r21;
        r11 = r22;
        r12 = r5;
        r13 = r6;
        r14 = r25;
        r15 = r27;
        r16 = r28;
        r17 = r32;
        r7.m18676a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
        r2 = android.text.TextUtils.isEmpty(r5);
        if (r2 == 0) goto L_0x00f0;
    L_0x0079:
        r2 = 0;
    L_0x007a:
        r3 = android.text.TextUtils.isEmpty(r6);
        if (r3 == 0) goto L_0x00f5;
    L_0x0080:
        r3 = 0;
    L_0x0081:
        r3 = r3 + r2;
        r0 = r18;
        r2 = r0.f20008f;
        r0 = r19;
        r4 = r2.mo2242f(r0);
        if (r30 != 0) goto L_0x00fa;
    L_0x008e:
        r2 = 0;
    L_0x008f:
        r5 = new com.google.wireless.android.a.a.a.a.cl;
        r5.<init>();
        r0 = r29;
        r5.b = r0;
        r6 = r5.a;
        r6 = r6 | 1;
        r5.a = r6;
        r6 = r5.a;
        r6 = r6 | 2;
        r5.a = r6;
        r0 = r22;
        r5.c = r0;
        if (r3 <= 0) goto L_0x00b2;
    L_0x00aa:
        r6 = r5.a;
        r6 = r6 | 8;
        r5.a = r6;
        r5.e = r3;
    L_0x00b2:
        if (r25 == 0) goto L_0x0119;
    L_0x00b4:
        r0 = r25;
        r3 = r0.f12860a;
        r3 = r3.length;
        if (r3 <= 0) goto L_0x0119;
    L_0x00bb:
        r3 = 0;
    L_0x00bc:
        r0 = r25;
        r6 = r0.f12860a;
        r6 = r6.length;
        if (r3 >= r6) goto L_0x0119;
    L_0x00c3:
        r0 = r25;
        r6 = r0.f12860a;
        r6 = r6[r3];
        r7 = r5.f;
        r8 = new com.google.wireless.android.a.a.a.a.cq;
        r8.<init>();
        r9 = r6.f12838c;
        if (r9 != 0) goto L_0x0101;
    L_0x00d4:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
    L_0x00da:
        r3 = com.google.android.finsky.aa.C0954a.ae;
        r2 = r2.f20001a;
        r2 = r2.cZ();
        r2 = r3.m5777b(r2);
        r3 = 1;
        r3 = java.lang.Boolean.valueOf(r3);
        r2.m5763a(r3);
        goto L_0x0033;
    L_0x00f0:
        r2 = r5.length();
        goto L_0x007a;
    L_0x00f5:
        r3 = r6.length();
        goto L_0x0081;
    L_0x00fa:
        r2 = r30.getPlayStoreUiElement();
        r2 = r2.d;
        goto L_0x008f;
    L_0x0101:
        r10 = r8.b;
        r10 = r10 | 1;
        r8.b = r10;
        r8.c = r9;
        r6 = r6.f12839d;
        r9 = r8.b;
        r9 = r9 | 2;
        r8.b = r9;
        r8.d = r6;
        com.google.android.finsky.p111d.C2482j.m13300a(r7, r8);
        r3 = r3 + 1;
        goto L_0x00bc;
    L_0x0119:
        r3 = new com.google.android.finsky.d.c;
        r6 = 513; // 0x201 float:7.19E-43 double:2.535E-321;
        r3.<init>(r6);
        r0 = r20;
        r3 = r3.m13236a(r0);
        r2 = r3.m13240a(r2);
        r3 = r2.f13342a;
        r3.f31723w = r5;
        r2 = r2.f13342a;
        r3 = 0;
        r6 = -1;
        r4.m13320a(r2, r3, r6);
        return;
    L_0x0137:
        r6 = r24;
        r5 = r23;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.ratereview.c.a(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.google.android.finsky.cv.a.kd, com.google.android.finsky.dfemodel.Document, android.content.Context, com.google.android.finsky.ratereview.m, int, com.google.android.finsky.d.ad, boolean, boolean):void");
    }

    private final void m18676a(String str, String str2, String str3, int i, String str4, String str5, kd kdVar, Context context, C2642m c2642m, boolean z) {
        C1254c a = this.f20005c.mo2016a(str);
        C3974q i2 = this.f20004b.mo2248i(str);
        a.mo1593a(str2, str4, str5, i, kdVar, this.f20007e.dn().f14881a.f31775r, z, new C3967f(str3, a, i2, str2, z, c2642m, i), new C3968g(i2, str2, z, context, c2642m));
    }

    public final void m18680a(String str, Context context, boolean z) {
        C3980w c3980w;
        C3974q i = this.f20004b.mo2248i(str);
        Map map = z ? i.f20057f : i.f20056e;
        Collection arrayList = new ArrayList();
        for (C3980w c3980w2 : map.values()) {
            if (!(c3980w2 == C3974q.f20052a || c3980w2.f20070d)) {
                arrayList.add(c3980w2);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                c3980w2 = (C3980w) arrayList2.get(i2);
                FinskyLog.m21665c("Sending unsubmitted review for account: %s and docId: %s", FinskyLog.m21655a(str), c3980w2.f20068b);
                iu iuVar = c3980w2.f20067a;
                m18676a(str, c3980w2.f20068b, c3980w2.f20069c, iuVar.f12717e, iuVar.f12719g, iuVar.f12720h, iuVar.f12730r, context, null, z);
                i2 = i3;
            }
        }
    }

    public static boolean m18678a(C2206c c2206c, Document document) {
        switch (document.f14885a.f12098e) {
            case 1:
                if (c2206c.mo2812a(document.m14625N().f13171k).isEmpty()) {
                    return false;
                }
                return true;
            case 2:
            case 5:
            case 6:
            case 16:
            case 18:
            case 24:
            case 64:
                return true;
            default:
                return false;
        }
    }

    public final void m18683a(String str, String str2, String str3, Context context, C2642m c2642m, boolean z) {
        C3974q i = this.f20004b.mo2248i(str);
        i.m18692a(str2, z);
        C1254c a = this.f20005c.mo2016a(str);
        a.mo1627b(str2, z, new C3969h(str3, a, c2642m), new C3970i(i, str2, z, context, c2642m));
    }

    static void m18675a(Context context, String str) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = context.getResources().getText(C7582R.string.review_error);
            }
            Toast.makeText(context, str, 0).show();
        }
    }

    static void m18674a(Context context) {
        if (context != null) {
            Toast.makeText(context, C7582R.string.review_deleted_error, 0).show();
        }
    }
}
