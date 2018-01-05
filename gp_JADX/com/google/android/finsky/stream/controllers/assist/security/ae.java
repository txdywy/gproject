package com.google.android.finsky.stream.controllers.assist.security;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.finsky.p107l.C3646a;
import java.util.HashSet;
import java.util.Set;

final class ae {
    public final long f21787a;
    public final int f21788b;
    public final Set f21789c;

    public ae(Bundle bundle, C3646a c3646a, SecurityUtils securityUtils) {
        int i;
        int i2 = 0;
        Set hashSet = new HashSet();
        Parcelable[] parcelableArray = bundle.getParcelableArray("harmful_apps");
        int i3 = bundle.getInt("harmful_apps_count");
        for (i = 0; i < i3; i++) {
            Bundle bundle2 = (Bundle) parcelableArray[i];
            if (!securityUtils.m20044b(bundle2.getString("package_name"))) {
                hashSet.add(new C4316a(bundle2, c3646a, securityUtils));
            }
        }
        this.f21787a = bundle.getLong("last_scan_time_ms");
        this.f21789c = hashSet;
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("recently_removed_apps");
        if (parcelableArray2 != null) {
            int length = parcelableArray2.length;
            i = 0;
            while (i < length) {
                int i4;
                if (((Bundle) parcelableArray2[i]).getLong("removed_time_ms") >= this.f21787a) {
                    i4 = i2 + 1;
                } else {
                    i4 = i2;
                }
                i++;
                i2 = i4;
            }
        }
        this.f21788b = i2;
    }
}
