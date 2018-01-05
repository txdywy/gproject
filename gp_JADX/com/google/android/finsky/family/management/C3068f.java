package com.google.android.finsky.family.management;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.squareup.leakcanary.C7582R;

final class C3068f {
    public View f15967a;
    public TextView f15968b;
    public TextView f15969c;
    public ImageView f15970d;

    C3068f(View view, int i, int i2, int i3, int i4) {
        this.f15967a = view.findViewById(i);
        this.f15968b = (TextView) this.f15967a.findViewById(i2);
        this.f15969c = (TextView) this.f15967a.findViewById(i3);
        this.f15970d = (ImageView) this.f15967a.findViewById(i4);
    }

    final void m15777a(String str, String str2, int i, OnClickListener onClickListener) {
        this.f15967a.setVisibility(0);
        this.f15968b.setText(str);
        if (str2 != null) {
            this.f15969c.setText(str2);
        }
        this.f15970d.setImageDrawable(C0722q.m4782a(this.f15970d.getResources(), i, new as().m4592a(this.f15970d.getResources().getColor(C7582R.color.play_fg_secondary))));
        if (onClickListener == null) {
            this.f15967a.setBackgroundDrawable(null);
        } else {
            this.f15967a.setOnClickListener(onClickListener);
        }
    }

    final void m15776a() {
        this.f15967a.setVisibility(8);
    }
}
