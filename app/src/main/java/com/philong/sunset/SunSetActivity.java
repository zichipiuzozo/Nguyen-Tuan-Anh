package com.philong.sunset;

import android.support.v4.app.Fragment;

public class SunSetActivity extends SingleFragmentActivity{


    @Override
    protected Fragment createFragment() {
        return SunSetFragment.newInstance();
    }
}
