package com.google.android.finsky.bb.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.d;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.h.a.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

static class com.google.android.finsky.bb.a.c
{

    public static final List a;

    static {
        com.google.android.finsky.bb.a.c.a = Collections.emptyList();
    }

    c() {
    }

    static List a(Context p0, com.google.android.finsky.bb.c p1) {
  0:    v1 = 1;
 20:    if (com.google.android.gms.common.d.d(p0) <= ((Integer)com.google.android.finsky.aa.b.eY.b()).intValue()) {
 26:        FinskyLog.d("GmsCore too old; cannot show family.", new Object[0]);
 29:        v0 = com.google.android.finsky.bb.a.c.a;
 31:        return v0;
        }
 32:    v6 = p1.j();
 36:    v7 = p1.g();
 67:    if (p0.getPackageManager().resolveActivity(new Intent("com.google.android.gms.family.v2.CREATE").setPackage((String)com.google.android.finsky.aa.b.eX.b()), 0) != 0 && com.google.android.gms.common.d.d(p0) >= ((Integer)com.google.android.finsky.aa.b.eZ.b()).intValue())
 87:        v0 = 1;
        else
104:        v0 = 0;
 88:    v8 = p1.b();
 92:    if (v8 == 0) {
 98:        FinskyLog.a("User setting not available", new Object[0]);
101:        v0 = com.google.android.finsky.bb.a.c.a;
103:        return v0;
        }
108:    v3 = new ArrayList();
119:    if (!p1.d())
121:        v1 = 0;
290:    else if (!p1.i())
292:        v1 = 2;
122:    if (v1 != 0)
128:        v3.add(Integer.valueOf(v1));
133:    switch (v8.b) {
            case 1:
133:            goto 301;
            case 2:
133:            goto 309;
            case 3:
133:            goto 298;
            case 4:
133:            goto 295;
            default:
        }
136:    v1 = 0;
137:    if (v1 == 4)
143:        v3.add(Integer.valueOf(v1));
332:    else if (v1 == 3 && v6 != 0 && v0 != 0)
342:        v3.add(Integer.valueOf(v1));
150:    if (p1.f()) {
156:        if (p1.d()) {
162:            if (p1.i())
164:                v1 = 5;
351:            else if (p1.e())
353:                v1 = 6;
                else
356:                v1 = 0;
            }
            else
356:            v1 = 0;
165:        if (v1 != 0)
171:            v3.add(Integer.valueOf(v1));
        }
178:    if (v7 != 0)
182:        v4 = "1";
        else
361:        v4 = "0";
183:    if (v0 != 0)
187:        v1 = "1";
        else
366:        v1 = "0";
188:    if (v6 != 0)
190:        v0 = "1";
        else
369:        v0 = "0";
192:    v6 = String.valueOf(v3);
280:    FinskyLog.a((String.valueOf(v4).length() + 38 + String.valueOf(v1).length() + String.valueOf(v0).length() + String.valueOf(v6).length()) + "FamilyOptions=" + v8.b + v8.e + v4 + v1 + v0 + "=>" + v6, new Object[0]);
283:    v0 = v3;
284:    return v0;
295:    v1 = 0;
296:    goto 137;
298:    v1 = 3;
299:    goto 137;
301:    if (v7 != 0)
303:        v1 = 4;
        else
306:        v1 = 3;
304:    goto 137;
311:    switch (v8.e) {
            case 1:
311:            goto 316;
            case 2:
311:            goto 314;
            case 3:
311:            goto 324;
            default:
        }
314:    goto 136;
316:    if (v7 != 0)
318:        v1 = 4;
        else
321:        v1 = 3;
319:    goto 137;
324:    if (p1.h())
326:        v1 = 3;
        else
329:        v1 = 0;
327:    goto 137;
    }

}
