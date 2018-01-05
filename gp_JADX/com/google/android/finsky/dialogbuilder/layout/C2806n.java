package com.google.android.finsky.dialogbuilder.layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.wireless.android.finsky.dfe.c.a.bu;
import com.google.wireless.android.finsky.dfe.c.a.da;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public abstract class C2806n extends Fragment {
    public ViewGroup ah;
    public ViewGroup ai;
    public ViewGroup aj;
    public ViewGroup ak;
    public boolean al;

    protected abstract int mo968W();

    public abstract void mo3140X();

    public abstract void mo3141Y();

    protected abstract void mo3142a(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, bu buVar, da daVar);

    public final ViewGroup aa() {
        return !this.al ? this.ah : this.ai;
    }

    public final ViewGroup ab() {
        return this.al ? this.ah : this.ai;
    }

    public final ViewGroup ac() {
        return !this.al ? this.aj : this.ak;
    }

    public final ViewGroup ad() {
        return this.al ? this.aj : this.ak;
    }

    public View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo968W(), viewGroup, false);
        this.ah = (ViewGroup) inflate.findViewById(C7582R.id.content1);
        this.ai = (ViewGroup) inflate.findViewById(C7582R.id.content2);
        this.aj = (ViewGroup) inflate.findViewById(C7582R.id.footer1);
        this.ak = (ViewGroup) inflate.findViewById(C7582R.id.footer2);
        return inflate;
    }

    public final void m14923a(List list, List list2, bu buVar, da daVar) {
        if (m610k()) {
            ViewGroup ab = ab();
            ViewGroup aa = aa();
            ViewGroup ad = ad();
            ViewGroup ac = ac();
            this.al = !this.al;
            ab.animate().cancel();
            aa.animate().cancel();
            ad.animate().cancel();
            ac.animate().cancel();
            aa.removeAllViews();
            ac.removeAllViews();
            for (View addView : list) {
                aa.addView(addView);
            }
            for (View addView2 : list2) {
                ac.addView(addView2);
            }
            mo3142a(ab, aa, ad, ac, buVar, daVar);
        }
    }
}
