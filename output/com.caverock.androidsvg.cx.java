package com.caverock.androidsvg;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

protected final class com.caverock.androidsvg.cx extends com.caverock.androidsvg.cu
{

    public final SVGImageView c;

    cx(SVGImageView p0) {
        this.c = p0;
        com.caverock.androidsvg.cu();
    }

    private final com.caverock.androidsvg.q a(InputStream[] p0) {
        try {
            v0 = com.caverock.androidsvg.q.a(p0[0]);
            this.a(v0, this.c.getResources());
        }
        catch (SVGParseException ex) {
            try {
                v0 = String.valueOf(ex.getMessage());
                if (v0.length() != 0)
                    v0 = "Parse error loading URI: ".concat(v0);
                else {
                    try {
                        v0 = new String("Parse error loading URI: ");
                    }
                    catch (Throwable ex) {
                        try {
                            p0[0].close();
                        }
                        catch (IOException ex) {
                        }
                        throw ex;
                    }
                }
                Log.e("SVGImageView", v0);
            }
            catch (Throwable ex) {
                try {
                    p0[0].close();
                }
                catch (IOException ex) {
                }
                throw ex;
            }
            try {
                p0[0].close();
            }
            catch (IOException ex) {
            }
            v0 = 0;
            return v0;
        }
        catch (Throwable ex) {
            try {
                p0[0].close();
            }
            catch (IOException ex) {
            }
            throw ex;
        }
        try {
            p0[0].close();
        }
        catch (IOException ex) {
        }
        return v0;
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a((InputStream[])p0);
    }

    protected final void onPostExecute(Object p0) {
        if ((com.caverock.androidsvg.q)p0 != 0)
            this.c.setImageDrawable(new com.caverock.androidsvg.cs((com.caverock.androidsvg.q)p0, this.a));
    }

}
