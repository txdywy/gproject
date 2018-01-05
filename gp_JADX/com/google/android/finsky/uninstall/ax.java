package com.google.android.finsky.uninstall;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p142j.C3632i;
import com.google.android.finsky.p142j.C3633l;

final class ax implements OnClickListener {
    public final /* synthetic */ at f23519a;

    ax(at atVar) {
        this.f23519a = atVar;
    }

    public final void onClick(View view) {
        this.f23519a.bw.m13379b(new C2475d(this.f23519a).m13256a(5532));
        if (this.f23519a.aj()) {
            this.f23519a.ai = C3633l.m17228a(at.at, C3632i.RECOMMENDED);
        }
        if (this.f23519a.ai == null) {
            this.f23519a.ai = (C3633l) this.f23519a.f730B.mo283a("uninstall_manager_sorter");
            if (this.f23519a.ai == null) {
                this.f23519a.ai = C3633l.m17228a(at.at, C3632i.RECOMMENDED);
            }
        }
        this.f23519a.ai.af = this.f23519a;
        this.f23519a.ai.m17230a(this.f23519a.aj);
        this.f23519a.ai.m625a(this.f23519a.f730B, "uninstall_manager_sorter");
    }
}
