package com.google.android.finsky.notification;

import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.utils.ad;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class C3820u {
    public final String f19148a;
    public final Bundle f19149b;
    public final Uri f19150c;
    public final Map f19151d;

    C3820u(String str, Bundle bundle, Map map, Uri uri) {
        this.f19148a = str;
        this.f19149b = bundle;
        this.f19151d = map;
        this.f19150c = uri;
    }

    public C3820u(C3820u c3820u) {
        this.f19148a = c3820u.f19148a;
        this.f19149b = VERSION.SDK_INT >= 26 ? c3820u.f19149b.deepCopy() : c3820u.f19149b;
        this.f19151d = new HashMap(c3820u.f19151d);
        this.f19150c = c3820u.f19150c;
    }

    public final int m18264a(String str) {
        return ((Integer) this.f19151d.get(str)).intValue();
    }

    public static C3821v m18263b(String str) {
        return new C3821v(str);
    }

    public static C3821v m18262a(C3820u c3820u) {
        return new C3821v(c3820u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3820u c3820u = (C3820u) obj;
        if (ad.m21692a(this.f19148a, c3820u.f19148a) && ad.m21692a(this.f19149b.toString(), c3820u.f19149b.toString()) && ad.m21692a(this.f19150c, c3820u.f19150c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19148a, this.f19149b, this.f19150c});
    }

    public final String toString() {
        return String.format("NotificationIntentData{mIntentId='%s', mExtras='%s', mDataUri='%s'}", new Object[]{this.f19148a, this.f19149b, this.f19150c});
    }
}
