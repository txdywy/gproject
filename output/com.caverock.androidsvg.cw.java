package com.caverock.androidsvg;

import android.util.Log;

protected final class com.caverock.androidsvg.cw extends com.caverock.androidsvg.cu
{

    public final SVGImageView c;

    cw(SVGImageView p0) {
        this.c = p0;
        com.caverock.androidsvg.cu();
    }

    private final com.caverock.androidsvg.q a(Integer[] p0) {
        v1 = this.c.getResources();
        v0 = com.caverock.androidsvg.q.a.a(p0[0].intValue(), this.a(v1));
        if (v0 == 0) {
            try {
                v0 = com.caverock.androidsvg.q.a(this.c.getContext(), p0[0].intValue());
                this.a(v0, v1);
                com.caverock.androidsvg.q.a.a(v0, p0[0].intValue());
            }
            catch (SVGParseException ex) {
                v3 = new Object[2];
                v3[0] = p0[0];
                v3[1] = ex.getMessage();
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", v3));
                v0 = 0;
            }
        }
        return v0;
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a((Integer[])p0);
    }

    protected final void onPostExecute(Object p0) {
        if ((com.caverock.androidsvg.q)p0 != 0)
            this.c.setImageDrawable(new com.caverock.androidsvg.cs((com.caverock.androidsvg.q)p0, this.a));
    }

}
