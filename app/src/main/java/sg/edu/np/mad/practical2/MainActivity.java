package sg.edu.np.mad.practical2;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String TAG = "Main Activity";
    private boolean following = false;
    private Button followButton;

    TextView Username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create!");

        followButton = findViewById(R.id.followed);

        followButton.setOnClickListener(view -> {
            if(following != false){ //checking if boolean is false or not, if it's true, button will change text
                followButton.setText("Unfollow");
                Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_LONG).show(); //Pop up message triggered when button has been clicked
            }
            else { //if boolean is false, button will change text
                followButton.setText("Follow");
                Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_LONG).show();
            }
            following = !following; //boolean following will change to the opp (true --> false vice versa)
        });

    }
}