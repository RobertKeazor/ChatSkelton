package chat.sample.groupproj.com.chatskelton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickLink(View view){
        Intent intent= new Intent (this,RegistrationScreen.class);
        startActivity(intent);
        finish();
    }
}
