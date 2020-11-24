package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class StartFragment extends Fragment {

    public StartFragment() {
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
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //Finding the NavController
        NavController navController = Navigation.findNavController(view);


        //Finding the Button
        Button button = view.findViewById(R.id.startGameButton);


        //On the click of button navigate to Game Fragment and send message to the GameFragment
        button.setOnClickListener(v -> {
            //This commented code was only for sending message
//            StartFragmentDirections.ActionStartFragmentToGameFragment action = StartFragmentDirections .actionStartFragmentToGameFragment();
//            action.setMessage("this is some message...");
//            navController.navigate(action);


            //Sending message and user in GameFragment
            User user = new User(26,"Abc");
            StartFragmentDirections.ActionStartFragmentToGameFragment action = StartFragmentDirections.actionStartFragmentToGameFragment(user);
            action.setMessage("This is message String Argument...");
            navController.navigate(action);
        });
    }
}