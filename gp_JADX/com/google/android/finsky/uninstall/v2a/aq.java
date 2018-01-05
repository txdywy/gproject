package com.google.android.finsky.uninstall.v2a;

import android.content.Context;
import com.squareup.leakcanary.C7582R;

public final class aq implements ar {
    public Context f23737a;

    public aq(Context context) {
        this.f23737a = context;
    }

    public final CharSequence mo4294a() {
        return this.f23737a.getString(C7582R.string.uninstall_manager_cleanup_wizard_title);
    }

    public final CharSequence mo4296b() {
        return this.f23737a.getString(C7582R.string.uninstall_manager_cleanup_wizard_subtitle);
    }

    public final String mo4297c() {
        return this.f23737a.getString(C7582R.string.uninstall_manager_cleanup_wizard_positive_button_text);
    }

    public final String mo4298d() {
        return this.f23737a.getString(C7582R.string.uninstall_manager_cleanup_wizard_negative_button_text);
    }

    public final String mo4295a(boolean z, int i) {
        return this.f23737a.getString(C7582R.string.uninstall_manager_cleanup_wizard_confirmation);
    }
}
