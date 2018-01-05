package com.google.android.finsky.family.remoteescalation;

import android.widget.Toast;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.google.wireless.android.finsky.dfe.h.a.ar;

final class C3093k implements C0660x {
    public final /* synthetic */ ac f16025a;
    public final /* synthetic */ C3087j f16026b;

    C3093k(C3087j c3087j, ac acVar) {
        this.f16026b = c3087j;
        this.f16025a = acVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        Toast.makeText(C1473m.f7980a.f7981b, ((ar) obj).c, 1).show();
        this.f16026b.mo3307a(this.f16025a);
    }
}
