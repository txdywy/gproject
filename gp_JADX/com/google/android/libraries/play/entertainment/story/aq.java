package com.google.android.libraries.play.entertainment.story;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;
import com.google.android.agera.ac;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.story.model.av;
import java.util.List;

final class aq extends ev {
    public final Rect f30396a = new Rect();
    public final Paint f30397b = new Paint();
    public final /* synthetic */ al f30398c;

    aq(al alVar) {
        this.f30398c = alVar;
    }

    public final void mo784a(Canvas canvas, RecyclerView recyclerView, fo foVar) {
        super.mo784a(canvas, recyclerView, foVar);
        List list = (List) ((ac) C6116b.m28100a(this.f30398c.f30386h)).i_();
        if (foVar.m3705a() <= list.size()) {
            int childCount = recyclerView.getChildCount();
            if (childCount != 0) {
                View childAt = recyclerView.getChildAt(childCount - 1);
                if (childAt.getId() == C6089g.panel_padding) {
                    childCount = childAt.getTop();
                } else if (RecyclerView.m262d(childAt) == list.size() - 1) {
                    childCount = childAt.getHeight() + ((int) childAt.getY());
                } else {
                    return;
                }
                if (childCount < recyclerView.getHeight()) {
                    this.f30396a.set(0, childCount, recyclerView.getWidth(), recyclerView.getHeight());
                    this.f30397b.setColor(((av) list.get(list.size() - 1)).f30539r);
                    canvas.drawRect(this.f30396a, this.f30397b);
                }
            }
        }
    }
}
