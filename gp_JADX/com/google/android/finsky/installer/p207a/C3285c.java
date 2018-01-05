package com.google.android.finsky.installer.p207a;

import java.io.File;
import java.io.FilenameFilter;

final class C3285c implements FilenameFilter {
    public final /* synthetic */ String f17004a;
    public final /* synthetic */ String f17005b;

    C3285c(String str, String str2) {
        this.f17004a = str;
        this.f17005b = str2;
    }

    public final boolean accept(File file, String str) {
        if (str.startsWith(this.f17004a)) {
            String str2 = this.f17005b;
            if (str.endsWith(new StringBuilder(String.valueOf(str2).length() + 5).append(".").append(str2).append(".obb").toString())) {
                return true;
            }
        }
        return false;
    }
}
