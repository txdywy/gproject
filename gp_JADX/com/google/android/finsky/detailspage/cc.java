package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.finsky.dfemodel.Document;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class cc extends ArrayAdapter {
    public final /* synthetic */ EpisodeListModuleLayout f14353a;

    public cc(EpisodeListModuleLayout episodeListModuleLayout, Context context, List list) {
        this.f14353a = episodeListModuleLayout;
        super(context, C7582R.layout.tv_season_spinner_item, (Document[]) list.toArray(new Document[list.size()]));
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = LayoutInflater.from(getContext()).inflate(C7582R.layout.tv_season_spinner_selected_item, viewGroup, false);
        } else {
            inflate = view;
        }
        ((TextView) inflate).setText(((Document) getItem(i)).f14885a.f12100g.toUpperCase());
        return inflate;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(C7582R.layout.tv_season_spinner_item, viewGroup, false);
        }
        Document document = (Document) getItem(i);
        TextView textView = (TextView) view.findViewById(C7582R.id.dropdown_text);
        textView.setText(((Document) getItem(i)).f14885a.f12100g.toUpperCase());
        Resources resources = getContext().getResources();
        if (document == this.f14353a.f14003q) {
            view.setBackgroundColor(resources.getColor(C7582R.color.play_movies_primary));
            textView.setTextColor(resources.getColor(C7582R.color.white));
        } else {
            view.setBackgroundResource(C7582R.drawable.play_highlight_overlay_light);
            textView.setTextColor(resources.getColor(C7582R.color.play_fg_primary));
        }
        return view;
    }
}
