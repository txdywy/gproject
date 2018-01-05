package com.google.p169b.p170a.p171a.p172a.p173a.p174a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.google.b.a.a.a.a.a.a;
import com.google.common.p416c.C6967b;
import com.google.common.p416c.C6971f;
import com.google.p169b.p170a.p171a.p172a.p173a.ac;
import com.google.p169b.p170a.p171a.p172a.p173a.ad;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class C6890b {
    public static final String f34012c = Locale.ENGLISH.getLanguage();
    public final Map f34013a = new HashMap();
    public final a f34014b;

    public C6890b(Context context, a aVar) {
        this.f34014b = aVar;
        m31277a(context);
    }

    final synchronized Pair m31277a(Context context) {
        Pair pair;
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        Resources resources = context2.getResources();
        Configuration configuration = resources.getConfiguration();
        String a = C6890b.m31268a(configuration);
        pair = (Pair) this.f34013a.get(a);
        if (pair != null) {
            if (!((Resources) pair.second).getConfiguration().equals(configuration)) {
                Pair pair2 = new Pair((AssetManager) pair.first, new Resources((AssetManager) pair.first, resources.getDisplayMetrics(), configuration));
                this.f34013a.put(a, pair2);
                pair = pair2;
            }
        } else if (C6890b.m31275a(resources, a)) {
            pair = m31265a(context2, configuration, resources.getDisplayMetrics(), resources, context2.getPackageCodePath());
        } else {
            pair = new Pair(resources.getAssets(), resources);
            this.f34013a.put(a, pair);
        }
        return pair;
    }

    private final synchronized Pair m31265a(Context context, Configuration configuration, DisplayMetrics displayMetrics, Resources resources, String str) {
        Pair pair;
        Throwable e;
        long currentTimeMillis = System.currentTimeMillis();
        String a = C6890b.m31268a(configuration);
        String str2 = "FilteredResourcesHelper";
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str2);
        }
        try {
            AssetManager assetManager = (AssetManager) AssetManager.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            C6890b.m31272a(assetManager, str);
            if (C6890b.m31275a(resources, a)) {
                C6890b.m31274a(context, assetManager, resources, a, this.f34014b);
            }
            pair = new Pair(assetManager, new Resources(assetManager, displayMetrics, configuration));
            this.f34013a.put(a, pair);
            C6890b.m31270a();
            System.setProperty("FilteredResourceHelper.initializationDurationMillis", Long.toString(System.currentTimeMillis() - currentTimeMillis));
        } catch (IllegalAccessException e2) {
            e = e2;
            try {
                C6890b.m31271a(context, C6890b.m31267a(context, a, str), -1, null);
                throw new RuntimeException("AssetManager-twiddling failed", e);
            } catch (Throwable th) {
                C6890b.m31270a();
                System.setProperty("FilteredResourceHelper.initializationDurationMillis", Long.toString(System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (InvocationTargetException e3) {
            e = e3;
            C6890b.m31271a(context, C6890b.m31267a(context, a, str), -1, null);
            throw new RuntimeException("AssetManager-twiddling failed", e);
        } catch (InstantiationException e4) {
            e = e4;
            C6890b.m31271a(context, C6890b.m31267a(context, a, str), -1, null);
            throw new RuntimeException("AssetManager-twiddling failed", e);
        } catch (NoSuchMethodException e5) {
            e = e5;
            C6890b.m31271a(context, C6890b.m31267a(context, a, str), -1, null);
            throw new RuntimeException("AssetManager-twiddling failed", e);
        }
        return pair;
    }

    private static boolean m31274a(Context context, AssetManager assetManager, Resources resources, String str, a aVar) {
        String valueOf;
        String stringBuilder;
        if (C6890b.m31275a(resources, str)) {
            valueOf = String.valueOf(context.getFilesDir());
            File file = new File(new StringBuilder(String.valueOf(valueOf).length()).append(valueOf).toString(), C6890b.m31266a(context, str));
            Object obj = (!file.exists() || file.lastModified() < new File(context.getPackageCodePath()).lastModified()) ? null : 1;
            String valueOf2;
            if (obj != null) {
                valueOf = C6890b.m31266a(context, str);
                valueOf2 = String.valueOf(context.getFilesDir());
                C6890b.m31272a(assetManager, new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf).length()).append(valueOf2).append("/").append(valueOf).toString());
                return false;
            }
            try {
                valueOf = context.getPackageCodePath();
                valueOf2 = String.valueOf(context.getFilesDir());
                stringBuilder = new StringBuilder(String.valueOf(valueOf2).length()).append(valueOf2).toString();
                String a = C6890b.m31267a(context, str, valueOf);
                if (!new File(stringBuilder, a).exists()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    File file2 = new File(stringBuilder, a);
                    String stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 16).append(a).append(".").append(Process.myPid()).append(".tmp").toString();
                    OutputStream c6971f = new C6971f(new BufferedOutputStream(context.openFileOutput(stringBuilder2, 0)));
                    ZipOutputStream zipOutputStream = new ZipOutputStream(c6971f);
                    InputStream open = assetManager.open("AndroidManifest.xml");
                    byte[] a2 = C6967b.m31819a(open);
                    open.close();
                    ZipEntry zipEntry = new ZipEntry("AndroidManifest.xml");
                    CRC32 crc32 = new CRC32();
                    crc32.update(a2);
                    zipEntry.setMethod(0);
                    zipEntry.setSize((long) a2.length);
                    zipEntry.setTime(0);
                    zipEntry.setCrc(crc32.getValue());
                    C6890b.m31273a(zipEntry, c6971f.f34363a);
                    zipOutputStream.putNextEntry(zipEntry);
                    zipOutputStream.write(a2);
                    zipOutputStream.closeEntry();
                    open = assetManager.open("metaresources.arsc");
                    InputStream bufferedInputStream = new BufferedInputStream(open);
                    ac acVar = new ac();
                    a2 = ac.m31305a(new DataInputStream(bufferedInputStream), ad.m31312a(new Locale(str).getLanguage()));
                    if (a2 == null) {
                        stringBuilder = "Did not have specifier language ";
                        valueOf = String.valueOf(str);
                        if (valueOf.length() != 0) {
                            valueOf = stringBuilder.concat(valueOf);
                        } else {
                            valueOf = new String(stringBuilder);
                        }
                        throw new RuntimeException(valueOf);
                    }
                    crc32 = new CRC32();
                    crc32.update(a2);
                    ZipEntry zipEntry2 = new ZipEntry("resources.arsc");
                    zipEntry2.setMethod(0);
                    zipEntry2.setSize((long) a2.length);
                    zipEntry2.setTime(0);
                    zipEntry2.setCrc(crc32.getValue());
                    C6890b.m31273a(zipEntry2, c6971f.f34363a);
                    zipOutputStream.putNextEntry(zipEntry2);
                    zipOutputStream.write(a2);
                    zipOutputStream.closeEntry();
                    open.close();
                    zipOutputStream.close();
                    File file3 = new File(stringBuilder, stringBuilder2);
                    long lastModified = valueOf != null ? new File(valueOf).lastModified() : 0;
                    if (lastModified != 0) {
                        file3.setLastModified(lastModified);
                    }
                    if (!file3.renameTo(file2)) {
                        if (file2.exists()) {
                            context.deleteFile(stringBuilder2);
                        } else {
                            throw new IOException("Failed to rename resources");
                        }
                    }
                    if (aVar != null) {
                        aVar.a(SystemClock.elapsedRealtime() - elapsedRealtime, str);
                    }
                }
                C6890b.m31272a(assetManager, new StringBuilder((String.valueOf(stringBuilder).length() + 1) + String.valueOf(a).length()).append(stringBuilder).append("/").append(a).toString());
                return true;
            } catch (Throwable e) {
                C6890b.m31271a(context, "locale-filtered-resources-", -1, null);
                throw new RuntimeException("AssetManager-twiddling failed", e);
            }
        }
        stringBuilder = "Does not have compressed data for language: ";
        valueOf = String.valueOf(str);
        throw new RuntimeException(valueOf.length() != 0 ? stringBuilder.concat(valueOf) : new String(stringBuilder));
    }

    private static String m31266a(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return new StringBuilder(String.valueOf(str).length() + 42).append("locale-filtered-resources-").append(((packageInfo.versionName == null ? "noversion" : packageInfo.versionName).hashCode() * 31) + packageInfo.versionCode).append("-").append(str).append(".zip").toString();
        } catch (Throwable e) {
            throw new RuntimeException("Failed to find our own package", e);
        }
    }

    private static boolean m31275a(Resources resources, String str) {
        String a = C6890b.m31269a(str);
        if (C6890b.m31276b(a)) {
            boolean z;
            int identifier = resources.getIdentifier("languages_for_extraction", "string", "FFFFFFFFFFFFFFFFFFFFFF");
            if (identifier != 0) {
                for (String locale : resources.getString(identifier).split(",")) {
                    if (C6890b.m31269a(new Locale(locale).getLanguage()).equals(a)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static String m31267a(Context context, String str, String str2) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            int hashCode = ((packageInfo.versionName == null ? "noversion" : packageInfo.versionName).hashCode() * 31) + packageInfo.versionCode;
            String stringBuilder = new StringBuilder(String.valueOf(str).length() + 42).append("locale-filtered-resources-").append(hashCode).append("-").append(str).append(".zip").toString();
            C6890b.m31271a(context, "locale-filtered-resources-", hashCode, str2);
            return stringBuilder;
        } catch (Throwable e) {
            throw new RuntimeException("Failed to find our own package", e);
        }
    }

    private static String m31269a(String str) {
        if ("fil".equals(str)) {
            return "tl";
        }
        return str;
    }

    private static void m31273a(ZipEntry zipEntry, long j) {
        Object extra = zipEntry.getExtra() == null ? new byte[0] : zipEntry.getExtra();
        long length = (((30 + ((long) zipEntry.getName().length())) + ((long) extra.length)) + j) % 8;
        if (length != 0) {
            Object obj = new byte[((int) ((8 - length) + ((long) extra.length)))];
            System.arraycopy(extra, 0, obj, 0, extra.length);
            zipEntry.setExtra(obj);
        }
    }

    private static void m31272a(AssetManager assetManager, String str) {
        Throwable e;
        String str2;
        String valueOf;
        try {
            Object invoke = AssetManager.class.getDeclaredMethod("addAssetPath", new Class[]{String.class}).invoke(assetManager, new Object[]{str});
            if (invoke == null || !(invoke instanceof Integer) || ((Integer) invoke).intValue() == 0) {
                valueOf = String.valueOf(invoke);
                throw new RuntimeException(new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(str).length()).append("addAssetPath failed: ").append(valueOf).append(" for ").append(str).toString());
            }
        } catch (NoSuchMethodException e2) {
            e = e2;
            str2 = "addAssetPath failed:  for ";
            valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (IllegalAccessException e3) {
            e = e3;
            str2 = "addAssetPath failed:  for ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        } catch (InvocationTargetException e4) {
            e = e4;
            str2 = "addAssetPath failed:  for ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
            }
            throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
        }
    }

    private static void m31271a(Context context, String str, int i, String str2) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            long lastModified = str2 == null ? Long.MAX_VALUE : new File(str2).lastModified();
            String stringBuilder = new StringBuilder(String.valueOf(str).length() + 12).append(str).append(i).append("-").toString();
            for (String str3 : context.fileList()) {
                if (str3.startsWith(str)) {
                    if (!str3.startsWith(stringBuilder)) {
                        context.deleteFile(str3);
                    } else if (new File(filesDir, str3).lastModified() < lastModified) {
                        context.deleteFile(str3);
                    }
                }
            }
        }
    }

    private static boolean m31276b(String str) {
        return (str.length() == 2 || str.length() == 3) && !str.equals(f34012c);
    }

    private static String m31268a(Configuration configuration) {
        Object obj = (configuration.locale == null || !C6890b.m31276b(configuration.locale.getLanguage())) ? null : 1;
        if (obj != null) {
            return C6890b.m31269a(configuration.locale.getLanguage());
        }
        return "default";
    }

    private static void m31270a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
