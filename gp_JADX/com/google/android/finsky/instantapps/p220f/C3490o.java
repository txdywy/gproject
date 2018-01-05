package com.google.android.finsky.instantapps.p220f;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.instantapps.common.p219f.C3489g;
import com.squareup.leakcanary.C7582R;

final class C3490o implements C3489g {
    public final /* synthetic */ boolean f17692a;
    public final /* synthetic */ int f17693b;
    public final /* synthetic */ int f17694c;

    C3490o(boolean z, int i, int i2) {
        this.f17692a = z;
        this.f17693b = i;
        this.f17694c = i2;
    }

    public final void mo3536a(View view) {
        ImageView imageView = (ImageView) view.findViewById(C7582R.id.aia_settings_header_divider);
        if (this.f17692a) {
            imageView.setVisibility(0);
        }
        TextView textView = (TextView) view.findViewById(C7582R.id.aia_settings_description);
        ((TextView) view.findViewById(C7582R.id.aia_settings_header)).setText(this.f17693b);
        textView.setText(this.f17694c);
    }
}
