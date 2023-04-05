package id.fitriadyaa.pertemuan5fitriawidyani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button explicitintent;
    Button implicitIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicitintent = (Button) findViewById(R.id.explicit);
        explicitintent.setOnClickListener(this);
        implicitIntent = (Button) findViewById(R.id.implicit);
        implicitIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.explicit:
                Intent explicit = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(explicit);
                break;

            case R.id.implicit:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
                startActivity(implicit);
                break;

            default:
                break;
        }
    }
}