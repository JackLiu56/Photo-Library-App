package com.android.albumapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


/**
 * @author Ziyang Liu
 * @author Hongpeng Zhang
 */
public class HomeGridAdapter extends BaseAdapter {
    private Context mContext;

    public HomeGridAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return albumNum;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View comboView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            LayoutInflater li = LayoutInflater.from(mContext);
            comboView = new View(mContext);
            comboView = li.inflate(R.layout.home_grid, null);
        } else {
            comboView = (View) convertView;
        }
        //Dead code
        //ImageView imageView = (ImageView)comboView.findViewById(R.id.image);
        //imageView.setImageResource(R.mipmap.ic_album_icon);
        TextView textView = (TextView)comboView.findViewById(R.id.name);
        textView.setText(HomeScreen.user.getAlbums().get(position).getAlbumName());
        textView.setTextSize(35);

        return comboView;

    }

    /* test code
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView tv;
        if (convertView == null) {
            tv = new TextView(context);
            tv.setLayoutParams(new GridView.LayoutParams(100, 80));
            tv.setTextSize(20);   //text size in gridview
        }
        */

    // references to our images
    private int albumNum = HomeScreen.user.getAlbums().size();
}
