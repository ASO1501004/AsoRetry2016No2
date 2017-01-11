package jp.asojukuac.st.asoretry2016no2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
public class MailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        Button btnMail = (Button) this.findViewById(R.id.button3);

        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText edit01 = (EditText) findViewById(R.id.editText2);
                String title = edit01.getText().toString();

                Uri uri = Uri.parse("mailto:" + "a@gmail.com");

                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra(Intent.EXTRA_TEXT, title);
                startActivity(intent);

            }
        });
    }
}