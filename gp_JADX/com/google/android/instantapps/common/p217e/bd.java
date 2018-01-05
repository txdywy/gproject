package com.google.android.instantapps.common.p217e;

import android.os.Build.VERSION;
import android.os.SystemProperties;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p315b.C5703a;
import com.google.android.instantapps.p309a.p311b.p312a.C5694a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class bd {
    public static final C5804k f29083a = new C5804k("PreOEnableAIAChecker");
    public static final SimpleDateFormat f29084b = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public final bf f29085c;
    public final bf f29086d;
    public final C5710a f29087e;
    public final C5694a f29088f;
    public final bs f29089g;
    public final C5748j f29090h;

    bd(bf bfVar, bf bfVar2, C5710a c5710a, C5748j c5748j, bs bsVar) {
        this(bfVar, bfVar2, c5710a, c5748j, C5703a.f28864a, bsVar);
    }

    private bd(bf bfVar, bf bfVar2, C5710a c5710a, C5748j c5748j, C5694a c5694a, bs bsVar) {
        this.f29085c = bfVar;
        this.f29086d = bfVar2;
        this.f29087e = c5710a;
        this.f29090h = c5748j;
        this.f29088f = c5694a;
        this.f29089g = bsVar;
    }

    public static boolean m27108a() {
        return Boolean.parseBoolean(SystemProperties.get("debug.instantapps.ignore_kill", "false"));
    }

    public final boolean m27109b() {
        int intValue = ((Integer) this.f29086d.mo5158a()).intValue();
        if (intValue <= 0) {
            return true;
        }
        String str;
        if (VERSION.SDK_INT >= 23) {
            str = VERSION.SECURITY_PATCH;
        } else {
            str = SystemProperties.get("ro.build.version.security_patch", "");
        }
        try {
            if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - f29084b.parse(str).getTime()) <= ((long) intValue)) {
                return true;
            }
            f29083a.m27207a("Security patch age %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - f29084b.parse(str).getTime())));
            this.f29087e.mo5136a(1309);
            return false;
        } catch (Throwable e) {
            f29083a.m27208a(e, "Invalid SECURITY_PATCH \"%s\"", str);
            this.f29087e.mo5136a(1308);
            return false;
        }
    }
}
