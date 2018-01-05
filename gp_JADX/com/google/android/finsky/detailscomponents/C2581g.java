package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.finsky.af.C1184a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C2581g {
    public final C1611k f13769a;
    public final C1184a f13770b;

    public C2581g(C1611k c1611k, C1184a c1184a) {
        this.f13769a = c1611k;
        this.f13770b = c1184a;
    }

    public static int m13634a(Context context, int i, float f, boolean z) {
        if (f > 0.0f && z) {
            return (int) (((float) i) * f);
        }
        Resources resources = context.getResources();
        return Math.min(resources.getDimensionPixelSize(C7582R.dimen.play_profile_header_height), C1611k.m9271m(resources) / 2);
    }

    public static int m13635a(Context context, int i, boolean z, float f, boolean z2) {
        if (z) {
            return C2581g.m13634a(context, i, f, z2);
        }
        return PlaySearchToolbar.a(context) * 3;
    }

    public final int m13639a(Context context, Document document, boolean z) {
        boolean z2 = false;
        Resources resources = context.getResources();
        boolean z3 = z && C2581g.m13638c(document, z) == null;
        if (!m13640b(document, z)) {
            return FinskyHeaderListLayout.m16068a(context, 2, 0);
        }
        int i;
        int l = C1611k.m9270l(resources);
        if (this.f13769a.m9285j(resources)) {
            l = resources.getDimensionPixelSize(C7582R.dimen.width_for_fixed_width_pages);
        }
        int m = C1611k.m9271m(resources);
        float a = C2581g.m13633a(document, z);
        if (m > l) {
            z2 = true;
        }
        int a2 = C2581g.m13635a(context, l, true, a, z2);
        if (z3) {
            i = a2 / 2;
        } else {
            i = a2;
        }
        if (!z && C2580f.m13631a(document.f14885a.f12098e)) {
            i -= resources.getDimensionPixelSize(C7582R.dimen.summary_thumbnail_peek);
        }
        if (InsetsFrameLayout.f14024a) {
            return i - k.e(context);
        }
        return i;
    }

    public static float m13632a(int i) {
        switch (i) {
            case 1:
            case 16:
            case 17:
                return 0.48828125f;
            case 3:
                return 0.5f;
            case 6:
            case 7:
            case 8:
            case 18:
            case 19:
            case 20:
            case 26:
            case 28:
            case 30:
            case 34:
            case 44:
            case 45:
                return 0.5625f;
            default:
                return C1617r.m9292a(i);
        }
    }

    static float m13633a(Document document, boolean z) {
        int i;
        Object obj = (z && document.f14885a.f12098e == 2) ? 1 : null;
        if (obj != null) {
            i = 3;
        } else {
            i = document.f14885a.f12098e;
        }
        return C2581g.m13632a(i);
    }

    public final boolean m13640b(Document document, boolean z) {
        C1184a c1184a = this.f13770b;
        boolean z2 = c1184a.m7137a(document) && c1184a.f7259a.dj().mo2294a(12643938);
        if (z2) {
            return false;
        }
        if (z) {
            return true;
        }
        int i = document.f14885a.f12098e;
        bd c = C2581g.m13638c(document, z);
        switch (i) {
            case 2:
            case 4:
                return true;
            case 3:
                if (c != null) {
                    return true;
                }
                return false;
            case 5:
            case 64:
                return false;
            case 16:
            case 17:
            case 24:
            case 25:
                if (c != null) {
                    return true;
                }
                return false;
            default:
                if (c != null) {
                    return true;
                }
                return false;
        }
    }

    public static bd m13636a(Document document) {
        switch (document.f14885a.f12098e) {
            case 1:
                return C2581g.m13637a(document, 2, 0);
            case 2:
                return C2581g.m13637a(document, 4, 0);
            case 3:
                return C2581g.m13637a(document, 4, 0);
            case 5:
            case 64:
                return null;
            case 6:
                return C2581g.m13637a(document, 0, 13);
            case 7:
            case 12:
            case 26:
            case 45:
                return C2581g.m13637a(document, 1);
            case 8:
                return C2581g.m13637a(document, 14);
            case 16:
            case 17:
                return C2581g.m13637a(document, 14);
            case 18:
            case 19:
                return C2581g.m13637a(document, 2, 4);
            case 20:
                return C2581g.m13637a(document, 13, 2, 4);
            case 30:
                return C2581g.m13637a(document, 14);
            case 34:
                return C2581g.m13637a(document, 14);
            case 44:
                return C2581g.m13637a(document, 14, 0);
            default:
                return C2581g.m13637a(document, 4, 0);
        }
    }

    public static bd m13638c(Document document, boolean z) {
        Document u;
        int i = document.f14885a.f12098e;
        int i2 = (z && i == 2) ? 1 : 0;
        if (i2 != 0) {
            u = document.m14666u();
        } else {
            u = document;
        }
        if (u == null) {
            return null;
        }
        if (z && (i == 24 || i == 25)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 == 0) {
            return C2581g.m13636a(u);
        }
        return C2581g.m13637a(document, 4);
    }

    static bd m13637a(Document document, int... iArr) {
        if (document == null) {
            return null;
        }
        for (int c : iArr) {
            List c2 = document.m14644c(c);
            if (c2 != null && !c2.isEmpty()) {
                return (bd) c2.get(0);
            }
        }
        return null;
    }
}
