package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.p040a.C0402i;
import android.view.LayoutInflater;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public final class C0455e extends ContextWrapper {
    public int f2555a;
    public Theme f2556b;
    public LayoutInflater f2557c;
    public Configuration f2558d;

    public C0455e() {
        super(null);
    }

    public final Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public C0455e(Context context, int i) {
        super(context);
        this.f2555a = i;
    }

    public C0455e(Context context, Theme theme) {
        super(context);
        this.f2556b = theme;
    }

    public final void setTheme(int i) {
        if (this.f2555a != i) {
            this.f2555a = i;
            m2687a();
        }
    }

    public final Theme getTheme() {
        if (this.f2556b != null) {
            return this.f2556b;
        }
        if (this.f2555a == 0) {
            this.f2555a = C0402i.Theme_AppCompat_Light;
        }
        m2687a();
        return this.f2556b;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2557c == null) {
            this.f2557c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2557c;
    }

    private final void m2687a() {
        if (this.f2556b == null) {
            this.f2556b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2556b.setTo(theme);
            }
        }
        this.f2556b.applyStyle(this.f2555a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        return (this.f2558d == null || VERSION.SDK_INT < 17) ? C6331c.m28981a(this) : C6331c.m28981a(createConfigurationContext(this.f2558d));
    }
}
