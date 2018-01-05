package com.google.android.youtube.player.internal;

import android.os.IBinder;

public final class C6853w {

    public final class C6852a extends Exception {
        public C6852a(String str) {
            super(str);
        }

        public C6852a(String str, Throwable th) {
            super(str, th);
        }
    }

    private static IBinder m31215a(Class cls, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        Throwable th;
        String str;
        String valueOf;
        try {
            return (IBinder) cls.getConstructor(new Class[]{IBinder.class, IBinder.class, IBinder.class, Boolean.TYPE}).newInstance(new Object[]{iBinder, iBinder2, iBinder3, Boolean.valueOf(z)});
        } catch (Throwable e) {
            th = e;
            str = "Could not find the right constructor for ";
            valueOf = String.valueOf(cls.getName());
            throw new C6852a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        } catch (Throwable e2) {
            th = e2;
            str = "Exception thrown by invoked constructor in ";
            valueOf = String.valueOf(cls.getName());
            throw new C6852a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        } catch (Throwable e22) {
            th = e22;
            str = "Unable to instantiate the dynamic class ";
            valueOf = String.valueOf(cls.getName());
            throw new C6852a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        } catch (Throwable e222) {
            th = e222;
            str = "Unable to call the default constructor of ";
            valueOf = String.valueOf(cls.getName());
            throw new C6852a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    static IBinder m31216a(ClassLoader classLoader, String str, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, boolean z) {
        try {
            return C6853w.m31215a(classLoader.loadClass(str), iBinder, iBinder2, iBinder3, z);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Unable to find dynamic class ";
            String valueOf = String.valueOf(str);
            throw new C6852a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }
}
