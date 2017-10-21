package com.example.nguyen_anh_hoang.kis_bai_th3_layout_login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,email,pass,pass_cf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.username);
        email=(EditText)findViewById(R.id.email);
        pass=(EditText)findViewById(R.id.password);
        pass_cf=(EditText)findViewById(R.id.password2);

        Button signup=(Button)findViewById(R.id.btn_signup);
                signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String USER=user.getText().toString();
                    String EMAIL=email.getText().toString();
                    String PASS=pass.getText().toString();
                    String PASS_CF=pass_cf.getText().toString();
                if(USER.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Username no empty", Toast.LENGTH_SHORT).show();
                    user.requestFocus();
                    // set autofocus when see wrong
                }
                else if(EMAIL.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Email no empty", Toast.LENGTH_SHORT).show();
                    email.requestFocus();
                    // set autofocus when see wrong
                }
                else if(PASS.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Password no empty", Toast.LENGTH_SHORT).show();
                    pass.requestFocus();
                }
                else if(PASS_CF.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Password confirm no empty", Toast.LENGTH_SHORT).show();
                    pass_cf.requestFocus();
                }
                else if(!(PASS.equals(PASS_CF)))
                {
                    Toast.makeText(MainActivity.this, "Password must duplicate", Toast.LENGTH_SHORT).show();
                    pass.requestFocus();
                }
                else if(!(android.util.Patterns.EMAIL_ADDRESS.matcher(EMAIL).matches()))
                {
                    Toast.makeText(MainActivity.this, "Format email incorrect.", Toast.LENGTH_SHORT).show();
                    email.requestFocus();
                }
                else
                {
                    Intent login_success=new Intent(MainActivity.this,login_successfully.class);
                    Bundle info_user=new Bundle();
                    info_user.putString("username",USER);
                    info_user.putString("email",EMAIL);
                    login_success.putExtra("info",info_user);
                    startActivity(login_success);
                }

//                EditText ed_usename=(EditText)findViewById(R.id.username);
//                String username=ed_usename.getText().toString();// lưu ý kỹ
//                Intent i=new Intent(MainActivity.this,login_successfully.class);
//               // i.putExtra("username",username);
//                startActivity(i);
 //               Intent intent=new Intent();
//                Tự custom action
   //             intent.setAction("MY_CUSTOM_ACTION");
//                intent.setAction(Intent.ACTION_SEND);
//                intent.putExtra(Intent.EXTRA_TEXT,"Hi! cuoc goi");
////                Uri number = Uri.parse("tel:0914471189");
////                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
//              //  startActivity(intent);
////                nếu ko muốn sử dụng app mặc định của minh
//                intent.setType("text/plain");
//                startActivity(Intent.createChooser(intent,"chon ap de gui tin nhan"));
                // chon ap de gui tin nhan. Title/
            }
        });

    }
}
