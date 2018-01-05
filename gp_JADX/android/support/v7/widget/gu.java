package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.v4.p028a.C0216d;
import android.support.v4.widget.av;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0399f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

final class gu extends av implements OnClickListener {
    public final SearchView f3521m;
    public final SearchableInfo f3522n;
    public final Context f3523o;
    public final WeakHashMap f3524p;
    public final int f3525q;
    public boolean f3526r = false;
    public int f3527s = 1;
    public ColorStateList f3528t;
    public int f3529u = -1;
    public int f3530v = -1;
    public int f3531w = -1;
    public int f3532x = -1;
    public int f3533y = -1;
    public int f3534z = -1;

    public gu(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.d.getSystemService("search");
        this.f3521m = searchView;
        this.f3522n = searchableInfo;
        this.f3525q = searchView.getSuggestionCommitIconResId();
        this.f3523o = context;
        this.f3524p = weakHashMap;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final Cursor mo471a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f3521m.getVisibility() != 0 || this.f3521m.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor;
            SearchableInfo searchableInfo = this.f3522n;
            if (searchableInfo == null) {
                cursor = null;
            } else {
                String suggestAuthority = searchableInfo.getSuggestAuthority();
                if (suggestAuthority == null) {
                    cursor = null;
                } else {
                    String[] strArr;
                    Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    suggestPath = searchableInfo.getSuggestSelection();
                    if (suggestPath != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                        strArr = null;
                    }
                    fragment.appendQueryParameter("limit", "50");
                    cursor = this.d.getContentResolver().query(fragment.build(), null, suggestPath, strArr, null);
                }
            }
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m3754c(this.f2082c);
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m3754c(this.f2082c);
    }

