package walker.walkermcbaincv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by walkermcbain on 2/7/18.
 */

public class cv extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv);

    }

    public void onClick(View view){
        Intent intent = new Intent(this, viewpdf1.class);
        startActivity(intent);

    }


    public void onButtonClicked(View view){
        Intent intent = new Intent(this, contact.class);
        startActivity(intent);

    }


}
