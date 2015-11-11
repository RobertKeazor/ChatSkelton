package chat.sample.groupproj.com.chatskelton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrationScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout);
    }
    public void onAlreadyMember(View view ){
        Intent intent = new Intent (this , MainActivity.class);
        startActivity(intent);
        finish();
    }
}
