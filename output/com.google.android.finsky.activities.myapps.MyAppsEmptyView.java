package com.google.android.finsky.activities.myapps;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.play.utils.b.a;

protected class MyAppsEmptyView extends ScrollView
{

    public TextView a;
    public TextView b;
    public View c;
    public View d;

    MyAppsEmptyView(Context p0) {
        ScrollView(p0);
    }

    MyAppsEmptyView(Context p0, AttributeSet p1) {
        ScrollView(p0, p1);
    }

    public final void a(DfeToc p0, com.google.android.finsky.navigationmanager.a p1, boolean p2, int p3, com.google.android.finsky.d.w p4) {
        if (p2 != 0)
            this.a.setText(com.google.android.finsky.m.a.U().d(com.google.android.finsky.m.a.cY()));
        else
            this.a.setVisibility(8);
        this.b.setText(p3);
        if (p0 == 0)
            v0 = 0;
        else
            v0 = p0.a(3);
        if (v0 == 0)
            this.c.setVisibility(8);
        else
            this.c.setOnClickListener(new com.google.android.finsky.activities.myapps.c(p1, v0, p0, p4));
        v3 = (String)com.google.android.finsky.aa.b.p.b();
        if (p0 == 0 || (TextUtils.isEmpty(v3)) || com.google.android.finsky.m.a.M().a())
            this.d.setVisibility(8);
        else
            this.d.setOnClickListener(new com.google.android.finsky.activities.myapps.d(this, p1, v3, p0, p4));
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView)this.findViewById(2131755339);
        this.b = (TextView)this.findViewById(2131756261);
        this.c = this.findViewById(2131756262);
        this.d = this.findViewById(2131756263);
    }

}
