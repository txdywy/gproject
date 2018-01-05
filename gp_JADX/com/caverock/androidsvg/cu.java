package com.caverock.androidsvg;

import android.content.res.Resources;
import android.os.AsyncTask;

abstract class cu extends AsyncTask {
    public as f4458a = null;
    public float f4459b = -1.0f;

    protected final void m4695a(C0722q c0722q, Resources resources) {
        if (this.f4459b > 0.0f) {
            c0722q.m4792a(this.f4459b);
        }
        c0722q.m4792a(C0722q.m4779a(resources));
    }

    protected final float m4694a(Resources resources) {
        float a = C0722q.m4779a(resources);
        if (this.f4459b > 0.0f) {
            return a * this.f4459b;
        }
        return a;
    }
}
