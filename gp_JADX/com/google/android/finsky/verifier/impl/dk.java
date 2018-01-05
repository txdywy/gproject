package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.support.v4.p028a.C0221j;
import android.support.v7.widget.eq;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dy.C2927i;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ad;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.aq;
import com.google.android.finsky.dy.as;
import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4698b;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.C4700d;
import com.google.android.finsky.verifier.p259a.p260a.C4701e;
import com.google.android.finsky.verifier.p259a.p260a.C4704h;
import com.google.android.finsky.verifier.p259a.p260a.C4706j;
import com.google.android.finsky.verifier.p259a.p260a.C4707k;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.safetynet.C5323d;
import com.google.android.gms.safetynet.C5571a;
import com.google.wireless.android.a.a.a.a.ct;
import com.google.wireless.android.a.a.a.a.s;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p002a.C0002a;

public class dk extends C4740a {
    public static final Set f24595a = new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.cv.m28964b())));
    public static boolean f24596m = false;
    public static boolean f24597n = false;
    public C0002a f24598b;
    public Context f24599c;
    public C1461c f24600d;
    public C2206c f24601e;
    public ab f24602f;
    public ForegroundCoordinator f24603g;
    public C4817d f24604h;
    public C2471a f24605i;
    public C1500a f24606j;
    public ad f24607k;
    public ag f24608l;
    public final C4756h f24609o = new C4756h();
    public final boolean f24610p;
    public final boolean f24611q;
    public final boolean f24612r;
    public final boolean f24613s;
    public final boolean f24614t;
    public C2495w f24615u;
    public Boolean f24616v = null;
    public boolean f24617w;
    public boolean f24618x;
    public int f24619y;
    public C3138b f24620z;

    public dk(Intent intent) {
        this.f24610p = intent.getBooleanExtra("lite_run", false);
        this.f24611q = intent.getBooleanExtra("foreground", false);
        this.f24612r = intent.getBooleanExtra("from_api", false);
        this.f24613s = intent.getBooleanExtra("restarted_service", false);
        this.f24614t = intent.getBooleanExtra("is_routine_hygiene", false);
        this.f24619y = 0;
        ((ac) C3947d.m18649a(ac.class)).mo1992a(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final boolean mo4343a() {
        /*
        r7 = this;
        r2 = 0;
        r6 = 1;
        r0 = "Verifying installed packages";
        r1 = new java.lang.Object[r2];
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
        r1 = com.google.android.finsky.verifier.impl.dk.class;
        monitor-enter(r1);
        r0 = r7.f24610p;	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x00c7;
    L_0x0010:
        r0 = f24597n;	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x00ce }
    L_0x0015:
        return r2;
    L_0x0016:
        r0 = 1;
        f24597n = r0;	 Catch:{ all -> 0x00ce }
    L_0x0019:
        monitor-exit(r1);	 Catch:{ all -> 0x00ce }
        r7.f24617w = r6;
        r0 = r7.f24605i;
        r1 = 0;
        r0 = r0.m13178a(r1);
        r7.f24615u = r0;
        r0 = com.google.android.finsky.aa.C0954a.f5815K;
        r0 = r0.m5760a();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00d6;
    L_0x0033:
        r0 = com.google.android.finsky.aa.C0955b.cg;
        r0 = r0.m28964b();
        r0 = (java.lang.Float) r0;
    L_0x003b:
        r0 = r0.floatValue();
        r1 = r7.f24610p;
        if (r1 != 0) goto L_0x0050;
    L_0x0043:
        r1 = new java.util.Random;
        r1.<init>();
        r1 = r1.nextFloat();
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0051;
    L_0x0050:
        r2 = r6;
    L_0x0051:
        r0 = com.google.android.finsky.verifier.impl.bg.m22121a();
        r3 = r0.m22129d();
        r0 = com.google.android.finsky.aa.C0955b.ce;
        r0 = r0.m28964b();
        r0 = (java.lang.Boolean) r0;
        r1 = r0.booleanValue();
        r5 = new com.google.android.finsky.verifier.a.a.b;
        r5.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r7;
        r1 = r0.m22316a(r1, r2, r3, r4, r5);
        r0 = com.google.android.finsky.aa.C0955b.co;
        r0 = r0.m28964b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0098;
    L_0x0082:
        if (r3 != 0) goto L_0x0098;
    L_0x0084:
        r0 = r4.isEmpty();
        if (r0 != 0) goto L_0x0098;
    L_0x008a:
        r0 = r7.m22070m();
        if (r0 != 0) goto L_0x0098;
    L_0x0090:
        r0 = new com.google.android.finsky.verifier.impl.dv;
        r0.<init>(r7, r1);
        r7.m22325a(r4, r0);
    L_0x0098:
        r0 = r1.isEmpty();
        if (r0 != 0) goto L_0x00e6;
    L_0x009e:
        r0 = r7.m22070m();
        if (r0 != 0) goto L_0x00e6;
    L_0x00a4:
        r0 = r7.f24610p;
        if (r0 == 0) goto L_0x00e0;
    L_0x00a8:
        r0 = r7.m22324a(r1);
        if (r0 == 0) goto L_0x00b4;
    L_0x00ae:
        r0 = r7.m22070m();
        if (r0 == 0) goto L_0x00e0;
    L_0x00b4:
        r0 = com.google.android.finsky.aa.C0954a.f5817M;
        r2 = java.lang.System.currentTimeMillis();
        r1 = java.lang.Long.valueOf(r2);
        r0.m5763a(r1);
        r2 = r7.m22328a(r6);
        goto L_0x0015;
    L_0x00c7:
        r0 = f24596m;	 Catch:{ all -> 0x00ce }
        if (r0 == 0) goto L_0x00d1;
    L_0x00cb:
        monitor-exit(r1);	 Catch:{ all -> 0x00ce }
        goto L_0x0015;
    L_0x00ce:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ce }
        throw r0;
    L_0x00d1:
        r0 = 1;
        f24596m = r0;	 Catch:{ all -> 0x00ce }
        goto L_0x0019;
    L_0x00d6:
        r0 = com.google.android.finsky.aa.C0955b.cf;
        r0 = r0.m28964b();
        r0 = (java.lang.Float) r0;
        goto L_0x003b;
    L_0x00e0:
        r7.m22320a(r1, r5);
        r2 = r6;
        goto L_0x0015;
    L_0x00e6:
        r2 = r7.m22328a(r6);
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.dk.a():boolean");
    }

    protected final void mo4344c() {
        synchronized (dk.class) {
            if (this.f24617w) {
                if (this.f24610p) {
                    f24597n = false;
                } else {
                    f24596m = false;
                }
                m22317a(this.f24599c, this.f24610p, this.f24618x);
            }
        }
        FinskyLog.m21659a("Done verifying installed packages", new Object[0]);
    }

    private final boolean m22321a(ApplicationInfo applicationInfo, byte[] bArr) {
        if (!applicationInfo.enabled) {
            return true;
        }
        this.f24609o.m22366a(applicationInfo.packageName, bArr, false);
        if (((Boolean) C0955b.cG.m28964b()).booleanValue()) {
            ct ctVar = new ct();
            ctVar.a(applicationInfo.packageName);
            ctVar.b(C4691w.m21842a(Arrays.copyOfRange(bArr, 0, 4)));
            this.f24615u.m13367a(new C2474c(2629).m13229a(ctVar));
        }
        return false;
    }

    private final C4699c m22312a(ac acVar, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        C4699c c4699c = new C4699c();
        c4699c.f24154m = new C4700d();
        c4699c.f24154m.m21884a(acVar.f15487a);
        byte[] bArr = acVar.f15489c;
        C4704h c4704h = new C4704h();
        c4704h.m21900a(bArr);
        c4699c.f24145d = c4704h;
        c4699c.f24146e = acVar.f15490d;
        if (acVar.f15491e) {
            c4699c.f24154m.cj_();
        }
        if (acVar.f15492f) {
            c4699c.f24154m.ck_();
        }
        if (acVar.f15494h || acVar.f15495i != -1) {
            c4699c.f24154m.f24183p = new C4701e();
            if (acVar.f15494h) {
                c4699c.f24154m.f24183p.m21890a(true);
            }
            if (acVar.f15495i != -1) {
                c4699c.f24154m.f24183p.m21889a(acVar.f15495i);
            }
        }
        boolean z = acVar.f15507u;
        if (z) {
            z = m22321a(applicationInfo, c4699c.f24145d.f24199b);
        }
        if (z) {
            c4699c.m21883f();
        }
        return c4699c;
    }

    private final List m22316a(boolean z, boolean z2, boolean z3, List list, C4698b c4698b) {
        Object obj;
        List arrayList = new ArrayList();
        List<PackageInfo> installedPackages = this.f24599c.getPackageManager().getInstalledPackages(576);
        boolean i = bg.m22121a().m22134i();
        if (i || bg.m22121a().m22133h()) {
            obj = 1;
        } else {
            obj = null;
        }
        this.f24601e.mo2820c();
        Map a = this.f24607k.m15219a(true, false);
        Set<String> hashSet = new HashSet(a.keySet());
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (PackageInfo packageInfo : installedPackages) {
            if (m22070m()) {
                return Collections.emptyList();
            }
            String str = packageInfo.packageName;
            hashSet.remove(str);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                i2++;
            } else {
                Object obj2;
                Object obj3;
                int i8;
                Object obj4;
                C4699c c4699c;
                ac b;
                C4722z a2;
                ApplicationInfo applicationInfo2;
                C4699c c4699c2;
                boolean z4;
                C4700d c4700d;
                C4701e c4701e;
                C4700d c4700d2;
                long j;
                String installerPackageName;
                C4706j c4706j;
                Object obj5 = null;
                if ((applicationInfo.flags & 1) != 0) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    int i9;
                    if (z2) {
                        i9 = i5;
                    } else {
                        i9 = i5 + 1;
                        obj5 = 1;
                    }
                    if (obj5 != null || ((Boolean) C0955b.cF.m28964b()).booleanValue() || applicationInfo.enabled) {
                        obj3 = obj5;
                        i8 = i9;
                    } else {
                        i3++;
                        obj3 = 1;
                        i8 = i9;
                    }
                } else {
                    i8 = i5;
                    obj3 = null;
                }
                Object obj6 = !this.f24601e.mo2812a(str).isEmpty() ? 1 : null;
                if (obj3 == null) {
                    if (obj6 == null && !z3) {
                        i4++;
                        obj4 = 1;
                        if (obj4 != null) {
                        }
                        c4699c = null;
                        if (ag.m15238b(this.f24600d.dj())) {
                            b = this.f24609o.m22368b(str, packageInfo);
                            if (b != null) {
                                c4699c = m22312a(b, packageInfo);
                            }
                        } else {
                            a2 = this.f24609o.m22364a(str, packageInfo);
                            if (a2 != null) {
                                applicationInfo2 = packageInfo.applicationInfo;
                                c4699c2 = new C4699c();
                                c4699c2.f24154m = new C4700d();
                                c4699c2.f24154m.m21884a(packageInfo.packageName);
                                c4699c2.f24145d = am.m22057a(a2.f24294d);
                                c4699c2.f24146e = new File(packageInfo.applicationInfo.publicSourceDir).length();
                                if (!applicationInfo2.publicSourceDir.equals(applicationInfo2.sourceDir)) {
                                    c4699c2.f24154m.cj_();
                                }
                                if (a2.f24295e) {
                                    c4699c2.f24154m.ck_();
                                }
                                z4 = a2.f24296f;
                                if (z4) {
                                    z4 = m22321a(applicationInfo2, c4699c2.f24145d.f24199b);
                                }
                                if (z4) {
                                    c4699c2.m21883f();
                                }
                                c4700d = c4699c2.f24154m;
                                c4701e = (C4701e) ag.m15236a(this.f24608l.m15241a((aq) new dl(a2.f24294d)));
                                if (c4701e == null) {
                                    c4701e = new C4701e();
                                    c4701e.m21890a(false);
                                }
                                c4700d.f24183p = c4701e;
                                c4699c = c4699c2;
                            }
                        }
                        if (c4699c == null) {
                            c4699c.ci_();
                            if (obj6 != null) {
                                c4700d2 = c4699c.f24154m;
                                c4700d2.f24168a |= 4;
                                c4700d2.f24172e = true;
                            }
                            if ((applicationInfo.flags & 2097152) != 0) {
                                c4700d2 = c4699c.f24154m;
                                c4700d2.f24168a |= 16;
                                c4700d2.f24174g = true;
                            }
                            if (obj2 != null) {
                                c4700d2 = c4699c.f24154m;
                                c4700d2.f24168a |= 64;
                                c4700d2.f24176i = true;
                            }
                            if ((applicationInfo.flags & 128) != 0) {
                                c4700d2 = c4699c.f24154m;
                                c4700d2.f24168a |= 128;
                                c4700d2.f24177j = true;
                            }
                            c4699c.f24148g = am.m22062b(C4747b.m22107b(packageInfo.signatures));
                            if (i) {
                                c4699c.m21881d();
                            }
                            if (obj != null) {
                                c4699c.m21882e();
                            }
                            if (!applicationInfo.enabled) {
                                c4699c.f24143b |= 16384;
                                c4699c.f24138D = true;
                            }
                            c4700d2 = c4699c.f24154m;
                            j = packageInfo.firstInstallTime;
                            c4700d2.f24168a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                            c4700d2.f24181n = j;
                            c4700d2 = c4699c.f24154m;
                            j = packageInfo.lastUpdateTime;
                            c4700d2.f24168a |= eq.FLAG_MOVED;
                            c4700d2.f24182o = j;
                            installerPackageName = this.f24599c.getPackageManager().getInstallerPackageName(str);
                            if (installerPackageName == null) {
                                c4706j = new C4706j();
                                new C4707k().m21911a(installerPackageName);
                                c4706j.f24210d = new C4707k[]{r15};
                            } else {
                                c4706j = null;
                            }
                            if (c4706j != null) {
                                c4699c.f24164w = c4706j;
                            }
                            if (c4699c == null) {
                                list.add(c4699c);
                                if (obj4 == null) {
                                    arrayList.add(c4699c);
                                }
                                i5 = i8;
                            } else {
                                i7++;
                                i5 = i8;
                            }
                        } else {
                            i7++;
                            i5 = i8;
                        }
                    } else if (!(obj6 == null || z)) {
                        i6++;
                        int i10 = 1;
                        if (obj4 != null || (((Boolean) C0955b.co.m28964b()).booleanValue() && !z3 && obj6 == null)) {
                            c4699c = null;
                            if (ag.m15238b(this.f24600d.dj())) {
                                a2 = this.f24609o.m22364a(str, packageInfo);
                                if (a2 != null) {
                                    applicationInfo2 = packageInfo.applicationInfo;
                                    c4699c2 = new C4699c();
                                    c4699c2.f24154m = new C4700d();
                                    c4699c2.f24154m.m21884a(packageInfo.packageName);
                                    c4699c2.f24145d = am.m22057a(a2.f24294d);
                                    c4699c2.f24146e = new File(packageInfo.applicationInfo.publicSourceDir).length();
                                    if (applicationInfo2.publicSourceDir.equals(applicationInfo2.sourceDir)) {
                                        c4699c2.f24154m.cj_();
                                    }
                                    if (a2.f24295e) {
                                        c4699c2.f24154m.ck_();
                                    }
                                    z4 = a2.f24296f;
                                    if (z4) {
                                        z4 = m22321a(applicationInfo2, c4699c2.f24145d.f24199b);
                                    }
                                    if (z4) {
                                        c4699c2.m21883f();
                                    }
                                    c4700d = c4699c2.f24154m;
                                    c4701e = (C4701e) ag.m15236a(this.f24608l.m15241a((aq) new dl(a2.f24294d)));
                                    if (c4701e == null) {
                                        c4701e = new C4701e();
                                        c4701e.m21890a(false);
                                    }
                                    c4700d.f24183p = c4701e;
                                    c4699c = c4699c2;
                                }
                            } else {
                                b = this.f24609o.m22368b(str, packageInfo);
                                if (b != null) {
                                    c4699c = m22312a(b, packageInfo);
                                }
                            }
                            if (c4699c == null) {
                                i7++;
                                i5 = i8;
                            } else {
                                c4699c.ci_();
                                if (obj6 != null) {
                                    c4700d2 = c4699c.f24154m;
                                    c4700d2.f24168a |= 4;
                                    c4700d2.f24172e = true;
                                }
                                if ((applicationInfo.flags & 2097152) != 0) {
                                    c4700d2 = c4699c.f24154m;
                                    c4700d2.f24168a |= 16;
                                    c4700d2.f24174g = true;
                                }
                                if (obj2 != null) {
                                    c4700d2 = c4699c.f24154m;
                                    c4700d2.f24168a |= 64;
                                    c4700d2.f24176i = true;
                                }
                                if ((applicationInfo.flags & 128) != 0) {
                                    c4700d2 = c4699c.f24154m;
                                    c4700d2.f24168a |= 128;
                                    c4700d2.f24177j = true;
                                }
                                c4699c.f24148g = am.m22062b(C4747b.m22107b(packageInfo.signatures));
                                if (i) {
                                    c4699c.m21881d();
                                }
                                if (obj != null) {
                                    c4699c.m21882e();
                                }
                                if (applicationInfo.enabled) {
                                    c4699c.f24143b |= 16384;
                                    c4699c.f24138D = true;
                                }
                                c4700d2 = c4699c.f24154m;
                                j = packageInfo.firstInstallTime;
                                c4700d2.f24168a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                                c4700d2.f24181n = j;
                                c4700d2 = c4699c.f24154m;
                                j = packageInfo.lastUpdateTime;
                                c4700d2.f24168a |= eq.FLAG_MOVED;
                                c4700d2.f24182o = j;
                                if (((Boolean) C0955b.cP.m28964b()).booleanValue() && obj2 == null && obj6 == null) {
                                    installerPackageName = this.f24599c.getPackageManager().getInstallerPackageName(str);
                                    if (installerPackageName == null) {
                                        c4706j = null;
                                    } else {
                                        c4706j = new C4706j();
                                        new C4707k().m21911a(installerPackageName);
                                        c4706j.f24210d = new C4707k[]{r15};
                                    }
                                    if (c4706j != null) {
                                        c4699c.f24164w = c4706j;
                                    }
                                }
                                if (c4699c == null) {
                                    i7++;
                                    i5 = i8;
                                } else {
                                    if (!z3 && obj6 == null) {
                                        list.add(c4699c);
                                    }
                                    if (obj4 == null) {
                                        arrayList.add(c4699c);
                                    }
                                    i5 = i8;
                                }
                            }
                        } else {
                            i5 = i8;
                        }
                    }
                }
                obj4 = obj3;
                if (obj4 != null) {
                }
                c4699c = null;
                if (ag.m15238b(this.f24600d.dj())) {
                    a2 = this.f24609o.m22364a(str, packageInfo);
                    if (a2 != null) {
                        applicationInfo2 = packageInfo.applicationInfo;
                        c4699c2 = new C4699c();
                        c4699c2.f24154m = new C4700d();
                        c4699c2.f24154m.m21884a(packageInfo.packageName);
                        c4699c2.f24145d = am.m22057a(a2.f24294d);
                        c4699c2.f24146e = new File(packageInfo.applicationInfo.publicSourceDir).length();
                        if (applicationInfo2.publicSourceDir.equals(applicationInfo2.sourceDir)) {
                            c4699c2.f24154m.cj_();
                        }
                        if (a2.f24295e) {
                            c4699c2.f24154m.ck_();
                        }
                        z4 = a2.f24296f;
                        if (z4) {
                            z4 = m22321a(applicationInfo2, c4699c2.f24145d.f24199b);
                        }
                        if (z4) {
                            c4699c2.m21883f();
                        }
                        c4700d = c4699c2.f24154m;
                        c4701e = (C4701e) ag.m15236a(this.f24608l.m15241a((aq) new dl(a2.f24294d)));
                        if (c4701e == null) {
                            c4701e = new C4701e();
                            c4701e.m21890a(false);
                        }
                        c4700d.f24183p = c4701e;
                        c4699c = c4699c2;
                    }
                } else {
                    b = this.f24609o.m22368b(str, packageInfo);
                    if (b != null) {
                        c4699c = m22312a(b, packageInfo);
                    }
                }
                if (c4699c == null) {
                    i7++;
                    i5 = i8;
                } else {
                    c4699c.ci_();
                    if (obj6 != null) {
                        c4700d2 = c4699c.f24154m;
                        c4700d2.f24168a |= 4;
                        c4700d2.f24172e = true;
                    }
                    if ((applicationInfo.flags & 2097152) != 0) {
                        c4700d2 = c4699c.f24154m;
                        c4700d2.f24168a |= 16;
                        c4700d2.f24174g = true;
                    }
                    if (obj2 != null) {
                        c4700d2 = c4699c.f24154m;
                        c4700d2.f24168a |= 64;
                        c4700d2.f24176i = true;
                    }
                    if ((applicationInfo.flags & 128) != 0) {
                        c4700d2 = c4699c.f24154m;
                        c4700d2.f24168a |= 128;
                        c4700d2.f24177j = true;
                    }
                    c4699c.f24148g = am.m22062b(C4747b.m22107b(packageInfo.signatures));
                    if (i) {
                        c4699c.m21881d();
                    }
                    if (obj != null) {
                        c4699c.m21882e();
                    }
                    if (applicationInfo.enabled) {
                        c4699c.f24143b |= 16384;
                        c4699c.f24138D = true;
                    }
                    c4700d2 = c4699c.f24154m;
                    j = packageInfo.firstInstallTime;
                    c4700d2.f24168a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    c4700d2.f24181n = j;
                    c4700d2 = c4699c.f24154m;
                    j = packageInfo.lastUpdateTime;
                    c4700d2.f24168a |= eq.FLAG_MOVED;
                    c4700d2.f24182o = j;
                    installerPackageName = this.f24599c.getPackageManager().getInstallerPackageName(str);
                    if (installerPackageName == null) {
                        c4706j = null;
                    } else {
                        c4706j = new C4706j();
                        new C4707k().m21911a(installerPackageName);
                        c4706j.f24210d = new C4707k[]{r15};
                    }
                    if (c4706j != null) {
                        c4699c.f24164w = c4706j;
                    }
                    if (c4699c == null) {
                        i7++;
                        i5 = i8;
                    } else {
                        list.add(c4699c);
                        if (obj4 == null) {
                            arrayList.add(c4699c);
                        }
                        i5 = i8;
                    }
                }
            }
        }
        int size = installedPackages.size();
        c4698b.f24126a |= 1;
        c4698b.f24127b = size;
        if (i2 > 0) {
            c4698b.f24126a |= 2;
            c4698b.f24128c = i2;
        }
        if (i5 > 0) {
            c4698b.f24126a |= 4;
            c4698b.f24129d = i5;
        }
        if (i3 > 0) {
            c4698b.f24126a |= 8;
            c4698b.f24130e = i3;
        }
        if (i6 > 0) {
            c4698b.f24126a |= 16;
            c4698b.f24131f = i6;
        }
        if (i4 > 0) {
            c4698b.f24126a |= 32;
            c4698b.f24132g = i4;
        }
        if (i7 > 0) {
            c4698b.f24126a |= 64;
            c4698b.f24133h = i7;
        }
        for (String str2 : hashSet) {
            this.f24607k.m15224a(str2, ((ac) a.get(str2)).f15489c, null, null);
        }
        this.f24607k.m15232d();
        if (ag.m15237a(this.f24600d.dj())) {
            ag.m15236a(this.f24608l.m15240a(new dn(this.f24608l, installedPackages)));
        }
        return arrayList;
    }

    final boolean m22327a(C4699c c4699c, C4735g c4735g) {
        Set hashSet;
        Set set;
        boolean booleanValue = ((Boolean) C0955b.cJ.m28964b()).booleanValue();
        if (booleanValue) {
            C4756h c4756h = this.f24609o;
            String str = c4699c.f24154m.f24169b;
            hashSet = new HashSet();
            if (ag.m15238b(c4756h.f24679b.dj())) {
                C4722z c4722z = (C4722z) ag.m15236a(c4756h.f24682e.m15243b(new C4763o(str)));
                if (!(c4722z == null || c4722z.f24297g == null)) {
                    hashSet.addAll(Arrays.asList(c4722z.f24297g));
                }
            } else {
                ac a = c4756h.f24681d.m15217a(str);
                if (!(a == null || a.f15509w == null || a.f15509w.length <= 0)) {
                    hashSet.addAll(Arrays.asList(a.f15509w));
                }
            }
            set = hashSet;
        } else {
            set = Collections.emptySet();
        }
        hashSet = new HashSet();
        if (c4735g.f24375l != null) {
            hashSet.addAll(Arrays.asList(c4735g.f24375l));
        }
        if (hashSet.isEmpty()) {
            if (booleanValue && !set.isEmpty()) {
                m22318a(c4699c, hashSet, set);
            }
            return false;
        }
        if (this.f24609o.m22367a(c4699c.f24154m.f24169b)) {
            cs.m22277a(this.f24599c, this.f24609o, this.f24602f, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b);
        }
        m22318a(c4699c, hashSet, set);
        return true;
    }

    static boolean m22323a(String str, boolean z, boolean z2) {
        return (z || "com.android.vending".equals(str) || "com.google.android.gms".equals(str) || !((Boolean) C0955b.cD.m28964b()).booleanValue() || !z2) ? false : true;
    }

    static void m22317a(Context context, boolean z, boolean z2) {
        Intent intent = new Intent("verify_installed_packages_finished");
        intent.putExtra("lite_run", z);
        intent.putExtra("success", z2);
        C0221j.m1129a(context).m1134b(intent);
    }

    final boolean m22328a(boolean z) {
        this.f24618x = z;
        m22069l();
        return false;
    }

    private final void m22320a(List list, C4698b c4698b) {
        ea dtVar;
        int i = 0;
        boolean d = bg.m22121a().m22129d();
        cs.m22275a(this.f24599c, this.f24606j, (C4699c) list.get(0));
        while (i < list.size()) {
            C4699c c4699c = (C4699c) list.get(i);
            try {
                byte[] bytes = Integer.toHexString(i).getBytes("UTF-8");
                if (bytes == null) {
                    throw new NullPointerException();
                }
                c4699c.f24143b |= 32;
                c4699c.f24157p = bytes;
                i++;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
        if (bg.m22121a().m22134i()) {
            dtVar = new dt(this);
        } else {
            dtVar = new du(this);
        }
        Runnable dsVar = new ds(this, list, d, c4698b, new dy(this, list, dtVar), new dr(this, list));
        if (this.f24614t || !(this.f24611q || (this.f24610p && this.f24603g.m16017a()))) {
            dsVar.run();
        } else {
            this.f24620z = this.f24603g.m16016a(6, this.f24600d.dj(), dsVar);
        }
    }

    private static String m22315a(String str) {
        return new StringBuilder(String.valueOf(str).length() + 30).append("safe.safebrowsing.google.com/").append(str).append("/").toString();
    }

    private final boolean m22324a(List list) {
        boolean z = false;
        C5058o b = new C5089p(this.f24599c).m23647a(C5571a.f28491c).m23652b();
        if (b.mo4542a(10, TimeUnit.SECONDS).m23264b()) {
            C4699c c4699c;
            List singletonList = Collections.singletonList(Integer.valueOf(1));
            C4954s a = C5571a.f28492d.mo4815a(b, singletonList, m22315a("6aad7a050f7d8b58cbeb7095aeac630225b2710991c1a52558b264723162050d"));
            long currentTimeMillis = System.currentTimeMillis();
            a.mo4488a(10, TimeUnit.SECONDS);
            currentTimeMillis += ((Long) C0955b.cx.m28964b()).longValue();
            while (true) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis - currentTimeMillis2 <= 0) {
                    break;
                }
                try {
                    Thread.sleep(currentTimeMillis - currentTimeMillis2);
                } catch (InterruptedException e) {
                }
            }
            List arrayList = new ArrayList();
            for (C4699c c4699c2 : list) {
                arrayList.add(C5571a.f28492d.mo4815a(b, singletonList, m22315a(C4691w.m21842a(c4699c2.f24145d.f24199b))));
            }
            int i = 0;
            while (i < list.size()) {
                boolean z2;
                c4699c2 = (C4699c) list.get(i);
                C5323d c5323d = (C5323d) ((C4954s) arrayList.get(i)).mo4488a(10, TimeUnit.SECONDS);
                if (c5323d.mo4505b().m23271a()) {
                    try {
                        if (new JSONObject(c5323d.mo4818a()).has("matches")) {
                            c4699c2.f24143b |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                            c4699c2.f24136B = true;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                    } catch (Throwable e2) {
                        FinskyLog.m21660a(e2, "Error parsing response from safety net api", new Object[0]);
                        z2 = z;
                    } catch (Throwable th) {
                        if (b.mo4562j() || b.mo4563k()) {
                            b.mo4559g();
                        }
                    }
                } else {
                    Object[] objArr = new Object[]{c4699c2.f24154m.f24169b, c5323d.mo4505b().f25632h};
                    z2 = z;
                }
                i++;
                z = z2;
            }
            if (b.mo4562j() || b.mo4563k()) {
                b.mo4559g();
            }
        } else {
            FinskyLog.m21667d("Couldn't connect to google APIs: %s", b.mo4542a(10, TimeUnit.SECONDS).f25613e);
            if (b.mo4562j() || b.mo4563k()) {
                b.mo4559g();
            }
        }
        return z;
    }

    final void m22325a(List list, C4748z c4748z) {
        List arrayList = new ArrayList();
        for (C4699c c4699c : list) {
            arrayList.add(c4699c.f24145d.f24199b);
        }
        new C4772y(this.f24599c, arrayList, c4748z).m22068k();
    }

    private final void m22318a(C4699c c4699c, Set set, Set set2) {
        String str = c4699c.f24154m.f24169b;
        byte[] bArr = c4699c.f24145d.f24199b;
        List arrayList = new ArrayList();
        if (!set2.isEmpty()) {
            Set<String> hashSet = new HashSet(set2);
            hashSet.removeAll(set);
            for (String str2 : hashSet) {
                m22319a(str, str2, false);
                if (((Boolean) C0955b.cK.m28964b()).booleanValue() && m22322a(str, str2)) {
                    arrayList.add(m22314a(str2, 1));
                }
            }
        }
        Set hashSet2 = new HashSet();
        boolean z = false;
        for (String str22 : set) {
            if (set2.contains(str22)) {
                if (m22322a(str, str22)) {
                    FinskyLog.m21662b("Package %s's component %s was already disabled by amputation.", str, str22);
                    hashSet2.add(str22);
                } else if (((Boolean) C0955b.cK.m28964b()).booleanValue()) {
                    arrayList.add(m22314a(str22, 2));
                }
            }
            m22319a(str, str22, true);
            if (m22322a(str, str22)) {
                FinskyLog.m21662b("Package %s's component %s is disabled by amputation.", str, str22);
                hashSet2.add(str22);
                z = true;
            } else if (((Boolean) C0955b.cK.m28964b()).booleanValue()) {
                arrayList.add(m22314a(str22, 0));
            }
        }
        if (set.isEmpty() || r2) {
            C4756h c4756h = this.f24609o;
            String[] strArr = (String[]) hashSet2.toArray(new String[0]);
            if (ag.m15237a(c4756h.f24679b.dj())) {
                ag.m15236a(c4756h.f24682e.m15241a(new C4764p(str, bArr, strArr)));
            }
            c4756h.f24681d.m15226a(str, bArr, strArr);
        }
        if (((Boolean) C0955b.cK.m28964b()).booleanValue() && !arrayList.isEmpty()) {
            ct ctVar = new ct();
            ctVar.a(str);
            ctVar.b(C4691w.m21842a(Arrays.copyOfRange(bArr, 0, 4)));
            ctVar.f = (s[]) arrayList.toArray(new s[0]);
            this.f24615u.m13367a(new C2474c(2630).m13229a(ctVar));
        }
    }

    private final void m22319a(String str, String str2, boolean z) {
        int i;
        ComponentName componentName = new ComponentName(str, str2);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        try {
            this.f24599c.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
        } catch (RuntimeException e) {
            FinskyLog.m21667d(e.getMessage(), new Object[0]);
        }
    }

    private final boolean m22322a(String str, String str2) {
        try {
            if (this.f24599c.getPackageManager().getComponentEnabledSetting(new ComponentName(str, str2)) == 2) {
                return true;
            }
            return false;
        } catch (RuntimeException e) {
            FinskyLog.m21667d(e.getMessage(), new Object[0]);
            return false;
        }
    }

    private static s m22314a(String str, int i) {
        s sVar = new s();
        if (str == null) {
            throw new NullPointerException();
        }
        sVar.b |= 1;
        sVar.c = str;
        sVar.d = i;
        sVar.b |= 2;
        return sVar;
    }

    static final /* synthetic */ C4701e m22313a(byte[] bArr, as asVar) {
        List list = (List) ag.m15236a(asVar.mo3201c().mo1519a(C2927i.m15282a(bArr)));
        C4701e c4701e = new C4701e();
        if (list == null || list.isEmpty()) {
            c4701e.m21890a(false);
            return c4701e;
        }
        Collections.sort(list, dm.f24622a);
        C4719w c4719w = (C4719w) list.get(list.size() - 1);
        if (!((c4719w.f24272a & 8) != 0) || c4719w.f24276e == -1) {
            c4701e.m21890a(true);
        } else {
            c4701e.m21890a(false);
            c4701e.m21889a(c4719w.f24276e);
        }
        return c4701e;
    }
}
