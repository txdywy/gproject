package com.google.android.finsky.family.management;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public final class C3069g {
    public String f15971a;
    public Intent f15972b;

    final boolean m15779a(Activity activity) {
        if (C2744a.m14792b(activity)) {
            Intent intent = activity.getIntent();
            this.f15971a = intent.getStringExtra("memberId");
            if (this.f15971a == null) {
                FinskyLog.m21665c("Invoking Family purchase settings without Gaia ID or family", new Object[0]);
                return false;
            }
            this.f15972b = (Intent) intent.getParcelableExtra("removeMemberIntent");
            return true;
        }
        FinskyLog.m21665c("Calling from untrusted package", new Object[0]);
        return false;
    }

    static void m15778a(View view, String str, bd bdVar) {
        if (bdVar != null) {
            C1473m.f7980a.ar().m9288a((FifeImageView) view.findViewById(C7582R.id.avatar), bdVar.f11860f, bdVar.f11863i);
        }
        ((TextView) view.findViewById(C7582R.id.user_name)).setText(str);
    }
}
