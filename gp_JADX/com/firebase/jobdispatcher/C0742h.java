package com.firebase.jobdispatcher;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

final class C0742h {
    public static Boolean f4682a = null;

    C0742h() {
    }

    @SuppressLint({"ParcelClassLoader"})
    static Pair m4846a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Parcel b = C0742h.m4849b(bundle);
        if (b.readInt() <= 0) {
            Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
            return null;
        } else if (b.readInt() != 1279544898) {
            Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
            b.recycle();
            return null;
        } else {
            int readInt = b.readInt();
            int i = 0;
            C0745j c0745j = null;
            while (i < readInt) {
                String readString;
                Object readValue;
                C0745j c0745j2;
                if (C0742h.m4848a()) {
                    readString = b.readString();
                } else {
                    readValue = b.readValue(null);
                    if (readValue instanceof String) {
                        readString = (String) readValue;
                    } else {
                        Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                        readString = null;
                    }
                }
                if (readString != null) {
                    if (c0745j != null || !"callback".equals(readString)) {
                        readValue = b.readValue(null);
                        if (readValue instanceof String) {
                            bundle2.putString(readString, (String) readValue);
                            c0745j2 = c0745j;
                        } else if (readValue instanceof Boolean) {
                            bundle2.putBoolean(readString, ((Boolean) readValue).booleanValue());
                            c0745j2 = c0745j;
                        } else if (readValue instanceof Integer) {
                            bundle2.putInt(readString, ((Integer) readValue).intValue());
                            c0745j2 = c0745j;
                        } else if (readValue instanceof ArrayList) {
                            bundle2.putParcelableArrayList(readString, (ArrayList) readValue);
                            c0745j2 = c0745j;
                        } else if (readValue instanceof Bundle) {
                            bundle2.putBundle(readString, (Bundle) readValue);
                            c0745j2 = c0745j;
                        } else if (readValue instanceof Parcelable) {
                            bundle2.putParcelable(readString, (Parcelable) readValue);
                            c0745j2 = c0745j;
                        }
                        i++;
                        c0745j = c0745j2;
                    } else if (b.readInt() != 4) {
                        Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                        b.recycle();
                        return null;
                    } else {
                        if ("com.google.android.gms.gcm.PendingCallback".equals(b.readString())) {
                            try {
                                c0745j2 = new C0745j(b.readStrongBinder());
                                i++;
                                c0745j = c0745j2;
                            } finally {
                                b.recycle();
                            }
                        } else {
                            Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                            b.recycle();
                            return null;
                        }
                    }
                }
                c0745j2 = c0745j;
                i++;
                c0745j = c0745j2;
            }
            if (c0745j == null) {
                Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
                b.recycle();
                return null;
            }
            Pair create = Pair.create(c0745j, bundle2);
            b.recycle();
            return create;
        }
    }

    private static Parcel m4849b(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    private static synchronized boolean m4848a() {
        boolean z = true;
        synchronized (C0742h.class) {
            if (f4682a == null) {
                Bundle bundle = new Bundle();
                bundle.putString("key", "value");
                Parcel b = C0742h.m4849b(bundle);
                try {
                    boolean z2;
                    C0742h.m4847a(b.readInt() > 0);
                    if (b.readInt() == 1279544898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C0742h.m4847a(z2);
                    if (b.readInt() != 1) {
                        z = false;
                    }
                    C0742h.m4847a(z);
                    f4682a = Boolean.valueOf("key".equals(b.readString()));
                    b.recycle();
                } catch (RuntimeException e) {
                    f4682a = Boolean.FALSE;
                    b.recycle();
                } catch (Throwable th) {
                    b.recycle();
                }
            }
            z = f4682a.booleanValue();
        }
        return z;
    }

    private static void m4847a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
