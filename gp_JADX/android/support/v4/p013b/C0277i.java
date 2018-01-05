package android.support.v4.p013b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.Builder;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import android.support.v4.p028a.p029a.C0203c;
import android.support.v4.p028a.p029a.C0204d;
import android.support.v4.p035f.C0288b;
import android.support.v4.p035f.C0295h;
import android.util.Log;
import com.google.c.a.a.a.a.a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public final class C0277i extends C0275g {
    public static final Class f1652a;
    public static final Constructor f1653b;
    public static final Method f1654c;
    public static final Method f1655d;
    public static final Method f1656e;
    public static final Method f1657f;
    public static final Method f1658g;

    private static boolean m1577a() {
        if (f1654c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return f1654c != null;
    }

    private static Object m1580b() {
        Throwable e;
        try {
            return f1653b.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1578a(Context context, Object obj, String str, int i, int i2) {
        Throwable e;
        try {
            return ((Boolean) f1654c.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(i2), null})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1579a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        Throwable e;
        try {
            return ((Boolean) f1655d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static Typeface m1576a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(f1652a, 1), 0, obj);
            return (Typeface) f1658g.invoke(null, new Object[]{r0, Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1581b(Object obj) {
        Throwable e;
        try {
            return ((Boolean) f1656e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static boolean m1582c(Object obj) {
        Throwable e;
        try {
            return ((Boolean) f1657f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public final Typeface mo367a(Context context, C0203c c0203c, Resources resources, int i) {
        if (!C0277i.m1577a()) {
            return super.mo367a(context, c0203c, resources, i);
        }
        Object b = C0277i.m1580b();
        C0204d[] c0204dArr = c0203c.f1179a;
        int length = c0204dArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            C0204d c0204d = c0204dArr[i2];
            String str = c0204d.f1180a;
            int i4 = c0204d.f1181b;
            if (c0204d.f1182c) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (C0277i.m1578a(context, b, str, i4, i3)) {
                i2++;
            } else {
                C0277i.m1582c(b);
                return null;
            }
        }
        if (C0277i.m1581b(b)) {
            return C0277i.m1576a(b);
        }
        return null;
    }

    public final Typeface mo368a(Context context, C0295h[] c0295hArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Throwable th2;
        if (c0295hArr.length <= 0) {
            return null;
        }
        if (C0277i.m1577a()) {
            Map a = C0288b.m1609a(context, c0295hArr);
            Object b = C0277i.m1580b();
            Object obj = null;
            int length = c0295hArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj2;
                C0295h c0295h = c0295hArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) a.get(c0295h.f1680a);
                if (byteBuffer != null) {
                    if (C0277i.m1579a(b, byteBuffer, c0295h.f1681b, c0295h.f1682c, c0295h.f1683d ? 1 : 0)) {
                        obj2 = 1;
                    } else {
                        C0277i.m1582c(b);
                        return null;
                    }
                }
                obj2 = obj;
                i2++;
                obj = obj2;
            }
            if (obj == null) {
                C0277i.m1582c(b);
                return null;
            } else if (C0277i.m1581b(b)) {
                return Typeface.create(C0277i.m1576a(b), i);
            } else {
                return null;
            }
        }
        C0295h a2 = C0274j.m1564a(c0295hArr, i);
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.f1680a, "r", null);
            th = null;
            try {
                Typeface build = new Builder(openFileDescriptor.getFileDescriptor()).setWeight(a2.f1682c).setItalic(a2.f1683d).build();
                if (openFileDescriptor == null) {
                    return build;
                }
                openFileDescriptor.close();
                return build;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th3 = th2;
                th2 = th4;
            }
        } catch (IOException e) {
            return null;
        }
        if (openFileDescriptor != null) {
            if (th3 != null) {
                try {
                    openFileDescriptor.close();
                } catch (Throwable th5) {
                    a.a(th3, th5);
                }
            } else {
                openFileDescriptor.close();
            }
        }
        throw th2;
        throw th2;
    }

    public final Typeface mo366a(Context context, Resources resources, int i, String str, int i2) {
        if (!C0277i.m1577a()) {
            return super.mo366a(context, resources, i, str, i2);
        }
        Object b = C0277i.m1580b();
        if (!C0277i.m1578a(context, b, str, -1, -1)) {
            C0277i.m1582c(b);
            return null;
        } else if (C0277i.m1581b(b)) {
            return C0277i.m1576a(b);
        } else {
            return null;
        }
    }

    static {
        Method method;
        Method method2;
        Method method3;
        Method declaredMethod;
        Constructor constructor;
        Class cls;
        Throwable e;
        Method method4 = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls2.getConstructor(new Class[0]);
            Method method5 = cls2.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method2 = cls2.getMethod("freeze", new Class[0]);
            method3 = cls2.getMethod("abortCreation", new Class[0]);
            declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls2, 1).getClass(), Integer.TYPE, Integer.TYPE});
            declaredMethod.setAccessible(true);
            method4 = method3;
            method3 = method2;
            method2 = method;
            method = method5;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException e2) {
            e = e2;
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            declaredMethod = null;
            method3 = null;
            method2 = null;
            method = null;
            constructor = null;
            cls = null;
            f1653b = constructor;
            f1652a = cls;
            f1654c = method;
            f1655d = method2;
            f1656e = method3;
            f1657f = method4;
            f1658g = declaredMethod;
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            declaredMethod = null;
            method3 = null;
            method2 = null;
            method = null;
            constructor = null;
            cls = null;
            f1653b = constructor;
            f1652a = cls;
            f1654c = method;
            f1655d = method2;
            f1656e = method3;
            f1657f = method4;
            f1658g = declaredMethod;
        }
        f1653b = constructor;
        f1652a = cls;
        f1654c = method;
        f1655d = method2;
        f1656e = method3;
        f1657f = method4;
        f1658g = declaredMethod;
    }
}
