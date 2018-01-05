package com.google.android.finsky.layout.play;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.finsky.frameworkviews.C3076f;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class PlayListView extends ListView {
    public DataSetObserver f18734a;
    public boolean f18735b;
    public Map f18736c;
    public boolean f18737d;
    public final Rect f18738e;
    public Drawable f18739f;

    public PlayListView(Context context) {
        this(context, null);
    }

    public PlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18735b = true;
        this.f18738e = new Rect();
        this.f18739f = null;
        this.f18734a = new an(this);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f18736c = new HashMap();
        this.f18737d = false;
    }

    public void removeView(View view) {
        FinskyLog.m21665c("removeView shouldn't be called on an AdapterView.", new Object[0]);
    }

    public void setAnimateChanges(boolean z) {
        if (this.f18735b != z) {
            this.f18735b = z;
            ListAdapter adapter = getAdapter();
            if (adapter == null) {
                return;
            }
            if (z) {
                adapter.registerDataSetObserver(this.f18734a);
            } else {
                adapter.unregisterDataSetObserver(this.f18734a);
            }
        }
    }

    public void setAdapter(ListAdapter listAdapter) {
        ListAdapter adapter = getAdapter();
        if (this.f18735b && adapter != null) {
            adapter.unregisterDataSetObserver(this.f18734a);
        }
        super.setAdapter(listAdapter);
        if (this.f18735b && listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f18734a);
        }
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f18735b && !this.f18736c.isEmpty()) {
            m17570a(this);
            this.f18736c.clear();
        }
    }

    @TargetApi(16)
    final void m17570a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m17570a(viewGroup.getChildAt(i));
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f18737d) {
            this.f18738e.setEmpty();
            int childCount = getChildCount();
            int i = childCount - 1;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof C3076f) {
                    int round = Math.round(childAt.getTranslationY());
                    this.f18738e.union(childAt.getLeft(), childAt.getTop() + round, childAt.getRight(), childAt.getBottom() + round);
                    if (i2 == i && !this.f18738e.isEmpty()) {
                        this.f18739f.setBounds(this.f18738e);
                        this.f18739f.draw(canvas);
                        this.f18738e.setEmpty();
                    }
                }
            }
        }
    }
}
