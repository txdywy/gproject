package com.google.android.finsky.appdiscoveryservice;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.C0327a;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.a.a.c;
import com.squareup.leakcanary.C7582R;

public final class C1335q implements C1327i {
    public final C3600b f7838a;

    C1335q(C3600b c3600b) {
        this.f7838a = c3600b;
    }

    public final Bundle mo1689a(Context context, InstantAppInfo instantAppInfo, c cVar, String str, int i, int i2, int i3, byte[] bArr, C2495w c2495w) {
        for (ResolveInfo resolveInfo : C1328j.m7807b(this.f7838a.f17918e, instantAppInfo)) {
            ActivityInfo a = C1328j.m7805a(resolveInfo.activityInfo);
            if (a != null) {
                Parcelable a2 = C1328j.m7803a(context, a.metaData.getString("default-url"), str, i, i2, i3, c2495w);
                if (a2 != null) {
                    Drawable loadIcon;
                    Parcelable bitmap;
                    C3600b c3600b = this.f7838a;
                    if (instantAppInfo.f17909a != null) {
                        loadIcon = instantAppInfo.f17909a.loadIcon(c3600b.f17918e);
                    } else {
                        String str2 = instantAppInfo.f17910b;
                        if (C0327a.m1722b()) {
                            loadIcon = c3600b.f17918e.getInstantAppIcon(str2);
                        } else {
                            loadIcon = null;
                        }
                    }
                    if (loadIcon instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) loadIcon).getBitmap();
                    } else if (loadIcon.getIntrinsicWidth() <= 0 || loadIcon.getIntrinsicHeight() <= 0) {
                        FinskyLog.m21662b("Invalid drawable. Icons must have a valid resolution.", new Object[0]);
                        bitmap = null;
                    } else {
                        Bitmap createBitmap = Bitmap.createBitmap(loadIcon.getIntrinsicWidth(), loadIcon.getIntrinsicHeight(), Config.ARGB_8888);
                        loadIcon.draw(new Canvas(createBitmap));
                        Object obj = createBitmap;
                    }
                    if (bitmap == null) {
                        return null;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("AppDiscoveryService.launchIntent", a2);
                    bundle.putParcelable("AppDiscoveryService.installIntent", C1328j.m7804a(context, instantAppInfo.m17188a(), str, i, i2, i3, null, c2495w));
                    bundle.putCharSequence("AppDiscoveryService.label", instantAppInfo.m17187a(this.f7838a));
                    bundle.putString("AppDiscoveryService.packageName", instantAppInfo.m17188a());
                    bundle.putParcelable("AppDiscoveryService.launcherIcon", bitmap);
                    bundle.putBoolean("AppDiscoveryService.isInstantApp", true);
                    bundle.putBoolean("AppDiscoveryService.isRecent", true);
                    bundle.putString("AppDiscoveryService.publisherName", context.getString(C7582R.string.publisher_name_instant_app));
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean mo1690a(InstantAppInfo instantAppInfo) {
        return C1328j.m7806a(this.f7838a.f17918e, instantAppInfo);
    }
}
