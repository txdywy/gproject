package com.google.android.finsky.permissionui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.cq.C2360a;
import com.google.android.finsky.cq.C2361b;
import com.google.android.finsky.cq.C2362c;
import com.google.android.finsky.cq.C2363d;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C3878d extends C3874e {
    public final List f19298a = new ArrayList();
    public final LayoutInflater f19299b;
    public final Context f19300c;
    public final boolean f19301d;

    public C3878d(Context context, C2363d c2363d, C2360a c2360a, String str, String[] strArr, boolean z) {
        C2362c a;
        this.f19300c = context;
        this.f19299b = LayoutInflater.from(context);
        PackageInfo a2 = C3875a.m18361a(context.getPackageManager(), str);
        this.f19301d = a2 != null;
        Collection a3 = C3875a.m18364a(a2);
        Set set = null;
        if (a3 != null) {
            Collection hashSet = new HashSet(Arrays.asList(strArr));
            hashSet.removeAll(a3);
            set = new HashSet(Arrays.asList(strArr));
            set.removeAll(hashSet);
        }
        if (z) {
            a = c2360a.m11984a(strArr, set);
        } else {
            a = c2363d.m11995a(strArr, set, true, true);
        }
        this.f19298a.addAll(a.m11987a());
    }

    public final int getCount() {
        return this.f19298a.size();
    }

    public final Object getItem(int i) {
        return this.f19298a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean mo3828a() {
        return this.f19301d;
    }

    public final boolean mo3829c() {
        return this.f19298a.size() == 0;
    }

    @SuppressLint({"ViewHolder"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C2361b c2361b = (C2361b) this.f19298a.get(i);
        View inflate = this.f19299b.inflate(C7582R.layout.permission_row, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.header);
        TextView textView2 = (TextView) inflate.findViewById(C7582R.id.content);
        ImageView imageView = (ImageView) inflate.findViewById(C7582R.id.bucket_icon);
        ((ImageView) inflate.findViewById(C7582R.id.expander_icon)).setVisibility(8);
        textView.setText(c2361b.f11584b);
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = c2361b.f11587e.size() > 0 ? 1 : null;
        for (int i2 = 0; i2 < c2361b.f11588f.size(); i2++) {
            String string;
            if (this.f19301d) {
                string = this.f19300c.getString(C7582R.string.new_permission, new Object[]{c2361b.f11588f.get(i2)});
            } else {
                string = (String) c2361b.f11588f.get(i2);
            }
            stringBuilder.append(this.f19300c.getString(C7582R.string.bulleted_line_item, new Object[]{string}));
            if (i2 < c2361b.f11588f.size() - 1 || obj != null) {
                stringBuilder.append("<br>");
            }
        }
        for (int i3 = 0; i3 < c2361b.f11587e.size(); i3++) {
            stringBuilder.append(this.f19300c.getString(C7582R.string.bulleted_line_item, new Object[]{c2361b.f11587e.get(i3)}));
            if (i3 < c2361b.f11587e.size() - 1) {
                stringBuilder.append("<br>");
            }
        }
        textView2.setText(Html.fromHtml(stringBuilder.toString()));
        imageView.setImageResource(c2361b.f11586d);
        textView2.setVisibility(0);
        return inflate;
    }
}
