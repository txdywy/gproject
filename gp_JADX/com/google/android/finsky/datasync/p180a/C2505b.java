package com.google.android.finsky.datasync.p180a;

import android.content.Context;
import com.android.volley.C0700r;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.datasync.C2502q;
import com.google.android.finsky.datasync.C2504r;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.datasync.C2534x;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import java.util.List;

public final class C2505b implements C2504r {
    public final C0700r f13480a;
    public final C2531s f13481b;
    public final C1287h f13482c;
    public final C1461c f13483d;
    public final C2534x f13484e;
    public final ai f13485f;
    public final C2910a f13486g;

    public C2505b(C0700r c0700r, C2531s c2531s, C1287h c1287h, C1461c c1461c, C2534x c2534x, ai aiVar, C2910a c2910a) {
        this.f13480a = c0700r;
        this.f13481b = c2531s;
        this.f13482c = c1287h;
        this.f13483d = c1461c;
        this.f13484e = c2534x;
        this.f13485f = aiVar;
        this.f13486g = c2910a;
    }

    public final C2502q mo2922a(Context context, String str, List list, List list2, long j) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -1694333857:
                if (str.equals("SYNC_DFE")) {
                    obj = 2;
                    break;
                }
                break;
            case -1294709604:
                if (str.equals("SYNC_IMAGES")) {
                    obj = 3;
                    break;
                }
                break;
            case -965428673:
                if (str.equals("SYNC_SUCCESS")) {
                    obj = 4;
                    break;
                }
                break;
            case 1020795795:
                if (str.equals("REFRESH_USER_SETTINGS")) {
                    obj = 1;
                    break;
                }
                break;
            case 1550493187:
                if (str.equals("FETCH_TOC")) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                return new C2507d(list, j, this.f13481b, this.f13482c, this.f13483d, this.f13485f);
            case 1:
                return new C2508e(list, j, this.f13486g, this.f13481b, this.f13483d, this.f13485f);
            case 2:
                return new C2510g(list, list2, j, this.f13484e.m13487a("dfe"), this.f13482c, this.f13481b, this.f13483d, this.f13485f);
            case 3:
                return new C2512i(list, list2, j, this.f13484e.m13487a("fife"), this.f13480a, this.f13481b.m13478a(), this.f13481b, this.f13483d, this.f13485f);
            case 4:
                return new C2513j(list, j, this.f13482c, this.f13481b, this.f13483d, this.f13485f);
            default:
                this.f13481b.m13479a(context);
                FinskyLog.m21669e("[Cache and Sync] Unknown task.", new Object[0]);
                return null;
        }
    }
}
