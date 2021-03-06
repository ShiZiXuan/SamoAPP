package com.langwing.samocharge._activity._setting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.langwing.samocharge.R;
import com.langwing.samocharge._activity._aboutUs.AboutUsActivity;
import com.langwing.samocharge._activity._instructions.InstructionsActivity;
import com.langwing.samocharge._base.BaseBackActivity;

/**
 * @desc: 账户设置界面
 * @author：WYJ
 * @date：2017/12/6
 */
public class SettingActivity extends BaseBackActivity implements View.OnClickListener, ISettingContract.ISettingView {

    private ISettingContract.ISettingPresenter presenter;

    @Override
    public int getLayoutID() {
        return R.layout.activity_setting;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState) {
        setTitle("设置");
        findViewById(R.id.tv_about_samo).setOnClickListener(this);
        //findViewById(R.id.tv_insturctions).setOnClickListener(this);
        findViewById(R.id.bt_out_login).setOnClickListener(this);
        findViewById(R.id.tv_setting_safe).setOnClickListener(this);
        findViewById(R.id.tv_setting_suggestion).setOnClickListener(this);
        findViewById(R.id.tv_setting_address).setOnClickListener(this);

        presenter = new SettingPresenter(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_about_samo:
                toActivity(AboutUsActivity.class);
                break;
//            case R.id.tv_insturctions:
//                toActivity(InstructionsActivity.class);
//                break;
            case R.id.bt_out_login:
                presenter.logOut();
                break;
            case R.id.tv_setting_safe:
                toActivity(SettingSafeActivity.class);
                break;
            case R.id.tv_setting_suggestion:
                toActivity(SuggestionActivity.class);
                break;
            case R.id.tv_setting_address:
                toActivity(SettingAddressActivity.class);
                break;
            default:
                break;
        }
    }
}
