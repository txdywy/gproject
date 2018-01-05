package com.google.android.finsky.layout.play;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;

final class C3705n implements Runnable {
    public final /* synthetic */ FinskyDrawerLayout f18787a;

    C3705n(FinskyDrawerLayout finskyDrawerLayout) {
        this.f18787a = finskyDrawerLayout;
    }

    public final void run() {
        String str;
        this.f18787a.m17537b(112);
        FinskyDrawerLayout finskyDrawerLayout = this.f18787a;
        if (finskyDrawerLayout.f18673V != null) {
            String str2 = finskyDrawerLayout.f18673V.f14881a.f31777t;
            if (!TextUtils.isEmpty(str2)) {
                finskyDrawerLayout.f18667P.mo3662a(str2);
                return;
            }
        }
        C2104b c2104b = finskyDrawerLayout.f18669R;
        Activity activity = finskyDrawerLayout.f18666O;
        C2104b c2104b2 = finskyDrawerLayout.f18669R;
        C3748a c3748a = finskyDrawerLayout.f18667P;
        switch (c3748a.mo3705g()) {
            case 1:
                str = "mobile_home";
                break;
            case 2:
                switch (c3748a.mo3719v()) {
                    case 1:
                        str = "mobile_books";
                        break;
                    case 2:
                        str = "mobile_music";
                        break;
                    case 3:
                        str = "mobile_apps";
                        break;
                    case 4:
                    case 7:
                        str = "mobile_movies";
                        break;
                    case 6:
                        str = "mobile_newsstand";
                        break;
                    default:
                        str = "mobile_store_default";
                        break;
                }
            case 3:
                str = "mobile_my_apps";
                break;
            case 5:
                Document u = c3748a.mo3718u();
                if (u != null) {
                    switch (u.f14885a.f12099f) {
                        case 1:
                            str = "mobile_books_object";
                            break;
                        case 2:
                            str = "mobile_music_object";
                            break;
                        case 3:
                            str = "mobile_apps_object";
                            break;
                        case 4:
                        case 7:
                            str = "mobile_movies_object";
                            break;
                        case 6:
                            str = "mobile_newsstand_object";
                            break;
                    }
                }
                str = "mobile_store_default";
                break;
            case 7:
                str = "mobile_search";
                break;
            case 10:
                str = "mobile_wishlist";
                break;
            default:
                str = "mobile_store_default";
                break;
        }
        c2104b.m10992a(activity, str, true);
    }
}
