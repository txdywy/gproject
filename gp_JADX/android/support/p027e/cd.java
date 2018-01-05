package android.support.p027e;

import android.os.IBinder;

final class cd {
    public final IBinder f1133a;

    cd(IBinder iBinder) {
        this.f1133a = iBinder;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cd) && ((cd) obj).f1133a.equals(this.f1133a);
    }

    public final int hashCode() {
        return this.f1133a.hashCode();
    }
}
