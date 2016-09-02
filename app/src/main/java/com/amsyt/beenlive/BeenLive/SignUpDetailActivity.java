package com.amsyt.beenlive.BeenLive;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.amsyt.beenlive.Constant.C;
import com.amsyt.beenlive.R;

public class SignUpDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_detail);
        C.applyTypeface(C.getParentView(findViewById(R.id.signupdetaillayout)),C.getAvenirProRegularFontTypeface(SignUpDetailActivity.this));


        findViewById(R.id.sign_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignUpDetailActivity.this,CreateGroupActivity.class);
                startActivity(i);
            }
        });

    }
}
