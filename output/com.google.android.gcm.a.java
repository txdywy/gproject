package com.google.android.gcm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.PowerManager$WakeLock;
import android.os.SystemClock;
import android.util.Log;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class com.google.android.gcm.a extends IntentService
{

    public static PowerManager$WakeLock b;
    public static final Object c;
    public static int e;
    public static final Random f;
    public static final int g;
    public static final String h;
    public final String[] d;

    static {
        com.google.android.gcm.a.c = com.google.android.gcm.a;
        com.google.android.gcm.a.e = 0;
        com.google.android.gcm.a.f = new Random();
        com.google.android.gcm.a.g = (int)TimeUnit.SECONDS.toMillis(3600);
        com.google.android.gcm.a.h = Long.toBinaryString(com.google.android.gcm.a.f.nextLong());
    }

    a() {
        com.google.android.gcm.a(com.google.android.gcm.a.c("DynamicSenderIds"), 0);
    }

    a(String p0, String[] p1) {
        IntentService(p0);
        this.d = p1;
    }

    a(String[] p0) {
        com.google.android.gcm.a(com.google.android.gcm.a.c(com.google.android.gcm.b.a(p0)), p0);
    }

    private static String c(String p0) {
        com.google.android.gcm.a.e = com.google.android.gcm.a.e + 1;
        v0 = "GCMIntentService-" + p0 + "-" + (com.google.android.gcm.a.e + 1);
        Log.v("GCMBaseIntentService", "Intent service name: " + v0);
        return v0;
    }

    public abstract void a();

    public abstract void a(Intent p0);

    public abstract void a(String p0);

    public abstract void b(String p0);

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public final void onHandleIntent(Intent p0) {
  0:    v0 = 0;
  1:    v1 = this.getApplicationContext();
  5:    v2 = p0.getAction();
 15:    if (!v2.equals("com.google.android.c2dm.intent.REGISTRATION")) goto 288;
 17:    com.google.android.gcm.b.a(v1);
 22:    v0 = p0.getStringExtra("registration_id");
 28:    v2 = p0.getStringExtra("error");
 34:    v3 = p0.getStringExtra("unregistered");
 75:    Log.d("GCMBaseIntentService", "handleRegistration: registrationId = " + v0 + ", error = " + v2 + ", unregistered = " + v3);
 78:    if (v0 == 0) goto 110;
 80:    com.google.android.gcm.b.c(v1);
 83:    com.google.android.gcm.b.a(v1, v0);
 86:    this.b(v0);
 91:    enter com.google.android.gcm.a.c;
 94:    if (com.google.android.gcm.a.b == 0) goto 560;
100:    Log.v("GCMBaseIntentService", "Releasing wakelock");
105:    com.google.android.gcm.a.b.release();
108:    exit com.google.android.gcm.a.c;
109:    return;
110:    if (v3 == 0) goto 146;
112:    com.google.android.gcm.b.c(v1);
117:    com.google.android.gcm.b.a(v1, "");
120:    this.a();
123:    goto 89;
127:    enter com.google.android.gcm.a.c;
130:    if (com.google.android.gcm.a.b == 0) goto 572;
136:    Log.v("GCMBaseIntentService", "Releasing wakelock");
141:    com.google.android.gcm.a.b.release();
144:    exit com.google.android.gcm.a.c;
145:    throw ex;
163:    Log.d("GCMBaseIntentService", "Registration error: " + v2);
172:    if ("SERVICE_NOT_AVAILABLE".equals(v2)) {
185:        v2 = v1.getSharedPreferences("com.google.android.gcm", 0).getInt("backoff_ms", 3000);
197:        v3 = com.google.android.gcm.a.f.nextInt(v2) + v2 / 2;
231:        Log.d("GCMBaseIntentService", "Scheduling registration retry, backoff = " + v3 + " (" + v2 + ")");
238:        v0 = new Intent("com.google.android.gcm.intent.RETRY");
245:        v0.putExtra("token", com.google.android.gcm.a.h);
269:        ((AlarmManager)v1.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (long)v3, PendingIntent.getBroadcast(v1, 0, v0, 0));
274:        if (v2 < com.google.android.gcm.a.g)
278:            com.google.android.gcm.b.a(v1, v2 * 2);
        }
        else
283:        this.a(v2);
281:    goto 89;
294:    if (!v2.equals("com.google.android.c2dm.intent.RECEIVE")) goto 396;
298:    v0 = p0.getStringExtra("message_type");
302:    if (v0 == 0) goto 391;
310:    if (!v0.equals("deleted_messages")) goto 369;
314:    v0 = p0.getStringExtra("total_deleted");
318:    if (v0 == 0) goto 89;
341:    Log.v("GCMBaseIntentService", "Received deleted messages notification: " + Integer.parseInt(v0));
344:    goto 89;
364:    Log.e("GCMBaseIntentService", "GCM returned invalid number of deleted messages: " + v0);
367:    goto 89;
386:    Log.e("GCMBaseIntentService", "Received unknown special message: " + v0);
389:    goto 89;
391:    this.a(p0);
394:    goto 89;
402:    if (!v2.equals("com.google.android.gcm.intent.RETRY")) goto 89;
406:    v2 = p0.getStringExtra("token");
416:    if (!com.google.android.gcm.a.h.equals(v2)) {
435:        Log.e("GCMBaseIntentService", "Received invalid token: " + v2);
440:        enter com.google.android.gcm.a.c;
441:        try {
443:            if (com.google.android.gcm.a.b != 0) {
449:                Log.v("GCMBaseIntentService", "Releasing wakelock");
454:                com.google.android.gcm.a.b.release();
                }
                else {
463:                try {
467:                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                    }
                    catch (Throwable ex) {
461:                    exit com.google.android.gcm.a.c;
462:                    throw ex;
                    }
                }
457:            exit com.google.android.gcm.a.c;
458:            return;
461:            exit com.google.android.gcm.a.c;
            }
            catch (Throwable ex) {
461:            exit com.google.android.gcm.a.c;
462:            throw ex;
            }
        }
479:    if (com.google.android.gcm.b.b(v1).length() > 0)
481:        v0 = 1;
482:    if (v0 != 0) {
505:        Log.v("GCMRegistrar", "Unregistering app " + v1.getPackageName());
512:        v0 = new Intent("com.google.android.c2dm.intent.UNREGISTER");
517:        v0.setPackage("com.google.android.gsf");
533:        v0.putExtra("app", PendingIntent.getBroadcast(v1, 0, new Intent(), 0));
536:        v1.startService(v0);
        }
        else {
543:        if (this.d == 0)
552:            throw new IllegalStateException("sender id not set on constructor");
555:        com.google.android.gcm.b.a(v1, this.d);
        }
539:    goto 89;
564:    Log.e("GCMBaseIntentService", "Wakelock reference is null");
567:    goto 108;
570:    exit com.google.android.gcm.a.c;
571:    throw ex;
576:    Log.e("GCMBaseIntentService", "Wakelock reference is null");
579:    goto 144;
582:    exit com.google.android.gcm.a.c;
583:    throw ex;
584:    try
            run 572...583
        catch (Throwable ex) {
572:        goto 581;
        }
585:    try
            run 560...571
        catch (Throwable ex) {
560:        goto 569;
        }
586:    try
            run 471...558
        catch (Throwable ex) {
471:        goto 124;
        }
589:    try
            run 347...438
        catch (Throwable ex) {
347:        goto 124;
        }
590:    try
            run 320...344
        catch (NumberFormatException ex) {
320:        goto 346;
        }
        catch (Throwable ex) {
320:        goto 124;
        }
591:    try
            run 146...317
        catch (Throwable ex) {
146:        goto 124;
        }
592:    try
            run 128...145
        catch (Throwable ex) {
128:        goto 581;
        }
593:    try
            run 112...123
        catch (Throwable ex) {
112:        goto 124;
        }
594:    try
            run 92...109
        catch (Throwable ex) {
 92:        goto 569;
        }
595:    try
            run 1...89
        catch (Throwable ex) {
  1:        goto 124;
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
