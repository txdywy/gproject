package com.google.android.libraries.performance.primes.p335c;

import android.os.Debug;
import android.util.Log;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.C5989do;
import com.google.android.libraries.performance.primes.p333b.C5961a;
import com.google.android.libraries.performance.primes.p333b.C5962e;
import com.google.android.libraries.performance.primes.p333b.C5966f;
import com.google.android.libraries.performance.primes.p333b.C5970j;
import com.google.android.libraries.performance.primes.p333b.C5971k;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public final class C5979d extends Thread {
    public final ReferenceQueue f29856a;
    public final C5976b f29857b;
    public File f29858c;
    public final C5977a f29859d;
    public final Deque f29860e = new ArrayDeque(20);
    public final C5980e f29861f;
    public final Deque f29862g = new ArrayDeque(3);
    public final C5977a f29863h;

    C5979d(ReferenceQueue referenceQueue, C5980e c5980e, C5976b c5976b) {
        int i = 0;
        setName("Primes-Watcher");
        this.f29856a = referenceQueue;
        this.f29857b = c5976b;
        this.f29861f = c5980e;
        this.f29859d = new C5977a("Sentinel", "Sentinel", referenceQueue);
        this.f29863h = new C5977a("Sentinel", "Sentinel", referenceQueue);
        for (int i2 = 0; i2 < 20; i2++) {
            this.f29860e.add(new Object());
        }
        while (i < 3) {
            this.f29862g.add(new C5977a("Sentinel", "Sentinel", referenceQueue));
            i++;
        }
    }

    public final void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(5000);
                Object poll = this.f29860e.poll();
                this.f29860e.offer(new Object());
                C5977a a = this.f29861f.mo5247a(poll, "", this.f29856a);
                Object obj = null;
                while (obj == null) {
                    Reference reference = null;
                    while (reference == null) {
                        reference = this.f29856a.remove();
                    }
                    Reference reference2 = reference;
                    Object obj2 = obj;
                    while (r0 != null) {
                        if (r0 == a) {
                            boolean z;
                            if (obj2 == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C5916a.m27411b(z, "Only one dummy released at a time.");
                            poll = 1;
                        } else {
                            this.f29857b.mo5242a(m27763a(r0));
                            poll = obj2;
                        }
                        obj2 = poll;
                        reference2 = this.f29856a.poll();
                    }
                    if (obj2 == null) {
                        this.f29857b.mo5244a(false);
                    }
                    obj = obj2;
                }
                m27764a();
            } catch (InterruptedException e) {
                if (this.f29858c != null) {
                    m27765b();
                } else {
                    throw e;
                }
            } catch (InterruptedException e2) {
                interrupt();
                if (this.f29858c != null) {
                    C5979d.interrupted();
                    m27765b();
                }
            }
        }
        synchronized (this.f29859d) {
            this.f29859d.f29852c = null;
        }
        this.f29860e.clear();
        this.f29862g.clear();
    }

    private final void m27764a() {
        C5977a c5977a = (C5977a) this.f29862g.poll();
        boolean z = c5977a.f29852c != null;
        if (Log.isLoggable("LeakWatcherThread", 3)) {
            String str = "LeakWatcherThread";
            String str2 = "Check for leak: %s leak found";
            Object[] objArr = new Object[1];
            objArr[0] = z ? "" : "no";
            C5989do.m27824a(3, str, str2, objArr);
        }
        int i = 0;
        C5977a c5977a2 = this.f29863h.f29852c;
        while (c5977a2 != null) {
            int i2 = i + 1;
            c5977a2 = c5977a2.f29852c;
            i = i2;
        }
        while (c5977a.f29852c != null) {
            c5977a2 = c5977a.f29852c.m27758a();
            this.f29857b.mo5245b(c5977a2.f29850a);
            if (i < 500) {
                c5977a2.m27759a(this.f29863h);
                i++;
            }
        }
        this.f29862g.offer(c5977a);
        synchronized (this.f29859d) {
            if (this.f29859d.f29852c != null) {
                c5977a.f29852c = this.f29859d.f29852c;
                c5977a.f29852c.f29851b = c5977a;
                this.f29859d.f29852c = null;
            }
        }
        this.f29857b.mo5244a(z);
    }

    private final String m27763a(C5977a c5977a) {
        if (c5977a.f29851b == this.f29859d) {
            synchronized (this.f29859d) {
                c5977a.m27758a();
            }
        } else {
            c5977a.m27758a();
        }
        return c5977a.f29850a;
    }

    private final void m27765b() {
        C5916a.m27410b(this.f29858c != null);
        if (this.f29858c.exists()) {
            C5989do.m27824a(3, "LeakWatcherThread", "Abort dumping heap because heapdump file %s exists", this.f29858c.getName());
            this.f29858c = null;
            return;
        }
        C5977a c5977a = new C5977a("Sentinel", "Sentinel", this.f29856a);
        synchronized (this.f29859d) {
            c5977a.m27759a(this.f29859d);
            this.f29859d.f29852c = null;
            c5977a.f29851b = null;
        }
        File file;
        try {
            List emptyList;
            long nanoTime = System.nanoTime();
            Debug.dumpHprofData(this.f29858c.getAbsolutePath());
            if (Log.isLoggable("LeakWatcherThread", 3)) {
                C5989do.m27824a(3, "LeakWatcherThread", "Hprof dumped. File size: %d  MB. Took %d ms.", Long.valueOf(this.f29858c.length() / 1048576), Long.valueOf((System.nanoTime() - nanoTime) / 1000000));
            }
            long nanoTime2 = System.nanoTime();
            C5961a c5961a = new C5961a(this.f29858c);
            String name = C5977a.class.getName();
            C5970j a = C5970j.m27704a(c5961a.f29720c);
            C5971k a2 = C5966f.m27698a(a, C5961a.f29719b, C5961a.f29718a, Collections.singleton(name));
            List<C5962e> list = (List) a2.f29760d.get(name);
            Iterable arrayList = new ArrayList();
            if (list != null) {
                for (C5962e a3 : list) {
                    C5962e a32 = (C5962e) a2.f29758b.m27663a(a32.m27677a(a, "referent"));
                    if (a32 != null) {
                        arrayList.add(a32);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                emptyList = Collections.emptyList();
            } else {
                C5961a.m27673a(a, a2);
                emptyList = C5961a.m27671a(a, arrayList);
            }
            if (!emptyList.isEmpty()) {
                this.f29857b.mo5243a(emptyList);
            }
            for (C5977a a4 : this.f29862g) {
                a4.m27758a();
            }
            this.f29863h.m27758a();
            if (Log.isLoggable("LeakWatcherThread", 3)) {
                C5989do.m27824a(3, "LeakWatcherThread", "Found " + emptyList.size() + " leak(s). The analysis took " + ((System.nanoTime() - nanoTime2) / 1000000) + " ms.", new Object[0]);
            }
            file = this.f29858c;
            this.f29858c = null;
            file.delete();
        } catch (Throwable th) {
            File file2 = this.f29858c;
            this.f29858c = null;
            file2.delete();
        }
    }
}
