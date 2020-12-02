package com.example.sits_252;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView login, pass, res;
    Button btn;

    final String r_login = "lkj", r_pass = "qwe123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        pass = findViewById(R.id.password);
        res = findViewById(R.id.result);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String e_login = login.getText().toString();
        String e_pass = pass.getText().toString();

//        res.setText(e_login + " | " + e_pass + " | " + e_login.equals(r_login) + " | " + e_pass.equals(r_pass));

        if (e_login.equals(r_login) && e_pass.equals(r_pass)) {
            res.setTextColor(getColor(R.color.teal_200));
            res.setText("Верно");
        } else {
            res.setTextColor(getColor(R.color.red));
            res.setText("Вы ошиблись в логине или пароле");
            login.setText("");
            pass.setText("");
        }
    }
}