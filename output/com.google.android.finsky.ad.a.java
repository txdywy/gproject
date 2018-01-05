package com.google.android.finsky.ad;

import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.ad.a
{

    public final com.google.android.finsky.ba.c a;

    a(com.google.android.finsky.ba.c p0) {
        this.a = p0;
    }

    private static void a(String p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.a("Bad config: %s", v1);
    }

    public final boolean a(String p0, long p1) {
 15:    if (!this.a.dj().a(12644763)) {
 17:        v0 = 1;
 18:        return v0;
        }
 25:    v0 = (String)com.google.android.finsky.aa.b.db.b();
 27:    v4 = com.google.android.finsky.utils.k.a(v0);
 32:    v3 = 0;
 33:    if (v3 >= v4.length) {
 93:        v0 = 1;
 94:        return v0;
        }
 39:    v6 = TextUtils.split(v4[v3], ":");
 44:    if (v6.length <= 0) goto 50;
 48:    if (v6.length <= 2) goto 56;
 50:    com.google.android.finsky.ad.a.a(v0);
 53:    v3 = v3 + 1;
 55:    goto 33;
 62:    if (!v6[0].equals(p0)) goto 53;
 65:    if (v6.length == 1) {
 67:        v0 = 0;
 68:        return v0;
        }
 82:    if (p1 >= Long.valueOf(v6[1]).longValue())
 84:        v0 = 1;
        else
 91:        v0 = 0;
 85:    return v0;
 87:    com.google.android.finsky.ad.a.a(v0);
 90:    goto 53;
 95:    try
            run 70...79
        catch (NumberFormatException ex) {
 70:        goto 86;
        }
    }

}
