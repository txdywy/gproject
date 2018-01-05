package com.google.android.finsky.unauthenticated;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class C4583k implements OnClickListener {
    public final /* synthetic */ Button f23408a;
    public final /* synthetic */ Button f23409b;
    public final /* synthetic */ C4579g f23410c;

    C4583k(C4579g c4579g, Button button, Button button2) {
        this.f23410c = c4579g;
        this.f23408a = button;
        this.f23409b = button2;
    }

    public final void onClick(View view) {
        this.f23410c.af.m13379b(new C2475d(this.f23410c).m13256a(2950));
        this.f23408a.setEnabled(false);
        this.f23409b.setEnabled(false);
        this.f23408a.setText(this.f23410c.m605i().getString(C7582R.string.unauth_updates_cancellation_cancelling_text).toUpperCase());
        C4809e a = this.f23410c.f23398d.mo3479a(new C3363f().m16804b(C4579g.f23395a).m16802a(C4579g.f23396b).m16800a());
        C4579g c4579g = this.f23410c;
        C4573n c4573n = this.f23410c.f23400f;
        if (c4579g.f23401g == null) {
            c4579g.f23401g = new C4584l(c4579g, c4573n);
        }
        a.mo4398a(c4579g.f23401g);
    }
}
