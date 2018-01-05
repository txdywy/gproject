package com.google.firebase.iid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;

public class FirebaseInstanceIdService extends C7127f {
    public static Object f34841a = new Object();
    public static boolean f34842b = false;
    public boolean f34843c = false;

    private final C7139m m32364a(String str) {
        if (str == null) {
            return C7139m.m32394a(this, null);
        }
        Bundle bundle = new Bundle();
        bundle.putString("subtype", str);
        return C7139m.m32394a(this, bundle);
    }

    private static Intent m32368b(int i) {
        Intent intent = new Intent("ACTION_TOKEN_REFRESH_RETRY");
        intent.putExtra("next_retry_delay_in_seconds", i);
        return intent;
    }

    private static boolean m32369b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private static String m32370e(Intent intent) {
        String stringExtra = intent.getStringExtra("subtype");
        return stringExtra == null ? "" : stringExtra;
    }

    public final boolean mo6017a(Intent intent) {
        this.f34843c = Log.isLoggable("FirebaseInstanceId", 3);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
            return false;
        }
        String e = m32370e(intent);
        if (this.f34843c) {
            String str = "FirebaseInstanceId";
            String str2 = "Register result in service ";
            String valueOf = String.valueOf(e);
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        m32364a(e);
        C7139m.f34882c.m32385a(intent);
        return true;
    }

