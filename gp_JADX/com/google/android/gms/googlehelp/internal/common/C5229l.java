package com.google.android.gms.googlehelp.internal.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.ni;

public final class C5229l extends ng implements C5228k {
    C5229l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    public final void mo4657a(Bundle bundle, long j, GoogleHelp googleHelp, C5218a c5218a) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) bundle);
        cw_.writeLong(j);
        ni.m25194a(cw_, (Parcelable) googleHelp);
        ni.m25193a(cw_, (IInterface) c5218a);
        m23096c(8, cw_);
    }

    public final void mo4658a(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, C5218a c5218a) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) feedbackOptions);
        ni.m25194a(cw_, (Parcelable) bundle);
        cw_.writeLong(j);
        ni.m25194a(cw_, (Parcelable) googleHelp);
        ni.m25193a(cw_, (IInterface) c5218a);
        m23096c(10, cw_);
    }

    public final void mo4659a(GoogleHelp googleHelp, Bitmap bitmap, C5218a c5218a) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) googleHelp);
        ni.m25194a(cw_, (Parcelable) bitmap);
        ni.m25193a(cw_, (IInterface) c5218a);
        m23095b(2, cw_);
    }

    public final void mo4660b(Bundle bundle, long j, GoogleHelp googleHelp, C5218a c5218a) {
        Parcel cw_ = cw_();
        ni.m25194a(cw_, (Parcelable) bundle);
        cw_.writeLong(j);
        ni.m25194a(cw_, (Parcelable) googleHelp);
        ni.m25193a(cw_, (IInterface) c5218a);
        m23096c(9, cw_);
    }
}
