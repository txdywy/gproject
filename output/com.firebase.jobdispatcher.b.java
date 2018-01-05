package com.firebase.jobdispatcher;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class com.firebase.jobdispatcher.b implements com.firebase.jobdispatcher.ak
{

    public final Context a;

    b(Context p0) {
        this.a = p0;
    }

    private static List a(String p0) {
        v0 = new ArrayList();
        v0.add(p0);
        return v0;
    }

    private static List a(List p0, String p1) {
        if (p1 != 0) {
            if (p0 == 0)
                p0 = com.firebase.jobdispatcher.b.a(p1);
            else {
                v0 = new String[1];
                v0[0] = p1;
                Collections.addAll(p0, v0);
            }
        }
        return p0;
    }

    private static List a(List p0, List p1) {
        if (p0 == 0)
            p0 = p1;
        else if (p1 != 0)
            p0.addAll(p1);
        return p0;
    }

    private static List a(boolean p0, List p1, String p2) {
        if (p0 != 0)
            p1 = com.firebase.jobdispatcher.b.a(p1, p2);
        return p1;
    }

    public final List a(com.firebase.jobdispatcher.z p0) {
  5:    v1 = 0;
  6:    v0 = p0.f();
 12:    if (v0 != com.firebase.jobdispatcher.ao.a && !(v0 instanceof com.firebase.jobdispatcher.ai) && !(v0 instanceof com.firebase.jobdispatcher.ah))
 24:        v0 = com.firebase.jobdispatcher.b.a("Unknown trigger provided");
        else
226:        v0 = 0;
 28:    v4 = com.firebase.jobdispatcher.b.a(0, v0);
 32:    v0 = p0.c();
 38:    v6 = v0.c;
 40:    v7 = v0.d;
 42:    if (v0.b != 1 && v0.b != 2)
 46:        v0 = 1;
        else
229:        v0 = 0;
 49:    v5 = com.firebase.jobdispatcher.b.a(v0, 0, "Unknown retry policy provided");
 53:    if (v7 < v6)
 55:        v0 = 1;
        else
232:        v0 = 0;
 58:    v5 = com.firebase.jobdispatcher.b.a(v0, v5, "Maximum backoff must be greater than or equal to initial backoff");
 64:    if (300 > v7)
 66:        v0 = 1;
        else
235:        v0 = 0;
 69:    v5 = com.firebase.jobdispatcher.b.a(v0, v5, "Maximum backoff must be greater than 300s (5 minutes)");
 75:    if (v6 < 30)
 77:        v0 = 1;
        else
238:        v0 = 0;
 84:    v0 = com.firebase.jobdispatcher.b.a(v4, com.firebase.jobdispatcher.b.a(v0, v5, "Initial backoff must be at least 30s"));
 92:    if (p0.h() && p0.f() == com.firebase.jobdispatcher.ao.a)
104:        v0 = com.firebase.jobdispatcher.b.a(v0, "ImmediateTriggers can't be used with recurring jobs");
108:    v4 = p0.b();
112:    if (v4 == 0) goto 241;
114:    v5 = Parcel.obtain();
118:    v4.writeToParcel(v5, 0);
121:    v4 = v5.dataSize();
125:    v5.recycle();
128:    if (v4 <= 10240) goto 241;
134:    v7 = new Object[2];
140:    v7[0] = Integer.valueOf(v4);
146:    v7[1] = Integer.valueOf(10240);
152:    v4 = com.firebase.jobdispatcher.b.a(String.format(Locale.US, "Extras too large: %d bytes is > the max (%d bytes)", v7));
156:    v6 = com.firebase.jobdispatcher.b.a(v0, v4);
164:    if (p0.g() <= 1) goto 462;
166:    v7 = p0.b();
170:    if (v7 == 0) {
266:        v4 = 0;
267:        v0 = com.firebase.jobdispatcher.b.a(v6, v4);
271:        v2 = p0.e();
275:        if (v2 == 0)
279:            v2 = com.firebase.jobdispatcher.b.a("Tag can't be null");
316:        else if (v2.length() > 100)
320:            v2 = com.firebase.jobdispatcher.b.a("Tag must be shorter than 100");
            else
325:            v2 = 0;
287:        v4 = p0.i();
291:        if (v4 == 0) {
301:            v1 = com.firebase.jobdispatcher.b.a("Service can't be empty");
309:            return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
            }
297:        if (v4.isEmpty())
301:            v1 = com.firebase.jobdispatcher.b.a("Service can't be empty");
            else {
329:            if (this.a == 0) {
333:                v1 = com.firebase.jobdispatcher.b.a("Context is null, can't query PackageManager");
337:                return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
                }
340:            v0 = this.a.getPackageManager();
344:            if (v0 == 0) {
348:                v1 = com.firebase.jobdispatcher.b.a("PackageManager is null, can't validate service");
352:                return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
                }
357:            v5 = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
362:            v5.setClassName(this.a, v4);
365:            v0 = v0.queryIntentServices(v5, 0);
369:            if (v0 == 0 || v0.isEmpty()) {
398:                v0 = new StringBuilder(String.valueOf(v4).length() + 145).append("Couldn't find a registered service with the name ").append(v4);
414:                Log.e("FJD.GooglePlayReceiver", v0.append(". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.").toString());
417:                return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
                }
418:            v3 = v0.iterator();
422:            while (v3.hasNext()) {
432:                v0 = (ResolveInfo)v3.next();
436:                if (v0.serviceInfo == 0)
436:                    continue;
442:                if (v0.serviceInfo.enabled != 0)
444:                    return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
                }
456:            v1 = com.firebase.jobdispatcher.b.a(String.valueOf(v4).concat(" is disabled."));
            }
309:        return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
        }
176:    v8 = v7.keySet().iterator();
180:    v4 = 0;
181:    while (v8.hasNext()) {
191:        v0 = (String)v8.next();
193:        v5 = v7.get(v0);
197:        if (v5 == 0 || (v5 instanceof Integer) || (v5 instanceof Long) || (v5 instanceof Double) || (v5 instanceof String) || v5 instanceof Boolean)
219:            v0 = 0;
            else {
247:            v11 = new Object[2];
249:            if (v5 == 0)
251:                v5 = 0;
                else
261:                v5 = v5.getClass();
252:            v11[0] = v5;
254:            v11[1] = v0;
256:            v0 = String.format(Locale.US, "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean", v11);
            }
224:        v4 = com.firebase.jobdispatcher.b.a(v4, v0);
        }
225:    goto 267;
241:    v4 = 0;
242:    goto 156;
266:    v4 = 0;
267:    v0 = com.firebase.jobdispatcher.b.a(v6, v4);
271:    v2 = p0.e();
275:    if (v2 == 0)
279:        v2 = com.firebase.jobdispatcher.b.a("Tag can't be null");
316:    else if (v2.length() > 100)
320:        v2 = com.firebase.jobdispatcher.b.a("Tag must be shorter than 100");
        else
325:        v2 = 0;
287:    v4 = p0.i();
291:    if (v4 == 0) {
301:        v1 = com.firebase.jobdispatcher.b.a("Service can't be empty");
309:        return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
        }
297:    if (v4.isEmpty())
301:        v1 = com.firebase.jobdispatcher.b.a("Service can't be empty");
        else {
329:        if (this.a == 0) {
333:            v1 = com.firebase.jobdispatcher.b.a("Context is null, can't query PackageManager");
337:            return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
            }
340:        v0 = this.a.getPackageManager();
344:        if (v0 == 0) {
348:            v1 = com.firebase.jobdispatcher.b.a("PackageManager is null, can't validate service");
352:            return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
            }
357:        v5 = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
362:        v5.setClassName(this.a, v4);
365:        v0 = v0.queryIntentServices(v5, 0);
369:        if (v0 == 0 || v0.isEmpty()) {
398:            v0 = new StringBuilder(String.valueOf(v4).length() + 145).append("Couldn't find a registered service with the name ").append(v4);
414:            Log.e("FJD.GooglePlayReceiver", v0.append(". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.").toString());
417:            return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
            }
418:        v3 = v0.iterator();
422:        while (v3.hasNext()) {
432:            v0 = (ResolveInfo)v3.next();
436:            if (v0.serviceInfo == 0)
436:                continue;
442:            if (v0.serviceInfo.enabled != 0)
444:                return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
            }
456:        v1 = com.firebase.jobdispatcher.b.a(String.valueOf(v4).concat(" is disabled."));
        }
309:    return com.firebase.jobdispatcher.b.a(com.firebase.jobdispatcher.b.a(v0, v2), v1);
462:    v0 = v6;
463:    goto 271;
    }

}
