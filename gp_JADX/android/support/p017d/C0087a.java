package android.support.p017d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class C0087a {
    public static final Set f415a = new HashSet();
    public static final boolean f416b = C0087a.m189a(System.getProperty("java.vm.version"));

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m186a(android.content.Context r9) {
        /*
        r0 = "MultiDex";
        r1 = "install";
        android.util.Log.i(r0, r1);
        r0 = f416b;
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r0 = "MultiDex";
        r1 = "VM has multidex support, MultiDex support library is disabled.";
        android.util.Log.i(r0, r1);
    L_0x0012:
        return;
    L_0x0013:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 4;
        if (r0 >= r1) goto L_0x0035;
    L_0x0018:
        r0 = new java.lang.RuntimeException;
        r1 = new java.lang.StringBuilder;
        r2 = "Multi dex installation failed. SDK ";
        r1.<init>(r2);
        r2 = android.os.Build.VERSION.SDK_INT;
        r1 = r1.append(r2);
        r2 = " is unsupported. Min SDK version is 4.";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0035:
        r0 = android.support.p017d.C0087a.m190b(r9);	 Catch:{ Exception -> 0x004d }
        if (r0 == 0) goto L_0x0012;
    L_0x003b:
        r3 = f415a;	 Catch:{ Exception -> 0x004d }
        monitor-enter(r3);	 Catch:{ Exception -> 0x004d }
        r1 = r0.sourceDir;	 Catch:{ all -> 0x004a }
        r2 = f415a;	 Catch:{ all -> 0x004a }
        r2 = r2.contains(r1);	 Catch:{ all -> 0x004a }
        if (r2 == 0) goto L_0x0074;
    L_0x0048:
        monitor-exit(r3);	 Catch:{ all -> 0x004a }
        goto L_0x0012;
    L_0x004a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x004a }
        throw r0;	 Catch:{ Exception -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        r1 = "MultiDex";
        r2 = "Multidex installation failure";
        android.util.Log.e(r1, r2, r0);
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "Multi dex installation failed (";
        r2.<init>(r3);
        r0 = r0.getMessage();
        r0 = r2.append(r0);
        r2 = ").";
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0074:
        r2 = f415a;	 Catch:{ all -> 0x004a }
        r2.add(r1);	 Catch:{ all -> 0x004a }
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x004a }
        r2 = 20;
        if (r1 <= r2) goto L_0x00ab;
    L_0x007f:
        r1 = "MultiDex";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004a }
        r4 = "MultiDex is not guaranteed to work in SDK version ";
        r2.<init>(r4);	 Catch:{ all -> 0x004a }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x004a }
        r2 = r2.append(r4);	 Catch:{ all -> 0x004a }
        r4 = ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"";
        r2 = r2.append(r4);	 Catch:{ all -> 0x004a }
        r4 = "java.vm.version";
        r4 = java.lang.System.getProperty(r4);	 Catch:{ all -> 0x004a }
        r2 = r2.append(r4);	 Catch:{ all -> 0x004a }
        r4 = "\"";
        r2 = r2.append(r4);	 Catch:{ all -> 0x004a }
        r2 = r2.toString();	 Catch:{ all -> 0x004a }
        android.util.Log.w(r1, r2);	 Catch:{ all -> 0x004a }
    L_0x00ab:
        r1 = r9.getClassLoader();	 Catch:{ RuntimeException -> 0x00bb }
        if (r1 != 0) goto L_0x00c6;
    L_0x00b1:
        r0 = "MultiDex";
        r1 = "Context class loader is null. Must be running in test mode. Skip patching.";
        android.util.Log.e(r0, r1);	 Catch:{ all -> 0x004a }
        monitor-exit(r3);	 Catch:{ all -> 0x004a }
        goto L_0x0012;
    L_0x00bb:
        r0 = move-exception;
        r1 = "MultiDex";
        r2 = "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.";
        android.util.Log.w(r1, r2, r0);	 Catch:{ all -> 0x004a }
        monitor-exit(r3);	 Catch:{ all -> 0x004a }
        goto L_0x0012;
    L_0x00c6:
        android.support.p017d.C0087a.m191c(r9);	 Catch:{ Throwable -> 0x00ea }
    L_0x00c9:
        r2 = android.support.p017d.C0087a.m183a(r9, r0);	 Catch:{ all -> 0x004a }
        r0 = android.support.p017d.C0090d.m196a(r9, r0, r2);	 Catch:{ all -> 0x004a }
        r4 = r0.isEmpty();	 Catch:{ all -> 0x004a }
        if (r4 != 0) goto L_0x00e0;
    L_0x00d7:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x004a }
        r5 = 19;
        if (r4 < r5) goto L_0x00f3;
    L_0x00dd:
        android.support.p017d.C0088b.m192a(r1, r0, r2);	 Catch:{ all -> 0x004a }
    L_0x00e0:
        monitor-exit(r3);	 Catch:{ all -> 0x004a }
        r0 = "MultiDex";
        r1 = "install done";
        android.util.Log.i(r0, r1);
        goto L_0x0012;
    L_0x00ea:
        r2 = move-exception;
        r4 = "MultiDex";
        r5 = "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.";
        android.util.Log.w(r4, r5, r2);	 Catch:{ all -> 0x004a }
        goto L_0x00c9;
    L_0x00f3:
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x004a }
        r5 = 14;
        if (r4 < r5) goto L_0x015d;
    L_0x00f9:
        r4 = "pathList";
        r4 = android.support.p017d.C0087a.m184a(r1, r4);	 Catch:{ all -> 0x004a }
        r4 = r4.get(r1);	 Catch:{ all -> 0x004a }
        r1 = "dexElements";
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x004a }
        r5.<init>(r0);	 Catch:{ all -> 0x004a }
        r0 = "makeDexElements";
        r6 = 2;
        r6 = new java.lang.Class[r6];	 Catch:{ all -> 0x004a }
        r7 = 0;
        r8 = java.util.ArrayList.class;
        r6[r7] = r8;	 Catch:{ all -> 0x004a }
        r7 = 1;
        r8 = java.io.File.class;
        r6[r7] = r8;	 Catch:{ all -> 0x004a }
        r0 = android.support.p017d.C0087a.m185a(r4, r0, r6);	 Catch:{ all -> 0x004a }
        r6 = 2;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x004a }
        r7 = 0;
        r6[r7] = r5;	 Catch:{ all -> 0x004a }
        r5 = 1;
        r6[r5] = r2;	 Catch:{ all -> 0x004a }
        r0 = r0.invoke(r4, r6);	 Catch:{ all -> 0x004a }
        r0 = (java.lang.Object[]) r0;	 Catch:{ all -> 0x004a }
        r0 = (java.lang.Object[]) r0;	 Catch:{ all -> 0x004a }
        r5 = android.support.p017d.C0087a.m184a(r4, r1);	 Catch:{ all -> 0x004a }
        r1 = r5.get(r4);	 Catch:{ all -> 0x004a }
        r1 = (java.lang.Object[]) r1;	 Catch:{ all -> 0x004a }
        r1 = (java.lang.Object[]) r1;	 Catch:{ all -> 0x004a }
        r2 = r1.getClass();	 Catch:{ all -> 0x004a }
        r2 = r2.getComponentType();	 Catch:{ all -> 0x004a }
        r6 = r1.length;	 Catch:{ all -> 0x004a }
        r7 = r0.length;	 Catch:{ all -> 0x004a }
        r6 = r6 + r7;
        r2 = java.lang.reflect.Array.newInstance(r2, r6);	 Catch:{ all -> 0x004a }
        r2 = (java.lang.Object[]) r2;	 Catch:{ all -> 0x004a }
        r2 = (java.lang.Object[]) r2;	 Catch:{ all -> 0x004a }
        r6 = 0;
        r7 = 0;
        r8 = r1.length;	 Catch:{ all -> 0x004a }
        java.lang.System.arraycopy(r1, r6, r2, r7, r8);	 Catch:{ all -> 0x004a }
        r6 = 0;
        r1 = r1.length;	 Catch:{ all -> 0x004a }
        r7 = r0.length;	 Catch:{ all -> 0x004a }
        java.lang.System.arraycopy(r0, r6, r2, r1, r7);	 Catch:{ all -> 0x004a }
        r5.set(r4, r2);	 Catch:{ all -> 0x004a }
        goto L_0x00e0;
    L_0x015d:
        android.support.p017d.C0089c.m193a(r1, r0);	 Catch:{ all -> 0x004a }
        goto L_0x00e0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.d.a.a(android.content.Context):void");
    }

    private static ApplicationInfo m190b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (Throwable e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    private static boolean m189a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
        Log.i("MultiDex", "VM with version " + str + (z ? " has multidex support" : " does not have multidex support"));
        return z;
    }

    static Field m184a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    static Method m185a(Object obj, String str, Class... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException e) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    static void m188a(Object obj, String str, Object[] objArr) {
        Field a = C0087a.m184a(obj, str);
        Object[] objArr2 = (Object[]) a.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        a.set(obj, objArr3);
    }

    private static void m191c(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file.getPath() + ").");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (file2.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file2.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file2.getPath());
                }
            }
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old secondary dex dir " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file.getPath());
            }
        }
    }

    private static File m183a(Context context, ApplicationInfo applicationInfo) {
        File file = new File(applicationInfo.dataDir, "code_cache");
        try {
            C0087a.m187a(file);
        } catch (IOException e) {
            file = new File(context.getFilesDir(), "code_cache");
            C0087a.m187a(file);
        }
        File file2 = new File(file, "secondary-dexes");
        C0087a.m187a(file2);
        return file2;
    }

    private static void m187a(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Log.e("MultiDex", "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }
}
