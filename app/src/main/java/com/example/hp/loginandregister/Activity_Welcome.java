
package com.example.hp.loginandregister;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class Activity_Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final TextView etWelcome =(TextView)findViewById(R.id.tv_welcome);
        final Button btnLogout=(Button)findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logoutintent=new Intent(Activity_Welcome.this,Activity_Login.class);
                startActivity(logoutintent);
                finish();

            }
        });


    }
}
