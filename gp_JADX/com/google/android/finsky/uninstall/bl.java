package com.google.android.finsky.uninstall;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.co.C2323a;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class bl {
    public static bl f23570b;
    public bp f23571a;
    public Map f23572c = Collections.emptyMap();
    public ArrayList f23573d = new ArrayList();
    public boolean f23574e = true;
    public final C1463g f23575f = C1473m.f7980a.az();
    public final C1503a f23576g = C1473m.f7980a.mo2036P();
    public final C1461c f23577h = C1473m.f7980a.aN();
    public final C2323a f23578i = C1473m.f7980a.by();

    protected bl() {
    }

    public static synchronized bl m21377a() {
        bl blVar;
        synchronized (bl.class) {
            if (f23570b == null) {
                f23570b = new bl();
            }
            blVar = f23570b;
        }
        return blVar;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final void m21380a(Context context) {
        if (VERSION.SDK_INT < 21) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            try {
                Method declaredMethod = activityManager.getClass().getDeclaredMethod("getAllPackageUsageStats", new Class[0]);
                if (context.getPackageManager().checkPermission("android.permission.PACKAGE_USAGE_STATS", context.getPackageName()) == 0) {
                    bb.m21792a(new bn(this, declaredMethod, activityManager), new Void[0]);
                    return;
                }
                m21379a(1507);
                if (this.f23571a != null) {
                    this.f23571a.mo4284d();
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                FinskyLog.m21662b("Unable to get package usage stats method", new Object[0]);
                m21379a(1508);
                return;
            }
        }
        String str = "android:get_usage_stats";
        int checkOpNoThrow = ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow(str, Process.myUid(), context.getPackageName());
        if (checkOpNoThrow == 0 || (((Boolean) C0955b.gH.m28964b()).booleanValue() && checkOpNoThrow == 3)) {
            bb.m21792a(new bm(this, context), new Void[0]);
            return;
        }
        m21379a(1506);
        if (this.f23571a != null) {
            this.f23571a.mo4284d();
        }
    }

    final void m21379a(int i) {
        this.f23575f.dc().m13319a(new C2474c(154).m13254g(i).f13342a, null);
    }

    public final synchronized boolean m21383b() {
        boolean z = false;
        synchronized (this) {
            if (!this.f23576g.f8182f) {
                if (this.f23577h.dj().mo2294a(12603367)) {
                    if (this.f23578i.f11439i) {
                        z = this.f23574e;
                    } else {
                        this.f23575f.dc().m13319a(new C2474c(135).m13254g(1500).f13342a, null);
                    }
                }
            }
        }
        return z;
    }

    public final synchronized boolean m21382a(C2323a c2323a, String str, C2332j c2332j) {
        boolean z;
        if (c2323a.f11439i) {
            c2323a.m11892a(str, new bo(this, c2332j));
            z = true;
        } else {
            this.f23575f.dc().m13319a(new C2474c(135).m13254g(1500).f13342a, null);
            z = false;
        }
        return z;
    }

    final synchronized boolean m21384c() {
        return !this.f23572c.isEmpty();
    }

    final synchronized long m21378a(String str) {
        long currentTimeMillis;
        if (this.f23572c.containsKey(str)) {
            currentTimeMillis = System.currentTimeMillis() - ((Long) this.f23572c.get(str)).longValue();
        } else {
            currentTimeMillis = Long.MAX_VALUE;
        }
        return currentTimeMillis;
    }

    final synchronized void m21381a(ArrayList arrayList) {
        this.f23573d = arrayList;
    }

    final synchronized ArrayList m21385d() {
        return this.f23573d;
    }
}
