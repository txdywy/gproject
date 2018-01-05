package com.google.android.finsky.detailspage.videowatchaction;

import android.text.TextUtils;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;

final class C2686l implements C1031w {
    public final /* synthetic */ C2719i f14810a;
    public final /* synthetic */ boolean f14811b;
    public final /* synthetic */ C2683i f14812c;

    C2686l(C2683i c2683i, C2719i c2719i, boolean z) {
        this.f14812c = c2683i;
        this.f14810a = c2719i;
        this.f14811b = z;
    }

    public final void m_() {
        if (this.f14810a.mo2861a() && this.f14810a.m14722b().m14624M()) {
            Document b = this.f14810a.m14722b();
            if (b.m14624M()) {
                CharSequence cf = b.cf();
                this.f14812c.f14803h.put(cf, b);
                this.f14812c.f14804i.remove(cf);
                if (TextUtils.equals(this.f14812c.f14796a.f13074c, cf)) {
                    this.f14812c.m14525b();
                }
                if (this.f14811b) {
                    this.f14812c.m14523a(b);
                }
            }
        }
    }
}
