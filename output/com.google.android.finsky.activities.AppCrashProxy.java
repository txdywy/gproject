package com.google.android.finsky.activities;

import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.as.a;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import java.util.List;

public class AppCrashProxy extends Activity
{

    AppCrashProxy() {
        Activity();
    }

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

    public void onCreate(Bundle p0) {
  2:    v4 = 1;
  4:    super.onCreate(p0);
  7:    v5 = this.getIntent();
 11:    v5.setComponent(0);
 20:    v0 = (String)com.google.android.finsky.aa.b.eV.b();
 28:    v6 = com.google.android.finsky.m.a.L().a(v0);
 32:    v7 = this.getPackageManager();
 36:    v5.setPackage(v0);
 45:    v1 = (ApplicationErrorReport)v5.getParcelableExtra("android.intent.extra.BUG_REPORT");
 47:    if (v6 != 0) goto 105;
 51:    v2 = new Object[1];
 53:    v2[0] = v0;
 55:    FinskyLog.c("Feedback package %s not installed", v2);
 58:    if (v4 != 0) {
 68:        if (!com.google.android.finsky.as.a.a(com.google.android.finsky.m.a.b)) {
289:            v5.setPackage((String)com.google.android.finsky.aa.b.eW.b());
292:            this.startActivity(v5);
295:            this.finish();
298:            return;
            }
 91:        com.google.android.finsky.m.a.f(com.google.android.finsky.m.a.cZ()).a(new com.google.android.finsky.d.c(15).a, 0);
 98:        FinskyLog.d("Legacy reporting package unavailable on TV; Log in BackgroundEvent.", new Object[0]);
101:        this.finish();
104:        return;
        }
 59:    goto 300;
107:    if (v6.i == 0) goto 119;
111:    v2 = new Object[1];
113:    v2[0] = v0;
115:    FinskyLog.c("Feedback package %s disabled", v2);
118:    goto 58;
133:    if (v6.d >= ((Integer)com.google.android.finsky.aa.b.eU.b()).intValue()) goto 153;
137:    v2 = new Object[2];
139:    v2[0] = v0;
147:    v2[1] = Integer.valueOf(v6.d);
149:    FinskyLog.a("Feedback package %s version %d too old", v2);
152:    goto 58;
161:    if (v7.queryBroadcastReceivers(v5, 0).size() >= 0) goto 173;
165:    v2 = new Object[1];
167:    v2[0] = v0;
169:    FinskyLog.c("No receiver found in %s", v2);
172:    goto 58;
173:    if (v1 != 0) goto 183;
179:    FinskyLog.c("Crash report missing", new Object[0]);
182:    goto 58;
189:    if (!TextUtils.isEmpty(v1.packageName)) goto 200;
195:    FinskyLog.c("Crash bug report missing package name", new Object[0]);
198:    goto 58;
209:    v6 = v7.getPackagesForUid(v7.getApplicationInfo(v6.a, 0).uid);
214:    v2 = 0;
215:    if (v2 >= v6.length) goto 317;
217:    v8 = v6[v2];
225:    if (!v1.packageName.equals(v8)) goto 264;
230:    v6 = new Object[2];
233:    v6[0] = v8;
236:    v6[1] = v0;
238:    FinskyLog.c("Package %s has crashed but is related to feedback package %s", v6);
241:    v2 = 1;
242:    if (v2 != 0) goto 315;
247:    v6 = new Object[2];
252:    v6[0] = v1.packageName;
255:    v6[1] = v0;
257:    FinskyLog.a("Sending feedback for crashed %s to %s", v6);
260:    v0 = 0;
261:    v4 = v0;
262:    goto 58;
264:    v2 = v2 + 1;
266:    goto 215;
268:    v1 = 1;
271:    v4 = new Object[1];
273:    v4[0] = v0;
275:    FinskyLog.e("Exception, feedback package %s not found", v4);
278:    v4 = v1;
279:    goto 58;
289:    v5.setPackage((String)com.google.android.finsky.aa.b.eW.b());
292:    this.startActivity(v5);
295:    this.finish();
298:    return;
308:    v5.setPackage((String)com.google.android.finsky.aa.b.eV.b());
311:    goto 292;
313:    v1 = 0;
314:    goto 269;
315:    v0 = 1;
316:    goto 261;
317:    v2 = 0;
318:    goto 242;
319:    try
            run 244...260
        catch (PackageManager$NameNotFoundException ex) {
244:        goto 312;
        }
320:    try
            run 200...241
        catch (PackageManager$NameNotFoundException ex) {
200:        goto 267;
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
