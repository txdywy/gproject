package com.google.android.finsky.dialogbuilder.p137a;

import android.support.v4.p037h.C0305a;
import android.text.TextUtils;
import com.google.android.finsky.dialogbuilder.layout.C2768b;
import com.google.android.finsky.dialogbuilder.layout.CheckedView;
import com.google.wireless.android.finsky.dfe.c.a.cu;

final class C2769h implements C2768b {
    public final C0305a f15041a = new C0305a();
    public boolean f15042b = false;
    public final /* synthetic */ C2767g f15043c;

    C2769h(C2767g c2767g) {
        this.f15043c = c2767g;
    }

    public final void mo3133a(CheckedView checkedView, boolean z) {
        if (z) {
            cu cuVar = this.f15043c.f15037b.b[((Integer) this.f15041a.get(Integer.valueOf(checkedView.getId()))).intValue()];
            if (!TextUtils.isEmpty(this.f15043c.f15037b.c)) {
                this.f15043c.f15038c.m14870a(this.f15043c.f15037b.c, cuVar.e);
            }
            m14834a(cuVar, true);
        }
    }

    final void m14834a(cu cuVar, boolean z) {
        if (cuVar.c.e != null && !TextUtils.isEmpty(this.f15043c.f15037b.e)) {
            this.f15042b |= z;
            this.f15043c.f15039d.m14868a(this.f15043c.f15037b.e, this.f15042b);
        }
    }
}
