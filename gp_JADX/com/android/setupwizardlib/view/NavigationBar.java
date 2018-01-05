package com.android.setupwizardlib.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.android.setupwizardlib.C0608b;
import com.android.setupwizardlib.C0609c;
import com.android.setupwizardlib.C0610d;
import com.android.setupwizardlib.C0611e;

public class NavigationBar extends LinearLayout implements OnClickListener {
    public Button f3979a;
    public Button f3980b;
    public Button f3981c;
    public C0622f f3982d;

    private static Context m4260a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0608b.suwNavBarTheme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            resourceId = ((fArr[2] > fArr2[2] ? 1 : (fArr[2] == fArr2[2] ? 0 : -1)) > 0 ? 1 : 0) != 0 ? C0611e.SuwNavBarThemeDark : C0611e.SuwNavBarThemeLight;
        }
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public NavigationBar(Context context) {
        super(m4260a(context));
        m4261a();
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(m4260a(context), attributeSet);
        m4261a();
    }

    @TargetApi(11)
    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(m4260a(context), attributeSet, i);
        m4261a();
    }

    private final void m4261a() {
        View.inflate(getContext(), C0610d.suw_navbar_view, this);
        this.f3979a = (Button) findViewById(C0609c.suw_navbar_next);
        this.f3980b = (Button) findViewById(C0609c.suw_navbar_back);
        this.f3981c = (Button) findViewById(C0609c.suw_navbar_more);
    }

    public Button getBackButton() {
        return this.f3980b;
    }

    public Button getNextButton() {
        return this.f3979a;
    }

    public Button getMoreButton() {
        return this.f3981c;
    }

    public void setNavigationBarListener(C0622f c0622f) {
        this.f3982d = c0622f;
        if (this.f3982d != null) {
            getBackButton().setOnClickListener(this);
            getNextButton().setOnClickListener(this);
        }
    }

    public void onClick(View view) {
        if (this.f3982d == null) {
            return;
        }
        if (view == getBackButton()) {
            this.f3982d.m4281a();
        } else if (view == getNextButton()) {
            this.f3982d.m4282b();
        }
    }
}
