package com.google.android.finsky.actionbuttons;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2475d;

final class C1009f implements OnClickListener {
    public final /* synthetic */ String f6173a;
    public final /* synthetic */ ViewGroup f6174b;
    public final /* synthetic */ C1006c f6175c;

    C1009f(C1006c c1006c, String str, ViewGroup viewGroup) {
        this.f6175c = c1006c;
        this.f6173a = str;
        this.f6174b = viewGroup;
    }

    public final void onClick(View view) {
        this.f6175c.f6165v.m13379b(new C2475d(this.f6175c.f6150g).m13256a(2917));
        this.f6175c.f6155l.m16742a(this.f6173a).mo4398a(C4831h.f25111a);
        this.f6174b.setVisibility(4);
    }
}
