package com.amsyt.beenlive.BeenLive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amsyt.beenlive.Constant.C;
import com.amsyt.beenlive.R;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        C.applyTypeface(C.getParentView(findViewById(R.id.loginlayout)),C.getAvenirProRegularFontTypeface(LoginActivity.this));

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.signupclick).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });


    }

}
