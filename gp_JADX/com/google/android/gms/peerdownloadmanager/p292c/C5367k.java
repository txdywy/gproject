package com.google.android.gms.peerdownloadmanager.p292c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.C5371a;
import com.google.android.gms.peerdownloadmanager.common.C5380k;
import com.google.android.gms.peerdownloadmanager.common.C5382m;
import com.google.android.gms.peerdownloadmanager.common.C5383n;
import com.google.android.gms.peerdownloadmanager.common.C5384o;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5366t;
import com.google.android.gms.peerdownloadmanager.p293d.C5481a;
import com.google.android.gms.peerdownloadmanager.p303g.C5496b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

final class C5367k implements C5366t {
    public static long f27906a = 5000;
    public final Context f27907b;
    public final C5496b f27908c;
    public final Map f27909d = new HashMap();
    public final Map f27910e = new HashMap();
    public boolean f27911f = true;

    C5367k(Context context, C5496b c5496b) {
        this.f27907b = context;
        this.f27908c = c5496b;
    }

    private static boolean m26113a(String str, String str2) {
        String str3;
        try {
            str3 = "standalone";
            if (str3.equals(str2)) {
                return true;
            }
            Log.w("ResourceManagerImpl", new StringBuilder(((String.valueOf(str).length() + 41) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("certificate mismatch: ").append(str).append(" expected: ").append(str2).append("actual: ").append(str3).toString());
            return false;
        } catch (NameNotFoundException e) {
            String str4 = "ResourceManagerImpl";
            String str5 = "not installed: ";
            str3 = String.valueOf(str);
            Log.d(str4, str3.length() != 0 ? str5.concat(str3) : new String(str5));
            return false;
        }
    }

    private final boolean m26114c(C5371a c5371a) {
        return this.f27911f && !C5367k.m26113a(c5371a.f27935a, c5371a.f27936b);
    }

    private final synchronized C5481a m26115d(C5371a c5371a) {
        C5481a c5481a;
        String str = c5371a.f27935a;
        if (m26114c(c5371a)) {
            c5481a = null;
        } else {
            if (!this.f27909d.containsKey(str)) {
                Intent intent = new Intent("com.google.android.gms.peerdownloadmanager.BIND_RESOURCE_HOST");
                intent.setPackage(str);
                this.f27909d.put(str, new C5365j(this.f27907b, intent, TimeUnit.SECONDS));
            }
            c5481a = ((C5365j) this.f27909d.get(str)).m26105a();
        }
        return c5481a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.peerdownloadmanager.common.C5373c mo4976a(com.google.android.gms.peerdownloadmanager.common.C5371a r7, java.util.List r8, java.util.List r9, boolean r10) {
        /*
        r6 = this;
        r1 = 0;
        r0 = "ResourceManagerImpl";
        r2 = java.lang.String.valueOf(r7);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 28;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "openChannel: ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r3 = " polarity=";
        r2 = r2.append(r3);
        r2 = r2.append(r10);
        r2 = r2.toString();
        android.util.Log.d(r0, r2);
        r0 = r6.m26115d(r7);
        if (r0 != 0) goto L_0x0040;
    L_0x0037:
        r0 = "ResourceManagerImpl";
        r2 = "openChannel: bind returned null";
        android.util.Log.d(r0, r2);
        r0 = r1;
    L_0x003f:
        return r0;
    L_0x0040:
        r2 = "ResourceManagerImpl";
        r3 = java.lang.String.valueOf(r0);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r4 = r4.length();	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r4 = r4 + 22;
        r5 = new java.lang.StringBuilder;	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r5.<init>(r4);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r4 = "openChannel: bound to ";
        r4 = r5.append(r4);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r3 = r4.append(r3);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r3 = r3.toString();	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        android.util.Log.d(r2, r3);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r2 = new com.google.common.f.a.bf;	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r2.<init>();	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r3 = new com.google.android.gms.peerdownloadmanager.c.l;	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r3.<init>(r2);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r0.mo5024a(r3, r8, r9, r10);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r4 = f27906a;	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r0 = r2.get(r4, r0);	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r0 = (android.os.ParcelFileDescriptor) r0;	 Catch:{ CancellationException -> 0x00fa, InterruptedException -> 0x00be, ExecutionException -> 0x00f5, TimeoutException -> 0x00ff, RemoteException -> 0x00ea }
        r1 = "ResourceManagerImpl";
        r2 = java.lang.String.valueOf(r0);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r3 = r3.length();	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r3 = r3 + 25;
        r4 = new java.lang.StringBuilder;	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r4.<init>(r3);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r3 = "openChannel: socketPfd = ";
        r3 = r4.append(r3);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r2 = r3.append(r2);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r2 = r2.toString();	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        android.util.Log.d(r1, r2);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r1 = new com.google.android.gms.peerdownloadmanager.common.c;	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r2 = new android.os.ParcelFileDescriptor$AutoCloseInputStream;	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r2.<init>(r0);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r3 = new com.google.android.gms.peerdownloadmanager.common.g;	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r3.<init>(r2);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r2 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream;	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r2.<init>(r0);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r4 = new com.google.android.gms.peerdownloadmanager.common.h;	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r4.<init>(r2);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r1.<init>(r3, r4);	 Catch:{ CancellationException -> 0x00fd, InterruptedException -> 0x00f3, ExecutionException -> 0x00f8, TimeoutException -> 0x0102, RemoteException -> 0x00ea }
        r0 = r1;
        goto L_0x003f;
    L_0x00be:
        r0 = move-exception;
        r0 = r1;
    L_0x00c0:
        com.google.android.gms.peerdownloadmanager.common.aa.m26135a(r0);
        r0 = new java.io.IOException;
        r1 = java.lang.String.valueOf(r7);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 23;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "openChannel failed for ";
        r2 = r3.append(r2);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00ea:
        r0 = move-exception;
        r1 = new java.io.IOException;
        r2 = "error talking to app";
        r1.<init>(r2, r0);
        throw r1;
    L_0x00f3:
        r1 = move-exception;
        goto L_0x00c0;
    L_0x00f5:
        r0 = move-exception;
        r0 = r1;
        goto L_0x00c0;
    L_0x00f8:
        r1 = move-exception;
        goto L_0x00c0;
    L_0x00fa:
        r0 = move-exception;
        r0 = r1;
        goto L_0x00c0;
    L_0x00fd:
        r1 = move-exception;
        goto L_0x00c0;
    L_0x00ff:
        r0 = move-exception;
        r0 = r1;
        goto L_0x00c0;
    L_0x0102:
        r1 = move-exception;
        goto L_0x00c0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.peerdownloadmanager.c.k.a(com.google.android.gms.peerdownloadmanager.common.a, java.util.List, java.util.List, boolean):com.google.android.gms.peerdownloadmanager.common.c");
    }

    public final Collection mo4977a() {
        Map hashMap = new HashMap();
        for (C5382m c5382m : this.f27908c.m26383a(C5380k.f27955a.m26157a())) {
            C5383n c5383n = c5382m.f27960a;
            C5371a c5371a = c5383n.f27964a;
            if (!hashMap.containsKey(c5371a)) {
                hashMap.put(c5371a, new C5384o(c5371a));
            }
            ((C5384o) hashMap.get(c5371a)).m26160a(c5383n.f27965b);
        }
        return hashMap.values();
    }

    public final Collection mo4978a(Collection collection) {
        Collection hashSet = new HashSet();
        for (C5384o c5384o : collection) {
            List<C5382m> a = this.f27908c.m26382a(c5384o.f27966a, null, true);
            Set hashSet2 = new HashSet();
            for (C5382m c5382m : a) {
                hashSet2.add(c5382m.f27960a.f27965b);
            }
            hashSet2.retainAll(c5384o.f27967b);
            if (!hashSet2.isEmpty()) {
                hashSet.add(new C5384o(c5384o.f27966a, hashSet2));
            }
        }
        return hashSet;
    }

    public final synchronized boolean mo4979a(C5371a c5371a) {
        boolean z;
        boolean z2 = false;
        synchronized (this) {
            String str = c5371a.f27935a;
            if (m26114c(c5371a)) {
                z = false;
            } else {
                int i;
                Integer num = (Integer) this.f27910e.get(str);
                if (num == null || num.intValue() == 0) {
                    z2 = true;
                }
                Map map = this.f27910e;
                if (z2) {
                    i = 1;
                } else {
                    i = num.intValue() + 1;
                }
                map.put(str, Integer.valueOf(i));
                z = z2;
            }
        }
        return z;
    }

    public final synchronized boolean mo4981b(C5371a c5371a) {
        boolean z;
        String str = c5371a.f27935a;
        if (m26114c(c5371a)) {
            z = false;
        } else {
            Integer num = (Integer) this.f27910e.get(str);
            String str2;
            if (num.intValue() == 1) {
                this.f27910e.put(str, Integer.valueOf(0));
                if (this.f27909d.containsKey(str)) {
                    str2 = "ResourceManagerImpl";
                    String str3 = "calling unbind early for: ";
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        valueOf = str3.concat(valueOf);
                    } else {
                        valueOf = new String(str3);
                    }
                    Log.d(str2, valueOf);
                    ((C5365j) this.f27909d.get(str)).m26106b();
                }
                z = true;
            } else if (num.intValue() > 1) {
                this.f27910e.put(str, Integer.valueOf(num.intValue() - 1));
                z = false;
            } else {
                str2 = String.valueOf(c5371a);
                throw new IllegalStateException(new StringBuilder(String.valueOf(str2).length() + 41).append("called freeHost without reserveHost for: ").append(str2).toString());
            }
        }
        return z;
    }

    public final synchronized void mo4980b() {
        for (Entry value : this.f27909d.entrySet()) {
            ((C5365j) value.getValue()).m26106b();
        }
    }
}
