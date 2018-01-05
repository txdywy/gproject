package android.support.v4.p037h;

import java.util.LinkedHashMap;
import java.util.Locale;

public class C0314i {
    public final LinkedHashMap f1743a;
    public int f1744b;
    public int f1745c;
    public int f1746d;
    public int f1747e;
    public int f1748f;
    public int f1749g;

    public C0314i(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1745c = i;
        this.f1743a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object m1692a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f1743a.get(obj);
            if (obj2 != null) {
                this.f1748f++;
                return obj2;
            }
            this.f1749g++;
            return null;
        }
    }

    public final Object m1693a(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        Object put;
        synchronized (this) {
            this.f1746d++;
            this.f1744b += m1691c(obj, obj2);
            put = this.f1743a.put(obj, obj2);
            if (put != null) {
                this.f1744b -= m1691c(obj, put);
            }
        }
        if (put != null) {
            mo965a(false, obj, put, obj2);
        }
        m1694a(this.f1745c);
        return put;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1694a(int r5) {
        /*
        r4 = this;
    L_0x0000:
        monitor-enter(r4);
        r0 = r4.f1744b;	 Catch:{ all -> 0x0032 }
        if (r0 < 0) goto L_0x0011;
    L_0x0005:
        r0 = r4.f1743a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x000d:
        r0 = r4.f1744b;	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0035;
    L_0x0011:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0032 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = r4.getClass();	 Catch:{ all -> 0x0032 }
        r2 = r2.getName();	 Catch:{ all -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r2 = ".sizeOf() is reporting inconsistent results!";
        r1 = r1.append(r2);	 Catch:{ all -> 0x0032 }
        r1 = r1.toString();	 Catch:{ all -> 0x0032 }
        r0.<init>(r1);	 Catch:{ all -> 0x0032 }
        throw r0;	 Catch:{ all -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        throw r0;
    L_0x0035:
        r0 = r4.f1744b;	 Catch:{ all -> 0x0032 }
        if (r0 <= r5) goto L_0x0041;
    L_0x0039:
        r0 = r4.f1743a;	 Catch:{ all -> 0x0032 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0032 }
        if (r0 == 0) goto L_0x0043;
    L_0x0041:
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        return;
    L_0x0043:
        r0 = r4.f1743a;	 Catch:{ all -> 0x0032 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0032 }
        r0 = r0.iterator();	 Catch:{ all -> 0x0032 }
        r0 = r0.next();	 Catch:{ all -> 0x0032 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0032 }
        r1 = r0.getKey();	 Catch:{ all -> 0x0032 }
        r0 = r0.getValue();	 Catch:{ all -> 0x0032 }
        r2 = r4.f1743a;	 Catch:{ all -> 0x0032 }
        r2.remove(r1);	 Catch:{ all -> 0x0032 }
        r2 = r4.f1744b;	 Catch:{ all -> 0x0032 }
        r3 = r4.m1691c(r1, r0);	 Catch:{ all -> 0x0032 }
        r2 = r2 - r3;
        r4.f1744b = r2;	 Catch:{ all -> 0x0032 }
        r2 = r4.f1747e;	 Catch:{ all -> 0x0032 }
        r2 = r2 + 1;
        r4.f1747e = r2;	 Catch:{ all -> 0x0032 }
        monitor-exit(r4);	 Catch:{ all -> 0x0032 }
        r2 = 1;
        r3 = 0;
        r4.mo965a(r2, r1, r0, r3);
        goto L_0x0000;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.h.i.a(int):void");
    }

    public final Object m1697b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        Object remove;
        synchronized (this) {
            remove = this.f1743a.remove(obj);
            if (remove != null) {
                this.f1744b -= m1691c(obj, remove);
            }
        }
        if (remove != null) {
            mo965a(false, obj, remove, null);
        }
        return remove;
    }

    public void mo965a(boolean z, Object obj, Object obj2, Object obj3) {
    }

    private final int m1691c(Object obj, Object obj2) {
        int b = mo1107b(obj, obj2);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    public int mo1107b(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f1748f + this.f1749g;
            if (i2 != 0) {
                i = (this.f1748f * 100) / i2;
            }
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f1745c), Integer.valueOf(this.f1748f), Integer.valueOf(this.f1749g), Integer.valueOf(i)});
        }
        return format;
    }
}
