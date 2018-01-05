package com.google.android.finsky.uninstall.v2a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.Html;
import com.google.android.play.utils.UrlSpanUtils;
import com.squareup.leakcanary.C7582R;

public final class as implements ar {
    public Context f23738a;

    public as(Context context) {
        this.f23738a = context;
    }

    public final CharSequence mo4294a() {
        return this.f23738a.getString(C7582R.string.uninstall_manager_title_v2);
    }

    public final CharSequence mo4296b() {
        PackageManager packageManager = this.f23738a.getPackageManager();
        Intent intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
        if (intent.resolveActivity(packageManager) == null) {
            intent = new Intent("android.intent.action.MANAGE_PACKAGE_STORAGE");
            if (intent.resolveActivity(packageManager) == null) {
                return this.f23738a.getString(C7582R.string.uninstall_manager_no_installation_subtitle_fallback);
            }
        }
        CharSequence fromHtml = Html.fromHtml(this.f23738a.getString(C7582R.string.uninstall_manager_no_installation_subtitle_exact));
        UrlSpanUtils.a(fromHtml, null, new at(this, intent));
        return fromHtml;
    }

    public final String mo4297c() {
        return this.f23738a.getString(C7582R.string.continue_text);
    }

    public final String mo4298d() {
        return this.f23738a.getString(C7582R.string.cancel);
    }

    public final String mo4295a(boolean z, int i) {
        if (i == 0) {
            return this.f23738a.getString(C7582R.string.uninstall_manager_cleanup_wizard_confirmation);
        }
        if (z) {
            return this.f23738a.getResources().getQuantityString(C7582R.plurals.uninstall_manager_app_uninstallation_progress_updates_v2, i);
        }
        return this.f23738a.getResources().getQuantityString(C7582R.plurals.uninstall_manager_app_uninstallation_progress_installs_v2, i);
    }
}
