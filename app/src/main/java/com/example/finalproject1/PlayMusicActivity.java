package com.example.finalproject1;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PlayMusicActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private Button stopAlarmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_music);

        mediaPlayer = MediaPlayer.create(this, R.raw.anne);
        mediaPlayer.start();

        stopAlarmButton = findViewById(R.id.OffAlarm);
        stopAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                finish();
            }
        });
    }

}
