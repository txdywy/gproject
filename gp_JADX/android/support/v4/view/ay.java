package android.support.v4.view;

import android.support.p009a.C0023a;
import android.view.ViewGroup;

public class ay {
    ay() {
    }

    public void mo430a(ViewGroup viewGroup) {
        viewGroup.setTag(C0023a.tag_transition_group, Boolean.valueOf(true));
    }

    public boolean mo431b(ViewGroup viewGroup) {
        Boolean bool = (Boolean) viewGroup.getTag(C0023a.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ai.f1848a.mo422u(viewGroup) == null) ? false : true;
    }
}
