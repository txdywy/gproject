package com.caverock.androidsvg;

public final class af implements Cloneable {
    public float f4230a = 0.0f;
    public cc f4231b = cc.px;

    public af(float f, cc ccVar) {
        this.f4230a = f;
        this.f4231b = ccVar;
    }

    public af(float f) {
        this.f4230a = f;
        this.f4231b = cc.px;
    }

    public final float m4571a(cf cfVar) {
        switch (this.f4231b.ordinal()) {
            case 0:
                return this.f4230a;
            case 1:
                return this.f4230a * cfVar.m4659a();
            case 2:
                return this.f4230a * (cfVar.f4406h.f4439d.getTextSize() / 2.0f);
            case 3:
                return this.f4230a * cfVar.f4401c;
            case 4:
                return (this.f4230a * cfVar.f4401c) / 2.54f;
            case 5:
                return (this.f4230a * cfVar.f4401c) / 25.4f;
            case 6:
                return (this.f4230a * cfVar.f4401c) / 72.0f;
            case 7:
                return (this.f4230a * cfVar.f4401c) / 6.0f;
            case 8:
                C0723r b = cfVar.m4663b();
                if (b == null) {
                    return this.f4230a;
                }
                return (b.f4622c * this.f4230a) / 100.0f;
            default:
                return this.f4230a;
        }
    }

    public final float m4574b(cf cfVar) {
        if (this.f4231b != cc.percent) {
            return m4571a(cfVar);
        }
        C0723r b = cfVar.m4663b();
        if (b == null) {
            return this.f4230a;
        }
        return (b.f4623d * this.f4230a) / 100.0f;
    }

    public final float m4576c(cf cfVar) {
        if (this.f4231b != cc.percent) {
            return m4571a(cfVar);
        }
        C0723r b = cfVar.m4663b();
        if (b == null) {
            return this.f4230a;
        }
        float f = b.f4622c;
        float f2 = b.f4623d;
        if (f == f2) {
            return (this.f4230a * f) / 100.0f;
        }
        return (((float) (Math.sqrt((double) ((f2 * f2) + (f * f))) / 1.414213562373095d)) * this.f4230a) / 100.0f;
    }

    public final float m4572a(cf cfVar, float f) {
        if (this.f4231b == cc.percent) {
            return (this.f4230a * f) / 100.0f;
        }
        return m4571a(cfVar);
    }

    public final float m4570a(float f) {
        switch (this.f4231b.ordinal()) {
            case 0:
                return this.f4230a;
            case 3:
                return this.f4230a * f;
            case 4:
                return (this.f4230a * f) / 2.54f;
            case 5:
                return (this.f4230a * f) / 25.4f;
            case 6:
                return (this.f4230a * f) / 72.0f;
            case 7:
                return (this.f4230a * f) / 6.0f;
            default:
                return this.f4230a;
        }
    }

    public final boolean m4573a() {
        return this.f4230a == 0.0f;
    }

    public final boolean m4575b() {
        return this.f4230a < 0.0f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4230a);
        String valueOf2 = String.valueOf(this.f4231b);
        return new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString();
    }
}
