package android.support.v7.app;

import android.content.res.Resources;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

final class bi {
    public static Field f2356a;
    public static boolean f2357b;
    public static Class f2358c;
    public static boolean f2359d;
    public static Field f2360e;
    public static boolean f2361f;
    public static Field f2362g;
    public static boolean f2363h;

    static boolean m2492a(Resources resources) {
        if (!f2357b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2356a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2357b = true;
        }
        if (f2356a != null) {
            Map map;
            try {
                map = (Map) f2356a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    static boolean m2494b(Resources resources) {
        Object obj;
        if (!f2357b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f2356a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f2357b = true;
        }
        if (f2356a != null) {
            try {
                obj = f2356a.get(resources);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (obj == null && obj != null && m2493a(obj)) {
                return true;
            }
            return false;
        }
        obj = null;
        if (obj == null) {
            return false;
        }
        return true;
    }

    static boolean m2495c(Resources resources) {
        if (!f2363h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f2362g = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f2363h = true;
        }
        if (f2362g == null) {
            return false;
        }
        Object obj;
        try {
            obj = f2362g.get(resources);
        } catch (Throwable e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        Object obj2;
        if (!f2357b) {
            try {
                declaredField = obj.getClass().getDeclaredField("mDrawableCache");
                f2356a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e22) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e22);
            }
            f2357b = true;
        }
        if (f2356a != null) {
            try {
                obj2 = f2356a.get(obj);
            } catch (Throwable e222) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e222);
            }
            if (obj2 == null && m2493a(obj2)) {
                return true;
            }
        }
        obj2 = null;
        return obj2 == null ? false : false;
    }

    private static boolean m2493a(Object obj) {
        if (!f2359d) {
            try {
                f2358c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (Throwable e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f2359d = true;
        }
        if (f2358c == null) {
            return false;
        }
        if (!f2361f) {
            try {
                Field declaredField = f2358c.getDeclaredField("mUnthemedEntries");
                f2360e = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f2361f = true;
        }
        if (f2360e == null) {
            return false;
        }
        LongSparseArray longSparseArray;
        try {
            longSparseArray = (LongSparseArray) f2360e.get(obj);
        } catch (Throwable e22) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e22);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }
}
