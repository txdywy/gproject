package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import android.support.v4.app.bx;
import android.support.v4.p028a.C0211f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public final class C6185d extends Fragment implements bx {
    public ArrayAdapter f30722a;
    public C6181f f30723b;

    public final void mo135a(Context context) {
        super.mo135a(context);
        Fragment fragment = this.f734F;
        if (fragment instanceof C6181f) {
            this.f30723b = (C6181f) fragment;
            return;
        }
        C0254u h = m603h();
        if (h instanceof C6181f) {
            this.f30723b = (C6181f) h;
        }
    }

    public final void mo134a() {
        super.mo134a();
        this.f30723b = null;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C6189i.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    public final void mo1410a(View view, Bundle bundle) {
        super.mo1410a(view, bundle);
        Context h = m603h();
        this.f30722a = new ArrayAdapter(h, C6189i.libraries_social_licenses_license, C6188h.license, new ArrayList());
        h.b_().mo311a(54321, null, this);
        ListView listView = (ListView) view.findViewById(C6188h.license_list);
        listView.setAdapter(this.f30722a);
        listView.setOnItemClickListener(new C6186e(this));
    }

    public final void mo1346w() {
        super.mo1346w();
        m603h().b_().mo313a(54321);
    }

    public final C0211f mo969a(int i, Bundle bundle) {
        Bundle bundle2 = this.f760q;
        if (bundle2 == null || bundle2.getStringArrayList("pluginLicensePaths") == null || bundle2.getStringArrayList("pluginLicensePaths").isEmpty()) {
            return new C6184c(m603h());
        }
        return new C6184c(m603h(), bundle2.getStringArrayList("pluginLicensePaths"));
    }

    public final void mo973b() {
        this.f30722a.clear();
        this.f30722a.notifyDataSetChanged();
    }

    public final /* synthetic */ void mo972a(C0211f c0211f, Object obj) {
        List list = (List) obj;
        this.f30722a.clear();
        this.f30722a.addAll(list);
        this.f30722a.notifyDataSetChanged();
    }
}
