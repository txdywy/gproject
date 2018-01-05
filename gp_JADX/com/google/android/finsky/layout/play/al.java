package com.google.android.finsky.layout.play;

import com.google.android.finsky.playcard.C3906g;
import com.google.android.finsky.stream.base.playcluster.C4281c;
import com.squareup.leakcanary.C7582R;

public final class al {
    public static final C4281c[] f18768a = new C4281c[6];

    static {
        C3906g c3906g = new C3906g(C7582R.layout.play_card_rate, 4, 2, 1.0f);
        C3906g c3906g2 = new C3906g(C7582R.layout.play_card_rate, 6, 2, 1.0f);
        C3906g c3906g3 = new C3906g(C7582R.layout.play_card_rate, 5, 2, 1.0f);
        C4281c[] c4281cArr = f18768a;
        C4281c a = new C4281c(4, 2).m19885a(c3906g, 0).m19885a(c3906g, 4);
        a.f21631f = true;
        c4281cArr[0] = a;
        c4281cArr = f18768a;
        C4281c a2 = new C4281c(6, 2).m19885a(c3906g2, 0).m19885a(c3906g2, 6);
        a2.f21631f = true;
        c4281cArr[1] = a2;
        C4281c[] c4281cArr2 = f18768a;
        C4281c a3 = new C4281c(8, 2).m19885a(c3906g, 0).m19885a(c3906g, 4).m19885a(c3906g, 8);
        a3.f21631f = true;
        c4281cArr2[3] = a3;
        C4281c[] c4281cArr3 = f18768a;
        C4281c a4 = new C4281c(10, 2).m19885a(c3906g3, 0).m19885a(c3906g3, 5).m19885a(c3906g3, 10);
        a4.f21631f = true;
        c4281cArr3[5] = a4;
    }
}
