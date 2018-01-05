package android.support.p017d;

import java.io.File;
import java.io.FileFilter;

final class C0091e implements FileFilter {
    public final /* synthetic */ String f417a;

    C0091e(String str) {
        this.f417a = str;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        return (name.startsWith(this.f417a) || name.equals("MultiDex.lock")) ? false : true;
    }
}
