package com.caverock.androidsvg;

class ck extends co {
    public final /* synthetic */ cf f4427b;
    public float f4428c;
    public float f4429d;

    public ck(cf cfVar, float f, float f2) {
        this.f4427b = cfVar;
        this.f4428c = f;
        this.f4429d = f2;
    }

    public void mo1105a(String str) {
        if (this.f4427b.m4664c()) {
            if (this.f4427b.f4406h.f4437b) {
                this.f4427b.f4399a.drawText(str, this.f4428c, this.f4429d, this.f4427b.f4406h.f4439d);
            }
            if (this.f4427b.f4406h.f4438c) {
                this.f4427b.f4399a.drawText(str, this.f4428c, this.f4429d, this.f4427b.f4406h.f4440e);
            }
        }
        this.f4428c += this.f4427b.f4406h.f4439d.measureText(str);
    }
}
