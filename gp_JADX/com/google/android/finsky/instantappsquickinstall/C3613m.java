package com.google.android.finsky.instantappsquickinstall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

public final class C3613m extends Fragment {
    public TextView f17957a;
    public FifeImageView f17958b;
    public TextView f17959c;
    public TextView f17960d;
    public ProgressBar f17961e;
    public C3614n f17962f;
    public C3371p f17963g;
    public boolean f17964h;

    public C3613m() {
        C1527a c1527a = new C1527a();
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.quick_install_progress, viewGroup, false);
        this.f17957a = (TextView) inflate.findViewById(C7582R.id.title);
        this.f17958b = (FifeImageView) inflate.findViewById(C7582R.id.icon);
        this.f17959c = (TextView) inflate.findViewById(C7582R.id.downloadingBytes);
        this.f17960d = (TextView) inflate.findViewById(C7582R.id.downloadingPercentage);
        this.f17961e = (ProgressBar) inflate.findViewById(C7582R.id.progressBar);
        this.f17964h = true;
        mo968W();
        if (this.f17963g != null) {
            m17219a(this.f17963g);
            this.f17963g = null;
        }
        return inflate;
    }

    public final void m17219a(C3371p c3371p) {
        if (this.f17964h) {
            C1527a.m8947a(m603h(), c3371p, this.f17959c, this.f17960d, this.f17961e);
        } else {
            this.f17963g = c3371p;
        }
    }

    final void mo968W() {
        if (!this.f17964h) {
            return;
        }
        if (this.f17962f != null) {
            this.f17957a.setText(this.f17962f.f17965a);
            this.f17958b.a(this.f17962f.f17966b, this.f17962f.f17967c, C1473m.f7980a.be());
            return;
        }
        this.f17957a.setText("");
        this.f17958b.a();
    }
}
