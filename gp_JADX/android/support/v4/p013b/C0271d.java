package android.support.v4.p013b;

import android.graphics.Path;
import android.util.Log;

public final class C0271d {
    public char f1644a;
    public float[] f1645b;

    C0271d(char c, float[] fArr) {
        this.f1644a = c;
        this.f1645b = fArr;
    }

    C0271d(C0271d c0271d) {
        this.f1644a = c0271d.f1644a;
        this.f1645b = C0269b.m1549a(c0271d.f1645b, c0271d.f1645b.length);
    }

    public static void m1555a(C0271d[] c0271dArr, Path path) {
        float[] fArr = new float[6];
        int i = 0;
        char c = 'm';
        while (i < c0271dArr.length) {
            int i2;
            char c2 = c0271dArr[i].f1644a;
            float[] fArr2 = c0271dArr[i].f1645b;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f5, f6);
                    f4 = f6;
                    f3 = f5;
                    f2 = f6;
                    f = f5;
                    i2 = 2;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            int i3 = 0;
            float f7 = f6;
            float f8 = f5;
            float f9 = f2;
            float f10 = f;
            while (i3 < fArr2.length) {
                switch (c2) {
                    case 'A':
                        C0271d.m1554a(path, f10, f9, fArr2[i3 + 5], fArr2[i3 + 6], fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f3 = fArr2[i3 + 5];
                        f4 = fArr2[i3 + 6];
                        f6 = f7;
                        f5 = f8;
                        f2 = f4;
                        f = f3;
                        break;
                    case 'C':
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3], fArr2[i3 + 4], fArr2[i3 + 5]);
                        f5 = fArr2[i3 + 4];
                        f6 = fArr2[i3 + 5];
                        f3 = fArr2[i3 + 2];
                        f4 = fArr2[i3 + 3];
                        f2 = f6;
                        f = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'H':
                        path.lineTo(fArr2[i3 + 0], f9);
                        f6 = f7;
                        f2 = f9;
                        f = fArr2[i3 + 0];
                        f5 = f8;
                        break;
                    case 'L':
                        path.lineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                        f5 = fArr2[i3 + 0];
                        f2 = fArr2[i3 + 1];
                        f = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'M':
                        f5 = fArr2[i3 + 0];
                        f6 = fArr2[i3 + 1];
                        if (i3 <= 0) {
                            path.moveTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                            f2 = f6;
                            f = f5;
                            break;
                        }
                        path.lineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                        f2 = f6;
                        f = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'Q':
                        path.quadTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                        f3 = fArr2[i3 + 0];
                        f4 = fArr2[i3 + 1];
                        f5 = fArr2[i3 + 2];
                        f2 = fArr2[i3 + 3];
                        f = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'S':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = (2.0f * f9) - f4;
                            f4 = (2.0f * f10) - f3;
                        } else {
                            f6 = f9;
                            f4 = f10;
                        }
                        path.cubicTo(f4, f6, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                        f3 = fArr2[i3 + 0];
                        f4 = fArr2[i3 + 1];
                        f5 = fArr2[i3 + 2];
                        f2 = fArr2[i3 + 3];
                        f = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'T':
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f10 = (2.0f * f10) - f3;
                            f9 = (2.0f * f9) - f4;
                        }
                        path.quadTo(f10, f9, fArr2[i3 + 0], fArr2[i3 + 1]);
                        f5 = fArr2[i3 + 0];
                        f4 = f9;
                        f3 = f10;
                        f2 = fArr2[i3 + 1];
                        f = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'V':
                        path.lineTo(f10, fArr2[i3 + 0]);
                        f5 = f8;
                        f2 = fArr2[i3 + 0];
                        f = f10;
                        f6 = f7;
                        break;
                    case 'a':
                        C0271d.m1554a(path, f10, f9, fArr2[i3 + 5] + f10, fArr2[i3 + 6] + f9, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f3 = f10 + fArr2[i3 + 5];
                        f4 = f9 + fArr2[i3 + 6];
                        f6 = f7;
                        f5 = f8;
                        f2 = f4;
                        f = f3;
                        break;
                    case 'c':
                        path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3], fArr2[i3 + 4], fArr2[i3 + 5]);
                        f3 = f10 + fArr2[i3 + 2];
                        f4 = f9 + fArr2[i3 + 3];
                        f2 = f9 + fArr2[i3 + 5];
                        f = f10 + fArr2[i3 + 4];
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'h':
                        path.rLineTo(fArr2[i3 + 0], 0.0f);
                        f6 = f7;
                        f2 = f9;
                        f = f10 + fArr2[i3 + 0];
                        f5 = f8;
                        break;
                    case 'l':
                        path.rLineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                        f2 = f9 + fArr2[i3 + 1];
                        f = f10 + fArr2[i3 + 0];
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'm':
                        f5 = f10 + fArr2[i3 + 0];
                        f6 = f9 + fArr2[i3 + 1];
                        if (i3 <= 0) {
                            path.rMoveTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                            f2 = f6;
                            f = f5;
                            break;
                        }
                        path.rLineTo(fArr2[i3 + 0], fArr2[i3 + 1]);
                        f2 = f6;
                        f = f5;
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'q':
                        path.rQuadTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                        f3 = f10 + fArr2[i3 + 0];
                        f4 = f9 + fArr2[i3 + 1];
                        f2 = f9 + fArr2[i3 + 3];
                        f = f10 + fArr2[i3 + 2];
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 's':
                        f6 = 0.0f;
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f6 = f9 - f4;
                            f4 = f10 - f3;
                        } else {
                            f4 = 0.0f;
                        }
                        path.rCubicTo(f4, f6, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3]);
                        f3 = f10 + fArr2[i3 + 0];
                        f4 = f9 + fArr2[i3 + 1];
                        f2 = f9 + fArr2[i3 + 3];
                        f = f10 + fArr2[i3 + 2];
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 't':
                        float f11;
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f11 = f9 - f4;
                            f4 = f10 - f3;
                        } else {
                            f11 = 0.0f;
                            f4 = 0.0f;
                        }
                        path.rQuadTo(f4, f11, fArr2[i3 + 0], fArr2[i3 + 1]);
                        f3 = f10 + f4;
                        f4 = f9 + f11;
                        f2 = f9 + fArr2[i3 + 1];
                        f = f10 + fArr2[i3 + 0];
                        f6 = f7;
                        f5 = f8;
                        break;
                    case 'v':
                        path.rLineTo(0.0f, fArr2[i3 + 0]);
                        f5 = f8;
                        f2 = f9 + fArr2[i3 + 0];
                        f = f10;
                        f6 = f7;
                        break;
                    default:
                        f6 = f7;
                        f5 = f8;
                        f2 = f9;
                        f = f10;
                        break;
                }
                i3 += i2;
                f7 = f6;
                f8 = f5;
                f9 = f2;
                f10 = f;
                c = c2;
            }
            fArr[0] = f10;
            fArr[1] = f9;
            fArr[2] = f3;
            fArr[3] = f4;
            fArr[4] = f8;
            fArr[5] = f7;
            char c3 = c0271dArr[i].f1644a;
            i++;
            c = c3;
        }
    }

    public final void m1556a(C0271d c0271d, C0271d c0271d2, float f) {
        for (int i = 0; i < c0271d.f1645b.length; i++) {
            this.f1645b[i] = (c0271d.f1645b[i] * (1.0f - f)) + (c0271d2.f1645b[i] * f);
        }
    }

    private static void m1554a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double toRadians;
        double cos;
        double sin;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        Path path2 = path;
        while (true) {
            toRadians = Math.toRadians((double) f7);
            cos = Math.cos(toRadians);
            sin = Math.sin(toRadians);
            d = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
            d2 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
            d3 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
            d4 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
            d5 = d - d3;
            d6 = d2 - d4;
            d7 = (d + d3) / 2.0d;
            double d10 = (d2 + d4) / 2.0d;
            d8 = (d5 * d5) + (d6 * d6);
            if (d8 != 0.0d) {
                d9 = (1.0d / d8) - 0.25d;
                if (d9 >= 0.0d) {
                    break;
                }
                Log.w("PathParser", "Points are too far apart " + d8);
                float sqrt = (float) (Math.sqrt(d8) / 1.99999d);
                f5 *= sqrt;
                f6 *= sqrt;
            } else {
                Log.w("PathParser", " Points are coincident");
                return;
            }
        }
        d8 = Math.sqrt(d9);
        d5 *= d8;
        d6 *= d8;
        if (z == z2) {
            d6 = d7 - d6;
            d5 += d10;
        } else {
            d6 += d7;
            d5 = d10 - d5;
        }
        d7 = Math.atan2(d2 - d5, d - d6);
        d3 = Math.atan2(d4 - d5, d3 - d6) - d7;
        if (z2 != (d3 >= 0.0d)) {
            if (d3 > 0.0d) {
                d3 -= 6.283185307179586d;
            } else {
                d3 += 6.283185307179586d;
            }
        }
        d6 *= (double) f5;
        d = ((double) f6) * d5;
        C0271d.m1553a(path2, (d6 * cos) - (d * sin), (d6 * sin) + (cos * d), (double) f5, (double) f6, (double) f, (double) f2, toRadians, d7, d3);
    }

    private static void m1553a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
        double cos = Math.cos(d7);
        double sin = Math.sin(d7);
        double cos2 = Math.cos(d8);
        double sin2 = Math.sin(d8);
        double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
        double d11 = d9 / ((double) ceil);
        int i = 0;
        cos2 = (sin2 * ((-d3) * sin)) + (cos2 * (d4 * cos));
        sin2 = d10;
        while (i < ceil) {
            double d12 = d8 + d11;
            d10 = Math.sin(d12);
            double cos3 = Math.cos(d12);
            double d13 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * d10);
            double d14 = ((d4 * cos) * d10) + (((d3 * sin) * cos3) + d2);
            double d15 = (((-d3) * cos) * d10) - ((d4 * sin) * cos3);
            cos3 = (cos3 * (d4 * cos)) + (d10 * ((-d3) * sin));
            d10 = Math.tan((d12 - d8) / 2.0d);
            d10 = ((Math.sqrt((d10 * (3.0d * d10)) + 4.0d) - 1.0d) * Math.sin(d12 - d8)) / 3.0d;
            sin2 = (sin2 * d10) + d5;
            double d16 = d6 + (cos2 * d10);
            double d17 = d13 - (d10 * d15);
            d10 = d14 - (d10 * cos3);
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) sin2, (float) d16, (float) d17, (float) d10, (float) d13, (float) d14);
            i++;
            sin2 = d15;
            d8 = d12;
            d6 = d14;
            d5 = d13;
            cos2 = cos3;
        }
    }
}
