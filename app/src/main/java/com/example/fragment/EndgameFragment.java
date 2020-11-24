package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EndgameFragment extends Fragment {

    public EndgameFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_endgame, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //Finding the NavController
        NavController navController = Navigation.findNavController(view);


        //Finding the Button
        Button button = view.findViewById(R.id.restartGameButton);


        //setting the click on button
        button.setOnClickListener(v -> {

            //popsUp all fragment that are between the destination Fragment
            // startFragment in argument is our destination Fragment and inclusive true here means that to also popUps the given destination from the backstack
            NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.startFragment,true).build();

            //navigating
            navController.navigate(R.id.action_endgameFragment_to_startFragment,null,navOptions);
        });
    }
}