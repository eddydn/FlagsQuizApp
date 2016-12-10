package dev.edmt.flagsquizapp.Common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import dev.edmt.flagsquizapp.Model.Ranking;
import dev.edmt.flagsquizapp.R;

/**
 * Created by reale on 30/09/2016.
 */

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private List<Ranking> lstRanking;

    public CustomAdapter(Context context, List<Ranking> lstRanking) {
        this.context = context;
        this.lstRanking = lstRanking;
    }

    @Override
    public int getCount() {
        return lstRanking.size();
    }

    @Override
    public Object getItem(int position) {
        return lstRanking.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.row,null);

        ImageView imgTop = (ImageView)view.findViewById(R.id.imgTop);
        TextView txtTop = (TextView)view.findViewById(R.id.txtTop);

        if(position == 0 )// top1
            imgTop.setImageResource(R.drawable.top1);
        else if(position == 1) // top 2
            imgTop.setImageResource(R.drawable.top2);
        else
            imgTop.setImageResource(R.drawable.top3);

        txtTop.setText(String.format("%.1f",lstRanking.get(position).getScore()));
        return view;

    }
}
