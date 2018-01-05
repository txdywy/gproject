package com.google.android.libraries.p319a.p320a;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;

public final class C5844a {
    public final Context f29325a;
    public final Object f29326b = new Object();
    public File f29327c;

    public C5844a(Context context) {
        this.f29325a = context.getApplicationContext();
    }

    public final File m27270a() {
        File file;
        synchronized (this.f29326b) {
            if (this.f29327c == null) {
                if (VERSION.SDK_INT >= 24) {
                    this.f29327c = this.f29325a.getDataDir();
                } else {
                    this.f29327c = this.f29325a.getDatabasePath("dps-dummy").getParentFile().getParentFile();
                }
            }
            file = this.f29327c;
        }
        return file;
    }
}
