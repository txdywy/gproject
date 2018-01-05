package com.google.android.finsky.stream.myapps;

import android.content.Context;
import android.text.format.DateUtils;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p225k.C3640a;
import com.google.android.finsky.p226m.C3740a;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

public final class ab {
    public C2320a f23216a;

    public ab(C2320a c2320a) {
        this.f23216a = c2320a;
    }

    public final boolean m21146a(C3028c c3028c, Document document) {
        return c3028c.m15633a(this.f23216a.mo2854a(document.cf()), document);
    }

    public static String m21143a(Context context, Document document, C3640a c3640a) {
        return C1531a.m8956a(context, c3640a.m17234a(document.cf()));
    }

    public static String m21145a(Context context, Document document, C3741b c3741b) {
        C3740a a = c3741b.m17617a(document.cf());
        if (a == null) {
            return null;
        }
        long a2 = C4678i.m21812a();
        long j = a.f18883b;
        long j2 = a2 - j;
        if (j2 > 62899200000L) {
            return null;
        }
        if (j > a2) {
            FinskyLog.m21665c("Found future last-use timestamp", new Object[0]);
            return null;
        } else if (j2 < 60000) {
            return context.getResources().getString(C7582R.string.my_apps_last_used_moments_ago);
        } else {
            return context.getResources().getString(C7582R.string.my_apps_last_used, new Object[]{m21142a(context, j).toLowerCase(Locale.getDefault())});
        }
    }

    public static String m21144a(Context context, Document document, C3646a c3646a) {
        C2129c a = c3646a.f18022b.mo2657a(document.cf());
        if (a == null || a.f10821o <= 0) {
            return null;
        }
        String toLowerCase = m21142a(context, a.f10821o).toLowerCase(Locale.getDefault());
        return context.getResources().getString(C7582R.string.myapps_last_updated, new Object[]{toLowerCase});
    }

    private static String m21142a(Context context, long j) {
        long j2;
        long a = C4678i.m21812a();
        long j3 = a - j;
        if (j3 < 3600000) {
            j2 = 60000;
        } else if (j3 < 86400000) {
            j2 = 3600000;
        } else if (j3 < 604800000) {
            j2 = 86400000;
        } else if (j3 < 31449600000L) {
            j2 = 604800000;
        } else {
            return context.getResources().getString(C7582R.string.my_apps_years_ago, new Object[]{Long.valueOf(j3 / 31449600000L)});
        }
        return DateUtils.getRelativeTimeSpanString(j, a, j2, 262144).toString();
    }
}
