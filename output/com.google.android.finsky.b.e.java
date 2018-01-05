package com.google.android.finsky.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Build$VERSION;
import com.android.volley.a.ah;
import com.android.volley.f;
import com.android.volley.n;
import com.google.android.finsky.api.y;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class com.google.android.finsky.b.e extends com.android.volley.a.ah
{

    public final com.google.android.finsky.d.g r;
    public final Context s;

    e(Context p0, String p1, com.google.android.finsky.b.d p2, com.google.android.finsky.b.a p3, com.android.volley.f p4, com.google.android.finsky.d.g p5) {
        com.android.volley.a.ah(p1, p2, p3, 0);
        this.s = p0;
        this.r = p5;
        this.m = p4;
    }

    public final Map h() {
  3:    v1 = new HashMap();
 60:    if (!this.s.getResources().getBoolean(2131492903)) goto 135;
 62:    v0 = "";
 69:    v8 = new Object[5];
 72:    v8[0] = com.google.android.finsky.api.y.a(Build$VERSION.RELEASE);
 75:    v8[1] = com.google.android.finsky.api.y.a(Build.MODEL);
 78:    v8[2] = com.google.android.finsky.api.y.a(Build.ID);
 81:    v8[3] = com.google.android.finsky.api.y.a(this.s.getPackageManager().getPackageInfo(this.s.getPackageName(), 0).versionName);
 84:    v8[4] = v0;
 92:    v1.put("User-Agent", String.format(Locale.US, "Mozilla/5.0 (Linux; Android %s; %s Build/%s) AppleWebKit/537.36 Finsky/%s%s", v8));
113:    if (!"https".equalsIgnoreCase(Uri.parse(this.d()).getScheme()))
131:        this.r.dc().a(new com.google.android.finsky.d.c(1106).a, 0);
134:    return v1;
135:    v0 = " Mobile";
137:    goto 64;
143:    FinskyLog.e("Can't find our own package", new Object[0]);
146:    goto 95;
147:    try
            run 135...137
        catch (PackageManager$NameNotFoundException ex) {
135:        goto 138;
        }
148:    try
            run 6...95
        catch (PackageManager$NameNotFoundException ex) {
  6:        goto 138;
        }
    }

}
