package com.google.android.finsky.billing;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.settings.SettingsActivity;

final class C1871j implements OnClickListener {
    public final /* synthetic */ C1835g f9567a;

    C1871j(C1835g c1835g) {
        this.f9567a = c1835g;
    }

    public final void onClick(View view) {
        Intent intent = new Intent(view.getContext(), SettingsActivity.class);
        intent.putExtra("setting-key-to-scroll", "download-mode");
        this.f9567a.m580a(intent);
    }
}
