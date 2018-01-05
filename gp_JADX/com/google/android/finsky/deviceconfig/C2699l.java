package com.google.android.finsky.deviceconfig;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5106e;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.p276b.C4971a;
import java.io.IOException;

public final class C2699l {
    public static String m14576a(Context context, C2495w c2495w) {
        Throwable e;
        String str = null;
        int a = C5106e.m23700a(context);
        if (a != 0) {
            C2699l.m14577a(c2495w, a, null);
            FinskyLog.m21667d("Unable to fetch checkin consistency token: GooglePlayServices is unavailable %d", Integer.valueOf(a));
        } else {
            try {
                am.m23745c("Calling this from your main thread can lead to deadlock.");
                str = C4971a.m23113a(context, C4971a.m23112a(context));
                if (TextUtils.isEmpty(str)) {
                    C2699l.m14577a(c2495w, 1001, null);
                    FinskyLog.m21667d("Unable to fetch checkin consistency token: empty token", new Object[0]);
                }
            } catch (GooglePlayServicesRepairableException e2) {
                e = e2;
                C2699l.m14577a(c2495w, 1000, e);
                FinskyLog.m21660a(e, "Unable to fetch checkin consistency token", new Object[0]);
                return str;
            } catch (GooglePlayServicesNotAvailableException e3) {
                e = e3;
                C2699l.m14577a(c2495w, 1000, e);
                FinskyLog.m21660a(e, "Unable to fetch checkin consistency token", new Object[0]);
                return str;
            } catch (IOException e4) {
                e = e4;
                C2699l.m14577a(c2495w, 1000, e);
                FinskyLog.m21660a(e, "Unable to fetch checkin consistency token", new Object[0]);
                return str;
            }
        }
        return str;
    }

    private static void m14577a(C2495w c2495w, int i, Throwable th) {
        if (((Boolean) C0955b.gI.m28964b()).booleanValue() && c2495w != null) {
            C2474c a = new C2474c(167).m13210a(i);
            if (th != null) {
                a.m13238a(th);
            }
            c2495w.m13367a(a);
        }
    }
}
