package android.support.v4.p028a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

public final class C0221j {
    public static final Object f1229f = new Object();
    public static C0221j f1230g;
    public final Context f1231a;
    public final HashMap f1232b = new HashMap();
    public final HashMap f1233c = new HashMap();
    public final ArrayList f1234d = new ArrayList();
    public final Handler f1235e;

    public static C0221j m1129a(Context context) {
        C0221j c0221j;
        synchronized (f1229f) {
            if (f1230g == null) {
                f1230g = new C0221j(context.getApplicationContext());
            }
            c0221j = f1230g;
        }
        return c0221j;
    }

    private C0221j(Context context) {
        this.f1231a = context;
        this.f1235e = new C0222k(this, context.getMainLooper());
    }

    public final void m1132a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f1232b) {
            C0224m c0224m = new C0224m(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f1232b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f1232b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c0224m);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                arrayList = (ArrayList) this.f1233c.get(action);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f1233c.put(action, arrayList);
                }
                arrayList.add(c0224m);
            }
        }
    }

    public final void m1131a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f1232b) {
            ArrayList arrayList = (ArrayList) this.f1232b.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0224m c0224m = (C0224m) arrayList.get(size);
                c0224m.f1242d = true;
                for (int i = 0; i < c0224m.f1239a.countActions(); i++) {
                    String action = c0224m.f1239a.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.f1233c.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C0224m c0224m2 = (C0224m) arrayList2.get(size2);
                            if (c0224m2.f1240b == broadcastReceiver) {
                                c0224m2.f1242d = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.f1233c.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1133a(android.content.Intent r17) {
        /*
        r16 = this;
        r0 = r16;
        r13 = r0.f1232b;
        monitor-enter(r13);
        r2 = r17.getAction();	 Catch:{ all -> 0x00f3 }
        r0 = r16;
        r1 = r0.f1231a;	 Catch:{ all -> 0x00f3 }
        r1 = r1.getContentResolver();	 Catch:{ all -> 0x00f3 }
        r0 = r17;
        r3 = r0.resolveTypeIfNeeded(r1);	 Catch:{ all -> 0x00f3 }
        r5 = r17.getData();	 Catch:{ all -> 0x00f3 }
        r4 = r17.getScheme();	 Catch:{ all -> 0x00f3 }
        r6 = r17.getCategories();	 Catch:{ all -> 0x00f3 }
        r1 = r17.getFlags();	 Catch:{ all -> 0x00f3 }
        r1 = r1 & 8;
        if (r1 == 0) goto L_0x00bd;
    L_0x002b:
        r1 = 1;
        r12 = r1;
    L_0x002d:
        if (r12 == 0) goto L_0x0059;
    L_0x002f:
        r1 = "LocalBroadcastManager";
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f3 }
        r8 = "Resolving type ";
        r7.<init>(r8);	 Catch:{ all -> 0x00f3 }
        r7 = r7.append(r3);	 Catch:{ all -> 0x00f3 }
        r8 = " scheme ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x00f3 }
        r7 = r7.append(r4);	 Catch:{ all -> 0x00f3 }
        r8 = " of intent ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x00f3 }
        r0 = r17;
        r7 = r7.append(r0);	 Catch:{ all -> 0x00f3 }
        r7 = r7.toString();	 Catch:{ all -> 0x00f3 }
        android.util.Log.v(r1, r7);	 Catch:{ all -> 0x00f3 }
    L_0x0059:
        r0 = r16;
        r1 = r0.f1233c;	 Catch:{ all -> 0x00f3 }
        r7 = r17.getAction();	 Catch:{ all -> 0x00f3 }
        r1 = r1.get(r7);	 Catch:{ all -> 0x00f3 }
        r0 = r1;
        r0 = (java.util.ArrayList) r0;	 Catch:{ all -> 0x00f3 }
        r8 = r0;
        if (r8 == 0) goto L_0x015a;
    L_0x006b:
        if (r12 == 0) goto L_0x0081;
    L_0x006d:
        r1 = "LocalBroadcastManager";
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f3 }
        r9 = "Action list: ";
        r7.<init>(r9);	 Catch:{ all -> 0x00f3 }
        r7 = r7.append(r8);	 Catch:{ all -> 0x00f3 }
        r7 = r7.toString();	 Catch:{ all -> 0x00f3 }
        android.util.Log.v(r1, r7);	 Catch:{ all -> 0x00f3 }
    L_0x0081:
        r10 = 0;
        r1 = 0;
        r11 = r1;
    L_0x0084:
        r1 = r8.size();	 Catch:{ all -> 0x00f3 }
        if (r11 >= r1) goto L_0x011f;
    L_0x008a:
        r1 = r8.get(r11);	 Catch:{ all -> 0x00f3 }
        r0 = r1;
        r0 = (android.support.v4.p028a.C0224m) r0;	 Catch:{ all -> 0x00f3 }
        r9 = r0;
        if (r12 == 0) goto L_0x00aa;
    L_0x0094:
        r1 = "LocalBroadcastManager";
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f3 }
        r14 = "Matching against filter ";
        r7.<init>(r14);	 Catch:{ all -> 0x00f3 }
        r14 = r9.f1239a;	 Catch:{ all -> 0x00f3 }
        r7 = r7.append(r14);	 Catch:{ all -> 0x00f3 }
        r7 = r7.toString();	 Catch:{ all -> 0x00f3 }
        android.util.Log.v(r1, r7);	 Catch:{ all -> 0x00f3 }
    L_0x00aa:
        r1 = r9.f1241c;	 Catch:{ all -> 0x00f3 }
        if (r1 == 0) goto L_0x00c1;
    L_0x00ae:
        if (r12 == 0) goto L_0x0111;
    L_0x00b0:
        r1 = "LocalBroadcastManager";
        r7 = "  Filter's target already added";
        android.util.Log.v(r1, r7);	 Catch:{ all -> 0x00f3 }
        r1 = r10;
    L_0x00b8:
        r7 = r11 + 1;
        r11 = r7;
        r10 = r1;
        goto L_0x0084;
    L_0x00bd:
        r1 = 0;
        r12 = r1;
        goto L_0x002d;
    L_0x00c1:
        r1 = r9.f1239a;	 Catch:{ all -> 0x00f3 }
        r7 = "LocalBroadcastManager";
        r1 = r1.match(r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00f3 }
        if (r1 < 0) goto L_0x00f6;
    L_0x00cb:
        if (r12 == 0) goto L_0x00e5;
    L_0x00cd:
        r7 = "LocalBroadcastManager";
        r14 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f3 }
        r15 = "  Filter matched!  match=0x";
        r14.<init>(r15);	 Catch:{ all -> 0x00f3 }
        r1 = java.lang.Integer.toHexString(r1);	 Catch:{ all -> 0x00f3 }
        r1 = r14.append(r1);	 Catch:{ all -> 0x00f3 }
        r1 = r1.toString();	 Catch:{ all -> 0x00f3 }
        android.util.Log.v(r7, r1);	 Catch:{ all -> 0x00f3 }
    L_0x00e5:
        if (r10 != 0) goto L_0x015d;
    L_0x00e7:
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x00f3 }
        r1.<init>();	 Catch:{ all -> 0x00f3 }
    L_0x00ec:
        r1.add(r9);	 Catch:{ all -> 0x00f3 }
        r7 = 1;
        r9.f1241c = r7;	 Catch:{ all -> 0x00f3 }
        goto L_0x00b8;
    L_0x00f3:
        r1 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x00f3 }
        throw r1;
    L_0x00f6:
        if (r12 == 0) goto L_0x0111;
    L_0x00f8:
        switch(r1) {
            case -4: goto L_0x0116;
            case -3: goto L_0x0113;
            case -2: goto L_0x0119;
            case -1: goto L_0x011c;
            default: goto L_0x00fb;
        };
    L_0x00fb:
        r1 = "unknown reason";
    L_0x00fd:
        r7 = "LocalBroadcastManager";
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f3 }
        r14 = "  Filter did not match: ";
        r9.<init>(r14);	 Catch:{ all -> 0x00f3 }
        r1 = r9.append(r1);	 Catch:{ all -> 0x00f3 }
        r1 = r1.toString();	 Catch:{ all -> 0x00f3 }
        android.util.Log.v(r7, r1);	 Catch:{ all -> 0x00f3 }
    L_0x0111:
        r1 = r10;
        goto L_0x00b8;
    L_0x0113:
        r1 = "action";
        goto L_0x00fd;
    L_0x0116:
        r1 = "category";
        goto L_0x00fd;
    L_0x0119:
        r1 = "data";
        goto L_0x00fd;
    L_0x011c:
        r1 = "type";
        goto L_0x00fd;
    L_0x011f:
        if (r10 == 0) goto L_0x015a;
    L_0x0121:
        r1 = 0;
        r2 = r1;
    L_0x0123:
        r1 = r10.size();	 Catch:{ all -> 0x00f3 }
        if (r2 >= r1) goto L_0x0136;
    L_0x0129:
        r1 = r10.get(r2);	 Catch:{ all -> 0x00f3 }
        r1 = (android.support.v4.p028a.C0224m) r1;	 Catch:{ all -> 0x00f3 }
        r3 = 0;
        r1.f1241c = r3;	 Catch:{ all -> 0x00f3 }
        r1 = r2 + 1;
        r2 = r1;
        goto L_0x0123;
    L_0x0136:
        r0 = r16;
        r1 = r0.f1234d;	 Catch:{ all -> 0x00f3 }
        r2 = new android.support.v4.a.l;	 Catch:{ all -> 0x00f3 }
        r0 = r17;
        r2.<init>(r0, r10);	 Catch:{ all -> 0x00f3 }
        r1.add(r2);	 Catch:{ all -> 0x00f3 }
        r0 = r16;
        r1 = r0.f1235e;	 Catch:{ all -> 0x00f3 }
        r2 = 1;
        r1 = r1.hasMessages(r2);	 Catch:{ all -> 0x00f3 }
        if (r1 != 0) goto L_0x0157;
    L_0x014f:
        r0 = r16;
        r1 = r0.f1235e;	 Catch:{ all -> 0x00f3 }
        r2 = 1;
        r1.sendEmptyMessage(r2);	 Catch:{ all -> 0x00f3 }
    L_0x0157:
        r1 = 1;
        monitor-exit(r13);	 Catch:{ all -> 0x00f3 }
    L_0x0159:
        return r1;
    L_0x015a:
        monitor-exit(r13);	 Catch:{ all -> 0x00f3 }
        r1 = 0;
        goto L_0x0159;
    L_0x015d:
        r1 = r10;
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.j.a(android.content.Intent):boolean");
    }

    public final void m1134b(Intent intent) {
        if (m1133a(intent)) {
            m1130a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m1130a() {
        /*
        r9 = this;
        r2 = 0;
    L_0x0001:
        r1 = r9.f1232b;
        monitor-enter(r1);
        r0 = r9.f1234d;	 Catch:{ all -> 0x0043 }
        r0 = r0.size();	 Catch:{ all -> 0x0043 }
        if (r0 > 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
        return;
    L_0x000e:
        r4 = new android.support.v4.p028a.C0223l[r0];	 Catch:{ all -> 0x0043 }
        r0 = r9.f1234d;	 Catch:{ all -> 0x0043 }
        r0.toArray(r4);	 Catch:{ all -> 0x0043 }
        r0 = r9.f1234d;	 Catch:{ all -> 0x0043 }
        r0.clear();	 Catch:{ all -> 0x0043 }
        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
        r1 = r2;
    L_0x001c:
        r0 = r4.length;
        if (r1 >= r0) goto L_0x0001;
    L_0x001f:
        r5 = r4[r1];
        r0 = r5.f1238b;
        r6 = r0.size();
        r3 = r2;
    L_0x0028:
        if (r3 >= r6) goto L_0x0046;
    L_0x002a:
        r0 = r5.f1238b;
        r0 = r0.get(r3);
        r0 = (android.support.v4.p028a.C0224m) r0;
        r7 = r0.f1242d;
        if (r7 != 0) goto L_0x003f;
    L_0x0036:
        r0 = r0.f1240b;
        r7 = r9.f1231a;
        r8 = r5.f1237a;
        r0.onReceive(r7, r8);
    L_0x003f:
        r0 = r3 + 1;
        r3 = r0;
        goto L_0x0028;
    L_0x0043:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
        throw r0;
    L_0x0046:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.j.a():void");
    }
}
