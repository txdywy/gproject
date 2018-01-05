package com.caverock.androidsvg;

import android.graphics.Path;

final class ci implements an {
    public Path f4424a = new Path();
    public float f4425b;
    public float f4426c;

    public ci(am amVar) {
        if (amVar != null) {
            amVar.m4590a((an) this);
        }
    }

    public final void mo1098a(float f, float f2) {
        this.f4424a.moveTo(f, f2);
        this.f4425b = f;
        this.f4426c = f2;
    }

    public final void mo1102b(float f, float f2) {
        this.f4424a.lineTo(f, f2);
        this.f4425b = f;
        this.f4426c = f2;
    }

    public final void mo1100a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4424a.cubicTo(f, f2, f3, f4, f5, f6);
        this.f4425b = f5;
        this.f4426c = f6;
    }

    public final void mo1099a(float f, float f2, float f3, float f4) {
        this.f4424a.quadTo(f, f2, f3, f4);
        this.f4425b = f3;
        this.f4426c = f4;
    }

    public final void mo1101a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        cf.m4642b(this.f4425b, this.f4426c, f, f2, f3, z, z2, f4, f5, this);
        this.f4425b = f4;
        this.f4426c = f5;
    }

    public final void mo1097a() {
        this.f4424a.close();
    }
}
