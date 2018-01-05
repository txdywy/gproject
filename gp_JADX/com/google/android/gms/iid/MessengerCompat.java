package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class MessengerCompat implements ReflectedParcelable {
    public static final Creator CREATOR = new C5257d();
    public Messenger f26377a;
    public C5255b f26378b;

    public MessengerCompat(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f26377a = new Messenger(iBinder);
            return;
        }
        C5255b c5255b;
        if (iBinder == null) {
            c5255b = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            c5255b = queryLocalInterface instanceof C5255b ? (C5255b) queryLocalInterface : new C5256c(iBinder);
        }
        this.f26378b = c5255b;
    }

    private final IBinder m24073a() {
        return this.f26377a != null ? this.f26377a.getBinder() : this.f26378b.asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = m24073a().equals(((MessengerCompat) obj).m24073a());
            } catch (ClassCastException e) {
            }
        }
        return z;
    }

    public int hashCode() {
        return m24073a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f26377a != null) {
            parcel.writeStrongBinder(this.f26377a.getBinder());
        } else {
            parcel.writeStrongBinder(this.f26378b.asBinder());
        }
    }
}
