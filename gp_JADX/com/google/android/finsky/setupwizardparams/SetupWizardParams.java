package com.google.android.finsky.setupwizardparams;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SetupWizardParams implements Parcelable {
    public static final Creator CREATOR = new C4194a();
    public final boolean f21124a;
    public final boolean f21125b;
    public final boolean f21126c;

    public SetupWizardParams(Intent intent) {
        boolean z = false;
        this.f21124a = intent.getBooleanExtra("on_initial_setup", true);
        this.f21125b = intent.getBooleanExtra("useImmersiveMode", false);
        if (VERSION.SDK_INT >= 21) {
            String stringExtra = intent.getStringExtra("theme");
            if ("holo_light".equals(stringExtra) || "material_light".equals(stringExtra) || "glif_light".equals(stringExtra) || "glif_v2_light".equals(stringExtra)) {
                z = true;
            } else if (!("holo".equals(stringExtra) || "material".equals(stringExtra) || "glif".equals(stringExtra) || "glif_v2".equals(stringExtra))) {
                z = true;
            }
        }
        this.f21126c = z;
    }

    public SetupWizardParams(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.f21124a = z;
        if (parcel.readByte() == (byte) 1) {
            z = true;
        } else {
            z = false;
        }
        this.f21125b = z;
        if (parcel.readByte() != (byte) 1) {
            z2 = false;
        }
        this.f21126c = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        int i3 = 1;
        if (this.f21124a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        if (this.f21125b) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        if (!this.f21126c) {
            i3 = 0;
        }
        parcel.writeByte((byte) i3);
    }

    public int describeContents() {
        return 0;
    }
}