    protected final Intent mo6019c(Intent intent) {
        return (Intent) C7143q.m32400a().f34891d.poll();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6018b(android.content.Intent r9) {
        /*
        r8 = this;
        r1 = 0;
        r7 = 1;
        r0 = r9.getAction();
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = "";
    L_0x000a:
        r2 = -1;
        r3 = r0.hashCode();
        switch(r3) {
            case -1737547627: goto L_0x008f;
            default: goto L_0x0012;
        };
    L_0x0012:
        r0 = r2;
    L_0x0013:
        switch(r0) {
            case 0: goto L_0x009a;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = m32370e(r9);
        r1 = r8.m32364a(r0);
        r2 = "CMD";
        r2 = r9.getStringExtra(r2);
        r3 = r8.f34843c;
        if (r3 == 0) goto L_0x0078;
    L_0x0028:
        r3 = "FirebaseInstanceId";
        r4 = r9.getExtras();
        r4 = java.lang.String.valueOf(r4);
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r5 = r5 + 18;
        r6 = java.lang.String.valueOf(r2);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r5 = r5 + r6;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r5);
        r5 = "Service command ";
        r5 = r6.append(r5);
        r5 = r5.append(r0);
        r6 = " ";
        r5 = r5.append(r6);
        r5 = r5.append(r2);
        r6 = " ";
        r5 = r5.append(r6);
        r4 = r5.append(r4);
        r4 = r4.toString();
        android.util.Log.d(r3, r4);
    L_0x0078:
        r3 = "unregistered";
        r3 = r9.getStringExtra(r3);
        if (r3 == 0) goto L_0x009e;
    L_0x0080:
        r1 = com.google.firebase.iid.C7139m.f34881b;
        if (r0 != 0) goto L_0x0086;
    L_0x0084:
        r0 = "";
    L_0x0086:
        r1.m32414c(r0);
        r0 = com.google.firebase.iid.C7139m.f34882c;
        r0.m32385a(r9);
    L_0x008e:
        return;
    L_0x008f:
        r3 = "ACTION_TOKEN_REFRESH_RETRY";
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x0012;
    L_0x0097:
        r0 = r1;
        goto L_0x0013;
    L_0x009a:
        r8.m32366a(r9, r1);
        goto L_0x008e;
    L_0x009e:
        r3 = "gcm.googleapis.com/refresh";
        r4 = "from";
        r4 = r9.getStringExtra(r4);
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00b5;
    L_0x00ac:
        r1 = com.google.firebase.iid.C7139m.f34881b;
        r1.m32414c(r0);
        r8.m32366a(r9, r7);
        goto L_0x008e;
    L_0x00b5:
        r3 = "RST";
        r3 = r3.equals(r2);
        if (r3 == 0) goto L_0x00c4;
    L_0x00bd:
        r1.m32397b();
        r8.m32366a(r9, r7);
        goto L_0x008e;
    L_0x00c4:
        r3 = "RST_FULL";
        r3 = r3.equals(r2);
        if (r3 == 0) goto L_0x00e0;
    L_0x00cc:
        r0 = com.google.firebase.iid.C7139m.f34881b;
        r0 = r0.m32410a();
        if (r0 != 0) goto L_0x008e;
    L_0x00d4:
        r1.m32397b();
        r0 = com.google.firebase.iid.C7139m.f34881b;
        r0.m32411b();
        r8.m32366a(r9, r7);
        goto L_0x008e;
    L_0x00e0:
        r1 = "SYNC";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00f1;
    L_0x00e8:
        r1 = com.google.firebase.iid.C7139m.f34881b;
        r1.m32414c(r0);
        r8.m32366a(r9, r7);
        goto L_0x008e;
    L_0x00f1:
        r0 = "PING";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x008e;
    L_0x00f9:
        r0 = r9.getExtras();
        r1 = com.google.firebase.iid.C7129b.m32376a(r8);
        if (r1 != 0) goto L_0x010b;
    L_0x0103:
        r0 = "FirebaseInstanceId";
        r1 = "Unable to respond to ping due to missing target package";
        android.util.Log.w(r0, r1);
        goto L_0x008e;
    L_0x010b:
        r2 = new android.content.Intent;
        r3 = "com.google.android.gcm.intent.SEND";
        r2.<init>(r3);
        r2.setPackage(r1);
        r2.putExtras(r0);
        com.google.firebase.iid.C7129b.m32378a(r8, r2);
        r0 = "google.to";
        r1 = "google.com/iid";
        r2.putExtra(r0, r1);
        r0 = "google.message_id";
        r1 = com.google.firebase.iid.C7129b.m32375a();
        r2.putExtra(r0, r1);
        r0 = "com.google.android.gtalkservice.permission.GTALK_SERVICE";
        r8.sendOrderedBroadcast(r2, r0);
        goto L_0x008e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.b(android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32366a(android.content.Intent r11, boolean r12) {
        /*
        r10 = this;
        r4 = 1;
        r1 = 0;
        r2 = f34841a;
        monitor-enter(r2);
        r0 = 0;
        f34842b = r0;	 Catch:{ all -> 0x0010 }
        monitor-exit(r2);	 Catch:{ all -> 0x0010 }
        r0 = com.google.firebase.iid.C7129b.m32376a(r10);
        if (r0 != 0) goto L_0x0013;
    L_0x000f:
        return;
    L_0x0010:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0010 }
        throw r0;
    L_0x0013:
        r0 = com.google.firebase.iid.FirebaseInstanceId.m32349a();
        r6 = com.google.firebase.iid.FirebaseInstanceId.m32353b();
        if (r6 == 0) goto L_0x0025;
    L_0x001d:
        r2 = com.google.firebase.iid.C7139m.f34883f;
        r2 = r6.m32418b(r2);
        if (r2 == 0) goto L_0x00f6;
    L_0x0025:
        r2 = r0.f34833b;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r3 = "*";
        r5 = new android.os.Bundle;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r5.<init>();	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        com.google.firebase.iid.FirebaseInstanceId.m32355c();	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r7 = r0.f34832a;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r0 = android.os.Looper.getMainLooper();	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r8 = android.os.Looper.myLooper();	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 != r8) goto L_0x004e;
    L_0x003d:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r1 = "MAIN_THREAD";
        r0.<init>(r1);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        throw r0;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
    L_0x0045:
        r0 = move-exception;
        r0 = r0.getMessage();
        r10.m32365a(r11, r0);
        goto L_0x000f;
    L_0x004e:
        r0 = "ttl";
        r0 = r5.getString(r0);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 != 0) goto L_0x0064;
    L_0x0056:
        r0 = "jwt";
        r8 = "type";
        r8 = r5.getString(r8);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r0 = r0.equals(r8);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 == 0) goto L_0x00a1;
    L_0x0064:
        r4 = r7.m32395a(r2, r3, r5);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r4 == 0) goto L_0x0075;
    L_0x006a:
        if (r1 == 0) goto L_0x0075;
    L_0x006c:
        r0 = com.google.firebase.iid.C7139m.f34881b;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r1 = r7.f34885e;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r5 = com.google.firebase.iid.C7139m.f34883f;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r0.m32409a(r1, r2, r3, r4, r5);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
    L_0x0075:
        if (r4 == 0) goto L_0x00ef;
    L_0x0077:
        r0 = r10.f34843c;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 == 0) goto L_0x0082;
    L_0x007b:
        r0 = "FirebaseInstanceId";
        r1 = "get master token succeeded";
        android.util.Log.d(r0, r1);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
    L_0x0082:
        r1 = f34841a;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        monitor-enter(r1);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r0 = f34842b;	 Catch:{ all -> 0x00ec }
        if (r0 == 0) goto L_0x00b6;
    L_0x0089:
        monitor-exit(r1);	 Catch:{ all -> 0x00ec }
    L_0x008a:
        if (r12 != 0) goto L_0x000f;
    L_0x008c:
        if (r6 == 0) goto L_0x000f;
    L_0x008e:
        if (r6 == 0) goto L_0x000f;
    L_0x0090:
        r0 = r6.f34896b;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r4.equals(r0);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        goto L_0x000f;
    L_0x0097:
        r0 = move-exception;
        r1 = "FirebaseInstanceId";
        r2 = "Unable to get master token";
        android.util.Log.e(r1, r2, r0);
        goto L_0x000f;
    L_0x00a1:
        r0 = com.google.firebase.iid.C7139m.f34881b;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r1 = r7.f34885e;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r0 = r0.m32407a(r1, r2, r3);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 == 0) goto L_0x023f;
    L_0x00ab:
        r1 = com.google.firebase.iid.C7139m.f34883f;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r1 = r0.m32418b(r1);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r1 != 0) goto L_0x023f;
    L_0x00b3:
        r4 = r0.f34896b;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        goto L_0x0075;
    L_0x00b6:
        monitor-exit(r1);	 Catch:{ all -> 0x00ec }
        r0 = com.google.firebase.iid.FirebaseInstanceId.m32353b();	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 == 0) goto L_0x00cb;
    L_0x00bd:
        r1 = com.google.firebase.iid.C7139m.f34883f;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r0 = r0.m32418b(r1);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 != 0) goto L_0x00cb;
    L_0x00c5:
        r0 = com.google.firebase.iid.C7140n.m32398a();	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 == 0) goto L_0x008a;
    L_0x00cb:
        r0 = com.google.firebase.iid.C7129b.m32376a(r10);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        if (r0 == 0) goto L_0x008a;
    L_0x00d1:
        r1 = f34841a;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        monitor-enter(r1);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        r0 = f34842b;	 Catch:{ all -> 0x00e9 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00d8:
        r0 = com.google.firebase.iid.C7143q.m32400a();	 Catch:{ all -> 0x00e9 }
        r2 = 0;
        r2 = m32368b(r2);	 Catch:{ all -> 0x00e9 }
        r0.m32403a(r10, r2);	 Catch:{ all -> 0x00e9 }
        r0 = 1;
        f34842b = r0;	 Catch:{ all -> 0x00e9 }
    L_0x00e7:
        monitor-exit(r1);	 Catch:{ all -> 0x00e9 }
        goto L_0x008a;
    L_0x00e9:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00e9 }
        throw r0;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
    L_0x00ec:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ec }
        throw r0;	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
    L_0x00ef:
        r0 = "returned token is null";
        r10.m32365a(r11, r0);	 Catch:{ IOException -> 0x0045, SecurityException -> 0x0097 }
        goto L_0x000f;
    L_0x00f6:
        r0 = com.google.firebase.iid.C7140n.m32398a();
    L_0x00fa:
        if (r0 == 0) goto L_0x0236;
    L_0x00fc:
        r2 = "!";
        r0 = r0.split(r2);
        r2 = r0.length;
        r3 = 2;
        if (r2 != r3) goto L_0x0115;
    L_0x0106:
        r2 = r0[r1];
        r3 = r0[r4];
        r0 = -1;
        r5 = r2.hashCode();	 Catch:{ IOException -> 0x014b }
        switch(r5) {
            case 83: goto L_0x011d;
            case 84: goto L_0x0112;
            case 85: goto L_0x0127;
            default: goto L_0x0112;
        };
    L_0x0112:
        switch(r0) {
            case 0: goto L_0x0131;
            case 1: goto L_0x01aa;
            default: goto L_0x0115;
        };
    L_0x0115:
        com.google.firebase.iid.C7140n.m32399b();
        r0 = com.google.firebase.iid.C7140n.m32398a();
        goto L_0x00fa;
    L_0x011d:
        r5 = "S";
        r2 = r2.equals(r5);	 Catch:{ IOException -> 0x014b }
        if (r2 == 0) goto L_0x0112;
    L_0x0125:
        r0 = r1;
        goto L_0x0112;
    L_0x0127:
        r5 = "U";
        r2 = r2.equals(r5);	 Catch:{ IOException -> 0x014b }
        if (r2 == 0) goto L_0x0112;
    L_0x012f:
        r0 = r4;
        goto L_0x0112;
    L_0x0131:
        r2 = com.google.firebase.iid.FirebaseInstanceId.m32349a();	 Catch:{ IOException -> 0x014b }
        r5 = com.google.firebase.iid.FirebaseInstanceId.m32353b();	 Catch:{ IOException -> 0x014b }
        if (r5 == 0) goto L_0x0143;
    L_0x013b:
        r0 = com.google.firebase.iid.C7139m.f34883f;	 Catch:{ IOException -> 0x014b }
        r0 = r5.m32418b(r0);	 Catch:{ IOException -> 0x014b }
        if (r0 == 0) goto L_0x0155;
    L_0x0143:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x014b }
        r1 = "token not available";
        r0.<init>(r1);	 Catch:{ IOException -> 0x014b }
        throw r0;	 Catch:{ IOException -> 0x014b }
    L_0x014b:
        r0 = move-exception;
        r0 = r0.getMessage();
        r10.m32365a(r11, r0);
        goto L_0x000f;
    L_0x0155:
        r6 = new android.os.Bundle;	 Catch:{ IOException -> 0x014b }
        r6.<init>();	 Catch:{ IOException -> 0x014b }
        r7 = "gcm.topic";
        r0 = "/topics/";
        r8 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x014b }
        r0 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x014b }
        r9 = r0.length();	 Catch:{ IOException -> 0x014b }
        if (r9 == 0) goto L_0x019e;
    L_0x016c:
        r0 = r8.concat(r0);	 Catch:{ IOException -> 0x014b }
    L_0x0170:
        r6.putString(r7, r0);	 Catch:{ IOException -> 0x014b }
        r5 = r5.f34896b;	 Catch:{ IOException -> 0x014b }
        r0 = "/topics/";
        r7 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x014b }
        r0 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x014b }
        r3 = r0.length();	 Catch:{ IOException -> 0x014b }
        if (r3 == 0) goto L_0x01a4;
    L_0x0185:
        r0 = r7.concat(r0);	 Catch:{ IOException -> 0x014b }
    L_0x0189:
        com.google.firebase.iid.FirebaseInstanceId.m32355c();	 Catch:{ IOException -> 0x014b }
        r2 = r2.f34832a;	 Catch:{ IOException -> 0x014b }
        r2.m32395a(r5, r0, r6);	 Catch:{ IOException -> 0x014b }
        r0 = r10.f34843c;	 Catch:{ IOException -> 0x014b }
        if (r0 == 0) goto L_0x0115;
    L_0x0195:
        r0 = "FirebaseInstanceId";
        r2 = "subscribe operation succeeded";
        android.util.Log.d(r0, r2);	 Catch:{ IOException -> 0x014b }
        goto L_0x0115;
    L_0x019e:
        r0 = new java.lang.String;	 Catch:{ IOException -> 0x014b }
        r0.<init>(r8);	 Catch:{ IOException -> 0x014b }
        goto L_0x0170;
    L_0x01a4:
        r0 = new java.lang.String;	 Catch:{ IOException -> 0x014b }
        r0.<init>(r7);	 Catch:{ IOException -> 0x014b }
        goto L_0x0189;
    L_0x01aa:
        r2 = com.google.firebase.iid.FirebaseInstanceId.m32349a();	 Catch:{ IOException -> 0x014b }
        r5 = com.google.firebase.iid.FirebaseInstanceId.m32353b();	 Catch:{ IOException -> 0x014b }
        if (r5 == 0) goto L_0x01bc;
    L_0x01b4:
        r0 = com.google.firebase.iid.C7139m.f34883f;	 Catch:{ IOException -> 0x014b }
        r0 = r5.m32418b(r0);	 Catch:{ IOException -> 0x014b }
        if (r0 == 0) goto L_0x01c4;
    L_0x01bc:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x014b }
        r1 = "token not available";
        r0.<init>(r1);	 Catch:{ IOException -> 0x014b }
        throw r0;	 Catch:{ IOException -> 0x014b }
    L_0x01c4:
        r6 = new android.os.Bundle;	 Catch:{ IOException -> 0x014b }
        r6.<init>();	 Catch:{ IOException -> 0x014b }
        r7 = "gcm.topic";
        r0 = "/topics/";
        r8 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x014b }
        r0 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x014b }
        r9 = r0.length();	 Catch:{ IOException -> 0x014b }
        if (r9 == 0) goto L_0x020c;
    L_0x01db:
        r0 = r8.concat(r0);	 Catch:{ IOException -> 0x014b }
    L_0x01df:
        r6.putString(r7, r0);	 Catch:{ IOException -> 0x014b }
        r2 = r2.f34832a;	 Catch:{ IOException -> 0x014b }
        r5 = r5.f34896b;	 Catch:{ IOException -> 0x014b }
        r0 = "/topics/";
        r7 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x014b }
        r0 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x014b }
        r3 = r0.length();	 Catch:{ IOException -> 0x014b }
        if (r3 == 0) goto L_0x0212;
    L_0x01f6:
        r0 = r7.concat(r0);	 Catch:{ IOException -> 0x014b }
    L_0x01fa:
        r3 = android.os.Looper.getMainLooper();	 Catch:{ IOException -> 0x014b }
        r7 = android.os.Looper.myLooper();	 Catch:{ IOException -> 0x014b }
        if (r3 != r7) goto L_0x0218;
    L_0x0204:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x014b }
        r1 = "MAIN_THREAD";
        r0.<init>(r1);	 Catch:{ IOException -> 0x014b }
        throw r0;	 Catch:{ IOException -> 0x014b }
    L_0x020c:
        r0 = new java.lang.String;	 Catch:{ IOException -> 0x014b }
        r0.<init>(r8);	 Catch:{ IOException -> 0x014b }
        goto L_0x01df;
    L_0x0212:
        r0 = new java.lang.String;	 Catch:{ IOException -> 0x014b }
        r0.<init>(r7);	 Catch:{ IOException -> 0x014b }
        goto L_0x01fa;
    L_0x0218:
        r3 = com.google.firebase.iid.C7139m.f34881b;	 Catch:{ IOException -> 0x014b }
        r7 = r2.f34885e;	 Catch:{ IOException -> 0x014b }
        r3.m32413b(r7, r5, r0);	 Catch:{ IOException -> 0x014b }
        r3 = "delete";
        r7 = "1";
        r6.putString(r3, r7);	 Catch:{ IOException -> 0x014b }
        r2.m32395a(r5, r0, r6);	 Catch:{ IOException -> 0x014b }
        r0 = r10.f34843c;	 Catch:{ IOException -> 0x014b }
        if (r0 == 0) goto L_0x0115;
    L_0x022d:
        r0 = "FirebaseInstanceId";
        r2 = "unsubscribe operation succeeded";
        android.util.Log.d(r0, r2);	 Catch:{ IOException -> 0x014b }
        goto L_0x0115;
    L_0x0236:
        r0 = "FirebaseInstanceId";
        r1 = "topic sync succeeded";
        android.util.Log.d(r0, r1);
        goto L_0x000f;
    L_0x023f:
        r1 = r4;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdService.a(android.content.Intent, boolean):void");
    }

    private final void m32365a(Intent intent, String str) {
        int i = 28800;
        boolean b = m32369b((Context) this);
        int intExtra = intent == null ? 10 : intent.getIntExtra("next_retry_delay_in_seconds", 0);
        if (intExtra < 10 && !b) {
            i = 30;
        } else if (intExtra < 10) {
            i = 10;
        } else if (intExtra <= 28800) {
            i = intExtra;
        }
        Log.d("FirebaseInstanceId", new StringBuilder(String.valueOf(str).length() + 47).append("background sync failed: ").append(str).append(", retry in ").append(i).append("s").toString());
        synchronized (f34841a) {
            AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
            Parcelable b2 = m32368b(i << 1);
            Intent intent2 = new Intent(this, FirebaseInstanceIdInternalReceiver.class);
            intent2.setAction("com.google.firebase.INSTANCE_ID_EVENT");
            intent2.putExtra("wrapped_intent", b2);
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) (i * 1000)), PendingIntent.getBroadcast(this, 0, intent2, 134217728));
            f34842b = true;
        }
        if (!b) {
            if (this.f34843c) {
                Log.d("FirebaseInstanceId", "device not connected. Connectivity change received registered");
            }
            C7128a.m32374a(this, i);
        }
    }
}
