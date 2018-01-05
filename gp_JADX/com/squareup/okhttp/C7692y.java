package com.squareup.okhttp;

import com.squareup.haha.perflib.HprofParser;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p526e.C7726f;
import p526e.C7740w;

public final class C7692y {
    public String f39804a;
    public String f39805b = "";
    public String f39806c = "";
    public String f39807d;
    public int f39808e = -1;
    public final List f39809f = new ArrayList();
    public List f39810g;
    public String f39811h;

    public C7692y() {
        this.f39809f.add("");
    }

    final int m37050a() {
        return this.f39808e != -1 ? this.f39808e : C7691x.m37027a(this.f39804a);
    }

    public final C7692y m37051a(String str) {
        this.f39810g = str != null ? C7691x.m37035b(C7691x.m37031a(str, " \"'<>#", true, true)) : null;
        return this;
    }

    public final C7691x m37053b() {
        if (this.f39804a == null) {
            throw new IllegalStateException("scheme == null");
        } else if (this.f39807d != null) {
            return new C7691x(this);
        } else {
            throw new IllegalStateException("host == null");
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f39804a);
        stringBuilder.append("://");
        if (!(this.f39805b.isEmpty() && this.f39806c.isEmpty())) {
            stringBuilder.append(this.f39805b);
            if (!this.f39806c.isEmpty()) {
                stringBuilder.append(':');
                stringBuilder.append(this.f39806c);
            }
            stringBuilder.append('@');
        }
        if (this.f39807d.indexOf(58) != -1) {
            stringBuilder.append('[');
            stringBuilder.append(this.f39807d);
            stringBuilder.append(']');
        } else {
            stringBuilder.append(this.f39807d);
        }
        int a = m37050a();
        if (a != C7691x.m37027a(this.f39804a)) {
            stringBuilder.append(':');
            stringBuilder.append(a);
        }
        C7691x.m37034a(stringBuilder, this.f39809f);
        if (this.f39810g != null) {
            stringBuilder.append('?');
            C7691x.m37036b(stringBuilder, this.f39810g);
        }
        if (this.f39811h != null) {
            stringBuilder.append('#');
            stringBuilder.append(this.f39811h);
        }
        return stringBuilder.toString();
    }

