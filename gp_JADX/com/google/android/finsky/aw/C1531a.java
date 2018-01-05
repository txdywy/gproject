package com.google.android.finsky.aw;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.dl;
import com.google.android.finsky.cv.p177a.gs;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p002a.C0002a;

public final class C1531a {
    public final C0002a f8263a;
    public final C0002a f8264b;
    public final C0002a f8265c;
    public Map f8266d = new HashMap();

    public C1531a(C0002a c0002a, C0002a c0002a2, C0002a c0002a3) {
        this.f8263a = c0002a;
        this.f8264b = c0002a2;
        this.f8265c = c0002a3;
    }

    public final void m8959a(Document document) {
        C2441n N = document.m14625N();
        if (N != null) {
            long c = m8962c(document);
            m8960a(N.f13171k);
            this.f8266d.put(N.f13171k, new C1532b(N.f13163c, c));
        }
    }

    public final void m8960a(String str) {
        this.f8266d.remove(str);
    }

    public final long m8961b(Document document) {
        return m8962c(document);
    }

    public final long m8957a(com.google.wireless.android.finsky.b.a r13, java.lang.String r14, int r15) {
        /* JADX: method processing error */
/*
Error: java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
	at java.util.BitSet.get(BitSet.java:623)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.usedArgAssign(CodeShrinker.java:138)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.access$300(CodeShrinker.java:43)
	at jadx.core.dex.visitors.CodeShrinker.canMoveBetweenBlocks(CodeShrinker.java:282)
	at jadx.core.dex.visitors.CodeShrinker.shrinkBlock(CodeShrinker.java:230)
	at jadx.core.dex.visitors.CodeShrinker.shrinkMethod(CodeShrinker.java:38)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:196)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:119)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:65)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
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
        r12 = this;
        r2 = 1;
        r3 = 0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r4 = new com.google.android.finsky.cv.a.dl;
        r4.<init>();
        r4.m12431a(r3);
        r4.m12436b(r15);
        r6 = r13.b;
        r4.m12432a(r6);
        r0 = r13.a;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0078;
    L_0x001d:
        r0 = r2;
    L_0x001e:
        if (r0 == 0) goto L_0x002b;
    L_0x0020:
        r0 = r13.f();
        if (r0 == 0) goto L_0x002b;
    L_0x0026:
        r6 = r13.c;
        r4.m12437b(r6);
    L_0x002b:
        r0 = r13.q;
        r0 = com.google.android.finsky.aw.C1531a.m8955a(r0);
        r4.f12158g = r0;
        r1.add(r4);
        r5 = r13.j;
        r6 = r5.length;
        r4 = r3;
    L_0x003a:
        if (r4 >= r6) goto L_0x007e;
    L_0x003c:
        r7 = r5[r4];
        r8 = new com.google.android.finsky.cv.a.dl;
        r8.<init>();
        r0 = r7.c;
        if (r0 != 0) goto L_0x007a;
    L_0x0047:
        r0 = r2;
    L_0x0048:
        r8.m12431a(r0);
        r0 = r7.d;
        r8.m12436b(r0);
        r10 = r7.e;
        r8.m12432a(r10);
        r0 = r7.b;
        r0 = r0 & 8;
        if (r0 == 0) goto L_0x007c;
    L_0x005b:
        r0 = r2;
    L_0x005c:
        if (r0 == 0) goto L_0x0069;
    L_0x005e:
        r0 = r7.e();
        if (r0 == 0) goto L_0x0069;
    L_0x0064:
        r10 = r7.g;
        r8.m12437b(r10);
    L_0x0069:
        r0 = r7.j;
        r0 = com.google.android.finsky.aw.C1531a.m8955a(r0);
        r8.f12158g = r0;
        r1.add(r8);
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x003a;
    L_0x0078:
        r0 = r3;
        goto L_0x001e;
    L_0x007a:
        r0 = 2;
        goto L_0x0048;
    L_0x007c:
        r0 = r3;
        goto L_0x005c;
    L_0x007e:
        r5 = r13.r;
        r6 = r5.length;
        r4 = r3;
    L_0x0082:
        if (r4 >= r6) goto L_0x00d2;
    L_0x0084:
        r7 = r5[r4];
        r8 = new com.google.android.finsky.cv.a.dl;
        r8.<init>();
        r8.m12431a(r3);
        r8.m12436b(r15);
        r10 = r7.d;
        r8.m12432a(r10);
        r0 = r7.c;
        if (r0 != 0) goto L_0x00a0;
    L_0x009a:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x00a0:
        r9 = r8.f12153b;
        r9 = r9 | 16;
        r8.f12153b = r9;
        r8.f12159h = r0;
        r0 = r7.b;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x00ce;
    L_0x00ae:
        r0 = r2;
    L_0x00af:
        if (r0 == 0) goto L_0x00bf;
    L_0x00b1:
        r0 = r7.b;
        r0 = r0 & 64;
        if (r0 == 0) goto L_0x00d0;
    L_0x00b7:
        r0 = r2;
    L_0x00b8:
        if (r0 == 0) goto L_0x00bf;
    L_0x00ba:
        r10 = r7.e;
        r8.m12437b(r10);
    L_0x00bf:
        r0 = r7.j;
        r0 = com.google.android.finsky.aw.C1531a.m8955a(r0);
        r8.f12158g = r0;
        r1.add(r8);
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x0082;
    L_0x00ce:
        r0 = r3;
        goto L_0x00af;
    L_0x00d0:
        r0 = r3;
        goto L_0x00b8;
    L_0x00d2:
        r6 = new com.google.android.finsky.cv.a.n;
        r6.<init>();
        r0 = r1.size();
        r0 = new com.google.android.finsky.cv.p177a.dl[r0];
        r0 = r1.toArray(r0);
        r0 = (com.google.android.finsky.cv.p177a.dl[]) r0;
        r6.f13174n = r0;
        r4 = 0;
        r0 = r1;
        r0 = (java.util.ArrayList) r0;
        r7 = r0.size();
    L_0x00ee:
        if (r3 >= r7) goto L_0x00fc;
    L_0x00f0:
        r1 = r0.get(r3);
        r3 = r3 + 1;
        r1 = (com.google.android.finsky.cv.p177a.dl) r1;
        r8 = r1.f12156e;
        r4 = r4 + r8;
        goto L_0x00ee;
    L_0x00fc:
        r0 = r6.f13161a;
        r0 = r0 | 16;
        r6.f13161a = r0;
        r6.f13166f = r4;
        r6.m13100a(r14);
        r0 = r6.f13161a;
        r0 = r0 | 2;
        r6.f13161a = r0;
        r6.f13163c = r15;
        r0 = new com.google.android.finsky.cv.a.co;
        r0.<init>();
        r0.f12048a = r6;
        r1 = new com.google.android.finsky.cv.a.cv;
        r1.<init>();
        r1.m12387a(r14);
        r1.m12392b(r14);
        r3 = 3;
        r1.m12391b(r3);
        r1.m12386a(r2);
        r1.f12112s = r0;
        r0 = new com.google.android.finsky.dfemodel.Document;
        r0.<init>(r1);
        r0 = r12.m8961b(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.aw.a.a(com.google.wireless.android.finsky.b.a, java.lang.String, int):long");
    }

    public final String m8958a(Context context, Document document) {
        return C1531a.m8956a(context, m8962c(document));
    }

    public static String m8956a(Context context, long j) {
        if (j == -1) {
            return null;
        }
        if (j > 0) {
            return Formatter.formatShortFileSize(context, j);
        }
        FinskyLog.m21665c("Found negative or zero app size", new Object[0]);
        return null;
    }

    public final long m8962c(Document document) {
        C2441n N = document.m14625N();
        if (N == null) {
            return 0;
        }
        C2441n c2441n;
        C2322b a = ((C2320a) this.f8263a.mo1a()).mo2854a(N.f13171k);
        int i = a != null ? a.f11419d : -1;
        C2129c a2 = ((C2127b) this.f8264b.mo1a()).mo2657a(N.f13171k);
        if (a2 != null) {
            c2441n = a2.f10832z;
        } else {
            c2441n = null;
        }
        long j = 0;
        Set hashSet = new HashSet();
        if (!(a == null || a.f11430o == null)) {
            hashSet.addAll(Arrays.asList(a.f11430o));
        }
        dl[] dlVarArr = N.f13174n;
        int length = dlVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj;
            long j2;
            gs gsVar;
            dl a3;
            dl dlVar = dlVarArr[i2];
            if (i >= dlVar.f12155d) {
                obj = (!((C1461c) this.f8265c.mo1a()).dj().mo2294a(12642050) || TextUtils.isEmpty(dlVar.f12159h) || hashSet.contains(dlVar.f12159h)) ? null : 1;
                if (obj == null) {
                    obj = null;
                    if (obj == null) {
                        j2 = dlVar.f12156e;
                        if (((dlVar.f12153b & 8) == 0 ? 1 : null) != null && dlVar.f12157f > 0) {
                            j2 = dlVar.f12157f;
                        }
                        if (a != null && (!a.f11422g || a.f11423h)) {
                            gsVar = dlVar.f12158g;
                            if (gsVar == null && c2441n != null) {
                                a3 = C1531a.m8954a(c2441n.f13174n, dlVar.f12154c, dlVar.f12159h);
                                if (a3 != null && a3.f12155d == dlVar.f12155d) {
                                    gsVar = a3.f12158g;
                                }
                            }
                            if (gsVar != null && gsVar.f12495b <= i) {
                                j2 = gsVar.f12496c;
                            }
                        }
                        j2 += j;
                    } else {
                        j2 = j;
                    }
                    i2++;
                    j = j2;
                }
            }
            obj = 1;
            if (obj == null) {
                j2 = j;
            } else {
                j2 = dlVar.f12156e;
                if ((dlVar.f12153b & 8) == 0) {
                }
                j2 = dlVar.f12157f;
                gsVar = dlVar.f12158g;
                a3 = C1531a.m8954a(c2441n.f13174n, dlVar.f12154c, dlVar.f12159h);
                gsVar = a3.f12158g;
                j2 = gsVar.f12496c;
                j2 += j;
            }
            i2++;
            j = j2;
        }
        return j;
    }

    private static dl m8954a(dl[] dlVarArr, int i, String str) {
        for (dl dlVar : dlVarArr) {
            if (dlVar.f12154c == i && TextUtils.equals(dlVar.f12159h, str)) {
                return dlVar;
            }
        }
        return null;
    }

    private static gs m8955a(d dVar) {
        if (dVar == null) {
            return null;
        }
        gs gsVar = new gs();
        int i = dVar.b;
        gsVar.f12494a |= 1;
        gsVar.f12495b = i;
        long j = dVar.g;
        gsVar.f12494a |= 2;
        gsVar.f12496c = j;
        return gsVar;
    }
}
