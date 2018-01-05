package com.google.android.instantapps.common.loading.ui;

import android.view.MenuItem;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.google.android.instantapps.common.loading.C5810g;

final class C5834t implements OnMenuItemClickListener {
    public final /* synthetic */ C5822h f29302a;

    C5834t(C5822h c5822h) {
        this.f29302a = c5822h;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5810g.open_in_browser) {
            this.f29302a.aM.mo5136a(3);
            this.f29302a.aC.m26968a("IASupervisor.LoadingScreenFragment.openInBrowser");
            this.f29302a.a.mo3493c(1);
            return true;
        } else if (itemId == C5810g.app_info) {
            this.f29302a.aM.mo5136a(4);
            String ag = this.f29302a.ag();
            if (ag == null) {
                return true;
            }
            this.f29302a.aC.m26968a("IASupervisor.LoadingScreenFragment.appInfo");
            this.f29302a.m580a(this.f29302a.aP.mo3523a(ag));
            return true;
        } else if (itemId != C5810g.help_and_feedback) {
            return false;
        } else {
            this.f29302a.aM.mo5136a(5);
            this.f29302a.aC.m26968a("IASupervisor.LoadingScreenFragment.helpAndFeedback");
            this.f29302a.aP.mo3524a(this.f29302a.m603h(), "aia_loading", this.f29302a.aG);
            return true;
        }
    }
}
