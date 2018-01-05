package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.android.setupwizardlib.b;
import com.android.setupwizardlib.c;
import com.android.setupwizardlib.d;
import com.android.setupwizardlib.e;

public class NavigationBar extends LinearLayout implements View$OnClickListener
{

    public Button a;
    public Button b;
    public Button c;
    public com.android.setupwizardlib.view.f d;

    NavigationBar(Context p0) {
        LinearLayout(NavigationBar.a(p0));
        this.a();
    }

    NavigationBar(Context p0, AttributeSet p1) {
        LinearLayout(NavigationBar.a(p0), p1);
        this.a();
    }

    NavigationBar(Context p0, AttributeSet p1, int p2) {
        LinearLayout(NavigationBar.a(p0), p1, p2);
        this.a();
    }

    private static Context a(Context p0) {
        v0 = new int[3];
        v0[0] = com.android.setupwizardlib.b.suwNavBarTheme;
        v0[1] = 16842800;
        v0[2] = 16842801;
        v3 = p0.obtainStyledAttributes(v0);
        v0 = v3.getResourceId(0, 0);
        if (v0 == 0) {
            v0 = new float[3];
            v4 = new float[3];
            Color.colorToHSV(v3.getColor(1, 0), v0);
            Color.colorToHSV(v3.getColor(2, 0), v4);
            if (v0[2] > v4[2])
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                v0 = com.android.setupwizardlib.e.SuwNavBarThemeDark;
            else
                v0 = com.android.setupwizardlib.e.SuwNavBarThemeLight;
        }
        v3.recycle();
        return new ContextThemeWrapper(p0, v0);
    }

    private final void a() {
        View.inflate(this.getContext(), com.android.setupwizardlib.d.suw_navbar_view, this);
        this.a = (Button)this.findViewById(com.android.setupwizardlib.c.suw_navbar_next);
        this.b = (Button)this.findViewById(com.android.setupwizardlib.c.suw_navbar_back);
        this.c = (Button)this.findViewById(com.android.setupwizardlib.c.suw_navbar_more);
    }

    public Button getBackButton() {
        return this.b;
    }

    public Button getMoreButton() {
        return this.c;
    }

    public Button getNextButton() {
        return this.a;
    }

    public void onClick(View p0) {
        if (this.d != 0) {
            if (p0 == this.getBackButton())
                this.d.a();
            else if (p0 == this.getNextButton())
                this.d.b();
        }
    }

    public void setNavigationBarListener(com.android.setupwizardlib.view.f p0) {
        this.d = p0;
        if (this.d != 0) {
            this.getBackButton().setOnClickListener(this);
            this.getNextButton().setOnClickListener(this);
        }
    }

}
