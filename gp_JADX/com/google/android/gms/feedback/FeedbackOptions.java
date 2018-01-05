package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.C5130b;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class FeedbackOptions extends zza {
    public static final Creator CREATOR = new C5191d();
    public String f26181a;
    public Bundle f26182b;
    public String f26183c;
    public ApplicationErrorReport f26184d;
    public String f26185e;
    public BitmapTeleporter f26186f;
    public String f26187g;
    public List f26188h;
    public boolean f26189i;
    public ThemeSettings f26190j;
    public LogOptions f26191k;
    public boolean f26192l;
    public C5188a f26193m;

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false);
    }

    FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2) {
        this.f26193m = null;
        this.f26181a = str;
        this.f26182b = bundle;
        this.f26183c = str2;
        this.f26184d = applicationErrorReport;
        this.f26185e = str3;
        this.f26186f = bitmapTeleporter;
        this.f26187g = str4;
        this.f26188h = list;
        this.f26189i = z;
        this.f26190j = themeSettings;
        this.f26191k = logOptions;
        this.f26192l = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C5130b.m23836a(parcel, 20293);
        C5130b.m23844a(parcel, 2, this.f26181a);
        C5130b.m23840a(parcel, 3, this.f26182b);
        C5130b.m23844a(parcel, 5, this.f26183c);
        C5130b.m23842a(parcel, 6, this.f26184d, i);
        C5130b.m23844a(parcel, 7, this.f26185e);
        C5130b.m23842a(parcel, 8, this.f26186f, i);
        C5130b.m23844a(parcel, 9, this.f26187g);
        C5130b.m23855b(parcel, 10, this.f26188h);
        C5130b.m23846a(parcel, 11, this.f26189i);
        C5130b.m23842a(parcel, 12, this.f26190j, i);
        C5130b.m23842a(parcel, 13, this.f26191k, i);
        C5130b.m23846a(parcel, 14, this.f26192l);
        C5130b.m23853b(parcel, a);
    }

    static /* synthetic */ FeedbackOptions m23949a(FeedbackOptions feedbackOptions, Bitmap bitmap) {
        if (bitmap != null) {
            feedbackOptions.f26186f = new BitmapTeleporter(bitmap);
        }
        return feedbackOptions;
    }
}
