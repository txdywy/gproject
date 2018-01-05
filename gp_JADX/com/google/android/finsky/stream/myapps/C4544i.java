package com.google.android.finsky.stream.myapps;

import android.support.design.widget.C0138g;
import android.support.design.widget.Snackbar;
import android.view.View;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.myapps.view.C4542a;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

final class C4544i implements C4542a {
    public final /* synthetic */ C4539f f23247a;

    C4544i(C4539f c4539f) {
        this.f23247a = c4539f;
    }

    public final void mo4262a(View view) {
        this.f23247a.f23237g.m13379b(new C2475d((ad) view).m13256a(2834));
        this.f23247a.f23238h.m21164a(true);
        this.f23247a.f23238h.m21163a();
        C0138g a = Snackbar.m499a(view, (int) C7582R.string.assist_card_dismissed_toast, 0);
        C4546k c4546k = new C4546k(this);
        if (a.f662h == null) {
            a.f662h = new ArrayList();
        }
        a.f662h.add(c4546k);
        ((Snackbar) a).m501a((int) C7582R.string.assist_card_dismissed_toast_undo, new C4545j(this, view)).m493a();
    }
}
