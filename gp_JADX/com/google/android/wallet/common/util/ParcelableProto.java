package com.google.android.wallet.common.util;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.protobuf.nano.i;
import java.util.ArrayList;

public class ParcelableProto implements Parcelable {
    public static final Creator CREATOR = new C6599k();
    public final i f32724a;
    public byte[] f32725b = null;

    ParcelableProto(i iVar) {
        this.f32724a = iVar;
    }

    public static ParcelableProto m29885a(i iVar) {
        return new ParcelableProto(iVar);
    }

    public static ArrayList m29890a(i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iVarArr.length);
        for (i a : iVarArr) {
            arrayList.add(m29885a(a));
        }
        return arrayList;
    }

    public static ArrayList m29889a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(m29885a((i) arrayList.get(i)));
        }
        return arrayList2;
    }

    public static i m29886a(Intent intent, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) intent.getParcelableExtra(str);
        if (parcelableProto != null) {
            return parcelableProto.f32724a;
        }
        return null;
    }

    public static i m29888a(Parcel parcel) {
        ParcelableProto parcelableProto = (ParcelableProto) parcel.readParcelable(ParcelableProto.class.getClassLoader());
        if (parcelableProto != null) {
            return parcelableProto.f32724a;
        }
        return null;
    }

    public static i m29887a(Bundle bundle, String str) {
        ParcelableProto parcelableProto = (ParcelableProto) bundle.getParcelable(str);
        if (parcelableProto != null) {
            return parcelableProto.f32724a;
        }
        return null;
    }

    public static ArrayList m29891b(Bundle bundle, String str) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList == null) {
            return null;
        }
        int size = parcelableArrayList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(((ParcelableProto) parcelableArrayList.get(i)).f32724a);
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f32724a == null) {
            parcel.writeInt(-1);
            return;
        }
        if (this.f32725b == null) {
            this.f32725b = i.a(this.f32724a);
        }
        parcel.writeInt(this.f32725b.length);
        parcel.writeByteArray(this.f32725b);
        parcel.writeString(this.f32724a.getClass().getName());
    }
}
