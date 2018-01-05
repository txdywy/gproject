package com.google.android.finsky.uninstall;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.co.C2323a;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C4597k implements bp {
    public boolean f23625a = false;
    public boolean f23626b = false;
    public boolean f23627c = false;
    public boolean f23628d = false;
    public boolean f23629e = false;
    public long f23630f;
    public long f23631g;
    public long f23632h;
    public final Document f23633i;
    public List f23634j = null;
    public Map f23635k = null;
    public C4587q f23636l;
    public C1031w f23637m;
    public final Handler f23638n;
    public Context f23639o;
    public C2323a f23640p;
    public final Runnable f23641q = new C4598l(this);

    public C4597k(Document document) {
        this.f23633i = document;
        this.f23638n = new Handler(Looper.getMainLooper());
        this.f23640p = C1473m.f7980a.by();
    }

    public final boolean m21406a() {
        return this.f23628d && this.f23627c && this.f23626b && this.f23625a && this.f23629e;
    }

    final void m21407b() {
        if (m21406a()) {
            this.f23634j = new ArrayList(this.f23635k.values());
            if (this.f23637m != null) {
                this.f23637m.m_();
            }
        }
    }

    final void m21405a(Set set) {
        PackageManager packageManager = this.f23639o.getPackageManager();
        for (String str : set) {
            try {
                ((C4604s) this.f23635k.get(str)).f23654b = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            } catch (NameNotFoundException e) {
                FinskyLog.m21667d("%s not found in PackageManager", str);
                this.f23635k.remove(str);
            }
        }
        this.f23627c = true;
        m21407b();
    }

    final void m21404a(Iterator it, C2332j c2332j) {
        if (!it.hasNext()) {
            this.f23638n.post(this.f23641q);
        } else if (!bl.m21377a().m21382a(this.f23640p, (String) it.next(), c2332j)) {
            m21408c();
        }
    }

    final void m21408c() {
        this.f23638n.post(new C4599m(this));
    }

    public final void mo4284d() {
        this.f23629e = true;
        bl.m21377a().f23571a = null;
        m21407b();
    }
}
