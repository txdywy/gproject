package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.chromium.base.annotations.CalledByNative;

public class UnguessableToken implements Parcelable {
    public static final Creator CREATOR = new C7914z();
    public final long f40511a;
    public final long f40512b;

    UnguessableToken(long j, long j2) {
        this.f40511a = j;
        this.f40512b = j2;
    }

    @CalledByNative
    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    @CalledByNative
    public long getHighForSerialization() {
        return this.f40511a;
    }

    @CalledByNative
    public long getLowForSerialization() {
        return this.f40512b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f40511a);
        parcel.writeLong(this.f40512b);
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }
}
