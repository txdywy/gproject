package com.firebase.jobdispatcher;

import android.net.Uri;

public final class al {
    public final Uri f4667a;
    public final int f4668b;

    public al(Uri uri, int i) {
        if (uri == null) {
            throw new IllegalArgumentException("URI must not be null.");
        }
        this.f4667a = uri;
        this.f4668b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (this.f4668b == alVar.f4668b && this.f4667a.equals(alVar.f4667a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4667a.hashCode() ^ this.f4668b;
    }
}
