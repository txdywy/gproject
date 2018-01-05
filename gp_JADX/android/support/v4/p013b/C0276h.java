package android.support.v4.p013b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.p028a.p029a.C0203c;
import android.support.v4.p028a.p029a.C0204d;
import android.support.v4.p035f.C0295h;
import android.support.v4.p037h.C0304u;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

final class C0276h extends C0274j {
    public static final Class f1648a;
    public static final Constructor f1649b;
    public static final Method f1650c;
    public static final Method f1651d;

    C0276h() {
    }

    private static Object m1572a() {
        Throwable e;
        try {
            return f1649b.newInstance(new Object[0]);
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

    private static boolean m1573a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        Throwable e;
        try {
            return ((Boolean) f1650c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    private static Typeface m1571a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(f1648a, 1), 0, obj);
            return (Typeface) f1651d.invoke(null, new Object[]{r0});
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public final Typeface mo368a(Context context, C0295h[] c0295hArr, int i) {
        Object a = C0276h.m1572a();
        C0304u c0304u = new C0304u();
        for (C0295h c0295h : c0295hArr) {
            Uri uri = c0295h.f1680a;
            ByteBuffer byteBuffer = (ByteBuffer) c0304u.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0281n.m1594a(context, uri);
                c0304u.put(uri, byteBuffer);
            }
            if (!C0276h.m1573a(a, byteBuffer, c0295h.f1681b, c0295h.f1682c, c0295h.f1683d)) {
                return null;
            }
        }
        return Typeface.create(C0276h.m1571a(a), i);
    }

    public final Typeface mo367a(Context context, C0203c c0203c, Resources resources, int i) {
        Object a = C0276h.m1572a();
        for (C0204d c0204d : c0203c.f1179a) {
            ByteBuffer a2 = C0281n.m1593a(context, resources, c0204d.f1183d);
            if (a2 == null || !C0276h.m1573a(a, a2, 0, c0204d.f1181b, c0204d.f1182c)) {
                return null;
            }
        }
        return C0276h.m1571a(a);
    }

    static {
        Method method;
        Constructor constructor;
        Class cls;
        Throwable e;
        Method method2 = null;
        try {
            Class cls2 = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls2.getConstructor(new Class[0]);
            Method method3 = cls2.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls2, 1).getClass()});
            method2 = method3;
            constructor = constructor2;
            cls = cls2;
        } catch (ClassNotFoundException e2) {
            e = e2;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            constructor = null;
            cls = null;
            f1649b = constructor;
            f1648a = cls;
            f1650c = method2;
            f1651d = method;
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            constructor = null;
            cls = null;
            f1649b = constructor;
            f1648a = cls;
            f1650c = method2;
            f1651d = method;
        }
        f1649b = constructor;
        f1648a = cls;
        f1650c = method2;
        f1651d = method;
    }
}
