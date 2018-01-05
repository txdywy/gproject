package com.google.android.instantapps.common.loading.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.instantapps.common.atom.AtomReference;
import com.google.android.instantapps.common.loading.C5810g;
import com.google.android.instantapps.common.loading.C5811h;

public final class C5838x extends C5820e {
    public View f29313d;
    public ProgressBar f29314e;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = true;
        this.f29313d = layoutInflater.inflate(C5811h.loading_inter_atom_fragment, viewGroup, false);
        this.f29314e = (ProgressBar) this.f29313d.findViewById(C5810g.progress_bar);
        if (mo968W()) {
            this.f29313d.setVisibility(4);
        }
        return this.f29313d;
    }

    public final void mo5169a(String str) {
    }

    public final void mo5166a(int i) {
    }

    public final void mo5162X() {
    }

    public final void mo5163Y() {
    }

    public final void mo5171b(String str) {
    }

    public final void mo5164Z() {
    }

    public final void mo5168a(AtomReference atomReference) {
    }

    public final void mo5172c(String str) {
    }

    public final void mo5167a(Bitmap bitmap) {
    }

    public final void mo5165a(float f) {
        this.f29314e.setIndeterminate(false);
        this.f29314e.setMax(Integer.MAX_VALUE);
        this.f29314e.setProgress(Math.round(((float) this.f29314e.getMax()) * f));
    }

    public final void aa() {
        this.f29314e.setIndeterminate(false);
        this.f29314e.setMax(100);
        this.f29314e.setProgress(100);
        this.a.mo3494k();
    }
}
