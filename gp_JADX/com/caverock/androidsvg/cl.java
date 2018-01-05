package com.caverock.androidsvg;

import android.graphics.Path;

final class cl extends co {
    public float f4432a;
    public float f4433b;
    public Path f4434c;
    public final /* synthetic */ cf f4435d;

    public cl(cf cfVar, float f, float f2, Path path) {
        this.f4435d = cfVar;
        this.f4432a = f;
        this.f4433b = f2;
        this.f4434c = path;
    }

    public final boolean mo1106a(bx bxVar) {
        if (!(bxVar instanceof by)) {
            return true;
        }
        cf.m4636a("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        return false;
    }

    public final void mo1105a(String str) {
        if (this.f4435d.m4664c()) {
            Path path = new Path();
            this.f4435d.f4406h.f4439d.getTextPath(str, 0, str.length(), this.f4432a, this.f4433b, path);
            this.f4434c.addPath(path);
        }
        this.f4432a += this.f4435d.f4406h.f4439d.measureText(str);
    }
}
