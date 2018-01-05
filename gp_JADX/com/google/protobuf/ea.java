package com.google.protobuf;

import com.squareup.haha.perflib.HprofParser;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class ea {
    public static final Logger f35377a = Logger.getLogger(ea.class.getName());
    public static final Unsafe f35378b = m33362a();
    public static final Class f35379c = m33360a("libcore.io.Memory");
    public static final boolean f35380d = (m33360a("org.robolectric.Robolectric") != null);
    public static final boolean f35381e = m33380c(Long.TYPE);
    public static final boolean f35382f = m33380c(Integer.TYPE);
    public static final ef f35383g;
    public static final boolean f35384h = m33379c();
    public static final boolean f35385i = m33377b();
    public static final long f35386j = ((long) m33357a(byte[].class));
    public static final long f35387k;
    public static final boolean f35388l;

    private ea() {
    }

    private static int m33357a(Class cls) {
        if (f35385i) {
            return f35383g.f35389a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int m33373b(Class cls) {
        if (f35385i) {
            return f35383g.f35389a.arrayIndexScale(cls);
        }
        return -1;
    }

    static int m33358a(Object obj, long j) {
        return f35383g.m33406e(obj, j);
    }

    static void m33368a(Object obj, long j, int i) {
        f35383g.m33398a(obj, j, i);
    }

    static long m33374b(Object obj, long j) {
        return f35383g.m33407f(obj, j);
    }

    static void m33369a(Object obj, long j, long j2) {
        f35383g.m33399a(obj, j, j2);
    }

    static boolean m33381c(Object obj, long j) {
        return f35383g.mo6214b(obj, j);
    }

    static void m33371a(Object obj, long j, boolean z) {
        f35383g.mo6211a(obj, j, z);
    }

    static float m33382d(Object obj, long j) {
        return f35383g.mo6215c(obj, j);
    }

    static void m33367a(Object obj, long j, float f) {
        f35383g.mo6210a(obj, j, f);
    }

    static double m33384e(Object obj, long j) {
        return f35383g.mo6216d(obj, j);
    }

    static void m33366a(Object obj, long j, double d) {
        f35383g.mo6209a(obj, j, d);
    }

    static Object m33385f(Object obj, long j) {
        return f35383g.f35389a.getObject(obj, j);
    }

    static void m33370a(Object obj, long j, Object obj2) {
        f35383g.f35389a.putObject(obj, j, obj2);
    }

    static byte m33356a(byte[] bArr, long j) {
        return f35383g.mo6204a((Object) bArr, f35386j + j);
    }

    static void m33372a(byte[] bArr, long j, byte b) {
        f35383g.mo6208a((Object) bArr, f35386j + j, b);
    }

    static void m33363a(long j, byte b) {
        f35383g.mo6206a(j, b);
    }

    static void m33364a(long j, int i) {
        f35383g.mo6207a(j, i);
    }

    static long m33359a(ByteBuffer byteBuffer) {
        return f35383g.m33407f(byteBuffer, f35387k);
    }

    private static Unsafe m33362a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new eb());
        } catch (Throwable th) {
            return null;
        }
    }

    private static boolean m33377b() {
        if (f35378b == null) {
            return false;
        }
        try {
            Class cls = f35378b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (m33383d()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            f35377a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean m33379c() {
        if (f35378b == null) {
            return false;
        }
        try {
            Class cls = f35378b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m33383d()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            f35377a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean m33380c(Class cls) {
        if (!m33383d()) {
            return false;
        }
        try {
            Class cls2 = f35379c;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    private static boolean m33383d() {
        return (f35379c == null || f35380d) ? false : true;
    }

    private static Class m33360a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    private static Field m33361a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    static byte m33386g(Object obj, long j) {
        return (byte) ((m33358a(obj, -4 & j) >>> ((int) (((-1 ^ j) & 3) << 3))) & HprofParser.ROOT_UNKNOWN);
    }

    static byte m33387h(Object obj, long j) {
        return (byte) ((m33358a(obj, -4 & j) >>> ((int) ((3 & j) << 3))) & HprofParser.ROOT_UNKNOWN);
    }

    static void m33365a(Object obj, long j, byte b) {
        int i = ((((int) j) ^ -1) & 3) << 3;
        m33368a(obj, j & -4, (m33358a(obj, j & -4) & ((HprofParser.ROOT_UNKNOWN << i) ^ -1)) | ((b & HprofParser.ROOT_UNKNOWN) << i));
    }

    static void m33375b(Object obj, long j, byte b) {
        int i = (((int) j) & 3) << 3;
        m33368a(obj, j & -4, (m33358a(obj, j & -4) & ((HprofParser.ROOT_UNKNOWN << i) ^ -1)) | ((b & HprofParser.ROOT_UNKNOWN) << i));
    }

    static boolean m33388i(Object obj, long j) {
        return m33386g(obj, j) != (byte) 0;
    }

    static boolean m33389j(Object obj, long j) {
        return m33387h(obj, j) != (byte) 0;
    }

    static void m33376b(Object obj, long j, boolean z) {
        m33365a(obj, j, (byte) (z ? 1 : 0));
    }

    static void m33378c(Object obj, long j, boolean z) {
        m33375b(obj, j, (byte) (z ? 1 : 0));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r3 = 0;
        r1 = 1;
        r2 = 0;
        r0 = com.google.protobuf.ea.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        f35377a = r0;
        r0 = m33362a();
        f35378b = r0;
        r0 = "libcore.io.Memory";
        r0 = m33360a(r0);
        f35379c = r0;
        r0 = "org.robolectric.Robolectric";
        r0 = m33360a(r0);
        if (r0 == 0) goto L_0x00b5;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        f35380d = r0;
        r0 = java.lang.Long.TYPE;
        r0 = m33380c(r0);
        f35381e = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = m33380c(r0);
        f35382f = r0;
        r0 = f35378b;
        if (r0 != 0) goto L_0x00b8;
    L_0x003c:
        r0 = r3;
    L_0x003d:
        f35383g = r0;
        r0 = m33379c();
        f35384h = r0;
        r0 = m33377b();
        f35385i = r0;
        r0 = byte[].class;
        r0 = m33357a(r0);
        r4 = (long) r0;
        f35386j = r4;
        r0 = boolean[].class;
        m33357a(r0);
        r0 = boolean[].class;
        m33373b(r0);
        r0 = int[].class;
        m33357a(r0);
        r0 = int[].class;
        m33373b(r0);
        r0 = long[].class;
        m33357a(r0);
        r0 = long[].class;
        m33373b(r0);
        r0 = float[].class;
        m33357a(r0);
        r0 = float[].class;
        m33373b(r0);
        r0 = double[].class;
        m33357a(r0);
        r0 = double[].class;
        m33373b(r0);
        r0 = java.lang.Object[].class;
        m33357a(r0);
        r0 = java.lang.Object[].class;
        m33373b(r0);
        r0 = m33383d();
        if (r0 == 0) goto L_0x00e4;
    L_0x0096:
        r0 = java.nio.Buffer.class;
        r3 = "effectiveDirectAddress";
        r0 = m33361a(r0, r3);
        if (r0 == 0) goto L_0x00e4;
    L_0x00a0:
        if (r0 == 0) goto L_0x00a6;
    L_0x00a2:
        r3 = f35383g;
        if (r3 != 0) goto L_0x00ed;
    L_0x00a6:
        r4 = -1;
    L_0x00a8:
        f35387k = r4;
        r0 = java.nio.ByteOrder.nativeOrder();
        r3 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r3) goto L_0x00f4;
    L_0x00b2:
        f35388l = r1;
        return;
    L_0x00b5:
        r0 = r2;
        goto L_0x0026;
    L_0x00b8:
        r0 = m33383d();
        if (r0 == 0) goto L_0x00db;
    L_0x00be:
        r0 = f35381e;
        if (r0 == 0) goto L_0x00cb;
    L_0x00c2:
        r0 = new com.google.protobuf.ed;
        r3 = f35378b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x00cb:
        r0 = f35382f;
        if (r0 == 0) goto L_0x00d8;
    L_0x00cf:
        r0 = new com.google.protobuf.ec;
        r3 = f35378b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x00d8:
        r0 = r3;
        goto L_0x003d;
    L_0x00db:
        r0 = new com.google.protobuf.ee;
        r3 = f35378b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x00e4:
        r0 = java.nio.Buffer.class;
        r3 = "address";
        r0 = m33361a(r0, r3);
        goto L_0x00a0;
    L_0x00ed:
        r3 = f35383g;
        r4 = r3.m33392a(r0);
        goto L_0x00a8;
    L_0x00f4:
        r1 = r2;
        goto L_0x00b2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ea.<clinit>():void");
    }
}
