package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import com.caverock.androidsvg.C0722q;
import com.google.android.libraries.play.entertainment.C6095j;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

public final class bf {
    public static C0722q m28312a(Context context, int i) {
        C6116b.m28102a();
        if (m28311a(i) != -1) {
            return C0722q.m4784a(context, m28311a(i));
        }
        return null;
    }

    public static int m28311a(int i) {
        switch (i) {
            case 1:
                return C6095j.ic_rottentomatoes_rotten;
            case 2:
                return C6095j.ic_rottentomatoes_fresh;
            case 3:
                return C6095j.ic_rottentomatoes_certified;
            default:
                return -1;
        }
    }
}
