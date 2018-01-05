package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

public final class C6187g {
    public static ArrayList m28526a(Context context) {
        return C6187g.m28527a(C6187g.m28523a(context.getApplicationContext(), "third_party_license_metadata", 0, -1), "");
    }

    static ArrayList m28527a(String str, String str2) {
        String[] split = str.split("\n");
        Object arrayList = new ArrayList(split.length);
        for (String str3 : split) {
            int indexOf = str3.indexOf(32);
            String[] split2 = str3.substring(0, indexOf).split(":");
            boolean z = split2.length == 2 && indexOf > 0;
            String str4 = "Invalid license meta-data line:\n";
            String valueOf = String.valueOf(str3);
            C5916a.m27411b(z, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            arrayList.add(new License(str3.substring(indexOf + 1), Long.parseLong(split2[0]), Integer.parseInt(split2[1]), str2));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String m28522a(Context context, License license) {
        long j = license.f30714b;
        int i = license.f30715c;
        String str = license.f30716d;
        if (str.isEmpty()) {
            return C6187g.m28523a(context, "third_party_licenses", j, i);
        }
        String a = C6187g.m28525a("res/raw/third_party_licenses", str, j, i);
        if (a != null) {
            return a;
        }
        throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 46).append(str).append(" does not contain res/raw/third_party_licenses").toString());
    }

    private static String m28523a(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        return C6187g.m28524a(resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(C6188h.dummy_placeholder))), j, i);
    }

    static String m28525a(String str, String str2, long j, int i) {
        Throwable e;
        Throwable th;
        String str3 = null;
        JarFile jarFile;
        try {
            jarFile = new JarFile(str2);
            try {
                ZipEntry jarEntry = jarFile.getJarEntry(str);
                if (jarEntry == null) {
                    try {
                        jarFile.close();
                    } catch (IOException e2) {
                    }
                } else {
                    str3 = C6187g.m28524a(jarFile.getInputStream(jarEntry), j, i);
                    try {
                        jarFile.close();
                    } catch (IOException e3) {
                    }
                }
                return str3;
            } catch (IOException e4) {
                e = e4;
                try {
                    throw new RuntimeException("Failed to read license text.", e);
                } catch (Throwable th2) {
                    e = th2;
                    if (jarFile != null) {
                        try {
                            jarFile.close();
                        } catch (IOException e5) {
                        }
                    }
                    throw e;
                }
            }
        } catch (Throwable e6) {
            th = e6;
            jarFile = null;
            e = th;
            throw new RuntimeException("Failed to read license text.", e);
        } catch (Throwable e62) {
            th = e62;
            jarFile = null;
            e = th;
            if (jarFile != null) {
                jarFile.close();
            }
            throw e;
        }
    }

    private static String m28524a(InputStream inputStream, long j, int i) {
        byte[] bArr = new byte[MemoryMappedFileBuffer.DEFAULT_PADDING];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int read = inputStream.read(bArr, 0, Math.min(i, MemoryMappedFileBuffer.DEFAULT_PADDING));
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
                i -= read;
            }
            inputStream.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (Throwable e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (Throwable e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }
}
