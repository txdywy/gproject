package com.google.android.finsky.uninstall.v2a;

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

public final class C4608a extends C1155g implements OnClickListener, ad {
    public final TextView f23689A;
    public final CheckBox f23690B;
    public C4609b f23691t;
    public Context f23692u;
    public ad f23693v;
    public ce f23694w;
    public final FifeImageView f23695x;
    public final TextView f23696y;
    public final TextView f23697z;

    public C4608a(View view, Context context, ad adVar) {
        super(view);
        this.f23692u = context;
        this.f23693v = adVar;
        this.f23695x = (FifeImageView) view.findViewById(C7582R.id.uninstall_row_icon);
        this.f23696y = (TextView) view.findViewById(C7582R.id.uninstall_row_title);
        this.f23697z = (TextView) view.findViewById(C7582R.id.uninstall_row_size);
        this.f23689A = (TextView) view.findViewById(C7582R.id.uninstall_row_last_used_timestamp);
        this.f23690B = (CheckBox) view.findViewById(C7582R.id.uninstall_row_checkbox);
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        if (this.f23691t != null) {
            boolean z = !this.f23690B.isChecked();
            this.f23690B.setChecked(z);
            if (C1601a.m9200a(this.f23692u)) {
                int i;
                if (z) {
                    i = C7582R.string.uninstall_manager_app_selected_accessibility;
                } else {
                    i = C7582R.string.uninstall_manager_app_deselected_accessibility;
                }
                C1601a.m9199a(this.f23692u, this.f23692u.getString(i, new Object[]{this.f23696y.getText()}), this.f23690B, false);
            }
            this.f23691t.p_(m3267d());
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f23694w;
    }

    public final ad getParentNode() {
        return this.f23693v;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("unwanted children", new Object[0]);
    }
}
