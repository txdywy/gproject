package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.google.android.finsky.settings.SettingsActivity;

final class C2037n implements OnClickListener {
    public final /* synthetic */ C1873l f10503a;

    C2037n(C1873l c1873l) {
        this.f10503a = c1873l;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10503a.m9864a(6326);
        this.f10503a.mo968W().W_();
        Intent intent = new Intent(this.f10503a.m601g(), SettingsActivity.class);
        intent.putExtra("setting-key-to-scroll", "download-mode");
        this.f10503a.m580a(intent);
    }
}
