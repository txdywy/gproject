package com.google.android.play.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.play.e;
import com.google.android.play.h;
import com.google.android.play.image.w;

public abstract class ai {
    public final Context f32341a;
    public C6419l f32342b;
    public C6419l f32343c;

    public ai(Context context) {
        this.f32341a = context;
    }

    public abstract w m29424a();

    public int m29426b() {
        return h.play_search;
    }

    public int m29427c() {
        return this.f32341a.getResources().getDimensionPixelSize(e.play_collection_edge_padding_minus_card_half_spacing);
    }

    public PlaySearch m29425a(ViewGroup viewGroup) {
        return (PlaySearch) LayoutInflater.from(this.f32341a).inflate(h.play_search, viewGroup, false);
    }
}
