package com.google.android.finsky.di;

import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class C2754j {
    public static OutputStream m14809a(File file) {
        Throwable e;
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException e2) {
            e = e2;
        } catch (SecurityException e3) {
            e = e3;
        }
        FinskyLog.m21660a(e, "Error opening FileOutputStream", new Object[0]);
        return null;
    }

    public static InputStream m14810b(File file) {
        try {
            return new FileInputStream(file);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error opening FileInputStream", new Object[0]);
            return null;
        }
    }
}
