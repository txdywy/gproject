package com.google.android.finsky.notificationsettings;

import android.preference.TwoStatePreference;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final class C3825c implements C0657w {
    public final /* synthetic */ int f19171a;
    public final /* synthetic */ TwoStatePreference f19172b;
    public final /* synthetic */ NotificationsSettingsActivity f19173c;

    C3825c(NotificationsSettingsActivity notificationsSettingsActivity, int i, TwoStatePreference twoStatePreference) {
        this.f19173c = notificationsSettingsActivity;
        this.f19171a = i;
        this.f19172b = twoStatePreference;
    }

    public final void mo1062a(VolleyError volleyError) {
        boolean z = true;
        Integer d = this.f19173c.f19160c.m15193d(this.f19173c.f19166j, this.f19171a);
        TwoStatePreference twoStatePreference = this.f19172b;
        if (d == null || d.intValue() != 1) {
            z = false;
        }
        twoStatePreference.setChecked(z);
    }
}
