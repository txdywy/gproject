package com.google.android.instantapps.common.loading.ui;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import com.google.android.instantapps.common.loading.C5812i;

final class C5832r implements OnClickListener {
    public final /* synthetic */ C5822h f29300a;

    C5832r(C5822h c5822h) {
        this.f29300a = c5822h;
    }

    public final void onClick(View view) {
        this.f29300a.aC.m26968a("IASupervisor.LoadingScreenFragment.moreButton");
        Fragment fragment = this.f29300a;
        if (!fragment.ac()) {
            fragment.az = new PopupMenu(fragment.m601g(), fragment.aj);
            fragment.az.inflate(C5812i.loading_overflow_menu);
            fragment.az.setOnMenuItemClickListener(new C5834t(fragment));
            fragment.az.setOnDismissListener(new C5826l(fragment));
            fragment.ah();
            fragment.az.show();
            fragment.aM.mo5136a(1);
        }
    }
}
