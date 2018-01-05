package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.play.entertainment.C6072e;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.play.headerlist.i;

public abstract class aj extends i {
    public aj(Context context) {
        super(context);
    }

    protected final int m28201t() {
        Resources resources = this.f.getResources();
        return resources.getDimensionPixelOffset(C6072e.box_vertical_margin) + resources.getDimensionPixelOffset(C6072e.pe_leading_image_height);
    }

    protected final boolean m28200f() {
        return false;
    }

    protected final int m28202u() {
        return 2;
    }

    protected final int m28198b() {
        return C6089g.pe__panel_list;
    }

    protected final boolean K_() {
        return true;
    }

    protected final int m28199d() {
        return 1;
    }
}
