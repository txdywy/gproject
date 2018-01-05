package com.google.android.wallet.common.util;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.i;

final class C6599k implements Creator {
    C6599k() {
    }

    private static ParcelableProto m29928a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return new ParcelableProto(null);
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        String readString = parcel.readString();
        try {
            i iVar = (i) Class.forName(readString).getConstructor(null).newInstance(null);
            iVar.a(C7213a.m33546a(bArr, 0, readInt));
            return new ParcelableProto(iVar);
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
        return C6599k.m29928a(parcel);
    }
}
