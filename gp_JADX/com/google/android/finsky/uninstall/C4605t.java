package com.google.android.finsky.uninstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class C4605t implements bp, bq {
    public boolean f23656a = false;
    public boolean f23657b = false;
    public boolean f23658c = false;
    public boolean f23659d = false;
    public boolean f23660e = false;
    public long f23661f;
    public long f23662g;
    public long f23663h;
    public ArrayList f23664i = new ArrayList();
    public List f23665j = null;
    public Map f23666k = null;
    public br f23667l;
    public HashSet f23668m = new HashSet();
    public final Handler f23669n;
    public Context f23670o;
    public C2323a f23671p;
    public C2495w f23672q;
    public boolean f23673r = false;
    public boolean f23674s = false;
    public final Runnable f23675t = new C4606u(this);

    C4605t(C2495w c2495w, ArrayList arrayList, Context context) {
        this.f23670o = context;
        this.f23671p = C1473m.f7980a.by();
        this.f23669n = new Handler(Looper.getMainLooper());
        this.f23672q = c2495w;
        if (arrayList.size() == 0) {
            this.f23673r = true;
        } else if (arrayList.size() == 1) {
            C2335k c2719i = new C2719i(C1473m.f7980a.ap(), C1289l.m7694a((String) arrayList.get(0)));
            c2719i.m11918a(new C4635x(this, c2719i));
            c2719i.m11917a(new C4636y(this));
        } else {
            C2335k c2718h = new C2718h(C1473m.f7980a.ap(), C1283d.m7689a(arrayList), false);
            c2718h.m11918a(new C4633v(this, c2718h));
            c2718h.m11917a(new C4634w(this));
        }
    }

    public final long mo4267a() {
        return this.f23662g;
    }

    public final long mo4271b() {
        return this.f23663h;
    }

    public final List mo4273c() {
        return this.f23665j;
    }

    public final ArrayList mo4274e() {
        return this.f23664i;
    }

    public final void mo4270a(br brVar) {
        this.f23667l = brVar;
    }

    public final void mo4269a(C1031w c1031w) {
        if (!this.f23668m.contains(c1031w)) {
            this.f23668m.add(c1031w);
        }
    }

    public final void mo4272b(C1031w c1031w) {
        this.f23668m.remove(c1031w);
    }

    private final void m21412i() {
        for (C1031w m_ : (C1031w[]) this.f23668m.toArray(new C1031w[this.f23668m.size()])) {
            m_.m_();
        }
    }

    final void m21414a(VolleyError volleyError) {
        this.f23674s = false;
        if (this.f23667l != null) {
            this.f23667l.a_(volleyError);
        }
    }

    final void m21424f() {
        Object obj = (this.f23659d && this.f23658c && this.f23657b && this.f23656a && this.f23660e) ? 1 : null;
        if (obj != null) {
            this.f23665j = new ArrayList(this.f23666k.values());
            m21412i();
        }
    }

    public final void mo4275g() {
        if (!this.f23664i.isEmpty() || this.f23673r) {
            this.f23658c = false;
            this.f23659d = false;
            this.f23657b = false;
            if (this.f23666k != null) {
                this.f23666k.clear();
            }
            if (!this.f23656a) {
                bb.m21792a(new ac(this), new Void[0]);
            }
            new ad(this).execute(new Void[0]);
            bb.m21792a(new ab(this), new Void[0]);
            bl.m21377a().f23571a = this;
            bl.m21377a().m21380a(this.f23670o);
            return;
        }
        this.f23674s = true;
    }

    public final void mo4284d() {
        this.f23660e = true;
        bl.m21377a().f23571a = null;
        m21424f();
    }

    final void m21418a(Set set) {
        PackageManager packageManager = this.f23670o.getPackageManager();
        for (String str : set) {
            try {
                ((C4604s) this.f23666k.get(str)).f23654b = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            } catch (NameNotFoundException e) {
                FinskyLog.m21667d("%s not found in PackageManager", str);
                this.f23666k.remove(str);
            }
        }
        this.f23658c = true;
        m21424f();
    }

    final void m21417a(Iterator it, C2332j c2332j) {
        if (!it.hasNext()) {
            this.f23669n.post(this.f23675t);
        } else if (!bl.m21377a().m21382a(this.f23671p, (String) it.next(), c2332j)) {
            m21426h();
        }
    }

    final void m21426h() {
        this.f23669n.post(new C4637z(this));
    }
}
