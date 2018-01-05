package com.google.android.libraries.play.entertainment.story;

import com.google.android.agera.C0899j;
import com.google.android.libraries.play.entertainment.story.model.av;
import java.util.List;

final class ao implements C0899j {
    public final /* synthetic */ al f30394a;

    ao(al alVar) {
        this.f30394a = alVar;
    }

    public final /* synthetic */ Object mo1154a(Object obj) {
        Integer num = (Integer) obj;
        switch (((Integer) this.f30394a.am.f30419p.i_()).intValue()) {
            case 1:
            case 3:
            case 5:
            case 7:
                return num;
            case 4:
            case 6:
                List list = (List) this.f30394a.f30386h.i_();
                if (!list.isEmpty()) {
                    return Integer.valueOf(((av) list.get(list.size() - 1)).f30539r);
                }
                break;
        }
        return Integer.valueOf(0);
    }
}
