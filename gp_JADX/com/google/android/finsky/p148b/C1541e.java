package com.google.android.finsky.p148b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import com.android.volley.C0690f;
import com.android.volley.p060a.ah;
import com.google.android.finsky.api.C1301y;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class C1541e extends ah {
    public final C1463g f8286r;
    public final Context f8287s;

    C1541e(Context context, String str, C1540d c1540d, C1537a c1537a, C0690f c0690f, C1463g c1463g) {
        super(str, c1540d, c1537a, (byte) 0);
        this.f8287s = context;
        this.f8286r = c1463g;
        this.f4038m = c0690f;
    }

    public final Map mo1547h() {
        Map hashMap = new HashMap();
        try {
            PackageInfo packageInfo = this.f8287s.getPackageManager().getPackageInfo(this.f8287s.getPackageName(), 0);
            boolean z = this.f8287s.getResources().getBoolean(C7582R.bool.use_wide_layout);
            String a = C1301y.m7756a(VERSION.RELEASE);
            String a2 = C1301y.m7756a(Build.MODEL);
            String a3 = C1301y.m7756a(Build.ID);
            String a4 = C1301y.m7756a(packageInfo.versionName);
            String str = z ? "" : " Mobile";
            hashMap.put("User-Agent", String.format(Locale.US, "Mozilla/5.0 (Linux; Android %s; %s Build/%s) AppleWebKit/537.36 Finsky/%s%s", new Object[]{a, a2, a3, a4, str}));
        } catch (NameNotFoundException e) {
            FinskyLog.m21669e("Can't find our own package", new Object[0]);
        }
        if (!"https".equalsIgnoreCase(Uri.parse(mo1545d()).getScheme())) {
            this.f8286r.dc().m13319a(new C2474c(1106).f13342a, null);
        }
        return hashMap;
    }
}
