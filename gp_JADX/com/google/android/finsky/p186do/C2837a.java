package com.google.android.finsky.p186do;

import android.content.Context;
import com.google.android.play.utils.C6324f;
import com.google.android.play.utils.p354b.C6321a;

public final class C2837a {
    public static final C6321a f15240b = C6321a.m28958a("finsky.dfe_request_timeout_2g_ms", Integer.valueOf(18000));
    public static final C6321a f15241c = C6321a.m28958a("finsky.dfe_request_timeout_3g_ms", Integer.valueOf(8000));
    public static final C6321a f15242d = C6321a.m28958a("finsky.dfe_request_timeout_4g_ms", Integer.valueOf(4000));
    public static final C6321a f15243e = C6321a.m28958a("finsky.dfe_request_timeout_wifi_ms", Integer.valueOf(4000));
    public final Context f15244a;

    public C2837a(Context context) {
        this.f15244a = context;
    }

    public final int m14993a() {
        switch (C6324f.m28966a(this.f15244a)) {
            case 1:
                return ((Integer) f15240b.m28964b()).intValue();
            case 2:
                return ((Integer) f15241c.m28964b()).intValue();
            case 3:
                return ((Integer) f15242d.m28964b()).intValue();
            case 4:
            case 6:
                return ((Integer) f15243e.m28964b()).intValue();
            default:
                return ((Integer) f15241c.m28964b()).intValue();
        }
    }
}
