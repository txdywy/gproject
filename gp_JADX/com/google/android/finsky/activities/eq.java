package com.google.android.finsky.activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.finsky.activities.myapps.C1118r;
import com.google.android.finsky.activities.myapps.C1120t;
import com.google.android.finsky.at.C1507b;
import com.google.android.finsky.at.C1509c;
import com.google.android.finsky.cv.p177a.lx;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.C1061b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.uninstall.UninstallManagerActivityV2;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

final class eq implements C1061b {
    public final /* synthetic */ MainActivity f6769a;

    eq(MainActivity mainActivity) {
        this.f6769a = mainActivity;
    }

    public final boolean mo1351a(String str, String str2, String str3, String str4, C2495w c2495w) {
        Document u = this.f6769a.f6361G.mo3718u();
        if (u == null) {
            return false;
        }
        if (!u.f14885a.f12096c.equals(str)) {
            boolean z;
            String str5 = u.f14885a.f12116w;
            if (str4 == null || str5 == null) {
                z = false;
            } else {
                z = TextUtils.equals(Uri.parse(str4).getQueryParameter("doc"), Uri.parse(str5).getQueryParameter("doc"));
            }
            if (!z) {
                return false;
            }
        }
        this.f6769a.mo1238a(str2, str3, c2495w);
        return true;
    }

    public final boolean mo1350a(String str, String str2, String str3, int i, C2495w c2495w) {
        if (!m6538b(str)) {
            return false;
        }
        this.f6769a.m6184a(str2, str3, i, str, c2495w);
        return true;
    }

    public final boolean mo1352a(ArrayList arrayList, C2495w c2495w) {
        this.f6769a.startActivity(UninstallManagerActivityV2.m21251a(arrayList, c2495w, false));
        return true;
    }

    public final boolean mo1353b(String str, String str2, String str3, int i, C2495w c2495w) {
        if (!m6538b(str)) {
            return false;
        }
        ((C1507b) ((C1509c) ((C1509c) ((C1509c) ((C1509c) ((C1509c) ((C1509c) new C1509c().m8859c(str2)).m8856b(str3)).m8860d((int) C7582R.string.view_storage_button_text)).m8862e((int) C7582R.string.cancel)).m8851a(null, i, null)).m8849a(324, null, 2904, 2903, c2495w)).mo2272a()).m8846a(this.f6769a.H_());
        return true;
    }

    public final boolean mo1349a(String str) {
        Document u = this.f6769a.f6361G.mo3718u();
        if (u == null) {
            return true;
        }
        switch (u.f14885a.f12099f) {
            case 3:
                if (u.m14625N().f13171k.equals(str)) {
                    return false;
                }
                return true;
            case 4:
                if (!u.m14637Z()) {
                    return true;
                }
                for (lx lxVar : u.aa()) {
                    if (lxVar.f13074c.equals(str)) {
                        return false;
                    }
                }
                return true;
            default:
                return true;
        }
    }

    public final boolean mo1348a() {
        Fragment k = this.f6769a.f6361G.mo3709k();
        if (k instanceof C1120t) {
            Object obj;
            C1120t c1120t = (C1120t) k;
            if (c1120t.ai != null) {
                C1118r c1118r = c1120t.ai;
                if (c1118r.m6837e() == c1118r.f7058i) {
                    obj = 1;
                    if (obj != null) {
                        return true;
                    }
                }
            }
            obj = null;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean m6538b(String str) {
        Document u = this.f6769a.f6361G.mo3718u();
        if (u == null) {
            return false;
        }
        switch (u.f14885a.f12099f) {
            case 3:
                return u.m14625N().f13171k.equals(str);
            case 4:
                if (!u.m14637Z()) {
                    return false;
                }
                for (lx lxVar : u.aa()) {
                    if (lxVar.f13074c.equals(str)) {
                        return true;
                    }
                }
                return false;
            default:
                return false;
        }
    }
}
