package com.firebase.jobdispatcher;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

private static class com.firebase.jobdispatcher.h
{

    public static Boolean a;

    static {
        com.firebase.jobdispatcher.h.a = 0;
    }

    h() {
    }

    static Pair a(Bundle p0) {
        v5 = new Bundle();
        v6 = com.firebase.jobdispatcher.h.b(p0);
        try {
            if (v6.readInt() <= 0) {
                Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
                v6.recycle();
                v0 = 0;
                return v0;
            }
        }
        catch (Throwable ex) {
            v6.recycle();
            throw ex;
        }
        try {
            if (v6.readInt() != 1279544898) {
                Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
                v6.recycle();
                v0 = 0;
                return v0;
            }
        }
        catch (Throwable ex) {
            v6.recycle();
            throw ex;
        }
        try {
            v4 = 0;
            v1 = 0;
            while (v4 < v6.readInt()) {
                if (com.firebase.jobdispatcher.h.a())
                    v3 = v6.readString();
                else {
                    v0 = v6.readValue(0);
                    if (!(v0 instanceof String)) {
                        Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                        v3 = 0;
                    }
                    else
                        v3 = (String)v0;
                }
                if (v3 != 0) {
                    if (v1 != 0 || !"callback".equals(v3)) {
                        v0 = v6.readValue(0);
                        if (v0 instanceof String) {
                            v5.putString(v3, (String)v0);
                            v0 = v1;
                        }
                        else if (v0 instanceof Boolean) {
                            v5.putBoolean(v3, ((Boolean)v0).booleanValue());
                            v0 = v1;
                        }
                        else if (v0 instanceof Integer) {
                            v5.putInt(v3, ((Integer)v0).intValue());
                            v0 = v1;
                        }
                        else if (v0 instanceof ArrayList) {
                            v5.putParcelableArrayList(v3, (ArrayList)v0);
                            v0 = v1;
                        }
                        else if (v0 instanceof Bundle) {
                            v5.putBundle(v3, (Bundle)v0);
                            v0 = v1;
                        }
                        else if (v0 instanceof Parcelable) {
                            v5.putParcelable(v3, (Parcelable)v0);
                            v0 = v1;
                        }
                        else
                            v0 = v1;
                    }
                    else {
                        if (v6.readInt() != 4) {
                            Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                            v6.recycle();
                            v0 = 0;
                            return v0;
                        }
                        try {
                            if (!"com.google.android.gms.gcm.PendingCallback".equals(v6.readString())) {
                                Log.w("FJD.GooglePlayReceiver", "Bad callback received, terminating");
                                v6.recycle();
                                v0 = 0;
                                return v0;
                            }
                        }
                        catch (Throwable ex) {
                            v6.recycle();
                            throw ex;
                        }
                        try {
                            v0 = new com.firebase.jobdispatcher.j(v6.readStrongBinder());
                        }
                        catch (Throwable ex) {
                            v6.recycle();
                            throw ex;
                        }
                    }
                }
                else
                    v0 = v1;
                v4 = v4 + 1;
                v1 = v0;
            }
        }
        catch (Throwable ex) {
            v6.recycle();
            throw ex;
        }
        if (v1 == 0) {
            try {
                Log.w("FJD.GooglePlayReceiver", "No callback received, terminating");
            }
            catch (Throwable ex) {
                v6.recycle();
                throw ex;
            }
            v6.recycle();
            v0 = 0;
        }
        else {
            try {
                v0 = Pair.create(v1, v5);
            }
            catch (Throwable ex) {
                v6.recycle();
                throw ex;
            }
            v6.recycle();
        }
        return v0;
    }

    private static void a(boolean p0) {
        if (p0 == 0)
            throw new IllegalStateException();
    }

    private static synchronized boolean a() {
  1:    v0 = 1;
  4:    enter com.firebase.jobdispatcher.h;
  5:    try {
  7:        if (com.firebase.jobdispatcher.h.a != 0) {
 82:            exit com.firebase.jobdispatcher.h;
 83:            return com.firebase.jobdispatcher.h.a.booleanValue();
            }
 11:        v2 = new Bundle();
 18:        v2.putString("key", "value");
 21:        v4 = com.firebase.jobdispatcher.h.b(v2);
        }
        catch (Throwable ex) {
100:        exit com.firebase.jobdispatcher.h;
101:        throw ex;
        }
 29:    if (v4.readInt() > 0)
 31:        v2 = 1;
        else
 84:        v2 = 0;
 32:    com.firebase.jobdispatcher.h.a(v2);
 42:    if (v4.readInt() == 1279544898)
 44:        v2 = 1;
        else
 86:        v2 = 0;
 45:    com.firebase.jobdispatcher.h.a(v2);
 52:    if (v4.readInt() != 1)
 88:        v0 = 0;
 54:    com.firebase.jobdispatcher.h.a(v0);
 71:    com.firebase.jobdispatcher.h.a = Boolean.valueOf("key".equals(v4.readString()));
 73:    v4.recycle();
 82:    exit com.firebase.jobdispatcher.h;
 83:    return com.firebase.jobdispatcher.h.a.booleanValue();
 93:    com.firebase.jobdispatcher.h.a = Boolean.FALSE;
 95:    try {
 95:        v4.recycle();
        }
        catch (Throwable ex) {
100:        exit com.firebase.jobdispatcher.h;
101:        throw ex;
        }
 98:    goto 76;
100:    exit com.firebase.jobdispatcher.h;
101:    throw ex;
103:    try {
103:        v4.recycle();
106:        throw ex;
        }
        catch (Throwable ex) {
100:        exit com.firebase.jobdispatcher.h;
101:        throw ex;
        }
109:    try
            run 91...95
        catch (Throwable ex) {
 91:        goto 102;
        }
110:    try
            run 73...81
        catch (Throwable ex) {
 73:        goto 99;
        }
111:    try
            run 25...73
        catch (RuntimeException ex) {
 25:        goto 90;
        }
        catch (Throwable ex) {
 25:        goto 102;
        }
    }

    private static Parcel b(Bundle p0) {
        v0 = Parcel.obtain();
        p0.writeToParcel(v0, 0);
        v0.setDataPosition(0);
        return v0;
    }

}
