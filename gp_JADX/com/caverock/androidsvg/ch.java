package com.caverock.androidsvg;

final class ch {
    public float f4420a;
    public float f4421b;
    public float f4422c = 0.0f;
    public float f4423d = 0.0f;

    public ch(float f, float f2, float f3, float f4) {
        this.f4420a = f;
        this.f4421b = f2;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != 0.0d) {
            this.f4422c = (float) (((double) f3) / sqrt);
            this.f4423d = (float) (((double) f4) / sqrt);
        }
    }

    public final void m4671a(float f, float f2) {
        float f3 = f - this.f4420a;
        float f4 = f2 - this.f4421b;
        double sqrt = Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
        if (sqrt != 0.0d) {
            this.f4422c = ((float) (((double) f3) / sqrt)) + this.f4422c;
            this.f4423d += (float) (((double) f4) / sqrt);
        }
    }

    public final void m4672a(ch chVar) {
        this.f4422c += chVar.f4422c;
        this.f4423d += chVar.f4423d;
    }

    public final String toString() {
        float f = this.f4420a;
        float f2 = this.f4421b;
        float f3 = this.f4422c;
        return "(" + f + "," + f2 + " " + f3 + "," + this.f4423d + ")";
    }
}
