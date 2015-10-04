package appdbxtv.phanudol.traffic;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 4/10/2558.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit ประกาศตัวแปร
    private Context objContext;
    private int[] iconInts;
    private String[] titleStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    } // นี่คือ Constructor


    @Override
    public int getCount() {
        return titleStrings.length;
    }   // ทำให้ใส่รูปได้เรื่อยๆ

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);

        //Setup Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts [i]);

        //Setup Titile
        TextView tiltleTextView = (TextView) objView1.findViewById(R.id.textView2);
        tiltleTextView.setText(titleStrings[i]);

        return objView1;
    }   //getView
} //นี่คือ Main Class
