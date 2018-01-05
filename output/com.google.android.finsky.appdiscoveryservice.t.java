package com.google.android.finsky.appdiscoveryservice;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.finsky.d.w;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.a.a.c;
import com.google.wireless.android.finsky.dfe.a.a.d;
import com.google.wireless.android.finsky.dfe.a.a.e;
import com.google.wireless.android.finsky.dfe.a.a.k;

public final class com.google.android.finsky.appdiscoveryservice.t implements com.google.android.finsky.appdiscoveryservice.i
{

    public final PackageManager a;

    t(PackageManager p0) {
        this.a = p0;
    }

    public final Bundle a(Context p0, InstantAppInfo p1, com.google.wireless.android.finsky.dfe.a.a.c p2, String p3, int p4, int p5, int p6, byte[] p7, com.google.android.finsky.d.w p8) {
  0:    if (p2 == 0) {
  7:        FinskyLog.d("Server suggestion unexpectedly null.", new Object[0]);
 10:        v0 = 0;
 11:        return v0;
        }
 14:    v8 = new Bundle();
 36:    v8.putParcelable("AppDiscoveryService.installIntent", com.google.android.finsky.appdiscoveryservice.j.a(p0, p2.c, p3, p4, p5, p6, p7, p8));
 43:    v8.putCharSequence("AppDiscoveryService.label", p2.d);
 50:    v8.putString("AppDiscoveryService.packageName", p2.c);
 55:    if (p2.h != 0) {
 63:        if (p2.h.a & 1)
 65:            v0 = 1;
            else
172:            v0 = 0;
 66:        if (v0 != 0)
 74:            v8.putFloat("AppDiscoveryService.reviewScore", p2.h.b);
        }
 79:    if (p2.g == 0) goto 176;
 87:    if (p2.g.a & 1)
 89:        v0 = 1;
        else
174:        v0 = 0;
 90:    if (v0 == 0) goto 176;
 92:    v0 = 1;
 93:    if (v0 != 0) {
 98:        v8.putBoolean("AppDiscoveryService.isInstantApp", 1);
120:        v8.putParcelable("AppDiscoveryService.launchIntent", com.google.android.finsky.appdiscoveryservice.j.a(p0, p2.g.b, p3, p4, p5, p6, p8));
132:        v8.putString("AppDiscoveryService.publisherName", p0.getString(2131952945));
144:        v8.putString("AppDiscoveryService.formattedPrice", p0.getString(2131952325));
        }
        else {
181:        v8.putBoolean("AppDiscoveryService.isInstantApp", 0);
186:        if (p2.i != 0) {
194:            if (p2.i.a & 1)
196:                v0 = 1;
                else
209:                v0 = 0;
197:            if (v0 != 0)
205:                v8.putString("AppDiscoveryService.formattedPrice", p2.i.b);
            }
        }
151:    if (p2.b & 8)
153:        v0 = 1;
        else
211:        v0 = 0;
154:    if (v0 != 0)
160:        v8.putByteArray("AppDiscoveryService.private.serverLogsCookie", p2.j);
166:    v8.putBoolean("AppDiscoveryService.isRecent", 0);
169:    v0 = v8;
170:    return v0;
176:    v0 = 0;
177:    goto 93;
    }

    public final boolean a(InstantAppInfo p0) {
        return com.google.android.finsky.appdiscoveryservice.j.a(this.a, p0);
    }

}
