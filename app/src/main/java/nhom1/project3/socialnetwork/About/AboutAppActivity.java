package nhom1.project3.socialnetwork.About;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import nhom1.project3.socialnetwork.R;

public class AboutAppActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private Button gitBtn, fbBtn, LinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);

        // Set Home Activity Toolbar Name
        mToolbar = findViewById(R.id.about_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gitBtn = findViewById(R.id.git_btn);
        fbBtn = findViewById(R.id.fb_btn);
        LinBtn = findViewById(R.id.lin_btn);

        // 4 buttons
        // git button
        gitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://github.com/joinKen");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // instagram button
        fbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.facebook.com/it10069001");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // Linkedin button
        LinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/source-instruction-b8a502158");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

}
