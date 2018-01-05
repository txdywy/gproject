package com.google.android.finsky.scheduler;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bg;
import com.google.wireless.android.a.a.a.a.bh;
import com.google.wireless.android.a.a.a.a.bi;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class bc {
    public final bg f20264a = new bg();
    public final bn f20265b;
    public final C1461c f20266c;
    public final C4047y f20267d;
    public final int f20268e;
    public bi f20269f;
    public bh f20270g;

    bc(C1461c c1461c, C4047y c4047y, bn bnVar, int i) {
        this.f20266c = c1461c;
        this.f20267d = c4047y;
        this.f20265b = bnVar;
        this.f20268e = i;
    }

    public final bc m18893a(int i, int i2) {
        bg bgVar = this.f20264a;
        bgVar.a |= 1;
        bgVar.d = i;
        bgVar = this.f20264a;
        bgVar.a |= 2;
        bgVar.e = i2;
        return this;
    }

    public final bc m18894a(int i, long j, int i2, int i3, int i4) {
        this.f20269f = new bi();
        bi biVar = this.f20269f;
        biVar.c = i;
        biVar.b |= 1;
        biVar = this.f20269f;
        biVar.b |= 2;
        biVar.d = j;
        biVar = this.f20269f;
        biVar.b |= 4;
        biVar.e = i2;
        biVar = this.f20269f;
        biVar.b |= 8;
        biVar.f = i3;
        biVar = this.f20269f;
        biVar.b |= 16;
        biVar.g = i4;
        return this;
    }

    public final bc m18895a(C4026d c4026d) {
        bg bgVar = this.f20264a;
        int i = c4026d.f20249a.f20174b;
        bgVar.a |= 128;
        bgVar.k = i;
        bgVar = this.f20264a;
        i = c4026d.f20249a.f20176d;
        bgVar.a |= 512;
        bgVar.m = i;
        if (!TextUtils.isEmpty(c4026d.f20249a.f20175c)) {
            bgVar = this.f20264a;
            String str = c4026d.f20249a.f20175c;
            if (str == null) {
                throw new NullPointerException();
            }
            bgVar.a |= 256;
            bgVar.l = str;
        }
        bgVar = this.f20264a;
        long j = c4026d.f20249a.f20178f;
        bgVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        bgVar.n = j;
        return this;
    }

    public final com.google.android.finsky.scheduler.bc m18896a(com.google.android.finsky.scheduler.p238b.C4026d r6, com.google.android.finsky.scheduler.p238b.C4028f r7, long r8) {
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
        r5 = this;
        r0 = 0;
        r2 = r6.m18857b();
        r3 = r2.length;
        r1 = r0;
    L_0x0007:
        if (r1 >= r3) goto L_0x0016;
    L_0x0009:
        r4 = r2[r1];
        r4 = r4.f20251a;
        r4 = r4.f20187d;
        if (r4 == 0) goto L_0x0013;
    L_0x0011:
        r0 = r0 + 1;
    L_0x0013:
        r1 = r1 + 1;
        goto L_0x0007;
    L_0x0016:
        r1 = r7.f20251a;
        r1 = r1.f20187d;
        if (r1 == 0) goto L_0x001e;
    L_0x001c:
        r0 = r0 + 1;
    L_0x001e:
        r1 = r5.f20264a;
        r2 = r1.a;
        r2 = r2 | 2048;
        r1.a = r2;
        r1.o = r0;
        r0 = r5.f20264a;
        r1 = r6.m18858c();
        r1 = r1 + 1;
        r2 = r0.a;
        r2 = r2 | 4096;
        r0.a = r2;
        r0.p = r1;
        r0 = r5.f20264a;
        r2 = com.google.android.finsky.utils.C4678i.m21813b();
        r2 = r2 - r8;
        r1 = r0.a;
        r1 = r1 | 8192;
        r0.a = r1;
        r0.q = r2;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.scheduler.bc.a(com.google.android.finsky.scheduler.b.d, com.google.android.finsky.scheduler.b.f, long):com.google.android.finsky.scheduler.bc");
    }

    public final bc m18897a(C4033g c4033g) {
        boolean z = true;
        bg bgVar = this.f20264a;
        boolean z2 = c4033g.f20294c;
        bgVar.a |= 8;
        bgVar.g = z2;
        bgVar = this.f20264a;
        z2 = c4033g.f20295d;
        bgVar.a |= 4;
        bgVar.f = z2;
        bg bgVar2 = this.f20264a;
        boolean z3 = (c4033g.f20293b & 2) != 0;
        bgVar2.a |= 16;
        bgVar2.h = z3;
        bgVar2 = this.f20264a;
        if ((c4033g.f20293b & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        bgVar2.a |= 32;
        bgVar2.i = z3;
        bgVar = this.f20264a;
        if ((c4033g.f20293b & 4) == 0) {
            z = false;
        }
        bgVar.a |= 64;
        bgVar.j = z;
        return this;
    }

    public final void m18898a(C2495w c2495w) {
        C2474c c2474c = new C2474c(this.f20268e);
        c2474c.m13210a(1);
        m18899a(c2495w, c2474c);
    }

    public final void m18900b(C2495w c2495w) {
        C2474c c2474c = new C2474c(this.f20268e);
        c2474c.m13222a(this.f20264a);
        m18899a(c2495w, c2474c);
    }

    final void m18899a(C2495w c2495w, C2474c c2474c) {
        if (m18892a(12633233)) {
            switch (this.f20268e) {
                case 2520:
                case 2521:
                case 2522:
                case 2523:
                case 2524:
                case 2525:
                case 2526:
                case 2527:
                case 2539:
                    if (m18892a(12637303)) {
                        c2495w.m13367a(c2474c);
                        return;
                    }
                    return;
                case 2528:
                case 2529:
                case 2530:
                case 2531:
                case 2532:
                case 2533:
                case 2534:
                case 2535:
                case 2536:
                case 2537:
                case 2538:
                case 2540:
                case 2543:
                case 2544:
                case 2545:
                case 2546:
                    boolean z;
                    Long l;
                    switch (this.f20268e) {
                        case 2528:
                        case 2529:
                        case 2546:
                            if (m18892a(12641780)) {
                                z = true;
                            } else {
                                l = (Long) this.f20267d.f20344b.get(Long.valueOf(aa.m18791a(this.f20264a.m, this.f20264a.k)));
                                if (l == null) {
                                    z = false;
                                } else {
                                    z = m18892a(l.longValue());
                                }
                            }
                            if (z) {
                                c2495w.m13367a(c2474c);
                                return;
                            }
                            FinskyLog.m21662b("Job Log dropped for job id: %d, consumer: %d", Integer.valueOf(this.f20264a.k), Integer.valueOf(this.f20264a.m));
                            return;
                        default:
                            if (m18892a(12641780)) {
                                z = true;
                            } else {
                                l = (Long) this.f20267d.f20343a.get(Long.valueOf(aa.m18791a(this.f20264a.m, this.f20264a.k)));
                                if (l == null) {
                                    z = false;
                                } else {
                                    z = m18892a(l.longValue());
                                }
                            }
                            if (z) {
                                c2495w.m13367a(c2474c);
                                return;
                            }
                            FinskyLog.m21662b("Job Log dropped for job id: %d, consumer: %d", Integer.valueOf(this.f20264a.k), Integer.valueOf(this.f20264a.m));
                            return;
                    }
                case 2541:
                    if (!m18892a(12637328) && !m18892a(12641780)) {
                        return;
                    }
                    if (m18891a()) {
                        this.f20265b.f20289b.mo1519a(new C1215q()).mo4398a(new be(this, c2495w, c2474c));
                        return;
                    } else {
                        this.f20265b.f20289b.mo1524b(this.f20269f).mo4398a(bd.f20271a);
                        return;
                    }
                case 2542:
                    if (!m18892a(12637328) && !m18892a(12641780)) {
                        return;
                    }
                    if (m18891a()) {
                        C0954a.bm.m5763a(Long.valueOf(C4678i.m21813b()));
                        this.f20265b.f20290c.mo1519a(new C1215q()).mo4398a(new bg(this, c2495w, c2474c));
                        return;
                    }
                    this.f20265b.f20290c.mo1524b(this.f20270g).mo4398a(bf.f20275a);
                    return;
                default:
                    FinskyLog.m21669e("Unknown event type %d logged in scheduler", Integer.valueOf(this.f20268e));
                    c2495w.m13367a(c2474c);
                    return;
            }
        }
    }

    private static boolean m18891a() {
        Long l = (Long) C0954a.bm.m5760a();
        Long l2 = (Long) C0955b.ja.m28964b();
        if (l.longValue() == -1) {
            return true;
        }
        return l2.longValue() + l.longValue() < C4678i.m21813b();
    }

    private final boolean m18892a(long j) {
        return this.f20266c.dj().mo2294a(j);
    }
}
