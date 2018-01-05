package com.google.common.flogger.backend;

import com.google.common.flogger.p422a.C7003d;
import com.google.common.flogger.p422a.C7005b;
import com.google.common.flogger.p422a.C7007e;
import com.google.common.flogger.p423b.C7011b;
import com.google.common.flogger.parser.C7045e;
import com.google.common.flogger.parser.ParseException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

public final class C7046q extends C7045e implements C7007e {
    public static final Locale f34553a = Locale.ROOT;
    public final Object[] f34554b;
    public final StringBuilder f34555c = new StringBuilder();
    public int f34556d = 0;

    public static void m32104a(C7013i c7013i, C7031r c7031r) {
        Throwable th;
        int i;
        String a;
        C7042l k = c7013i.mo5979k();
        for (int i2 = 0; i2 < k.mo5994a(); i2++) {
            if (k.mo5995a(i2).equals("/cause")) {
                Object b = k.mo5996b(i2);
                if (b instanceof Throwable) {
                    th = (Throwable) b;
                    break;
                }
            }
        }
        th = null;
        if (k.mo5994a() == 0 || (k.mo5994a() == 1 && th != null)) {
            i = 1;
        } else {
            i = 0;
        }
        if (c7013i.mo5975g() == null) {
            String a2 = C7046q.m32101a(c7013i.mo5977i());
            a = i == 0 ? C7046q.m32103a(new StringBuilder(a2), k) : a2;
        } else {
            C7045e c7046q = new C7046q(c7013i.mo5975g(), c7013i.mo5976h());
            c7046q.f34550e.f34566a.mo6013a(c7046q);
            if ((c7046q.f34551f & (c7046q.f34551f + 1)) != 0 || (c7046q.f34552g > 31 && c7046q.f34551f != -1)) {
                throw new ParseException(String.format("unreferenced arguments [first missing index=%d]", new Object[]{Integer.valueOf(Integer.numberOfTrailingZeros(c7046q.f34551f ^ -1))}));
            }
            StringBuilder stringBuilder = (StringBuilder) c7046q.mo6004c();
            if (c7013i.mo5976h().length > c7046q.f34552g + 1) {
                stringBuilder.append(" [ERROR: UNUSED LOG ARGUMENTS]");
            }
            a = C7046q.m32103a(stringBuilder, k);
        }
        c7031r.mo5992a(c7013i.mo5972d(), a, th);
    }

