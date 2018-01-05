package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C5129a;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

public final class C5214e implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = C5129a.m23814a(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        boolean z = false;
        boolean z2 = false;
        List list = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        Uri uri = null;
        List list2 = null;
        int i4 = 0;
        ThemeSettings themeSettings = null;
        List list3 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i5 = 0;
        PendingIntent pendingIntent = null;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        String str5 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = C5129a.m23824e(parcel, readInt);
                    break;
                case 2:
                    str = C5129a.m23827h(parcel, readInt);
                    break;
                case 3:
                    account = (Account) C5129a.m23816a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = C5129a.m23829j(parcel, readInt);
                    break;
                case 5:
                    z = C5129a.m23822c(parcel, readInt);
                    break;
                case 6:
                    z2 = C5129a.m23822c(parcel, readInt);
                    break;
                case 7:
                    list = C5129a.m23834o(parcel, readInt);
                    break;
                case 10:
                    bundle2 = C5129a.m23829j(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) C5129a.m23816a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = C5129a.m23827h(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) C5129a.m23816a(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    list2 = C5129a.m23821c(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = C5129a.m23824e(parcel, readInt);
                    break;
                case 18:
                    list3 = C5129a.m23821c(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = C5129a.m23830k(parcel, readInt);
                    break;
                case 20:
                    i2 = C5129a.m23824e(parcel, readInt);
                    break;
                case 21:
                    i3 = C5129a.m23824e(parcel, readInt);
                    break;
                case 22:
                    z3 = C5129a.m23822c(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) C5129a.m23816a(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) C5129a.m23816a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = C5129a.m23827h(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) C5129a.m23816a(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = C5129a.m23824e(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) C5129a.m23816a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = C5129a.m23827h(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) C5129a.m23816a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = C5129a.m23824e(parcel, readInt);
                    break;
                case 37:
                    z4 = C5129a.m23822c(parcel, readInt);
                    break;
                case 38:
                    z5 = C5129a.m23822c(parcel, readInt);
                    break;
                case 39:
                    i7 = C5129a.m23824e(parcel, readInt);
                    break;
                case 40:
                    str5 = C5129a.m23827h(parcel, readInt);
                    break;
                case 41:
                    z6 = C5129a.m23822c(parcel, readInt);
                    break;
                default:
                    C5129a.m23818b(parcel, readInt);
                    break;
            }
        }
        C5129a.m23835p(parcel, a);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
