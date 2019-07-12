package tubes.akb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    //untuk mengatur lama splashcreen
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke HomeActivity.java
                Intent home=new Intent(MainActivity.this, HomeActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
