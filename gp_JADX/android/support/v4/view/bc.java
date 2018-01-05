package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

final class bc implements ae {
    public final Rect f1867a = new Rect();
    public final /* synthetic */ ViewPager f1868b;

    bc(ViewPager viewPager) {
        this.f1868b = viewPager;
    }

    public final ca mo123a(View view, ca caVar) {
        ca a = ai.m1821a(view, caVar);
        if (a.m2026e()) {
            return a;
        }
        Rect rect = this.f1867a;
        rect.left = a.m2021a();
        rect.top = a.m2023b();
        rect.right = a.m2024c();
        rect.bottom = a.m2025d();
        int childCount = this.f1868b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ca b = ai.f1848a.mo419b(this.f1868b.getChildAt(i), a);
            rect.left = Math.min(b.m2021a(), rect.left);
            rect.top = Math.min(b.m2023b(), rect.top);
            rect.right = Math.min(b.m2024c(), rect.right);
            rect.bottom = Math.min(b.m2025d(), rect.bottom);
        }
        return a.m2022a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
