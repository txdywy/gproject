package com.google.android.finsky.appdiscoveryservice;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.a.a.c;
import com.squareup.leakcanary.C7582R;

public final class C1338t implements C1327i {
    public final PackageManager f7841a;

    public C1338t(PackageManager packageManager) {
        this.f7841a = packageManager;
    }

    public final Bundle mo1689a(Context context, InstantAppInfo instantAppInfo, c cVar, String str, int i, int i2, int i3, byte[] bArr, C2495w c2495w) {
        if (cVar == null) {
            FinskyLog.m21667d("Server suggestion unexpectedly null.", new Object[0]);
            return null;
        }
        Object obj;
        Bundle bundle = new Bundle();
        bundle.putParcelable("AppDiscoveryService.installIntent", C1328j.m7804a(context, cVar.c, str, i, i2, i3, bArr, c2495w));
        bundle.putCharSequence("AppDiscoveryService.label", cVar.d);
        bundle.putString("AppDiscoveryService.packageName", cVar.c);
        if (cVar.h != null) {
            if (((cVar.h.a & 1) != 0 ? 1 : null) != null) {
                bundle.putFloat("AppDiscoveryService.reviewScore", cVar.h.b);
            }
        }
        if (cVar.g != null) {
            if (((cVar.g.a & 1) != 0 ? 1 : null) != null) {
                obj = 1;
                if (obj == null) {
                    bundle.putBoolean("AppDiscoveryService.isInstantApp", true);
                    bundle.putParcelable("AppDiscoveryService.launchIntent", C1328j.m7803a(context, cVar.g.b, str, i, i2, i3, c2495w));
                    bundle.putString("AppDiscoveryService.publisherName", context.getString(C7582R.string.publisher_name_instant_app));
                    bundle.putString("AppDiscoveryService.formattedPrice", context.getString(C7582R.string.instant_app_discovery_price));
                } else {
                    bundle.putBoolean("AppDiscoveryService.isInstantApp", false);
                    if (cVar.i != null) {
                        if (((cVar.i.a & 1) == 0 ? 1 : null) != null) {
                            bundle.putString("AppDiscoveryService.formattedPrice", cVar.i.b);
                        }
                    }
                }
                if (((cVar.b & 8) == 0 ? 1 : null) != null) {
                    bundle.putByteArray("AppDiscoveryService.private.serverLogsCookie", cVar.j);
                }
                bundle.putBoolean("AppDiscoveryService.isRecent", false);
                return bundle;
            }
        }
        obj = null;
        if (obj == null) {
            bundle.putBoolean("AppDiscoveryService.isInstantApp", false);
            if (cVar.i != null) {
                if ((cVar.i.a & 1) == 0) {
                }
                if (((cVar.i.a & 1) == 0 ? 1 : null) != null) {
                    bundle.putString("AppDiscoveryService.formattedPrice", cVar.i.b);
                }
            }
        } else {
            bundle.putBoolean("AppDiscoveryService.isInstantApp", true);
            bundle.putParcelable("AppDiscoveryService.launchIntent", C1328j.m7803a(context, cVar.g.b, str, i, i2, i3, c2495w));
            bundle.putString("AppDiscoveryService.publisherName", context.getString(C7582R.string.publisher_name_instant_app));
            bundle.putString("AppDiscoveryService.formattedPrice", context.getString(C7582R.string.instant_app_discovery_price));
        }
        if ((cVar.b & 8) == 0) {
        }
        if (((cVar.b & 8) == 0 ? 1 : null) != null) {
            bundle.putByteArray("AppDiscoveryService.private.serverLogsCookie", cVar.j);
        }
        bundle.putBoolean("AppDiscoveryService.isRecent", false);
        return bundle;
    }

    public final boolean mo1690a(InstantAppInfo instantAppInfo) {
        return C1328j.m7806a(this.f7841a, instantAppInfo);
    }
}
