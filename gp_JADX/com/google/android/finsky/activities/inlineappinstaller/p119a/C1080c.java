package com.google.android.finsky.activities.inlineappinstaller.p119a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.inlineappinstaller.C1088a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.permissionui.AppSecurityPermissions;
import com.google.android.finsky.permissionui.C3874e;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C1080c extends C1076h {
    public final ce f6927a = C2482j.m13283a(5111);
    public Document f6928b;
    public AppSecurityPermissions f6929c;
    public View f6930d;
    public C1084g f6931e = C1473m.f7980a.aw();

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.f6928b = (Document) this.f760q.getParcelable("appDoc");
        this.f6930d = layoutInflater.inflate(C7582R.layout.inline_app_installer_permissions, viewGroup, false);
        this.f6929c = (AppSecurityPermissions) this.f6930d.findViewById(C7582R.id.app_permissions);
        View view = this.f6930d;
        String str = this.f6928b.f14885a.f12097d;
        String[] strArr = this.f6928b.m14625N().f13167g;
        ((TextView) view.findViewById(C7582R.id.title)).setText(this.f6928b.f14885a.f12100g);
        TextView textView = (TextView) view.findViewById(C7582R.id.subheader);
        textView.setVisibility(0);
        this.f6931e.m6725a(this.f6928b, view);
        boolean b = C1473m.f7980a.aV().m11998b(C1473m.f7980a.mo2169c(), str);
        C3874e a = C1473m.f7980a.bU().m18370a(m603h(), str, strArr, b, false);
        if (a.mo3828a() && b) {
            i = C7582R.string.also_needs_access_to;
        } else {
            i = C7582R.string.needs_access_to;
        }
        textView.setText(i);
        this.f6929c.m18358a(a, this.f6928b.f14885a.f12100g);
        this.f6929c.requestFocus();
        return this.f6930d;
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(m601g(), m592c((int) C7582R.string.permissions_title), this.f6930d, false);
    }

    public final String mo1406a(Resources resources) {
        return resources.getString(C7582R.string.accept);
    }

    public final void mo1405X() {
        ((C1088a) aa()).mo1408a(5112, (ad) this);
        ((C1088a) aa()).m6749X();
    }

    public final ce getPlayStoreUiElement() {
        return this.f6927a;
    }
}
