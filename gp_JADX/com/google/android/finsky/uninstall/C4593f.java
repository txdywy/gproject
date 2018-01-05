package com.google.android.finsky.uninstall;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C4593f extends C1155g implements OnClickListener, ad {
    public final CheckBox f23596A;
    public C4590g f23597t;
    public Context f23598u;
    public ad f23599v;
    public ce f23600w;
    public final FifeImageView f23601x;
    public final TextView f23602y;
    public final TextView f23603z;

    public C4593f(View view, Context context, ad adVar) {
        super(view);
        this.f23598u = context;
        this.f23599v = adVar;
        this.f23601x = (FifeImageView) view.findViewById(C7582R.id.uninstall_row_icon);
        this.f23602y = (TextView) view.findViewById(C7582R.id.uninstall_row_title);
        this.f23603z = (TextView) view.findViewById(C7582R.id.uninstall_row_subtitle);
        this.f23596A = (CheckBox) view.findViewById(C7582R.id.uninstall_row_checkbox);
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        if (this.f23597t != null) {
            boolean z = !this.f23596A.isChecked();
            this.f23596A.setChecked(z);
            if (C1601a.m9200a(this.f23598u)) {
                int i;
                if (z) {
                    i = C7582R.string.uninstall_manager_app_selected_accessibility;
                } else {
                    i = C7582R.string.uninstall_manager_app_deselected_accessibility;
                }
                C1601a.m9199a(this.f23598u, this.f23598u.getString(i, new Object[]{this.f23602y.getText()}), this.f23596A, false);
            }
            this.f23597t.o_(m3267d());
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f23600w;
    }

    public final ad getParentNode() {
        return this.f23599v;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("unwanted children", new Object[0]);
    }
}
