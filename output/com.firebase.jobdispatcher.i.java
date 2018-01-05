package com.firebase.jobdispatcher;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.h.u;
import java.util.List;

public final class com.firebase.jobdispatcher.i implements com.firebase.jobdispatcher.c
{

    public final com.firebase.jobdispatcher.ak a;
    public final Context b;
    public final PendingIntent c;
    public final com.firebase.jobdispatcher.k d;

    i(Context p0) {
        this.b = p0;
        this.c = PendingIntent.getBroadcast(p0, 0, new Intent(), 0);
        this.d = new com.firebase.jobdispatcher.k();
        this.a = new com.firebase.jobdispatcher.b(p0);
    }

    private final Intent a(String p0) {
        v0 = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        v0.setPackage("com.google.android.gms");
        v0.putExtra("scheduler_action", p0);
        v0.putExtra("app", this.c);
        v0.putExtra("source", 8);
        v0.putExtra("source_version", 1);
        return v0;
    }

    public final int a() {
        v1 = this.a("CANCEL_ALL");
        v1.putExtra("component", new ComponentName(this.b, GooglePlayReceiver));
        this.b.sendBroadcast(v1);
        return 0;
    }

    public final int a(com.firebase.jobdispatcher.t p0) {
  1:    v2 = 1;
  5:    enter GooglePlayReceiver.g;
 14:    v0 = (android.support.v4.h.u)GooglePlayReceiver.g.get(p0.a);
 16:    if (v0 != 0) goto 215;
 18:    exit GooglePlayReceiver.g;
 23:    v7 = this.a("SCHEDULE_TASK");
 29:    v9 = v7.getExtras();
 39:    v9.putString("tag", p0.e());
 48:    v9.putBoolean("update_current", p0.d());
 55:    if (p0.g() == 2)
 57:        v0 = 1;
        else
259:        v0 = 0;
 60:    v9.putBoolean("persisted", v0);
 71:    v9.putString("service", GooglePlayReceiver.getName());
 74:    v0 = p0.f();
 80:    if (v0 == com.firebase.jobdispatcher.ao.a) {
 84:        v9.putInt("trigger_type", 2);
 91:        v9.putLong("window_start", 0);
 98:        v9.putLong("window_end", 1);
        }
264:    else if (v0 instanceof com.firebase.jobdispatcher.ai) {
270:        v9.putInt("trigger_type", 1);
277:        if (p0.h()) {
284:            v9.putLong("period", (long)((com.firebase.jobdispatcher.ai)v0).b);
296:            v9.putLong("period_flex", (long)(((com.firebase.jobdispatcher.ai)v0).b - ((com.firebase.jobdispatcher.ai)v0).a));
            }
            else {
306:            v9.putLong("window_start", (long)((com.firebase.jobdispatcher.ai)v0).a);
314:            v9.putLong("window_end", (long)((com.firebase.jobdispatcher.ai)v0).b);
            }
        }
        else {
321:        if (!(v0 instanceof com.firebase.jobdispatcher.ah)) {
382:            v0 = String.valueOf(v0.getClass());
418:            throw new IllegalArgumentException((String.valueOf(v0).length() + 17) + "Unknown trigger: " + v0);
            }
328:        v9.putInt("trigger_type", 3);
333:        v10 = ((com.firebase.jobdispatcher.ah)v0).a.size();
337:        v11 = new int[v10];
339:        v12 = new Uri[v10];
341:        v5 = 0;
342:        while (v5 < v10) {
350:            v1 = (com.firebase.jobdispatcher.al)((com.firebase.jobdispatcher.ah)v0).a.get(v5);
354:            v11[v5] = v1.b;
358:            v12[v5] = v1.a;
362:            v5 = v5 + 1;
            }
366:        v9.putIntArray("content_uri_flags_array", v11);
371:        v9.putParcelableArray("content_uri_array", v12);
        }
105:    v1 = com.firebase.jobdispatcher.a.a(p0.a());
114:    if ((v1 & 4) == 4)
116:        v0 = 1;
        else
419:        v0 = 0;
117:    v9.putBoolean("requiresCharging", v0);
126:    if ((v1 & 8) == 8)
128:        v0 = 1;
        else
422:        v0 = 0;
129:    v9.putBoolean("requiresIdle", v0);
136:    if ((v1 & 2) == 2)
138:        v0 = 0;
        else
425:        v0 = 2;
141:    if ((v1 & 1) == 1)
143:        v0 = 1;
144:    v9.putInt("requiredNetwork", v0);
147:    v0 = p0.c();
153:    v1 = new Bundle();
160:    switch (v0.b) {
            case 2:
164:            v1.putInt("retry_policy", v2);
171:            v1.putInt("initial_backoff_seconds", v0.c);
178:            v1.putInt("maximum_backoff_seconds", v0.d);
183:            v9.putBundle("retryStrategy", v1);
186:            v0 = p0.b();
190:            if (v0 == 0)
194:                v0 = new Bundle();
205:            v9.putBundle("extras", this.d.a.a(p0, v0));
208:            v7.putExtras(v9);
211:            this.b.sendBroadcast(v7);
214:            return 0;
            default:
430:            break;
        }
163:    v2 = 0;
223:    if ((com.firebase.jobdispatcher.v)v0.get(p0.b) == 0)
225:        exit GooglePlayReceiver.g;
        else {
231:        try {
233:            v0 = new com.firebase.jobdispatcher.y();
238:            v0.a = p0.b;
242:            v0.b = p0.a;
246:            v0.c = p0.c;
253:            com.firebase.jobdispatcher.d.a(v0.a(), 0);
256:            exit GooglePlayReceiver.g;
            }
            catch (Throwable ex) {
229:            exit GooglePlayReceiver.g;
230:            throw ex;
            }
        }
226:    goto 19;
229:    exit GooglePlayReceiver.g;
230:    throw ex;
428:    try
            run 215...230
        catch (Throwable ex) {
215:        goto 228;
        }
429:    try
            run 6...19
        catch (Throwable ex) {
  6:        goto 228;
        }
    }

    public final com.firebase.jobdispatcher.ak b() {
        return this.a;
    }

    public final boolean c() {
        return 1;
    }

}
