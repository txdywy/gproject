package com.google.android.play.headerlist;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.play.b;
import com.google.android.play.g;

public abstract class C6344i {
    public final Context f31900f;

    public C6344i(Context context) {
        this.f31900f = context;
    }

    public abstract void m29128c(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract boolean m29131f();

    public abstract int m29143t();

    public abstract int m29144u();

    public void m29123a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    public float m29136k() {
        return 0.7f;
    }

    public boolean m29135j() {
        return !PlayHeaderListLayout.f31822s;
    }

    public int m29133h() {
        if (m29135j()) {
            return 1;
        }
        return 0;
    }

    public void m29124a(ViewGroup viewGroup) {
    }

    public void m29126b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
    }

    public int m29142s() {
        return 0;
    }

    public int m29121a(Context context) {
        return PlayHeaderListLayout.m29043a(context);
    }

    public int m29146x() {
        return 0;
    }

    public boolean K_() {
        return false;
    }

    public int m29132g() {
        return g.play_header_viewpager;
    }

    public int m29125b() {
        return g.play_header_listview;
    }

    public int m29130e() {
        return 0;
    }

    public int m29140q() {
        return 0;
    }

    public int m29129d() {
        return 0;
    }

    public int m29134i() {
        return 0;
    }

    public int m29127c() {
        return 0;
    }

    public PlayHeaderListTabStrip m29122a(Context context, LayoutInflater layoutInflater) {
        return null;
    }

    public boolean m29137l() {
        return false;
    }

    @TargetApi(21)
    public int m29138m() {
        TypedArray obtainStyledAttributes = this.f31900f.obtainStyledAttributes(new int[]{16843857});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public int m29139n() {
        TypedArray obtainStyledAttributes = this.f31900f.obtainStyledAttributes(new int[]{b.colorPrimary});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public boolean m29141r() {
        return VERSION.SDK_INT >= 21;
    }

    public int m29145w() {
        return 0;
    }
}
