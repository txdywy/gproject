package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.h.u;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.j;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.Random;

public final class C7129b {
    public static String f34846a = null;
    public static boolean f34847b = false;
    public static int f34848c = 0;
    public static BroadcastReceiver f34849d = null;
    public static PendingIntent f34850j;
    public Context f34851e;
    public final u f34852f = new u();
    public Messenger f34853g;
    public Messenger f34854h;
    public MessengerCompat f34855i;
    public int f34856k;
    public int f34857l;
    public long f34858m;

    public C7129b(Context context) {
        this.f34851e = context;
    }

    public static synchronized String m32375a() {
        String num;
        synchronized (C7129b.class) {
            int i = f34848c;
            f34848c = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    public static String m32376a(Context context) {
        if (f34846a != null) {
            return f34846a;
        }
        boolean z;
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0)) {
            if (C7129b.m32383a(packageManager, resolveInfo.activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                f34847b = true;
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            return f34846a;
        }
        if (!j.c() && C7129b.m32381a(packageManager)) {
            return f34846a;
        }
        Log.w("InstanceID/Rpc", "Failed to resolve IID implementation package, falling back");
        if (C7129b.m32382a(packageManager, "com.google.android.gms")) {
            f34847b = j.c();
            return f34846a;
        } else if (j.b() || !C7129b.m32382a(packageManager, "com.google.android.gsf")) {
            Log.w("InstanceID/Rpc", "Google Play services is missing, unable to get tokens");
            return null;
        } else {
            f34847b = false;
            return f34846a;
        }
    }

    private static String m32377a(KeyPair keyPair, String... strArr) {
        String str = null;
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                str = FirebaseInstanceId.m32351a(instance.sign());
            } catch (Throwable e) {
                Log.e("InstanceID/Rpc", "Unable to sign registration request", e);
            }
        } catch (Throwable e2) {
            Log.e("InstanceID/Rpc", "Unable to encode string", e2);
        }
        return str;
    }

    public static synchronized void m32378a(Context context, Intent intent) {
        synchronized (C7129b.class) {
            if (f34850j == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f34850j = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f34850j);
        }
    }

