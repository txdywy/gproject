package com.google.archivepatcher.applier.p407a;

import com.google.archivepatcher.applier.C6880a;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public final class C6881a implements C6880a {
    public final void mo5744a(File file, InputStream inputStream, OutputStream outputStream) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                C6882b.m31253a(randomAccessFile, outputStream, inputStream);
                try {
                    randomAccessFile.close();
                } catch (Exception e) {
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (Exception e2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            randomAccessFile.close();
            throw th;
        }
    }
}
