package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;

public final class ae implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[][] bArr = null;
        int a = C5129a.m23814a(parcel);
        int[] iArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        byte[] bArr6 = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    bArr6 = C5129a.m23830k(parcel, readInt);
                    break;
                case 4:
                    bArr5 = C5129a.m23831l(parcel, readInt);
                    break;
                case 5:
                    bArr4 = C5129a.m23831l(parcel, readInt);
                    break;
                case 6:
                    bArr3 = C5129a.m23831l(parcel, readInt);
                    break;
                case 7:
                    bArr2 = C5129a.m23831l(parcel, readInt);
                    break;
                case 8:
                    iArr = C5129a.m23832m(parcel, readInt);
                    break;
                case 9:
                    bArr = C5129a.m23831l(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new ExperimentTokens(str, bArr6, bArr5, bArr4, bArr3, bArr2, iArr, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
