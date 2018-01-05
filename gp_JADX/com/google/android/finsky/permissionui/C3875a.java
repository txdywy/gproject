package com.google.android.finsky.permissionui;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v7.widget.eq;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.cq.C2360a;
import com.google.android.finsky.cq.C2361b;
import com.google.android.finsky.cq.C2362c;
import com.google.android.finsky.cq.C2363d;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C3875a extends C3874e {
    public final List f19285a = new ArrayList();
    public final List f19286b = new ArrayList();
    public LayoutInflater f19287c;
    public Context f19288d;
    public final boolean f19289e;

    C3875a(Context context, C2363d c2363d, C2360a c2360a, String str, String[] strArr, boolean z, boolean z2) {
        C2362c a;
        int i = 0;
        this.f19288d = context;
        this.f19287c = LayoutInflater.from(context);
        PackageInfo a2 = C3875a.m18361a(context.getPackageManager(), str);
        this.f19289e = a2 != null;
        Set a3 = C3875a.m18364a(a2);
        if (z2) {
            a = c2360a.m11984a(strArr, a3);
        } else {
            a = c2363d.m11994a(strArr, a3, z);
        }
        C2361b[] c2361bArr = a.f11589a;
        while (i < c2361bArr.length) {
            C2361b c2361b = c2361bArr[i];
            if (c2361b != null) {
                boolean a4 = c2361b.m11985a();
                boolean b = c2361b.m11986b();
                if (i == a.f11590b) {
                    if (b) {
                        this.f19286b.add(c2361b);
                    }
                    if (a4) {
                        this.f19285a.add(c2361b);
                    }
                } else if (a4) {
                    this.f19285a.add(c2361b);
                } else if (b) {
                    this.f19286b.add(c2361b);
                }
            }
            i++;
        }
    }

    public final boolean mo3828a() {
        return this.f19289e;
    }

    public final int getCount() {
        return this.f19286b.size() + Math.min(1, this.f19285a.size());
    }

    public final Object getItem(int i) {
        if (i < this.f19286b.size()) {
            return this.f19286b.get(i);
        }
        return this.f19285a;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean m18366b() {
        return this.f19286b.size() > 0;
    }

    public final boolean mo3829c() {
        return !m18366b();
    }

    public static Set m18364a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        Set hashSet = new HashSet();
        if (packageInfo.requestedPermissions == null) {
            return hashSet;
        }
        for (Object add : packageInfo.requestedPermissions) {
            hashSet.add(add);
        }
        return hashSet;
    }

    public static PackageInfo m18361a(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, eq.FLAG_APPEARED_IN_PRE_LAYOUT);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i >= this.f19286b.size()) {
            return m18363a(viewGroup, this.f19285a);
        }
        String stringBuilder;
        C2361b c2361b = (C2361b) this.f19286b.get(i);
        if (c2361b.f11583a == 16) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (int i2 = 0; i2 < c2361b.f11588f.size(); i2++) {
                stringBuilder2.append(this.f19288d.getString(C7582R.string.bulleted_line_item, new Object[]{c2361b.f11588f.get(i2)}));
                stringBuilder2.append("\n");
            }
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = this.f19288d.getString(c2361b.f11585c);
        }
        return m18362a(viewGroup, c2361b, stringBuilder);
    }

    private final View m18363a(ViewGroup viewGroup, List list) {
        int size = list.size();
        if (size == 0 || size == 17) {
            FinskyLog.m21669e("numBuckets=[" + size + "]", new Object[0]);
        }
        CharSequence charSequence = null;
        Object string = size > 0 ? this.f19288d.getString(((C2361b) list.get(0)).f11584b) : null;
        Object string2 = size > 1 ? this.f19288d.getString(((C2361b) list.get(1)).f11584b) : null;
        Object string3 = size > 2 ? this.f19288d.getString(((C2361b) list.get(2)).f11584b) : null;
        Object string4 = size > 3 ? this.f19288d.getString(((C2361b) list.get(3)).f11584b) : null;
        Object string5 = size > 4 ? this.f19288d.getString(((C2361b) list.get(4)).f11584b) : null;
        String string6 = size > 5 ? this.f19288d.getString(((C2361b) list.get(5)).f11584b) : null;
        Object string7;
        switch (size) {
            case 1:
                string7 = this.f19288d.getString(((C2361b) list.get(0)).f11584b);
                break;
            case 2:
                string7 = this.f19288d.getString(C7582R.string.multiple_items_2, new Object[]{string, string2});
                break;
            case 3:
                string7 = this.f19288d.getString(C7582R.string.multiple_items_3, new Object[]{string, string2, string3});
                break;
            case 4:
                string7 = this.f19288d.getString(C7582R.string.multiple_items_4, new Object[]{string, string2, string3, string4});
                break;
            case 5:
                string7 = this.f19288d.getString(C7582R.string.multiple_items_5, new Object[]{string, string2, string3, string4, string5});
                break;
            case 6:
                string7 = this.f19288d.getString(C7582R.string.multiple_items_6, new Object[]{string, string2, string3, string4, string5, string6});
                break;
        }
        View inflate = this.f19287c.inflate(C7582R.layout.existing_permissions_row, viewGroup, false);
        ((ImageView) inflate.findViewById(C7582R.id.bucket_icon)).setImageResource(C7582R.drawable.ic_perm_check);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.short_description);
        ImageView imageView = (ImageView) inflate.findViewById(C7582R.id.expander_icon);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C7582R.id.detailed_buckets);
        ((TextView) inflate.findViewById(C7582R.id.header)).setText(C7582R.string.already_has_access_to);
        textView.setText(charSequence);
        View findViewById = inflate.findViewById(C7582R.id.permission_row);
        findViewById.setTag(Boolean.valueOf(false));
        inflate.setOnClickListener(new C3876b(this, findViewById, imageView, viewGroup2, textView));
        for (C2361b c2361b : list) {
            View a = m18362a(viewGroup, c2361b, this.f19288d.getString(c2361b.f11585c));
            a.findViewById(C7582R.id.expander_icon).setVisibility(8);
            a.setOnClickListener(null);
            a.setClickable(false);
            a.setBackgroundResource(C7582R.drawable.focus_overlay);
            a.findViewById(C7582R.id.content).setVisibility(0);
            viewGroup2.addView(a);
        }
        return inflate;
    }

    private final View m18362a(ViewGroup viewGroup, C2361b c2361b, String str) {
        View inflate = this.f19287c.inflate(C7582R.layout.permission_row, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C7582R.id.content);
        ImageView imageView = (ImageView) inflate.findViewById(C7582R.id.expander_icon);
        ImageView imageView2 = (ImageView) inflate.findViewById(C7582R.id.bucket_icon);
        ((TextView) inflate.findViewById(C7582R.id.header)).setText(c2361b.f11584b);
        textView.setText(str);
        imageView2.setImageResource(c2361b.f11586d);
        textView.setVisibility(8);
        inflate.setOnClickListener(new C3877c(this, textView, imageView));
        inflate.setBackgroundResource(C7582R.drawable.play_highlight_overlay_light);
        return inflate;
    }
}
