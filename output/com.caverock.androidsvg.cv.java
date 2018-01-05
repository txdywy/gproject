package com.caverock.androidsvg;

import android.content.Context;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

protected final class com.caverock.androidsvg.cv extends com.caverock.androidsvg.cu
{

    public final SVGImageView c;

    cv(SVGImageView p0) {
        this.c = p0;
        com.caverock.androidsvg.cu();
    }

    private final com.caverock.androidsvg.q a(String[] p0) {
  3:    v1 = this.c.getResources();
 15:    v0 = com.caverock.androidsvg.q.a.a(p0[0], this.a(v1));
 19:    if (v0 == 0) {
 35:        v0 = com.caverock.androidsvg.q.a(this.c.getContext().getAssets(), p0[0]);
 39:        this.a(v0, v1);
 47:        com.caverock.androidsvg.q.a.a(v0, p0[0]);
 50:        return v0;
        }
 21:    return v0;
 35:    v0 = com.caverock.androidsvg.q.a(this.c.getContext().getAssets(), p0[0]);
 39:    this.a(v0, v1);
 47:    com.caverock.androidsvg.q.a.a(v0, p0[0]);
 50:    return v0;
 56:    v0 = ex.getMessage();
108:    Log.e("SVGImageView", (String.valueOf(p0[0]).length() + 21 + String.valueOf(v0).length()) + "Error loading file " + p0[0] + ": " + v0);
111:    v0 = 0;
112:    return v0;
120:    v0 = String.valueOf(p0[0]);
128:    if (v0.length() != 0)
130:        v0 = "File not found: ".concat(v0);
        else
140:        v0 = new String("File not found: ");
134:    Log.e("SVGImageView", v0);
137:    goto 111;
152:    v0 = String.valueOf(p0[0]);
160:    if (v0.length() != 0)
162:        v0 = "Unable to load asset file: ".concat(v0);
        else
172:        v0 = new String("Unable to load asset file: ");
166:    Log.e("SVGImageView", v0, ex);
169:    goto 111;
176:    try
            run 22...50
        catch (SVGParseException ex) {
 22:        goto 51;
        }
        catch (FileNotFoundException ex) {
 22:        goto 113;
        }
        catch (IOException ex) {
 22:        goto 144;
        }
    }

    protected final Object doInBackground(Object[] p0) {
        return this.a((String[])p0);
    }

    protected final void onPostExecute(Object p0) {
        if ((com.caverock.androidsvg.q)p0 != 0)
            this.c.setImageDrawable(new com.caverock.androidsvg.cs((com.caverock.androidsvg.q)p0, this.a));
    }

}
