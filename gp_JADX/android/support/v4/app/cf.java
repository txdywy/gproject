package android.support.v4.app;

import android.app.Notification.BigTextStyle;
import android.os.Build.VERSION;

public final class cf extends ci {
    public CharSequence f1482a;

    public final cf m1410a(CharSequence charSequence) {
        this.c = cg.m1413d(charSequence);
        return this;
    }

    public final cf m1412b(CharSequence charSequence) {
        this.f1482a = cg.m1413d(charSequence);
        return this;
    }

    public final void mo318a(cb cbVar) {
        if (VERSION.SDK_INT >= 16) {
            BigTextStyle bigText = new BigTextStyle(cbVar.mo320a()).setBigContentTitle(this.c).bigText(this.f1482a);
            if (this.e) {
                bigText.setSummaryText(this.d);
            }
        }
    }
}
