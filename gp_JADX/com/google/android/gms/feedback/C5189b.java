package com.google.android.gms.feedback;

import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class C5189b {
    public Bitmap f26203a;
    public String f26204b;
    public Bundle f26205c = new Bundle();
    public String f26206d;
    public String f26207e;
    public List f26208f = new ArrayList();
    public boolean f26209g;
    public ThemeSettings f26210h;
    public LogOptions f26211i;
    public boolean f26212j;
    public C5188a f26213k;

    @TargetApi(14)
    public final FeedbackOptions m23962a() {
        return FeedbackOptions.m23949a(new FeedbackOptions(new ApplicationErrorReport()), this.f26203a).f26181a = this.f26204b.f26183c = this.f26206d.f26182b = this.f26205c.f26185e = this.f26207e.f26188h = this.f26208f.f26189i = this.f26209g.f26190j = this.f26210h.f26191k = this.f26211i.f26192l = this.f26212j.f26193m = this.f26213k;
    }
}
