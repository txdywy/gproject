package com.google.android.finsky.instantapps.p212d;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.instantapps.AppManagementService;
import com.google.android.finsky.instantapps.appmanagement.C3394m;
import com.google.android.finsky.instantapps.p218e.C3453i;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.instantapps.p288b.C5261a;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p221d.p222a.af;
import com.google.android.p306h.p307a.p308a.C5684u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class C3425c {
    public final Handler f17546a = new Handler(Looper.getMainLooper());
    public final af f17547b;
    public final bf f17548c;
    public final bf f17549d;
    public final C3394m f17550e;
    public final C5785k f17551f;
    public final PackageManager f17552g;
    public final C3600b f17553h;
    public final C3453i f17554i;
    public final Activity f17555j;
    public C3436m f17556k;

    public C3425c(bf bfVar, bf bfVar2, C3394m c3394m, C5785k c5785k, PackageManager packageManager, C3600b c3600b, C3453i c3453i, Activity activity, af afVar) {
        this.f17547b = afVar;
        this.f17548c = bfVar;
        this.f17549d = bfVar2;
        this.f17550e = c3394m;
        this.f17551f = c5785k;
        this.f17552g = packageManager;
        this.f17553h = c3600b;
        this.f17554i = c3453i;
        this.f17555j = activity;
    }

    public final void m16969a(C3436m c3436m) {
        C5684u c5684u = new C5684u();
        c5684u.f28824d = c3436m.m16986e();
        this.f17547b.mo5138a(c5684u);
        if (Log.isLoggable("GoToWebDelegate", 2)) {
            Log.v("GoToWebDelegate", String.format("Handling go to web Intent for package: %s, version: %d", new Object[]{c3436m.m16986e(), c3436m.m16987f()}));
        }
        if (c3436m.m16985d()) {
            this.f17556k = c3436m;
            String e = this.f17556k.m16986e();
            if (((Boolean) this.f17549d.mo5158a()).booleanValue()) {
                ArrayList arrayList;
                int i;
                C3394m c3394m = this.f17550e;
                long a = C4678i.m21812a();
                String string = c3394m.f17395a.getString(e, null);
                ArrayList arrayList2 = new ArrayList();
                if (string != null) {
                    arrayList = new ArrayList(Arrays.asList(string.split(",")));
                    if (arrayList.size() == ((Integer) c3394m.f17396b.mo5158a()).intValue()) {
                        arrayList.remove(0);
                    }
                } else {
                    arrayList = arrayList2;
                }
                arrayList.add(String.valueOf(a));
                c3394m.f17395a.edit().putString(e, TextUtils.join(",", arrayList)).apply();
                if (arrayList.size() < ((Integer) c3394m.f17396b.mo5158a()).intValue() || Long.valueOf(Long.parseLong((String) arrayList.get(((Integer) c3394m.f17396b.mo5158a()).intValue() - 1)) - Long.parseLong((String) arrayList.get(0))).longValue() >= ((Long) c3394m.f17397c.mo5158a()).longValue()) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i != 0) {
                    this.f17554i.mo3530a(Collections.singletonList(e), new C3427d(this));
                    return;
                }
            }
            m16971a(e, Long.valueOf(((Long) this.f17548c.mo5158a()).longValue() + C4678i.m21812a()));
            m16970a(e);
            return;
        }
        Log.e("GoToWebDelegate", "Incorrectly formed intent received for GoToWebIntent");
        this.f17555j.finish();
    }

    final void m16970a(String str) {
        boolean z;
        try {
            this.f17552g.getPackageInfo(str, 8388608);
            z = true;
        } catch (NameNotFoundException e) {
            z = false;
        }
        if (z) {
            this.f17553h.m17195a(str, true);
            AppManagementService.m16829a(this.f17555j, str);
        }
        try {
            this.f17556k.m16981a(this.f17555j);
        } catch (SendIntentException e2) {
            Log.e("GoToWebDelegate", "Failed to start the go to web intent. Continuing to finish.");
        }
        this.f17555j.finish();
    }

    final void m16971a(String str, Long l) {
        C1643x c3432i = new C3432i(str, l);
        this.f17551f.m27188a(C5261a.m24088a(str, l.longValue()), true, c3432i);
    }
}
