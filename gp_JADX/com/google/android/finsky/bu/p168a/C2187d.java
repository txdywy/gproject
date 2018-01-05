package com.google.android.finsky.bu.p168a;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bu.C2186a;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import me.leolin.shortcutbadger.b;

public final class C2187d implements C2186a {
    public final Context f10972a;
    public final boolean f10973b;

    public C2187d(Context context) {
        this.f10972a = context;
        boolean z = !m11476b() && m11475a();
        this.f10973b = z;
    }

    public final boolean mo2776a(int i) {
        boolean z = false;
        if (this.f10973b) {
            try {
                z = b.a(this.f10972a, i);
            } catch (Throwable th) {
                FinskyLog.m21660a(th, "Badge icon count application failed.", new Object[z]);
            }
        }
        return z;
    }

    private final boolean m11475a() {
        boolean z = false;
        try {
            z = b.a(this.f10972a);
        } catch (Throwable th) {
            FinskyLog.m21660a(th, "Badge counter support check failed.", new Object[z]);
        }
        return z;
    }

    private final boolean m11476b() {
        for (String packageInfo : Arrays.asList(C4680k.m21818a((String) C0955b.jK.m28964b()))) {
            try {
                this.f10972a.getPackageManager().getPackageInfo(packageInfo, 0);
                return true;
            } catch (NameNotFoundException e) {
            }
        }
        return false;
    }
}
