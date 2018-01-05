package com.caverock.androidsvg;

import java.util.Locale;

public final class com.caverock.androidsvg.df
{

    public String a;
    public int b;
    public int c;
    public com.caverock.androidsvg.l d;

    df(String p0) {
        this.b = 0;
        this.c = 0;
        this.d = new com.caverock.androidsvg.l();
        this.a = p0.trim();
        this.c = this.a.length();
    }

    protected static boolean a(int p0) {
        if (p0 == 32 || p0 == 10 || p0 == 13 || p0 == 9)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final float a(float p0) {
        if (Float.isNaN(p0))
            v0 = 2143289344;
        else {
            this.d();
            v0 = this.e();
        }
        return v0;
    }

    public final Boolean a(Object p0) {
        v0 = 0;
        if (p0 != 0) {
            this.d();
            if (this.b != this.c) {
                v1 = this.a.charAt(this.b);
                if (v1 == 48 || v1 == 49) {
                    this.b = this.b + 1;
                    if (v1 == 49)
                        v0 = 1;
                    else
                        v0 = 0;
                    v0 = Boolean.valueOf(v0);
                }
            }
        }
        return v0;
    }

    public final boolean a(char p0) {
        if (this.b < this.c && this.a.charAt(this.b) == p0)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            this.b = this.b + 1;
        return v0;
    }

    public final boolean a(String p0) {
        v1 = p0.length();
        if (this.b <= this.c - v1 && this.a.substring(this.b, this.b + v1).equals(p0))
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0)
            this.b = v1 + this.b;
        return v0;
    }

    public final String b(char p0) {
        v0 = 0;
        if (!this.b()) {
            v1 = this.a.charAt(this.b);
            if (!com.caverock.androidsvg.df.a(v1) && v1 != p0) {
                v0 = this.i();
                while (v0 != -1 && v0 != p0 && !com.caverock.androidsvg.df.a(v0))
                    v0 = this.i();
                v0 = this.a.substring(this.b, this.b);
            }
        }
        return v0;
    }

    public final boolean b() {
        if (this.b == this.c)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void c() {
        while (this.b < this.c && com.caverock.androidsvg.df.a(this.a.charAt(this.b)))
            this.b = this.b + 1;
    }

    public final boolean d() {
        v0 = 0;
        this.c();
        if (this.b != this.c && this.a.charAt(this.b) == 44) {
            this.b = this.b + 1;
            this.c();
            v0 = 1;
        }
        return v0;
    }

    public final float e() {
        v0 = this.d.a(this.a, this.b, this.c);
        if (!Float.isNaN(v0))
            this.b = this.d.a;
        return v0;
    }

    public final float f() {
        this.d();
        v0 = this.d.a(this.a, this.b, this.c);
        if (!Float.isNaN(v0))
            this.b = this.d.a;
        return v0;
    }

    public final Integer g() {
        if (this.b == this.c)
            v0 = 0;
        else {
            this.b = this.b + 1;
            v0 = Integer.valueOf(this.a.charAt(this.b));
        }
        return v0;
    }

    public final com.caverock.androidsvg.af h() {
        v1 = this.e();
        if (Float.isNaN(v1))
            v0 = 0;
        else {
            v2 = this.l();
            if (v2 == 0)
                v0 = new com.caverock.androidsvg.af(v1, com.caverock.androidsvg.cc.a);
            else
                v0 = new com.caverock.androidsvg.af(v1, v2);
        }
        return v0;
    }

    protected final int i() {
        v0 = -1;
        if (this.b != this.c) {
            this.b = this.b + 1;
            if (this.b < this.c)
                v0 = this.a.charAt(this.b);
        }
        return v0;
    }

    public final String j() {
        if (this.b()) {
            v0 = 0;
            return v0;
        }
        v0 = this.a.charAt(this.b);
        while (true) {
            if (v0 < 97 || v0 > 122) {
                if (v0 < 65) {
                    while (com.caverock.androidsvg.df.a(v0))
                        v0 = this.i();
                    if (v0 == 40) {
                        this.b = this.b + 1;
                        v0 = this.a.substring(this.b, this.b);
                    }
                    else {
                        this.b = this.b;
                        v0 = 0;
                    }
                    return v0;
                }
                if (v0 > 90) {
                    while (com.caverock.androidsvg.df.a(v0))
                        v0 = this.i();
                    if (v0 == 40) {
                        this.b = this.b + 1;
                        v0 = this.a.substring(this.b, this.b);
                    }
                    else {
                        this.b = this.b;
                        v0 = 0;
                    }
                    return v0;
                }
            }
            v0 = this.i();
        }
    }

    public final String k() {
        while (!this.b() && !com.caverock.androidsvg.df.a(this.a.charAt(this.b)))
            this.b = this.b + 1;
        this.b = this.b;
        return this.a.substring(this.b, this.b);
    }

    public final com.caverock.androidsvg.cc l() {
        v0 = 0;
        if (!this.b()) {
            if (this.a.charAt(this.b) == 37) {
                this.b = this.b + 1;
                v0 = com.caverock.androidsvg.cc.i;
                return v0;
            }
            if (this.b > this.c - 2)
                return v0;
            this.b = this.b + 2;
            v0 = com.caverock.androidsvg.cc.valueOf(this.a.substring(this.b, this.b + 2).toLowerCase(Locale.US));
            return v0;
        }
        return v0;
        if (this.a.charAt(this.b) == 37) {
            this.b = this.b + 1;
            v0 = com.caverock.androidsvg.cc.i;
            return v0;
        }
        if (this.b > this.c - 2)
            return v0;
        try {
            this.b = this.b + 2;
        }
        catch (IllegalArgumentException ex) {
            return v0;
        }
        v0 = com.caverock.androidsvg.cc.valueOf(this.a.substring(this.b, this.b + 2).toLowerCase(Locale.US));
        return v0;
    }

    public final String m() {
        v0 = 0;
        if (this.b())
            return v0;
        v2 = this.a.charAt(this.b);
        if (v2 != 39 && v2 != 34)
            return v0;
        while (true) {
            v3 = this.i();
            if (v3 == -1) {
                if (v3 == -1)
                    this.b = this.b;
                else {
                    this.b = this.b + 1;
                    v0 = this.a.substring(this.b + 1, this.b - 1);
                }
                return v0;
            }
            if (v3 == v2) {
                if (v3 == -1)
                    this.b = this.b;
                else {
                    this.b = this.b + 1;
                    v0 = this.a.substring(this.b + 1, this.b - 1);
                }
                return v0;
            }
        }
    }

}
