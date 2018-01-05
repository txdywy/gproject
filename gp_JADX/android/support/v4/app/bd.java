package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

final class bd extends bi {
    bd() {
    }

    public final boolean mo258a(Object obj) {
        return obj instanceof Transition;
    }

    public final Object mo259b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public final Object mo264c(Object obj) {
        if (obj == null) {
            return null;
        }
        Object transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public final void mo254a(Object obj, View view, ArrayList arrayList) {
        obj = (TransitionSet) obj;
        List targets = obj.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bi.m1012a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo256a(obj, arrayList);
    }

    public final void mo253a(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            bi.m1010a(view, rect);
            transition.setEpicenterCallback(new be(rect));
        }
    }

    public final void mo256a(Object obj, ArrayList arrayList) {
        int i = 0;
        Transition transition = (Transition) obj;
        if (transition != null) {
            int transitionCount;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo256a(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m1328a(transition) && bi.m1013a(transition.getTargets())) {
                int size = arrayList.size();
                for (transitionCount = 0; transitionCount < size; transitionCount++) {
                    transition.addTarget((View) arrayList.get(transitionCount));
                }
            }
        }
    }

    private static boolean m1328a(Transition transition) {
        return (bi.m1013a(transition.getTargetIds()) && bi.m1013a(transition.getTargetNames()) && bi.m1013a(transition.getTargetTypes())) ? false : true;
    }

    public final Object mo250a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public final void mo262b(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new bf(view, arrayList));
    }

    public final Object mo260b(Object obj, Object obj2, Object obj3) {
        Transition transition = null;
        Transition transition2 = (Transition) obj;
        Transition transition3 = (Transition) obj2;
        Transition transition4 = (Transition) obj3;
        if (transition2 != null && transition3 != null) {
            transition = new TransitionSet().addTransition(transition2).addTransition(transition3).setOrdering(1);
        } else if (transition2 != null) {
            transition = transition2;
        } else if (transition3 != null) {
            transition = transition3;
        }
        if (transition4 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition4);
        return transitionSet;
    }

    public final void mo251a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public final void mo255a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new bg(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void mo257a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        obj = (TransitionSet) obj;
        if (obj != null) {
            obj.getTargets().clear();
            obj.getTargets().addAll(arrayList2);
            mo263b(obj, arrayList, arrayList2);
        }
    }

    public final void mo263b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        Transition transition = (Transition) obj;
        int transitionCount;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo263b(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m1328a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                transitionCount = arrayList2 == null ? 0 : arrayList2.size();
                for (int i2 = 0; i2 < transitionCount; i2++) {
                    transition.addTarget((View) arrayList2.get(i2));
                }
                for (transitionCount = arrayList.size() - 1; transitionCount >= 0; transitionCount--) {
                    transition.removeTarget((View) arrayList.get(transitionCount));
                }
            }
        }
    }

    public final void mo261b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public final void mo265c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public final void mo252a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new bh(rect));
        }
    }
}
