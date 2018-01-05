package com.google.android.finsky.contentfilterui;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.ab.C0969a;
import com.google.android.finsky.ab.C0970b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.volley.C4774e;
import com.google.wireless.android.finsky.dfe.nano.ContentFilters.ContentFilterSettingsResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C2350n {
    public static final C0970b[] f11535a = new C0970b[0];
    public final ContentFilterSettingsResponse f11536b;
    public final Bundle f11537c = new Bundle();
    public final String f11538d;
    public List f11539e;
    public boolean f11540f;
    public boolean f11541g;
    public boolean f11542h;
    public C0988c f11543i;
    public C1287h f11544j;
    public C4774e f11545k;

    public C2350n(ContentFilterSettingsResponse contentFilterSettingsResponse, String str, C0988c c0988c, C1287h c1287h, C4774e c4774e) {
        this.f11536b = contentFilterSettingsResponse;
        this.f11538d = str;
        this.f11543i = c0988c;
        this.f11544j = c1287h;
        this.f11545k = c4774e;
        this.f11539e = C0969a.m5792a(contentFilterSettingsResponse);
        if (contentFilterSettingsResponse.o) {
            this.f11540f = true;
            return;
        }
        List arrayList = new ArrayList(Arrays.asList(C0969a.m5797a(m11966d())));
        if (arrayList.size() == this.f11539e.size()) {
            this.f11539e = arrayList;
        }
    }

    public final boolean m11963a() {
        return this.f11540f || !(m11965c() || TextUtils.isEmpty((String) C0954a.f5839i.m5760a()));
    }

    final boolean m11964b() {
        return this.f11541g || m11965c();
    }

    final boolean m11965c() {
        return this.f11538d != null;
    }

    final C0957n m11966d() {
        if (m11965c()) {
            return C0954a.f5835e.m5777b(this.f11538d);
        }
        return C0954a.f5837g;
    }

    static com.google.wireless.android.finsky.b.g[] m11962a(java.lang.Iterable r10) {
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
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r10.iterator();
    L_0x0009:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0050;
    L_0x000f:
        r0 = r3.next();
        r0 = (com.google.android.finsky.ab.C0970b) r0;
        r1 = r0.f5940c;
        r4 = -1;
        if (r1 == r4) goto L_0x0009;
    L_0x001a:
        r4 = r0.f5938a;
        r5 = r4.length;
        r1 = 0;
    L_0x001e:
        if (r1 >= r5) goto L_0x0009;
    L_0x0020:
        r6 = r4[r1];
        r7 = new com.google.wireless.android.finsky.b.g;
        r7.<init>();
        r7.c = r6;
        r6 = r7.b;
        r6 = r6 | 1;
        r7.b = r6;
        r6 = new com.google.wireless.android.finsky.b.h;
        r6.<init>();
        r8 = r0.f5940c;
        r9 = r6.a;
        r9 = r9 | 2;
        r6.a = r9;
        r6.c = r8;
        r8 = r0.f5939b;
        r9 = r6.a;
        r9 = r9 | 1;
        r6.a = r9;
        r6.b = r8;
        r7.d = r6;
        r2.add(r7);
        r1 = r1 + 1;
        goto L_0x001e;
    L_0x0050:
        r0 = r2.size();
        r0 = new com.google.wireless.android.finsky.b.g[r0];
        r0 = r2.toArray(r0);
        r0 = (com.google.wireless.android.finsky.b.g[]) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.contentfilterui.n.a(java.lang.Iterable):com.google.wireless.android.finsky.b.g[]");
    }
}
