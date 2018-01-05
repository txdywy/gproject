package com.google.android.finsky.activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.cq.d;
import com.google.android.finsky.m;
import com.google.android.finsky.permissionui.AppSecurityPermissions;
import com.google.android.finsky.permissionui.e;
import com.google.android.finsky.permissionui.f;

public final class com.google.android.finsky.activities.ei extends Fragment
{

    public TextView a;
    public TextView b;
    public TextView c;
    public AppSecurityPermissions d;

    ei() {
        Fragment();
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v6 = p0.inflate(2130969605, p1, 0);
        this.a = (TextView)v6.findViewById(2131755114);
        this.b = (TextView)v6.findViewById(2131755398);
        this.c = (TextView)v6.findViewById(2131756224);
        this.d = (AppSecurityPermissions)v6.findViewById(2131756072);
        v7 = this.i();
        v3 = new Object[2];
        v3[0] = Integer.valueOf(this.q.getInt("InstallApprovalFragment.installNumber"));
        v3[1] = Integer.valueOf(this.q.getInt("InstallApprovalFragment.totalInstalls"));
        this.b.setText(v7.getString(2131952302, v3));
        switch (this.q.getInt("InstallApprovalFragment.approvalType")) {
            case 1:
                this.a.setText(2131952295);
                v3 = new Object[1];
                v3[0] = this.q.getString("InstallApprovalFragment.packageTitle");
                this.c.setText(Html.fromHtml(v7.getString(2131952294, v3)));
                this.c.setVisibility(0);
                this.d.setVisibility(8);
                break;
            case 2:
                this.a.setText(2131952839);
                v2 = this.q.getString("InstallApprovalFragment.packageName");
                v4 = com.google.android.finsky.m.a.aV().b(com.google.android.finsky.m.a.c(), v2);
                v0 = com.google.android.finsky.m.a.bU().a(this.h(), v2, this.q.getStringArray("InstallApprovalFragment.permissions"), v4, 0);
                v1 = this.q.getString("InstallApprovalFragment.packageTitle");
                this.d.a(v0, v1);
                this.d.setVisibility(0);
                this.c.setVisibility(0);
                if (v0.a() && v4 != 0)
                    v0 = 2131951697;
                else
                    v0 = 2131951703;
                v3 = new Object[1];
                v3[0] = v1;
                this.c.setText(Html.fromHtml(v7.getString(v0, v3)));
                break;
            case 3:
                this.a.setText(2131952298);
                v3 = new Object[1];
                v3[0] = this.q.getString("InstallApprovalFragment.packageTitle");
                this.c.setText(Html.fromHtml(v7.getString(2131952297, v3)));
                this.c.setVisibility(0);
                this.d.setVisibility(8);
                break;
            default:
                break;
        }
        return v6;
    }

}
