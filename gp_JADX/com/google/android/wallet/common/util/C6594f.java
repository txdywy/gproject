package com.google.android.wallet.common.util;

import android.text.TextUtils;

public final class C6594f {
    public int f32730a;
    public int f32731b;
    public int f32732c;
    public int f32733d;
    public final int f32734e;
    public final String f32735f;

    public C6594f(String str, int i, String str2) {
        if (i == 2) {
            this.f32734e = 2;
        } else if (i == 1) {
            this.f32734e = 3;
        } else {
            throw new IllegalArgumentException(i + " not a supported DateField.type");
        }
        if (TextUtils.isEmpty(str2)) {
            this.f32735f = "/";
        } else {
            this.f32735f = str2;
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must provide a DateField.format");
        }
        this.f32730a = -1;
        this.f32731b = -1;
        this.f32732c = -1;
        String[] split = str.split("/");
        if (split.length != this.f32734e) {
            throw new IllegalArgumentException("Invalid number of date components. Expected " + this.f32734e + " based on the DateField.type, but found " + split.length + " in the format");
        }
        for (int i2 = 0; i2 < this.f32734e; i2++) {
            Object obj;
            String str3 = split[i2];
            if (str3.equals("d")) {
                if (i != 1) {
                    throw new IllegalArgumentException("Days are only supported with DateField.YEAR_MONTH_DAY");
                }
                obj = this.f32730a >= 0 ? 1 : null;
                this.f32730a = i2;
            } else if (str3.equals("M")) {
                if (this.f32731b >= 0) {
                    obj = 1;
                } else {
                    obj = null;
                }
                this.f32731b = i2;
            } else if (str3.equals("yyyy")) {
                this.f32733d = 4;
                if (this.f32732c >= 0) {
                    obj = 1;
                } else {
                    obj = null;
                }
                this.f32732c = i2;
            } else if (str3.equals("yy")) {
                this.f32733d = 2;
                if (this.f32732c >= 0) {
                    obj = 1;
                } else {
                    obj = null;
                }
                this.f32732c = i2;
            } else {
                throw new IllegalArgumentException(String.valueOf(str3).concat(" is not a supported date component. Supported date components: d, M, yy, yyyy"));
            }
            if (obj != null) {
                throw new IllegalArgumentException("Only one of each date component is allowed");
            }
        }
    }

    public final String m29922a(String str, String str2, String str3) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder(10);
        int i2 = 0;
        while (i < this.f32734e) {
            if (i == this.f32730a) {
                Object obj = str;
            } else if (i == this.f32731b) {
                r2 = str2;
            } else {
                r2 = str3;
            }
            if (TextUtils.isEmpty(obj)) {
                i2++;
            } else {
                while (i2 > 0) {
                    stringBuilder.append(this.f32735f);
                    i2--;
                }
                stringBuilder.append(obj);
                if (i < this.f32734e - 1) {
                    stringBuilder.append(this.f32735f);
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public final String m29921a(int i, int i2, int i3) {
        return m29922a(Integer.toString(i), Integer.toString(i2), Integer.toString(i3));
    }
}
