package com.google.android.finsky.notification;

import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.utils.ad;
import com.google.android.finsky.utils.aj;
import java.util.Arrays;

public final class C3816o {
    public final Integer f19140a;
    public final bd f19141b;
    public final String f19142c;

    private C3816o(Integer num, bd bdVar, String str) {
        this.f19140a = num;
        this.f19141b = bdVar;
        this.f19142c = str;
    }

    public static C3816o m18254a(int i) {
        return new C3816o(Integer.valueOf(i), null, null);
    }

    public static C3816o m18255a(bd bdVar) {
        return new C3816o(null, (bd) aj.m21700a(bdVar), null);
    }

    public static C3816o m18256a(String str) {
        return new C3816o(null, null, (String) aj.m21700a(str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3816o c3816o = (C3816o) obj;
        if (ad.m21692a(this.f19140a, c3816o.f19140a) && ad.m21692a(this.f19141b, c3816o.f19141b) && ad.m21692a(this.f19142c, c3816o.f19142c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19140a, this.f19141b, this.f19142c});
    }

    public final String toString() {
        return String.format("NotificationImage{mDrawableResId='%s', mFinskyImage='%s', mPackageName='%s'}", new Object[]{this.f19140a, this.f19141b, this.f19142c});
    }
}
