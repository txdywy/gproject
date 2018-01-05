package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.C4885a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.aq;

@Deprecated
public final class ba {
    public static final Object f25744a = new Object();
    public static ba f25745b;
    public final String f25746c;
    public final Status f25747d;
    public final boolean f25748e;

    private ba(Context context) {
        boolean z = true;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C4885a.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            boolean z2;
            if (resources.getInteger(identifier) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = false;
            }
            this.f25748e = z;
        } else {
            this.f25748e = false;
        }
        Object a = ac.m23718a(context);
        if (a == null) {
            aq aqVar = new aq(context);
            int identifier2 = aqVar.f25987a.getIdentifier("google_app_id", "string", aqVar.f25988b);
            a = identifier2 == 0 ? null : aqVar.f25987a.getString(identifier2);
        }
        if (TextUtils.isEmpty(a)) {
            this.f25747d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f25746c = null;
            return;
        }
        this.f25746c = a;
        this.f25747d = Status.f25625a;
    }

    public static Status m23472a(Context context) {
        Status status;
        am.m23734a((Object) context, (Object) "Context must not be null.");
        synchronized (f25744a) {
            if (f25745b == null) {
                f25745b = new ba(context);
            }
            status = f25745b.f25747d;
        }
        return status;
    }

    private static ba m23473a(String str) {
        ba baVar;
        synchronized (f25744a) {
            if (f25745b == null) {
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
            }
            baVar = f25745b;
        }
        return baVar;
    }

    public static String m23474a() {
        return m23473a("getGoogleAppId").f25746c;
    }

    public static boolean m23475b() {
        return m23473a("isMeasurementExplicitlyDisabled").f25748e;
    }
}
