package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0234a;
import android.support.v4.app.C0254u;
import android.support.v4.app.ca;
import android.support.v4.app.cs;
import android.support.v4.app.ct;
import android.support.v7.view.C0412b;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.hv;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public class aa extends C0254u implements ct, ab, C0405g {
    public ac f2241n;
    public int f2242o = 0;
    public Resources f2243p;

    public void onCreate(Bundle bundle) {
        ac G_ = G_();
        G_.mo541k();
        G_.mo523a(bundle);
        if (G_.mo508l() && this.f2242o != 0) {
            if (VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f2242o, false);
            } else {
                setTheme(this.f2242o);
            }
        }
        super.onCreate(bundle);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        this.f2242o = i;
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        G_().mo534c();
    }

    public final void m2347a(Toolbar toolbar) {
        G_().mo525a(toolbar);
    }

    public MenuInflater getMenuInflater() {
        return G_().mo502b();
    }

    public void setContentView(int i) {
        G_().mo531b(i);
    }

    public void setContentView(View view) {
        G_().mo526a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        G_().mo527a(view, layoutParams);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        G_().mo532b(view, layoutParams);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        G_().mo536d();
        if (this.f2243p != null) {
            this.f2243p.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onPostResume() {
        super.onPostResume();
        G_().mo539g();
    }

    public void onStart() {
        super.onStart();
        G_().mo504e();
    }

    public void onStop() {
        super.onStop();
        G_().mo505f();
    }

    public View findViewById(int i) {
        return G_().mo522a(i);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C0404a a = G_().mo500a();
        if (menuItem.getItemId() != 16908332 || a == null || (a.mo569b() & 4) == 0) {
            return false;
        }
        return E_();
    }

    public void onDestroy() {
        super.onDestroy();
        G_().mo506i();
    }

    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        G_().mo501a(charSequence);
    }

    public final void A_() {
        G_().mo540h();
    }

    public void invalidateOptionsMenu() {
        G_().mo540h();
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final C0412b D_() {
        return null;
    }

    public boolean E_() {
        Intent a = ca.m1401a(this);
        if (a == null) {
            return false;
        }
        if (ca.m1403a((Activity) this, a)) {
            Intent a2;
            cs a3 = cs.m1445a((Context) this);
            a = null;
            if (this instanceof ct) {
                a = a_();
            }
            if (a == null) {
                a2 = ca.m1401a(this);
            } else {
                a2 = a;
            }
            if (a2 != null) {
                ComponentName component = a2.getComponent();
                if (component == null) {
                    component = a2.resolveActivity(a3.f1555b.getPackageManager());
                }
                a3.m1446a(component);
                a3.m1447a(a2);
            }
            a3.m1448a();
            try {
                C0234a.m1140a(this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else if (VERSION.SDK_INT >= 16) {
            navigateUpTo(a);
        } else {
            a.addFlags(67108864);
            startActivity(a);
            finish();
        }
        return true;
    }

    public final Intent a_() {
        return ca.m1401a(this);
    }

    public void onContentChanged() {
    }

    public final C0406f F_() {
        return G_().mo507j();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        G_().mo503b(bundle);
    }

    public final ac G_() {
        if (this.f2241n == null) {
            this.f2241n = ac.m2348a((Activity) this, (ab) this);
        }
        return this.f2241n;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0404a a = G_().mo500a();
        if (keyCode == 82 && a != null && a.mo568a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Resources getResources() {
        if (this.f2243p == null && hv.m3848a()) {
            this.f2243p = new hv(this, super.getResources());
        }
        return this.f2243p == null ? super.getResources() : this.f2243p;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (!(VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()))) {
            Window window = getWindow();
            if (!(window == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent))) {
                z = true;
                if (z) {
                    return super.onKeyDown(i, keyEvent);
                }
                return true;
            }
        }
        z = false;
        if (z) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public void openOptionsMenu() {
        C0404a a = G_().mo500a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.mo583j()) {
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        C0404a a = G_().mo500a();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (a == null || !a.mo584k()) {
            super.closeOptionsMenu();
        }
    }
}
