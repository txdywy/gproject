package android.support.p017d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class C0090d {
    static List m196a(Context context, ApplicationInfo applicationInfo, File file) {
        Throwable th;
        Log.i("MultiDex", "MultiDexExtractor.load(" + applicationInfo.sourceDir + ", false)");
        File file2 = new File(applicationInfo.sourceDir);
        long b = C0090d.m203b(file2);
        File file3 = new File(file, "MultiDex.lock");
        Closeable randomAccessFile = new RandomAccessFile(file3, "rw");
        Closeable closeable = null;
        FileLock fileLock = null;
        IOException iOException = null;
        try {
            Closeable channel = randomAccessFile.getChannel();
            try {
                List a;
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                FileLock lock = channel.lock();
                try {
                    Log.i("MultiDex", file3.getPath() + " locked");
                    SharedPreferences a2 = C0090d.m195a(context);
                    Object obj = (a2.getLong("timestamp", -1) == C0090d.m194a(file2) && a2.getLong("crc", -1) == b) ? null : 1;
                    if (obj == null) {
                        a = C0090d.m197a(context, file2, file);
                    } else {
                        Log.i("MultiDex", "Detected that extraction must be performed.");
                        a = C0090d.m198a(file2, file);
                        C0090d.m199a(context, C0090d.m194a(file2), b, a);
                    }
                } catch (Throwable e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    a = C0090d.m198a(file2, file);
                    C0090d.m199a(context, C0090d.m194a(file2), b, a);
                } catch (Throwable th2) {
                    th = th2;
                    fileLock = lock;
                    closeable = channel;
                    if (fileLock != null) {
                        try {
                            fileLock.release();
                        } catch (IOException e2) {
                            Log.e("MultiDex", "Failed to release lock on " + file3.getPath());
                        }
                    }
                    if (closeable != null) {
                        C0090d.m200a(closeable);
                    }
                    C0090d.m200a(randomAccessFile);
                    throw th;
                }
                if (lock != null) {
                    try {
                        lock.release();
                    } catch (IOException e3) {
                        iOException = e3;
                        Log.e("MultiDex", "Failed to release lock on " + file3.getPath());
                    }
                }
                if (channel != null) {
                    C0090d.m200a(channel);
                }
                C0090d.m200a(randomAccessFile);
                if (iOException != null) {
                    throw iOException;
                }
                Log.i("MultiDex", "load found " + a.size() + " secondary dex files");
                return a;
            } catch (Throwable th3) {
                th = th3;
                closeable = channel;
                if (fileLock != null) {
                    fileLock.release();
                }
                if (closeable != null) {
                    C0090d.m200a(closeable);
                }
                C0090d.m200a(randomAccessFile);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (fileLock != null) {
                fileLock.release();
            }
            if (closeable != null) {
                C0090d.m200a(closeable);
            }
            C0090d.m200a(randomAccessFile);
            throw th;
        }
    }

    private static List m197a(Context context, File file, File file2) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = file.getName() + ".classes";
        SharedPreferences a = C0090d.m195a(context);
        int i = a.getInt("dex.number", 1);
        List arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            File c0092f = new C0092f(file2, str + i2 + ".zip");
            if (c0092f.isFile()) {
                c0092f.f418a = C0090d.m203b(c0092f);
                long j = a.getLong("dex.crc." + i2, -1);
                long j2 = a.getLong("dex.time." + i2, -1);
                long lastModified = c0092f.lastModified();
                if (j2 == lastModified && j == c0092f.f418a) {
                    arrayList.add(c0092f);
                    i2++;
                } else {
                    throw new IOException("Invalid extracted dex: " + c0092f + ", expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + c0092f.f418a);
                }
            }
            throw new IOException("Missing extracted secondary dex file '" + c0092f.getPath() + "'");
        }
        return arrayList;
    }

    private static long m194a(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    private static long m203b(File file) {
        long a = C0093g.m204a(file);
        if (a == -1) {
            return a - 1;
        }
        return a;
    }

    private static List m198a(File file, File file2) {
        String str = file.getName() + ".classes";
        C0090d.m201a(file2, str);
        List arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
        int i = 2;
        while (entry != null) {
            File c0092f = new C0092f(file2, str + i + ".zip");
            arrayList.add(c0092f);
            Log.i("MultiDex", "Extraction is needed for file " + c0092f);
            Object obj = null;
            int i2 = 0;
            while (i2 < 3 && obj == null) {
                int i3 = i2 + 1;
                C0090d.m202a(zipFile, entry, c0092f, str);
                try {
                    c0092f.f418a = C0090d.m203b(c0092f);
                    obj = 1;
                } catch (Throwable e) {
                    Log.w("MultiDex", "Failed to read crc from " + c0092f.getAbsolutePath(), e);
                    obj = null;
                } catch (Throwable th) {
                    try {
                        zipFile.close();
                    } catch (Throwable e2) {
                        Log.w("MultiDex", "Failed to close resource", e2);
                    }
                }
                Log.i("MultiDex", "Extraction " + (obj != null ? "succeeded" : "failed") + " - length " + c0092f.getAbsolutePath() + ": " + c0092f.length() + " - crc: " + c0092f.f418a);
                if (obj == null) {
                    c0092f.delete();
                    if (c0092f.exists()) {
                        Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + c0092f.getPath() + "'");
                        i2 = i3;
                    }
                }
                i2 = i3;
            }
            if (obj == null) {
                throw new IOException("Could not create zip file " + c0092f.getAbsolutePath() + " for secondary dex (" + i + ")");
            }
            int i4 = i + 1;
            entry = zipFile.getEntry("classes" + i4 + ".dex");
            i = i4;
        }
        try {
            zipFile.close();
        } catch (Throwable e3) {
            Log.w("MultiDex", "Failed to close resource", e3);
        }
        return arrayList;
    }

    private static void m199a(Context context, long j, long j2, List list) {
        Editor edit = C0090d.m195a(context).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", list.size() + 1);
        int i = 2;
        for (C0092f c0092f : list) {
            edit.putLong("dex.crc." + i, c0092f.f418a);
            edit.putLong("dex.time." + i, c0092f.lastModified());
            i++;
        }
        edit.commit();
    }

    private static SharedPreferences m195a(Context context) {
        return context.getSharedPreferences("multidex.version", VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static void m201a(File file, String str) {
        File[] listFiles = file.listFiles(new C0091e(str));
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
    }

    private static void m202a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        Closeable inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    C0090d.m200a(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            C0090d.m200a(inputStream);
            createTempFile.delete();
        }
    }

    private static void m200a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
