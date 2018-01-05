package com.google.android.finsky;

import android.accounts.Account;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.DfeNotificationManagerImpl.SelfUpdateNotificationTaskService;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.ca.C2251c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.hygiene.DailyHygiene;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.android.gms.gcm.C5195a;
import com.google.wireless.android.a.a.a.a.ak;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.b.ab;
import com.google.wireless.android.finsky.b.af;
import com.google.wireless.android.finsky.b.ag;
import com.google.wireless.android.finsky.b.c;
import com.google.wireless.android.finsky.dfe.j.a.a;
import com.google.wireless.android.finsky.dfe.nano.dj;

final class C2248c implements Runnable {
    public final /* synthetic */ ab f11166a;
    public final /* synthetic */ long f11167b;
    public final /* synthetic */ C2495w f11168c;
    public final /* synthetic */ DfeNotificationManagerImpl f11169d;

    C2248c(DfeNotificationManagerImpl dfeNotificationManagerImpl, ab abVar, long j, C2495w c2495w) {
        this.f11169d = dfeNotificationManagerImpl;
        this.f11166a = abVar;
        this.f11167b = j;
        this.f11168c = c2495w;
    }

    public final void run() {
        long b = C4678i.m21813b();
        boolean z = false;
        DfeNotificationManagerImpl dfeNotificationManagerImpl;
        String str;
        C2322b a;
        int i;
        t tVar;
        String str2;
        t tVar2;
        String valueOf;
        ab abVar;
        String str3;
        C2322b a2;
        DfeNotificationManagerImpl dfeNotificationManagerImpl2;
        String str4;
        C2495w a3;
        DfeNotificationManagerImpl dfeNotificationManagerImpl3;
        ab abVar2;
        switch (this.f11166a.c) {
            case 1:
                dfeNotificationManagerImpl = this.f11169d;
                ab abVar3 = this.f11166a;
                c cVar = abVar3.j;
                C2495w a4 = dfeNotificationManagerImpl.f5775m.m13184a("tickle");
                if (abVar3.j != null) {
                    if (abVar3.k != null) {
                        str = abVar3.f.f11833b;
                        if (!abVar3.k.o) {
                            FinskyLog.m21659a("Ignoring PurchaseDeliveryNotification with !server_initiated: pkg=%s", str);
                            z = false;
                            break;
                        }
                        a = dfeNotificationManagerImpl.f5769g.f18023c.mo2854a(str);
                        i = a != null ? a.f11419d : -1;
                        if (!new C3654j(C1473m.f7980a.aN()).m17260a(cVar.b, cVar.e, null).m17262a(a).m17265a()) {
                            FinskyLog.m21659a("Skip remote install of %s because %s is not newer than %s", str, new C3654j(C1473m.f7980a.aN()).m17260a(cVar.b, cVar.e, null).m17262a(a).m17270f(), new C3654j(C1473m.f7980a.aN()).m17260a(cVar.b, cVar.e, null).m17262a(a).m17271g());
                            tVar = new t();
                            tVar.a(cVar.b);
                            if (i >= 0) {
                                tVar.b(i);
                            }
                            if (a != null) {
                                tVar.a(a.f11422g);
                            }
                            a4.m13367a(new C2474c(112).m13236a(str).m13231a(tVar).m13244b("older-version"));
                            z = false;
                            break;
                        }
                        str2 = abVar3.h;
                        tVar2 = new t();
                        tVar2.a(cVar.b);
                        a4.m13367a(new C2474c(201).m13236a(str).m13231a(tVar2));
                        if (((abVar3.k.a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1 : null) != null) {
                            C1473m.f7980a.bu().m15638b(str, abVar3.k.t);
                        }
                        if (!TextUtils.isEmpty(cVar.d)) {
                            FinskyLog.m21659a("Capturing referrer for %s from notification", str);
                            C1473m.f7980a.mo2025E().m15596a(cVar.d, null, abVar3.f, "tickle");
                        }
                        if (C1503a.m8831b(dfeNotificationManagerImpl.f5768f) && C2968a.m15380a(dfeNotificationManagerImpl.f5768f).m15384c()) {
                            String str5 = "Requesting install on unmetered network for package: ";
                            valueOf = String.valueOf(abVar3.f.f11833b);
                            if (valueOf.length() != 0) {
                                valueOf = str5.concat(valueOf);
                            } else {
                                valueOf = new String(str5);
                            }
                            FinskyLog.m21659a(valueOf, new Object[0]);
                            dfeNotificationManagerImpl.f5766d.mo3444b(abVar3.f.f11833b);
                            C1473m.f7980a.cO().mo3210a(abVar3.f.f11833b);
                        }
                        dfeNotificationManagerImpl.f5766d.mo3432a(str, cVar.b, str2, abVar3.g, 2, cVar.e, a4);
                        z = true;
                        break;
                    }
                    FinskyLog.m21659a("Ignoring PurchaseDeliveryNotification because delivery data was null", new Object[0]);
                    z = false;
                    break;
                }
                FinskyLog.m21659a("Ignoring PurchaseDeliveryNotification because AppData was null.", new Object[0]);
                z = false;
                break;
            case 2:
                dfeNotificationManagerImpl = this.f11169d;
                abVar = this.f11166a;
                str2 = abVar.f.f11833b;
                z = abVar.l != null && abVar.l.b;
                str3 = abVar.g;
                FinskyLog.m21659a("Removing package '%s'. Malicious='%s'", str2, Boolean.valueOf(z));
                a2 = dfeNotificationManagerImpl.f5769g.f18023c.mo2854a(str2);
                t tVar3 = null;
                if (a2 != null) {
                    tVar3 = new t();
                    tVar3.b(a2.f11419d);
                    tVar3.a(a2.f11422g);
                }
                C1473m.f7980a.dc().m13319a(new C2474c(202).m13236a(str2).m13231a(tVar3).f13342a, null);
                C2495w a5 = dfeNotificationManagerImpl.f5775m.m13184a(null);
                if (a2 != null) {
                    if (z) {
                        dfeNotificationManagerImpl.f5767e.mo3783a(str3, a5);
                    } else {
                        dfeNotificationManagerImpl.f5767e.mo3808c(str3, str2, a5);
                    }
                }
                if (z) {
                    dfeNotificationManagerImpl.f5766d.mo3457k(str2);
                } else {
                    dfeNotificationManagerImpl.f5766d.mo3445b(str2, true);
                }
                z = true;
                break;
            case 4:
                dfeNotificationManagerImpl2 = this.f11169d;
                ag agVar = this.f11166a.m;
                dfeNotificationManagerImpl2.f5767e.mo3811e(agVar.b, agVar.c, dfeNotificationManagerImpl2.f5775m.m13184a(null));
                z = true;
                break;
            case 6:
                dfeNotificationManagerImpl2 = this.f11169d;
                abVar = this.f11166a;
                if (abVar.o != null) {
                    Account b2 = dfeNotificationManagerImpl2.f5776n.mo1183b(abVar.h);
                    if (b2 != null) {
                        String[] strArr = new String[1];
                        if (abVar.o.c.length() > 0) {
                            strArr[0] = abVar.o.c;
                        } else {
                            strArr[0] = C2229h.m11636a(abVar.o.b);
                        }
                        C2199l c2199l = dfeNotificationManagerImpl2.f5770h;
                        Runnable c2959e = new C2959e(abVar);
                        str4 = "notification-";
                        valueOf = String.valueOf(abVar.d);
                        c2199l.mo2797a(b2, strArr, c2959e, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                        z = true;
                        break;
                    }
                    FinskyLog.m21667d("Received LibraryDirty notification for invalid account: id=%s, account=%s", abVar.d, FinskyLog.m21655a(abVar.h));
                    z = false;
                    break;
                }
                FinskyLog.m21667d("Received LibraryDirty notification without LibraryDirtyData: id=%s", abVar.d);
                z = false;
                break;
            case 8:
                z = this.f11169d.m5713c(this.f11166a);
                break;
            case 9:
                DfeNotificationManagerImpl dfeNotificationManagerImpl4 = this.f11169d;
                ab abVar4 = this.f11166a;
                if (!C1473m.f7980a.dj().mo2294a(12606497)) {
                    z = false;
                    break;
                }
                str3 = abVar4.f.f11833b;
                c cVar2 = abVar4.j;
                int i2 = -1;
                es esVar = null;
                if (cVar2 != null) {
                    if (((cVar2.a & 1) != 0 ? 1 : null) != null) {
                        i2 = cVar2.b;
                        esVar = cVar2.e;
                    }
                }
                FinskyLog.m21659a("Received update check tickle for package '%s', maxVersionCode %d.", str3, Integer.valueOf(i2));
                a2 = dfeNotificationManagerImpl4.f5769g.f18023c.mo2854a(str3);
                tVar = null;
                if (a2 != null) {
                    tVar = new t();
                    if (i2 >= 0) {
                        tVar.a(i2);
                    }
                    tVar.b(a2.f11419d);
                    tVar.a(a2.f11422g);
                }
                a3 = dfeNotificationManagerImpl4.f5775m.m13184a(null);
                a3.m13367a(new C2474c(203).m13236a(str3).m13231a(tVar));
                if (a2 != null) {
                    if (i2 < 0 || !new C3654j(C1473m.f7980a.aN()).m17260a(i2, r0, null).m17262a(a2).m17269e()) {
                        if (!DailyHygiene.f16429a) {
                            C1473m.f7980a.ah().mo2815a(new C3030f(a3, str3));
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                }
                z = false;
                break;
                break;
            case 10:
                dfeNotificationManagerImpl = this.f11169d;
                abVar = this.f11166a;
                str4 = abVar.f.f11833b;
                a = dfeNotificationManagerImpl.f5769g.f18023c.mo2854a(str4);
                tVar2 = null;
                if (a != null) {
                    tVar2 = new t();
                    tVar2.a(a.f11419d);
                    tVar2.a(a.f11422g);
                }
                C1473m.f7980a.dc().m13319a(new C2474c(204).m13236a(str4).m13231a(tVar2).f13342a, null);
                str = abVar.h;
                C2251c c2251c = dfeNotificationManagerImpl.f5772j;
                aj.m21700a(str4);
                aj.m21700a(str);
                if (c2251c.f11182e.m11681a()) {
                    if (c2251c.m11684a(str4, str) != null) {
                        c2251c.m11686a(new dj[]{c2251c.m11684a(str4, str)}, str, null);
                    }
                } else {
                    c2251c.m11685a(str, 1303, "cannot-set-restrictions", 0, null, str4);
                }
                z = true;
                break;
            case 11:
                dfeNotificationManagerImpl3 = this.f11169d;
                abVar2 = this.f11166a;
                i = -1;
                if (C1473m.f7980a.dj().mo2294a(12638995)) {
                    if (abVar2.j != null) {
                        i = abVar2.j.b;
                    } else {
                        i = -1;
                    }
                }
                if (!C1473m.f7980a.dj().mo2294a(12631759)) {
                    C1473m c1473m = C1473m.f7980a;
                    a3 = dfeNotificationManagerImpl3.f5775m.m13184a(null);
                    C2556b a6 = c1473m.mo2050a(c1473m.dj());
                    if (!C1473m.f7980a.dj().mo2294a(12638995) || i == -1 || a6.mo2947a(i)) {
                        C2474c b3 = new C2474c(153).m13244b("su_notification");
                        if (c1473m.dj().mo2294a(12609134)) {
                            if (!DailyHygiene.f16429a) {
                                if (!a6.mo2946a()) {
                                    C1254c ap = c1473m.ap();
                                    if (ap != null) {
                                        tVar = new t();
                                        tVar.b(c1473m.bi());
                                        tVar.a(true);
                                        FinskyLog.m21659a("Initiating push triggered self-update check", new Object[0]);
                                        c1473m.bI().m13571a(ap, C2693e.m14552a(), new C2497d(a6, tVar, a3, new C2474c(119).m13244b("su_notification").m13231a(tVar), ap));
                                        z = true;
                                        break;
                                    }
                                }
                                b3.m13210a(-2);
                                a3.m13367a(b3);
                                FinskyLog.m21659a("Self-update notification ignored - Already running", new Object[0]);
                            } else {
                                b3.m13210a(-1);
                                a3.m13367a(b3);
                                FinskyLog.m21659a("Self-update notification ignored - DailyHygiene in progress", new Object[0]);
                            }
                        } else {
                            b3.m13210a(-3);
                            a3.m13367a(b3);
                            FinskyLog.m21659a("Self-update notification ignored - experiment not enabled", new Object[0]);
                        }
                    }
                    z = false;
                    break;
                }
                C5195a.m23967a(dfeNotificationManagerImpl3.f5768f).m23972a(SelfUpdateNotificationTaskService.m5698a(0, i));
                z = true;
                break;
            case 12:
                dfeNotificationManagerImpl2 = this.f11169d;
                abVar = this.f11166a;
                if (abVar.t == null) {
                    z = false;
                    break;
                }
                dfeNotificationManagerImpl2.m5709a(abVar.t, abVar.f, abVar.h);
                z = true;
                break;
            case 14:
                dfeNotificationManagerImpl2 = this.f11169d;
                abVar = this.f11166a;
                af afVar = abVar.s;
                if (afVar != null) {
                    str = abVar.h;
                    if (str != null) {
                        switch (afVar.b) {
                            case 1:
                                dfeNotificationManagerImpl2.f5773k.m8965a(str, afVar.c, afVar.d);
                                z = true;
                                break;
                            default:
                                FinskyLog.m21667d("Unhandled data refresh token type [%s]", afVar.c);
                                z = false;
                                break;
                        }
                    }
                    FinskyLog.m21659a("Could not process stale data refresh for unknown account.", new Object[0]);
                    z = false;
                    break;
                }
                FinskyLog.m21667d("Received StaleDataRefresh notification without StaleDataRefreshData: id=%s", abVar.d);
                z = false;
                break;
            case 15:
            case 16:
                z = DfeNotificationManagerImpl.m5706e(this.f11166a);
                break;
            case 17:
                dfeNotificationManagerImpl3 = this.f11169d;
                abVar2 = this.f11166a;
                if (abVar2.v != null) {
                    if (((abVar2.v.a & 1) != 0 ? 1 : null) != null) {
                        dfeNotificationManagerImpl3.f5775m.m13184a(null).m13371a(new C2474c(3103).m13240a(abVar2.v.c).f13342a, null);
                        a aVar = new a();
                        byte[] bArr = abVar2.v.b;
                        if (bArr != null) {
                            aVar.a |= 1;
                            aVar.b = bArr;
                            C1473m.f7980a.ap().mo1570a(aVar, new C3157h(dfeNotificationManagerImpl3, abVar2), new C3221i());
                            z = true;
                            break;
                        }
                        throw new NullPointerException();
                    }
                }
                z = false;
                break;
            case 18:
                dfeNotificationManagerImpl2 = this.f11169d;
                abVar = this.f11166a;
                z = dfeNotificationManagerImpl2.f5777o.mo3762a(abVar.w, abVar.h);
                break;
            case 19:
                z = DfeNotificationManagerImpl.m5705d(this.f11166a);
                break;
            case 22:
                dfeNotificationManagerImpl2 = this.f11169d;
                abVar = this.f11166a;
                if (abVar.x == null) {
                    z = false;
                    break;
                }
                dfeNotificationManagerImpl2.m5711a(abVar.x, abVar.h);
                z = true;
                break;
            case 23:
                dfeNotificationManagerImpl2 = this.f11169d;
                abVar = this.f11166a;
                if (abVar.y == null) {
                    z = false;
                    break;
                }
                dfeNotificationManagerImpl2.m5710a(abVar.y);
                z = true;
                break;
            default:
                FinskyLog.m21667d("Unhandled notification type [%s]", Integer.valueOf(this.f11166a.c));
                break;
        }
        if (C1473m.f7980a.dj().mo2294a(12638123)) {
            ak akVar = new ak();
            akVar.a(this.f11166a.c);
            long j = b - this.f11167b;
            akVar.a |= 2;
            akVar.c = j;
            j = C4678i.m21813b() - b;
            akVar.a |= 4;
            akVar.d = j;
            this.f11168c.m13367a(new C2474c(2801).m13218a(akVar).m13239a(z));
        }
        this.f11169d.m5714f(this.f11166a);
    }
}
