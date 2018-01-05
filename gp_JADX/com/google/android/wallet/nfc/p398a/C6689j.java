package com.google.android.wallet.nfc.p398a;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.wallet.common.util.C6593e;
import com.google.android.wallet.nfc.C6690a;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C6689j {
    public static final Pattern f32998a = Pattern.compile("/");
    public static final Pattern f32999b = Pattern.compile("^(?:[A-Z])(\\d{1,19})\\^([^\\^]{2,26})\\^(\\d{4}|\\^)(?:[0-9]{3}|\\^)(?:\\S*)$");
    public static final Pattern f33000c = Pattern.compile("^(\\d{1,19})D(\\d{4}|=)(?:[0-9]{3}|=)(?:\\S*)F$");
    public static final Pattern f33001d = Pattern.compile("^(\\d{1,19})D(\\d{4}|=)(?:[0-9]{3}|=)(?:\\S*)(?:[F]?)$");
    public static final byte[] f33002e = new byte[]{(byte) 111};
    public static final byte[] f33003f = new byte[]{(byte) -124};
    public static final byte[] f33004g = new byte[]{(byte) -91};
    public static final byte[] f33005h = new byte[]{(byte) 80};
    public static final byte[] f33006i = new byte[]{(byte) 79};
    public static final byte[] f33007j = new byte[]{(byte) -97, (byte) 56};
    public static final byte[] f33008k = new byte[]{(byte) -120};
    public static final byte[] f33009l = new byte[]{(byte) -126};
    public static final byte[] f33010m = new byte[]{(byte) -108};
    public static final byte[] f33011n = new byte[]{(byte) 119};
    public static final byte[] f33012o = new byte[]{Byte.MIN_VALUE};
    public static final byte[] f33013p = new byte[]{(byte) 112};
    public static final byte[] f33014q = new byte[]{(byte) 86};
    public static final byte[] f33015r = new byte[]{(byte) 87};
    public static final byte[] f33016s = new byte[]{(byte) -97, (byte) 107};
    public static final byte[] f33017t = new byte[]{(byte) 90};
    public static final byte[] f33018u = new byte[]{(byte) 95, (byte) 32};
    public static final byte[] f33019v = new byte[]{(byte) 95, (byte) 36};
    public static final byte[] f33020w = new byte[]{(byte) -97, (byte) 11};
    public static final SparseIntArray f33021x;

    private static int m30319a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            i2 = (i2 << 8) | bArr[i];
            i++;
        }
        return (bArr.length << 16) | i2;
    }

    public static String m30321a(C6687h c6687h) {
        if (c6687h == null) {
            return null;
        }
        switch (f33021x.get(C6689j.m30319a(c6687h.f32995a), 1)) {
            case 2:
                return C6593e.m29920b(c6687h.f32996b);
            default:
                return C6593e.m29918a(c6687h.f32996b);
        }
    }

    public static byte[] m30324b(C6687h c6687h) {
        if (c6687h == null) {
            return new byte[0];
        }
        int i;
        List a = C6688i.m30317a(c6687h.f32996b, 0);
        int i2 = 0;
        for (i = 0; i < a.size(); i++) {
            i2 += C6593e.m29917a(((C6686g) a.get(i)).f32994a);
        }
        byte[] bArr = new byte[(i2 + 2)];
        bArr[0] = (byte) -125;
        bArr[1] = (byte) i2;
        for (i = 0; i < i2; i++) {
            bArr[i + 2] = (byte) 0;
        }
        return bArr;
    }

    public static byte[] m30323a(C6685f c6685f) {
        C6687h a = C6688i.m30316a(c6685f);
        if (a == null) {
            return new byte[0];
        }
        if (Arrays.equals(a.f32995a, f33011n)) {
            a = C6689j.m30320a(a, f33010m);
            return a == null ? new byte[0] : a.f32996b;
        } else if (!Arrays.equals(a.f32995a, f33012o)) {
            return new byte[0];
        } else {
            if (a.f32996b.length < 2) {
                return new byte[0];
            }
            return Arrays.copyOfRange(a.f32996b, 2, a.f32996b.length);
        }
    }

    public static C6687h m30320a(C6687h c6687h, byte[] bArr) {
        if (Arrays.equals(c6687h.f32995a, bArr)) {
            return c6687h;
        }
        int size = c6687h.f32997c.size();
        for (int i = 0; i < size; i++) {
            C6687h a = C6689j.m30320a((C6687h) c6687h.f32997c.get(i), bArr);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public static C6690a m30325c(C6687h c6687h) {
        if (!Arrays.equals(c6687h.f32995a, f33013p)) {
            return null;
        }
        int parseInt;
        int parseInt2;
        Matcher matcher;
        String str;
        String str2 = "";
        String str3 = "";
        C6687h a = C6689j.m30320a(c6687h, f33017t);
        if (a != null) {
            str2 = C6689j.m30321a(a);
        }
        a = C6689j.m30320a(c6687h, f33018u);
        if (a != null) {
            str3 = C6689j.m30322a(C6689j.m30321a(a));
        }
        a = C6689j.m30320a(c6687h, f33020w);
        if (a != null) {
            str3 = C6689j.m30322a(C6689j.m30321a(a));
        }
        a = C6689j.m30320a(c6687h, f33019v);
        if (a != null) {
            String a2 = C6689j.m30321a(a);
            parseInt = Integer.parseInt(a2.substring(2, 4));
            parseInt2 = Integer.parseInt(a2.substring(0, 2));
        } else {
            parseInt2 = 0;
            parseInt = 0;
        }
        C6687h a3 = C6689j.m30320a(c6687h, f33014q);
        if (a3 != null) {
            matcher = f32999b.matcher(C6689j.m30321a(a3));
            if (matcher.find()) {
                str2 = matcher.group(1);
                str3 = C6689j.m30322a(matcher.group(2));
                a2 = matcher.group(3);
                parseInt = Integer.parseInt(a2.substring(2, 4));
                parseInt2 = Integer.parseInt(a2.substring(0, 2));
            }
        }
        a3 = C6689j.m30320a(c6687h, f33016s);
        if (a3 != null) {
            matcher = f33000c.matcher(C6689j.m30321a(a3));
            if (matcher.find()) {
                str2 = matcher.group(1);
                a2 = matcher.group(2);
                parseInt = Integer.parseInt(a2.substring(2, 4));
                parseInt2 = Integer.parseInt(a2.substring(0, 2));
            }
        }
        a3 = C6689j.m30320a(c6687h, f33015r);
        if (a3 != null) {
            matcher = f33001d.matcher(C6689j.m30321a(a3));
            if (matcher.find()) {
                str2 = matcher.group(1);
                a2 = matcher.group(2);
                parseInt = Integer.parseInt(a2.substring(2, 4));
                parseInt2 = Integer.parseInt(a2.substring(0, 2));
                str = str2;
                return (str3 == null || str != null || (parseInt > 0 && parseInt2 > 0)) ? new C6690a(str, parseInt, parseInt2, str3) : null;
            }
        }
        str = str2;
        if (str3 == null) {
        }
    }

    private static String m30322a(String str) {
        String replaceAll = f32998a.matcher(str).replaceAll("");
        return TextUtils.getTrimmedLength(replaceAll) == 0 ? "" : replaceAll;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(19);
        f33021x = sparseIntArray;
        sparseIntArray.append(C6689j.m30319a(f33002e), 1);
        f33021x.append(C6689j.m30319a(f33003f), 1);
        f33021x.append(C6689j.m30319a(f33004g), 1);
        f33021x.append(C6689j.m30319a(f33005h), 2);
        f33021x.append(C6689j.m30319a(f33006i), 1);
        f33021x.append(C6689j.m30319a(f33007j), 1);
        f33021x.append(C6689j.m30319a(f33008k), 1);
        f33021x.append(C6689j.m30319a(f33009l), 1);
        f33021x.append(C6689j.m30319a(f33010m), 1);
        f33021x.append(C6689j.m30319a(f33011n), 1);
        f33021x.append(C6689j.m30319a(f33012o), 1);
        f33021x.append(C6689j.m30319a(f33013p), 1);
        f33021x.append(C6689j.m30319a(f33014q), 2);
        f33021x.append(C6689j.m30319a(f33015r), 1);
        f33021x.append(C6689j.m30319a(f33016s), 1);
        f33021x.append(C6689j.m30319a(f33017t), 3);
        f33021x.append(C6689j.m30319a(f33018u), 2);
        f33021x.append(C6689j.m30319a(f33019v), 3);
        f33021x.append(C6689j.m30319a(f33020w), 2);
    }
}
