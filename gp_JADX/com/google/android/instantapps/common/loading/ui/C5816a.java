package com.google.android.instantapps.common.loading.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.instantapps.common.loading.C5810g;
import com.google.android.instantapps.common.loading.C5811h;

public final class C5816a extends Fragment {
    public C5819d f29274a;
    public View f29275b;
    public View f29276c;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f29275b = layoutInflater.inflate(C5811h.first_launch_settings_reminder_fragment, viewGroup, false);
        this.f29276c = this.f29275b.findViewById(C5810g.settings_button);
        this.f29276c.setOnClickListener(new C5817b(this));
        this.f29275b.postDelayed(new C5818c(this), 5000);
        return this.f29275b;
    }
}
