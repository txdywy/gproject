package com.google.android.finsky.billing.addresschallenge.p156a;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class aa {
    public String f8795a;
    public C1728z f8796b;
    public Set f8797c;
    public Set f8798d;
    public Map f8799e;
    public String[] f8800f;
    public String[] f8801g;
    public String[] f8802h;
    public Pattern f8803i;
    public Pattern f8804j;

    public aa(C1728z c1728z) {
        this.f8796b = c1728z;
        this.f8795a = "data";
        C1714i b = this.f8796b.mo2422b("data");
        if (b.m9590a(C1708c.COUNTRIES)) {
            this.f8800f = b.m9591b(C1708c.COUNTRIES).split("~");
        }
        this.f8799e = az.m9576a(this.f8800f, null, null);
        b = this.f8796b.mo2422b("data/ZZ");
        this.f8797c = new HashSet();
        if (b.m9590a(C1708c.FMT)) {
            this.f8797c = aa.m9518b(b.m9591b(C1708c.FMT));
        }
        this.f8798d = new HashSet();
        if (b.m9590a(C1708c.REQUIRE)) {
            this.f8798d = aa.m9519c(b.m9591b(C1708c.REQUIRE));
        }
    }

    private aa(aa aaVar, C1714i c1714i) {
        this.f8797c = aaVar.f8797c;
        this.f8798d = aaVar.f8798d;
        this.f8796b = aaVar.f8796b;
        this.f8803i = aaVar.f8803i;
        this.f8804j = aaVar.f8804j;
        if (c1714i != null) {
            if (c1714i.m9590a(C1708c.ID)) {
                this.f8795a = c1714i.m9591b(C1708c.ID);
            }
            if (c1714i.m9590a(C1708c.SUB_KEYS)) {
                this.f8800f = c1714i.m9591b(C1708c.SUB_KEYS).split("~");
            }
            if (c1714i.m9590a(C1708c.SUB_LNAMES)) {
                this.f8801g = c1714i.m9591b(C1708c.SUB_LNAMES).split("~");
            }
            if (c1714i.m9590a(C1708c.SUB_NAMES)) {
                this.f8802h = c1714i.m9591b(C1708c.SUB_NAMES).split("~");
            }
            if (c1714i.m9590a(C1708c.FMT)) {
                this.f8797c = aa.m9518b(c1714i.m9591b(C1708c.FMT));
            }
            if (c1714i.m9590a(C1708c.REQUIRE)) {
                this.f8798d = aa.m9519c(c1714i.m9591b(C1708c.REQUIRE));
            }
            if (c1714i.m9590a(C1708c.XZIP)) {
                this.f8803i = Pattern.compile(c1714i.m9591b(C1708c.XZIP), 2);
            }
            if (c1714i.m9590a(C1708c.ZIP)) {
                az.m9578a(this.f8795a, "Cannot use null as key");
                if (this.f8795a.split("/").length == 2) {
                    this.f8803i = Pattern.compile(c1714i.m9591b(C1708c.ZIP), 2);
                } else {
                    this.f8804j = Pattern.compile(c1714i.m9591b(C1708c.ZIP), 2);
                }
            }
            if (this.f8800f != null && this.f8802h == null && this.f8801g != null && this.f8800f.length == this.f8801g.length) {
                this.f8802h = this.f8800f;
            }
        }
        this.f8799e = az.m9576a(this.f8800f, this.f8802h, this.f8801g);
    }

    final aa m9520a(String str) {
        if (az.m9581c(str) == null) {
            return new aa(this, null);
        }
        String str2 = this.f8795a;
        C1714i a = this.f8796b.mo2421a(new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append("/").append(str).toString());
        if (a != null) {
            return new aa(this, a);
        }
        if (this.f8801g == null) {
            return new aa(this, null);
        }
        for (int i = 0; i < this.f8801g.length; i++) {
            if (this.f8801g[i].equalsIgnoreCase(str)) {
                String str3 = this.f8795a;
                String str4 = this.f8802h[i];
                a = this.f8796b.mo2421a(new StringBuilder((String.valueOf(str3).length() + 1) + String.valueOf(str4).length()).append(str3).append("/").append(str4).toString());
                if (a != null) {
                    return new aa(this, a);
                }
            }
        }
        return new aa(this, null);
    }

    public final String toString() {
        return this.f8795a;
    }

    private static Set m9518b(String str) {
        Set of = EnumSet.of(C1709d.COUNTRY);
        Object obj = null;
        for (char c : str.toCharArray()) {
            if (obj != null) {
                if (c != 'n') {
                    C1709d a = C1709d.m9587a(c);
                    if (a == null) {
                        throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 46).append("Unrecognized character '").append(c).append("' in format pattern: ").append(str).toString());
                    }
                    of.add(a);
                    obj = null;
                } else {
                    obj = null;
                }
            } else if (c == '%') {
                obj = 1;
            }
        }
        of.remove(C1709d.ADDRESS_LINE_1);
        of.remove(C1709d.ADDRESS_LINE_2);
        return of;
    }

    private static Set m9519c(String str) {
        Set of = EnumSet.of(C1709d.COUNTRY);
        for (char c : str.toCharArray()) {
            C1709d a = C1709d.m9587a(c);
            if (a == null) {
                throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 47).append("Unrecognized character '").append(c).append("' in require pattern: ").append(str).toString());
            }
            of.add(a);
        }
        of.remove(C1709d.ADDRESS_LINE_1);
        of.remove(C1709d.ADDRESS_LINE_2);
        return of;
    }
}
