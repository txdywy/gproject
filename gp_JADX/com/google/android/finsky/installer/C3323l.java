package com.google.android.finsky.installer;

import android.os.Binder;
import android.os.RemoteException;
import android.os.UserHandle;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map.Entry;

final class C3323l extends C3319e {
    public final /* synthetic */ MultiUserCoordinatorService f17165a;

    C3323l(MultiUserCoordinatorService multiUserCoordinatorService) {
        this.f17165a = multiUserCoordinatorService;
    }

    public final void mo3466a(C3308g c3308g) {
        UserHandle callingUserHandle = Binder.getCallingUserHandle();
        synchronized (this.f17165a.f16852b) {
            if (c3308g != null) {
                this.f17165a.f16852b.put(callingUserHandle, c3308g);
            } else {
                this.f17165a.f16852b.remove(callingUserHandle);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3467a(java.lang.String r8) {
        /*
        r7 = this;
        r2 = 1;
        r0 = 0;
        r1 = android.os.Binder.getCallingUserHandle();
        r3 = r7.f17165a;
        r3 = r3.f16851a;
        monitor-enter(r3);
        r4 = r7.m16695a(r1, r8);	 Catch:{ all -> 0x0064 }
        if (r4 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r3);	 Catch:{ all -> 0x0064 }
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r7.f17165a;	 Catch:{ all -> 0x0064 }
        r0 = r0.f16851a;	 Catch:{ all -> 0x0064 }
        r0.put(r8, r1);	 Catch:{ all -> 0x0064 }
        r0 = "User=%s requested=%s granted=true";
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0064 }
        r5 = 0;
        r4[r5] = r1;	 Catch:{ all -> 0x0064 }
        r1 = 1;
        r4[r1] = r8;	 Catch:{ all -> 0x0064 }
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r4);	 Catch:{ all -> 0x0064 }
        monitor-exit(r3);	 Catch:{ all -> 0x0064 }
        r0 = r7.f17165a;
        r3 = r0.f16852b;
        monitor-enter(r3);
        r0 = r7.f17165a;	 Catch:{ all -> 0x0061 }
        r0 = r0.f16852b;	 Catch:{ all -> 0x0061 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0061 }
        r4 = r0.iterator();	 Catch:{ all -> 0x0061 }
    L_0x003a:
        r0 = r4.hasNext();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0067;
    L_0x0040:
        r0 = r4.next();	 Catch:{ all -> 0x0061 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0061 }
        r1 = r0.getValue();	 Catch:{ RemoteException -> 0x0050 }
        r1 = (com.google.android.finsky.installer.C3308g) r1;	 Catch:{ RemoteException -> 0x0050 }
        r1.mo3463a(r8);	 Catch:{ RemoteException -> 0x0050 }
        goto L_0x003a;
    L_0x0050:
        r1 = move-exception;
        r1 = "Could not notify listener for user %s";
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ all -> 0x0061 }
        r6 = 0;
        r0 = r0.getKey();	 Catch:{ all -> 0x0061 }
        r5[r6] = r0;	 Catch:{ all -> 0x0061 }
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r5);	 Catch:{ all -> 0x0061 }
        goto L_0x003a;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0061 }
        throw r0;
    L_0x0064:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0064 }
        throw r0;
    L_0x0067:
        monitor-exit(r3);	 Catch:{ all -> 0x0061 }
        r0 = r2;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.installer.l.a(java.lang.String):boolean");
    }

    public final void mo3468b(String str) {
        Object obj;
        UserHandle callingUserHandle = Binder.getCallingUserHandle();
        synchronized (this.f17165a.f16851a) {
            UserHandle userHandle = (UserHandle) this.f17165a.f16851a.get(str);
            if (userHandle == null) {
                FinskyLog.m21665c("User=%s released=%s *** was not previously acquired", callingUserHandle, str);
                obj = 1;
            } else if (userHandle.equals(callingUserHandle)) {
                this.f17165a.f16851a.remove(str);
                FinskyLog.m21659a("User=%s released=%s", callingUserHandle, str);
                int i = 1;
            } else {
                FinskyLog.m21665c("User=%s released=%s *** owned by=%s", callingUserHandle, str, userHandle);
                obj = null;
            }
        }
        if (obj != null) {
            m16696c(str);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3465a() {
        /*
        r8 = this;
        r2 = android.os.Binder.getCallingUserHandle();
        r3 = new java.util.HashSet;
        r3.<init>();
        r0 = r8.f17165a;
        r4 = r0.f16851a;
        monitor-enter(r4);
        r0 = r8.f17165a;	 Catch:{ all -> 0x0059 }
        r0 = r0.f16851a;	 Catch:{ all -> 0x0059 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0059 }
        if (r0 == 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r4);	 Catch:{ all -> 0x0059 }
    L_0x0019:
        return;
    L_0x001a:
        r0 = r8.f17165a;	 Catch:{ all -> 0x0059 }
        r0 = r0.f16851a;	 Catch:{ all -> 0x0059 }
        r0 = r0.entrySet();	 Catch:{ all -> 0x0059 }
        r5 = r0.iterator();	 Catch:{ all -> 0x0059 }
    L_0x0026:
        r0 = r5.hasNext();	 Catch:{ all -> 0x0059 }
        if (r0 == 0) goto L_0x005c;
    L_0x002c:
        r0 = r5.next();	 Catch:{ all -> 0x0059 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x0059 }
        r1 = r0.getValue();	 Catch:{ all -> 0x0059 }
        r1 = (android.os.UserHandle) r1;	 Catch:{ all -> 0x0059 }
        r1 = r1.equals(r2);	 Catch:{ all -> 0x0059 }
        if (r1 == 0) goto L_0x0026;
    L_0x003e:
        r0 = r0.getKey();	 Catch:{ all -> 0x0059 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0059 }
        r1 = "User=%s removed=%s";
        r6 = 2;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x0059 }
        r7 = 0;
        r6[r7] = r2;	 Catch:{ all -> 0x0059 }
        r7 = 1;
        r6[r7] = r0;	 Catch:{ all -> 0x0059 }
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r6);	 Catch:{ all -> 0x0059 }
        r5.remove();	 Catch:{ all -> 0x0059 }
        r3.add(r0);	 Catch:{ all -> 0x0059 }
        goto L_0x0026;
    L_0x0059:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0059 }
        throw r0;
    L_0x005c:
        monitor-exit(r4);	 Catch:{ all -> 0x0059 }
        r1 = r3.iterator();
    L_0x0061:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0019;
    L_0x0067:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r8.m16696c(r0);
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.installer.l.a():void");
    }

    private final void m16696c(String str) {
        synchronized (this.f17165a.f16852b) {
            for (Entry value : this.f17165a.f16852b.entrySet()) {
                try {
                    ((C3308g) value.getValue()).mo3464b(str);
                } catch (RemoteException e) {
                    FinskyLog.m21665c("Could not notify listener for user %s", value.getKey());
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m16695a(android.os.UserHandle r7, java.lang.String r8) {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.f17165a;
        r3 = r0.f16851a;
        monitor-enter(r3);
        r0 = 0;
        r4 = r6.f17165a;	 Catch:{ all -> 0x005f }
        r4 = r4.f16853c;	 Catch:{ all -> 0x005f }
        if (r4 == 0) goto L_0x003f;
    L_0x000e:
        r0 = r6.f17165a;	 Catch:{ all -> 0x005f }
        r0 = r0.f16851a;	 Catch:{ all -> 0x005f }
        r0 = r0.get(r8);	 Catch:{ all -> 0x005f }
        r0 = (android.os.UserHandle) r0;	 Catch:{ all -> 0x005f }
    L_0x0018:
        if (r0 == 0) goto L_0x005c;
    L_0x001a:
        r4 = r0.equals(r7);	 Catch:{ all -> 0x005f }
        if (r4 != 0) goto L_0x005c;
    L_0x0020:
        r2 = "User=%s requested=%s granted=false owned by=%s concurrent mode=%s";
        r4 = 4;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x005f }
        r5 = 0;
        r4[r5] = r7;	 Catch:{ all -> 0x005f }
        r5 = 1;
        r4[r5] = r8;	 Catch:{ all -> 0x005f }
        r5 = 2;
        r4[r5] = r0;	 Catch:{ all -> 0x005f }
        r0 = 3;
        r5 = r6.f17165a;	 Catch:{ all -> 0x005f }
        r5 = r5.f16853c;	 Catch:{ all -> 0x005f }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ all -> 0x005f }
        r4[r0] = r5;	 Catch:{ all -> 0x005f }
        com.google.android.finsky.utils.FinskyLog.m21659a(r2, r4);	 Catch:{ all -> 0x005f }
        monitor-exit(r3);	 Catch:{ all -> 0x005f }
        r0 = r1;
    L_0x003e:
        return r0;
    L_0x003f:
        r4 = r6.f17165a;	 Catch:{ all -> 0x005f }
        r4 = r4.f16851a;	 Catch:{ all -> 0x005f }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x005f }
        if (r4 != 0) goto L_0x0018;
    L_0x0049:
        r0 = r6.f17165a;	 Catch:{ all -> 0x005f }
        r0 = r0.f16851a;	 Catch:{ all -> 0x005f }
        r0 = r0.values();	 Catch:{ all -> 0x005f }
        r0 = r0.iterator();	 Catch:{ all -> 0x005f }
        r0 = r0.next();	 Catch:{ all -> 0x005f }
        r0 = (android.os.UserHandle) r0;	 Catch:{ all -> 0x005f }
        goto L_0x0018;
    L_0x005c:
        monitor-exit(r3);	 Catch:{ all -> 0x005f }
        r0 = r2;
        goto L_0x003e;
    L_0x005f:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x005f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.installer.l.a(android.os.UserHandle, java.lang.String):boolean");
    }
}
