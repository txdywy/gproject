package com.google.android.instantapps.p309a;

import java.io.File;
import java.io.IOException;

public final class C5693a {
    public static synchronized void m26952a(File file) {
        synchronized (C5693a.class) {
            String valueOf;
            if (file.exists()) {
                if (!file.isDirectory()) {
                    valueOf = String.valueOf(file);
                    throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 31).append(valueOf).append(" exists, but is not a directory").toString());
                }
            } else if (!file.mkdirs()) {
                valueOf = String.valueOf(file);
                throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 25).append("Can not create directory ").append(valueOf).toString());
            }
        }
    }

    public static boolean m26953b(File file) {
        return ((Boolean) C5693a.m26951a(file, C5696b.f28848a, Boolean.valueOf(true))).booleanValue();
    }

    private static Object m26951a(File file, C5695c c5695c, Object obj) {
        if (file == null) {
            return obj;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a : listFiles) {
                    obj = C5693a.m26951a(a, c5695c, obj);
                }
            }
        }
        return c5695c.mo5133a(obj, file);
    }
}
