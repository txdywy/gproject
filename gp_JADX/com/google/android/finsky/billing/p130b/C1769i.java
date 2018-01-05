package com.google.android.finsky.billing.p130b;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.os.SystemClock;
import android.support.v4.p037h.C0320p;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1253j;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.billing.p153c.C1779a;
import com.google.android.finsky.cv.p177a.lg;
import com.google.android.finsky.dialogbuilder.C1762d;
import com.google.android.finsky.dialogbuilder.p154b.C1686l;
import com.google.android.finsky.dialogbuilder.p154b.C2786a;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.ads.p272d.C4911a;
import com.google.android.gms.ads.p272d.C4912b;
import com.google.android.play.dfe.api.DfeResponseVerifier;
import com.google.wireless.android.finsky.a.a.ax;
import com.google.wireless.android.finsky.b.w;
import com.google.wireless.android.finsky.dfe.c.a.ac;
import com.google.wireless.android.finsky.dfe.c.a.ae;
import com.google.wireless.android.finsky.dfe.c.a.af;
import com.google.wireless.android.finsky.dfe.c.a.ag;
import com.google.wireless.android.finsky.dfe.c.a.ar;
import com.google.wireless.android.finsky.dfe.c.a.bl;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.cz;
import com.google.wireless.android.finsky.dfe.c.a.db;
import com.google.wireless.android.finsky.dfe.c.a.dr;
import com.google.wireless.android.finsky.dfe.c.a.dt;
import com.google.wireless.android.finsky.dfe.c.a.ee;
import java.util.concurrent.Semaphore;

public final class C1769i extends AsyncTaskLoader {
    public co f9140A;
    public C1655h f9141B;
    public final C1254c f9142a;
    public final DfeResponseVerifier f9143b;
    public final C1763d f9144c;
    public final C1779a f9145d;
    public final C1774n f9146e;
    public final C2786a f9147f;
    public final C2792h f9148g;
    public final C1764f f9149h;
    public final C1686l f9150i;
    public final boolean f9151j;
    public final boolean f9152k;
    public final Semaphore f9153l = new Semaphore(0);
    public final Object f9154m = new Object();
    public ac f9155n;
    public lg f9156o;
    public String f9157p;
    public dt f9158q;
    public C0320p f9159r;
    public boolean f9160s;
    public boolean f9161t;
    public boolean f9162u;
    public C1772l f9163v;
    public C1771k f9164w;
    public ae f9165x;
    public long f9166y;
    public C1253j f9167z;

    C1769i(Context context, C1254c c1254c, DfeResponseVerifier dfeResponseVerifier, C1763d c1763d, C1779a c1779a, C1774n c1774n, C2786a c2786a, C2792h c2792h, C1764f c1764f, C1686l c1686l, C1552e c1552e) {
        super(context);
        this.f9142a = c1254c;
        this.f9143b = dfeResponseVerifier;
        this.f9144c = c1763d;
        this.f9145d = c1779a;
        this.f9146e = c1774n;
        this.f9147f = c2786a;
        this.f9148g = c2792h;
        this.f9149h = c1764f;
        this.f9150i = c1686l;
        this.f9151j = c1552e.mo2294a(12629551);
        this.f9152k = c1552e.mo2294a(12629613);
    }

    public final boolean m9716a() {
        return this.f9155n != null && this.f9155n.x;
    }

