package com.google.android.libraries.performance.primes.p332a;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.aa;
import d.a.a.a.a.a.ar;
import d.a.a.a.a.a.be;
import d.a.a.a.a.a.bg;
import d.a.a.a.a.a.bt;
import d.a.a.a.a.a.p;
import java.util.Map;

public final class C5939c {
    private static boolean m27551a(Number number) {
        return number == null || number.longValue() <= 0;
    }

    static boolean m27550a(p pVar) {
        return C5939c.m27551a(pVar.b);
    }

    private static boolean m27549a(bt btVar) {
        return (btVar.b == null || btVar.b.intValue() == 0) && (btVar.c == null || btVar.c.longValue() == 0);
    }

    static boolean m27547a(be beVar) {
        return C5939c.m27551a(beVar.b) && C5939c.m27551a(beVar.c) && C5939c.m27551a(beVar.f) && C5939c.m27551a(beVar.e) && C5939c.m27551a(beVar.d) && C5939c.m27551a(beVar.g);
    }

    static boolean m27546a(ar arVar) {
        return arVar.c == null;
    }

    static boolean m27548a(bg bgVar) {
        return C5939c.m27551a(bgVar.b) && C5939c.m27551a(bgVar.c);
    }

    public static Long m27545a(Long l, Long l2) {
        if (l == null || l2 == null) {
            return l;
        }
        long longValue = l.longValue() - l2.longValue();
        return longValue == 0 ? null : Long.valueOf(longValue);
    }

    static Integer m27542a(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return num;
        }
        int intValue = num.intValue() - num2.intValue();
        return intValue == 0 ? null : Integer.valueOf(intValue);
    }

    static aa m27539a(String str) {
        if (str == null) {
            return null;
        }
        aa aaVar = new aa();
        aaVar.b = str;
        return aaVar;
    }

    static bt m27541a(String str, TimerStat timerStat) {
        bt btVar = new bt();
        btVar.b = Integer.valueOf(timerStat.getCount());
        if (btVar.b.intValue() < 0) {
            btVar.b = Integer.valueOf(0);
        }
        btVar.c = Long.valueOf(timerStat.getTime());
        btVar.d = C5939c.m27539a(str);
        return C5939c.m27549a(btVar) ? null : btVar;
    }

    public static bt m27540a(bt btVar, bt btVar2) {
        if (btVar == null || btVar2 == null) {
            return btVar;
        }
        bt btVar3 = new bt();
        btVar3.d = btVar.d;
        btVar3.b = Integer.valueOf(btVar.b.intValue() - btVar2.b.intValue());
        btVar3.c = Long.valueOf(btVar.c.longValue() - btVar2.c.longValue());
        return C5939c.m27549a(btVar3) ? null : btVar3;
    }

    static Integer m27543a(Long l) {
        return l == null ? null : Integer.valueOf(l.intValue());
    }

    public static bt[] m27552a(bt[] btVarArr, bt[] btVarArr2) {
        return (bt[]) C5945i.f29600a.m27561a((C0757i[]) btVarArr, (C0757i[]) btVarArr2);
    }

    public static Long m27544a(HealthStats healthStats, int i) {
        Number valueOf;
        if (healthStats.hasMeasurement(i)) {
            valueOf = Long.valueOf(healthStats.getMeasurement(i));
        } else {
            valueOf = null;
        }
        return C5939c.m27551a(valueOf) ? null : valueOf;
    }

    public static bt m27553b(HealthStats healthStats, int i) {
        return healthStats.hasTimer(i) ? C5939c.m27541a(null, healthStats.getTimer(i)) : null;
    }

    public static bt[] m27554c(HealthStats healthStats, int i) {
        if (!healthStats.hasTimers(i)) {
            return null;
        }
        return (bt[]) C5945i.f29600a.m27560a(healthStats.getTimers(i));
    }

    public static Map m27555d(HealthStats healthStats, int i) {
        return healthStats.hasStats(i) ? healthStats.getStats(i) : null;
    }
}
