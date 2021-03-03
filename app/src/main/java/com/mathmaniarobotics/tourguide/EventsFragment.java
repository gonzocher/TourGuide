package com.mathmaniarobotics.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EventsFragment extends Fragment {
    ListView simpleList;
    TextView serviceProjectDetails;
    ListView eventListView;
    String eventsList[] = {"Service Project", "Spikeball", "Robotics Challenge", "Meet Your Teacher"};
    int images[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_events, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        simpleList = view.findViewById(R.id.eventListView);
        serviceProjectDetails = (TextView) view.findViewById(R.id.service_project_details);
        eventListView = (ListView) view.findViewById(R.id.eventListView);
        CustomEventAdapter customAdapter = new CustomEventAdapter(getContext(), eventsList, images);
        simpleList.setAdapter(customAdapter);


        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v = (TextView) view.findViewById(R.id.service_project_details);
                Toast.makeText(getApplication(), eventsList[position], Toast.LENGTH_LONG).show();

                serviceProjectDetails.setVisibility(View.VISIBLE);
                //serviceProjectDetails.setText(v.getText());
                eventListView.setVisibility(View.INVISIBLE);

            }
        });


    }

}











