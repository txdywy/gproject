package com.google.android.finsky.uninstall;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class aw implements OnClickListener {
    public final /* synthetic */ at f23518a;

    aw(at atVar) {
        this.f23518a = atVar;
    }

    public final void onClick(View view) {
        this.f23518a.bw.m13379b(new C2475d(this.f23518a).m13256a(5534));
        this.f23518a.ag.addAll(this.f23518a.f23514c.m21360b());
        String a = this.f23518a.m21322a(this.f23518a.f23516h);
        new C1508k().m8852a(this.f23518a.m572a((int) C7582R.string.uninstall_manager_space_will_be_removed, a)).m8849a(5533, null, 5534, 5535, this.f23518a.bw).m8861d(this.f23518a.m572a((int) C7582R.string.uninstall_manager_space_to_be_freed, a)).m8862e((int) C7582R.string.cancel).m8851a(this.f23518a, 0, null).mo2272a().m625a(this.f23518a.f730B, "uninstall_confirmation_dialog");
    }
}
