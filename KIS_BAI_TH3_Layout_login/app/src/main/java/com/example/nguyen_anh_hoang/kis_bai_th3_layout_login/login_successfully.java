package com.example.nguyen_anh_hoang.kis_bai_th3_layout_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_successfully extends AppCompatActivity {
    public  static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_successfully);
        // lấy cái giá trị string gửi qua.
        Intent intent=getIntent();
      
        if(intent!=null)
        {
            Bundle info=intent.getBundleExtra("info");
            String username=info.getString("username");
            String email=info.getString("email");
            TextView name_lg=(TextView)findViewById(R.id.lg_username);
            name_lg.setText(username.toString());
            TextView email_lg=(TextView)findViewById(R.id.lg_email_ac);
            email_lg.setText(email.toString());

        }
        else 
        {
            Toast.makeText(login_successfully.this, "No info", Toast.LENGTH_SHORT).show();
        }
        // hàm get Intent này thì sẽ giúp lấy cái thằng intent bên kia gửi qua.
//        if(intent!=null)
//        {
//            if(intent.hasExtra("username")) {
//            String user = intent.getExtras().getString("username");
//            Log.d(TAG, "username " + user);
//            TextView userna = (TextView) findViewById(R.id.user);
//            userna.setText(user);
//        }
//        else
//            {
//                Log.e(TAG,"invalid");
//            }
//        }

//        TextView user= (TextView)findViewById(R.id.user);
//
//        user.setText();
    }
}
