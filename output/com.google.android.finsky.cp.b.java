package com.google.android.finsky.cp;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build$VERSION;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.cp.b implements Runnable
{

    public final com.google.android.finsky.cp.a a;
    public final String b;
    public final int c;
    public final String d;

    b(com.google.android.finsky.cp.a p0, String p1, int p2, String p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final void run() {
  8:    v2 = 0;
  9:    v1 = 0;
 18:    v7 = Uri.parse((String)com.google.android.finsky.aa.b.gl.b());
 24:    v0 = this.a.a.getPackageManager();
 33:    v8 = v0.resolveContentProvider(v7.getAuthority(), 0);
 37:    if (v8 == 0) {
 44:        FinskyLog.c("GooglePartnerSetup app not found", new Object[0]);
 51:        this.a.a(-6001, this.b, 0, 0);
 54:        v1 = 0;
        }
        else {
 61:        v0 = v0.getPackageInfo(v8.packageName, 0);
 71:        if (!(v0.applicationInfo.flags & 1)) {
 76:            v11 = new Object[2];
 81:            v11[0] = v8.packageName;
 88:            v11[1] = Integer.valueOf(v0.applicationInfo.flags);
 90:            FinskyLog.c("GooglePartnerSetup app (%s) isn't system, flags = %d", v11);
 96:            this.a.a(-6002, this.b, 0, v0);
 99:            v1 = 0;
            }
            else
101:            v1 = v0;
        }
 55:    if (v1 != 0) {
105:        v8 = new ContentValues();
110:        v8.put("package", this.b);
119:        v8.put("version_code", Integer.valueOf(this.c));
124:        v0 = -1;
129:        switch (this.d.hashCode()) {
                case 123399022:
206:                if (this.d.equals("bulk_install"))
208:                    v0 = 3;
288:                break;
                case 267487396:
196:                if (this.d.equals("single_install"))
198:                    v0 = 2;
288:                break;
                case 330290102:
186:                if (this.d.equals("restore_vpa"))
188:                    v0 = 1;
288:                break;
                case 1097519758:
176:                if (this.d.equals("restore"))
178:                    v0 = 0;
288:                break;
                default:
288:                break;
            }
132:        switch (v0) {
                case 0:
210:                v0 = "restore";
288:                break;
                case 1:
213:                v0 = "pai";
288:                break;
                case 2:
216:                v0 = "manual";
288:                break;
                case 3:
216:                v0 = "manual";
288:                break;
                default:
135:                v0 = "other";
288:                break;
            }
137:        v8.put("source", v0);
144:        if (Build$VERSION.SDK_INT >= 16)
152:            v2 = this.a.a.getContentResolver().acquireUnstableContentProviderClient(v7);
            else
225:            v2 = this.a.a.getContentResolver().acquireContentProviderClient(v7);
156:        v2.insert(v7, v8);
161:        this.a.a(0, this.b, 0, v1);
164:        if (v2 != 0)
166:            v2.release();
        }
 57:    return;
230:    v0 = ex;
231:    try {
234:        v6 = new Object[1];
237:        v6[0] = v0;
239:        FinskyLog.c("Old version of GooglePartnerSetup app: %s", v6);
244:        this.a.a(-6003, this.b, v0, v1);
        }
        catch (Throwable ex) {
276:        if (v2 != 0)
278:            v2.release();
281:        throw ex;
        }
247:    if (v2 != 0)
249:        v2.release();
252:    return;
255:    try {
260:        FinskyLog.a(ex, "Unexpected error when reporting app install source", new Object[0]);
265:        this.a.a(-6004, this.b, ex, v1);
        }
        catch (Throwable ex) {
276:        if (v2 != 0)
278:            v2.release();
281:        throw ex;
        }
268:    if (v2 != 0)
270:        v2.release();
273:    return;
276:    if (v2 != 0)
278:        v2.release();
281:    throw ex;
282:    v0 = ex;
283:    goto 231;
286:    try
            run 170...228
        catch (IllegalArgumentException ex) {
170:        goto 282;
        }
        catch (UnsupportedOperationException ex) {
170:        goto 230;
        }
        catch (Exception ex) {
170:        goto 254;
        }
        catch (Throwable ex) {
170:        goto 275;
        }
287:    try
            run 10...164
        catch (IllegalArgumentException ex) {
 10:        goto 282;
        }
        catch (UnsupportedOperationException ex) {
 10:        goto 230;
        }
        catch (Exception ex) {
 10:        goto 254;
        }
        catch (Throwable ex) {
 10:        goto 275;
        }
    }

}
