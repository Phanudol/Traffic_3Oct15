package appdbxtv.phanudol.traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit (ประกาศตัวแปร)
    TextView titleTextView, detTextView;
    ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

    } //onCreate

    public void clickBack(View view) {
        finish();
    }

    private void showView() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intIcon);

        //Show Detail
        String[] strDetail = getResources().getStringArray(R.array.detail);
        detTextView.setText(strDetail[getIntent().getIntExtra("Index", 0)]);
    }

    private void bindWidget() {
        titleTextView = (TextView)findViewById(R.id.txtDetailTitle);
        detTextView = (TextView) findViewById(R.id.txtDetail);
        trafficImageView = (ImageView) findViewById(R.id.imvDetailTraffic);

    }

} //Main Class
