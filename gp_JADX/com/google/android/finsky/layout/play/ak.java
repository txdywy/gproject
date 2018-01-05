package com.google.android.finsky.layout.play;

import com.google.android.finsky.bg.C1617r;
import com.google.android.finsky.playcard.C3906g;
import com.google.android.finsky.stream.base.playcluster.C4281c;
import com.squareup.leakcanary.C7582R;

public final class ak {
    public static final C4281c[] f18766a = new C4281c[6];
    public static final C4281c[] f18767b = new C4281c[6];

    public static C4281c m17589a(int i, int i2, boolean z) {
        return (((C1617r.m9292a(i) > 1.0f ? 1 : (C1617r.m9292a(i) == 1.0f ? 0 : -1)) == 0 ? 1 : null) != null ? f18766a : f18767b)[C4281c.m19883a(Math.min(5, i2), z)];
    }

    static {
        C3906g c3906g = new C3906g(C7582R.layout.play_card_rate, 6, 3, 1.0f);
        C3906g c3906g2 = new C3906g(C7582R.layout.play_card_rate, 6, 4, 1.441f);
        C3906g c3906g3 = new C3906g(C7582R.layout.play_card_quick_suggestion_mini, 2, 3, 1.0f);
        C3906g c3906g4 = new C3906g(C7582R.layout.play_card_quick_suggestion_mini, 2, 4, 1.441f);
        C3906g c3906g5 = new C3906g(C7582R.layout.play_card_rate, 4, 3, 1.0f);
        C3906g c3906g6 = new C3906g(C7582R.layout.play_card_rate, 4, 4, 1.441f);
        C3906g c3906g7 = new C3906g(C7582R.layout.play_card_quick_suggestion_small, 2, 3, 1.0f);
        C3906g c3906g8 = new C3906g(C7582R.layout.play_card_quick_suggestion_small, 2, 4, 1.441f);
        C4281c[] c4281cArr = f18766a;
        C4281c c4281c = new C4281c(12, 3);
        c4281c.f21628c = 6;
        c4281cArr[0] = c4281c.m19885a(c3906g, 0).m19885a(c3906g3, 6).m19885a(c3906g3, 8).m19885a(c3906g3, 10);
        c4281cArr = f18766a;
        c4281c = new C4281c(14, 3);
        c4281c.f21628c = 8;
        c4281cArr[1] = c4281c.m19885a(c3906g, 0).m19885a(c3906g3, 6).m19885a(c3906g3, 8).m19885a(c3906g3, 10).m19885a(c3906g3, 12);
        C4281c[] c4281cArr2 = f18766a;
        C4281c c4281c2 = new C4281c(10, 3);
        c4281c2.f21628c = 6;
        c4281cArr2[2] = c4281c2.m19885a(c3906g5, 0).m19885a(c3906g7, 4).m19885a(c3906g7, 6).m19885a(c3906g7, 8);
        c4281cArr2 = f18766a;
        c4281c2 = new C4281c(12, 3);
        c4281c2.f21628c = 8;
        c4281cArr2[3] = c4281c2.m19885a(c3906g5, 0).m19885a(c3906g7, 4).m19885a(c3906g7, 6).m19885a(c3906g7, 8).m19885a(c3906g7, 10);
        c4281cArr2 = f18766a;
        c4281c2 = new C4281c(12, 3);
        c4281c2.f21628c = 8;
        c4281cArr2[4] = c4281c2.m19885a(c3906g5, 0).m19885a(c3906g7, 4).m19885a(c3906g7, 6).m19885a(c3906g7, 8).m19885a(c3906g7, 10);
        c4281cArr2 = f18766a;
        c4281c2 = new C4281c(14, 3);
        c4281c2.f21628c = 10;
        c4281cArr2[5] = c4281c2.m19885a(c3906g5, 0).m19885a(c3906g7, 4).m19885a(c3906g7, 6).m19885a(c3906g7, 8).m19885a(c3906g7, 10).m19885a(c3906g7, 12);
        c4281cArr2 = f18767b;
        C4281c c4281c3 = new C4281c(12, 4);
        c4281c3.f21628c = 6;
        c4281cArr2[0] = c4281c3.m19885a(c3906g2, 0).m19885a(c3906g4, 6).m19885a(c3906g4, 8).m19885a(c3906g4, 10);
        c4281cArr2 = f18767b;
        c4281c3 = new C4281c(14, 4);
        c4281c3.f21628c = 8;
        c4281cArr2[1] = c4281c3.m19885a(c3906g2, 0).m19885a(c3906g4, 6).m19885a(c3906g4, 8).m19885a(c3906g4, 10).m19885a(c3906g4, 12);
        c4281cArr2 = f18767b;
        C4281c c4281c4 = new C4281c(10, 4);
        c4281c4.f21628c = 6;
        c4281cArr2[2] = c4281c4.m19885a(c3906g6, 0).m19885a(c3906g8, 4).m19885a(c3906g8, 6).m19885a(c3906g8, 8);
        c4281cArr2 = f18767b;
        c4281c4 = new C4281c(12, 4);
        c4281c4.f21628c = 8;
        c4281cArr2[3] = c4281c4.m19885a(c3906g6, 0).m19885a(c3906g8, 4).m19885a(c3906g8, 6).m19885a(c3906g8, 8).m19885a(c3906g8, 10);
        c4281cArr2 = f18767b;
        c4281c4 = new C4281c(12, 4);
        c4281c4.f21628c = 8;
        c4281cArr2[4] = c4281c4.m19885a(c3906g6, 0).m19885a(c3906g8, 4).m19885a(c3906g8, 6).m19885a(c3906g8, 8).m19885a(c3906g8, 10);
        c4281cArr2 = f18767b;
        c4281c4 = new C4281c(14, 4);
        c4281c4.f21628c = 10;
        c4281cArr2[5] = c4281c4.m19885a(c3906g6, 0).m19885a(c3906g8, 4).m19885a(c3906g8, 6).m19885a(c3906g8, 8).m19885a(c3906g8, 10).m19885a(c3906g8, 12);
    }
}
