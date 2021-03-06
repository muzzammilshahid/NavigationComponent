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

public class GameFragment extends Fragment {

    public GameFragment() {
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
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if (getArguments()!=null) {
            //for getting message from StartFragment
            GameFragmentArgs args = GameFragmentArgs.fromBundle(getArguments());
            String message = args.getMessage();
            System.out.println("mess"+message);


            //for getting user from StartFragment
            User user = args.getUser();
            System.out.println("mess"+user.toString());
        }

        //Finding the NavController
        NavController navController = Navigation.findNavController(view);


        //Finding the Button
        Button button = view.findViewById(R.id.finishGameButton);


        //On the click of button navigate to EndgameFragment
        button.setOnClickListener(v -> navController.navigate(R.id.action_gameFragment_to_endgameFragment));
    }

}