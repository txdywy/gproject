package com.google.android.gms.dynamite;

import android.content.Context;

final class C5173g implements C5169c {
    C5173g() {
    }

    public final C5178m mo4633a(Context context, String str, C5167l c5167l) {
        C5178m c5178m = new C5178m();
        c5178m.f26119a = c5167l.mo4631a(context, str);
        c5178m.f26120b = c5167l.mo4632a(context, str, true);
        if (c5178m.f26119a == 0 && c5178m.f26120b == 0) {
            c5178m.f26121c = 0;
        } else if (c5178m.f26119a >= c5178m.f26120b) {
            c5178m.f26121c = -1;
        } else {
            c5178m.f26121c = 1;
        }
        return c5178m;
    }
}
