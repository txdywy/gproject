package com.google.android.gms.clearcut;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.Lock;

public class C5020h {
    public final String f25570a;
    public int f25571b;
    public int f25572c;
    public Map f25573d;
    public final Object f25574e;
    public /* synthetic */ C5019g f25575f;

    protected C5020h(C5019g c5019g, C5020h c5020h) {
        this(c5019g, c5020h.f25570a);
        synchronized (c5020h.f25574e) {
            this.f25571b = c5020h.f25571b;
            Map map = this.f25573d;
            this.f25573d = c5020h.f25573d;
            c5020h.f25573d = map;
            c5020h.f25571b = 0;
        }
    }

    protected C5020h(C5019g c5019g, String str) {
        this.f25575f = c5019g;
        this.f25572c = this.f25575f.f25558c;
        this.f25573d = new HashMap();
        this.f25574e = new Object();
        if (c5019g.f25565j.containsKey(str)) {
            String str2 = "counter/histogram already exists: ";
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        c5019g.f25565j.put(str, this);
        this.f25570a = str;
    }

    final boolean m23213a(long j) {
        Lock writeLock = this.f25575f.f25564i.writeLock();
        writeLock.lock();
        try {
            this.f25575f.f25567l = C5019g.m23202a(this.f25575f, this.f25575f.f25566k);
            this.f25575f.f25564i.readLock().lock();
            writeLock.unlock();
            writeLock = this.f25575f.f25564i.readLock();
            boolean b = m23214b(j);
            return b;
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final boolean m23214b(long r12) {
        /*
        r11 = this;
        r2 = 1;
        r1 = 0;
        r4 = r11.f25574e;
        monitor-enter(r4);
        r0 = r11.f25573d;	 Catch:{ all -> 0x0062 }
        r3 = r11.f25575f;	 Catch:{ all -> 0x0062 }
        r3 = r3.f25567l;	 Catch:{ all -> 0x0062 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0062 }
        r0 = (java.util.Map) r0;	 Catch:{ all -> 0x0062 }
        if (r0 != 0) goto L_0x00a1;
    L_0x0015:
        r0 = new java.util.HashMap;	 Catch:{ all -> 0x0062 }
        r0.<init>();	 Catch:{ all -> 0x0062 }
        r3 = r11.f25573d;	 Catch:{ all -> 0x0062 }
        r5 = r11.f25575f;	 Catch:{ all -> 0x0062 }
        r5 = r5.f25567l;	 Catch:{ all -> 0x0062 }
        r3.put(r5, r0);	 Catch:{ all -> 0x0062 }
        r3 = r0;
    L_0x0026:
        r0 = r11.f25571b;	 Catch:{ all -> 0x0062 }
        r5 = r11.f25575f;	 Catch:{ all -> 0x0062 }
        r5 = r5.f25558c;	 Catch:{ all -> 0x0062 }
        if (r0 < r5) goto L_0x0065;
    L_0x0030:
        r0 = r11.f25575f;	 Catch:{ all -> 0x0062 }
        r0 = r0.f25560e;	 Catch:{ all -> 0x0062 }
        if (r0 != 0) goto L_0x0065;
    L_0x0038:
        r0 = r11.f25571b;	 Catch:{ all -> 0x0062 }
        r2 = r11.f25575f;	 Catch:{ all -> 0x0062 }
        r2 = r2.f25558c;	 Catch:{ all -> 0x0062 }
        if (r0 != r2) goto L_0x0059;
    L_0x0042:
        r2 = "Counters";
        r3 = "exceeded sample count in ";
        r0 = r11.f25570a;	 Catch:{ all -> 0x0062 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0062 }
        r5 = r0.length();	 Catch:{ all -> 0x0062 }
        if (r5 == 0) goto L_0x005c;
    L_0x0052:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x0062 }
    L_0x0056:
        android.util.Log.i(r2, r0);	 Catch:{ all -> 0x0062 }
    L_0x0059:
        monitor-exit(r4);	 Catch:{ all -> 0x0062 }
        r0 = r1;
    L_0x005b:
        return r0;
    L_0x005c:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0062 }
        r0.<init>(r3);	 Catch:{ all -> 0x0062 }
        goto L_0x0056;
    L_0x0062:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0062 }
        throw r0;
    L_0x0065:
        r0 = r11.f25571b;	 Catch:{ all -> 0x0062 }
        r0 = r0 + 1;
        r11.f25571b = r0;	 Catch:{ all -> 0x0062 }
        r0 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0062 }
        r0 = r3.get(r0);	 Catch:{ all -> 0x0062 }
        r0 = (long[]) r0;	 Catch:{ all -> 0x0062 }
        if (r0 != 0) goto L_0x0086;
    L_0x0077:
        r0 = 1;
        r0 = new long[r0];	 Catch:{ all -> 0x0062 }
        r5 = 0;
        r6 = 0;
        r0[r5] = r6;	 Catch:{ all -> 0x0062 }
        r5 = java.lang.Long.valueOf(r12);	 Catch:{ all -> 0x0062 }
        r3.put(r5, r0);	 Catch:{ all -> 0x0062 }
    L_0x0086:
        r3 = 0;
        r6 = r0[r3];	 Catch:{ all -> 0x0062 }
        r8 = 1;
        r6 = r6 + r8;
        r0[r3] = r6;	 Catch:{ all -> 0x0062 }
        r0 = r11.f25575f;	 Catch:{ all -> 0x0062 }
        r0 = r0.f25560e;	 Catch:{ all -> 0x0062 }
        if (r0 == 0) goto L_0x009f;
    L_0x0096:
        r0 = r11.f25571b;	 Catch:{ all -> 0x0062 }
        r3 = r11.f25572c;	 Catch:{ all -> 0x0062 }
        if (r0 < r3) goto L_0x009f;
    L_0x009c:
        r0 = r2;
    L_0x009d:
        monitor-exit(r4);	 Catch:{ all -> 0x0062 }
        goto L_0x005b;
    L_0x009f:
        r0 = r1;
        goto L_0x009d;
    L_0x00a1:
        r3 = r0;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.h.b(long):boolean");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AbstractCounter");
        stringBuilder.append("(");
        stringBuilder.append(this.f25570a);
        stringBuilder.append(")[");
        synchronized (this.f25574e) {
            for (Entry entry : this.f25573d.entrySet()) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" -> [");
                for (Entry entry2 : ((Map) entry2.getValue()).entrySet()) {
                    stringBuilder.append(entry2.getKey());
                    stringBuilder.append(" = ");
                    stringBuilder.append(((long[]) entry2.getValue())[0]);
                    stringBuilder.append(", ");
                }
                stringBuilder.append("], ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
