package com.google.android.finsky.p111d;

import android.accounts.Account;
import android.content.Context;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.widget.eq;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1301y;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.p133c.C2243a;
import com.google.android.finsky.p230q.C3950c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.google.android.play.p179a.C2480c;
import com.google.android.play.p179a.C2481o;
import com.google.android.play.p179a.C6216a;
import com.google.android.play.p179a.C6217b;
import com.google.android.play.p179a.C6218d;
import com.google.android.play.p179a.C6219e;
import com.google.android.play.p179a.C6223h;
import com.google.android.play.p179a.C6228m;
import com.google.android.play.p179a.C6229n;
import com.google.android.play.p179a.C6230p;
import com.google.android.play.p179a.C6231q;
import com.google.android.play.p179a.C6232r;
import com.google.android.play.p179a.p352a.C6201l;
import com.google.android.play.p179a.p352a.ao;
import com.google.android.volley.DisplayMessageError;
import com.google.c.a.a.a.a.a;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.aa;
import com.google.wireless.android.a.a.a.a.az;
import com.google.wireless.android.a.a.a.a.bp;
import com.google.wireless.android.a.a.a.a.br;
import com.google.wireless.android.a.a.a.a.bt;
import com.google.wireless.android.a.a.a.a.bu;
import com.google.wireless.android.a.a.a.a.by;
import com.google.wireless.android.a.a.a.a.bz;
import com.google.wireless.android.a.a.a.a.cb;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.a.a.a.a.ck;
import com.google.wireless.android.a.a.a.a.cn;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C2482j implements C2480c, C2481o {
    public static C2485m f13367D;
    public static final int[] f13368a = new int[]{102, 104, 100, 101, 112, 109, 108, 127, 111, 110, 106, 105, 113, 201, 202, 114};
    public static final int[] f13369b = new int[]{1700, 1701, 19};
    public static final int[] f13370c = new int[]{538};
    public static final int[] f13371d = new int[]{1112, 1111, 1102, 6};
    public static boolean f13372i = false;
    public static long f13373j;
    public static Boolean f13374k;
    public static final String[] f13375l = new String[]{"", "1", "", "3", "4", "5", "6", "7", "8"};
    public static boolean f13376m;
    public String[] f13377A;
    public final String f13378B;
    public final int[] f13379C = new int[9];
    public boolean f13380E = false;
    public boolean f13381F = false;
    public boolean f13382G = false;
    public List f13383H = new ArrayList();
    public final C6217b f13384e;
    public final C2478h f13385f;
    public final C6232r f13386g;
    public final C2477f f13387h;
    public ab f13388n;
    public C2243a f13389o;
    public C1500a f13390p;
    public C1461c f13391q;
    public C2493u f13392r;
    public C2489q f13393s;
    public final C1552e f13394t;
    public final boolean f13395u;
    public final aa f13396v;
    public final Object f13397w = new Object();
    public boolean f13398x = true;
    public boolean f13399y;
    public final boolean f13400z;

    public final void mo2915a() {
        m13304b(true);
    }

    public final void mo2917b() {
        m13319a(new C2474c(527).f13342a, null);
    }

    public final void mo2916a(Exception exception) {
        FinskyLog.m21667d("Caught and ignored: %s", exception);
        try {
            if (this.f13394t.mo2294a(12619746)) {
                Writer stringWriter = new StringWriter();
                a.a(exception, new PrintWriter(stringWriter));
                StringBuffer buffer = stringWriter.getBuffer();
                m13319a(new C2474c(13).m13253f(buffer.substring(0, Math.min(buffer.length(), ((Integer) C0955b.gF.m28964b()).intValue()))).m13238a((Throwable) exception).f13342a, null);
            }
        } catch (Exception e) {
            FinskyLog.m21667d("Error logging an event to track exception: %s", e);
        }
    }

    public C2482j(Context context, Account account, boolean z, boolean z2) {
        ((C1372b) C3947d.m18649a(C1372b.class)).mo1793a(this);
        C6217b c6217b = null;
        this.f13378B = account != null ? account.name : null;
        this.f13394t = this.f13391q.mo2249j(this.f13378B);
        this.f13396v = aa.m13186a();
        this.f13400z = z2;
        if (((Boolean) C0955b.f5865I.m28964b()).booleanValue() && (account != null || z)) {
            String str;
            ab abVar = this.f13388n;
            if (account == null) {
                str = null;
            } else {
                str = account.name;
            }
            C1552e j = abVar.f13317a.mo2249j(str);
            boolean a = j.mo2294a(12627477);
            boolean a2 = j.mo2294a(12635440);
            C6228m c6228m = new C6228m();
            c6228m.f31166b = ((Long) C0955b.f5868L.m28964b()).longValue();
            c6228m.f31167c = ((Long) C0955b.f5869M.m28964b()).longValue();
            c6228m.f31169e = ((Long) C0955b.f5870N.m28964b()).longValue();
            c6228m.f31170f = ((Long) C0955b.f5871O.m28964b()).longValue();
            c6228m.f31171g = (String) C0955b.f5873Q.m28964b();
            c6228m.f31172h = (String) C0955b.f5874R.m28964b();
            c6228m.f31173i = ((Integer) C0955b.f5876T.m28964b()).intValue();
            c6228m.f31181q = ((Boolean) C0955b.f5877U.m28964b()).booleanValue();
            c6228m.f31177m = true;
            if (z2) {
                c6228m.f31165a = "safe_mode_logs";
            }
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            C6229n c6229n = C6229n.MARKET;
            if (j.mo2294a(12608094) && abVar.f13318b.m8819a(account)) {
                c6229n = C6229n.WORK_STORE_APP;
            }
            boolean a3 = j.mo2294a(12611536);
            c6228m.f31174j = j.mo2294a(12619556);
            c6228m.f31175k = j.mo2294a(12619566);
            c6228m.f31176l = j.mo2294a(12619745);
            c6228m.f31182r = j.mo2294a(12643045);
            if (a) {
                c6228m.f31183s = ((Long) C0955b.f5872P.m28964b()).longValue();
            }
            c6228m.f31178n = j.mo2294a(12627543);
            c6228m.f31180p = a2;
            c6228m.f31179o = j.mo2294a(12635439);
            c6217b = new C6223h(context, C3950c.m18651a(account, j, 12604382), c6229n, C1301y.m7759b(context), ((Long) C0955b.m5748a().m28964b()).longValue(), Integer.toString(abVar.f13319c), simOperator, c6228m, account, a3);
            c6217b.f31124R = true;
            c6217b.m28721a((C2481o) this);
            if (a || a2) {
                c6217b.f31131Y = abVar.f13320d;
            }
            if (abVar.f13321e.f8183g) {
                C2968a a4 = C2968a.m15380a(context);
                if (a4.m15383b()) {
                    c6217b.f31129W = C6230p.ANDROID;
                } else if (a4.m15384c()) {
                    c6217b.f31129W = C6230p.IOS;
                }
            }
            c6217b.mo5352a((C2480c) this);
        }
        this.f13384e = c6217b;
        this.f13385f = C2478h.m13270a();
        this.f13386g = C6232r.m28732a();
        this.f13387h = C2477f.m13268a(context);
        if (this.f13394t.mo2294a(12603408)) {
            this.f13380E = true;
        }
        if (this.f13394t.mo2294a(12602374)) {
            this.f13381F = true;
            this.f13382G = true;
        } else if (this.f13394t.mo2294a(12604366)) {
            this.f13382G = true;
        }
        boolean z3 = this.f13394t.mo2294a(12635426) || this.f13394t.mo2294a(12635480);
        this.f13395u = z3;
    }

    public final boolean m13331a(boolean z, boolean z2) {
        if (!z || this.f13380E) {
            return z2 ? this.f13381F : this.f13382G;
        } else {
            return false;
        }
    }

    public static boolean m13307c() {
        if (f13374k == null) {
            f13374k = (Boolean) C0954a.aj.m5760a();
        }
        return f13374k.booleanValue();
    }

    final long m13317a(int r12, com.google.wireless.android.a.a.a.a.by r13, com.google.android.play.p179a.p352a.ao r14) {
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
        r11 = this;
        r1 = 0;
        r2 = 1;
        r7 = 0;
        r0 = r11.f13378B;
        if (r0 == 0) goto L_0x0017;
    L_0x0007:
        r0 = r11.f13379C;
        r3 = r0[r12];
        r3 = r3 + 1;
        r0[r12] = r3;
        r0 = r13.a;
        r0 = r0 | 1;
        r13.a = r0;
        r13.b = r3;
    L_0x0017:
        r0 = com.google.android.finsky.aa.C0954a.f5836f;
        r3 = r11.f13378B;
        r0 = r0.m5777b(r3);
        r0 = r0.m5760a();
        r0 = (java.lang.String) r0;
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 != 0) goto L_0x003f;
    L_0x002b:
        r0 = android.util.Base64.decode(r0, r7);
        if (r0 != 0) goto L_0x0037;
    L_0x0031:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0037:
        r3 = r13.a;
        r3 = r3 | 16;
        r13.a = r3;
        r13.g = r0;
    L_0x003f:
        r0 = r11.f13387h;
        r8 = r0.m13269a();
        r0 = r13.a;
        r0 = r0 | 2;
        r13.a = r0;
        r13.c = r8;
        r0 = r11.f13395u;
        if (r0 == 0) goto L_0x005e;
    L_0x0051:
        r0 = r11.f13393s;
        r3 = r0.f13414a;
        r4 = java.lang.Long.valueOf(r8);
        r3.set(r4);
        r0.f13415b = r8;
    L_0x005e:
        if (r14 == 0) goto L_0x00a2;
    L_0x0060:
        r6 = r14;
    L_0x0061:
        r0 = r11.f13394t;
        r4 = 12639027; // 0xc0db33 float:1.7711049E-38 double:6.244509E-317;
        r0 = r0.mo2294a(r4);
        if (r0 == 0) goto L_0x012e;
    L_0x006c:
        r0 = r13.j;
        if (r0 == 0) goto L_0x01b8;
    L_0x0070:
        r0 = r13.j;
        r0 = r0.m29001d();
        if (r0 == 0) goto L_0x01b8;
    L_0x0078:
        r3 = f13371d;
        r4 = r3.length;
        r0 = r7;
    L_0x007c:
        if (r0 >= r4) goto L_0x01b8;
    L_0x007e:
        r5 = r3[r0];
        r10 = r13.j;
        r10 = r10.f31702b;
        if (r5 != r10) goto L_0x00ab;
    L_0x0086:
        r0 = r7;
    L_0x0087:
        if (r0 == 0) goto L_0x00d0;
    L_0x0089:
        r0 = r11.f13389o;
        if (r0 != 0) goto L_0x00ae;
    L_0x008d:
        r0 = r1;
    L_0x008e:
        r3 = r11.f13389o;
        if (r3 != 0) goto L_0x00b5;
    L_0x0092:
        r3 = android.text.TextUtils.isEmpty(r0);
        if (r3 != 0) goto L_0x00d0;
    L_0x0098:
        if (r1 == 0) goto L_0x00d0;
    L_0x009a:
        if (r0 != 0) goto L_0x00bc;
    L_0x009c:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x00a2:
        r0 = com.google.android.play.p179a.C6232r.m28732a();
        r6 = r0.m28734b();
        goto L_0x0061;
    L_0x00ab:
        r0 = r0 + 1;
        goto L_0x007c;
    L_0x00ae:
        r0 = r11.f13389o;
        r0 = r0.mo2828a();
        goto L_0x008e;
    L_0x00b5:
        r1 = r11.f13389o;
        r1 = r1.mo2830b();
        goto L_0x0092;
    L_0x00bc:
        r3 = r6.f30838a;
        r3 = r3 | 8;
        r6.f30838a = r3;
        r6.f30843f = r0;
        r0 = r1.booleanValue();
        r1 = r6.f30838a;
        r1 = r1 | 16;
        r6.f30838a = r1;
        r6.f30844g = r0;
    L_0x00d0:
        r0 = r11.m13316n();
        if (r0 != 0) goto L_0x00de;
    L_0x00d6:
        r0 = r11.f13396v;
        r0 = r0.m13188b();
        if (r0 != 0) goto L_0x00ee;
    L_0x00de:
        r0 = r11.f13396v;
        r0 = r0.m13189c();
        r13.f = r0;
        r11.m13304b(r7);
        r0 = r11.f13396v;
        r0.m13187a(r2);
    L_0x00ee:
        r0 = r11.f13394t;
        r4 = 12626588; // 0xc0aa9c float:1.7693618E-38 double:6.2383634E-317;
        r0 = r0.mo2294a(r4);
        if (r0 == 0) goto L_0x0104;
    L_0x00f9:
        r0 = r11.f13394t;
        r4 = 12639415; // 0xc0dcb7 float:1.7711593E-38 double:6.2447007E-317;
        r0 = r0.mo2294a(r4);
        if (r0 == 0) goto L_0x016f;
    L_0x0104:
        r0 = r13.j;
        if (r0 == 0) goto L_0x016f;
    L_0x0108:
        r0 = r13.j;
        r0 = r0.m29001d();
        if (r0 == 0) goto L_0x016f;
    L_0x0110:
        r1 = f13369b;
        r3 = r1.length;
        r0 = r7;
    L_0x0114:
        if (r0 >= r3) goto L_0x016f;
    L_0x0116:
        r4 = r1[r0];
        r5 = r13.j;
        r5 = r5.f31702b;
        if (r4 != r5) goto L_0x016c;
    L_0x011e:
        r0 = r11.f13383H;
        r1 = new com.google.android.finsky.d.l;
        r2 = java.lang.System.currentTimeMillis();
        r1.<init>(r13, r2);
        r0.add(r1);
        r0 = r8;
    L_0x012d:
        return r0;
    L_0x012e:
        r0 = r13.j;
        if (r0 == 0) goto L_0x00d0;
    L_0x0132:
        r0 = r13.j;
        r0 = r0.m29001d();
        if (r0 == 0) goto L_0x00d0;
    L_0x013a:
        r4 = f13370c;
        r5 = r4.length;
        r3 = r7;
    L_0x013e:
        if (r3 >= r5) goto L_0x00d0;
    L_0x0140:
        r0 = r4[r3];
        r10 = r13.j;
        r10 = r10.f31702b;
        if (r0 != r10) goto L_0x0168;
    L_0x0148:
        r0 = r11.f13389o;
        if (r0 != 0) goto L_0x0157;
    L_0x014c:
        r0 = r1;
    L_0x014d:
        if (r0 == 0) goto L_0x0168;
    L_0x014f:
        if (r0 != 0) goto L_0x015e;
    L_0x0151:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0157:
        r0 = r11.f13389o;
        r0 = r0.mo2828a();
        goto L_0x014d;
    L_0x015e:
        r1 = r13.a;
        r1 = r1 | 8;
        r13.a = r1;
        r13.e = r0;
        goto L_0x00d0;
    L_0x0168:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x013e;
    L_0x016c:
        r0 = r0 + 1;
        goto L_0x0114;
    L_0x016f:
        r0 = r13.j;
        if (r0 == 0) goto L_0x01b1;
    L_0x0173:
        r0 = r13.j;
        r0 = r0.m29001d();
        if (r0 == 0) goto L_0x01b1;
    L_0x017b:
        r10 = r2;
    L_0x017c:
        if (r10 == 0) goto L_0x01b3;
    L_0x017e:
        r0 = r13.j;
        r0 = r0.f31702b;
    L_0x0182:
        r4 = -1;
        r1 = r11;
        r2 = r12;
        r3 = r13;
        r1.m13287a(r2, r3, r4, r6);
        r1 = r11.f13394t;
        r2 = 12605975; // 0xc05a17 float:1.7664733E-38 double:6.228179E-317;
        r1 = r1.mo2294a(r2);
        if (r1 == 0) goto L_0x01ae;
    L_0x0195:
        r1 = r11.f13390p;
        r1 = r1.m8818a();
        if (r1 == 0) goto L_0x01ae;
    L_0x019d:
        if (r10 == 0) goto L_0x01ae;
    L_0x019f:
        r2 = f13368a;
        r3 = r2.length;
        r1 = r7;
    L_0x01a3:
        if (r1 >= r3) goto L_0x01ae;
    L_0x01a5:
        r4 = r2[r1];
        if (r4 != r0) goto L_0x01b5;
    L_0x01a9:
        r0 = r11.f13384e;
        r0.mo5351a();
    L_0x01ae:
        r0 = r8;
        goto L_0x012d;
    L_0x01b1:
        r10 = r7;
        goto L_0x017c;
    L_0x01b3:
        r0 = -1;
        goto L_0x0182;
    L_0x01b5:
        r1 = r1 + 1;
        goto L_0x01a3;
    L_0x01b8:
        r0 = r2;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.d.j.a(int, com.google.wireless.android.a.a.a.a.by, com.google.android.play.a.a.ao):long");
    }

    private final void m13287a(int i, by byVar, long j, ao aoVar) {
        String str = f13375l[i];
        try {
            byte[] a = C0757i.m4909a((C0757i) byVar);
            C2482j.m13297a(a);
            if (this.f13384e != null) {
                C6201l b;
                C6201l f;
                C6219e c6219e;
                C6218d c6218d = (C6231q) this.f13386g.f31215f.m28735a();
                c6218d.f31209f = aoVar;
                c6218d.d = j == -1 ? null : Long.valueOf(j);
                C2493u c2493u = this.f13392r;
                String str2 = this.f13378B;
                C1552e j2 = c2493u.f13423b.mo2249j(str2);
                long[] b2 = j2.mo2295b();
                long[] c = j2.mo2296c();
                if (((Boolean) C0955b.is.m28964b()).booleanValue() || j2.mo2294a(12625902)) {
                    b = c2493u.f13422a.mo2876b();
                    f = c2493u.f13422a.mo2881f(str2);
                } else {
                    f = null;
                    b = null;
                }
                if (b2 == c2493u.f13424c && c == c2493u.f13425d && f == c2493u.f13427f && b == c2493u.f13426e) {
                    c6219e = c2493u.f13428g;
                } else {
                    c2493u.f13424c = b2;
                    c2493u.f13425d = c;
                    c2493u.f13427f = f;
                    c2493u.f13426e = b;
                    c2493u.f13428g = new C6219e(c2493u.f13424c, c2493u.f13425d, c2493u.f13426e, c2493u.f13427f);
                    c6219e = c2493u.f13428g;
                }
                c6218d.c = c6219e;
                c6218d.b = str;
                c6218d.a = a;
                c6218d.e = this.f13377A;
                this.f13384e.mo5353a(c6218d);
                C2478h c2478h = this.f13385f;
                if (byVar.h != null) {
                    bu buVar = byVar.h;
                    if (buVar.b != null) {
                        c2478h.m13271a(buVar.b);
                    }
                    for (ce a2 : buVar.c) {
                        c2478h.m13271a(a2);
                    }
                    buVar.d();
                    c2478h.f13355c.m13276a(buVar);
                }
                if (byVar.i != null) {
                    bp bpVar = byVar.i;
                    for (ce a22 : bpVar.a) {
                        c2478h.m13271a(a22);
                    }
                    bpVar.d();
                    c2478h.f13356d.m13276a(bpVar);
                }
                if (byVar.n != null) {
                    bt btVar = byVar.n;
                    for (ce a222 : btVar.a) {
                        c2478h.m13271a(a222);
                    }
                    btVar.d();
                    c2478h.f13357e.m13276a(btVar);
                }
                if (byVar.j != null) {
                    bo boVar = byVar.j;
                    if (boVar.f31721u != null) {
                        cn cnVar = boVar.f31721u;
                        cnVar.d();
                        c2478h.f13361i.m13276a(cnVar);
                    }
                    boVar.m29003f();
                    c2478h.f13358f.m13276a(boVar);
                }
                if (byVar.k != null) {
                    cb cbVar = byVar.k;
                    cbVar.d();
                    c2478h.f13359g.m13276a(cbVar);
                }
                byVar.d();
                c2478h.f13354b.m13276a(byVar);
                C6232r c6232r = this.f13386g;
                c6218d.mo5357a();
                c6232r.f31215f.m28736a(c6218d);
            }
        } catch (Exception e) {
            mo2916a(e);
        }
    }

    private final synchronized boolean m13316n() {
        return this.f13399y;
    }

    private final synchronized void m13304b(boolean z) {
        this.f13399y = z;
    }

    public final void m13329a(Runnable runnable) {
        if (this.f13384e != null) {
            this.f13384e.mo5355a(runnable);
        }
    }

    @Deprecated
    public final void m13333d() {
        if (!this.f13394t.mo2294a(12629021)) {
            m13329a(null);
        }
    }

    private static synchronized void m13297a(byte[] bArr) {
        synchronized (C2482j.class) {
            if (!(f13367D == null || bArr == null)) {
                f13367D.m13337a();
            }
        }
    }

    public static ce m13283a(int i) {
        ce d = C2478h.m13270a().m13274d();
        d.b(i);
        return d;
    }

    public static bo m13310e() {
        return (bo) C2478h.m13270a().f13358f.m13275a();
    }

    public static bp m13311f() {
        return C2478h.m13270a().m13273c();
    }

    public static bu m13312g() {
        return (bu) C2478h.m13270a().f13355c.m13275a();
    }

    public static cb m13313h() {
        return (cb) C2478h.m13270a().f13359g.m13275a();
    }

    public static cn m13314i() {
        return (cn) C2478h.m13270a().f13361i.m13275a();
    }

    public static ce m13285a(ce ceVar, byte[] bArr) {
        if (bArr != null) {
            ceVar.a(bArr);
        }
        return ceVar;
    }

    public final void m13325a(int i, byte[] bArr, ad adVar) {
        bp c = this.f13385f.m13273c();
        Object d = this.f13385f.m13274d();
        d.b(i);
        if (bArr != null) {
            d.a(bArr);
        }
        c.a = (ce[]) C2482j.m13300a(c.a, d);
        if (adVar != null) {
            ad adVar2;
            int i2;
            Object[] objArr = c.a;
            for (adVar2 = adVar; adVar2 != null; adVar2 = adVar2.getParentNode()) {
                ce playStoreUiElement = adVar2.getPlayStoreUiElement();
                if (playStoreUiElement == null) {
                    FinskyLog.m21665c("Unexpected null PlayStoreUiElement from node %s", adVar2);
                    break;
                }
                ce[] ceVarArr = (ce[]) C2482j.m13300a(objArr, C2482j.m13284a(playStoreUiElement));
            }
            c.a = objArr;
            ao aoVar = null;
            for (adVar2 = adVar; adVar2 != null; adVar2 = adVar2.getParentNode()) {
                d = adVar2;
            }
            if (aoVar != null && (aoVar instanceof ah)) {
                ah ahVar = (ah) aoVar;
                if (ahVar.mo1224n() != null) {
                    ahVar.mo1224n().m13372a(c, null);
                    i2 = 1;
                    if (i2 != 0) {
                        return;
                    }
                }
            }
            i2 = 0;
            if (i2 != 0) {
                return;
            }
        }
        m13321a(c, null, -1);
    }

    public static Object[] m13300a(Object[] objArr, Object obj) {
        if (obj == null) {
            FinskyLog.m21669e("Adding null to element array.", new Object[0]);
            return objArr;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(obj.getClass(), objArr.length + 1);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        objArr2[objArr2.length - 1] = obj;
        return objArr2;
    }

    public final long m13321a(bp bpVar, ao aoVar, long j) {
        int i = 0;
        if (C2482j.m13307c() && C2482j.m13307c()) {
            FinskyLog.m21659a("Sending click event:", new Object[0]);
            ce[] ceVarArr = bpVar.a;
            String str = "";
            int length = ceVarArr.length;
            while (i < length) {
                C2482j.m13292a(ceVarArr[i], str);
                str = String.valueOf(str).concat("  ");
                i++;
            }
        }
        by b = this.f13385f.m13272b();
        b.i = bpVar;
        if (j > 0) {
            b.a(j);
        }
        return m13317a(3, b, aoVar);
    }

    public final void m13326a(ad adVar) {
        m13323a(new C2488p().m13341a(0).m13345b(adVar).m13344a(), null, -1);
    }

    public static ce m13286a(List list) {
        Object obj = null;
        for (ce a : list) {
            ce a2 = C2482j.m13284a(a);
            if (obj != null) {
                a2.f = (ce[]) C2482j.m13300a(a2.f, obj);
            }
            ce ceVar = a2;
        }
        return obj;
    }

    public final long m13323a(bu buVar, ao aoVar, long j) {
        if (C2482j.m13307c()) {
            C2482j.m13294a("Sending", buVar.b);
        }
        if (C2482j.m13307c()) {
            C2482j.m13293a("Sending", buVar.d, buVar.b, null);
        }
        by b = this.f13385f.m13272b();
        b.h = buVar;
        if (j > 0) {
            b.a(j);
        }
        return m13317a(1, b, aoVar);
    }

    public static void m13291a(ad adVar, ad adVar2) {
        ce playStoreUiElement = adVar2.getPlayStoreUiElement();
        if (playStoreUiElement == null) {
            throw new IllegalArgumentException("childNode has null element");
        } else if (C2482j.m13298a(adVar, playStoreUiElement) && playStoreUiElement.f.length == 0) {
            if (C2482j.m13307c()) {
                FinskyLog.m21659a("Skip reporting existing leaf node type=%d", Integer.valueOf(playStoreUiElement.c));
            }
        } else if (adVar.getParentNode() != null) {
            adVar.getParentNode().mo1219a(adVar);
        }
    }

    public static boolean m13298a(ad adVar, ce ceVar) {
        boolean z;
        ce playStoreUiElement = adVar.getPlayStoreUiElement();
        for (ce d : playStoreUiElement.f) {
            if (C2482j.m13309d(ceVar, d)) {
                z = true;
                break;
            }
        }
        z = false;
        if (!z) {
            playStoreUiElement.f = (ce[]) C2482j.m13300a(playStoreUiElement.f, (Object) ceVar);
        }
        return z;
    }

    public static boolean m13299a(ce ceVar, ce ceVar2) {
        Object[] objArr = ceVar.f;
        for (int i = 0; i < objArr.length; i++) {
            if (C2482j.m13309d(objArr[i], ceVar2)) {
                ceVar.f = (ce[]) C4672c.m21805a(objArr, i);
                return true;
            }
        }
        return false;
    }

    public static void m13288a(Handler handler, long j, ad adVar, ad adVar2, C2495w c2495w) {
        if (adVar2 == null || adVar2.getPlayStoreUiElement() == null) {
            throw new IllegalArgumentException("null child node or element");
        }
        ce playStoreUiElement = adVar.getPlayStoreUiElement();
        if (adVar2 != null) {
            C2482j.m13298a(adVar, adVar2.getPlayStoreUiElement());
        }
        if (C2482j.m13307c()) {
            C2482j.m13294a("Collecting", playStoreUiElement);
        }
        if (C2482j.m13307c()) {
            C2482j.m13293a("Collecting", 0, playStoreUiElement, null);
        }
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new C2483k(c2495w, j, adVar), ((Long) C0955b.f5875S.m28964b()).longValue());
    }

    public static void m13302b(ad adVar) {
        for (ad adVar2 = adVar; adVar2 != null; adVar2 = adVar2.getParentNode()) {
            if (adVar2 instanceof ah) {
                ((ah) adVar2).mo1222m();
                return;
            }
        }
        FinskyLog.m21662b("No RootUiElementNode found in parent chain", new Object[0]);
    }

    public static void m13289a(Handler handler, long j, ah ahVar, C2495w c2495w) {
        ce playStoreUiElement = ahVar.getPlayStoreUiElement();
        if (C2482j.m13307c()) {
            C2482j.m13294a("Flushing", playStoreUiElement);
        }
        if (C2482j.m13307c()) {
            C2482j.m13293a("Flushing", 0, playStoreUiElement, null);
        }
        handler.removeCallbacksAndMessages(null);
        if (playStoreUiElement.f != null && playStoreUiElement.f.length != 0) {
            c2495w.m13373a(new C2488p().m13341a(j).m13342a((ad) ahVar).m13344a(), null);
        }
    }

    static void m13303b(ce ceVar, ce ceVar2) {
        C2482j.m13306c(ceVar, ceVar2);
        for (ce ceVar3 : ceVar.f) {
            Object a = C2482j.m13283a(0);
            C2482j.m13303b(ceVar3, a);
            ceVar2.f = (ce[]) C2482j.m13300a(ceVar2.f, a);
        }
        ceVar.f = ce.a;
    }

    public static ce m13284a(ce ceVar) {
        ce a = C2482j.m13283a(0);
        C2482j.m13306c(ceVar, a);
        return a;
    }

    private static void m13306c(ce ceVar, ce ceVar2) {
        ceVar2.b(ceVar.c);
        ceVar2.e = ceVar.e;
        ceVar2.a(ceVar.d);
    }

    private static boolean m13309d(ce ceVar, ce ceVar2) {
        if (ceVar == ceVar2) {
            return true;
        }
        if (ceVar == null || ceVar2 == null) {
            return false;
        }
        if (ceVar.c != ceVar2.c) {
            return false;
        }
        if (!Arrays.equals(ceVar.d, ceVar2.d)) {
            return false;
        }
        if (!f13376m) {
            return true;
        }
        boolean z;
        cf cfVar = ceVar.e;
        cf cfVar2 = ceVar2.e;
        if (cfVar != cfVar2) {
            if (cfVar == null || cfVar2 == null) {
                z = false;
                if (z) {
                    return true;
                }
                return false;
            }
            if (cfVar.b != cfVar2.b) {
                if (cfVar.b == null || cfVar2.b == null) {
                    z = false;
                    if (z) {
                        return true;
                    }
                    return false;
                }
                if (cfVar.b.b != cfVar2.b.b) {
                    z = false;
                } else if (cfVar.b.c != cfVar2.b.c) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                return true;
            }
            if (!TextUtils.equals(cfVar.e, cfVar2.e)) {
                z = false;
            } else if (cfVar.f != cfVar2.f) {
                z = false;
            } else if (cfVar.g != cfVar2.g) {
                z = false;
            } else {
                if (cfVar.h != cfVar2.h) {
                    if (cfVar.h == null || cfVar2.h == null) {
                        z = false;
                    } else if (cfVar.h.b != cfVar2.h.b) {
                        z = false;
                    } else if (cfVar.h.c != cfVar2.h.c) {
                        z = false;
                    }
                }
                if (cfVar.i != cfVar2.i) {
                    if (cfVar.i == null || cfVar2.i == null) {
                        z = false;
                    } else if (cfVar.i.b != cfVar2.i.b) {
                        z = false;
                    }
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        z = true;
        if (z) {
            return false;
        }
        return true;
    }

    public static void m13296a(boolean z) {
        f13376m = z;
    }

    public static void m13290a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            C2482j.m13301b(viewGroup);
        }
    }

    private static void m13301b(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                C2482j.m13301b((ViewGroup) childAt);
            }
        }
        if (viewGroup instanceof ad) {
            C2482j.m13308d((ad) viewGroup);
        } else if (viewGroup instanceof d) {
            ad adVar = (ad) ((d) viewGroup).getLoggingData();
            if (adVar != null) {
                C2482j.m13308d(adVar);
            }
        } else if (viewGroup.getTag() instanceof ad) {
            C2482j.m13308d((ad) viewGroup.getTag());
        }
    }

    private static void m13308d(ad adVar) {
        if (C2482j.m13307c()) {
            FinskyLog.m21665c("TRAVERSE: Found %s", adVar.getClass().getSimpleName());
        }
        ad parentNode = adVar.getParentNode();
        if (parentNode != null) {
            parentNode.mo1219a(adVar);
        }
    }

    public static long m13315j() {
        if (!f13372i) {
            f13373j = System.currentTimeMillis() ^ System.nanoTime();
            f13372i = true;
        }
        long j = f13373j + 1;
        f13373j = j;
        if (j == 0) {
            f13373j++;
        }
        return f13373j;
    }

    public static void m13305c(ad adVar) {
        ad adVar2 = adVar;
        for (ad parentNode = adVar.getParentNode(); parentNode != null; parentNode = parentNode.getParentNode()) {
            adVar2 = parentNode;
        }
        if (adVar2 instanceof ah) {
            ((ah) adVar2).o_();
        }
    }

    private static void m13294a(String str, ce ceVar) {
        if (C2482j.m13307c()) {
            int i = ceVar.c;
            int length = ceVar.f.length;
            int a = C2482j.m13281a(ceVar, new int[]{0});
            FinskyLog.m21659a("%s impression at root. Type=%d top children=%d total children=%d depth=%d", str, Integer.valueOf(i), Integer.valueOf(length), Integer.valueOf(r2[0]), Integer.valueOf(a));
        }
    }

    private static int m13281a(ce ceVar, int[] iArr) {
        ce[] ceVarArr = ceVar.f;
        int length = ceVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ce ceVar2 = ceVarArr[i];
            iArr[0] = iArr[0] + 1;
            int a = C2482j.m13281a(ceVar2, iArr) + 1;
            if (a <= i2) {
                a = i2;
            }
            i++;
            i2 = a;
        }
        return i2;
    }

    private static void m13293a(String str, long j, ce ceVar, String str2) {
        int i = 0;
        if (C2482j.m13307c()) {
            if (str != null) {
                FinskyLog.m21659a("%s impression tree, id=%x", str, Long.valueOf(j));
            }
            if (str2 == null) {
                str2 = "";
            }
            C2482j.m13292a(ceVar, str2);
            String concat = String.valueOf(str2).concat("  ");
            ce[] ceVarArr = ceVar.f;
            int length = ceVarArr.length;
            while (i < length) {
                C2482j.m13293a(null, 0, ceVarArr[i], concat);
                i++;
            }
        }
    }

    private static void m13292a(ce ceVar, String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append("type=").append(ceVar.c);
        C2482j.m13295a(stringBuilder, ceVar.d);
        FinskyLog.m21659a("%s", stringBuilder);
    }

    private static void m13295a(StringBuilder stringBuilder, byte[] bArr) {
        if (bArr != null) {
            stringBuilder.append(" s.cookie[").append(bArr.length).append("]={ ");
            stringBuilder.append(Base64.encodeToString(bArr, 10));
            stringBuilder.append(" }");
            return;
        }
        stringBuilder.append(" (no s-cookie)");
    }

    public final long m13318a(int i, boolean z) {
        return m13320a(new C2474c(i).m13239a(z).f13342a, null, -1);
    }

    @Deprecated
    public final void m13327a(bo boVar) {
        m13319a(boVar, null);
        m13333d();
    }

    public final long m13319a(bo boVar, ao aoVar) {
        return m13320a(boVar, aoVar, -1);
    }

    public final long m13320a(bo boVar, ao aoVar, long j) {
        if (this.f13400z) {
            boVar.f31701a |= 262144;
            boVar.f31684J = true;
        }
        if (C2482j.m13307c() && C2482j.m13307c()) {
            boolean z;
            StringBuffer append = new StringBuffer("type=").append(boVar.f31702b);
            if ((boVar.f31701a & 2) != 0) {
                append.append(", document=").append(boVar.f31703c);
            }
            if ((boVar.f31701a & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                append.append(", error_code=").append(boVar.f31705e);
            }
            if (boVar.m29002e()) {
                append.append(", reason=").append(boVar.f31704d);
            }
            if ((boVar.f31701a & 16) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                append.append(", exception_type=").append(boVar.f31706f);
            }
            if ((boVar.f31701a & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                append.append(", offer_type=").append(boVar.f31708h);
            }
            if ((boVar.f31701a & 512) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                append.append(", server_latency_ms=").append(boVar.f31713m);
            }
            if ((boVar.f31701a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                append.append(", client_latency_ms=").append(boVar.f31714n);
            }
            if (boVar.f31721u != null) {
                cn cnVar = boVar.f31721u;
                append.append(", query=").append(cnVar.b);
                if ((cnVar.a & 2) != 0) {
                    append.append(", suggested_query=").append(cnVar.c);
                }
                append.append(", client_latency_ms=").append(cnVar.d);
            }
            if (boVar.f31675A != null) {
                bz bzVar = boVar.f31675A;
                if (C2482j.m13307c()) {
                    if ((bzVar.a & 1) != 0) {
                        append.append(", url=").append(bzVar.b);
                    }
                    if ((bzVar.a & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", client_latency_ms=").append(bzVar.c);
                    }
                    if ((bzVar.a & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", server_latency_ms=").append(bzVar.d);
                    }
                    if ((bzVar.a & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", num_attempts=").append(bzVar.e);
                    }
                    if ((bzVar.a & 16) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", timeout_ms=").append(bzVar.f);
                    }
                    if ((bzVar.a & 32) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", backoff_multiplier=").append(bzVar.g);
                    }
                    if ((bzVar.a & 64) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", was_successful=").append(bzVar.h);
                    }
                    if ((bzVar.a & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", cur_connection_type=").append(bzVar.i);
                    }
                    if ((bzVar.a & 256) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", end_connection_type=").append(bzVar.j);
                    }
                    if ((bzVar.a & 512) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", response_body_size_bytes=").append(bzVar.k);
                    }
                    if ((bzVar.a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", volley_error_type=").append(bzVar.l);
                    }
                    FinskyLog.m21659a("%s", append);
                }
            }
            if (boVar.f31718r != null) {
                aa aaVar = boVar.f31718r;
                if (C2482j.m13307c()) {
                    if ((aaVar.a & 16) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_projection=").append(aaVar.f);
                    }
                    if ((aaVar.a & 32) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_power=").append(aaVar.g);
                    }
                    if ((aaVar.a & 64) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_wifi=").append(aaVar.h);
                    }
                    if ((aaVar.a & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", recheck_state=").append(aaVar.i);
                    }
                    if ((aaVar.a & 256) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_new_permission=").append(aaVar.j);
                    }
                    if ((aaVar.a & 512) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_large_download=").append(aaVar.k);
                    }
                    if ((aaVar.a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_disabled_by_user=").append(aaVar.l);
                    }
                    if ((aaVar.a & eq.FLAG_MOVED) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_global_disabled=").append(aaVar.m);
                    }
                    if ((aaVar.a & 16384) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", skipped_due_to_foreground=").append(aaVar.p);
                    }
                    if ((aaVar.a & 8192) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", num_packages_deferred=").append(aaVar.o);
                    }
                    if ((aaVar.a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", num_packages_installed=").append(aaVar.n);
                    }
                    if ((aaVar.a & 32768) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        append.append(", rescheduled=").append(aaVar.q);
                    }
                }
            }
            if ((boVar.f31701a & 262144) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                append.append(", safe_mode=").append(boVar.f31684J);
            }
            t tVar = boVar.f31712l;
            if (tVar != null) {
                if (tVar.d()) {
                    append.append(", version=").append(tVar.b);
                }
                if ((tVar.a & 2) != 0) {
                    append.append(", old_version=").append(tVar.c);
                }
                if ((tVar.a & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", system_app=").append(tVar.d);
                }
                if ((tVar.a & 256) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", downloaded_bytes=").append(tVar.j);
                }
                if ((tVar.a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", total_bytes=").append(tVar.n);
                }
                if ((tVar.a & 8192) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", download_status=").append(tVar.o);
                }
            }
            az azVar = boVar.f31685K;
            if (azVar != null) {
                if ((azVar.a & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", module_name=").append(azVar.b);
                }
                if ((azVar.a & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", module_version=").append(azVar.c);
                }
            }
            ck ckVar = boVar.aa;
            if (ckVar != null) {
                if ((ckVar.a & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", type=").append(ckVar.b);
                }
                if ((ckVar.a & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    append.append(", roOemKey1=").append(ckVar.d);
                }
                if (ckVar.c.length > 0) {
                    append.append(", packageNames=").append(Arrays.toString(boVar.aa.c));
                }
            }
            FinskyLog.m21659a("Sending background event %s", append);
        }
        by b = this.f13385f.m13272b();
        b.j = boVar;
        if (j > 0) {
            b.a(j);
        }
        return m13317a(4, b, aoVar);
    }

    public final long m13322a(br brVar, long j) {
        if (C2482j.m13307c() && C2482j.m13307c()) {
            StringBuilder stringBuilder = new StringBuilder("Sending deeplink event");
            stringBuilder.append(" type=").append(brVar.c);
            stringBuilder.append(" package_name=").append(brVar.d);
            stringBuilder.append(" external_referrer=").append(brVar.i);
            stringBuilder.append(" external_url=").append(brVar.b);
            C2482j.m13295a(stringBuilder, brVar.h);
            FinskyLog.m21659a("%s", stringBuilder);
        }
        by b = this.f13385f.m13272b();
        b.l = brVar;
        if (j > 0) {
            b.a(j);
        }
        return m13317a(6, b, null);
    }

    public static int m13280a(VolleyError volleyError) {
        if (volleyError == null) {
            return 8;
        }
        if (volleyError instanceof TimeoutError) {
            return 1;
        }
        if (volleyError instanceof NetworkError) {
            if (volleyError instanceof NoConnectionError) {
                return 6;
            }
            return 2;
        } else if (volleyError instanceof ParseError) {
            return 3;
        } else {
            if (volleyError instanceof AuthFailureError) {
                return 4;
            }
            if (volleyError instanceof ServerError) {
                return 5;
            }
            if (volleyError instanceof DisplayMessageError) {
                return 7;
            }
            return 0;
        }
    }

    public final void m13334k() {
        synchronized (this.f13397w) {
            if (this.f13398x) {
                m13319a(new C2474c(19).f13342a, null);
                this.f13398x = false;
            }
        }
    }

    public final void m13330a(String str, long j, long j2, long j3, long j4, int i, int i2, float f, boolean z, VolleyError volleyError, NetworkInfo networkInfo, NetworkInfo networkInfo2, int i3, boolean z2, int i4, Boolean bool, int i5, String str2) {
        m13320a(new C2474c(5).m13224a(C2482j.m13282a(str, j, j2, j3, j4, i, i2, f, z, volleyError, networkInfo, networkInfo2, -1, i3, z2, i4, bool, i5, str2)).f13342a, null, -1);
    }

    public static bz m13282a(String str, long j, long j2, long j3, long j4, int i, int i2, float f, boolean z, VolleyError volleyError, NetworkInfo networkInfo, NetworkInfo networkInfo2, int i3, int i4, boolean z2, int i5, Boolean bool, int i6, String str2) {
        int a = C2482j.m13280a(volleyError);
        bz bzVar = new bz();
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                throw new NullPointerException();
            }
            bzVar.a |= 1;
            bzVar.b = str;
        }
        if (j >= 0) {
            bzVar.a |= 2;
            bzVar.c = j;
        }
        if (j2 >= 0) {
            bzVar.a |= 4;
            bzVar.d = j2;
        }
        if (j3 >= 0) {
            bzVar.a |= 65536;
            bzVar.r = j3;
        }
        if (j4 >= 0) {
            bzVar.a |= 131072;
            bzVar.s = j4;
        }
        if (i >= 0) {
            bzVar.a |= 8;
            bzVar.e = i;
        }
        if (i2 >= 0) {
            bzVar.a |= 16;
            bzVar.f = i2;
        }
        if (f > 0.0f) {
            bzVar.a |= 32;
            bzVar.g = f;
        }
        bzVar.a |= 64;
        bzVar.h = z;
        if (!z) {
            bzVar.a(a);
        }
        bzVar.i = C6216a.m28694a(networkInfo);
        bzVar.a |= 128;
        bzVar.j = C6216a.m28694a(networkInfo2);
        bzVar.a |= 256;
        if (i3 >= 0) {
            bzVar.a |= 32768;
            bzVar.q = i3;
        }
        if (i4 >= 0) {
            bzVar.a |= 512;
            bzVar.k = i4;
        }
        bzVar.a |= eq.FLAG_MOVED;
        bzVar.m = z2;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            bzVar.a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
            bzVar.n = booleanValue;
        }
        if (i5 != 0) {
            bzVar.p = i5;
            bzVar.a |= 16384;
        }
        if (i6 != 0) {
            bzVar.t = i6;
            bzVar.a |= 262144;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                throw new NullPointerException();
            }
            bzVar.a |= 524288;
            bzVar.u = str2;
        }
        return bzVar;
    }

    public final void m13335l() {
        if (!this.f13394t.mo2294a(12626588) || this.f13394t.mo2294a(12639415)) {
            for (C2484l c2484l : this.f13383H) {
                m13287a(4, c2484l.f13404a, c2484l.f13405b, null);
            }
            m13336m();
        }
    }

    public final void m13336m() {
        this.f13383H.clear();
        synchronized (this.f13397w) {
            this.f13398x = true;
        }
    }
}
