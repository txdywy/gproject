package org.chromium.base.library_loader;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.chromium.base.library_loader.Linker.LibInfo;

final class C7897b implements Creator {
    C7897b() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LibInfo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LibInfo(parcel);
    }
}
