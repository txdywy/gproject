package com.firebase.jobdispatcher;

import android.net.Uri;

public final class com.firebase.jobdispatcher.al
{

    public final Uri a;
    public final int b;

    al(Uri p0, int p1) {
        if (p0 == 0)
            throw new IllegalArgumentException("URI must not be null.");
        this.a = p0;
        this.b = p1;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (this != p0) {
            if (!(p0 instanceof com.firebase.jobdispatcher.al))
                v0 = 0;
            else if (this.b != ((com.firebase.jobdispatcher.al)p0).b || !this.a.equals(((com.firebase.jobdispatcher.al)p0).a))
                v0 = 0;
        }
        return v0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b;
    }

}
