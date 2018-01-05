package com.google.android.gms.common.util;

import android.util.Log;
import java.io.File;

public final class C5157l {
    public static synchronized File m23893a(File file) {
        synchronized (C5157l.class) {
            if (!(file.exists() || file.mkdirs() || file.exists())) {
                String str = "SupportV4Utils";
                String str2 = "Unable to create no-backup dir ";
                String valueOf = String.valueOf(file.getPath());
                Log.w(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                file = null;
            }
        }
        return file;
    }
}
