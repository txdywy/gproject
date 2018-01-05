package com.squareup.okhttp;

import com.squareup.haha.perflib.HprofParser;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p526e.C7726f;
import p526e.C7740w;

public final class C7691x {
    public static final char[] f39795a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String f39796b;
    public final String f39797c;
    public final String f39798d;
    public final String f39799e;
    public final int f39800f;
    public final List f39801g;
    public final String f39802h;
    public final String f39803i;

    C7691x(C7692y c7692y) {
        List a;
        String str = null;
        this.f39796b = c7692y.f39804a;
        this.f39797c = C7691x.m37032a(c7692y.f39805b, false);
        this.f39798d = C7691x.m37032a(c7692y.f39806c, false);
        this.f39799e = c7692y.f39807d;
        this.f39800f = c7692y.m37050a();
        C7691x.m37033a(c7692y.f39809f, false);
        if (c7692y.f39810g != null) {
            a = C7691x.m37033a(c7692y.f39810g, true);
        } else {
            a = null;
        }
        this.f39801g = a;
        if (c7692y.f39811h != null) {
            str = C7691x.m37032a(c7692y.f39811h, false);
        }
        this.f39802h = str;
        this.f39803i = c7692y.toString();
    }

    public final URL m37038a() {
        try {
            return new URL(this.f39803i);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public final URI m37039b() {
        int i = 0;
        try {
            String str;
            int i2;
            C7692y c7692y = new C7692y();
            c7692y.f39804a = this.f39796b;
            c7692y.f39805b = m37040c();
            c7692y.f39806c = m37041d();
            c7692y.f39807d = this.f39799e;
            c7692y.f39808e = this.f39800f != C7691x.m37027a(this.f39796b) ? this.f39800f : -1;
            c7692y.f39809f.clear();
            c7692y.f39809f.addAll(m37042e());
            c7692y.m37051a(m37043f());
            if (this.f39802h == null) {
                str = null;
            } else {
                str = this.f39803i.substring(this.f39803i.indexOf(35) + 1);
            }
            c7692y.f39811h = str;
            int size = c7692y.f39809f.size();
            for (i2 = 0; i2 < size; i2++) {
                c7692y.f39809f.set(i2, C7691x.m37031a((String) c7692y.f39809f.get(i2), "[]", false, true));
            }
            if (c7692y.f39810g != null) {
                i2 = c7692y.f39810g.size();
                while (i < i2) {
                    str = (String) c7692y.f39810g.get(i);
                    if (str != null) {
                        c7692y.f39810g.set(i, C7691x.m37031a(str, "\\^`{|}", true, true));
                    }
                    i++;
                }
            }
            if (c7692y.f39811h != null) {
                c7692y.f39811h = C7691x.m37031a(c7692y.f39811h, " \"#<>\\^`{|}", false, false);
            }
            return new URI(c7692y.toString());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.f39803i);
        }
    }

    public final String m37040c() {
        if (this.f39797c.isEmpty()) {
            return "";
        }
        int length = this.f39796b.length() + 3;
        return this.f39803i.substring(length, C7691x.m37028a(this.f39803i, length, this.f39803i.length(), ":@"));
    }

    public final String m37041d() {
        if (this.f39798d.isEmpty()) {
            return "";
        }
        return this.f39803i.substring(this.f39803i.indexOf(58, this.f39796b.length() + 3) + 1, this.f39803i.indexOf(64));
    }

    public static int m37027a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    static void m37034a(StringBuilder stringBuilder, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append('/');
            stringBuilder.append((String) list.get(i));
        }
    }

    public final List m37042e() {
        int indexOf = this.f39803i.indexOf(47, this.f39796b.length() + 3);
        int a = C7691x.m37028a(this.f39803i, indexOf, this.f39803i.length(), "?#");
        List arrayList = new ArrayList();
        while (indexOf < a) {
            int i = indexOf + 1;
            indexOf = C7691x.m37028a(this.f39803i, i, a, "/");
            arrayList.add(this.f39803i.substring(i, indexOf));
        }
        return arrayList;
    }

    public final String m37043f() {
        if (this.f39801g == null) {
            return null;
        }
        int indexOf = this.f39803i.indexOf(63) + 1;
        return this.f39803i.substring(indexOf, C7691x.m37028a(this.f39803i, indexOf + 1, this.f39803i.length(), "#"));
    }

