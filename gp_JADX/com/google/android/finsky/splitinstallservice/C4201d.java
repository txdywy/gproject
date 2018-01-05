package com.google.android.finsky.splitinstallservice;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class C4201d {
    public final File f21228a;

    public C4201d(Context context) {
        this(new File(context.getCacheDir(), "dynamicsplits"));
    }

    private C4201d(File file) {
        this.f21228a = file;
    }

    public final void m19574a(int i) {
        File b = m19575b(i);
        if (b.exists()) {
            File[] listFiles = b.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
        b.delete();
    }

    public final List m19573a(int i, Collection collection) {
        List arrayList = new ArrayList();
        for (String file : collection) {
            arrayList.add(new File(m19575b(i), file));
        }
        return arrayList;
    }

    final File m19575b(int i) {
        return new File(this.f21228a, String.valueOf(i));
    }
}
