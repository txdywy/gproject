package com.google.android.finsky.playcard;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.la;
import com.google.android.finsky.cv.p177a.lq;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p147y.C4808a;
import com.squareup.leakcanary.C7582R;

public final class ac {
    public final C1461c f19548a;
    public final C1611k f19549b;

    public ac(C1461c c1461c, C1611k c1611k) {
        this.f19548a = c1461c;
        this.f19549b = c1611k;
    }

    public final int m18478a(boolean z) {
        if (z) {
            if (this.f19548a.dj().mo2294a(12633183)) {
                return C7582R.layout.flat_card_mini_multi_aspect_ratio_lite;
            }
            return C7582R.layout.flat_card_mini_multi_aspect_ratio;
        } else if (this.f19548a.dj().mo2294a(12633183)) {
            return C7582R.layout.flat_card_mini_lite;
        } else {
            return C7582R.layout.flat_card_mini;
        }
    }

    public final int m18477a(Resources resources) {
        int g = this.f19549b.m9282g(resources);
        if (resources.getBoolean(C7582R.bool.play_can_use_mini_cards)) {
            return resources.getInteger(C7582R.integer.related_items_per_row);
        }
        return g;
    }

    public static String m18475a(Document document) {
        Object obj = 1;
        String str = null;
        switch (document.f14885a.f12098e) {
            case 1:
            case 2:
            case 4:
            case 19:
            case 20:
                return document.f14885a.f12102i;
            case 5:
            case 64:
                str = document.f14885a.f12101h;
                if (TextUtils.isEmpty(str)) {
                    return document.f14885a.f12102i;
                }
                return str;
            case 6:
            case 18:
                if (document.f14885a.f12098e == 6) {
                    lq S = document.m14630S();
                    if (S != null) {
                        if ((S.f13036a & 32) == 0) {
                            obj = null;
                        }
                        if (obj != null) {
                            str = S.f13045j;
                        }
                    }
                } else if (document.f14885a.f12098e == 18) {
                    la U = document.m14632U();
                    if (U != null) {
                        if ((U.f12993a & 16) == 0) {
                            obj = null;
                        }
                        if (obj != null) {
                            str = U.f12998f;
                        }
                    }
                }
                if (str == null) {
                    return document.f14885a.f12102i;
                }
                return str;
            case 16:
            case 17:
            case 24:
            case 25:
            case 28:
                return document.f14885a.f12101h;
            case 44:
                return document.bG();
            default:
                return null;
        }
    }

    public static boolean m18476a(C4808a c4808a, Document document) {
        return document.be() && c4808a.m22588a(document.f14885a.f12096c);
    }
}
