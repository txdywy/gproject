package com.google.android.finsky.billing.common;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.C0254u;
import android.support.v7.app.ac;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class C1646b extends C0254u {
    public ac f8574x;

    public boolean mo2591g() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        ac f = mo2368f();
        if (f != null) {
            f.mo541k();
            f.mo523a(bundle);
        }
        super.onCreate(bundle);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ac f = mo2368f();
        if (f != null) {
            f.mo534c();
        }
    }

    public MenuInflater getMenuInflater() {
        ac f = mo2368f();
        if (f != null) {
            return f.mo502b();
        }
        return super.getMenuInflater();
    }

    public void setContentView(int i) {
        ac f = mo2368f();
        if (f != null) {
            f.mo531b(i);
        } else {
            super.setContentView(i);
        }
    }

    public void setContentView(View view) {
        ac f = mo2368f();
        if (f != null) {
            f.mo526a(view);
        } else {
            super.setContentView(view);
        }
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        ac f = mo2368f();
        if (f != null) {
            f.mo527a(view, layoutParams);
        } else {
            super.setContentView(view, layoutParams);
        }
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        ac f = mo2368f();
        if (f != null) {
            f.mo532b(view, layoutParams);
        } else {
            super.addContentView(view, layoutParams);
        }
    }

    protected void onPostResume() {
        super.onPostResume();
        ac f = mo2368f();
        if (f != null) {
            f.mo539g();
        }
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        ac f = mo2368f();
        if (f != null) {
            f.mo501a(charSequence);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ac f = mo2368f();
        if (f != null) {
            f.mo536d();
        }
    }

    public void onStop() {
        super.onStop();
        ac f = mo2368f();
        if (f != null) {
            f.mo505f();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ac f = mo2368f();
        if (f != null) {
            f.mo506i();
        }
    }

    public void invalidateOptionsMenu() {
        ac f = mo2368f();
        if (f != null) {
            f.mo540h();
        } else {
            super.invalidateOptionsMenu();
        }
    }

    private final ac mo2368f() {
        if (mo2591g()) {
            return null;
        }
        if (this.f8574x == null) {
            this.f8574x = ac.m2348a((Activity) this, null);
        }
        return this.f8574x;
    }
}
