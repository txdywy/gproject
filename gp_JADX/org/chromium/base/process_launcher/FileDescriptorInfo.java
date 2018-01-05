package org.chromium.base.process_launcher;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.chromium.base.annotations.UsedByReflection;

@UsedByReflection
public final class FileDescriptorInfo implements Parcelable {
    public static final Creator CREATOR = new C7904a();
    public final int f40549a;
    public final ParcelFileDescriptor f40550b;
    public final long f40551c;
    public final long f40552d;

    FileDescriptorInfo(Parcel parcel) {
        this.f40549a = parcel.readInt();
        this.f40550b = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        this.f40551c = parcel.readLong();
        this.f40552d = parcel.readLong();
    }

    public final int describeContents() {
        return 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40549a);
        parcel.writeParcelable(this.f40550b, 1);
        parcel.writeLong(this.f40551c);
        parcel.writeLong(this.f40552d);
    }
}
