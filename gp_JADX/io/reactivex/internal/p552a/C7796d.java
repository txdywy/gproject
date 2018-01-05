package io.reactivex.internal.p552a;

import io.reactivex.internal.p557b.C7811n;
import io.reactivex.p551b.C7756b;
import java.util.LinkedList;
import java.util.List;

public final class C7796d implements C7756b, C7761a {
    public List f40317a;
    public volatile boolean f40318b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6530a() {
        /*
        r5 = this;
        r1 = 0;
        r4 = 1;
        r0 = r5.f40318b;
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        monitor-enter(r5);
        r0 = r5.f40318b;	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        monitor-exit(r5);	 Catch:{ all -> 0x000e }
        goto L_0x0006;
    L_0x000e:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x000e }
        throw r0;
    L_0x0011:
        r0 = 1;
        r5.f40318b = r0;	 Catch:{ all -> 0x000e }
        r0 = r5.f40317a;	 Catch:{ all -> 0x000e }
        r2 = 0;
        r5.f40317a = r2;	 Catch:{ all -> 0x000e }
        monitor-exit(r5);	 Catch:{ all -> 0x000e }
        if (r0 == 0) goto L_0x0006;
    L_0x001c:
        r2 = r0.iterator();
    L_0x0020:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0040;
    L_0x0026:
        r0 = r2.next();
        r0 = (io.reactivex.p551b.C7756b) r0;
        r0.mo6530a();	 Catch:{ Throwable -> 0x0030 }
        goto L_0x0020;
    L_0x0030:
        r3 = move-exception;
        io.reactivex.exceptions.C7788d.m37579a(r3);
        if (r1 != 0) goto L_0x005a;
    L_0x0036:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x003b:
        r0.add(r3);
        r1 = r0;
        goto L_0x0020;
    L_0x0040:
        if (r1 == 0) goto L_0x0006;
    L_0x0042:
        r0 = r1.size();
        if (r0 != r4) goto L_0x0054;
    L_0x0048:
        r0 = 0;
        r0 = r1.get(r0);
        r0 = (java.lang.Throwable) r0;
        r0 = io.reactivex.internal.util.ExceptionHelper.m37735a(r0);
        throw r0;
    L_0x0054:
        r0 = new io.reactivex.exceptions.CompositeException;
        r0.<init>(r1);
        throw r0;
    L_0x005a:
        r0 = r1;
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.a.d.a():void");
    }

    public final boolean mo6531a(C7756b c7756b) {
        C7811n.m37615a((Object) c7756b, "d is null");
        if (!this.f40318b) {
            synchronized (this) {
                if (!this.f40318b) {
                    List list = this.f40317a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f40317a = list;
                    }
                    list.add(c7756b);
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
    public final boolean mo6533c(io.reactivex.p551b.C7756b r3) {
        /*
        r2 = this;
        r0 = 0;
        r1 = "Disposable item is null";
        io.reactivex.internal.p557b.C7811n.m37615a(r3, r1);
        r1 = r2.f40318b;
        if (r1 == 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        monitor-enter(r2);
        r1 = r2.f40318b;	 Catch:{ all -> 0x0012 }
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        monitor-exit(r2);	 Catch:{ all -> 0x0012 }
        goto L_0x000a;
    L_0x0012:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0012 }
        throw r0;
    L_0x0015:
        r1 = r2.f40317a;	 Catch:{ all -> 0x0012 }
        if (r1 == 0) goto L_0x001f;
    L_0x0019:
        r1 = r1.remove(r3);	 Catch:{ all -> 0x0012 }
        if (r1 != 0) goto L_0x0021;
    L_0x001f:
        monitor-exit(r2);	 Catch:{ all -> 0x0012 }
        goto L_0x000a;
    L_0x0021:
        monitor-exit(r2);	 Catch:{ all -> 0x0012 }
        r0 = 1;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.a.d.c(io.reactivex.b.b):boolean");
    }
}
