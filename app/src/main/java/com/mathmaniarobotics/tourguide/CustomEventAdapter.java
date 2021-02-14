package com.mathmaniarobotics.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mathmaniarobotics.tourguide.R;

public class CustomEventAdapter extends BaseAdapter {
    Context context;
    String eventsList[];
    int images[];
    LayoutInflater inflater;

    public CustomEventAdapter(Context applicationContext, String[] eventsList, int[] images) {
        this.context = context;
        this.eventsList = eventsList;
        this.images = images;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return eventsList.length;
    }

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
        view = inflater.inflate(R.layout.fragment_events_list_view, null);
        TextView events = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        events.setText(eventsList[i]);
        icon.setImageResource(images[i]);
        return view;
    }
}