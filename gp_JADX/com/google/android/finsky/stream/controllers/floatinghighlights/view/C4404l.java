package com.google.android.finsky.stream.controllers.floatinghighlights.view;

import com.google.android.finsky.bg.C1607g;
import com.squareup.haha.perflib.HprofParser;

public final class C4404l implements C4397g {
    public final int[] f22355a;
    public final float[] f22356b;

    public C4404l(int i, float f, boolean z, boolean z2) {
        int a = C1607g.m9235a(i, (int) HprofParser.ROOT_UNKNOWN);
        if (z) {
            this.f22355a = new int[]{a, 0, 0, a};
            this.f22356b = new float[]{0.0f, 0.5f, 0.8f, 1.0f};
            return;
        }
        int i2;
        if (f != 1.0f || z2) {
            i2 = 0;
        } else {
            i2 = C1607g.m9235a(i, 77);
        }
        this.f22355a = new int[]{a, i2};
        this.f22356b = new float[]{0.0f, 1.0f};
    }

    public final int[] mo4192a() {
        return this.f22355a;
    }

    public final float[] mo4193b() {
        return this.f22356b;
    }
}
