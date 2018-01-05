package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6928c;
import com.google.common.p414a.C6931f;
import com.google.common.p414a.C6937m;
import com.squareup.haha.perflib.HprofParser;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ad {
    public static final Map f34034A;
    public static final Map f34035B;
    public static final Map f34036C;
    public static final Map f34037D;
    public static final Map f34038E;
    public static final Map f34039F;
    public static final Map f34040G;
    public static final Map f34041H;
    public static final Map f34042I;
    public static final Map f34043J;
    public static final Map f34044K;
    public static final Map f34045L;
    public static final Map f34046M;
    public static final Map f34047N;
    public static final Map f34048O;
    public static final ae f34049z;

    public abstract int mo5752a();

    public abstract int mo5753b();

    public abstract int mo5754c();

    public abstract byte[] mo5755d();

    public abstract byte[] mo5756e();

    public abstract int mo5757f();

    public abstract int mo5758g();

    public abstract int mo5759h();

    public abstract int mo5760i();

    public abstract int mo5761j();

    public abstract int mo5762k();

    public abstract int mo5763l();

    public abstract int mo5764m();

    public abstract int mo5765n();

    public abstract int mo5766o();

    public abstract int mo5767p();

    public abstract int mo5768q();

    public abstract int mo5769r();

    public abstract int mo5770s();

    public abstract int mo5771t();

    public abstract byte[] mo5772u();

    public abstract byte[] mo5773v();

    public abstract int mo5774w();

    public abstract int mo5775x();

    public abstract byte[] mo5776y();

    private final String m31313z() {
        return ad.m31311a(mo5755d(), 97);
    }

    private final String m31306A() {
        return ad.m31311a(mo5756e(), 48);
    }

    private static ae m31307B() {
        return new C6897c().mo5778a(52).mo5780b(0).mo5782c(0).mo5779a(new byte[2]).mo5781b(new byte[2]).mo5784d(0).mo5786e(0).mo5788f(0).mo5789g(0).mo5790h(0).mo5791i(0).mo5792j(0).mo5793k(0).mo5794l(0).mo5795m(0).mo5796n(0).mo5797o(0).mo5798p(0).mo5799q(0).mo5800r(0).mo5783c(new byte[4]).mo5785d(new byte[8]).mo5801s(0).mo5802t(0).mo5787e(new byte[0]);
    }

    static ad m31308a(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int i2 = byteBuffer.getInt();
        if (i2 >= 28) {
            i = 1;
        } else {
            i = 0;
        }
        String str = "Expected minimum ResourceConfiguration size of %s, got %s";
        if (i == 0) {
            throw new IllegalArgumentException(C6937m.m31628a(str, Integer.valueOf(28), Integer.valueOf(i2)));
        }
        ae c = ad.m31307B().mo5778a(i2).mo5780b(byteBuffer.getShort() & 65535).mo5782c(byteBuffer.getShort() & 65535);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[2];
        byteBuffer.get(bArr2);
        c.mo5779a(bArr).mo5781b(bArr2).mo5784d(byteBuffer.get() & HprofParser.ROOT_UNKNOWN).mo5786e(byteBuffer.get() & HprofParser.ROOT_UNKNOWN).mo5788f(byteBuffer.getShort() & 65535).mo5789g(byteBuffer.get() & HprofParser.ROOT_UNKNOWN).mo5790h(byteBuffer.get() & HprofParser.ROOT_UNKNOWN).mo5791i(byteBuffer.get() & HprofParser.ROOT_UNKNOWN);
        byteBuffer.get();
        c.mo5792j(byteBuffer.getShort() & 65535).mo5793k(byteBuffer.getShort() & 65535).mo5794l(byteBuffer.getShort() & 65535).mo5795m(byteBuffer.getShort() & 65535);
        if (i2 >= 32) {
            c.mo5796n(byteBuffer.get() & HprofParser.ROOT_UNKNOWN).mo5797o(byteBuffer.get() & HprofParser.ROOT_UNKNOWN).mo5798p(byteBuffer.getShort() & 65535);
        }
        if (i2 >= 36) {
            c.mo5799q(byteBuffer.getShort() & 65535).mo5800r(byteBuffer.getShort() & 65535);
        }
        if (i2 >= 48) {
            bArr = new byte[4];
            byteBuffer.get(bArr);
            bArr2 = new byte[8];
            byteBuffer.get(bArr2);
            c.mo5783c(bArr).mo5785d(bArr2);
        }
        if (i2 >= 52) {
            c.mo5801s(byteBuffer.get() & HprofParser.ROOT_UNKNOWN);
            c.mo5802t(byteBuffer.get() & HprofParser.ROOT_UNKNOWN);
            byteBuffer.getShort();
        }
        bArr = new byte[(i2 - (byteBuffer.position() - position))];
        byteBuffer.get(bArr);
        c.mo5787e(bArr);
        return c.mo5777a();
    }

    private static String m31311a(byte[] bArr, int i) {
        C6937m.m31631a(bArr.length == 2, (Object) "Language or region value must be 2 bytes.");
        if (bArr[0] == (byte) 0 && bArr[1] == (byte) 0) {
            return "";
        }
        if (((bArr[0] & HprofParser.ROOT_UNKNOWN) & 128) == 0) {
            return new String(bArr, C6928c.f34256a);
        }
        return new String(new byte[]{(byte) ((bArr[1] & 31) + i), (byte) ((((bArr[1] & 224) >>> 5) + i) + ((bArr[0] & 3) << 3)), (byte) (((bArr[0] & 124) >>> 2) + i)}, C6928c.f34256a);
    }

    public static byte[] m31312a(String str) {
        byte[] bytes = str.getBytes(C6928c.f34256a);
        if (bytes.length == 2) {
            return bytes;
        }
        boolean z;
        byte[] bArr = new byte[2];
        if (bytes.length == 3) {
            z = true;
        } else {
            z = false;
        }
        C6937m.m31635b(z);
        for (byte b : bytes) {
            if (b < (byte) 97 || b > (byte) 122) {
                z = false;
            } else {
                z = true;
            }
            C6937m.m31635b(z);
        }
        bArr[0] = (byte) ((((bytes[2] - 97) << 2) | ((bytes[1] - 97) >> 3)) | 128);
        bArr[1] = (byte) ((bytes[0] - 97) | ((bytes[1] - 97) << 5));
        return bArr;
    }

    private static String m31310a(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bArr[i] == (byte) 0) {
                break;
            }
            i++;
        }
        i = -1;
        if (i < 0) {
            i = bArr.length;
        }
        return new String(bArr, 0, i, C6928c.f34256a);
    }

    public final String toString() {
        Object obj = (f34049z.mo5778a(mo5752a()).mo5787e(mo5776y()).mo5777a().equals(this) && Arrays.equals(mo5776y(), new byte[mo5776y().length])) ? 1 : null;
        if (obj != null) {
            return "default";
        }
        String valueOf;
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(af.MCC, mo5753b() != 0 ? "mcc" + mo5753b() : "");
        linkedHashMap.put(af.MNC, mo5754c() != 0 ? "mnc" + mo5754c() : "");
        linkedHashMap.put(af.LANGUAGE_STRING, m31313z());
        linkedHashMap.put(af.LOCALE_SCRIPT_STRING, ad.m31310a(mo5772u()));
        af afVar = af.REGION_STRING;
        if (m31306A().isEmpty()) {
            obj = "";
        } else {
            String str = "r";
            valueOf = String.valueOf(m31306A());
            obj = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
        linkedHashMap.put(afVar, obj);
        linkedHashMap.put(af.LOCALE_VARIANT_STRING, ad.m31310a(mo5773v()));
        linkedHashMap.put(af.SCREEN_LAYOUT_DIRECTION, (String) ad.m31309a(f34042I, Integer.valueOf(mo5767p() & 192), ""));
        linkedHashMap.put(af.SMALLEST_SCREEN_WIDTH_DP, mo5769r() != 0 ? "sw" + mo5769r() + "dp" : "");
        linkedHashMap.put(af.SCREEN_WIDTH_DP, mo5770s() != 0 ? "w" + mo5770s() + "dp" : "");
        linkedHashMap.put(af.SCREEN_HEIGHT_DP, mo5771t() != 0 ? "h" + mo5771t() + "dp" : "");
        linkedHashMap.put(af.SCREEN_LAYOUT_SIZE, (String) ad.m31309a(f34045L, Integer.valueOf(mo5767p() & 15), ""));
        linkedHashMap.put(af.SCREEN_LAYOUT_LONG, (String) ad.m31309a(f34043J, Integer.valueOf(mo5767p() & 48), ""));
        linkedHashMap.put(af.SCREEN_LAYOUT_ROUND, (String) ad.m31309a(f34044K, Integer.valueOf(mo5774w() & 3), ""));
        linkedHashMap.put(af.COLOR_MODE_HDR, (String) ad.m31309a(f34035B, Integer.valueOf(mo5775x() & 12), ""));
        linkedHashMap.put(af.COLOR_MODE_WIDE_COLOR_GAMUT, (String) ad.m31309a(f34034A, Integer.valueOf(mo5775x() & 3), ""));
        linkedHashMap.put(af.ORIENTATION, (String) ad.m31309a(f34041H, Integer.valueOf(mo5757f()), ""));
        linkedHashMap.put(af.UI_MODE_TYPE, (String) ad.m31309a(f34048O, Integer.valueOf(mo5768q() & 15), ""));
        linkedHashMap.put(af.UI_MODE_NIGHT, (String) ad.m31309a(f34047N, Integer.valueOf(mo5768q() & 48), ""));
        linkedHashMap.put(af.DENSITY_DPI, (String) ad.m31309a(f34036C, Integer.valueOf(mo5759h()), mo5759h() + "dpi"));
        linkedHashMap.put(af.TOUCHSCREEN, (String) ad.m31309a(f34046M, Integer.valueOf(mo5758g()), ""));
        linkedHashMap.put(af.KEYBOARD_HIDDEN, (String) ad.m31309a(f34038E, Integer.valueOf(mo5762k() & 3), ""));
        linkedHashMap.put(af.KEYBOARD, (String) ad.m31309a(f34037D, Integer.valueOf(mo5760i()), ""));
        linkedHashMap.put(af.NAVIGATION_HIDDEN, (String) ad.m31309a(f34040G, Integer.valueOf(mo5762k() & 12), ""));
        linkedHashMap.put(af.NAVIGATION, (String) ad.m31309a(f34039F, Integer.valueOf(mo5761j()), ""));
        afVar = af.SCREEN_SIZE;
        obj = (mo5763l() == 0 && mo5764m() == 0) ? "" : mo5763l() + "x" + mo5764m();
        linkedHashMap.put(afVar, obj);
        obj = "";
        if (mo5765n() != 0) {
            obj = "v" + mo5765n();
            if (mo5766o() != 0) {
                valueOf = String.valueOf(obj);
                obj = new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(".").append(mo5766o()).toString();
            }
        }
        linkedHashMap.put(af.SDK_VERSION, obj);
        valueOf = ad.m31310a(mo5772u());
        String a = ad.m31310a(mo5773v());
        if (!(valueOf.isEmpty() && a.isEmpty())) {
            String str2;
            StringBuilder append = new StringBuilder("b+").append(m31313z());
            if (!valueOf.isEmpty()) {
                str2 = "+";
                valueOf = String.valueOf(valueOf);
                append.append(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            valueOf = m31306A();
            if (!valueOf.isEmpty()) {
                str2 = "+";
                valueOf = String.valueOf(valueOf);
                append.append(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            if (!a.isEmpty()) {
                str2 = "+";
                valueOf = String.valueOf(a);
                append.append(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            linkedHashMap.put(af.LANGUAGE_STRING, append.toString());
            linkedHashMap.remove(af.LOCALE_SCRIPT_STRING);
            linkedHashMap.remove(af.REGION_STRING);
            linkedHashMap.remove(af.LOCALE_VARIANT_STRING);
        }
        Iterable values = linkedHashMap.values();
        values.removeAll(Collections.singleton(""));
        return new C6931f("-").m31619a(new StringBuilder(), values.iterator()).toString();
    }

    private static Object m31309a(Map map, Object obj, Object obj2) {
        Object obj3 = map.get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    static {
        ae B = ad.m31307B();
        f34049z = B;
        B.mo5777a();
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), "");
        hashMap.put(Integer.valueOf(1), "nowidecg");
        hashMap.put(Integer.valueOf(2), "widecg");
        f34034A = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), "");
        hashMap.put(Integer.valueOf(4), "lowdr");
        hashMap.put(Integer.valueOf(8), "highdr");
        f34035B = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), "");
        hashMap.put(Integer.valueOf(120), "ldpi");
        hashMap.put(Integer.valueOf(160), "mdpi");
        hashMap.put(Integer.valueOf(213), "tvdpi");
        hashMap.put(Integer.valueOf(240), "hdpi");
        hashMap.put(Integer.valueOf(320), "xhdpi");
        hashMap.put(Integer.valueOf(480), "xxhdpi");
        hashMap.put(Integer.valueOf(640), "xxxhdpi");
        hashMap.put(Integer.valueOf(65534), "anydpi");
        hashMap.put(Integer.valueOf(65535), "nodpi");
        f34036C = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), "nokeys");
        hashMap.put(Integer.valueOf(2), "qwerty");
        hashMap.put(Integer.valueOf(3), "12key");
        f34037D = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), "keysexposed");
        hashMap.put(Integer.valueOf(2), "keyshidden");
        hashMap.put(Integer.valueOf(3), "keyssoft");
        f34038E = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), "nonav");
        hashMap.put(Integer.valueOf(2), "dpad");
        hashMap.put(Integer.valueOf(3), "trackball");
        hashMap.put(Integer.valueOf(4), "wheel");
        f34039F = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(4), "navexposed");
        hashMap.put(Integer.valueOf(8), "navhidden");
        f34040G = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), "port");
        hashMap.put(Integer.valueOf(2), "land");
        f34041H = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(64), "ldltr");
        hashMap.put(Integer.valueOf(128), "ldrtl");
        f34042I = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(16), "notlong");
        hashMap.put(Integer.valueOf(32), "long");
        f34043J = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), "notround");
        hashMap.put(Integer.valueOf(2), "round");
        f34044K = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), "small");
        hashMap.put(Integer.valueOf(2), "normal");
        hashMap.put(Integer.valueOf(3), "large");
        hashMap.put(Integer.valueOf(4), "xlarge");
        f34045L = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(1), "notouch");
        hashMap.put(Integer.valueOf(3), "finger");
        f34046M = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(16), "notnight");
        hashMap.put(Integer.valueOf(32), "night");
        f34047N = Collections.unmodifiableMap(hashMap);
        hashMap = new HashMap();
        hashMap.put(Integer.valueOf(2), "desk");
        hashMap.put(Integer.valueOf(3), "car");
        hashMap.put(Integer.valueOf(4), "television");
        hashMap.put(Integer.valueOf(5), "appliance");
        hashMap.put(Integer.valueOf(6), "watch");
        hashMap.put(Integer.valueOf(7), "vrheadset");
        f34048O = Collections.unmodifiableMap(hashMap);
    }
}
