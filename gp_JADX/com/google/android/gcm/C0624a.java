package com.google.android.gcm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.util.Log;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class C0624a extends IntentService {
    public static WakeLock f4000b;
    public static final Object f4001c = C0624a.class;
    public static int f4002e = 0;
    public static final Random f4003f = new Random();
    public static final int f4004g = ((int) TimeUnit.SECONDS.toMillis(3600));
    public static final String f4005h = Long.toBinaryString(f4003f.nextLong());
    public final String[] f4006d;

    protected C0624a() {
        this(C0624a.m4285c("DynamicSenderIds"), null);
    }

    public abstract void mo1045a();

    public abstract void mo1046a(Intent intent);

    public abstract void mo1047a(String str);

    public abstract void mo1048b(String str);

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public C0624a(String... strArr) {
        this(C0624a.m4285c(C4882b.m22902a(strArr)), strArr);
    }

    private C0624a(String str, String[] strArr) {
        super(str);
        this.f4006d = strArr;
    }

    private static String m4285c(String str) {
        StringBuilder append = new StringBuilder("GCMIntentService-").append(str).append("-");
        int i = f4002e + 1;
        f4002e = i;
        String stringBuilder = append.append(i).toString();
        Log.v("GCMBaseIntentService", "Intent service name: " + stringBuilder);
        return stringBuilder;
    }

    public final void onHandleIntent(Intent intent) {
        Object obj = null;
        try {
            Context applicationContext = getApplicationContext();
            String action = intent.getAction();
            String stringExtra;
            Intent intent2;
            if (action.equals("com.google.android.c2dm.intent.REGISTRATION")) {
                C4882b.m22903a(applicationContext);
                stringExtra = intent.getStringExtra("registration_id");
                action = intent.getStringExtra("error");
                String stringExtra2 = intent.getStringExtra("unregistered");
                Log.d("GCMBaseIntentService", "handleRegistration: registrationId = " + stringExtra + ", error = " + action + ", unregistered = " + stringExtra2);
                if (stringExtra != null) {
                    C4882b.m22907c(applicationContext);
                    C4882b.m22901a(applicationContext, stringExtra);
                    mo1048b(stringExtra);
                } else if (stringExtra2 != null) {
                    C4882b.m22907c(applicationContext);
                    C4882b.m22901a(applicationContext, "");
                    mo1045a();
                } else {
                    Log.d("GCMBaseIntentService", "Registration error: " + action);
                    if ("SERVICE_NOT_AVAILABLE".equals(action)) {
                        int i = applicationContext.getSharedPreferences("com.google.android.gcm", 0).getInt("backoff_ms", 3000);
                        int nextInt = f4003f.nextInt(i) + (i / 2);
                        Log.d("GCMBaseIntentService", "Scheduling registration retry, backoff = " + nextInt + " (" + i + ")");
                        intent2 = new Intent("com.google.android.gcm.intent.RETRY");
                        intent2.putExtra("token", f4005h);
                        ((AlarmManager) applicationContext.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + ((long) nextInt), PendingIntent.getBroadcast(applicationContext, 0, intent2, 0));
                        if (i < f4004g) {
                            C4882b.m22904a(applicationContext, i * 2);
                        }
                    } else {
                        mo1047a(action);
                    }
                }
            } else if (action.equals("com.google.android.c2dm.intent.RECEIVE")) {
                stringExtra = intent.getStringExtra("message_type");
                if (stringExtra == null) {
                    mo1046a(intent);
                } else if (stringExtra.equals("deleted_messages")) {
                    stringExtra = intent.getStringExtra("total_deleted");
                    if (stringExtra != null) {
                        try {
                            Log.v("GCMBaseIntentService", "Received deleted messages notification: " + Integer.parseInt(stringExtra));
                        } catch (NumberFormatException e) {
                            Log.e("GCMBaseIntentService", "GCM returned invalid number of deleted messages: " + stringExtra);
                        }
                    }
                } else {
                    Log.e("GCMBaseIntentService", "Received unknown special message: " + stringExtra);
                }
            } else if (action.equals("com.google.android.gcm.intent.RETRY")) {
                action = intent.getStringExtra("token");
                if (f4005h.equals(action)) {
                    if (C4882b.m22906b(applicationContext).length() > 0) {
                        obj = 1;
                    }
                    if (obj != null) {
                        Log.v("GCMRegistrar", "Unregistering app " + applicationContext.getPackageName());
                        intent2 = new Intent("com.google.android.c2dm.intent.UNREGISTER");
                        intent2.setPackage("com.google.android.gsf");
                        intent2.putExtra("app", PendingIntent.getBroadcast(applicationContext, 0, new Intent(), 0));
                        applicationContext.startService(intent2);
                    } else if (this.f4006d == null) {
                        throw new IllegalStateException("sender id not set on constructor");
                    } else {
                        C4882b.m22905a(applicationContext, this.f4006d);
                    }
                } else {
                    Log.e("GCMBaseIntentService", "Received invalid token: " + action);
                    synchronized (f4001c) {
                        if (f4000b != null) {
                            Log.v("GCMBaseIntentService", "Releasing wakelock");
                            f4000b.release();
                        } else {
                            Log.e("GCMBaseIntentService", "Wakelock reference is null");
                        }
                    }
                    return;
                }
            }
            synchronized (f4001c) {
                if (f4000b != null) {
                    Log.v("GCMBaseIntentService", "Releasing wakelock");
                    f4000b.release();
                } else {
                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                }
            }
        } catch (Throwable th) {
            synchronized (f4001c) {
                if (f4000b != null) {
                    Log.v("GCMBaseIntentService", "Releasing wakelock");
                    f4000b.release();
                } else {
                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                }
            }
        }
    }
}
