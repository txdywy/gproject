package com.google.android.finsky.activities;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.google.android.finsky.cs.C2378b;
import com.google.android.finsky.phenotypedebug.C3880a;
import com.squareup.leakcanary.C7582R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class fo implements OnClickListener {
    public final /* synthetic */ fl f6818a;

    fo(fl flVar) {
        this.f6818a = flVar;
    }

    public final void onClick(View view) {
        String cZ = this.f6818a.f6804a.cZ();
        C2378b c2378b = this.f6818a.f6805b;
        List<C3880a> list = this.f6818a.f6806c;
        Map hashMap = new HashMap();
        for (C3880a c3880a : list) {
            if (c3880a.mo3831a()) {
                hashMap.put(c3880a.f19304a, c3880a.m18373b());
            }
        }
        c2378b.mo2884a(cZ, hashMap);
        this.f6818a.f6805b.mo2886b(cZ, fl.m6562a(this.f6818a.f6807d));
        this.f6818a.f6805b.mo2888d(cZ);
        Toast.makeText(this.f6818a.f6809f, C7582R.string.debug_targets_override_set_notification, 1).show();
        new Handler(Looper.getMainLooper()).postDelayed(this.f6818a.f6808e, 3000);
    }
}
