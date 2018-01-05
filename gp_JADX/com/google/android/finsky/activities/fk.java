package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class fk implements OnClickListener {
    public final /* synthetic */ ff f6803a;

    fk(ff ffVar) {
        this.f6803a = ffVar;
    }

    public final void onClick(View view) {
        this.f6803a.f6791a.mo2293a(null);
        Toast.makeText(this.f6803a.f6795e, C7582R.string.debug_targets_reset_to_default_notification, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.f6803a.f6798h, 3000);
    }
}
