package android.support.v4.p013b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.util.Log;
import com.google.c.a.a.a.a.a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public final class C0281n {
    public static File m1592a(Context context) {
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(context.getCacheDir(), str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException e) {
            }
        }
        return null;
    }

    private static ByteBuffer m1595a(File file) {
        Throwable th;
        try {
            Throwable th2;
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                ByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th22) {
                Throwable th3 = th22;
                th22 = th;
                th = th3;
            }
            if (th22 != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th4) {
                    a.a(th22, th4);
                }
            } else {
                fileInputStream.close();
            }
            throw th;
            throw th;
        } catch (IOException e) {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m1594a(android.content.Context r10, android.net.Uri r11) {
        /*
        r6 = 0;
        r0 = r10.getContentResolver();
        r1 = "r";
        r2 = 0;
        r7 = r0.openFileDescriptor(r11, r1, r2);	 Catch:{ IOException -> 0x0048 }
        r8 = new java.io.FileInputStream;	 Catch:{ Throwable -> 0x003a, all -> 0x0050 }
        r0 = r7.getFileDescriptor();	 Catch:{ Throwable -> 0x003a, all -> 0x0050 }
        r8.<init>(r0);	 Catch:{ Throwable -> 0x003a, all -> 0x0050 }
        r0 = r8.getChannel();	 Catch:{ Throwable -> 0x002e, all -> 0x0060 }
        r4 = r0.size();	 Catch:{ Throwable -> 0x002e, all -> 0x0060 }
        r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ Throwable -> 0x002e, all -> 0x0060 }
        r2 = 0;
        r0 = r0.map(r1, r2, r4);	 Catch:{ Throwable -> 0x002e, all -> 0x0060 }
        r8.close();	 Catch:{ Throwable -> 0x003a, all -> 0x0050 }
        if (r7 == 0) goto L_0x002d;
    L_0x002a:
        r7.close();	 Catch:{ IOException -> 0x0048 }
    L_0x002d:
        return r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0030 }
    L_0x0030:
        r1 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
    L_0x0034:
        if (r1 == 0) goto L_0x0053;
    L_0x0036:
        r8.close();	 Catch:{ Throwable -> 0x004b, all -> 0x0050 }
    L_0x0039:
        throw r0;	 Catch:{ Throwable -> 0x003a, all -> 0x0050 }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r1 = move-exception;
        r9 = r1;
        r1 = r0;
        r0 = r9;
    L_0x0040:
        if (r7 == 0) goto L_0x0047;
    L_0x0042:
        if (r1 == 0) goto L_0x005c;
    L_0x0044:
        r7.close();	 Catch:{ Throwable -> 0x0057 }
    L_0x0047:
        throw r0;	 Catch:{ IOException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        r0 = r6;
        goto L_0x002d;
    L_0x004b:
        r2 = move-exception;
        com.google.c.a.a.a.a.a.a(r1, r2);	 Catch:{ Throwable -> 0x003a, all -> 0x0050 }
        goto L_0x0039;
    L_0x0050:
        r0 = move-exception;
        r1 = r6;
        goto L_0x0040;
    L_0x0053:
        r8.close();	 Catch:{ Throwable -> 0x003a, all -> 0x0050 }
        goto L_0x0039;
    L_0x0057:
        r2 = move-exception;
        com.google.c.a.a.a.a.a.a(r1, r2);	 Catch:{ IOException -> 0x0048 }
        goto L_0x0047;
    L_0x005c:
        r7.close();	 Catch:{ IOException -> 0x0048 }
        goto L_0x0047;
    L_0x0060:
        r0 = move-exception;
        r1 = r6;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.n.a(android.content.Context, android.net.Uri):java.nio.ByteBuffer");
    }

    public static ByteBuffer m1593a(Context context, Resources resources, int i) {
        ByteBuffer byteBuffer = null;
        File a = C0281n.m1592a(context);
        if (a != null) {
            try {
                if (C0281n.m1597a(a, resources, i)) {
                    byteBuffer = C0281n.m1595a(a);
                    a.delete();
                }
            } finally {
                a.delete();
            }
        }
        return byteBuffer;
    }

    public static boolean m1598a(File file, InputStream inputStream) {
        IOException e;
        Throwable th;
        Closeable fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[MemoryMappedFileBuffer.DEFAULT_PADDING];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        C0281n.m1596a(fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    C0281n.m1596a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    C0281n.m1596a(fileOutputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            C0281n.m1596a(fileOutputStream);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            C0281n.m1596a(fileOutputStream);
            throw th;
        }
    }

    public static boolean m1597a(File file, Resources resources, int i) {
        Closeable closeable = null;
        try {
            closeable = resources.openRawResource(i);
            boolean a = C0281n.m1598a(file, (InputStream) closeable);
            return a;
        } finally {
            C0281n.m1596a(closeable);
        }
    }

    public static void m1596a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
