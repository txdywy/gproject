package com.google.android.finsky.layout.play;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.SVGParseException;
import com.caverock.androidsvg.as;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.drawer.C3692j;
import com.squareup.leakcanary.C7582R;

final class af implements C3692j {
    public final int f18761a;
    public final int f18762b;
    public final int f18763c = C7582R.color.play_icon_default;

    public af(int i, int i2) {
        this.f18761a = i;
        this.f18762b = i2;
    }

    public final Drawable mo3616a(Resources resources, boolean z) {
        try {
            return C0722q.m4782a(resources, this.f18761a, new as().m4593b(z ? resources.getColor(this.f18762b) : resources.getColor(this.f18763c)));
        } catch (SVGParseException e) {
            FinskyLog.m21669e("Bad svg resource: %d", Integer.valueOf(this.f18761a));
            return new ShapeDrawable();
        }
    }
}
