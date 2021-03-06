package joe.example.tranfertargent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private void afficherMenu(){
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button meConnecter = (Button) findViewById(R.id.btnSeconnecter);

        meConnecter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherMenu();
            }
        });
    }
}
