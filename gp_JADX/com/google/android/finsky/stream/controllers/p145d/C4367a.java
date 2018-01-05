package com.google.android.finsky.stream.controllers.p145d;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1510d;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;
import java.util.Collections;

public final class C4367a extends C1128e {
    public C1287h af;
    public C1463g ag;
    public C2199l am;
    public C4371e an;

    public final void mo136b(Bundle bundle) {
        ((C1426i) C3947d.m18649a(C1426i.class)).mo1927a(this);
        super.mo136b(bundle);
    }

    protected final void ab() {
        super.ab();
        String string = this.f760q.getString("docid_list");
        String string2 = this.f760q.getString("dfe_account");
        if (!TextUtils.isEmpty(string)) {
            C1254c a = this.af.mo2016a(string2);
            this.ag.dc().m13320a(new C2474c(506).m13236a(string).m13244b(null).m13210a(0).m13238a(null).m13231a(null).f13342a, null, -1);
            Fragment c1510d = new C1510d();
            Bundle bundle = new Bundle();
            bundle.putInt("message_id", C7582R.string.archiving);
            c1510d.m600f(bundle);
            c1510d.m625a(this.f730B, "progress_dialog");
            a.mo1635c(Collections.singletonList(string), C2229h.f11120a, new C4368b(this, a, c1510d, string), new C4370d(this, c1510d));
        }
    }
}
