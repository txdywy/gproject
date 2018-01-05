package com.google.android.finsky.setupwizardparams;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class C4194a implements Creator {
    C4194a() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupWizardParams[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SetupWizardParams(parcel);
    }
}
