package org.chromium.base.process_launcher;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C7904a implements Creator {
    C7904a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FileDescriptorInfo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FileDescriptorInfo(parcel);
    }
}
