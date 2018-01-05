package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cu.C2415b;
import com.google.android.finsky.cu.C2417d;
import com.google.android.finsky.cv.p177a.jw;
import com.google.android.finsky.utils.bb;

final class bt implements OnClickListener {
    public final /* synthetic */ boolean f18541a;
    public final /* synthetic */ String f18542b;
    public final /* synthetic */ SongSnippet f18543c;

    bt(SongSnippet songSnippet, boolean z, String str) {
        this.f18543c = songSnippet;
        this.f18541a = z;
        this.f18542b = str;
    }

    public final void onClick(View view) {
        if (this.f18541a && C1473m.f7980a.mo2246h(this.f18542b).m22586a()) {
            this.f18543c.getContext().startActivity(C1473m.f7980a.bo().mo2743a(this.f18543c.getContext(), this.f18542b, 2, null, this.f18543c.f18388b.m13184a(null)));
            return;
        }
        boolean z;
        jw jwVar = this.f18543c.f18403q;
        C2417d c2417d = C2415b.f11723a;
        if (c2417d.f11732g != null) {
            c2417d.f11732g.mo1057f();
        }
        int i = c2417d.f11727b.f11717a;
        if (c2417d.f11730e == null && jwVar == null) {
            z = true;
        } else if (c2417d.f11730e == null || jwVar == null) {
            z = false;
        } else {
            z = jwVar.f12832f.equals(c2417d.f11730e.f12832f);
        }
        if (!z) {
            bb.m21791a();
            c2417d.f11728c.clear();
            c2417d.f11728c.add(jwVar);
            c2417d.m12130b();
            c2417d.m12131c();
        } else if (i == 4) {
            c2417d.f11727b.pause();
        } else if (i == 5) {
            c2417d.f11727b.start();
        } else if (i == 2) {
            c2417d.f11726a.mo2904c();
            c2417d.m12129a();
        }
    }
}
