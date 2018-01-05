package io.reactivex.p551b;

import io.reactivex.internal.p552a.C7761a;
import io.reactivex.internal.p557b.C7811n;
import io.reactivex.internal.util.C7863a;

public final class C7762a implements C7756b, C7761a {
    public C7863a f40281a;
    public volatile boolean f40282b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6530a() {
        /*
        r8 = this;
        r1 = 0;
        r7 = 1;
        r4 = 0;
        r0 = r8.f40282b;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        monitor-enter(r8);
        r0 = r8.f40282b;	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        monitor-exit(r8);	 Catch:{ all -> 0x000f }
        goto L_0x0007;
    L_0x000f:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x000f }
        throw r0;
    L_0x0012:
        r0 = 1;
        r8.f40282b = r0;	 Catch:{ all -> 0x000f }
        r0 = r8.f40281a;	 Catch:{ all -> 0x000f }
        r2 = 0;
        r8.f40281a = r2;	 Catch:{ all -> 0x000f }
        monitor-exit(r8);	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x0007;
    L_0x001d:
        r5 = r0.f40467e;
        r6 = r5.length;
        r3 = r4;
    L_0x0021:
        if (r3 >= r6) goto L_0x0043;
    L_0x0023:
        r0 = r5[r3];
        r2 = r0 instanceof io.reactivex.p551b.C7756b;
        if (r2 == 0) goto L_0x002e;
    L_0x0029:
        r0 = (io.reactivex.p551b.C7756b) r0;	 Catch:{ Throwable -> 0x0032 }
        r0.mo6530a();	 Catch:{ Throwable -> 0x0032 }
    L_0x002e:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0021;
    L_0x0032:
        r0 = move-exception;
        r2 = r0;
        io.reactivex.exceptions.C7788d.m37579a(r2);
        if (r1 != 0) goto L_0x005c;
    L_0x0039:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x003e:
        r0.add(r2);
        r1 = r0;
        goto L_0x002e;
    L_0x0043:
        if (r1 == 0) goto L_0x0007;
    L_0x0045:
        r0 = r1.size();
        if (r0 != r7) goto L_0x0056;
    L_0x004b:
        r0 = r1.get(r4);
        r0 = (java.lang.Throwable) r0;
        r0 = io.reactivex.internal.util.ExceptionHelper.m37735a(r0);
        throw r0;
    L_0x0056:
        r0 = new io.reactivex.exceptions.CompositeException;
        r0.<init>(r1);
        throw r0;
    L_0x005c:
        r0 = r1;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.b.a.a():void");
    }

    public final boolean mo6531a(C7756b c7756b) {
        C7811n.m37615a((Object) c7756b, "d is null");
        if (!this.f40282b) {
            synchronized (this) {
                if (!this.f40282b) {
                    C7863a c7863a;
                    C7863a c7863a2 = this.f40281a;
                    if (c7863a2 == null) {
                        c7863a2 = new C7863a();
                        this.f40281a = c7863a2;
                        c7863a = c7863a2;
                    } else {
                        c7863a = c7863a2;
                    }
                    Object[] objArr = c7863a.f40467e;
                    int i = c7863a.f40464b;
                    int a = C7863a.m37736a(c7756b.hashCode()) & i;
                    Object obj = objArr[a];
                    if (obj != null) {
                        if (!obj.equals(c7756b)) {
                            do {
                                a = (a + 1) & i;
                                obj = objArr[a];
                                if (obj != null) {
                                }
                            } while (!obj.equals(c7756b));
                        }
                        return true;
                    }
                    objArr[a] = c7756b;
                    a = c7863a.f40465c + 1;
                    c7863a.f40465c = a;
                    if (a >= c7863a.f40466d) {
                        Object[] objArr2 = c7863a.f40467e;
                        i = objArr2.length;
                        int i2 = i << 1;
                        int i3 = i2 - 1;
                        Object[] objArr3 = new Object[i2];
                        int i4 = i;
                        i = c7863a.f40465c;
                        while (true) {
                            int i5 = i - 1;
                            if (i == 0) {
                                break;
                            }
                            while (true) {
                                i = i4 - 1;
                                if (objArr2[i] != null) {
                                    break;
                                }
                                i4 = i;
                            }
                            i4 = C7863a.m37736a(objArr2[i].hashCode()) & i3;
                            if (objArr3[i4] != null) {
                                do {
                                    i4 = (i4 + 1) & i3;
                                } while (objArr3[i4] != null);
                            }
                            objArr3[i4] = objArr2[i];
                            i4 = i;
                            i = i5;
                        }
                        c7863a.f40464b = i3;
                        c7863a.f40466d = (int) (((float) i2) * c7863a.f40463a);
                        c7863a.f40467e = objArr3;
                    }
                    return true;
                }
            }
        }
        c7756b.mo6530a();
        return false;
    }

    public final boolean mo6532b(C7756b c7756b) {
        if (!mo6533c(c7756b)) {
            return false;
        }
        c7756b.mo6530a();
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo6533c(io.reactivex.p551b.C7756b r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = "Disposable item is null";
        io.reactivex.internal.p557b.C7811n.m37615a(r7, r1);
        r1 = r6.f40282b;
        if (r1 == 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        monitor-enter(r6);
        r1 = r6.f40282b;	 Catch:{ all -> 0x0012 }
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        monitor-exit(r6);	 Catch:{ all -> 0x0012 }
        goto L_0x000a;
    L_0x0012:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0012 }
        throw r0;
    L_0x0015:
        r2 = r6.f40281a;	 Catch:{ all -> 0x0012 }
        if (r2 == 0) goto L_0x002d;
    L_0x0019:
        r3 = r2.f40467e;	 Catch:{ all -> 0x0012 }
        r4 = r2.f40464b;	 Catch:{ all -> 0x0012 }
        r1 = r7.hashCode();	 Catch:{ all -> 0x0012 }
        r1 = io.reactivex.internal.util.C7863a.m37736a(r1);	 Catch:{ all -> 0x0012 }
        r1 = r1 & r4;
        r5 = r3[r1];	 Catch:{ all -> 0x0012 }
        if (r5 != 0) goto L_0x002f;
    L_0x002a:
        r1 = r0;
    L_0x002b:
        if (r1 != 0) goto L_0x004e;
    L_0x002d:
        monitor-exit(r6);	 Catch:{ all -> 0x0012 }
        goto L_0x000a;
    L_0x002f:
        r5 = r5.equals(r7);	 Catch:{ all -> 0x0012 }
        if (r5 == 0) goto L_0x003a;
    L_0x0035:
        r1 = r2.m37737a(r1, r3, r4);	 Catch:{ all -> 0x0012 }
        goto L_0x002b;
    L_0x003a:
        r1 = r1 + 1;
        r1 = r1 & r4;
        r5 = r3[r1];	 Catch:{ all -> 0x0012 }
        if (r5 != 0) goto L_0x0043;
    L_0x0041:
        r1 = r0;
        goto L_0x002b;
    L_0x0043:
        r5 = r5.equals(r7);	 Catch:{ all -> 0x0012 }
        if (r5 == 0) goto L_0x003a;
    L_0x0049:
        r1 = r2.m37737a(r1, r3, r4);	 Catch:{ all -> 0x0012 }
        goto L_0x002b;
    L_0x004e:
        monitor-exit(r6);	 Catch:{ all -> 0x0012 }
        r0 = 1;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.b.a.c(io.reactivex.b.b):boolean");
    }
}
