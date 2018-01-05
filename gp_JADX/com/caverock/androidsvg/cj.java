package com.caverock.androidsvg;

import android.graphics.Path;

final class cj extends ck {
    public Path f4430a;
    public final /* synthetic */ cf f4431b;

    public cj(cf cfVar, Path path, float f) {
        this.f4431b = cfVar;
        super(cfVar, f, 0.0f);
        this.f4430a = path;
    }

    public final void mo1105a(String str) {
        if (this.f4431b.m4664c()) {
            if (this.f4431b.f4406h.f4437b) {
                this.f4431b.f4399a.drawTextOnPath(str, this.f4430a, this.c, this.d, this.f4431b.f4406h.f4439d);
            }
            if (this.f4431b.f4406h.f4438c) {
                this.f4431b.f4399a.drawTextOnPath(str, this.f4430a, this.c, this.d, this.f4431b.f4406h.f4440e);
            }
        }
        this.c += this.f4431b.f4406h.f4439d.measureText(str);
    }
}
