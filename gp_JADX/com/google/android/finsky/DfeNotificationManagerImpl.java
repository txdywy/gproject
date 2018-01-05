package com.google.android.finsky;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C0947i;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.az.C1535a;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.ca.C2251c;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.family.remoteescalation.C3098p;
import com.google.android.finsky.family.remoteescalation.p202a.C3078a;
import com.google.android.finsky.family.remoteescalation.p202a.C3081d;
import com.google.android.finsky.hygiene.DailyHygiene;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.notification.C3780d;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.gcm.C0946b;
import com.google.android.gms.gcm.C5202h;
import com.google.android.gms.gcm.C5205l;
import com.google.android.gms.gcm.OneoffTask;
import com.google.wireless.android.a.a.a.a.ak;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.dfe.j.a.b;
import com.google.wireless.android.finsky.dfe.j.a.e;
import com.google.wireless.android.finsky.dfe.j.a.f;
import com.google.wireless.android.finsky.dfe.j.a.g;
import com.google.wireless.android.finsky.dfe.j.a.i;
import java.util.ArrayList;
import java.util.List;

public final class DfeNotificationManagerImpl implements C0947i {
    public static final List f5763a = C4672c.m21803a(new Integer[]{Integer.valueOf(6), Integer.valueOf(10), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(14), Integer.valueOf(8)});
    public final List f5764b = new ArrayList();
    public final List f5765c = new ArrayList();
    public final C3300k f5766d;
    public final ab f5767e;
    public final Context f5768f;
    public final C3646a f5769g;
    public final C2199l f5770h;
    public final C0988c f5771i;
    public final C2251c f5772j;
    public final C1535a f5773k;
    public final C2910a f5774l = C1473m.f7980a.au();
    public final C2471a f5775m = C1473m.f7980a.aR();
    public final C0986a f5776n = C1473m.f7980a.mo2041U();
    public C3780d f5777o;

    public class SelfUpdateNotificationTaskService extends C0946b {
        public final C2471a f5761a = C1473m.f7980a.aR();
        public C1473m f5762b = C1473m.f7980a;

        public final int mo1162a(C5205l c5205l) {
            String str;
            long j = c5205l.f26255a.getLong("delay_sec");
            C2471a c2471a = this.f5761a;
            if (j == 60) {
                str = "su_notification";
            } else {
                str = "su_notification_retry";
            }
            C2495w a = c2471a.m13184a(str);
            C2556b a2 = this.f5762b.mo2050a(this.f5762b.dj());
            int i = c5205l.f26255a.getInt("version_code");
            if (!C1473m.f7980a.dj().mo2294a(12638995) || i == -1 || a2.mo2947a(i)) {
                C2474c a3 = new C2474c(153).m13236a(C1473m.f7980a.f7981b.getPackageName()).m13231a(new t().b(this.f5762b.bi()));
                if (!this.f5762b.dj().mo2294a(12609134)) {
                    a3.m13210a(-3);
                    a.m13367a(a3);
                    FinskyLog.m21659a("Self-update notification ignored - experiment not enabled", new Object[0]);
                } else if (DailyHygiene.f16429a) {
                    a3.m13210a(-1);
                    a.m13367a(a3);
                    FinskyLog.m21659a("Self-update notification ignored - DailyHygiene in progress", new Object[0]);
                } else if (a2.mo2946a()) {
                    a3.m13210a(-2);
                    a.m13367a(a3);
                    FinskyLog.m21659a("Self-update notification ignored - Already running", new Object[0]);
                } else {
                    C1254c ap = this.f5762b.ap();
                    if (ap == null) {
                        a3.m13210a(-4);
                        a.m13367a(a3);
                        FinskyLog.m21669e("Self-update notification cannot be processed - DfeApi is null", new Object[0]);
                    } else {
                        t a4 = new t().b(this.f5762b.bi()).a(true);
                        FinskyLog.m21659a("Initiating push triggered self-update check", new Object[0]);
                        this.f5762b.bI().m13571a(ap, C2693e.m14552a(), new C3655l(a2, a4, a, new C2474c(119).m13231a(a4), ap, c5205l));
                    }
                }
            }
            return 0;
        }

