package com.google.android.finsky.wear;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5619g;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5652n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class C4794o extends AsyncTask {
    public List f25016a = new ArrayList();
    public List f25017b = new ArrayList();
    public final /* synthetic */ Runnable f25018c;
    public final /* synthetic */ C4790k f25019d;

    C4794o(C4790k c4790k, Runnable runnable) {
        this.f25019d = c4790k;
        this.f25018c = runnable;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List list = this.f25016a;
        List list2 = this.f25017b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4795p c4795p = (C4795p) it.next();
            if (TextUtils.isEmpty(c4795p.f25021b) || TextUtils.isEmpty(c4795p.f25022c) || TextUtils.isEmpty(c4795p.f25023d) || (!c4795p.f25026g && (TextUtils.isEmpty(c4795p.f25024e) || c4795p.f25027h == null))) {
                FinskyLog.m21665c("Discarding malformed %s", c4795p.f25020a);
                c4795p.m22561a(list2);
                it.remove();
            }
        }
        C4790k c4790k = this.f25019d;
        List list3 = this.f25016a;
        for (String str : c4790k.f25003f.m22521a()) {
            C3646a a = c4790k.f24998a.m22484a(str);
            for (C2129c c2129c : a.f18022b.mo2658a()) {
                if (c2129c.f10813g == 90) {
                    C4795p c4795p2;
                    C3647b a2 = a.m17243a(c2129c.f10807a);
                    String str2 = c2129c.f10807a;
                    String str3 = c2129c.f10829w;
                    int size = list3.size();
                    for (int i = 0; i < size; i++) {
                        c4795p2 = (C4795p) list3.get(i);
                        if (str.equals(c4795p2.f25021b) && str2.equals(c4795p2.f25022c) && str3.equals(c4795p2.f25023d)) {
                            break;
                        }
                    }
                    c4795p2 = null;
                    if (c4795p2 != null) {
                        c4795p2.f25031l = a2;
                    } else {
                        c4790k.m22549a(str, a2, 990, null, null);
                        c4790k.m22547a(a2);
                    }
                }
            }
        }
        int size2 = this.f25016a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C4795p c4795p3 = (C4795p) this.f25016a.get(i2);
            if (c4795p3.f25026g) {
                FinskyLog.m21659a("Uninstalled package %s node %s with status %d", c4795p3.f25022c, c4795p3.f25021b, Integer.valueOf(c4795p3.f25029j));
                C4789j a3 = new C4789j(114, this.f25019d.f25003f).m22537b(c4795p3.f25022c).m22533a(c4795p3.f25029j);
                a3.f24996b = c4795p3.f25021b;
                C1473m.f7980a.dc().m13319a(a3.m22535a(c4795p3.f25023d).m22536a(), null);
                c4795p3.m22561a(this.f25017b);
            } else if (c4795p3.f25031l == null) {
                c4795p3.m22561a(this.f25017b);
            } else if (c4795p3.f25028i == null || c4795p3.f25029j == -601) {
                FinskyLog.m21659a("Retain pending install for %s (%s)", c4795p3.f25022c, c4795p3.f25021b);
            } else if (c4795p3.f25029j == 0) {
                this.f25019d.m22549a(c4795p3.f25021b, c4795p3.f25031l, 0, null, c4795p3.f25023d);
                this.f25019d.m22547a(c4795p3.f25031l);
                c4795p3.m22561a(this.f25017b);
            } else {
                this.f25019d.m22549a(c4795p3.f25021b, c4795p3.f25031l, c4795p3.f25029j, c4795p3.f25030k, c4795p3.f25023d);
                this.f25019d.m22547a(c4795p3.f25031l);
                c4795p3.m22561a(this.f25017b);
            }
        }
        int size3 = this.f25017b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            FinskyLog.m21659a("Deleting stale URI %s", (Uri) this.f25017b.get(i3));
            C5652n.f28708a.mo5119c(this.f25019d.f25002e, r0);
        }
        this.f25018c.run();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        int i;
        Object obj;
        C4795p.m22560a(this.f25019d.f25002e, this.f25016a, false);
        if (((Boolean) C0955b.ex.m28964b()).booleanValue()) {
            C4795p.m22560a(this.f25019d.f25002e, this.f25016a, true);
        }
        C5058o c5058o = this.f25019d.f25002e;
        List list = this.f25016a;
        List list2 = this.f25017b;
        C5619g c5619g = (C5619g) C5652n.f28708a.mo5116a(c5058o, cl.f24960d, 1).mo4487a();
        if (c5619g.f28574d.m23271a()) {
            int c = c5619g.mo4501c();
            for (i = 0; i < c; i++) {
                Uri b = ((C5617e) c5619g.mo4502a(i)).mo5123b();
                List pathSegments = b.getPathSegments();
                if (pathSegments.size() >= 3) {
                    String str = (String) pathSegments.get(2);
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C4795p c4795p = (C4795p) list.get(i2);
                        if (!c4795p.f25026g && str.equals(c4795p.f25024e)) {
                            c4795p.f25027h = b;
                            obj = 1;
                            break;
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    list2.add(b);
                }
            }
        } else {
            FinskyLog.m21665c("Error %d getting assets. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
        c5619g.mo4500a();
        c5058o = this.f25019d.f25002e;
        list2 = this.f25016a;
        List list3 = this.f25017b;
        c5619g = (C5619g) C5652n.f28708a.mo5116a(c5058o, cl.f24963g, 1).mo4487a();
        if (c5619g.f28574d.m23271a()) {
            int c2 = c5619g.mo4501c();
            for (int i3 = 0; i3 < c2; i3++) {
                C5617e c5617e = (C5617e) c5619g.mo4502a(i3);
                Uri b2 = c5617e.mo5123b();
                List pathSegments2 = b2.getPathSegments();
                if (pathSegments2.size() >= 2) {
                    String host = b2.getHost();
                    String str2 = (String) pathSegments2.get(1);
                    int size2 = list2.size();
                    for (i = 0; i < size2; i++) {
                        C4795p c4795p2 = (C4795p) list2.get(i);
                        if (str2.equals(c4795p2.f25023d)) {
                            C5620h a = C5620h.m26634a(c5617e.mo5124c());
                            int d = a.m26658d("status");
                            String f = a.m26660f("statusDesc");
                            if (d != -604 || host.equals(c4795p2.f25021b)) {
                                c4795p2.f25028i = b2;
                                c4795p2.f25029j = d;
                                c4795p2.f25030k = f;
                                obj = 1;
                                break;
                            }
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    list3.add(b2);
                }
            }
        } else {
            FinskyLog.m21665c("Error %d getting responses. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
        c5619g.mo4500a();
        return null;
    }
}
