package com.example.android.firstfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends Fragment {

    public static final String TAG="Lifecycle events";
    public static final String MESSAGE_KEY="message_key";
    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i(TAG, "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
    }

    public static BlankFragment newInstance(String message) {

        Bundle args = new Bundle();
        args.putString(BlankFragment.MESSAGE_KEY,message);
        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        Bundle arguments=getArguments();
        if(arguments!=null)
        {
            String message=arguments.getString(MESSAGE_KEY);
            TextView tvMessage=(TextView) view.findViewById(R.id.message);
            tvMessage.setText(message);
        }
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach");
    }
}