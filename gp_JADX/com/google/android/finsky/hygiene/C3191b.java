package com.google.android.finsky.hygiene;

import java.io.File;
import java.io.FilenameFilter;

final class C3191b implements FilenameFilter {
    C3191b() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("gfbfv1");
    }
}
