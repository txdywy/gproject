package org.chromium.net;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class C7935i {
    public static final String f40678a = C7935i.class.getSimpleName();
    public final Context f40679b;

    public C7935i(Context context) {
        this.f40679b = context;
    }

    public abstract C7932f mo6605a();

    public abstract String mo6606b();

    public abstract String mo6607c();

    public abstract boolean mo6608d();

    public String toString() {
        return "[class=" + getClass().getName() + ", name=" + mo6606b() + ", version=" + mo6607c() + ", enabled=" + mo6608d() + "]";
    }

    public static List m37981a(Context context) {
        List arrayList = new ArrayList();
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        if (identifier != 0) {
            String string = context.getResources().getString(identifier);
            if (!C7935i.m37983a(context, string, arrayList, true)) {
                throw new RuntimeException("Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        C7935i.m37983a(context, "org.chromium.net.impl.NativeCronetProvider", arrayList, false);
        C7935i.m37983a(context, "org.chromium.net.impl.JavaCronetProvider", arrayList, false);
        return arrayList;
    }

    private static boolean m37983a(Context context, String str, List list, boolean z) {
        try {
            list.add((C7935i) context.getClassLoader().loadClass(str).asSubclass(C7935i.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
            return true;
        } catch (Exception e) {
            C7935i.m37982a(str, z, e);
            return false;
        } catch (Exception e2) {
            C7935i.m37982a(str, z, e2);
            return false;
        } catch (Exception e22) {
            C7935i.m37982a(str, z, e22);
            return false;
        } catch (Exception e222) {
            C7935i.m37982a(str, z, e222);
            return false;
        } catch (Exception e2222) {
            C7935i.m37982a(str, z, e2222);
            return false;
        }
    }

    private static void m37982a(String str, boolean z, Exception exception) {
        if (z) {
            Log.e(f40678a, "Unable to load provider class: " + str, exception);
        } else {
            Log.d(f40678a, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }
}
