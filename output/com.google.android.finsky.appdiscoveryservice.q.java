package com.google.android.finsky.appdiscoveryservice;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.os.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.instantappscompatibility.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.a.a.c;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.appdiscoveryservice.q implements com.google.android.finsky.appdiscoveryservice.i
{

    public final com.google.android.finsky.instantappscompatibility.b a;

    q(com.google.android.finsky.instantappscompatibility.b p0) {
        this.a = p0;
    }

    public final Bundle a(Context p0, InstantAppInfo p1, com.google.wireless.android.finsky.dfe.a.a.c p2, String p3, int p4, int p5, int p6, byte[] p7, com.google.android.finsky.d.w p8) {
        v7 = com.google.android.finsky.appdiscoveryservice.j.b(this.a.e, p1).iterator();
        while (true) {
            if (!v7.hasNext()) {
                v0 = 0;
                return v0;
            }
            v0 = com.google.android.finsky.appdiscoveryservice.j.a(((ResolveInfo)v7.next()).activityInfo);
            if (v0 == 0)
                continue;
            v2 = com.google.android.finsky.appdiscoveryservice.j.a(p0, v0.metaData.getString("default-url"), p3, p4, p5, p6, p8);
            if (v2 != 0) {
                if (p1.a != 0)
                    v0 = p1.a.loadIcon(this.a.e);
                else if (!android.support.v4.os.a.b())
                    v0 = 0;
                else
                    v0 = this.a.e.getInstantAppIcon(p1.b);
                if (v0 instanceof BitmapDrawable)
                    v9 = ((BitmapDrawable)v0).getBitmap();
                else if (v0.getIntrinsicWidth() <= 0 || v0.getIntrinsicHeight() <= 0) {
                    FinskyLog.b("Invalid drawable. Icons must have a valid resolution.", new Object[0]);
                    v9 = 0;
                }
                else {
                    v1 = Bitmap.createBitmap(v0.getIntrinsicWidth(), v0.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
                    v0.draw(new Canvas(v1));
                    v9 = v1;
                }
                if (v9 == 0)
                    v0 = 0;
                else {
                    v8 = new Bundle();
                    v8.putParcelable("AppDiscoveryService.launchIntent", v2);
                    v8.putParcelable("AppDiscoveryService.installIntent", com.google.android.finsky.appdiscoveryservice.j.a(p0, p1.a(), p3, p4, p5, p6, 0, p8));
                    v8.putCharSequence("AppDiscoveryService.label", p1.a(this.a));
                    v8.putString("AppDiscoveryService.packageName", p1.a());
                    v8.putParcelable("AppDiscoveryService.launcherIcon", v9);
                    v8.putBoolean("AppDiscoveryService.isInstantApp", 1);
                    v8.putBoolean("AppDiscoveryService.isRecent", 1);
                    v8.putString("AppDiscoveryService.publisherName", p0.getString(2131952945));
                    v0 = v8;
                }
                return v0;
            }
        }
    }

    public final boolean a(InstantAppInfo p0) {
        return com.google.android.finsky.appdiscoveryservice.j.a(this.a.e, p0);
    }

}
