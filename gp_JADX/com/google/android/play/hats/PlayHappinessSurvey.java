package com.google.android.play.hats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.google.android.play.C6316g;
import com.google.android.play.layout.CardLinearLayout;

public class PlayHappinessSurvey extends CardLinearLayout {
    public PlayHappinessSurvey(Context context) {
        this(context, null);
    }

    public PlayHappinessSurvey(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        findViewById(C6316g.play_happiness_survey_header);
        findViewById(C6316g.play_happiness_survey_question);
        findViewById(C6316g.play_happiness_survey_answer_option_container);
    }

    public void setSurveyEventListener(C6318a c6318a) {
    }
}
