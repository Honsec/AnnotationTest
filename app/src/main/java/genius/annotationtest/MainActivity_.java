package genius.annotationtest;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity_ extends AppCompatActivity {

    @ViewById(R.id.hello)
    TextView hello;
    @AfterViews
    public void setDate(){
        hello.setText("after view set");
    }

}
