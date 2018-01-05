package com.google.android.play.utils;

import java.io.File;
import java.util.Comparator;

public final class C6448d implements Comparator {
    public static final C6448d f32417a = new C6448d();

    private C6448d() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        if (file.lastModified() < file2.lastModified()) {
            return -1;
        }
        return 1;
    }
}