    public final boolean onCancelLoad() {
        boolean onCancelLoad;
        synchronized (this.f9154m) {
            if (this.f9160s) {
                this.f9160s = false;
                this.f9163v.f9172a = true;
                this.f9164w.f9170a = true;
                this.f9153l.release();
            }
            onCancelLoad = super.onCancelLoad();
        }
        return onCancelLoad;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.wireless.android.finsky.dfe.c.a.ae m9713b() {
        /*
        r20 = this;
        r0 = r20;
        r2 = r0.f9162u;
        if (r2 == 0) goto L_0x0010;
    L_0x0006:
        r2 = 0;
        r0 = r20;
        r0.f9162u = r2;
        r0 = r20;
        r2 = r0.f9165x;
    L_0x000f:
        return r2;
    L_0x0010:
        r0 = r20;
        r2 = r0.f9152k;
        if (r2 != 0) goto L_0x0021;
    L_0x0016:
        r0 = r20;
        r2 = r0.f9144c;
        r0 = r20;
        r3 = r0.f9140A;
        r2.m9674a(r3);
    L_0x0021:
        r0 = r20;
        r2 = r0.f9151j;
        if (r2 == 0) goto L_0x0039;
    L_0x0027:
        r0 = r20;
        r2 = r0.f9144c;
        r3 = r2.f9085f;
        r4 = 307; // 0x133 float:4.3E-43 double:1.517E-321;
        r2 = r2.mo2437d(r4);
        r2 = r2.f13342a;
        r4 = 0;
        r3.m13371a(r2, r4);
    L_0x0039:
        r0 = r20;
        r3 = r0.f9154m;
        monitor-enter(r3);
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00a9 }
        r0 = r20;
        r0.f9166y = r4;	 Catch:{ all -> 0x00a9 }
        r2 = 1;
        r0 = r20;
        r0.f9160s = r2;	 Catch:{ all -> 0x00a9 }
        r2 = 0;
        r0 = r20;
        r0.f9161t = r2;	 Catch:{ all -> 0x00a9 }
        r2 = new com.google.android.finsky.billing.b.l;	 Catch:{ all -> 0x00a9 }
        r0 = r20;
        r2.<init>(r0);	 Catch:{ all -> 0x00a9 }
        r0 = r20;
        r0.f9163v = r2;	 Catch:{ all -> 0x00a9 }
        r2 = new com.google.android.finsky.billing.b.k;	 Catch:{ all -> 0x00a9 }
        r0 = r20;
        r2.<init>(r0);	 Catch:{ all -> 0x00a9 }
        r0 = r20;
        r0.f9164w = r2;	 Catch:{ all -> 0x00a9 }
        monitor-exit(r3);	 Catch:{ all -> 0x00a9 }
        r0 = r20;
        r4 = r0.f9141B;
        r5 = r20.getContext();
        r0 = r20;
        r2 = r0.f9142a;
        r6 = r2.mo1636c();
        r0 = r20;
        r7 = r0.f9155n;
        r0 = r20;
        r2 = r0.f9145d;
        r8 = r2.m9729a();
        r0 = r20;
        r9 = r0.f9144c;
        r2 = r4.f8606b;
        r10 = r2.mo2249j(r6);
        r2 = 12639865; // 0xc0de79 float:1.7712223E-38 double:6.244923E-317;
        r2 = r10.mo2294a(r2);
        if (r2 != 0) goto L_0x00ac;
    L_0x0096:
        r2 = 0;
    L_0x0097:
        if (r2 == 0) goto L_0x024e;
    L_0x0099:
        r0 = r20;
        r0.m9715a(r2);
    L_0x009e:
        r2 = 0;
        r0 = r20;
        r0.f9160s = r2;
        r0 = r20;
        r2 = r0.f9165x;
        goto L_0x000f;
    L_0x00a9:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00a9 }
        throw r2;
    L_0x00ac:
        r2 = r7.b;
        if (r2 != 0) goto L_0x00b7;
    L_0x00b0:
        r2 = 9;
        r9.mo2434b(r2);
        r2 = 0;
        goto L_0x0097;
    L_0x00b7:
        r2 = r7.b;
        r2 = r2.c;
        if (r2 != 0) goto L_0x00c4;
    L_0x00bd:
        r2 = 8;
        r9.mo2434b(r2);
        r2 = 0;
        goto L_0x0097;
    L_0x00c4:
        r4.m9408b(r6, r9);
        r2 = r7.b;
        r2 = r2.c;
        r2 = r2.f11833b;
        r11 = r4.m9404a(r5, r6, r2, r8);
        r2 = r7.d;
        if (r2 == 0) goto L_0x00e4;
    L_0x00d5:
        r2 = r7.d;
        r2 = r2.length;
        if (r2 <= 0) goto L_0x00e4;
    L_0x00da:
        r2 = 10;
        r9.mo2434b(r2);
        r2 = 1;
    L_0x00e0:
        if (r2 == 0) goto L_0x020c;
    L_0x00e2:
        r2 = 0;
        goto L_0x0097;
    L_0x00e4:
        r2 = r7.i;
        if (r2 == 0) goto L_0x00f4;
    L_0x00e8:
        r2 = r7.i;
        r2 = r2.l;
        if (r2 == 0) goto L_0x00f4;
    L_0x00ee:
        r2 = 5;
        r9.mo2434b(r2);
        r2 = 1;
        goto L_0x00e0;
    L_0x00f4:
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r2 = r7.c;
        if (r2 == 0) goto L_0x01cd;
    L_0x00fd:
        r2 = r7.c;
        r2 = r2.g;
        if (r2 == 0) goto L_0x0110;
    L_0x0103:
        r2 = r7.c;
        r2 = r2.g;
        r2 = r2.length;
        if (r2 <= 0) goto L_0x0110;
    L_0x010a:
        r2 = 1;
        r9.mo2434b(r2);
        r2 = 1;
        goto L_0x00e0;
    L_0x0110:
        r2 = r7.c;
        r2 = r2.h;
        if (r2 == 0) goto L_0x01cd;
    L_0x0116:
        r2 = r7.c;
        r13 = r2.h;
        r14 = r13.length;
        r2 = 0;
        r3 = r2;
    L_0x011d:
        if (r3 >= r14) goto L_0x01cd;
    L_0x011f:
        r15 = r13[r3];
        r0 = r15.c;
        r16 = r0;
        r2 = r4.f8611g;
        r0 = r16;
        r2 = r2.contains(r0);
        if (r2 != 0) goto L_0x015f;
    L_0x012f:
        r2 = -1;
        r17 = r16.hashCode();
        switch(r17) {
            case -1827029976: goto L_0x0181;
            case -1631695148: goto L_0x016d;
            case -733100941: goto L_0x0177;
            case 3772: goto L_0x018b;
            case 1261903366: goto L_0x0163;
            default: goto L_0x0137;
        };
    L_0x0137:
        switch(r2) {
            case 0: goto L_0x015f;
            case 1: goto L_0x015f;
            case 2: goto L_0x015f;
            case 3: goto L_0x015f;
            case 4: goto L_0x0195;
            default: goto L_0x013a;
        };
    L_0x013a:
        r2 = "#";
        r2 = r12.append(r2);
        r0 = r16;
        r2 = r2.append(r0);
        r16 = "=";
        r0 = r16;
        r16 = r2.append(r0);
        r2 = r15.f();
        if (r2 == 0) goto L_0x019f;
    L_0x0154:
        r2 = r15.e;
        r2 = java.lang.String.valueOf(r2);
    L_0x015a:
        r0 = r16;
        r0.append(r2);
    L_0x015f:
        r2 = r3 + 1;
        r3 = r2;
        goto L_0x011d;
    L_0x0163:
        r17 = "replaceSkusProration";
        r17 = r16.equals(r17);
        if (r17 == 0) goto L_0x0137;
    L_0x016b:
        r2 = 0;
        goto L_0x0137;
    L_0x016d:
        r17 = "replaceSkusImmediately";
        r17 = r16.equals(r17);
        if (r17 == 0) goto L_0x0137;
    L_0x0175:
        r2 = 1;
        goto L_0x0137;
    L_0x0177:
        r17 = "prorationMode";
        r17 = r16.equals(r17);
        if (r17 == 0) goto L_0x0137;
    L_0x017f:
        r2 = 2;
        goto L_0x0137;
    L_0x0181:
        r17 = "accountId";
        r17 = r16.equals(r17);
        if (r17 == 0) goto L_0x0137;
    L_0x0189:
        r2 = 3;
        goto L_0x0137;
    L_0x018b:
        r17 = "vr";
        r17 = r16.equals(r17);
        if (r17 == 0) goto L_0x0137;
    L_0x0193:
        r2 = 4;
        goto L_0x0137;
    L_0x0195:
        r2 = r15.e;
        if (r2 == 0) goto L_0x015f;
    L_0x0199:
        r2 = "#vr=true";
        r12.append(r2);
        goto L_0x015f;
    L_0x019f:
        r2 = r15.g();
        if (r2 == 0) goto L_0x01ae;
    L_0x01a5:
        r0 = r15.f;
        r18 = r0;
        r2 = java.lang.String.valueOf(r18);
        goto L_0x015a;
    L_0x01ae:
        r2 = r15.e();
        if (r2 == 0) goto L_0x01b7;
    L_0x01b4:
        r2 = r15.d;
        goto L_0x015a;
    L_0x01b7:
        r2 = "Got weird param type: %s";
        r17 = 1;
        r0 = r17;
        r0 = new java.lang.Object[r0];
        r17 = r0;
        r18 = 0;
        r17[r18] = r15;
        r0 = r17;
        com.google.android.finsky.utils.FinskyLog.m21665c(r2, r0);
        r2 = "weird_param";
        goto L_0x015a;
    L_0x01cd:
        r3 = java.lang.String.valueOf(r11);
        r2 = r12.toString();
        r2 = java.lang.String.valueOf(r2);
        r13 = r2.length();
        if (r13 == 0) goto L_0x01eb;
    L_0x01df:
        r2 = r3.concat(r2);
    L_0x01e3:
        if (r2 != 0) goto L_0x01f1;
    L_0x01e5:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
    L_0x01eb:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x01e3;
    L_0x01f1:
        r3 = r7.a;
        r3 = r3 | 1024;
        r7.a = r3;
        r7.t = r2;
        r2 = r12.length();
        if (r2 <= 0) goto L_0x0209;
    L_0x01ff:
        r2 = r12.toString();
        r9.mo2432a(r2);
        r2 = 1;
        goto L_0x00e0;
    L_0x0209:
        r2 = 0;
        goto L_0x00e0;
    L_0x020c:
        r2 = 12644643; // 0xc0f123 float:1.7718919E-38 double:6.2472837E-317;
        r2 = r10.mo2294a(r2);
        if (r2 == 0) goto L_0x022a;
    L_0x0215:
        r2 = r4.m9403a(r5, r6, r8);
        r3 = r4.f8605a;
        r2 = r3.m9362b(r2, r9);
        if (r2 == 0) goto L_0x022a;
    L_0x0221:
        r6 = 12639866; // 0xc0de7a float:1.7712225E-38 double:6.2449236E-317;
        r3 = r10.mo2294a(r6);
        if (r3 != 0) goto L_0x0097;
    L_0x022a:
        r2 = r4.f8605a;
        r2 = r2.m9363c(r11, r9);
        if (r2 == 0) goto L_0x023b;
    L_0x0232:
        r4 = 12639866; // 0xc0de7a float:1.7712225E-38 double:6.2449236E-317;
        r3 = r10.mo2294a(r4);
        if (r3 != 0) goto L_0x023e;
    L_0x023b:
        r2 = 0;
        goto L_0x0097;
    L_0x023e:
        r3 = r2.e;
        if (r3 == 0) goto L_0x024a;
    L_0x0242:
        r2 = 11;
        r9.mo2434b(r2);
        r2 = 0;
        goto L_0x0097;
    L_0x024a:
        r2 = r2.c;
        goto L_0x0097;
    L_0x024e:
        r0 = r20;
        r2 = r0.f9142a;
        r0 = r20;
        r3 = r0.f9155n;
        r0 = r20;
        r4 = r0.f9156o;
        r0 = r20;
        r5 = r0.f9157p;
        r0 = r20;
        r6 = r0.f9158q;
        r0 = r20;
        r7 = r0.f9159r;
        r0 = r20;
        r8 = r0.f9163v;
        r0 = r20;
        r9 = r0.f9164w;
        r2 = r2.mo1611a(r3, r4, r5, r6, r7, r8, r9);
        r0 = r20;
        r0.f9167z = r2;
        r0 = r20;
        r2 = r0.f9153l;	 Catch:{ InterruptedException -> 0x027f }
        r2.acquire();	 Catch:{ InterruptedException -> 0x027f }
        goto L_0x009e;
    L_0x027f:
        r2 = move-exception;
        r0 = r20;
        r3 = r0.f9160s;
        if (r3 == 0) goto L_0x009e;
    L_0x0286:
        r3 = new com.android.volley.VolleyError;
        r3.<init>(r2);
        r0 = r20;
        r0.m9714a(r3);
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.b.i.b():com.google.wireless.android.finsky.dfe.c.a.ae");
    }

    final void m9715a(ae aeVar) {
        boolean z;
        C2792h c2792h = this.f9148g;
        c2792h.m14873b();
        c2792h.f15093b = null;
        c2792h.f15092a.clear();
        this.f9147f.f15078a.clear();
        this.f9149h.f9098e = null;
        this.f9165x = aeVar;
        long j = 0;
        if (this.f9167z != null) {
            j = this.f9167z.mo1542b();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9166y;
        if (aeVar.c != null) {
            C1762d c1762d = this.f9144c;
            ee eeVar = aeVar.c;
            c1762d.f9085f.m13371a(c1762d.mo2437d(308).m13240a(eeVar.c).m13210a(eeVar.b).m13212a(j).m13242b(elapsedRealtime).f13342a, null);
        }
        if (aeVar.g != null) {
            this.f9144c.m9675a(this.f9140A, aeVar.g, j, elapsedRealtime);
        }
        C1774n c1774n = this.f9146e;
        ag agVar = this.f9165x.d;
        if (agVar != null) {
            if (agVar.b.length > 0) {
                w[] wVarArr = agVar.b;
                ax axVar = agVar.d;
                c1774n.f9199m = true;
                c1774n.f9193g.mo2796a(c1774n.f9189c, "acquire", new C1775o(c1774n, axVar), wVarArr);
            }
            if (agVar.c != null) {
                dr drVar = agVar.c;
                String str = drVar.c;
                if ((drVar.a & 8) != 0) {
                    c1774n.f9192f.mo3437a(str, drVar.e);
                }
                if ((drVar.a & 16) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (drVar.f) {
                        FinskyLog.m21659a("Will queue %s to be downloaded over any network", str);
                        c1774n.f9192f.mo3431a(str);
                    } else {
                        FinskyLog.m21659a("Will queue %s to be downloaded on wifi only", str);
                        c1774n.f9192f.mo3444b(str);
                    }
                }
                c1774n.f9192f.mo3432a(str, drVar.b, c1774n.f9189c.name, drVar.d, 2, null, c1774n.f9191e);
            }
            if (agVar.e != null) {
                ar arVar = agVar.e;
                try {
                    C4911a.m22928a(c1774n.f9195i, new C4912b(arVar.b, arVar.c, arVar.d, arVar.e, arVar.f, arVar.g, arVar.h));
                    c1774n.m9719a(null);
                } catch (Throwable e) {
                    FinskyLog.m21667d("Unable to report IAP, GooglePlayServicesNotAvailableException: %s", e.getMessage());
                    c1774n.m9719a(e);
                }
            }
        }
        if (this.f9165x.d != null) {
            if ((this.f9165x.d.a & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f9165x.d.f != 0) {
                new C1770j(this, this.f9145d.m9729a()).start();
            }
        }
        if (aeVar.h == null) {
            this.f9145d.m9730a(aeVar.f);
        }
        this.f9140A = null;
    }

    final void m9714a(VolleyError volleyError) {
        cz a = this.f9150i.mo2391a(volleyError, this.f9155n.e != null);
        ae aeVar = this.f9165x;
        ae aeVar2 = new ae();
        if (aeVar == null || aeVar.b == null) {
            aeVar2.b = new af[1];
        } else {
            aeVar2.b = new af[(aeVar.b.length + 1)];
            for (int i = 0; i < aeVar.b.length; i++) {
                aeVar2.b[i + 1] = aeVar.b[i];
            }
        }
        af[] afVarArr = aeVar2.b;
        af afVar = new af();
        afVar.b |= 1;
        afVar.c = "error";
        afVarArr[0] = afVar;
        aeVar2.b[0].d = a;
        this.f9165x = aeVar2;
        if (!this.f9155n.x) {
            this.f9165x.h = new bl();
            bl blVar = this.f9165x.h;
            db dbVar = new db();
            dbVar.a |= 1;
            dbVar.b = "error";
            blVar.f = dbVar;
        }
        if (this.f9155n != null && this.f9155n.d()) {
            ae aeVar3 = this.f9165x;
            byte[] bArr = this.f9155n.d;
            if (bArr == null) {
                throw new NullPointerException();
            }
            aeVar3.a |= 1;
            aeVar3.e = bArr;
        }
        long j = 0;
        if (this.f9167z != null) {
            j = this.f9167z.mo1542b();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f9166y;
        if (this.f9151j) {
            C1762d c1762d = this.f9144c;
            c1762d.f9085f.m13371a(c1762d.mo2437d(308).m13238a((Throwable) volleyError).m13212a(j).m13242b(elapsedRealtime).f13342a, null);
        }
        if (!this.f9152k) {
            C1763d c1763d = this.f9144c;
            co coVar = this.f9140A;
            if (coVar != null) {
                C2474c b = c1763d.m9670a(coVar.c, coVar.e).m13238a((Throwable) volleyError).m13212a(j).m13242b(elapsedRealtime);
                if (coVar.d()) {
                    b.m13248d(coVar.d);
                }
                c1763d.f.m13371a(b.f13342a, null);
            }
        }
        this.f9161t = true;
        this.f9140A = null;
    }

    public final /* synthetic */ Object loadInBackground() {
        return m9713b();
    }
}
