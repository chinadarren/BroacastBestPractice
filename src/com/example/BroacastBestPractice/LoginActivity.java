package com.example.BroacastBestPractice;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by c on 2015/8/2.
 */
public class LoginActivity extends BaseActivity{
    private EditText accountEdit;
    private EditText passwordEidt;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        accountEdit = (EditText) findViewById(R.id.account);
        passwordEidt = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = accountEdit.getText().toString();
                String password = passwordEidt.getText().toString();
                //����˺���admin��������123456������Ϊ��½�ɹ�
                if(account.equals("admin") && password.equals("123456")){
                    Intent intent = new Intent(LoginActivity.this,MyActivity.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this,"account or password is invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
