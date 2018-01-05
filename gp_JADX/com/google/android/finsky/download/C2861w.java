package com.google.android.finsky.download;

import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.packagemanager.C2860b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.Iterator;
import java.util.LinkedList;

final class C2861w implements C2860b {
    public final /* synthetic */ C2851n f15312a;

    C2861w(C2851n c2851n) {
        this.f15312a = c2851n;
    }

    public final void mo3184a(boolean z) {
        if (!z) {
            FinskyLog.m21665c("Could not free required amount of space for download", new Object[0]);
        }
        C2851n c2851n = this.f15312a;
        bb.m21791a();
        if (c2851n.f15293b.isEmpty()) {
            C2839b c2839b;
            LinkedList linkedList = new LinkedList();
            for (String str : c2851n.f15292a.keySet()) {
                c2839b = (C2839b) c2851n.f15292a.get(str);
                linkedList.add(str);
                if (c2839b.mo3166p() == 1) {
                    long f = c2839b.mo3156f();
                    long d = C2830g.m14970d();
                    long b = C2830g.m14967b();
                    if (c2839b.mo3157g() == null) {
                        if (d >= f) {
                            break;
                        }
                        c2839b.mo3152b(198);
                        c2851n.mo3174a(c2839b, 5);
                    } else if (b >= f) {
                        break;
                    } else {
                        c2839b.mo3152b(198);
                        c2851n.mo3174a(c2839b, 5);
                    }
                }
            }
            c2839b = null;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                c2851n.f15292a.remove((String) it.next());
            }
            if (c2839b != null) {
                FinskyLog.m21659a("Download %s starting", c2839b);
                c2851n.f15293b.put(c2839b.mo3153c(), c2839b);
                new C2859u(c2851n, c2839b).execute(new Void[0]);
            }
            if (c2851n.f15293b.size() == 0 && c2851n.f15297f != null) {
                C2846i c2846i = c2851n.f15297f;
                c2846i.f15282b.post(new C2848k(c2846i));
                c2851n.f15297f = null;
            }
        }
    }
}
