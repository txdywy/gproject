package com.caverock.androidsvg;

import android.graphics.Paint;

public final class com.caverock.androidsvg.af implements Cloneable
{

    public float a;
    public com.caverock.androidsvg.cc b;

    af(float p0) {
        this.a = 0;
        this.b = com.caverock.androidsvg.cc.a;
        this.a = p0;
        this.b = com.caverock.androidsvg.cc.a;
    }

    af(float p0, com.caverock.androidsvg.cc p1) {
        this.a = 0;
        this.b = com.caverock.androidsvg.cc.a;
        this.a = p0;
        this.b = p1;
    }

    public final float a(float p0) {
        switch (this.b.ordinal()) {
            case 0:
                v0 = this.a;
                break;
            case 1:
                v0 = this.a;
                break;
            case 2:
                v0 = this.a;
                break;
            case 3:
                v0 = this.a * p0;
                break;
            case 4:
                v0 = this.a * p0 / 1076006748;
                break;
            case 5:
                v0 = this.a * p0 / 1103835955;
                break;
            case 6:
                v0 = this.a * p0 / 1116733440;
                break;
            case 7:
                v0 = this.a * p0 / 1086324736;
                break;
            default:
                v0 = this.a;
                break;
        }
        return v0;
    }

    public final float a(com.caverock.androidsvg.cf p0) {
        switch (this.b.ordinal()) {
            case 0:
                v0 = this.a;
                break;
            case 1:
                v0 = this.a * p0.a();
                break;
            case 2:
                v0 = this.a * p0.h.d.getTextSize() / 1073741824;
                break;
            case 3:
                v0 = this.a * p0.c;
                break;
            case 4:
                v0 = this.a * p0.c / 1076006748;
                break;
            case 5:
                v0 = this.a * p0.c / 1103835955;
                break;
            case 6:
                v0 = this.a * p0.c / 1116733440;
                break;
            case 7:
                v0 = this.a * p0.c / 1086324736;
                break;
            case 8:
                v0 = p0.b();
                if (v0 == 0)
                    v0 = this.a;
                else
                    v0 = v0.c * this.a / 1120403456;
                break;
            default:
                v0 = this.a;
                break;
        }
        return v0;
    }

    public final float a(com.caverock.androidsvg.cf p0, float p1) {
        if (this.b == com.caverock.androidsvg.cc.i)
            v0 = this.a * p1 / 1120403456;
        else
            v0 = this.a(p0);
        return v0;
    }

    public final boolean a() {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final float b(com.caverock.androidsvg.cf p0) {
        if (this.b == com.caverock.androidsvg.cc.i) {
            v0 = p0.b();
            if (v0 == 0)
                v0 = this.a;
            else
                v0 = v0.d * this.a / 1120403456;
        }
        else
            v0 = this.a(p0);
        return v0;
    }

    public final boolean b() {
        if (this.a < 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final float c(com.caverock.androidsvg.cf p0) {
        if (this.b == com.caverock.androidsvg.cc.i) {
            v0 = p0.b();
            if (v0 == 0)
                v0 = this.a;
            else if (v0.c == v0.d)
                v0 = this.a * v0.c / 1120403456;
            else
                v0 = (float)(Math.sqrt((double)(v0.d * v0.d + v0.c * v0.c)) / 4609047870845172684) * this.a / 1120403456;
        }
        else
            v0 = this.a(p0);
        return v0;
    }

    public final String toString() {
        v0 = String.valueOf(this.a);
        v1 = String.valueOf(this.b);
        return (String.valueOf(v0).length() + String.valueOf(v1).length()) + v0 + v1;
    }

}
