package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import com.google.android.gms.phenotype.ExperimentTokens;

public final class C5049v implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ExperimentTokens[] experimentTokensArr = null;
        int a = C5129a.m23814a(parcel);
        boolean z = true;
        byte[][] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        PlayLoggerContext playLoggerContext = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) C5129a.m23816a(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr2 = C5129a.m23830k(parcel, readInt);
                    break;
                case 4:
                    iArr2 = C5129a.m23832m(parcel, readInt);
                    break;
                case 5:
                    strArr = C5129a.m23833n(parcel, readInt);
                    break;
                case 6:
                    iArr = C5129a.m23832m(parcel, readInt);
                    break;
                case 7:
                    bArr = C5129a.m23831l(parcel, readInt);
                    break;
                case 8:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) C5129a.m23820b(parcel, readInt, ExperimentTokens.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new LogEventParcelable(playLoggerContext, bArr2, iArr2, strArr, iArr, bArr, z, experimentTokensArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
