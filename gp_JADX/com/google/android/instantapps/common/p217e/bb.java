package com.google.android.instantapps.common.p217e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.phenotype.C5315c;
import com.google.android.gms.phenotype.C5502b;
import com.google.android.gms.phenotype.C5553l;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p318g.C5771a;
import com.google.android.instantapps.p309a.C5699f;
import com.google.android.p306h.p307a.p308a.C5664a;
import java.io.File;

public final class bb {
    public static final C5804k f29068a = new C5804k("ExperimentUpdateService");
    public final Context f29069b;
    public final C5710a f29070c;
    public final C5315c f29071d;
    public final C5771a f29072e;
    public final C5743e f29073f;
    public final bf f29074g;
    public final String f29075h;

    bb(Context context, C5710a c5710a, C5315c c5315c, C5771a c5771a, C5743e c5743e, bf bfVar, String str) {
        this.f29069b = context;
        this.f29070c = c5710a;
        this.f29071d = c5315c;
        this.f29072e = c5771a;
        this.f29073f = c5743e;
        this.f29074g = bfVar;
        this.f29075h = str;
        f29068a.m27209b("MendelPackageName = %s", str);
    }

    public final void m27103a() {
        this.f29070c.mo5136a(1804);
        C5743e c5743e = this.f29073f;
        String c = m27105c();
        C5699f.m26959a((Object) c);
        C5058o b = new C5089p(c5743e.f29135a).m23647a(C5502b.f28324c).m23652b();
        b.mo4558f();
        C5744f c5744f = c5743e.f29136b;
        C5553l c5745g = new C5745g(c5744f, b, c5744f.f29141b);
        am.m23733a((Object) c);
        if (c5745g.m26539a(c, 3)) {
            c5743e.f29137c.m27037a(b, C5502b.f28325d);
        } else {
            c5743e.f29139e.mo5136a(1807);
        }
        b.mo4559g();
    }

    public static boolean m27101a(Context context) {
        return new File(context.getFilesDir(), "FlagsSynced").exists();
    }

    public final C5664a m27104b() {
        C5664a c5664a = new C5664a();
        c5664a.f28722a = Integer.valueOf(m27102a("com.google.android.instantapps.supervisor"));
        c5664a.f28723b = Integer.valueOf(m27102a("com.android.vending"));
        return c5664a;
    }

    public final String m27105c() {
        if (!((Boolean) this.f29074g.mo5158a()).booleanValue()) {
            return m27106d().getString("storedCurrentAccount", "");
        }
        String str = this.f29072e.f29178a;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        m27106d().edit().putString("storedCurrentAccount", str).apply();
        return str;
    }

    public final SharedPreferences m27106d() {
        return this.f29069b.getSharedPreferences("InstantAppFlagUpdated.storedCurrentAccount", 0);
    }

    public final int m27102a(String str) {
        int i = 0;
        try {
            return this.f29069b.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (NameNotFoundException e) {
            return i;
        }
    }
}
