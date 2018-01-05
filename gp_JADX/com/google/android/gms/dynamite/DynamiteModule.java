package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5164d;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static Boolean f26108a;
    public static C5179n f26109b;
    public static C5181p f26110c;
    public static String f26111d;
    public static final ThreadLocal f26112e = new ThreadLocal();
    public static final C5167l f26113f = new C5170d();
    public static final C5169c f26114g = new C5171e();
    public static final C5169c f26115h = new C5174h();
    public final Context f26116i;

    @DynamiteApi
    public class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public final class zzc extends Exception {
        zzc(String str) {
            super(str);
        }

        zzc(String str, Throwable th) {
            super(str, th);
        }
    }

    static {
        C5172f c5172f = new C5172f();
        C5173g c5173g = new C5173g();
        C5175i c5175i = new C5175i();
        C5176j c5176j = new C5176j();
    }

    private DynamiteModule(Context context) {
        this.f26116i = (Context) am.m23733a((Object) context);
    }

    public static int m23910a(Context context, String str) {
        String str2;
        String str3;
        try {
            str2 = "com.google.android.gms.dynamite.descriptors.";
            str3 = "ModuleDescriptor";
            Class loadClass = context.getApplicationContext().getClassLoader().loadClass(new StringBuilder(((String.valueOf(str2).length() + 1) + String.valueOf(str).length()) + String.valueOf(str3).length()).append(str2).append(str).append(".").append(str3).toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            str2 = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", new StringBuilder((String.valueOf(str2).length() + 51) + String.valueOf(str).length()).append("Module descriptor id '").append(str2).append("' didn't match expected id '").append(str).append("'").toString());
            return 0;
        } catch (ClassNotFoundException e) {
            Log.w("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 45).append("Local module descriptor class for ").append(str).append(" not found.").toString());
            return 0;
        } catch (Exception e2) {
            str2 = "DynamiteModule";
            str3 = "Failed to load module descriptor class: ";
            String valueOf = String.valueOf(e2.getMessage());
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    public static int m23911a(Context context, String str, boolean z) {
        Object e;
        synchronized (DynamiteModule.class) {
            Boolean bool = f26108a;
            if (bool == null) {
                try {
                    Class loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                    Field declaredField = loadClass.getDeclaredField("sClassLoader");
                    synchronized (loadClass) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader != null) {
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    m23916a(classLoader);
                                } catch (zzc e2) {
                                }
                                bool = Boolean.TRUE;
                            }
                        } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                int c = m23920c(context, str, z);
                                if (f26111d == null || f26111d.isEmpty()) {
                                    return c;
                                }
                                ClassLoader c5177k = new C5177k(f26111d, ClassLoader.getSystemClassLoader());
                                m23916a(c5177k);
                                declaredField.set(null, c5177k);
                                f26108a = Boolean.TRUE;
                                return c;
                            } catch (zzc e3) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                                f26108a = bool;
                                if (!bool.booleanValue()) {
                                    try {
                                    } catch (zzc e4) {
                                        String str2 = "DynamiteModule";
                                        String str3 = "Failed to retrieve remote module version: ";
                                        String valueOf = String.valueOf(e4.getMessage());
                                        Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                } catch (ClassNotFoundException e5) {
                    e = e5;
                } catch (IllegalAccessException e6) {
                    e = e6;
                } catch (NoSuchFieldException e7) {
                    e = e7;
                }
            }
        }
        valueOf = String.valueOf(e);
        Log.w("DynamiteModule", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Failed to load module via V2: ").append(valueOf).toString());
        bool = Boolean.FALSE;
        f26108a = bool;
        return !bool.booleanValue() ? m23918b(context, str, z) : m23920c(context, str, z);
    }

    private static Context m23912a(Context context, String str, int i, Cursor cursor, C5181p c5181p) {
        try {
            return (Context) C5164d.m23907a(c5181p.mo4636a(C5164d.m23906a((Object) context), str, i, C5164d.m23906a((Object) cursor)));
        } catch (Exception e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e.toString());
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        }
    }

    public static DynamiteModule m23913a(Context context, C5169c c5169c, String str) {
        C5178m a;
        C5166a c5166a = (C5166a) f26112e.get();
        C5166a c5166a2 = new C5166a();
        f26112e.set(c5166a2);
        DynamiteModule c;
        try {
            a = c5169c.mo4633a(context, str, f26113f);
            Log.i("DynamiteModule", new StringBuilder((String.valueOf(str).length() + 68) + String.valueOf(str).length()).append("Considering local module ").append(str).append(":").append(a.f26119a).append(" and remote module ").append(str).append(":").append(a.f26120b).toString());
            if (a.f26121c == 0 || ((a.f26121c == -1 && a.f26119a == 0) || (a.f26121c == 1 && a.f26120b == 0))) {
                throw new zzc("No acceptable module found. Local version is " + a.f26119a + " and remote version is " + a.f26120b + ".");
            } else if (a.f26121c == -1) {
                c = m23921c(context, str);
                if (c5166a2.f26117a != null) {
                    c5166a2.f26117a.close();
                }
                f26112e.set(c5166a);
                return c;
            } else if (a.f26121c == 1) {
                c = m23914a(context, str, a.f26120b);
                if (c5166a2.f26117a != null) {
                    c5166a2.f26117a.close();
                }
                f26112e.set(c5166a);
                return c;
            } else {
                throw new zzc("VersionPolicy returned invalid code:" + a.f26121c);
            }
        } catch (Throwable e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to load remote module: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            if (a.f26119a == 0 || c5169c.mo4633a(context, str, new C5168b(a.f26119a)).f26121c != -1) {
                throw new zzc("Remote load failed. No local fallback found.", e);
            }
            c = m23921c(context, str);
            if (c5166a2.f26117a != null) {
                c5166a2.f26117a.close();
            }
            f26112e.set(c5166a);
            return c;
        } catch (Throwable th) {
            if (c5166a2.f26117a != null) {
                c5166a2.f26117a.close();
            }
            f26112e.set(c5166a);
        }
    }

    public static int m23917b(Context context, String str) {
        return m23911a(context, str, false);
    }

    private static int m23918b(Context context, String str, boolean z) {
        C5179n a = m23915a(context);
        if (a == null) {
            return 0;
        }
        try {
            return a.mo4634a(C5164d.m23906a((Object) context), str, z);
        } catch (RemoteException e) {
            String str2 = "DynamiteModule";
            String str3 = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return 0;
        }
    }

    private static DynamiteModule m23921c(Context context, String str) {
        String str2 = "DynamiteModule";
        String str3 = "Selected local version of ";
        String valueOf = String.valueOf(str);
        Log.i(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static int m23920c(Context context, String str, boolean z) {
        String str2;
        Throwable e;
        Cursor cursor;
        if (z) {
            try {
                str2 = "api_force_staging";
            } catch (Exception e2) {
                e = e2;
                cursor = null;
                try {
                    if (e instanceof zzc) {
                        throw e;
                    }
                    throw new zzc("V2 version check failed", e);
                } catch (Throwable th) {
                    e = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw e;
            }
        }
        str2 = "api";
        String str3 = "content://com.google.android.gms.chimera/";
        cursor = context.getContentResolver().query(Uri.parse(new StringBuilder(((String.valueOf(str3).length() + 1) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(str3).append(str2).append("/").append(str).toString()), null, null, null, null);
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    int i = cursor.getInt(0);
                    if (i > 0) {
                        synchronized (DynamiteModule.class) {
                            f26111d = cursor.getString(2);
                        }
                        C5166a c5166a = (C5166a) f26112e.get();
                        if (c5166a != null && c5166a.f26117a == null) {
                            c5166a.f26117a = cursor;
                            cursor = null;
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return i;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
        throw new zzc("Failed to connect to dynamite module ContentResolver.");
    }

    private static DynamiteModule m23914a(Context context, String str, int i) {
        synchronized (DynamiteModule.class) {
            Boolean bool = f26108a;
        }
        if (bool != null) {
            return bool.booleanValue() ? m23922c(context, str, i) : m23919b(context, str, i);
        } else {
            throw new zzc("Failed to determine which loading route to use.");
        }
    }

    private static DynamiteModule m23919b(Context context, String str, int i) {
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        C5179n a = m23915a(context);
        if (a == null) {
            throw new zzc("Failed to create IDynamiteLoader.");
        }
        try {
            C5161a a2 = a.mo4635a(C5164d.m23906a((Object) context), str, i);
            if (C5164d.m23907a(a2) != null) {
                return new DynamiteModule((Context) C5164d.m23907a(a2));
            }
            throw new zzc("Failed to load remote module.");
        } catch (Throwable e) {
            throw new zzc("Failed to load remote module.", e);
        }
    }

    private static C5179n m23915a(Context context) {
        synchronized (DynamiteModule.class) {
            C5179n c5179n;
            if (f26109b != null) {
                c5179n = f26109b;
                return c5179n;
            } else if (C5095d.m23655a(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        c5179n = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        if (queryLocalInterface instanceof C5179n) {
                            c5179n = (C5179n) queryLocalInterface;
                        } else {
                            Object c5180o = new C5180o(iBinder);
                        }
                    }
                    if (c5179n != null) {
                        f26109b = c5179n;
                        return c5179n;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return null;
                }
            }
        }
    }

    private static DynamiteModule m23922c(Context context, String str, int i) {
        Log.i("DynamiteModule", new StringBuilder(String.valueOf(str).length() + 51).append("Selected remote version of ").append(str).append(", version >= ").append(i).toString());
        synchronized (DynamiteModule.class) {
            C5181p c5181p = f26110c;
        }
        if (c5181p == null) {
            throw new zzc("DynamiteLoaderV2 was not cached.");
        }
        C5166a c5166a = (C5166a) f26112e.get();
        if (c5166a == null || c5166a.f26117a == null) {
            throw new zzc("No result cursor");
        }
        Context a = m23912a(context.getApplicationContext(), str, i, c5166a.f26117a, c5181p);
        if (a != null) {
            return new DynamiteModule(a);
        }
        throw new zzc("Failed to get module context");
    }

    private static void m23916a(ClassLoader classLoader) {
        Throwable e;
        try {
            C5181p c5181p;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c5181p = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof C5181p) {
                    c5181p = (C5181p) queryLocalInterface;
                } else {
                    Object c5182q = new C5182q(iBinder);
                }
            }
            f26110c = c5181p;
        } catch (ClassNotFoundException e2) {
            e = e2;
            throw new zzc("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e3) {
            e = e3;
            throw new zzc("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new zzc("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new zzc("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e6) {
            e = e6;
            throw new zzc("Failed to instantiate dynamite loader", e);
        }
    }

    public final IBinder m23923a(String str) {
        Throwable e;
        String str2;
        String valueOf;
        try {
            return (IBinder) this.f26116i.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException e2) {
            e = e2;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            throw new zzc(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (InstantiationException e3) {
            e = e3;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new zzc(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (IllegalAccessException e4) {
            e = e4;
            str2 = "Failed to instantiate module class: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new zzc(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
    }
}
