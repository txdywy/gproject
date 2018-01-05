package com.google.android.finsky.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.a;

final class ag implements Creator {
    ag() {
    }

    private static ParcelableProto m21694a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return new ParcelableProto(null);
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        String readString = parcel.readString();
        try {
            C0757i c0757i = (C0757i) Class.forName(readString).getConstructor(null).newInstance(null);
            c0757i.mo1131a(a.a(bArr, 0, readInt));
            return new ParcelableProto(c0757i);
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Exception when unmarshalling: ";
            String valueOf = String.valueOf(readString);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableProto[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m21694a(parcel);
    }
}
