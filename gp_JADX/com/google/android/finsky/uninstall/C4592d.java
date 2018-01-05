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

public final class C4592d extends C1155g implements OnClickListener, ad {
    public final TextView f23587A;
    public final CheckBox f23588B;
    public C4589e f23589t;
    public Context f23590u;
    public ad f23591v;
    public ce f23592w;
    public final FifeImageView f23593x;
    public final TextView f23594y;
    public final TextView f23595z;

    public C4592d(View view, Context context, ad adVar) {
        super(view);
        this.f23590u = context;
        this.f23591v = adVar;
        this.f23593x = (FifeImageView) view.findViewById(C7582R.id.uninstall_row_icon);
        this.f23594y = (TextView) view.findViewById(C7582R.id.uninstall_row_title);
        this.f23595z = (TextView) view.findViewById(C7582R.id.uninstall_row_size);
        this.f23587A = (TextView) view.findViewById(C7582R.id.uninstall_row_last_used_timestamp);
        this.f23588B = (CheckBox) view.findViewById(C7582R.id.uninstall_row_checkbox);
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        if (this.f23589t != null) {
            boolean z = !this.f23588B.isChecked();
            this.f23588B.setChecked(z);
            if (C1601a.m9200a(this.f23590u)) {
                int i;
                if (z) {
                    i = C7582R.string.uninstall_manager_app_selected_accessibility;
                } else {
                    i = C7582R.string.uninstall_manager_app_deselected_accessibility;
                }
                C1601a.m9199a(this.f23590u, this.f23590u.getString(i, new Object[]{this.f23594y.getText()}), this.f23588B, false);
            }
            this.f23589t.o_(m3267d());
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f23592w;
    }

    public final ad getParentNode() {
        return this.f23591v;
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("unwanted children", new Object[0]);
    }
}
