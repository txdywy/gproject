package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.ai;
import android.support.v4.view.av;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class bi {
    public abstract Object mo250a(Object obj, Object obj2, Object obj3);

    public abstract void mo251a(ViewGroup viewGroup, Object obj);

    public abstract void mo252a(Object obj, Rect rect);

    public abstract void mo253a(Object obj, View view);

    public abstract void mo254a(Object obj, View view, ArrayList arrayList);

    public abstract void mo255a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void mo256a(Object obj, ArrayList arrayList);

    public abstract void mo257a(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract boolean mo258a(Object obj);

    public abstract Object mo259b(Object obj);

    public abstract Object mo260b(Object obj, Object obj2, Object obj3);

    public abstract void mo261b(Object obj, View view);

    public abstract void mo262b(Object obj, View view, ArrayList arrayList);

    public abstract void mo263b(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object mo264c(Object obj);

    public abstract void mo265c(Object obj, View view);

    public static void m1010a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    static ArrayList m1009a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(ai.f1848a.mo422u(view));
            ai.m1832a(view, null);
        }
        return arrayList2;
    }

    static void m1011a(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String u = ai.f1848a.mo422u(view2);
            arrayList4.add(u);
            if (u != null) {
                ai.m1832a(view2, null);
                String str = (String) map.get(u);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        ai.m1832a((View) arrayList2.get(i2), u);
                        break;
                    }
                }
            }
        }
        cn.m1440a(view, new bj(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    final void m1023a(ArrayList arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (av.f1860a.mo431b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m1023a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    final void m1024a(Map map, View view) {
        if (view.getVisibility() == 0) {
            String u = ai.f1848a.mo422u(view);
            if (u != null) {
                map.put(u, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m1024a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void m1012a(List list, View view) {
        int size = list.size();
        if (!m1014a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m1014a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean m1014a(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean m1013a(List list) {
        return list == null || list.isEmpty();
    }
}
