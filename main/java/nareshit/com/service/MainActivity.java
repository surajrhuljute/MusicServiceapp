package nareshit.com.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iw=(ImageView)findViewById(R.id.img1);
    }

    public void startService(View view) {
        iw.setImageResource(R.drawable.download);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void stopService(View view) {

        Intent i = new Intent(this, MyService.class);
        stopService(i);
    }


}
