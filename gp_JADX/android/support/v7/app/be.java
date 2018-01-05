package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.p040a.C0394a;
import android.support.v7.view.C0412b;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class be extends Dialog implements ab {
    public ac f718f;

    public be(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0394a.dialogTheme, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        m535b().mo523a(null);
        m535b().mo508l();
    }

    public void onCreate(Bundle bundle) {
        m535b().mo541k();
        super.onCreate(bundle);
        m535b().mo523a(bundle);
    }

    public void setContentView(int i) {
        m535b().mo531b(i);
    }

    public void setContentView(View view) {
        m535b().mo526a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m535b().mo527a(view, layoutParams);
    }

    public View findViewById(int i) {
        return m535b().mo522a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m535b().mo501a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m535b().mo501a(getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m535b().mo532b(view, layoutParams);
    }

    protected void onStop() {
        super.onStop();
        m535b().mo505f();
    }

    public final boolean m536a() {
        return m535b().mo535c(1);
    }

    public void invalidateOptionsMenu() {
        m535b().mo540h();
    }

    private final ac m535b() {
        if (this.f718f == null) {
            this.f718f = ac.m2349a(getContext(), getWindow(), this);
        }
        return this.f718f;
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final C0412b D_() {
        return null;
    }
}
