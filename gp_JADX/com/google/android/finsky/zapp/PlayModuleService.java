package com.google.android.finsky.zapp;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ae;
import com.google.android.finsky.utils.an;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.ArrayList;
import java.util.List;

public class PlayModuleService extends Service {
    public static final int f25112a = ((int) an.f24043f.mo4319a(10));
    public C4847e f25113b;
    public C2320a f25114c;
    public C1461c f25115d;
    public C1463g f25116e;
    public C1287h f25117f;
    public C3027b f25118g;
    public C0988c f25119h;

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    final C1552e m22627a() {
        return this.f25115d.dj();
    }

    final C2482j m22628b() {
        return this.f25116e.dc();
    }

    public void onCreate() {
        super.onCreate();
        ((C1451f) C3947d.m18649a(C1451f.class)).mo1998a(this);
        this.f25113b = new C4847e(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f25113b;
    }

    static boolean m22625a(String str) {
        return ae.m21693a(str, (String) C0955b.fP.m28964b());
    }

    static int[] m22626a(List list, String str) {
        int[] iArr = new int[0];
        if (list == null) {
            FinskyLog.m21667d("Null module bundle list is provided for extracting the supported compression/patch formats.", new Object[0]);
            return new int[0];
        }
        if (list.size() > 0 && ((Bundle) list.get(0)).getIntegerArrayList(str) != null) {
            ArrayList integerArrayList = ((Bundle) list.get(0)).getIntegerArrayList(str);
            int[] iArr2 = new int[integerArrayList.size()];
            for (int i = 0; i < integerArrayList.size(); i++) {
                iArr2[i] = ((Integer) integerArrayList.get(i)).intValue();
            }
            iArr = iArr2;
        }
        for (Bundle bundle : list) {
            String string;
            String str2;
            if (bundle.getIntegerArrayList(str) == null) {
                string = bundle.getString("name");
                if (str.equals("supported_compression_formats")) {
                    str2 = "compression";
                } else {
                    str2 = "patch";
                }
                FinskyLog.m21659a(new StringBuilder((String.valueOf(string).length() + 43) + String.valueOf(str2).length()).append("Module ").append(string).append(" does not report supported ").append(str2).append(" formats!").toString(), new Object[0]);
                return new int[0];
            } else if (bundle.getIntegerArrayList(str).size() != iArr.length) {
                string = str.equals("supported_compression_formats") ? "Compression" : "Patch";
                str2 = bundle.getString("name");
                FinskyLog.m21667d(new StringBuilder((String.valueOf(string).length() + 41) + String.valueOf(str2).length()).append(string).append(" format lengths do not match for module: ").append(str2).toString(), new Object[0]);
                return new int[0];
            } else {
                int length = iArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = iArr[i2];
                    if (bundle.getIntegerArrayList(str).contains(Integer.valueOf(i3))) {
                        i2++;
                    } else {
                        if (str.equals("supported_compression_formats")) {
                            string = "Compression";
                        } else {
                            string = "Patch";
                        }
                        str2 = bundle.getString("name");
                        FinskyLog.m21667d(new StringBuilder((String.valueOf(string).length() + 50) + String.valueOf(str2).length()).append(string).append(" format '").append(i3).append("' is not included for module: ").append(str2).toString(), new Object[0]);
                        return new int[0];
                    }
                }
            }
        }
        return iArr;
    }

    static long m22624a(C1552e c1552e) {
        if (c1552e.mo2294a(12620853)) {
            return 60000;
        }
        if (c1552e.mo2294a(12620854)) {
            return 30000;
        }
        if (c1552e.mo2294a(12620855)) {
            return 10000;
        }
        if (c1552e.mo2294a(12620856)) {
            return 5000;
        }
        if (c1552e.mo2294a(12620857)) {
            return 1000;
        }
        return ((Long) C0955b.fT.m28964b()).longValue();
    }
}
