package com.google.android.finsky.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.permissionui.AppSecurityPermissions;
import com.google.android.finsky.permissionui.C3874e;
import com.squareup.leakcanary.C7582R;

public final class ei extends Fragment {
    public TextView f6708a;
    public TextView f6709b;
    public TextView f6710c;
    public AppSecurityPermissions f6711d;

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C7582R.layout.install_approval_layout, viewGroup, false);
        this.f6708a = (TextView) inflate.findViewById(C7582R.id.title);
        this.f6709b = (TextView) inflate.findViewById(C7582R.id.progress_text);
        this.f6710c = (TextView) inflate.findViewById(C7582R.id.content_text);
        this.f6711d = (AppSecurityPermissions) inflate.findViewById(C7582R.id.app_permissions);
        Resources i = m605i();
        Bundle bundle2 = this.f760q;
        this.f6709b.setText(i.getString(C7582R.string.install_approval_progress_text, new Object[]{Integer.valueOf(bundle2.getInt("InstallApprovalFragment.installNumber")), Integer.valueOf(bundle2.getInt("InstallApprovalFragment.totalInstalls"))}));
        switch (bundle2.getInt("InstallApprovalFragment.approvalType")) {
            case 1:
                this.f6708a.setText(C7582R.string.install_approval_auto_update_disabled_title);
                this.f6710c.setText(Html.fromHtml(i.getString(C7582R.string.install_approval_auto_update_disabled_text, new Object[]{bundle2.getString("InstallApprovalFragment.packageTitle")})));
                this.f6710c.setVisibility(0);
                this.f6711d.setVisibility(8);
                break;
            case 2:
                int i2;
                this.f6708a.setText(C7582R.string.permissions_title);
                String string = bundle2.getString("InstallApprovalFragment.packageName");
                String[] stringArray = bundle2.getStringArray("InstallApprovalFragment.permissions");
                boolean b = C1473m.f7980a.aV().m11998b(C1473m.f7980a.mo2169c(), string);
                C3874e a = C1473m.f7980a.bU().m18370a(m603h(), string, stringArray, b, false);
                this.f6711d.m18358a(a, this.f760q.getString("InstallApprovalFragment.packageTitle"));
                this.f6711d.setVisibility(0);
                this.f6710c.setVisibility(0);
                if (a.mo3828a() && b) {
                    i2 = C7582R.string.app_also_needs_access_to;
                } else {
                    i2 = C7582R.string.app_needs_access_to;
                }
                this.f6710c.setText(Html.fromHtml(i.getString(i2, new Object[]{r1})));
                break;
            case 3:
                this.f6708a.setText(C7582R.string.install_approval_large_size_title);
                this.f6710c.setText(Html.fromHtml(i.getString(C7582R.string.install_approval_large_size_text, new Object[]{bundle2.getString("InstallApprovalFragment.packageTitle")})));
                this.f6710c.setVisibility(0);
                this.f6711d.setVisibility(8);
                break;
        }
        return inflate;
    }
}
