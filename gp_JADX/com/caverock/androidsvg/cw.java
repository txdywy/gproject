package com.caverock.androidsvg;

import android.content.res.Resources;
import android.util.Log;

final class cw extends cu {
    public final /* synthetic */ SVGImageView f4461c;

    cw(SVGImageView sVGImageView) {
        this.f4461c = sVGImageView;
    }

    private final C0722q m4697a(Integer... numArr) {
        Resources resources = this.f4461c.getResources();
        C0722q a = C0722q.f4613a.m4689a(numArr[0].intValue(), m4694a(resources));
        if (a != null) {
            return a;
        }
        try {
            a = C0722q.m4784a(this.f4461c.getContext(), numArr[0].intValue());
            m4695a(a, resources);
            C0722q.f4613a.m4691a(a, numArr[0].intValue());
            return a;
        } catch (SVGParseException e) {
            Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", new Object[]{numArr[0], e.getMessage()}));
            return null;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C0722q c0722q = (C0722q) obj;
        if (c0722q != null) {
            this.f4461c.setImageDrawable(new cs(c0722q, this.a));
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m4697a((Integer[]) objArr);
    }
}