    public static String m32101a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (!obj.getClass().isArray()) {
                return String.valueOf(obj);
            }
            if (obj instanceof int[]) {
                return Arrays.toString((int[]) obj);
            }
            if (obj instanceof long[]) {
                return Arrays.toString((long[]) obj);
            }
            if (obj instanceof byte[]) {
                return Arrays.toString((byte[]) obj);
            }
            if (obj instanceof char[]) {
                return Arrays.toString((char[]) obj);
            }
            if (obj instanceof short[]) {
                return Arrays.toString((short[]) obj);
            }
            if (obj instanceof float[]) {
                return Arrays.toString((float[]) obj);
            }
            if (obj instanceof double[]) {
                return Arrays.toString((double[]) obj);
            }
            if (obj instanceof boolean[]) {
                return Arrays.toString((boolean[]) obj);
            }
            return Arrays.toString((Object[]) obj);
        } catch (RuntimeException e) {
            return C7046q.m32102a(obj, e);
        }
    }

    private static String m32102a(Object obj, RuntimeException runtimeException) {
        String runtimeException2;
        try {
            runtimeException2 = runtimeException.toString();
        } catch (RuntimeException e) {
            runtimeException2 = e.getClass().getSimpleName();
        }
        String name = obj.getClass().getName();
        return new StringBuilder((String.valueOf(name).length() + 16) + String.valueOf(runtimeException2).length()).append("{").append(name).append("@").append(System.identityHashCode(obj)).append(": ").append(runtimeException2).append("}").toString();
    }

    private static String m32103a(StringBuilder stringBuilder, C7042l c7042l) {
        int i = 0;
        int i2 = 0;
        while (i < c7042l.mo5994a()) {
            if (!c7042l.mo5995a(i).equals("/cause") || !(c7042l.mo5996b(i) instanceof Throwable)) {
                stringBuilder.append(i2 == 0 ? " -- metadata{ " : ", ").append(C7046q.m32100a(c7042l, i));
                i2 = 1;
            }
            i++;
        }
        if (i2 != 0) {
            stringBuilder.append(" }");
        }
        return stringBuilder.toString();
    }

    public static String m32100a(C7042l c7042l, int i) {
        String a = c7042l.mo5995a(i);
        a = a.substring(a.indexOf(47) + 1);
        String valueOf = String.valueOf(c7042l.mo5996b(i));
        return new StringBuilder((String.valueOf(a).length() + 2) + String.valueOf(valueOf).length()).append(a).append(": ").append(valueOf).toString();
    }

    private C7046q(C7054z c7054z, Object[] objArr) {
        super(c7054z);
        this.f34554b = (Object[]) C7011b.m31954a(objArr, "log arguments");
    }

    public final void mo5999a(int i, int i2, C7003d c7003d) {
        this.f34550e.f34566a.mo6014a(this.f34555c, this.f34550e.f34567b, this.f34556d, i);
        Object[] objArr = this.f34554b;
        if (c7003d.f34444d < objArr.length) {
            Object obj = objArr[c7003d.f34444d];
            if (obj != null) {
                c7003d.mo5956a(this, obj);
            } else {
                mo6003b();
            }
        } else {
            mo5998a();
        }
        this.f34556d = i2;
    }

    public final void mo6001a(Object obj, C7033a c7033a, C7034b c7034b) {
        int i = 0;
        if (c7033a.f34532m.mo5993a(obj)) {
            String valueOf;
            StringBuilder stringBuilder = this.f34555c;
            int i2;
            switch (c7033a.ordinal()) {
                case 0:
                    if (obj instanceof Formattable) {
                        obj = (Formattable) obj;
                        int i3 = c7034b.f34537c & 162;
                        if (i3 != 0) {
                            int i4;
                            i2 = (i3 & 32) != 0 ? 1 : 0;
                            if ((i3 & 128) != 0) {
                                i4 = 2;
                            } else {
                                i4 = 0;
                            }
                            i4 |= i2;
                            if ((i3 & 2) != 0) {
                                i = 4;
                            }
                            i |= i4;
                        } else {
                            i = i3;
                        }
                        i3 = stringBuilder.length();
                        Formatter formatter = new Formatter(stringBuilder, f34553a);
                        try {
                            obj.formatTo(formatter, i, c7034b.f34538d, c7034b.f34539e);
                            return;
                        } catch (RuntimeException e) {
                            stringBuilder.setLength(i3);
                            try {
                                formatter.out().append(C7046q.m32102a(obj, e));
                                return;
                            } catch (IOException e2) {
                                return;
                            }
                        }
                    } else if (c7034b.m32077b()) {
                        stringBuilder.append(C7046q.m32101a(obj));
                        return;
                    }
                    break;
                case 1:
                case 3:
                    if (c7034b.m32077b()) {
                        stringBuilder.append(obj);
                        return;
                    }
                    break;
                case 2:
                    if (c7034b.m32077b()) {
                        if (obj instanceof Character) {
                            stringBuilder.append(obj);
                            return;
                        }
                        i = ((Number) obj).intValue();
                        if (Character.isBmpCodePoint(i)) {
                            stringBuilder.append((char) i);
                            return;
                        } else {
                            stringBuilder.append(Character.toChars(i));
                            return;
                        }
                    }
                    break;
                case 5:
                    C7034b c7034b2;
                    if (c7034b.m32077b()) {
                        c7034b2 = c7034b;
                    } else {
                        i2 = c7034b.f34537c & 128;
                        if (i2 == 0) {
                            c7034b2 = C7034b.f34536b;
                        } else if (i2 == c7034b.f34537c && -1 == c7034b.f34538d && -1 == c7034b.f34539e) {
                            c7034b2 = c7034b;
                        } else {
                            c7034b2 = new C7034b(i2, -1, -1);
                        }
                    }
                    if (c7034b2.equals(c7034b)) {
                        Number number = (Number) obj;
                        boolean c = c7034b.m32078c();
                        long longValue = number.longValue();
                        if (number instanceof Long) {
                            C7046q.m32105a(stringBuilder, longValue, c);
                            return;
                        } else if (number instanceof Integer) {
                            C7046q.m32105a(stringBuilder, longValue & 4294967295L, c);
                            return;
                        } else if (number instanceof Byte) {
                            C7046q.m32105a(stringBuilder, longValue & 255, c);
                            return;
                        } else if (number instanceof Short) {
                            C7046q.m32105a(stringBuilder, longValue & 65535, c);
                            return;
                        } else if (number instanceof BigInteger) {
                            String bigInteger = ((BigInteger) number).toString(16);
                            if (c) {
                                bigInteger = bigInteger.toUpperCase(f34553a);
                            }
                            stringBuilder.append(bigInteger);
                            return;
                        } else {
                            valueOf = String.valueOf(number.getClass());
                            throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 25).append("unsupported number type: ").append(valueOf).toString());
                        }
                    }
                    break;
            }
            valueOf = c7033a.f34534o;
            if (!c7034b.m32077b()) {
                char c2 = c7033a.f34531l;
                if (c7034b.m32078c()) {
                    c2 = (char) (c2 & 65503);
                }
                valueOf = c7034b.m32075a(new StringBuilder("%")).append(c2).toString();
            }
            stringBuilder.append(String.format(f34553a, valueOf, new Object[]{obj}));
            return;
        }
        C7046q.m32106a(this.f34555c, obj, c7033a.f34534o);
    }

    public final void mo6000a(Object obj, C7005b c7005b, C7034b c7034b) {
        if ((obj instanceof Date) || (obj instanceof Calendar) || (obj instanceof Long)) {
            this.f34555c.append(String.format(f34553a, c7034b.m32075a(new StringBuilder("%")).append(c7034b.m32078c() ? 'T' : 't').append(c7005b.f34482G).toString(), new Object[]{obj}));
            return;
        }
        C7046q.m32106a(this.f34555c, obj, "%t" + c7005b.f34482G);
    }

    public final void mo6002a(String str) {
        this.f34555c.append(str);
    }

    public final void mo5998a() {
        this.f34555c.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    public final void mo6003b() {
        this.f34555c.append("null");
    }

    private static void m32105a(StringBuilder stringBuilder, long j, boolean z) {
        if (j == 0) {
            stringBuilder.append("0");
            return;
        }
        String str = z ? "0123456789ABCDEF" : "0123456789abcdef";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & -4; numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            stringBuilder.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    private static void m32106a(StringBuilder stringBuilder, Object obj, String str) {
        stringBuilder.append("[INVALID: format=").append(str).append(", type=").append(obj.getClass().getCanonicalName()).append(", value=").append(C7046q.m32101a(obj)).append("]");
    }

    public final /* synthetic */ Object mo6004c() {
        this.f34550e.f34566a.mo6014a(this.f34555c, this.f34550e.f34567b, this.f34556d, this.f34550e.f34567b.length());
        return this.f34555c;
    }
}
