package android.support.v7.widget;

import android.text.TextUtils;
import android.view.View;

final class hp implements hq {
    hp() {
    }

    public final void mo921a(View view, CharSequence charSequence) {
        if (hr.f3590i != null && hr.f3590i.f3592a == view) {
            hr.m3843a(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (hr.f3591j != null && hr.f3591j.f3592a == view) {
                hr.f3591j.m3844a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        hr hrVar = new hr(view, charSequence);
    }
}
