package com.android.volley;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class C0688e implements C0687p {
    public final Map f4148a = new HashMap();
    public final C0685c f4149b;

    C0688e(C0685c c0685c) {
        this.f4149b = c0685c;
    }

    public final void mo1076a(C0656n c0656n, C0704v c0704v) {
        if (c0704v.f4192b == null || c0704v.f4192b.m4487a()) {
            mo1075a(c0656n);
            return;
        }
        String e = c0656n.mo1546e();
        synchronized (this) {
            List<C0656n> list = (List) this.f4148a.remove(e);
        }
        if (list != null) {
            if (aa.f4124b) {
                aa.m4480a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), e);
            }
            for (C0656n a : list) {
                this.f4149b.f4143e.mo1081a(a, c0704v);
            }
        }
    }

    public final synchronized void mo1075a(C0656n c0656n) {
        String e = c0656n.mo1546e();
        List list = (List) this.f4148a.remove(e);
        if (!(list == null || list.isEmpty())) {
            if (aa.f4124b) {
                aa.m4480a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), e);
            }
            C0656n c0656n2 = (C0656n) list.remove(0);
            this.f4148a.put(e, list);
            c0656n2.m4364a((C0687p) this);
            try {
                this.f4149b.f4141c.put(c0656n2);
            } catch (InterruptedException e2) {
                aa.m4483c("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f4149b.m4489a();
            }
        }
    }

    final synchronized boolean m4494b(C0656n c0656n) {
        boolean z = false;
        synchronized (this) {
            String e = c0656n.mo1546e();
            if (this.f4148a.containsKey(e)) {
                List list = (List) this.f4148a.get(e);
                if (list == null) {
                    list = new ArrayList();
                }
                c0656n.m4366a("waiting-for-response");
                list.add(c0656n);
                this.f4148a.put(e, list);
                if (aa.f4124b) {
                    aa.m4482b("Request for cacheKey=%s is in flight, putting on hold.", e);
                }
                z = true;
            } else {
                this.f4148a.put(e, null);
                c0656n.m4364a((C0687p) this);
                if (aa.f4124b) {
                    aa.m4482b("new request, sending to network %s", e);
                }
            }
        }
        return z;
    }
}
