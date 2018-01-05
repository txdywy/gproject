package android.support.p027e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

class bm implements bp {
    public bn f1088a;

    bm(Context context, ViewGroup viewGroup, View view) {
        this.f1088a = new bn(context, viewGroup, view, this);
    }

    static bm m919c(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        while (view2 != null) {
            if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                viewGroup = (ViewGroup) view2;
                break;
            } else if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        viewGroup = null;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            view2 = viewGroup.getChildAt(i);
            if (view2 instanceof bn) {
                return ((bn) view2).f1101d;
            }
        }
        return new be(viewGroup.getContext(), viewGroup, view);
    }

    public final void mo228a(Drawable drawable) {
        Callback callback = this.f1088a;
        if (callback.f1100c == null) {
            callback.f1100c = new ArrayList();
        }
        if (!callback.f1100c.contains(drawable)) {
            callback.f1100c.add(drawable);
            callback.invalidate(drawable.getBounds());
            drawable.setCallback(callback);
        }
    }

    public final void mo229b(Drawable drawable) {
        bn bnVar = this.f1088a;
        if (bnVar.f1100c != null) {
            bnVar.f1100c.remove(drawable);
            bnVar.invalidate(drawable.getBounds());
            drawable.setCallback(null);
        }
    }
}
