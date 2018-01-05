package com.caverock.androidsvg;

import java.util.Locale;

public class df {
    public String f4472a;
    public int f4473b = 0;
    public int f4474c = 0;
    public C0717l f4475d = new C0717l();

    public df(String str) {
        this.f4472a = str.trim();
        this.f4474c = this.f4472a.length();
    }

    public final boolean m4754b() {
        return this.f4473b == this.f4474c;
    }

    protected static boolean m4748a(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final void m4755c() {
        while (this.f4473b < this.f4474c && m4748a(this.f4472a.charAt(this.f4473b))) {
            this.f4473b++;
        }
    }

    public final boolean m4756d() {
        m4755c();
        if (this.f4473b == this.f4474c || this.f4472a.charAt(this.f4473b) != ',') {
            return false;
        }
        this.f4473b++;
        m4755c();
        return true;
    }

    public final float m4757e() {
        float a = this.f4475d.m4778a(this.f4472a, this.f4473b, this.f4474c);
        if (!Float.isNaN(a)) {
            this.f4473b = this.f4475d.f4594a;
        }
        return a;
    }

    public final float m4758f() {
        m4756d();
        float a = this.f4475d.m4778a(this.f4472a, this.f4473b, this.f4474c);
        if (!Float.isNaN(a)) {
            this.f4473b = this.f4475d.f4594a;
        }
        return a;
    }

    public final float m4749a(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        m4756d();
        return m4757e();
    }

    public final Integer m4759g() {
        if (this.f4473b == this.f4474c) {
            return null;
        }
        String str = this.f4472a;
        int i = this.f4473b;
        this.f4473b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public final af m4760h() {
        float e = m4757e();
        if (Float.isNaN(e)) {
            return null;
        }
        cc l = m4764l();
        if (l == null) {
            return new af(e, cc.px);
        }
        return new af(e, l);
    }

    public final Boolean m4750a(Object obj) {
        if (obj == null) {
            return null;
        }
        m4756d();
        if (this.f4473b == this.f4474c) {
            return null;
        }
        char charAt = this.f4472a.charAt(this.f4473b);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.f4473b++;
        return Boolean.valueOf(charAt == '1');
    }

    public final boolean m4751a(char c) {
        boolean z = this.f4473b < this.f4474c && this.f4472a.charAt(this.f4473b) == c;
        if (z) {
            this.f4473b++;
        }
        return z;
    }

    public final boolean m4752a(String str) {
        int length = str.length();
        boolean z = this.f4473b <= this.f4474c - length && this.f4472a.substring(this.f4473b, this.f4473b + length).equals(str);
        if (z) {
            this.f4473b = length + this.f4473b;
        }
        return z;
    }

    protected final int m4761i() {
        if (this.f4473b == this.f4474c) {
            return -1;
        }
        this.f4473b++;
        if (this.f4473b < this.f4474c) {
            return this.f4472a.charAt(this.f4473b);
        }
        return -1;
    }

    public final String m4753b(char c) {
        if (m4754b()) {
            return null;
        }
        char charAt = this.f4472a.charAt(this.f4473b);
        if (m4748a((int) charAt) || charAt == c) {
            return null;
        }
        int i = this.f4473b;
        int i2 = m4761i();
        while (i2 != -1 && i2 != c && !m4748a(i2)) {
            i2 = m4761i();
        }
        return this.f4472a.substring(i, this.f4473b);
    }

    public final String m4762j() {
        if (m4754b()) {
            return null;
        }
        int i;
        int i2 = this.f4473b;
        int charAt = this.f4472a.charAt(this.f4473b);
        while (true) {
            if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                i = this.f4473b;
            } else {
                charAt = m4761i();
            }
        }
        i = this.f4473b;
        while (m4748a(charAt)) {
            charAt = m4761i();
        }
        if (charAt == 40) {
            this.f4473b++;
            return this.f4472a.substring(i2, i);
        }
        this.f4473b = i2;
        return null;
    }

    public final String m4763k() {
        int i = this.f4473b;
        while (!m4754b() && !m4748a(this.f4472a.charAt(this.f4473b))) {
            this.f4473b++;
        }
        String substring = this.f4472a.substring(i, this.f4473b);
        this.f4473b = i;
        return substring;
    }

    public final cc m4764l() {
        if (m4754b()) {
            return null;
        }
        if (this.f4472a.charAt(this.f4473b) == '%') {
            this.f4473b++;
            return cc.percent;
        } else if (this.f4473b > this.f4474c - 2) {
            return null;
        } else {
            try {
                cc valueOf = cc.valueOf(this.f4472a.substring(this.f4473b, this.f4473b + 2).toLowerCase(Locale.US));
                this.f4473b += 2;
                return valueOf;
            } catch (IllegalArgumentException e) {
                return null;
            }
        }
    }

    public final String m4765m() {
        if (m4754b()) {
            return null;
        }
        int i = this.f4473b;
        char charAt = this.f4472a.charAt(this.f4473b);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        char i2;
        do {
            i2 = m4761i();
            if (i2 == '￿') {
                break;
            }
        } while (i2 != charAt);
        if (i2 == '￿') {
            this.f4473b = i;
            return null;
        }
        this.f4473b++;
        return this.f4472a.substring(i + 1, this.f4473b - 1);
    }
}
