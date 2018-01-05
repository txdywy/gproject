package com.google.android.finsky.bu.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.leolin.shortcutbadger.b;

public final class com.google.android.finsky.bu.a.d implements com.google.android.finsky.bu.a
{

    public final Context a;
    public final boolean b;

    d(Context p0) {
        this.a = p0;
        if (!this.b() && this.a())
            v0 = 1;
        else
            v0 = 0;
        this.b = v0;
    }

    private final boolean a() {
        v0 = 0;
        try {
            v0 = me.leolin.shortcutbadger.b.a(this.a);
        }
        catch (Throwable ex) {
            FinskyLog.a(ex, "Badge counter support check failed.", new Object[0]);
        }
        return v0;
    }

    private final boolean b() {
 17:    v2 = Arrays.asList(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.jK.b())).iterator();
 25:    if (!v2.hasNext()) {
 45:        v0 = 0;
 46:        return v0;
        }
 40:    this.a.getPackageManager().getPackageInfo((String)v2.next(), 0);
 43:    v0 = 1;
 44:    return v0;
 48:    goto 21;
 49:    try
            run 33...43
        catch (PackageManager$NameNotFoundException ex) {
 33:        goto 47;
        }
    }

    public final boolean a(int p0) {
        v0 = 0;
        if (this.b != 0) {
            try {
                v0 = me.leolin.shortcutbadger.b.a(this.a, p0);
            }
            catch (Throwable ex) {
                FinskyLog.a(ex, "Badge icon count application failed.", new Object[0]);
            }
        }
        return v0;
    }

}
