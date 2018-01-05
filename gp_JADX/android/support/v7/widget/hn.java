package android.support.v7.widget;

import android.os.Build.VERSION;
import android.view.View;

public final class hn {
    public static final hq f3589a;

    public static void m3839a(View view, CharSequence charSequence) {
        f3589a.mo921a(view, charSequence);
    }

    static {
        if (VERSION.SDK_INT >= 26) {
            f3589a = new ho();
        } else {
            f3589a = new hp();
        }
    }
}
