package jp.asojukuac.st.asoretry2016no2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGoogle = (Button) this.findViewById(R.id.button);
        btnGoogle.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                Uri uri = Uri.parse("http://google.com");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i);
            }
        });
        Button btnMail = (Button) this.findViewById(R.id.button2);
        btnMail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,MailActivity.class);
                startActivity(i);
            }
        });
    }
}
