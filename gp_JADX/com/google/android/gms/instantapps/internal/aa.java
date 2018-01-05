package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.Collection;

public final class aa implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ContentRating contentRating = null;
        int a = C5129a.m23814a(parcel);
        Collection collection = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    bitmapTeleporter = (BitmapTeleporter) C5129a.m23816a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 3:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 4:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 5:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 7:
                    collection = C5129a.m23834o(parcel, readInt);
                    break;
                case 8:
                    contentRating = (ContentRating) C5129a.m23816a(parcel, readInt, ContentRating.CREATOR);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new VisitedApplication(bitmapTeleporter, str4, str3, str2, str, collection, contentRating);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisitedApplication[i];
    }
}
