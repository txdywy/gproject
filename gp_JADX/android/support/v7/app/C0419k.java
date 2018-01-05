package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class C0419k {
    public Method f2441a;
    public Method f2442b;
    public ImageView f2443c;

    C0419k(Activity activity) {
        try {
            this.f2441a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
            this.f2442b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
        } catch (NoSuchMethodException e) {
            View findViewById = activity.findViewById(16908332);
            if (findViewById != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() == 2) {
                    View childAt = viewGroup.getChildAt(0);
                    findViewById = viewGroup.getChildAt(1);
                    if (childAt.getId() != 16908332) {
                        findViewById = childAt;
                    }
                    if (findViewById instanceof ImageView) {
                        this.f2443c = (ImageView) findViewById;
                    }
                }
            }
        }
    }
}
