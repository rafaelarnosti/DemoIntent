package com.rafaelarnosti.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewUserActivity extends AppCompatActivity {

    @BindView(R.id.etInformeUserName)
    EditText etInformeUserName;

    @BindView(R.id.etInformeName)
    EditText etInformeName;

    @BindView(R.id.etInformeSenha)
    EditText etInformeSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btCriar)
    public void criar(){
        Intent i = new Intent();

    }
}
