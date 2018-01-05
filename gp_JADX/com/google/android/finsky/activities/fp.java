package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class fp implements OnClickListener {
    public final /* synthetic */ fl f6819a;

    fp(fl flVar) {
        this.f6819a = flVar;
    }

    public final void onClick(View view) {
        String cZ = this.f6819a.f6804a.cZ();
        this.f6819a.f6805b.mo2885b(cZ);
        this.f6819a.f6805b.mo2887c(cZ);
        this.f6819a.f6805b.mo2888d(cZ);
        Toast.makeText(this.f6819a.f6809f, C7582R.string.debug_phenotype_experiments_reset_to_default_notification, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.f6819a.f6808e, 3000);
    }
}
