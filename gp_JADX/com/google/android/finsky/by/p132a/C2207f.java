package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2228f;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public final class C2207f implements C2206c {
    public final C0988c f11035a;
    public final al f11036b;
    public final Handler f11037c;
    public final Handler f11038d;
    public final Map f11039e = new HashMap();
    public List f11040f = null;
    public List f11041g = Collections.unmodifiableList(new ArrayList());
    public List f11042h = Collections.unmodifiableList(new ArrayList());
    public final List f11043i = new ArrayList();
    public final List f11044j = new ArrayList();
    public int f11045k;
    public boolean f11046l = false;

    public C2207f(C0988c c0988c, al alVar, Handler handler, Handler handler2) {
        this.f11035a = c0988c;
        this.f11036b = alVar;
        this.f11038d = handler2;
        this.f11037c = handler;
    }

    public final void mo2814a(C0999d c0999d) {
        synchronized (this.f11044j) {
            if (!this.f11044j.contains(c0999d)) {
                this.f11044j.add(c0999d);
            }
        }
    }

    public final void mo2819b(C0999d c0999d) {
        synchronized (this.f11044j) {
            this.f11044j.remove(c0999d);
        }
    }

    public final synchronized boolean mo2816a() {
        return this.f11046l;
    }

    public final synchronized int mo2817b() {
        return this.f11045k;
    }

    public final void mo2820c() {
        if (Looper.myLooper() == this.f11037c.getLooper() || Looper.myLooper() == this.f11038d.getLooper()) {
            throw new IllegalStateException();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mo2815a(new C2208g(countDownLatch));
        try {
            countDownLatch.await();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final synchronized void mo2815a(Runnable runnable) {
        if (!this.f11046l || this.f11045k != C2207f.m11591a(this.f11035a.cX())) {
            this.f11043i.add(runnable);
            if (this.f11043i.size() <= 1) {
                this.f11040f = this.f11035a.cX();
                int a = C2207f.m11591a(this.f11040f);
                List list = null;
                for (Account account : this.f11039e.keySet()) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    if (!this.f11040f.contains(account)) {
                        list.add(account);
                    }
                }
                if (list != null) {
                    ArrayList arrayList = (ArrayList) list;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        FinskyLog.m21659a("Unloading AccountLibrary for account: %s", FinskyLog.m21655a(((Account) obj).name));
                        this.f11039e.remove(r2);
                    }
                }
                List arrayList2 = new ArrayList();
                for (Account account2 : this.f11040f) {
                    if (!this.f11039e.containsKey(account2)) {
                        arrayList2.add(account2);
                        C2198a c2198a = new C2198a(account2, this.f11037c);
                        c2198a.m11505a(new C2212j(this, c2198a));
                        this.f11039e.put(account2, c2198a);
                    }
                }
                this.f11041g = Collections.unmodifiableList(new ArrayList(this.f11039e.values()));
                this.f11042h = Collections.unmodifiableList(new ArrayList(this.f11039e.values()));
                if (arrayList2.size() == 0) {
                    m11610i();
                    m11612k();
                    this.f11045k = a;
                    this.f11046l = true;
                } else {
                    int[] iArr = new int[]{0};
                    ArrayList arrayList3 = (ArrayList) arrayList2;
                    int size2 = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        int i3 = i2 + 1;
                        Account account3 = (Account) arrayList3.get(i2);
                        new C2217p(this.f11036b, (C2198a) this.f11039e.get(account3), this.f11037c, this.f11038d).m11620a(new C2209h(this, account3, iArr, arrayList2, a));
                        i2 = i3;
                    }
                    this.f11046l = true;
                }
            }
        } else if (runnable != null) {
            this.f11037c.post(runnable);
        }
    }

    public final synchronized void mo2821d() {
        this.f11038d.post(new C2210i(this));
    }

    private static int m11591a(List list) {
        int i = 0;
        for (Account hashCode : list) {
            i = hashCode.hashCode() + i;
        }
        return i;
    }

    final void m11610i() {
        this.f11037c.post(new C2214l(this));
    }

    final List m11611j() {
        List arrayList;
        synchronized (this.f11044j) {
            arrayList = new ArrayList(this.f11044j);
        }
        return arrayList;
    }

    final synchronized void m11612k() {
        for (Runnable runnable : this.f11043i) {
            if (runnable != null) {
                this.f11037c.post(runnable);
            }
        }
        this.f11043i.clear();
    }

    public final synchronized List mo2822e() {
        return this.f11042h;
    }

    public final synchronized List m11613l() {
        return this.f11041g;
    }

    public final synchronized C2197a mo2811a(Account account) {
        return (C2197a) this.f11039e.get(account);
    }

    public final synchronized boolean mo2782a(C2227g c2227g) {
        boolean z;
        int size = this.f11041g.size();
        for (int i = 0; i < size; i++) {
            if (((C2198a) this.f11041g.get(i)).mo2782a(c2227g)) {
                z = true;
                break;
            }
        }
        z = false;
        return z;
    }

    public final synchronized C2227g mo2784b(C2227g c2227g) {
        C2227g b;
        int size = this.f11041g.size();
        for (int i = 0; i < size; i++) {
            b = ((C2198a) this.f11041g.get(i)).mo2784b(c2227g);
            if (b != null) {
                break;
            }
        }
        b = null;
        return b;
    }

    public final synchronized List mo2813a(String str, String[] strArr) {
        List list;
        list = null;
        int size = this.f11040f.size();
        int i = 0;
        while (i < size) {
            List list2;
            Account account = (Account) this.f11040f.get(i);
            C2228f i2 = ((C2198a) this.f11039e.get(account)).m11525i(str);
            if (i2 == null || !i2.m11635a(strArr)) {
                list2 = list;
            } else {
                List arrayList;
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = list;
                }
                arrayList.add(account);
                list2 = arrayList;
            }
            i++;
            list = list2;
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return list;
    }

    public final synchronized List mo2812a(String str) {
        return mo2813a(str, C2228f.f11114a);
    }

    public final synchronized List mo2818b(String str, String[] strArr) {
        List arrayList;
        arrayList = new ArrayList();
        int size = this.f11041g.size();
        for (int i = 0; i < size; i++) {
            C2228f i2 = ((C2198a) this.f11041g.get(i)).m11525i(str);
            if (i2 != null && i2.m11635a(strArr)) {
                arrayList.add(i2);
            }
        }
        return arrayList;
    }

    public final void mo2788c(C2227g c2227g) {
        throw new UnsupportedOperationException();
    }

    public final synchronized int mo2792g() {
        int i;
        i = 0;
        for (int i2 = 0; i2 < this.f11041g.size(); i2++) {
            i += ((C2198a) this.f11041g.get(i2)).mo2792g();
        }
        return i;
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final void mo2823f() {
        Log.d("FinskyLibrary", "| Libraries {");
        for (C2198a c2198a : this.f11039e.values()) {
            String str = "|   ";
            String a = FinskyLog.m21655a(c2198a.f10992f.name);
            Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 27) + String.valueOf(a).length()).append(str).append("AccountLibrary (account=").append(a).append(") {").toString());
            for (String str2 : c2198a.f10987a.keySet()) {
                C2201e c2201e = (C2201e) c2198a.f10987a.get(str2);
                String str3 = "library=";
                String str22 = String.valueOf(str22);
                c2201e.mo2803a(str22.length() != 0 ? str3.concat(str22) : new String(str3), String.valueOf(str).concat("  "));
            }
            Log.d("FinskyLibrary", new StringBuilder((String.valueOf(str).length() + 12) + String.valueOf(a).length()).append(str).append("} (account=").append(a).append(")").toString());
        }
        Log.d("FinskyLibrary", "| }");
    }

    public final long mo2794h() {
        throw new UnsupportedOperationException();
    }
}
