package walker.walkermcbaincv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by walkermcbain on 2/7/18.
 */

public class contact extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
    }


    public void onButtonClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}