package activity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;

        import androidx.appcompat.app.AppCompatActivity;

        import io.audioshinigami.gadsleaderboard.home.HomeActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    @@ -36,4 +40,17 @@ protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_splash_screen);

        Thread splashScreenStarter = new Thread() {
            public void run() {
                try {
                    int delay = 0;
                    while (delay < 2000) {
                        sleep(150);
                        delay = delay + 100;
                    }
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }

        };
        splashScreenStarter.start();

    }

    @Override
    protected void onResume() {
        super.onResume();

        final Handler handler = new Handler();

        handler.postDelayed(this::launchHome, 1000);
    }

    private void launchHome(){
        startActivity( new Intent(this, HomeActivity.class));
    }
}
