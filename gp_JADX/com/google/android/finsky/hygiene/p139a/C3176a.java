package com.google.android.finsky.hygiene.p139a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.hygiene.DailyHygiene;
import com.google.android.finsky.hygiene.DailyHygiene.DailyHygieneService;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ag;

public final class C3176a {
    public static final long f16446a = ((Long) C0955b.aF.m28964b()).longValue();
    public static final long f16447b = ((Long) C0955b.aE.m28964b()).longValue();
    public static final long f16448c = ((Long) C0955b.aB.m28964b()).longValue();
    public static final long f16449d = ((Long) C0955b.aL.m28964b()).longValue();
    public static final long f16450e = ((Long) C0955b.aD.m28964b()).longValue();
    public static final float f16451f = ((Float) C0955b.aJ.m28964b()).floatValue();
    public static final float f16452g = ((Float) C0955b.aI.m28964b()).floatValue();
    public static final int[] f16453h = new int[]{1, 3, 9, 27, 81};
    public final Context f16454i;

    public C3176a(Context context) {
        this.f16454i = context;
    }

    static void m16196a(Context context, int i) {
        boolean a;
        String str;
        int i2;
        C1473m c1473m = C1473m.f7980a;
        if (!C1473m.f7980a.dj().mo2294a(12638278) || C1473m.f7980a.mo2258q().m11723e() || C3176a.m16200b()) {
            a = C3176a.m16199a();
        } else {
            a = false;
        }
        if (a) {
            str = "No recent hygiene success, need more hygiene.";
            i2 = 5;
        } else if (DailyHygiene.m16181a(i) || ((Integer) C0954a.f5806B.m5760a()).intValue() != 12) {
            str = "Dirty, need more hygiene.";
            i2 = 4;
        } else if (c1473m.bi() > ((Integer) C0954a.f5849s.m5760a()).intValue()) {
            str = "Just self updated, need more hygiene.";
            i2 = 8;
        } else {
            str = "No need to run daily hygiene.";
            i2 = 0;
        }
        FinskyLog.m21659a(str, new Object[0]);
        if (i2 != 0) {
            C3176a.m16198a(context, f16446a, i2, C1473m.f7980a.dd().m13366a(C1473m.f7980a.cY()));
        }
    }

    static boolean m16199a() {
        return ((Long) C0954a.f5845o.m5760a()).longValue() < C4678i.m21812a() - f16448c;
    }

    static void m16197a(Context context, long j, int i) {
        C3176a.m16198a(context, j, i, C1473m.f7980a.aR().m13178a(C1473m.f7980a.cY()));
    }

    static boolean m16200b() {
        if (C1473m.f7980a.dj().mo2294a(12608340)) {
            FinskyLog.m21659a("Foreground run is disabled by kill-switch", new Object[0]);
            return false;
        }
        long max = Math.max(((Long) C0954a.f5845o.m5760a()).longValue(), ((Long) C0954a.f5846p.m5760a()).longValue());
        if (max <= 0) {
            return false;
        }
        return C4678i.m21812a() - max >= ((Long) C0955b.aC.m28964b()).longValue();
    }

    static void m16198a(Context context, long j, int i, C2495w c2495w) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (C1473m.f7980a.dj().mo2294a(12638395)) {
            i2 = 134217728;
        } else {
            i2 = 0;
        }
        alarmManager.set(0, C4678i.m21812a() + j, PendingIntent.getService(context, 0, new Intent(context, DailyHygieneService.class).putExtra("reason", i), i2));
        ag agVar = new ag();
        agVar.a(i);
        c2495w.m13367a(new C2474c(187).m13216a(agVar).m13242b(j));
    }
}
