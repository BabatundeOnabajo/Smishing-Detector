// Naive case:
// In the naive, traditional case, we assume and trust that the message sent out in the text message is without any details that may compromise the security of the user.

// Beginning of naive case
// import android.app.Activity;
// import android.content.Intent;
// import android.os.Bundle;

// public class MainActivity extends Activity{
   // @Override
    // public void onCreate(Bundle savedInstanceState){
       // super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

//        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
//        i.putExtra("address", "12345"); //This is the place of where the SMS message is being sent to.
//        i.putExtra("sms_body", "Hello World! My card is 11111111111"); //This is what goes into the text message.
//        i.setType("vnd.android-dir/mms-sms"); //This is the name of the directory. All SMS messages are contained in a particular database.
//        startActivity(i);
  //  }
// }

// End of naive case

// However, the naive case is problematic because users could provide information (such as financial information) that could potentially compromise their finances. In the more secure, practical case, before calling startActivity() we check to ensure the message body has no confidential financial information.

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
