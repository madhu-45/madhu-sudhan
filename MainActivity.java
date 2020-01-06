vpackage com.example.login2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;
    CallbackManager CallbackManager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //intitialize the facebook sdk by.
        //this is must be before the set content view
        FacebookSdk.sdkIntitialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        t=findViewById(R.id.textView);
        //intitalize callbackmanager
        CallbackManager=CallbackManager.Factory.create();
        //set the callbackmanager callback to the button
        b.registerCallback(CallbackManager,new FacebookCallback<LoginResult>()
        {
            @Override
            public void onSuccess(LoginResult loginResult)
            {
                //if the user is success this method is invokes
                t.setText("Login Success\n"+
                loginResult.getAccessToken().getUserId()+
                        "\n"+loginResult.getAccessToken().getToken());
                //loginResult.getAccessToken().getUserId() this will display users user id.
                //loginResult.getAccessToken().getToken() here this is the login token.

            }
            @Override
            public void onCancel()
            {
                //if the user cancel the request this method is invokes
                t.setText("login cancel")

            }
            @Override
            public void onError(FacebookException error)
            {
                //on the error this method is invokes
            }
        });
        //when the user click the login button this method is onactivitymethod invoeks

                @Override
                protected void onActivityResult(int requestCode,int resultCode,intent data)
                {
                    //when the user enter the  credential after login,this method is invokes.
                    //here we pass th results into the callbackmanager
                    CallbackManager.onActivityResult(requestCode,resultCode,data);
                }






    }
}

