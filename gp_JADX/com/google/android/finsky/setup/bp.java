package com.google.android.finsky.setup;

import android.content.Context;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

public final class bp {
    public static void m19291a(Context context) {
        try {
            File[] listFiles = context.getDir("FinskySetup", 0).listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error while cleaning setup directory", new Object[0]);
        }
    }
}