        static OneoffTask m5698a(long j, int i) {
            Bundle bundle = new Bundle();
            if (j == 0) {
                bundle.putLong("delay_sec", 60);
            } else {
                bundle.putLong("delay_sec", 3 * j);
            }
            bundle.putInt("version_code", i);
            C5202h c5202h = new C5202h();
            c5202h.e = "SelfUpdateNotificationTaskService.TASK_TAG";
            c5202h.j = bundle;
            C5202h a = c5202h.m23985a(SelfUpdateNotificationTaskService.class);
            a.g = true;
            a.c = 0;
            return a.m23984a(j - 60, 60 + j).m23987b();
        }
    }

    public DfeNotificationManagerImpl(Context context, C3300k c3300k, ab abVar, C3646a c3646a, C2199l c2199l, C0988c c0988c, C2251c c2251c, C1535a c1535a) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1694a(this);
        this.f5766d = c3300k;
        this.f5767e = abVar;
        this.f5768f = context;
        this.f5769g = c3646a;
        this.f5770h = c2199l;
        this.f5771i = c0988c;
        this.f5772j = c2251c;
        this.f5773k = c1535a;
        m5704c();
    }

    public final void mo1163a(com.google.wireless.android.finsky.b.ab abVar) {
        if (!C1473m.f7980a.mo2035O().m8838a()) {
            FinskyLog.m21659a("Dropping notification type=%d because store type invalid", Integer.valueOf(abVar.c));
        } else if (Looper.myLooper() == Looper.getMainLooper() && this.f5769g.f18022b.m11208b()) {
            m5712b(abVar);
        } else {
            this.f5769g.m17248a(new C1548b(this, abVar));
        }
    }

    final void m5712b(com.google.wireless.android.finsky.b.ab abVar) {
        if (this.f5764b.contains(abVar.d)) {
            FinskyLog.m21659a("Notification [%s] ignored, already handled.", abVar.d);
            m5703b();
        } else if (((Boolean) C0955b.hG.m28964b()).booleanValue() && f5763a.contains(Integer.valueOf(abVar.c)) && !this.f5776n.mo1184c(abVar.h)) {
            FinskyLog.m21659a("Notification [%s] ignored, unknown account %s", r1, abVar.h);
            m5714f(abVar);
        } else {
            FinskyLog.m21659a("Handling notification type=[%s], id=[%s]", Integer.valueOf(abVar.c), r1);
            C2495w a = this.f5775m.m13184a(null);
            if (C1473m.f7980a.dj().mo2294a(12638123)) {
                ak akVar = new ak();
                akVar.a(abVar.c);
                a.m13367a(new C2474c(2800).m13218a(akVar));
            }
            Runnable c2248c = new C2248c(this, abVar, C4678i.m21813b(), a);
            if (abVar.i != null) {
                Account e = this.f5771i.mo2240e(abVar.h);
                if (e != null) {
                    int i;
                    FinskyLog.m21659a("Processing notification library update.", new Object[0]);
                    for (com.google.wireless.android.finsky.b.t tVar : abVar.i.g) {
                        if (C2726q.m14751a(tVar.c)) {
                            FinskyLog.m21659a("Encountered IAB item in notification: %s.", r4[i].c.f11833b);
                            i = 1;
                            break;
                        }
                    }
                    i = 0;
                    if (i != 0) {
                        FinskyLog.m21669e("Ignoring notification LibraryUpdate with IAB mutations.", new Object[0]);
                    } else {
                        C2199l c2199l = this.f5770h;
                        int i2 = abVar.c;
                        String str = abVar.d;
                        c2199l.mo2796a(e, new StringBuilder(String.valueOf(str).length() + 39).append("notification (type=[").append(i2).append("],id=[").append(str).append("])").toString(), c2248c, r3);
                        return;
                    }
                }
                FinskyLog.m21659a("Could not process library update for unknown account.", new Object[0]);
            }
            c2248c.run();
        }
    }

    final boolean m5713c(com.google.wireless.android.finsky.b.ab abVar) {
        Account b = this.f5776n.mo1183b(abVar.h);
        if (b == null) {
            FinskyLog.m21667d("UserSettingsDirty notification has invalid account: id=%s, account=%s", abVar.d, FinskyLog.m21655a(abVar.h));
            return false;
        }
        if (abVar.p != null) {
            this.f5774l.m15189a(b.name, r3);
        } else {
            this.f5774l.m15184a(b.name, 7);
        }
        return true;
    }

    final void m5709a(f fVar, ax axVar, String str) {
        this.f5767e.mo3781a(fVar, axVar != null ? axVar.f11835d : 0, this.f5775m.m13184a(null));
        if (fVar.n != null) {
            m5702a(fVar.n, str);
        }
    }

    final void m5711a(i iVar, String str) {
        this.f5775m.m13184a(null).m13371a(new C2474c(3101).m13240a(iVar.c).f13342a, null);
        if (iVar.b != null) {
            m5702a(iVar.b, str);
        }
    }

    private final void m5702a(e eVar, String str) {
        this.f5777o.mo3762a(eVar, str);
    }

    final void m5710a(g gVar) {
        this.f5775m.m13184a(null).m13371a(new C2474c(3102).m13240a(gVar.b).f13342a, null);
    }

    static boolean m5705d(com.google.wireless.android.finsky.b.ab abVar) {
        if (TextUtils.isEmpty(abVar.h)) {
            return false;
        }
        C1473m.f7980a.cw().m9406a(abVar.h);
        return true;
    }

    static void m5701a(b bVar) {
        String str = "Error getting rich user notification.";
        if (bVar.g() != null) {
            if (((bVar.g().a & 1) != 0 ? 1 : 0) != 0) {
                str = String.valueOf(str);
                String str2 = bVar.g().b;
                str = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str2).length()).append(str).append(" [reason: ").append(str2).append("]").toString();
            }
        }
        FinskyLog.m21667d(str, new Object[0]);
    }

    static boolean m5706e(com.google.wireless.android.finsky.b.ab abVar) {
        String cZ;
        CharSequence charSequence = abVar.h;
        if (TextUtils.isEmpty(charSequence)) {
            cZ = C1473m.f7980a.cZ();
        } else {
            CharSequence charSequence2 = charSequence;
        }
        C3081d c3081d = C3081d.f16001e;
        String str = abVar.u;
        C3098p.m15869a(cZ, str);
        C0660x c3078a = new C3078a(C1473m.f7980a.f7981b, cZ, c3081d, c3081d.f16003b.m13184a(null));
        c3078a.f15994d.mo1555a(((Long) C0954a.aW.m5777b(c3078a.f15993c).m5760a()).longValue(), str, c3078a, (C0657w) c3078a);
        if (c3081d.f16005d != null) {
            c3081d.f16005d.mo3308a(abVar.c, cZ);
        }
        return true;
    }

    final void m5714f(com.google.wireless.android.finsky.b.ab abVar) {
        this.f5764b.add(abVar.d);
        if (abVar.q) {
            while (this.f5765c.size() >= 10) {
                this.f5765c.remove(0);
            }
            this.f5765c.add(abVar.d);
            m5707a();
            m5703b();
        }
    }

    private final void m5703b() {
        if (!this.f5765c.isEmpty()) {
            List arrayList = new ArrayList(this.f5765c);
            String cZ = C1473m.f7980a.cZ();
            if (cZ == null) {
                FinskyLog.m21665c("Current account null, not ack'ing notifications: [%s]", arrayList);
                return;
            }
            C1473m.f7980a.mo2112b(cZ).mo1603a(arrayList, new C3639j(this, arrayList), new C3645k(arrayList));
        }
    }

    private final void m5704c() {
        String str = (String) C0954a.f5805A.m5760a();
        if (!TextUtils.isEmpty(str)) {
            String[] a = C4680k.m21818a(str);
            for (int i = 0; i < a.length; i++) {
                this.f5765c.add(a[i]);
                this.f5764b.add(a[i]);
            }
        }
    }

    final void m5707a() {
        if (this.f5765c.isEmpty()) {
            C0954a.f5805A.m5765c();
        } else if (this.f5765c.size() == 1) {
            C0954a.f5805A.m5763a((String) this.f5765c.get(0));
        } else {
            C0954a.f5805A.m5763a(C4680k.m21815a(this.f5765c));
        }
    }
}
