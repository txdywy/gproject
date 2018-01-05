package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import java.util.List;

public final class C5191d implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        List list = null;
        boolean z = false;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                case 5:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) C5129a.m23816a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) C5129a.m23816a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 10:
                    list = C5129a.m23821c(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) C5129a.m23816a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) C5129a.m23816a(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, list, z, themeSettings, logOptions, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