    final C7693z m37052a(C7691x c7691x, String str) {
        int i;
        char charAt;
        int i2;
        int i3;
        Object obj;
        Object obj2;
        int i4;
        String a;
        Object obj3;
        Object obj4;
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            int a2;
            switch (str.charAt(i5)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    i5++;
                default:
                    break;
            }
            length = str.length() - 1;
            while (length >= i5) {
                char charAt2;
                switch (str.charAt(length)) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                        length--;
                    default:
                        i = length + 1;
                        break;
                }
                if (i - i5 >= 2) {
                    charAt = str.charAt(i5);
                    if ((charAt >= 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                        length = -1;
                        if (length != -1) {
                            if (str.regionMatches(true, i5, "https:", 0, 6)) {
                                this.f39804a = "https";
                                i5 += 6;
                            } else {
                                if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                                    return C7693z.UNSUPPORTED_SCHEME;
                                }
                                this.f39804a = "http";
                                i5 += 5;
                            }
                        } else if (c7691x == null) {
                            return C7693z.MISSING_SCHEME;
                        } else {
                            this.f39804a = c7691x.f39796b;
                        }
                        i2 = 0;
                        while (i3 < i) {
                            charAt2 = str.charAt(i3);
                            if (charAt2 == '\\' || charAt2 == '/') {
                                i2++;
                            } else {
                                if (i2 < 2 || c7691x == null || !c7691x.f39796b.equals(this.f39804a)) {
                                    obj = null;
                                    obj2 = null;
                                    i4 = i5 + i2;
                                    while (true) {
                                        a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                                        switch (a2 == i ? str.charAt(a2) : '￿') {
                                            case '￿':
                                            case '#':
                                            case '/':
                                            case '?':
                                            case '\\':
                                                length = C7692y.m37048c(str, i4, a2);
                                                if (length + 1 >= a2) {
                                                    this.f39807d = C7692y.m37044a(str, i4, length);
                                                    this.f39808e = C7692y.m37049d(str, length + 1, a2);
                                                    if (this.f39808e == -1) {
                                                        return C7693z.INVALID_PORT;
                                                    }
                                                }
                                                this.f39807d = C7692y.m37044a(str, i4, length);
                                                this.f39808e = C7691x.m37027a(this.f39804a);
                                                if (this.f39807d == null) {
                                                    i5 = a2;
                                                    break;
                                                }
                                                return C7693z.INVALID_HOST;
                                            case '@':
                                                if (obj != null) {
                                                    i5 = C7691x.m37028a(str, i4, a2, ":");
                                                    a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                                    if (obj2 != null) {
                                                        a = this.f39805b + "%40" + a;
                                                    }
                                                    this.f39805b = a;
                                                    if (i5 != a2) {
                                                        obj = 1;
                                                        this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                                    }
                                                    obj3 = 1;
                                                    obj4 = obj;
                                                } else {
                                                    this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                                    obj4 = obj;
                                                    obj3 = obj2;
                                                }
                                                obj = obj4;
                                                obj2 = obj3;
                                                i4 = a2 + 1;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                            default:
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                                continue;
                                        }
                                    }
                                } else {
                                    this.f39805b = c7691x.m37040c();
                                    this.f39806c = c7691x.m37041d();
                                    this.f39807d = c7691x.f39799e;
                                    this.f39808e = c7691x.f39800f;
                                    this.f39809f.clear();
                                    this.f39809f.addAll(c7691x.m37042e());
                                    if (i5 == i || str.charAt(i5) == '#') {
                                        m37051a(c7691x.m37043f());
                                    }
                                }
                                length = C7691x.m37028a(str, i5, i, "?#");
                                m37047b(str, i5, length);
                                if (length < i || str.charAt(length) != '?') {
                                    i5 = length;
                                } else {
                                    i5 = C7691x.m37028a(str, length, i, "#");
                                    this.f39810g = C7691x.m37035b(C7691x.m37029a(str, length + 1, i5, " \"'<>#", true, true, true));
                                }
                                if (i5 < i && str.charAt(i5) == '#') {
                                    this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                                }
                                return C7693z.SUCCESS;
                            }
                        }
                        if (i2 < 2) {
                        }
                        obj = null;
                        obj2 = null;
                        i4 = i5 + i2;
                        while (true) {
                            a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                            if (a2 == i) {
                            }
                            switch (a2 == i ? str.charAt(a2) : '￿') {
                                case '￿':
                                case '#':
                                case '/':
                                case '?':
                                case '\\':
                                    length = C7692y.m37048c(str, i4, a2);
                                    if (length + 1 >= a2) {
                                        this.f39807d = C7692y.m37044a(str, i4, length);
                                        this.f39808e = C7691x.m37027a(this.f39804a);
                                    } else {
                                        this.f39807d = C7692y.m37044a(str, i4, length);
                                        this.f39808e = C7692y.m37049d(str, length + 1, a2);
                                        if (this.f39808e == -1) {
                                            return C7693z.INVALID_PORT;
                                        }
                                    }
                                    if (this.f39807d == null) {
                                        i5 = a2;
                                        break;
                                    }
                                    return C7693z.INVALID_HOST;
                                case '@':
                                    if (obj != null) {
                                        this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                        obj4 = obj;
                                        obj3 = obj2;
                                    } else {
                                        i5 = C7691x.m37028a(str, i4, a2, ":");
                                        a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                        if (obj2 != null) {
                                            a = this.f39805b + "%40" + a;
                                        }
                                        this.f39805b = a;
                                        if (i5 != a2) {
                                            obj = 1;
                                            this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                        }
                                        obj3 = 1;
                                        obj4 = obj;
                                    }
                                    obj = obj4;
                                    obj2 = obj3;
                                    i4 = a2 + 1;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                default:
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                                    continue;
                            }
                            length = C7691x.m37028a(str, i5, i, "?#");
                            m37047b(str, i5, length);
                            if (length < i) {
                            }
                            i5 = length;
                            this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                            return C7693z.SUCCESS;
                        }
                    }
                    length = i5 + 1;
                    while (length < i) {
                        char charAt3 = str.charAt(length);
                        if ((charAt3 < 'a' || charAt3 > 'z') && ((charAt3 < 'A' || charAt3 > 'Z') && !((charAt3 >= '0' && charAt3 <= '9') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                            if (charAt3 != ':') {
                                length = -1;
                            }
                            if (length != -1) {
                                if (str.regionMatches(true, i5, "https:", 0, 6)) {
                                    if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                                        return C7693z.UNSUPPORTED_SCHEME;
                                    }
                                    this.f39804a = "http";
                                    i5 += 5;
                                } else {
                                    this.f39804a = "https";
                                    i5 += 6;
                                }
                            } else if (c7691x == null) {
                                return C7693z.MISSING_SCHEME;
                            } else {
                                this.f39804a = c7691x.f39796b;
                            }
                            i2 = 0;
                            for (i3 = i5; i3 < i; i3++) {
                                charAt2 = str.charAt(i3);
                                if (charAt2 == '\\') {
                                }
                                i2++;
                            }
                            if (i2 < 2) {
                            }
                            obj = null;
                            obj2 = null;
                            i4 = i5 + i2;
                            while (true) {
                                a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                                if (a2 == i) {
                                }
                                switch (a2 == i ? str.charAt(a2) : '￿') {
                                    case '￿':
                                    case '#':
                                    case '/':
                                    case '?':
                                    case '\\':
                                        length = C7692y.m37048c(str, i4, a2);
                                        if (length + 1 >= a2) {
                                            this.f39807d = C7692y.m37044a(str, i4, length);
                                            this.f39808e = C7692y.m37049d(str, length + 1, a2);
                                            if (this.f39808e == -1) {
                                                return C7693z.INVALID_PORT;
                                            }
                                        }
                                        this.f39807d = C7692y.m37044a(str, i4, length);
                                        this.f39808e = C7691x.m37027a(this.f39804a);
                                        if (this.f39807d == null) {
                                            i5 = a2;
                                            break;
                                        }
                                        return C7693z.INVALID_HOST;
                                    case '@':
                                        if (obj != null) {
                                            i5 = C7691x.m37028a(str, i4, a2, ":");
                                            a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                            if (obj2 != null) {
                                                a = this.f39805b + "%40" + a;
                                            }
                                            this.f39805b = a;
                                            if (i5 != a2) {
                                                obj = 1;
                                                this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                            }
                                            obj3 = 1;
                                            obj4 = obj;
                                        } else {
                                            this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                            obj4 = obj;
                                            obj3 = obj2;
                                        }
                                        obj = obj4;
                                        obj2 = obj3;
                                        i4 = a2 + 1;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                    default:
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                        continue;
                                }
                                length = C7691x.m37028a(str, i5, i, "?#");
                                m37047b(str, i5, length);
                                if (length < i) {
                                }
                                i5 = length;
                                this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                                return C7693z.SUCCESS;
                            }
                        }
                        length++;
                    }
                }
                length = -1;
                if (length != -1) {
                    if (str.regionMatches(true, i5, "https:", 0, 6)) {
                        this.f39804a = "https";
                        i5 += 6;
                    } else {
                        if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                            return C7693z.UNSUPPORTED_SCHEME;
                        }
                        this.f39804a = "http";
                        i5 += 5;
                    }
                } else if (c7691x == null) {
                    return C7693z.MISSING_SCHEME;
                } else {
                    this.f39804a = c7691x.f39796b;
                }
                i2 = 0;
                for (i3 = i5; i3 < i; i3++) {
                    charAt2 = str.charAt(i3);
                    if (charAt2 == '\\') {
                    }
                    i2++;
                }
                if (i2 < 2) {
                }
                obj = null;
                obj2 = null;
                i4 = i5 + i2;
                while (true) {
                    a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                    if (a2 == i) {
                    }
                    switch (a2 == i ? str.charAt(a2) : '￿') {
                        case '￿':
                        case '#':
                        case '/':
                        case '?':
                        case '\\':
                            length = C7692y.m37048c(str, i4, a2);
                            if (length + 1 >= a2) {
                                this.f39807d = C7692y.m37044a(str, i4, length);
                                this.f39808e = C7691x.m37027a(this.f39804a);
                            } else {
                                this.f39807d = C7692y.m37044a(str, i4, length);
                                this.f39808e = C7692y.m37049d(str, length + 1, a2);
                                if (this.f39808e == -1) {
                                    return C7693z.INVALID_PORT;
                                }
                            }
                            if (this.f39807d == null) {
                                i5 = a2;
                                break;
                            }
                            return C7693z.INVALID_HOST;
                        case '@':
                            if (obj != null) {
                                this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                obj4 = obj;
                                obj3 = obj2;
                            } else {
                                i5 = C7691x.m37028a(str, i4, a2, ":");
                                a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                if (obj2 != null) {
                                    a = this.f39805b + "%40" + a;
                                }
                                this.f39805b = a;
                                if (i5 != a2) {
                                    obj = 1;
                                    this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                }
                                obj3 = 1;
                                obj4 = obj;
                            }
                            obj = obj4;
                            obj2 = obj3;
                            i4 = a2 + 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                        default:
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                    }
                    length = C7691x.m37028a(str, i5, i, "?#");
                    m37047b(str, i5, length);
                    if (length < i) {
                    }
                    i5 = length;
                    this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                    return C7693z.SUCCESS;
                }
            }
            i = i5;
            if (i - i5 >= 2) {
                charAt = str.charAt(i5);
                if (charAt >= 'a') {
                }
                length = -1;
                if (length != -1) {
                    if (str.regionMatches(true, i5, "https:", 0, 6)) {
                        if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                            return C7693z.UNSUPPORTED_SCHEME;
                        }
                        this.f39804a = "http";
                        i5 += 5;
                    } else {
                        this.f39804a = "https";
                        i5 += 6;
                    }
                } else if (c7691x == null) {
                    return C7693z.MISSING_SCHEME;
                } else {
                    this.f39804a = c7691x.f39796b;
                }
                i2 = 0;
                for (i3 = i5; i3 < i; i3++) {
                    charAt2 = str.charAt(i3);
                    if (charAt2 == '\\') {
                    }
                    i2++;
                }
                if (i2 < 2) {
                }
                obj = null;
                obj2 = null;
                i4 = i5 + i2;
                while (true) {
                    a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                    if (a2 == i) {
                    }
                    switch (a2 == i ? str.charAt(a2) : '￿') {
                        case '￿':
                        case '#':
                        case '/':
                        case '?':
                        case '\\':
                            length = C7692y.m37048c(str, i4, a2);
                            if (length + 1 >= a2) {
                                this.f39807d = C7692y.m37044a(str, i4, length);
                                this.f39808e = C7692y.m37049d(str, length + 1, a2);
                                if (this.f39808e == -1) {
                                    return C7693z.INVALID_PORT;
                                }
                            }
                            this.f39807d = C7692y.m37044a(str, i4, length);
                            this.f39808e = C7691x.m37027a(this.f39804a);
                            if (this.f39807d == null) {
                                i5 = a2;
                                break;
                            }
                            return C7693z.INVALID_HOST;
                        case '@':
                            if (obj != null) {
                                i5 = C7691x.m37028a(str, i4, a2, ":");
                                a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                if (obj2 != null) {
                                    a = this.f39805b + "%40" + a;
                                }
                                this.f39805b = a;
                                if (i5 != a2) {
                                    obj = 1;
                                    this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                }
                                obj3 = 1;
                                obj4 = obj;
                            } else {
                                this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                obj4 = obj;
                                obj3 = obj2;
                            }
                            obj = obj4;
                            obj2 = obj3;
                            i4 = a2 + 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                        default:
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                    }
                    length = C7691x.m37028a(str, i5, i, "?#");
                    m37047b(str, i5, length);
                    if (length < i) {
                    }
                    i5 = length;
                    this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                    return C7693z.SUCCESS;
                }
            }
            length = -1;
            if (length != -1) {
                if (str.regionMatches(true, i5, "https:", 0, 6)) {
                    this.f39804a = "https";
                    i5 += 6;
                } else {
                    if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                        return C7693z.UNSUPPORTED_SCHEME;
                    }
                    this.f39804a = "http";
                    i5 += 5;
                }
            } else if (c7691x == null) {
                return C7693z.MISSING_SCHEME;
            } else {
                this.f39804a = c7691x.f39796b;
            }
            i2 = 0;
            for (i3 = i5; i3 < i; i3++) {
                charAt2 = str.charAt(i3);
                if (charAt2 == '\\') {
                }
                i2++;
            }
            if (i2 < 2) {
            }
            obj = null;
            obj2 = null;
            i4 = i5 + i2;
            while (true) {
                a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                if (a2 == i) {
                }
                switch (a2 == i ? str.charAt(a2) : '￿') {
                    case '￿':
                    case '#':
                    case '/':
                    case '?':
                    case '\\':
                        length = C7692y.m37048c(str, i4, a2);
                        if (length + 1 >= a2) {
                            this.f39807d = C7692y.m37044a(str, i4, length);
                            this.f39808e = C7691x.m37027a(this.f39804a);
                        } else {
                            this.f39807d = C7692y.m37044a(str, i4, length);
                            this.f39808e = C7692y.m37049d(str, length + 1, a2);
                            if (this.f39808e == -1) {
                                return C7693z.INVALID_PORT;
                            }
                        }
                        if (this.f39807d == null) {
                            i5 = a2;
                            break;
                        }
                        return C7693z.INVALID_HOST;
                    case '@':
                        if (obj != null) {
                            this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            obj4 = obj;
                            obj3 = obj2;
                        } else {
                            i5 = C7691x.m37028a(str, i4, a2, ":");
                            a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            if (obj2 != null) {
                                a = this.f39805b + "%40" + a;
                            }
                            this.f39805b = a;
                            if (i5 != a2) {
                                obj = 1;
                                this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            }
                            obj3 = 1;
                            obj4 = obj;
                        }
                        obj = obj4;
                        obj2 = obj3;
                        i4 = a2 + 1;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                    default:
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                }
                length = C7691x.m37028a(str, i5, i, "?#");
                m37047b(str, i5, length);
                if (length < i) {
                }
                i5 = length;
                this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                return C7693z.SUCCESS;
            }
        }
        i5 = length;
        length = str.length() - 1;
        while (length >= i5) {
            switch (str.charAt(length)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ':
                    length--;
                default:
                    i = length + 1;
                    break;
            }
            if (i - i5 >= 2) {
                charAt = str.charAt(i5);
                if (charAt >= 'a') {
                }
                length = -1;
                if (length != -1) {
                    if (str.regionMatches(true, i5, "https:", 0, 6)) {
                        if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                            return C7693z.UNSUPPORTED_SCHEME;
                        }
                        this.f39804a = "http";
                        i5 += 5;
                    } else {
                        this.f39804a = "https";
                        i5 += 6;
                    }
                } else if (c7691x == null) {
                    return C7693z.MISSING_SCHEME;
                } else {
                    this.f39804a = c7691x.f39796b;
                }
                i2 = 0;
                for (i3 = i5; i3 < i; i3++) {
                    charAt2 = str.charAt(i3);
                    if (charAt2 == '\\') {
                    }
                    i2++;
                }
                if (i2 < 2) {
                }
                obj = null;
                obj2 = null;
                i4 = i5 + i2;
                while (true) {
                    a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                    if (a2 == i) {
                    }
                    switch (a2 == i ? str.charAt(a2) : '￿') {
                        case '￿':
                        case '#':
                        case '/':
                        case '?':
                        case '\\':
                            length = C7692y.m37048c(str, i4, a2);
                            if (length + 1 >= a2) {
                                this.f39807d = C7692y.m37044a(str, i4, length);
                                this.f39808e = C7692y.m37049d(str, length + 1, a2);
                                if (this.f39808e == -1) {
                                    return C7693z.INVALID_PORT;
                                }
                            }
                            this.f39807d = C7692y.m37044a(str, i4, length);
                            this.f39808e = C7691x.m37027a(this.f39804a);
                            if (this.f39807d == null) {
                                i5 = a2;
                                break;
                            }
                            return C7693z.INVALID_HOST;
                        case '@':
                            if (obj != null) {
                                i5 = C7691x.m37028a(str, i4, a2, ":");
                                a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                if (obj2 != null) {
                                    a = this.f39805b + "%40" + a;
                                }
                                this.f39805b = a;
                                if (i5 != a2) {
                                    obj = 1;
                                    this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                }
                                obj3 = 1;
                                obj4 = obj;
                            } else {
                                this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                obj4 = obj;
                                obj3 = obj2;
                            }
                            obj = obj4;
                            obj2 = obj3;
                            i4 = a2 + 1;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                        default:
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                    }
                    length = C7691x.m37028a(str, i5, i, "?#");
                    m37047b(str, i5, length);
                    if (length < i) {
                    }
                    i5 = length;
                    this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                    return C7693z.SUCCESS;
                }
            }
            length = -1;
            if (length != -1) {
                if (str.regionMatches(true, i5, "https:", 0, 6)) {
                    this.f39804a = "https";
                    i5 += 6;
                } else {
                    if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                        return C7693z.UNSUPPORTED_SCHEME;
                    }
                    this.f39804a = "http";
                    i5 += 5;
                }
            } else if (c7691x == null) {
                return C7693z.MISSING_SCHEME;
            } else {
                this.f39804a = c7691x.f39796b;
            }
            i2 = 0;
            for (i3 = i5; i3 < i; i3++) {
                charAt2 = str.charAt(i3);
                if (charAt2 == '\\') {
                }
                i2++;
            }
            if (i2 < 2) {
            }
            obj = null;
            obj2 = null;
            i4 = i5 + i2;
            while (true) {
                a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                if (a2 == i) {
                }
                switch (a2 == i ? str.charAt(a2) : '￿') {
                    case '￿':
                    case '#':
                    case '/':
                    case '?':
                    case '\\':
                        length = C7692y.m37048c(str, i4, a2);
                        if (length + 1 >= a2) {
                            this.f39807d = C7692y.m37044a(str, i4, length);
                            this.f39808e = C7691x.m37027a(this.f39804a);
                        } else {
                            this.f39807d = C7692y.m37044a(str, i4, length);
                            this.f39808e = C7692y.m37049d(str, length + 1, a2);
                            if (this.f39808e == -1) {
                                return C7693z.INVALID_PORT;
                            }
                        }
                        if (this.f39807d == null) {
                            i5 = a2;
                            break;
                        }
                        return C7693z.INVALID_HOST;
                    case '@':
                        if (obj != null) {
                            this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            obj4 = obj;
                            obj3 = obj2;
                        } else {
                            i5 = C7691x.m37028a(str, i4, a2, ":");
                            a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            if (obj2 != null) {
                                a = this.f39805b + "%40" + a;
                            }
                            this.f39805b = a;
                            if (i5 != a2) {
                                obj = 1;
                                this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            }
                            obj3 = 1;
                            obj4 = obj;
                        }
                        obj = obj4;
                        obj2 = obj3;
                        i4 = a2 + 1;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                    default:
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                }
                length = C7691x.m37028a(str, i5, i, "?#");
                m37047b(str, i5, length);
                if (length < i) {
                }
                i5 = length;
                this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                return C7693z.SUCCESS;
            }
        }
        i = i5;
        if (i - i5 >= 2) {
            charAt = str.charAt(i5);
            if (charAt >= 'a') {
            }
            length = -1;
            if (length != -1) {
                if (str.regionMatches(true, i5, "https:", 0, 6)) {
                    if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                        return C7693z.UNSUPPORTED_SCHEME;
                    }
                    this.f39804a = "http";
                    i5 += 5;
                } else {
                    this.f39804a = "https";
                    i5 += 6;
                }
            } else if (c7691x == null) {
                return C7693z.MISSING_SCHEME;
            } else {
                this.f39804a = c7691x.f39796b;
            }
            i2 = 0;
            for (i3 = i5; i3 < i; i3++) {
                charAt2 = str.charAt(i3);
                if (charAt2 == '\\') {
                }
                i2++;
            }
            if (i2 < 2) {
            }
            obj = null;
            obj2 = null;
            i4 = i5 + i2;
            while (true) {
                a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
                if (a2 == i) {
                }
                switch (a2 == i ? str.charAt(a2) : '￿') {
                    case '￿':
                    case '#':
                    case '/':
                    case '?':
                    case '\\':
                        length = C7692y.m37048c(str, i4, a2);
                        if (length + 1 >= a2) {
                            this.f39807d = C7692y.m37044a(str, i4, length);
                            this.f39808e = C7692y.m37049d(str, length + 1, a2);
                            if (this.f39808e == -1) {
                                return C7693z.INVALID_PORT;
                            }
                        }
                        this.f39807d = C7692y.m37044a(str, i4, length);
                        this.f39808e = C7691x.m37027a(this.f39804a);
                        if (this.f39807d == null) {
                            i5 = a2;
                            break;
                        }
                        return C7693z.INVALID_HOST;
                    case '@':
                        if (obj != null) {
                            i5 = C7691x.m37028a(str, i4, a2, ":");
                            a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            if (obj2 != null) {
                                a = this.f39805b + "%40" + a;
                            }
                            this.f39805b = a;
                            if (i5 != a2) {
                                obj = 1;
                                this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            }
                            obj3 = 1;
                            obj4 = obj;
                        } else {
                            this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                            obj4 = obj;
                            obj3 = obj2;
                        }
                        obj = obj4;
                        obj2 = obj3;
                        i4 = a2 + 1;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                    default:
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                        continue;
                }
                length = C7691x.m37028a(str, i5, i, "?#");
                m37047b(str, i5, length);
                if (length < i) {
                }
                i5 = length;
                this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
                return C7693z.SUCCESS;
            }
        }
        length = -1;
        if (length != -1) {
            if (str.regionMatches(true, i5, "https:", 0, 6)) {
                this.f39804a = "https";
                i5 += 6;
            } else {
                if (!str.regionMatches(true, i5, "http:", 0, 5)) {
                    return C7693z.UNSUPPORTED_SCHEME;
                }
                this.f39804a = "http";
                i5 += 5;
            }
        } else if (c7691x == null) {
            return C7693z.MISSING_SCHEME;
        } else {
            this.f39804a = c7691x.f39796b;
        }
        i2 = 0;
        for (i3 = i5; i3 < i; i3++) {
            charAt2 = str.charAt(i3);
            if (charAt2 == '\\') {
            }
            i2++;
        }
        if (i2 < 2) {
        }
        obj = null;
        obj2 = null;
        i4 = i5 + i2;
        while (true) {
            a2 = C7691x.m37028a(str, i4, i, "@/\\?#");
            if (a2 == i) {
            }
            switch (a2 == i ? str.charAt(a2) : '￿') {
                case '￿':
                case '#':
                case '/':
                case '?':
                case '\\':
                    length = C7692y.m37048c(str, i4, a2);
                    if (length + 1 >= a2) {
                        this.f39807d = C7692y.m37044a(str, i4, length);
                        this.f39808e = C7691x.m37027a(this.f39804a);
                    } else {
                        this.f39807d = C7692y.m37044a(str, i4, length);
                        this.f39808e = C7692y.m37049d(str, length + 1, a2);
                        if (this.f39808e == -1) {
                            return C7693z.INVALID_PORT;
                        }
                    }
                    if (this.f39807d == null) {
                        i5 = a2;
                        break;
                    }
                    return C7693z.INVALID_HOST;
                case '@':
                    if (obj != null) {
                        this.f39806c += "%40" + C7691x.m37029a(str, i4, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                        obj4 = obj;
                        obj3 = obj2;
                    } else {
                        i5 = C7691x.m37028a(str, i4, a2, ":");
                        a = C7691x.m37029a(str, i4, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                        if (obj2 != null) {
                            a = this.f39805b + "%40" + a;
                        }
                        this.f39805b = a;
                        if (i5 != a2) {
                            obj = 1;
                            this.f39806c = C7691x.m37029a(str, i5 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                        }
                        obj3 = 1;
                        obj4 = obj;
                    }
                    obj = obj4;
                    obj2 = obj3;
                    i4 = a2 + 1;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                default:
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
                    continue;
            }
            length = C7691x.m37028a(str, i5, i, "?#");
            m37047b(str, i5, length);
            if (length < i) {
            }
            i5 = length;
            this.f39811h = C7691x.m37029a(str, i5 + 1, i, "", true, false, false);
            return C7693z.SUCCESS;
        }
    }

    private final void m37047b(String str, int i, int i2) {
        if (i != i2) {
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.f39809f.clear();
                this.f39809f.add("");
                i++;
            } else {
                this.f39809f.set(this.f39809f.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                boolean z;
                boolean z2;
                int a = C7691x.m37028a(str, i3, i2, "/\\");
                if (a < i2) {
                    z = true;
                } else {
                    z = false;
                }
                String a2 = C7691x.m37029a(str, i3, a, " \"<>^`{}|/\\?#", true, false, true);
                if (a2.equals(".") || a2.equalsIgnoreCase("%2e")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (a2.equals("..") || a2.equalsIgnoreCase("%2e.") || a2.equalsIgnoreCase(".%2e") || a2.equalsIgnoreCase("%2e%2e")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (((String) this.f39809f.get(this.f39809f.size() - 1)).isEmpty()) {
                            this.f39809f.set(this.f39809f.size() - 1, a2);
                        } else {
                            this.f39809f.add(a2);
                        }
                        if (z) {
                            this.f39809f.add("");
                        }
                    } else if (!((String) this.f39809f.remove(this.f39809f.size() - 1)).isEmpty() || this.f39809f.isEmpty()) {
                        this.f39809f.add("");
                    } else {
                        this.f39809f.set(this.f39809f.size() - 1, "");
                    }
                }
                if (z) {
                    a++;
                }
                i3 = a;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m37048c(java.lang.String r3, int r4, int r5) {
        /*
        r0 = r4;
    L_0x0001:
        if (r0 >= r5) goto L_0x001a;
    L_0x0003:
        r1 = r3.charAt(r0);
        switch(r1) {
            case 58: goto L_0x001b;
            case 91: goto L_0x000d;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x000d:
        r0 = r0 + 1;
        if (r0 >= r5) goto L_0x000a;
    L_0x0011:
        r1 = r3.charAt(r0);
        r2 = 93;
        if (r1 != r2) goto L_0x000d;
    L_0x0019:
        goto L_0x000a;
    L_0x001a:
        r0 = r5;
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.y.c(java.lang.String, int, int):int");
    }

    static String m37044a(String str, int i, int i2) {
        String a = C7691x.m37030a(str, i, i2, false);
        if (!a.startsWith("[") || !a.endsWith("]")) {
            return C7692y.m37046b(a);
        }
        InetAddress a2 = C7692y.m37045a(a, a.length() - 1);
        if (a2 == null) {
            return null;
        }
        byte[] address = a2.getAddress();
        if (address.length == 16) {
            int i3;
            int i4;
            int i5 = -1;
            int i6 = 0;
            int i7;
            for (i3 = 0; i3 < address.length; i3 = i7 + 2) {
                i7 = i3;
                while (i7 < 16 && address[i7] == (byte) 0 && address[i7 + 1] == (byte) 0) {
                    i7 += 2;
                }
                i4 = i7 - i3;
                if (i4 > i6) {
                    i6 = i4;
                    i5 = i3;
                }
            }
            C7726f c7726f = new C7726f();
            i3 = 0;
            while (i3 < address.length) {
                C7740w b;
                byte[] bArr;
                int i8;
                if (i3 == i5) {
                    b = c7726f.m37387b(1);
                    bArr = b.f40221a;
                    i8 = b.f40223c;
                    b.f40223c = i8 + 1;
                    bArr[i8] = (byte) 58;
                    c7726f.f40188c++;
                    i3 += i6;
                    if (i3 == 16) {
                        b = c7726f.m37387b(1);
                        bArr = b.f40221a;
                        i8 = b.f40223c;
                        b.f40223c = i8 + 1;
                        bArr[i8] = (byte) 58;
                        c7726f.f40188c++;
                    }
                } else {
                    if (i3 > 0) {
                        b = c7726f.m37387b(1);
                        bArr = b.f40221a;
                        i8 = b.f40223c;
                        b.f40223c = i8 + 1;
                        bArr[i8] = (byte) 58;
                        c7726f.f40188c++;
                    }
                    long j = (long) (((address[i3] & HprofParser.ROOT_UNKNOWN) << 8) | (address[i3 + 1] & HprofParser.ROOT_UNKNOWN));
                    if (j == 0) {
                        b = c7726f.m37387b(1);
                        bArr = b.f40221a;
                        i8 = b.f40223c;
                        b.f40223c = i8 + 1;
                        bArr[i8] = (byte) 48;
                        c7726f.f40188c++;
                    } else {
                        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
                        C7740w b2 = c7726f.m37387b(numberOfTrailingZeros);
                        byte[] bArr2 = b2.f40221a;
                        int i9 = b2.f40223c;
                        for (i4 = (b2.f40223c + numberOfTrailingZeros) - 1; i4 >= i9; i4--) {
                            bArr2[i4] = C7726f.f40186a[(int) (15 & j)];
                            j >>>= 4;
                        }
                        b2.f40223c += numberOfTrailingZeros;
                        c7726f.f40188c += (long) numberOfTrailingZeros;
                    }
                    i3 += 2;
                }
            }
            return c7726f.m37406m();
        }
        throw new AssertionError();
    }

    private static InetAddress m37045a(String str, int i) {
        Object obj = new byte[16];
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = 1;
        while (i5 < i) {
            if (i2 == 16) {
                return null;
            }
            int i6;
            int i7;
            if (i5 + 2 > i || !str.regionMatches(i5, "::", 0, 2)) {
                if (i2 != 0) {
                    if (str.regionMatches(i5, ":", 0, 1)) {
                        i5++;
                    } else if (!str.regionMatches(i5, ".", 0, 1)) {
                        return null;
                    } else {
                        Object obj2;
                        int i8 = i2 - 2;
                        i5 = i4;
                        i6 = i8;
                        loop2:
                        while (i5 < i) {
                            if (i6 == 16) {
                                obj2 = null;
                                break;
                            }
                            if (i6 != i8) {
                                if (str.charAt(i5) != '.') {
                                    obj2 = null;
                                    break;
                                }
                                i5++;
                            }
                            i7 = 0;
                            i4 = i5;
                            while (i4 < i) {
                                char charAt = str.charAt(i4);
                                if (charAt >= '0' && charAt <= '9') {
                                    if (i7 == 0 && i5 != i4) {
                                        obj2 = null;
                                        break loop2;
                                    }
                                    i7 = ((i7 * 10) + charAt) - 48;
                                    if (i7 > HprofParser.ROOT_UNKNOWN) {
                                        obj2 = null;
                                        break loop2;
                                    }
                                    i4++;
                                } else {
                                    break;
                                }
                            }
                            if (i4 - i5 == 0) {
                                obj2 = null;
                                break;
                            }
                            i5 = i6 + 1;
                            obj[i6] = (byte) i7;
                            i6 = i5;
                            i5 = i4;
                        }
                        if (i6 != i8 + 4) {
                            obj2 = null;
                        } else {
                            obj2 = 1;
                        }
                        if (obj2 == null) {
                            return null;
                        }
                        i2 += 2;
                    }
                }
            } else if (i3 != -1) {
                return null;
            } else {
                i5 += 2;
                i3 = i2 + 2;
                if (i5 == i) {
                    i2 = i3;
                    break;
                }
                i2 = i3;
            }
            i7 = 0;
            i4 = i5;
            while (i4 < i) {
                i6 = C7691x.m37026a(str.charAt(i4));
                if (i6 == -1) {
                    break;
                }
                i7 = (i7 << 4) + i6;
                i4++;
            }
            i6 = i4 - i5;
            if (i6 == 0 || i6 > 4) {
                return null;
            }
            i6 = i2 + 1;
            obj[i2] = (byte) ((i7 >>> 8) & HprofParser.ROOT_UNKNOWN);
            i2 = i6 + 1;
            obj[i6] = (byte) (i7 & HprofParser.ROOT_UNKNOWN);
            int i9 = i4;
            i4 = i5;
            i5 = i9;
        }
        if (i2 != 16) {
            if (i3 == -1) {
                return null;
            }
            System.arraycopy(obj, i3, obj, 16 - (i2 - i3), i2 - i3);
            Arrays.fill(obj, i3, (16 - i2) + i3, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(obj);
        } catch (UnknownHostException e) {
            throw new AssertionError();
        }
    }

    private static String m37046b(String str) {
        Object obj = 1;
        try {
            String toLowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (toLowerCase.isEmpty()) {
                return null;
            }
            for (int i = 0; i < toLowerCase.length(); i++) {
                char charAt = toLowerCase.charAt(i);
                if (charAt <= '\u001f' || charAt >= '' || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    break;
                }
            }
            obj = null;
            if (obj == null) {
                return toLowerCase;
            }
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    private static int m37049d(String str, int i, int i2) {
        try {
            int parseInt = Integer.parseInt(C7691x.m37029a(str, i, i2, "", false, false, true));
            return (parseInt <= 0 || parseInt > 65535) ? -1 : parseInt;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
