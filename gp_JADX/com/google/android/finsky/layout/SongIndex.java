package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.bg.C1601a;
import com.squareup.leakcanary.C7582R;

public class SongIndex extends FrameLayout {
    public TextView f18383a;
    public ImageView f18384b;
    public ProgressBar f18385c;
    public int f18386d = 0;

    public SongIndex(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18383a = (TextView) findViewById(C7582R.id.song_index_text);
        this.f18384b = (ImageView) findViewById(C7582R.id.status_indicator);
        this.f18385c = (ProgressBar) findViewById(C7582R.id.loading_progress);
    }

    public int getBaseline() {
        if (this.f18383a != null) {
            this.f18383a.getBaseline();
        }
        return super.getBaseline();
    }

    public void setState(int i) {
        int i2;
        m17346a(this.f18386d, 8);
        m17346a(i, 0);
        ImageView imageView = this.f18384b;
        switch (i) {
            case 2:
                i2 = C7582R.drawable.ic_music_pause;
                break;
            case 4:
                i2 = C7582R.drawable.ic_network_error;
                break;
            case 5:
                i2 = C7582R.drawable.btn_music_play;
                break;
            default:
                i2 = C7582R.drawable.ic_music_play;
                break;
        }
        imageView.setImageResource(i2);
        imageView = this.f18384b;
        Resources resources = getResources();
        switch (i) {
            case 2:
                i2 = C7582R.string.content_description_track_playing;
                break;
            case 4:
                i2 = C7582R.string.content_description_track_error;
                break;
            case 5:
                i2 = C7582R.string.content_description_track_play;
                break;
            default:
                i2 = C7582R.string.content_description_track_paused;
                break;
        }
        imageView.setContentDescription(resources.getString(i2));
        Context context = getContext();
        if (this.f18386d != 4 && i == 4 && C1601a.m9200a(context)) {
            C1601a.m9199a(context, context.getString(C7582R.string.content_description_track_error), this.f18384b, true);
        }
        this.f18386d = i;
    }

    public void setTrackNumber(int i) {
        this.f18383a.setText(String.valueOf(i));
        this.f18383a.setContentDescription(getResources().getString(C7582R.string.content_description_track_number, new Object[]{Integer.valueOf(i)}));
    }

    private final void m17346a(int i, int i2) {
        switch (i) {
            case 0:
                if (this.f18383a != null) {
                    this.f18383a.setVisibility(i2);
                    return;
                }
                return;
            case 1:
                this.f18385c.setVisibility(i2);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                this.f18384b.setVisibility(i2);
                return;
            default:
                return;
        }
    }
}
