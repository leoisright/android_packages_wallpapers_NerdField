package com.android.nerdfield;

import android.app.Activity;
import android.os.Bundle;

public class NerdField extends Activity {

    private NerdFieldView mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mView = new NerdFieldView(this);
        setContentView(mView);
    }
}
