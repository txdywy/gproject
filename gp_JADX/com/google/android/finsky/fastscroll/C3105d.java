package com.google.android.finsky.fastscroll;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ew;

final class C3105d {
    public static int m15913a(ew ewVar) {
        if (ewVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) ewVar).m3124j();
        }
        String valueOf = String.valueOf(ewVar);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Cannot get first visible position using layout manager: ").append(valueOf).toString());
    }

    public static int m15915b(ew ewVar) {
        if (ewVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) ewVar).m3125k();
        }
        String valueOf = String.valueOf(ewVar);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 55).append("Cannot get last visible position using layout manager: ").append(valueOf).toString());
    }

    public static void m15914a(ew ewVar, int i, int i2) {
        if (ewVar instanceof LinearLayoutManager) {
            ((LinearLayoutManager) ewVar).m3094a(i, i2);
        } else {
            String valueOf = String.valueOf(ewVar);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 47).append("Cannot scroll to position using layout manager ").append(valueOf).toString());
        }
    }
}
