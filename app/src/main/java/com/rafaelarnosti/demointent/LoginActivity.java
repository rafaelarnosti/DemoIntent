package com.rafaelarnosti.demointent;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

        import butterknife.BindView;
        import butterknife.ButterKnife;
        import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity  {

    @BindView(R.id.etLogin)
    EditText etLogin;
    @BindView(R.id.etSenha)
    EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.tvUsuario)
    public void novoUsuarioClick(){
        Intent novoUsuario = new Intent(this, NewUserActivity.class);
        startActivityForResult(novoUsuario,1);
    }

}