    private static void m3754c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    public final void mo472a(Cursor cursor) {
        if (this.f3526r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo472a(cursor);
            if (cursor != null) {
                this.f3529u = cursor.getColumnIndex("suggest_text_1");
                this.f3530v = cursor.getColumnIndex("suggest_text_2");
                this.f3531w = cursor.getColumnIndex("suggest_text_2_url");
                this.f3532x = cursor.getColumnIndex("suggest_icon_1");
                this.f3533y = cursor.getColumnIndex("suggest_icon_2");
                this.f3534z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Throwable e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final View mo474a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo474a(context, cursor, viewGroup);
        a.setTag(new gv(a));
        ((ImageView) a.findViewById(C0399f.edit_query)).setImageResource(this.f3525q);
        return a;
    }

    public final void mo877a(View view, Cursor cursor) {
        Drawable drawable = null;
        gv gvVar = (gv) view.getTag();
        int i;
        if (this.f3534z != -1) {
            i = cursor.getInt(this.f3534z);
        } else {
            i = 0;
        }
        if (gvVar.f3535a != null) {
            m3750a(gvVar.f3535a, m3747a(cursor, this.f3529u));
        }
        if (gvVar.f3536b != null) {
            CharSequence charSequence;
            CharSequence a = m3747a(cursor, this.f3531w);
            if (a != null) {
                if (this.f3528t == null) {
                    TypedValue typedValue = new TypedValue();
                    this.d.getTheme().resolveAttribute(C0394a.textColorSearchUrl, typedValue, true);
                    this.f3528t = this.d.getResources().getColorStateList(typedValue.resourceId);
                }
                CharSequence spannableString = new SpannableString(a);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f3528t, null), 0, a.length(), 33);
                charSequence = spannableString;
            } else {
                charSequence = m3747a(cursor, this.f3530v);
            }
            if (TextUtils.isEmpty(charSequence)) {
                if (gvVar.f3535a != null) {
                    gvVar.f3535a.setSingleLine(false);
                    gvVar.f3535a.setMaxLines(2);
                }
            } else if (gvVar.f3535a != null) {
                gvVar.f3535a.setSingleLine(true);
                gvVar.f3535a.setMaxLines(1);
            }
            m3750a(gvVar.f3536b, charSequence);
        }
        if (gvVar.f3537c != null) {
            Drawable drawable2;
            ImageView imageView = gvVar.f3537c;
            if (this.f3532x == -1) {
                drawable2 = null;
            } else {
                drawable2 = m3746a(cursor.getString(this.f3532x));
                if (drawable2 == null) {
                    ComponentName searchActivity = this.f3522n.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.f3524p.containsKey(flattenToShortString)) {
                        ConstantState constantState = (ConstantState) this.f3524p.get(flattenToShortString);
                        drawable2 = constantState == null ? null : constantState.newDrawable(this.f3523o.getResources());
                    } else {
                        Drawable a2 = m3744a(searchActivity);
                        this.f3524p.put(flattenToShortString, a2 == null ? null : a2.getConstantState());
                        drawable2 = a2;
                    }
                    if (drawable2 == null) {
                        drawable2 = this.d.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            m3749a(imageView, drawable2, 4);
        }
        if (gvVar.f3538d != null) {
            ImageView imageView2 = gvVar.f3538d;
            if (this.f3533y != -1) {
                drawable = m3746a(cursor.getString(this.f3533y));
            }
            m3749a(imageView2, drawable, 8);
        }
        if (this.f3527s == 2 || (this.f3527s == 1 && (r7 & 1) != 0)) {
            gvVar.f3539e.setVisibility(0);
            gvVar.f3539e.setTag(gvVar.f3535a.getText());
            gvVar.f3539e.setOnClickListener(this);
            return;
        }
        gvVar.f3539e.setVisibility(8);
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3521m.onQueryRefine((CharSequence) tag);
        }
    }

    private static void m3750a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private static void m3749a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final CharSequence mo473b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m3748a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f3522n.shouldRewriteQueryFromData()) {
            a = m3748a(cursor, "suggest_intent_data");
            if (a != null) {
                return a;
            }
        }
        if (!this.f3522n.shouldRewriteQueryFromText()) {
            return null;
        }
        a = m3748a(cursor, "suggest_text_1");
        if (a != null) {
            return a;
        }
        return null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo474a(this.d, this.c, viewGroup);
            if (a != null) {
                ((gv) a.getTag()).f3535a.setText(e.toString());
            }
            return a;
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (Throwable e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo475b(this.d, this.c, viewGroup);
            if (b != null) {
                ((gv) b.getTag()).f3535a.setText(e.toString());
            }
            return b;
        }
    }

    private final Drawable m3746a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        Drawable b;
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f3523o.getPackageName() + "/" + parseInt;
            b = m3753b(str2);
            if (b != null) {
                return b;
            }
            b = C0216d.m1112a(this.f3523o, parseInt);
            m3751a(str2, b);
            return b;
        } catch (NumberFormatException e) {
            b = m3753b(str);
            if (b != null) {
                return b;
            }
            b = m3745a(Uri.parse(str));
            m3751a(str, b);
            return b;
        } catch (NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    private final Drawable m3745a(Uri uri) {
        InputStream openInputStream;
        try {
            if ("android.resource".equals(uri.getScheme())) {
                return m3752b(uri);
            }
            openInputStream = this.f3523o.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
                return createFromStream;
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                return createFromStream;
            }
        } catch (NotFoundException e2) {
            throw new FileNotFoundException("Resource does not exist: " + uri);
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        } catch (Throwable th) {
            try {
                openInputStream.close();
            } catch (Throwable e4) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e4);
            }
        }
    }

    private final Drawable m3753b(String str) {
        ConstantState constantState = (ConstantState) this.f3524p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private final void m3751a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3524p.put(str, drawable.getConstantState());
        }
    }

    private final Drawable m3744a(ComponentName componentName) {
        PackageManager packageManager = this.d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    public static String m3748a(Cursor cursor, String str) {
        return m3747a(cursor, cursor.getColumnIndex(str));
    }

    private static String m3747a(Cursor cursor, int i) {
        String str = null;
        if (i != -1) {
            try {
                str = cursor.getString(i);
            } catch (Throwable e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        return str;
    }

    private final Drawable m3752b(Uri uri) {
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.d.getPackageManager().getResourcesForApplication(authority);
            List pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    size = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException e) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                size = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (size != 0) {
                return resourcesForApplication.getDrawable(size);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (NameNotFoundException e2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}
