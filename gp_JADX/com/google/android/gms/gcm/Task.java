package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class Task implements ReflectedParcelable {
    public final String f26214c;
    public final String f26215d;
    public final boolean f26216e;
    public final boolean f26217f;
    public final int f26218g;
    public final boolean f26219h;
    public final C5204j f26220i;
    public final Bundle f26221j;

    @Deprecated
    Task(Parcel parcel) {
        boolean z = true;
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f26214c = parcel.readString();
        this.f26215d = parcel.readString();
        this.f26216e = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f26217f = z;
        this.f26218g = 2;
        this.f26219h = false;
        this.f26220i = C5204j.f26251a;
        this.f26221j = null;
    }

    Task(C5201k c5201k) {
        this.f26214c = c5201k.f26240d;
        this.f26215d = c5201k.f26241e;
        this.f26216e = c5201k.f26242f;
        this.f26217f = c5201k.f26243g;
        this.f26218g = c5201k.f26239c;
        this.f26219h = c5201k.f26244h;
        this.f26221j = c5201k.f26246j;
        this.f26220i = c5201k.f26245i != null ? c5201k.f26245i : C5204j.f26251a;
    }

    public static void m23963b(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            if (dataSize > 10240) {
                obtain.recycle();
                String str = "Extras exceeding maximum size(10240 bytes): ";
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 11).append(str).append(dataSize).toString());
            }
            obtain.recycle();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                dataSize = ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean)) ? 1 : 0;
                if (dataSize == 0) {
                    if (obj instanceof Bundle) {
                        m23963b((Bundle) obj);
                    } else {
                        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                }
            }
        }
    }

    public void mo4637a(Bundle bundle) {
        bundle.putString("tag", this.f26215d);
        bundle.putBoolean("update_current", this.f26216e);
        bundle.putBoolean("persisted", this.f26217f);
        bundle.putString("service", this.f26214c);
        bundle.putInt("requiredNetwork", this.f26218g);
        bundle.putBoolean("requiresCharging", this.f26219h);
        bundle.putBoolean("requiresIdle", false);
        C5204j c5204j = this.f26220i;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", c5204j.f26252b);
        bundle2.putInt("initial_backoff_seconds", c5204j.f26253c);
        bundle2.putInt("maximum_backoff_seconds", c5204j.f26254d);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.f26221j);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.f26214c);
        parcel.writeString(this.f26215d);
        parcel.writeInt(this.f26216e ? 1 : 0);
        if (!this.f26217f) {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }
}
