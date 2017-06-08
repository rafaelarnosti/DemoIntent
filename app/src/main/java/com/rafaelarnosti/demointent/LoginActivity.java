package com.rafaelarnosti.demointent;

        import android.Manifest;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.support.v4.app.ActivityCompat;
        import android.support.v4.content.ContextCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

        import butterknife.BindView;
        import butterknife.ButterKnife;
        import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity  {

    public static final int REQUEST_NOVO_USUARIO = 1;

    @BindView(R.id.etLogin)
    EditText etLogin;
    @BindView(R.id.etSenha)
    EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        requestSmsPermission();
    }

    @OnClick(R.id.tvUsuario)
    public void novoUsuarioClick(){
        Intent novoUsuario = new Intent(this, NewUserActivity.class);
        startActivityForResult(novoUsuario,REQUEST_NOVO_USUARIO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case REQUEST_NOVO_USUARIO:
                etLogin.setText(data.getStringExtra("UserName"));
                break;
        }
    }
    private void requestSmsPermission() {
        String permission = Manifest.permission.RECEIVE_SMS;
        int grant = ContextCompat.checkSelfPermission(this, permission);
        if ( grant != PackageManager.PERMISSION_GRANTED) {
            String[] permission_list = new String[1];
            permission_list[0] = permission;
            ActivityCompat.requestPermissions(this, permission_list, 1);
        }
    }

}
