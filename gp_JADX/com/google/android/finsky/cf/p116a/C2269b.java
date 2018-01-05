package com.google.android.finsky.cf.p116a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.Snackbar;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.bg.C1608h;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

final class C2269b implements Runnable {
    public final /* synthetic */ Context f11261a;
    public final /* synthetic */ Resources f11262b;
    public final /* synthetic */ C2268a f11263c;

    C2269b(C2268a c2268a, Context context, Resources resources) {
        this.f11263c = c2268a;
        this.f11261a = context;
        this.f11262b = resources;
    }

    public final void run() {
        boolean c = C2268a.m11726c(this.f11261a);
        C0957n c0957n = C0954a.f5809E;
        if (!c && !((Boolean) c0957n.m5760a()).booleanValue()) {
            int i;
            int i2;
            if (VERSION.SDK_INT <= 22) {
                i = 0;
            } else {
                i = 10000;
            }
            this.f11263c.f11260g = Snackbar.m499a(this.f11263c.f11256c, (int) C7582R.string.network_notification_request_txt, i);
            Snackbar snackbar = this.f11263c.f11260g;
            Resources resources = this.f11262b;
            switch (this.f11263c.f11257d.mo1357a()) {
                case 1:
                    i2 = C7582R.color.play_books_snackbar_button;
                    break;
                case 2:
                    i2 = C7582R.color.play_music_snackbar_button;
                    break;
                case 3:
                    i2 = C7582R.color.play_apps_snackbar_button;
                    break;
                case 4:
                    i2 = C7582R.color.play_movies_snackbar_button;
                    break;
                case 6:
                    i2 = C7582R.color.play_newsstand_snackbar_button;
                    break;
                default:
                    if (!C1608h.f8520b) {
                        i2 = C7582R.color.play_multi_snackbar_button;
                        break;
                    } else {
                        i2 = C7582R.color.play_apps_snackbar_button;
                        break;
                    }
            }
            ((SnackbarContentLayout) snackbar.e.getChildAt(0)).getActionView().setTextColor(resources.getColor(i2));
            this.f11263c.f11260g.m502a(this.f11262b.getString(C7582R.string.network_notification_request_button).toUpperCase(Locale.getDefault()), new C2270c(this, c0957n, i));
            this.f11263c.f11260g.m493a();
            if (this.f11263c.f11259f != null) {
                this.f11263c.f11259f.mo1359a();
            }
        }
    }
}
