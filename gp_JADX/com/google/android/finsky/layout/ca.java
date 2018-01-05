package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

final class ca implements OnClickListener {
    public final View f18559a;
    public final View f18560b;
    public final FifeImageView f18561c;
    public final TextView f18562d;
    public final View f18563e;
    public final CheckBox f18564f;
    public int f18565g;
    public final /* synthetic */ by f18566h;

    public ca(by byVar, View view) {
        this.f18566h = byVar;
        this.f18559a = view;
        this.f18560b = view.findViewById(C7582R.id.row_divider);
        this.f18561c = (FifeImageView) view.findViewById(C7582R.id.app_icon);
        this.f18562d = (TextView) view.findViewById(C7582R.id.app_title);
        this.f18563e = view.findViewById(C7582R.id.app_required_subtitle);
        this.f18564f = (CheckBox) view.findViewById(C7582R.id.checkable_item);
    }

    public final void onClick(View view) {
        if (this.f18566h.f18555g != null) {
            this.f18566h.f18555g.mo3915a(this.f18566h.f18553e[this.f18565g], this.f18565g, this.f18566h.f18554f[this.f18565g]);
        }
    }
}
