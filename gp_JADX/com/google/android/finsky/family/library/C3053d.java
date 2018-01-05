package com.google.android.finsky.family.library;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ai;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.cs;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.stream.base.C1169s;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C3053d extends C1169s implements OnClickListener {
    public final int f15927a;
    public final C3060k f15928b;
    public boolean f15929c;
    public String f15930d;

    public C3053d(C3060k c3060k, int i) {
        this.f15928b = c3060k;
        this.f15927a = i;
    }

    public final int mo1508a() {
        return 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.family_library_filter_selection_bar;
    }

    public final void mo1510a(View view, int i) {
        int i2 = 1;
        TextView textView = (TextView) view.findViewById(C7582R.id.family_library_filter_text);
        if (ai.f1848a.mo400k(view) != 1) {
            i2 = 0;
        }
        textView.setGravity(i2 != 0 ? 3 : 5);
        textView.setText(this.f15930d);
        ImageView imageView = (ImageView) view.findViewById(C7582R.id.family_library_filter_icon);
        if (this.f15929c) {
            i2 = C1608h.m9243a(C1473m.f7980a.f7981b, this.f15927a);
        } else {
            i2 = C1608h.m9243a(C1473m.f7980a.f7981b, 0);
        }
        imageView.setImageDrawable(new cs(C0722q.m4784a(C1473m.f7980a.f7981b, (int) C7582R.raw.ic_filter_list_grey600_24dp), new as().m4593b(i2)));
        view.setOnClickListener(this);
    }

    public final void mo1511b(View view, int i) {
    }

    public final void onClick(View view) {
        C3060k c3060k = this.f15928b;
        if (c3060k.f15953x != null && !c3060k.f15953x.isEmpty()) {
            Fragment fragment = c3060k.a;
            ArrayList arrayList = c3060k.f15953x;
            int i = c3060k.f15954y;
            int i2 = c3060k.f15948s;
            Fragment c3055f = new C3055f();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("filter_options", arrayList);
            bundle.putInt("selected_filter", i);
            bundle.putInt("backend", i2);
            c3055f.m600f(bundle);
            c3055f.m581a(fragment, 1);
            c3055f.m625a(c3060k.a.f730B, "family-library-filter-dialog");
        }
    }
}
