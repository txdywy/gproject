package com.caverock.androidsvg;

import android.content.res.Resources;
import android.os.AsyncTask;

protected final class com.caverock.androidsvg.cu extends AsyncTask
{

    public com.caverock.androidsvg.as a;
    public float b;

    cu() {
        AsyncTask();
        this.a = 0;
        this.b = -1082130432;
    }

    protected final float a(Resources p0) {
        v0 = com.caverock.androidsvg.q.a(p0);
        if (this.b > 0)
            v0 = v0 * this.b;
        return v0;
    }

    protected final void a(com.caverock.androidsvg.q p0, Resources p1) {
        if (this.b > 0)
            p0.a(this.b);
        p0.a(com.caverock.androidsvg.q.a(p1));
    }

}
