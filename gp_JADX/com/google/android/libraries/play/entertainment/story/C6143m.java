package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.caverock.androidsvg.C0722q;
import com.google.android.libraries.play.entertainment.C6072e;
import com.google.android.libraries.play.entertainment.C6095j;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

public final class C6143m {
    public static final int[] f30521a = new int[]{C6095j.ic_pe_badge_movie, C6095j.ic_pe_badge_music, C6095j.ic_pe_badge_book, C6095j.ic_pe_badge_app, C6095j.ic_pe_badge_game};
    public static final C0722q[] f30522b = new C0722q[5];

    public static Drawable m28346a(Context context, int i, int i2) {
        C6116b.m28102a();
        C6116b.m28106b(i2 > 0);
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                C0722q c0722q = f30522b[i];
                if (c0722q == null) {
                    c0722q = C0722q.m4784a(context, f30521a[i]);
                    f30522b[i] = c0722q;
                }
                return new C6170n(c0722q, i2);
            default:
                return null;
        }
    }

    public static void m28347a(FrameLayout frameLayout, int i, boolean z) {
        frameLayout.setForeground(C6143m.m28346a(frameLayout.getContext(), i, frameLayout.getResources().getDimensionPixelSize(z ? C6072e.pe_badge_size_large : C6072e.pe_badge_size_small)));
    }
}