    public static void m37036b(StringBuilder stringBuilder, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(str);
            if (str2 != null) {
                stringBuilder.append('=');
                stringBuilder.append(str2);
            }
        }
    }

    static List m37035b(String str) {
        List arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static C7691x m37037c(String str) {
        C7692y c7692y = new C7692y();
        if (c7692y.m37052a(null, str) == C7693z.SUCCESS) {
            return c7692y.m37053b();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7691x) && ((C7691x) obj).f39803i.equals(this.f39803i);
    }

    public final int hashCode() {
        return this.f39803i.hashCode();
    }

    public final String toString() {
        return this.f39803i;
    }

    public static int m37028a(String str, int i, int i2, String str2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (str2.indexOf(str.charAt(i3)) != -1) {
                return i3;
            }
        }
        return i2;
    }

    private static String m37032a(String str, boolean z) {
        return C7691x.m37030a(str, 0, str.length(), z);
    }

    private static List m37033a(List list, boolean z) {
        List arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(str != null ? C7691x.m37032a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String m37030a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C7726f c7726f = new C7726f();
                c7726f.m37378a(str, i, i3);
                while (i3 < i2) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt != 37 || i3 + 2 >= i2) {
                        if (codePointAt == 43 && z) {
                            C7740w b = c7726f.m37387b(1);
                            byte[] bArr = b.f40221a;
                            int i4 = b.f40223c;
                            b.f40223c = i4 + 1;
                            bArr[i4] = (byte) 32;
                            c7726f.f40188c++;
                        }
                        c7726f.m37375a(codePointAt);
                    } else {
                        int a = C7691x.m37026a(str.charAt(i3 + 1));
                        int a2 = C7691x.m37026a(str.charAt(i3 + 2));
                        if (!(a == -1 || a2 == -1)) {
                            a = (a << 4) + a2;
                            C7740w b2 = c7726f.m37387b(1);
                            byte[] bArr2 = b2.f40221a;
                            int i5 = b2.f40223c;
                            b2.f40223c = i5 + 1;
                            bArr2[i5] = (byte) a;
                            c7726f.f40188c++;
                            i3 += 2;
                        }
                        c7726f.m37375a(codePointAt);
                    }
                    i3 += Character.charCount(codePointAt);
                }
                return c7726f.m37406m();
            }
            i3++;
        }
        return str.substring(i, i2);
    }

    static int m37026a(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 97) + 10;
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return (c - 65) + 10;
    }

    static String m37029a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && !z) || (codePointAt == 43 && z2)))) {
                C7726f c7726f = new C7726f();
                c7726f.m37378a(str, i, i3);
                int i4 = i3;
                C7726f c7726f2 = null;
                while (i4 < i2) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!(z && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13))) {
                        if (codePointAt2 == 43 && z2) {
                            String str3 = z ? "+" : "%2B";
                            c7726f.m37378a(str3, 0, str3.length());
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z3) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && !z))) {
                            if (c7726f2 == null) {
                                c7726f2 = new C7726f();
                            }
                            c7726f2.m37375a(codePointAt2);
                            while (!c7726f2.mo6492d()) {
                                codePointAt = c7726f2.mo6496f() & HprofParser.ROOT_UNKNOWN;
                                C7740w b = c7726f.m37387b(1);
                                byte[] bArr = b.f40221a;
                                int i5 = b.f40223c;
                                b.f40223c = i5 + 1;
                                bArr[i5] = (byte) 37;
                                c7726f.f40188c++;
                                char c = f39795a[(codePointAt >> 4) & 15];
                                C7740w b2 = c7726f.m37387b(1);
                                byte[] bArr2 = b2.f40221a;
                                int i6 = b2.f40223c;
                                b2.f40223c = i6 + 1;
                                bArr2[i6] = (byte) c;
                                c7726f.f40188c++;
                                char c2 = f39795a[codePointAt & 15];
                                b = c7726f.m37387b(1);
                                bArr = b.f40221a;
                                i5 = b.f40223c;
                                b.f40223c = i5 + 1;
                                bArr[i5] = (byte) c2;
                                c7726f.f40188c++;
                            }
                        } else {
                            c7726f.m37375a(codePointAt2);
                        }
                    }
                    i4 = Character.charCount(codePointAt2) + i4;
                }
                return c7726f.m37406m();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    static String m37031a(String str, String str2, boolean z, boolean z2) {
        return C7691x.m37029a(str, 0, str.length(), str2, true, z, z2);
    }
}
