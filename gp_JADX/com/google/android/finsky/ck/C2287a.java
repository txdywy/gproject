package com.google.android.finsky.ck;

import android.content.Context;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C2287a {
    public final C1461c f11309a;
    public final Context f11310b;

    public C2287a(C1461c c1461c, Context context) {
        this.f11309a = c1461c;
        this.f11310b = context;
    }

    public final String m11783a(Document document) {
        FinskyLog.m21659a("Item is not available. Reason: %s", Integer.valueOf(document.af()));
        int i = C7582R.string.availability_restriction_generic;
        switch (document.af()) {
            case 2:
                i = C7582R.string.availability_restriction_country;
                break;
            case 8:
                i = C7582R.string.availability_restriction_not_in_group;
                break;
            case 9:
                return m11782b(document);
            case 10:
                i = C7582R.string.availability_restriction_carrier;
                break;
            case 11:
                i = C7582R.string.availability_restriction_country_or_carrier;
                break;
            case 12:
                i = C7582R.string.availability_restriction_search_level;
                break;
            case 21:
            case 24:
                i = C7582R.string.availability_restriction_for_managed_account;
                break;
            case 22:
                i = C7582R.string.availability_restriction_missing_permission;
                break;
            case 25:
                if (this.f11309a.dj().mo2294a(12626607)) {
                    return this.f11310b.getString(C7582R.string.availability_restriction_hardware_app_ram_generic);
                }
                return m11782b(document);
        }
        return this.f11310b.getString(i);
    }

    private final String m11782b(Document document) {
        if (document.f14885a.f12098e != 1) {
            return this.f11310b.getString(C7582R.string.availability_restriction_hardware);
        }
        return this.f11310b.getString(C7582R.string.availability_restriction_hardware_app);
    }
}
