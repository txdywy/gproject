package com.google.android.finsky.entertainment;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.libraries.play.entertainment.p192l.C6101b;
import com.google.android.libraries.play.entertainment.p192l.p350a.C6100a;
import com.google.android.libraries.play.entertainment.p344d.C6061h;
import com.google.android.libraries.play.entertainment.p344d.C6062r;
import com.google.protobuf.nano.C0757i;

final class C2992h implements C0657w, C0660x {
    public final C6101b f15675a;
    public final C6062r f15676b;

    public C2992h(C6101b c6101b, C6062r c6062r) {
        this.f15675a = c6101b;
        this.f15676b = c6062r;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f15676b.m27980b(C6061h.m27973a((Throwable) volleyError));
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f15676b.m27980b(C6061h.m27972a(new C6100a(this.f15675a, (C0757i) obj)));
    }
}
