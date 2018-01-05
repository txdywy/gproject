package com.google.android.finsky.family.library;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.notificationsettings.NotificationsSettingsActivity;

final class C3061l implements OnClickListener {
    public final /* synthetic */ C3060k f15956a;

    C3061l(C3060k c3060k) {
        this.f15956a = c3060k;
    }

    public final void onClick(View view) {
        C3057h c3057h = (C3057h) this.f15956a.a;
        c3057h.m580a(c3057h.ah.mo2687a(c3057h.m601g(), NotificationsSettingsActivity.class, "authAccount", c3057h.bo.mo1636c()));
    }
}
