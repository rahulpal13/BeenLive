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

public class SignUpActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        C.applyTypeface(C.getParentView(findViewById(R.id.signuplayout)),C.getAvenirProRegularFontTypeface(SignUpActivity.this));


        findViewById(R.id.signup_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpActivity.this,SignUpDetailActivity.class);
                startActivity(i);
            }
        });

    }
}
