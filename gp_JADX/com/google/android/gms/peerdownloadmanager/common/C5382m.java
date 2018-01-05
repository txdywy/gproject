package com.google.android.gms.peerdownloadmanager.common;

public final class C5382m implements Comparable {
    public final C5383n f27960a;
    public final long f27961b;
    public final long f27962c;
    public final boolean f27963d;

    public C5382m(C5383n c5383n, long j, long j2, boolean z) {
        this.f27960a = c5383n;
        this.f27961b = j;
        this.f27962c = j2;
        this.f27963d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.f27961b != ((C5382m) obj).f27961b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (int) (this.f27961b ^ (this.f27961b >>> 32));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27960a);
        long j = this.f27961b;
        long j2 = this.f27962c;
        return new StringBuilder(String.valueOf(valueOf).length() + 101).append("RequestInternal{mResourceId=").append(valueOf).append(", mId=").append(j).append(", mExpiry=").append(j2).append(", mIsAsset=").append(this.f27963d).append('}').toString();
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Long.signum(this.f27961b - ((C5382m) obj).f27961b);
    }
}
