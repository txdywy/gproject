package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.p032d.p033a.C0283a;
import android.support.v4.p032d.p033a.C0284b;
import android.view.Menu;
import android.view.MenuItem;

public final class aj {
    public static Menu m2794a(Context context, C0283a c0283a) {
        return new ak(context, c0283a);
    }

    public static MenuItem m2795a(Context context, C0284b c0284b) {
        if (VERSION.SDK_INT >= 16) {
            return new aa(context, c0284b);
        }
        return new C0469v(context, c0284b);
    }
}
