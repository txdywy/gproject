package com.caverock.androidsvg;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

final class cx extends cu {
    public final /* synthetic */ SVGImageView f4462c;

    cx(SVGImageView sVGImageView) {
        this.f4462c = sVGImageView;
    }

    private final C0722q m4698a(InputStream... inputStreamArr) {
        int a;
        int resources;
        try {
            a = C0722q.m4787a(inputStreamArr[0]);
            resources = this.f4462c.getResources();
            m4695a(a, resources);
            try {
                inputStreamArr[resources].close();
                return r0;
            } catch (IOException e) {
                return r0;
            }
        } catch (SVGParseException e2) {
            String str = "SVGImageView";
            String str2 = "Parse error loading URI: ";
            String valueOf = String.valueOf(e2.getMessage());
            a = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            Log.e(str, a);
            try {
                inputStreamArr[a].close();
            } catch (IOException e3) {
            }
            return null;
        } finally {
            resources = 0;
            try {
                inputStreamArr[0].close();
            } catch (IOException e4) {
            }
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C0722q c0722q = (C0722q) obj;
        if (c0722q != null) {
            this.f4462c.setImageDrawable(new cs(c0722q, this.a));
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4698a((InputStream[]) objArr);
    }
}
