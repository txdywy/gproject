package com.caverock.androidsvg;

public final class C0717l {
    public static long f4591b = 922337203685477580L;
    public static final float[] f4592c = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] f4593d = new float[]{1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};
    public int f4594a;

    public final float m4778a(String str, int i, int i2) {
        Object obj = null;
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        Object obj2 = null;
        int i6 = 0;
        this.f4594a = i;
        if (this.f4594a >= i2) {
            return Float.NaN;
        }
        int i7;
        switch (str.charAt(this.f4594a)) {
            case '+':
                break;
            case '-':
                obj = 1;
                break;
        }
        this.f4594a++;
        int i8 = this.f4594a;
        while (this.f4594a < i2) {
            Object obj3;
            Object obj4;
            char charAt;
            char charAt2 = str.charAt(this.f4594a);
            if (charAt2 == '0') {
                if (i3 == 0) {
                    i4++;
                } else {
                    i5++;
                }
            } else if (charAt2 < '1' || charAt2 > '9') {
                if (charAt2 == '.' && obj2 == null) {
                    i6 = this.f4594a - i8;
                    obj2 = 1;
                }
                if (obj2 == null && this.f4594a == i6 + 1) {
                    return Float.NaN;
                }
                if (i3 == 0) {
                    if (i4 == 0) {
                        return Float.NaN;
                    }
                    i3 = 1;
                }
                if (obj2 != null) {
                    i5 = (i6 - i4) - i3;
                }
                if (this.f4594a < i2) {
                    char charAt3 = str.charAt(this.f4594a);
                    if (charAt3 == 'E' || charAt3 == 'e') {
                        obj3 = null;
                        this.f4594a++;
                        if (this.f4594a == i2) {
                            return Float.NaN;
                        }
                        switch (str.charAt(this.f4594a)) {
                            case '+':
                                break;
                            case '-':
                                obj3 = 1;
                                break;
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                obj4 = null;
                                obj3 = null;
                                break;
                            default:
                                this.f4594a--;
                                obj4 = null;
                                obj3 = 1;
                                break;
                        }
                        this.f4594a++;
                        obj4 = obj3;
                        obj3 = null;
                        if (obj3 == null) {
                            i8 = this.f4594a;
                            i6 = 0;
                            while (this.f4594a < i2) {
                                charAt = str.charAt(this.f4594a);
                                if (charAt >= '0' && charAt <= '9') {
                                    if (((long) i6) > f4591b) {
                                        return Float.NaN;
                                    }
                                    i6 = (i6 * 10) + (charAt - 48);
                                    this.f4594a++;
                                }
                                if (this.f4594a != i8) {
                                    return Float.NaN;
                                }
                                if (obj4 != null) {
                                    i7 = i5 - i6;
                                } else {
                                    i7 = i5 + i6;
                                }
                                if (i7 + i3 <= 39 || i7 + i3 < -44) {
                                    return Float.NaN;
                                }
                                float f = (float) j;
                                if (j != 0) {
                                    if (i7 > 0) {
                                        f *= f4592c[i7];
                                    } else if (i7 < 0) {
                                        if (i7 < -38) {
                                            f = (float) (((double) f) * 1.0E-20d);
                                            i7 += 20;
                                        }
                                        f *= f4593d[-i7];
                                    }
                                }
                                if (obj != null) {
                                    return -f;
                                }
                                return f;
                            }
                            if (this.f4594a != i8) {
                                return Float.NaN;
                            }
                            if (obj4 != null) {
                                i7 = i5 + i6;
                            } else {
                                i7 = i5 - i6;
                            }
                            if (i7 + i3 <= 39) {
                            }
                            return Float.NaN;
                        }
                    }
                }
                i7 = i5;
                if (i7 + i3 <= 39) {
                }
                return Float.NaN;
            } else {
                i3 += i5;
                while (i5 > 0) {
                    if (j > f4591b) {
                        return Float.NaN;
                    }
                    j *= 10;
                    i5--;
                }
                if (j > f4591b) {
                    return Float.NaN;
                }
                j = (j * 10) + ((long) (charAt2 - 48));
                i3++;
                if (j < 0) {
                    return Float.NaN;
                }
            }
            this.f4594a++;
        }
        if (obj2 == null) {
        }
        if (i3 == 0) {
            if (i4 == 0) {
                return Float.NaN;
            }
            i3 = 1;
        }
        if (obj2 != null) {
            i5 = (i6 - i4) - i3;
        }
        if (this.f4594a < i2) {
            char charAt32 = str.charAt(this.f4594a);
            obj3 = null;
            this.f4594a++;
            if (this.f4594a == i2) {
                return Float.NaN;
            }
            switch (str.charAt(this.f4594a)) {
                case '+':
                    break;
                case '-':
                    obj3 = 1;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    obj4 = null;
                    obj3 = null;
                    break;
                default:
                    this.f4594a--;
                    obj4 = null;
                    obj3 = 1;
                    break;
            }
            this.f4594a++;
            obj4 = obj3;
            obj3 = null;
            if (obj3 == null) {
                i8 = this.f4594a;
                i6 = 0;
                while (this.f4594a < i2) {
                    charAt = str.charAt(this.f4594a);
                    if (((long) i6) > f4591b) {
                        return Float.NaN;
                    }
                    i6 = (i6 * 10) + (charAt - 48);
                    this.f4594a++;
                }
                if (this.f4594a != i8) {
                    return Float.NaN;
                }
                if (obj4 != null) {
                    i7 = i5 - i6;
                } else {
                    i7 = i5 + i6;
                }
                if (i7 + i3 <= 39) {
                }
                return Float.NaN;
            }
        }
        i7 = i5;
        if (i7 + i3 <= 39) {
        }
        return Float.NaN;
    }
}
