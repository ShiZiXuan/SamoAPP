package com.langwing.samocharge._activity._setting;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.langwing.samocharge.R;
import com.langwing.samocharge._base.BaseActivity;
import com.langwing.samocharge._base.BaseBackActivity;

public class SuggestionActivity extends BaseBackActivity {

    @Override
    public int getLayoutID() {
        return R.layout.activity_suggestion;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("意见反馈");

    }
}
