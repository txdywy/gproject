package com.google.android.finsky.uninstall.v2a;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.co.C2323a;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class C4613f implements aj, ak {
    public boolean f23758a = false;
    public boolean f23759b = false;
    public boolean f23760c = false;
    public boolean f23761d = false;
    public boolean f23762e = false;
    public long f23763f;
    public long f23764g;
    public long f23765h;
    public ArrayList f23766i = new ArrayList();
    public List f23767j = null;
    public Map f23768k = null;
    public al f23769l;
    public HashSet f23770m = new HashSet();
    public final Handler f23771n;
    public Context f23772o;
    public C2323a f23773p;
    public C2495w f23774q;
    public boolean f23775r = false;
    public boolean f23776s = false;
    public final Runnable f23777t = new C4614g(this);

    C4613f(C2495w c2495w, List list, Context context) {
        this.f23772o = context;
        this.f23773p = C1473m.f7980a.by();
        this.f23771n = new Handler(Looper.getMainLooper());
        this.f23774q = c2495w;
        if (list.size() == 0) {
            this.f23775r = true;
        } else if (list.size() == 1) {
            C2335k c2719i = new C2719i(C1473m.f7980a.ap(), C1289l.m7694a((String) list.get(0)));
            c2719i.m11918a(new C4617j(this, c2719i));
            c2719i.m11917a(new C4618k(this));
        } else {
            C2335k c2718h = new C2718h(C1473m.f7980a.ap(), C1283d.m7689a(list), false);
            c2718h.m11918a(new C4615h(this, c2718h));
            c2718h.m11917a(new C4616i(this));
        }
    }

    public final long mo4299a() {
        return this.f23764g;
    }

    public final long mo4302b() {
        return this.f23765h;
    }

    public final List mo4304c() {
        return this.f23767j;
    }

    public final ArrayList mo4305d() {
        return this.f23766i;
    }

    public final boolean mo4306e() {
        return this.f23761d && this.f23760c && this.f23759b && this.f23758a && this.f23762e;
    }

    public final void mo4301a(al alVar) {
        this.f23769l = alVar;
    }

    public final void mo4300a(C1031w c1031w) {
        if (!this.f23770m.contains(c1031w)) {
            this.f23770m.add(c1031w);
        }
    }

    public final void mo4303b(C1031w c1031w) {
        this.f23770m.remove(c1031w);
    }

    private final void m21535j() {
        for (C1031w m_ : (C1031w[]) this.f23770m.toArray(new C1031w[this.f23770m.size()])) {
            m_.m_();
        }
    }

    final void m21537a(VolleyError volleyError) {
        this.f23776s = false;
        if (this.f23769l != null) {
            this.f23769l.mo4310a(volleyError);
        }
    }

    final void m21548g() {
        if (mo4306e()) {
            this.f23767j = new ArrayList(this.f23768k.values());
            m21535j();
        }
    }

    public final void mo4307f() {
        if (!this.f23766i.isEmpty() || this.f23775r) {
            this.f23760c = false;
            this.f23761d = false;
            this.f23759b = false;
            if (this.f23768k != null) {
                this.f23768k.clear();
            }
            if (!this.f23758a) {
                bb.m21792a(new C4622o(this), new Void[0]);
            }
            new C4623p(this).execute(new Void[0]);
            bb.m21792a(new C4621n(this), new Void[0]);
            af.m21457a().f23719a = this;
            af a = af.m21457a();
            Context context = this.f23772o;
            if (VERSION.SDK_INT < 21) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                try {
                    Method declaredMethod = activityManager.getClass().getDeclaredMethod("getAllPackageUsageStats", new Class[0]);
                    if (context.getPackageManager().checkPermission("android.permission.PACKAGE_USAGE_STATS", context.getPackageName()) == 0) {
                        bb.m21792a(new ah(a, declaredMethod, activityManager), new Void[0]);
                        return;
                    }
                    a.m21459a(1507);
                    if (a.f23719a != null) {
                        a.f23719a.mo4308h();
                        return;
                    }
                    return;
                } catch (NoSuchMethodException e) {
                    FinskyLog.m21662b("Unable to get package usage stats method", new Object[0]);
                    a.m21459a(1508);
                    return;
                }
            }
            String str = "android:get_usage_stats";
            int checkOpNoThrow = ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow(str, Process.myUid(), context.getPackageName());
            if (checkOpNoThrow == 0 || (((Boolean) C0955b.gH.m28964b()).booleanValue() && checkOpNoThrow == 3)) {
                bb.m21792a(new ag(a, context), new Void[0]);
                return;
            }
            a.m21459a(1506);
            if (a.f23719a != null) {
                a.f23719a.mo4308h();
                return;
            }
            return;
        }
        this.f23776s = true;
    }

    public final void mo4308h() {
        this.f23762e = true;
        af.m21457a().f23719a = null;
        m21548g();
    }

    final void m21540a(HashSet hashSet) {
        PackageManager packageManager = this.f23772o.getPackageManager();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                ((am) this.f23768k.get(str)).f23735b = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            } catch (NameNotFoundException e) {
                FinskyLog.m21667d("%s not found in PackageManager", str);
                this.f23768k.remove(str);
            }
        }
        this.f23760c = true;
        m21548g();
    }

    final void m21541a(Iterator it, C2332j c2332j) {
        if (!it.hasNext()) {
            this.f23771n.post(this.f23777t);
        } else if (!af.m21457a().m21461a(this.f23773p, (String) it.next(), c2332j)) {
            m21550i();
        }
    }

    final void m21550i() {
        this.f23771n.post(new C4619l(this));
    }
}
