package com.google.android.finsky.instantapps.p212d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.finsky.utils.C4678i;

final class C3431h implements OnClickListener {
    public final /* synthetic */ String f17566a;
    public final /* synthetic */ C3425c f17567b;

    C3431h(C3425c c3425c, String str) {
        this.f17567b = c3425c;
        this.f17566a = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17567b.f17547b.mo5136a(2903);
        this.f17567b.m16971a(this.f17566a, Long.valueOf(((Long) this.f17567b.f17548c.mo5158a()).longValue() + C4678i.m21812a()));
        this.f17567b.f17550e.m16894a(this.f17566a);
        dialogInterface.dismiss();
        this.f17567b.m16970a(this.f17566a);
    }
}
