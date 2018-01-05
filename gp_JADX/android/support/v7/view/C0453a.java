package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.p040a.C0395b;

public final class C0453a {
    public Context f2554a;

    public static C0453a m2684a(Context context) {
        return new C0453a(context);
    }

    private C0453a(Context context) {
        this.f2554a = context;
    }

    public final int m2685a() {
        Configuration configuration = this.f2554a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        if (i >= 360) {
            return 3;
        }
        return 2;
    }

    public final boolean m2686b() {
        return this.f2554a.getResources().getBoolean(C0395b.abc_action_bar_embed_tabs);
    }
}
