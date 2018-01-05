package com.google.android.finsky.p264x.p265a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.google.android.finsky.cv.p177a.ao;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p264x.C4806a;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.utils.C4688t;

public final class C4807a implements C4806a {
    public final Context f25081a;
    public final C1467c f25082b;
    public final C3028c f25083c;

    public C4807a(Context context, C1467c c1467c, C3028c c3028c) {
        this.f25081a = context;
        this.f25082b = c1467c;
        this.f25083c = c3028c;
    }

    public final boolean mo4395a(String[] strArr, ao[] aoVarArr) {
        int i;
        int i2;
        if (VERSION.SDK_INT >= 21) {
            if (aoVarArr.length == 0 || strArr.length == 0 || strArr.length > aoVarArr.length) {
                return false;
            }
            i = 0;
            while (i < strArr.length) {
                i2 = 0;
                while (i2 < aoVarArr.length) {
                    if (strArr[i].equals(aoVarArr[i2].f11822b[0])) {
                        i++;
                    } else {
                        i2++;
                    }
                }
                return false;
            }
            return true;
        } else if (aoVarArr.length == 0 || strArr.length == 0) {
            return false;
        } else {
            i = 0;
            while (i < strArr.length) {
                for (i2 = 0; i2 < aoVarArr.length; i2++) {
                    int i3 = 0;
                    while (i3 < aoVarArr[i2].f11822b.length) {
                        if (strArr[i].equals(aoVarArr[i2].f11822b[i3])) {
                            i++;
                        } else {
                            i3++;
                        }
                    }
                }
                return false;
            }
            return true;
        }
    }

    public final boolean mo4394a(Document document) {
        if (!this.f25082b.ds() || this.f25083c.m15634a(document)) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f25081a.getPackageManager().getPackageInfo(document.f14885a.f12096c, 4202560);
            int length = packageInfo.signatures.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = C4688t.m21838a(packageInfo.signatures[i].toByteArray());
            }
            if (mo4395a(strArr, document.m14625N().f13176p)) {
                return false;
            }
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
