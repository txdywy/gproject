package com.google.android.finsky.settings;

import android.preference.Preference;
import android.widget.ListAdapter;

final class C4104o implements Runnable {
    public final /* synthetic */ SettingsActivity f20528a;

    C4104o(SettingsActivity settingsActivity) {
        this.f20528a = settingsActivity;
    }

    public final void run() {
        String stringExtra = this.f20528a.getIntent().getStringExtra("setting-key-to-scroll");
        ListAdapter adapter = this.f20528a.getListView().getAdapter();
        if (adapter != null) {
            int i = 0;
            while (i < adapter.getCount()) {
                if ((adapter.getItem(i) instanceof Preference) && stringExtra.equals(((Preference) adapter.getItem(i)).getKey())) {
                    this.f20528a.getListView().setSelection(i);
                    return;
                }
                i++;
            }
        }
    }
}
