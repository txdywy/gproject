package com.google.vr.vrcore.base.api;

import android.content.Context;

public final class C7267a {
    public static volatile Boolean f35538a;

    static synchronized boolean m34040a(Context context) {
        boolean booleanValue;
        synchronized (C7267a.class) {
            if (f35538a == null) {
                try {
                    f35538a = Boolean.valueOf(C7268b.m34042a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), C7268b.f35541c, C7268b.f35542d, C7268b.f35540b));
                } catch (Throwable e) {
                    throw new IllegalStateException("Unable to find self package info", e);
                }
            }
            booleanValue = f35538a.booleanValue();
        }
        return booleanValue;
    }
}