    private final void m32379a(String str, Intent intent) {
        synchronized (this.f34852f) {
            C7130d c7130d = (C7130d) this.f34852f.remove(str);
            if (c7130d == null) {
                String str2 = "InstanceID/Rpc";
                String str3 = "Missing callback for ";
                String valueOf = String.valueOf(str);
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return;
            }
            c7130d.mo6020a(intent);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m32380a(java.lang.String r6, java.lang.String r7) {
        /*
        r5 = this;
        r2 = r5.f34852f;
        monitor-enter(r2);
        if (r6 != 0) goto L_0x0025;
    L_0x0005:
        r0 = 0;
        r1 = r0;
    L_0x0007:
        r0 = r5.f34852f;	 Catch:{ all -> 0x0046 }
        r0 = r0.size();	 Catch:{ all -> 0x0046 }
        if (r1 >= r0) goto L_0x001e;
    L_0x000f:
        r0 = r5.f34852f;	 Catch:{ all -> 0x0046 }
        r0 = r0.c(r1);	 Catch:{ all -> 0x0046 }
        r0 = (com.google.firebase.iid.C7130d) r0;	 Catch:{ all -> 0x0046 }
        r0.mo6021a(r7);	 Catch:{ all -> 0x0046 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0007;
    L_0x001e:
        r0 = r5.f34852f;	 Catch:{ all -> 0x0046 }
        r0.clear();	 Catch:{ all -> 0x0046 }
    L_0x0023:
        monitor-exit(r2);	 Catch:{ all -> 0x0046 }
    L_0x0024:
        return;
    L_0x0025:
        r0 = r5.f34852f;	 Catch:{ all -> 0x0046 }
        r0 = r0.remove(r6);	 Catch:{ all -> 0x0046 }
        r0 = (com.google.firebase.iid.C7130d) r0;	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x004f;
    L_0x002f:
        r1 = "InstanceID/Rpc";
        r3 = "Missing callback for ";
        r0 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0046 }
        r4 = r0.length();	 Catch:{ all -> 0x0046 }
        if (r4 == 0) goto L_0x0049;
    L_0x003d:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x0046 }
    L_0x0041:
        android.util.Log.w(r1, r0);	 Catch:{ all -> 0x0046 }
        monitor-exit(r2);	 Catch:{ all -> 0x0046 }
        goto L_0x0024;
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0046 }
        throw r0;
    L_0x0049:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0046 }
        r0.<init>(r3);	 Catch:{ all -> 0x0046 }
        goto L_0x0041;
    L_0x004f:
        r0.mo6021a(r7);	 Catch:{ all -> 0x0046 }
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.b.a(java.lang.String, java.lang.String):void");
    }

    private static boolean m32381a(PackageManager packageManager) {
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            if (C7129b.m32383a(packageManager, resolveInfo.serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                f34847b = false;
                return true;
            }
        }
        return false;
    }

    private static boolean m32382a(PackageManager packageManager, String str) {
        boolean z = false;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f34846a = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (NameNotFoundException e) {
            return z;
        }
    }

    private static boolean m32383a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return C7129b.m32382a(packageManager, str);
        }
        Log.w("InstanceID/Rpc", new StringBuilder((String.valueOf(str).length() + 56) + String.valueOf(str2).length()).append("Possible malicious package ").append(str).append(" declares ").append(str2).append(" without permission").toString());
        return false;
    }

    final void m32385a(Intent intent) {
        String str = null;
        if (intent != null) {
            String stringExtra;
            String stringExtra2;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
                stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("unregistered");
                }
                String str2;
                String[] split;
                if (stringExtra == null) {
                    stringExtra2 = intent.getStringExtra("error");
                    if (stringExtra2 == null) {
                        str = String.valueOf(intent.getExtras());
                        Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str).length() + 49).append("Unexpected response, no error or registration id ").append(str).toString());
                        return;
                    }
                    if (Log.isLoggable("InstanceID/Rpc", 3)) {
                        String str3 = "InstanceID/Rpc";
                        str2 = "Received InstanceID error ";
                        stringExtra = String.valueOf(stringExtra2);
                        Log.d(str3, stringExtra.length() != 0 ? str2.concat(stringExtra) : new String(str2));
                    }
                    if (stringExtra2.startsWith("|")) {
                        split = stringExtra2.split("\\|");
                        if (!"ID".equals(split[1])) {
                            str2 = "InstanceID/Rpc";
                            String str4 = "Unexpected structured response ";
                            stringExtra = String.valueOf(stringExtra2);
                            Log.w(str2, stringExtra.length() != 0 ? str4.concat(stringExtra) : new String(str4));
                        }
                        if (split.length > 2) {
                            stringExtra = split[2];
                            str = split[3];
                            if (str.startsWith(":")) {
                                str = str.substring(1);
                            }
                        } else {
                            str = "UNKNOWN";
                            stringExtra = null;
                        }
                        intent.putExtra("error", str);
                    } else {
                        stringExtra = null;
                        str = stringExtra2;
                    }
                    m32380a(stringExtra, str);
                    long longExtra = intent.getLongExtra("Retry-After", 0);
                    if (longExtra > 0) {
                        SystemClock.elapsedRealtime();
                        this.f34857l = ((int) longExtra) * 1000;
                        this.f34858m = SystemClock.elapsedRealtime() + ((long) this.f34857l);
                        Log.w("InstanceID/Rpc", "Explicit request from server to backoff: " + this.f34857l);
                        return;
                    } else if (("SERVICE_NOT_AVAILABLE".equals(str) || "AUTHENTICATION_FAILED".equals(str)) && "com.google.android.gsf".equals(f34846a)) {
                        this.f34856k++;
                        if (this.f34856k >= 3) {
                            if (this.f34856k == 3) {
                                this.f34857l = new Random().nextInt(1000) + 1000;
                            }
                            this.f34857l <<= 1;
                            this.f34858m = SystemClock.elapsedRealtime() + ((long) this.f34857l);
                            Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str).length() + 31).append("Backoff due to ").append(str).append(" for ").append(this.f34857l).toString());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                SystemClock.elapsedRealtime();
                this.f34858m = 0;
                this.f34856k = 0;
                this.f34857l = 0;
                if (stringExtra.startsWith("|")) {
                    split = stringExtra.split("\\|");
                    if (!"ID".equals(split[1])) {
                        stringExtra2 = "InstanceID/Rpc";
                        str2 = "Unexpected structured response ";
                        stringExtra = String.valueOf(stringExtra);
                        Log.w(stringExtra2, stringExtra.length() != 0 ? str2.concat(stringExtra) : new String(str2));
                    }
                    stringExtra2 = split[2];
                    if (split.length > 4) {
                        if ("SYNC".equals(split[3])) {
                            FirebaseInstanceId.m32356c(this.f34851e);
                        } else if ("RST".equals(split[3])) {
                            Context context = this.f34851e;
                            C7139m.m32394a(this.f34851e, null);
                            FirebaseInstanceId.m32352a(context, C7139m.f34881b);
                            intent.removeExtra("registration_id");
                            m32379a(stringExtra2, intent);
                            return;
                        }
                    }
                    stringExtra = split[split.length - 1];
                    if (stringExtra.startsWith(":")) {
                        stringExtra = stringExtra.substring(1);
                    }
                    intent.putExtra("registration_id", stringExtra);
                    str = stringExtra2;
                }
                if (str != null) {
                    m32379a(str, intent);
                } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Ignoring response without a request ID");
                }
            } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
                str = "InstanceID/Rpc";
                stringExtra2 = "Unexpected response ";
                stringExtra = String.valueOf(intent.getAction());
                Log.d(str, stringExtra.length() != 0 ? stringExtra2.concat(stringExtra) : new String(stringExtra2));
            }
        } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
            Log.d("InstanceID/Rpc", "Unexpected response: null");
        }
    }

    final Intent m32384a(Bundle bundle, KeyPair keyPair) {
        String a = C7129b.m32375a();
        C7131c c7131c = new C7131c();
        synchronized (this.f34852f) {
            this.f34852f.put(a, c7131c);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f34858m == 0 || elapsedRealtime > this.f34858m) {
            if (this.f34853g == null) {
                C7129b.m32376a(this.f34851e);
                this.f34853g = new Messenger(new C7141o(this, Looper.getMainLooper()));
            }
            if (f34846a == null) {
                throw new IOException("MISSING_INSTANCEID_SERVICE");
            }
            SystemClock.elapsedRealtime();
            Intent intent = new Intent(f34847b ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(f34846a);
            bundle.putString("gmsv", Integer.toString(FirebaseInstanceId.m32348a(this.f34851e, C7129b.m32376a(this.f34851e))));
            bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
            bundle.putString("app_ver", Integer.toString(FirebaseInstanceId.m32347a(this.f34851e)));
            bundle.putString("app_ver_name", FirebaseInstanceId.m32354b(this.f34851e));
            bundle.putString("cliv", "fiid-11200000");
            bundle.putString("appid", FirebaseInstanceId.m32350a(keyPair));
            bundle.putString("pub2", FirebaseInstanceId.m32351a(keyPair.getPublic().getEncoded()));
            bundle.putString("sig", C7129b.m32377a(keyPair, this.f34851e.getPackageName(), r0));
            intent.putExtras(bundle);
            C7129b.m32378a(this.f34851e, intent);
            SystemClock.elapsedRealtime();
            intent.putExtra("kid", new StringBuilder(String.valueOf(a).length() + 5).append("|ID|").append(a).append("|").toString());
            intent.putExtra("X-kid", new StringBuilder(String.valueOf(a).length() + 5).append("|ID|").append(a).append("|").toString());
            boolean equals = "com.google.android.gsf".equals(f34846a);
            if (Log.isLoggable("InstanceID/Rpc", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 8).append("Sending ").append(valueOf).toString());
            }
            if (equals) {
                synchronized (this) {
                    if (f34849d == null) {
                        f34849d = new C7142p(this);
                        if (Log.isLoggable("InstanceID/Rpc", 3)) {
                            Log.d("InstanceID/Rpc", "Registered GSF callback receiver");
                        }
                        IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
                        intentFilter.addCategory(this.f34851e.getPackageName());
                        this.f34851e.registerReceiver(f34849d, intentFilter, "com.google.android.c2dm.permission.SEND", null);
                    }
                }
                this.f34851e.startService(intent);
            } else {
                intent.putExtra("google.messenger", this.f34853g);
                if (!(this.f34854h == null && this.f34855i == null)) {
                    Message obtain = Message.obtain();
                    obtain.obj = intent;
                    try {
                        if (this.f34854h != null) {
                            this.f34854h.send(obtain);
                        } else {
                            MessengerCompat messengerCompat = this.f34855i;
                            if (messengerCompat.a != null) {
                                messengerCompat.a.send(obtain);
                            } else {
                                messengerCompat.b.a(obtain);
                            }
                        }
                    } catch (RemoteException e) {
                        if (Log.isLoggable("InstanceID/Rpc", 3)) {
                            Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                        }
                    }
                }
                if (f34847b) {
                    this.f34851e.sendBroadcast(intent);
                } else {
                    this.f34851e.startService(intent);
                }
            }
            try {
                if (!c7131c.f34859a.block(30000)) {
                    Log.w("InstanceID/Rpc", "No response");
                    throw new IOException("TIMEOUT");
                } else if (c7131c.f34861c != null) {
                    throw new IOException(c7131c.f34861c);
                } else {
                    Intent intent2 = c7131c.f34860b;
                    synchronized (this.f34852f) {
                        this.f34852f.remove(a);
                    }
                    return intent2;
                }
            } catch (Throwable th) {
                synchronized (this.f34852f) {
                    this.f34852f.remove(a);
                }
            }
        } else {
            Log.w("InstanceID/Rpc", "Backoff mode, next request attempt: " + (this.f34858m - elapsedRealtime) + " interval: " + this.f34857l);
            throw new IOException("RETRY_LATER");
        }
    }
}
