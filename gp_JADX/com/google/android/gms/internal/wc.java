package com.google.android.gms.internal;

import com.squareup.haha.perflib.HprofParser;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class wc {
    public static final Logger f27589a = Logger.getLogger(wc.class.getName());
    public static final Unsafe f27590b = m25824a();
    public static final Class f27591c = m25822a("libcore.io.Memory");
    public static final boolean f27592d = (m25822a("org.robolectric.Robolectric") != null);
    public static final boolean f27593e = m25834c(Long.TYPE);
    public static final boolean f27594f = m25834c(Integer.TYPE);
    public static final wg f27595g;
    public static final boolean f27596h = m25835d();
    public static final boolean f27597i = m25831b();
    public static final long f27598j = ((long) m25821a(byte[].class));
    public static final boolean f27599k;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r3 = 0;
        r1 = 1;
        r2 = 0;
        r0 = com.google.android.gms.internal.wc.class;
        r0 = r0.getName();
        r0 = java.util.logging.Logger.getLogger(r0);
        f27589a = r0;
        r0 = m25824a();
        f27590b = r0;
        r0 = "libcore.io.Memory";
        r0 = m25822a(r0);
        f27591c = r0;
        r0 = "org.robolectric.Robolectric";
        r0 = m25822a(r0);
        if (r0 == 0) goto L_0x00b4;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        f27592d = r0;
        r0 = java.lang.Long.TYPE;
        r0 = m25834c(r0);
        f27593e = r0;
        r0 = java.lang.Integer.TYPE;
        r0 = m25834c(r0);
        f27594f = r0;
        r0 = f27590b;
        if (r0 != 0) goto L_0x00b7;
    L_0x003c:
        r0 = r3;
    L_0x003d:
        f27595g = r0;
        r0 = m25835d();
        f27596h = r0;
        r0 = m25831b();
        f27597i = r0;
        m25833c();
        r0 = byte[].class;
        r0 = m25821a(r0);
        r4 = (long) r0;
        f27598j = r4;
        r0 = boolean[].class;
        m25821a(r0);
        r0 = boolean[].class;
        m25829b(r0);
        r0 = int[].class;
        m25821a(r0);
        r0 = int[].class;
        m25829b(r0);
        r0 = long[].class;
        m25821a(r0);
        r0 = long[].class;
        m25829b(r0);
        r0 = float[].class;
        m25821a(r0);
        r0 = float[].class;
        m25829b(r0);
        r0 = double[].class;
        m25821a(r0);
        r0 = double[].class;
        m25829b(r0);
        r0 = java.lang.Object[].class;
        m25821a(r0);
        r0 = java.lang.Object[].class;
        m25829b(r0);
        r0 = m25836e();
        if (r0 == 0) goto L_0x00e3;
    L_0x0099:
        r0 = java.nio.Buffer.class;
        r3 = "effectiveDirectAddress";
        r0 = m25823a(r0, r3);
        if (r0 == 0) goto L_0x00e3;
    L_0x00a3:
        if (r0 == 0) goto L_0x00a9;
    L_0x00a5:
        r3 = f27595g;
        if (r3 != 0) goto L_0x00ec;
    L_0x00a9:
        r0 = java.nio.ByteOrder.nativeOrder();
        r3 = java.nio.ByteOrder.BIG_ENDIAN;
        if (r0 != r3) goto L_0x00f4;
    L_0x00b1:
        f27599k = r1;
        return;
    L_0x00b4:
        r0 = r2;
        goto L_0x0026;
    L_0x00b7:
        r0 = m25836e();
        if (r0 == 0) goto L_0x00da;
    L_0x00bd:
        r0 = f27593e;
        if (r0 == 0) goto L_0x00ca;
    L_0x00c1:
        r0 = new com.google.android.gms.internal.we;
        r3 = f27590b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x00ca:
        r0 = f27594f;
        if (r0 == 0) goto L_0x00d7;
    L_0x00ce:
        r0 = new com.google.android.gms.internal.wd;
        r3 = f27590b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x00d7:
        r0 = r3;
        goto L_0x003d;
    L_0x00da:
        r0 = new com.google.android.gms.internal.wf;
        r3 = f27590b;
        r0.<init>(r3);
        goto L_0x003d;
    L_0x00e3:
        r0 = java.nio.Buffer.class;
        r3 = "address";
        r0 = m25823a(r0, r3);
        goto L_0x00a3;
    L_0x00ec:
        r3 = f27595g;
        r3 = r3.f27600a;
        r3.objectFieldOffset(r0);
        goto L_0x00a9;
    L_0x00f4:
        r1 = r2;
        goto L_0x00b1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wc.<clinit>():void");
    }

    private wc() {
    }

    static byte m25820a(byte[] bArr, long j) {
        return f27595g.mo4944a(bArr, f27598j + j);
    }

    private static int m25821a(Class cls) {
        return f27597i ? f27595g.f27600a.arrayBaseOffset(cls) : -1;
    }

    private static Class m25822a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    private static Field m25823a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    private static Unsafe m25824a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new wh());
        } catch (Throwable th) {
            return null;
        }
    }

    private static void m25826a(Object obj, long j, int i) {
        f27595g.f27600a.putInt(obj, j, i);
    }

    static void m25827a(byte[] bArr, long j, byte b) {
        f27595g.mo4945a(bArr, f27598j + j, b);
    }

    private static int m25829b(Class cls) {
        return f27597i ? f27595g.f27600a.arrayIndexScale(cls) : -1;
    }

    private static boolean m25831b() {
        if (f27590b == null) {
            return false;
        }
        try {
            Class cls = f27590b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (m25836e()) {
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
            f27589a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static int m25832c(Object obj, long j) {
        return f27595g.f27600a.getInt(obj, j);
    }

    private static boolean m25833c() {
        if (f27590b == null) {
            return false;
        }
        try {
            f27590b.getClass().getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            f27589a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeCopyMemory", "copyMemory is missing from platform - proto runtime falling back to safer methods.");
            return false;
        }
    }

    private static boolean m25834c(Class cls) {
        if (!m25836e()) {
            return false;
        }
        try {
            Class cls2 = f27591c;
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

    private static boolean m25835d() {
        if (f27590b == null) {
            return false;
        }
        try {
            Class cls = f27590b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m25836e()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            f27589a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", new StringBuilder(String.valueOf(valueOf).length() + 71).append("platform method missing - proto runtime falling back to safer methods: ").append(valueOf).toString());
            return false;
        }
    }

    private static boolean m25836e() {
        return (f27591c == null || f27592d) ? false : true;
    }

    static /* synthetic */ void m25825a(Object obj, long j, byte b) {
        int i = ((((int) j) ^ -1) & 3) << 3;
        m25826a(obj, j & -4, (m25832c(obj, j & -4) & ((HprofParser.ROOT_UNKNOWN << i) ^ -1)) | ((b & HprofParser.ROOT_UNKNOWN) << i));
    }

    static /* synthetic */ void m25830b(Object obj, long j, byte b) {
        int i = (((int) j) & 3) << 3;
        m25826a(obj, j & -4, (m25832c(obj, j & -4) & ((HprofParser.ROOT_UNKNOWN << i) ^ -1)) | ((b & HprofParser.ROOT_UNKNOWN) << i));
    }
}
