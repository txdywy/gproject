package com.google.android.libraries.performance.primes;

import android.content.IntentFilter;
import android.os.SystemClock;
import com.google.android.libraries.performance.primes.p335c.C5976b;
import d.a.a.a.a.a.ai;
import d.a.a.a.a.a.ap;
import d.a.a.a.a.a.bp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class bg implements C5976b {
    public final Map f29784a = new HashMap();
    public final /* synthetic */ be f29785b;

    bg(be beVar) {
        this.f29785b = beVar;
    }

    public final void mo5242a(String str) {
        bf bfVar = (bf) this.f29784a.get(str);
        if (bfVar == null) {
            bfVar = new bf();
            this.f29784a.put(str, bfVar);
        }
        r0.f29782a++;
    }

    public final void mo5245b(String str) {
        bf bfVar = (bf) this.f29784a.get(str);
        if (bfVar == null) {
            bfVar = new bf();
            this.f29784a.put(str, bfVar);
        }
        r0.f29783b++;
    }

    public final void mo5244a(boolean z) {
        List arrayList = new ArrayList();
        for (Entry entry : this.f29784a.entrySet()) {
            String str = (String) entry.getKey();
            bf bfVar = (bf) entry.getValue();
            if (bfVar.f29783b > 0 || bfVar.f29782a > 0) {
                ap apVar = new ap();
                apVar.b = str;
                apVar.d = Integer.valueOf(bfVar.f29783b);
                apVar.c = Integer.valueOf(bfVar.f29782a);
                arrayList.add(apVar);
                bfVar.f29783b = 0;
                bfVar.f29782a = 0;
            }
        }
        if (!arrayList.isEmpty()) {
            bp bpVar = new bp();
            bpVar.m = new ai();
            bpVar.m.a = (ap[]) arrayList.toArray(new ap[arrayList.size()]);
            if (this.f29785b.m27580a()) {
                this.f29785b.m27577a(bpVar);
            }
        }
        if (z) {
            boolean z2;
            if (this.f29785b.f29778j && !this.f29785b.f29615d && (this.f29785b.f29777i || this.f29785b.f29776h)) {
                long j = this.f29785b.f29779k.get();
                z2 = j == 0 || j + 43200000 <= SystemClock.elapsedRealtime();
            } else {
                z2 = false;
            }
            if (z2 && this.f29785b.f29780l.compareAndSet(false, true)) {
                C5989do.m27824a(3, "MemoryLeakService", "Scheduling heap dump %d seconds after the next screen off.", Integer.valueOf(5));
                IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                this.f29785b.f29772b.registerReceiver(new bh(this.f29785b), intentFilter);
            }
        }
    }

    public final void mo5243a(List list) {
        List arrayList = new ArrayList();
        for (String str : list) {
            ap apVar = new ap();
            int indexOf = str.indexOf(10);
            apVar.b = indexOf < 0 ? str : str.substring(0, indexOf);
            apVar.e = str;
            apVar.d = Integer.valueOf(1);
            arrayList.add(apVar);
        }
        if (!arrayList.isEmpty()) {
            bp bpVar = new bp();
            bpVar.m = new ai();
            bpVar.m.a = (ap[]) arrayList.toArray(new ap[arrayList.size()]);
            if (this.f29785b.m27580a()) {
                this.f29785b.m27577a(bpVar);
            }
        }
        if (!list.isEmpty()) {
            C5989do.m27824a(2, "MemoryLeakService", "Primes found %d leak(s): %s", Integer.valueOf(list.size()), list);
        }
    }
}
