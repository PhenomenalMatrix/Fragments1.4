package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


public class ThirdFragment extends Fragment implements MainAdapter.OnClick {

    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<String> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("jojo");
        list.add("ojoj");
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.fragmentRv);
        adapter = new MainAdapter();
        adapter.setList(list, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(String s) {
        Toast.makeText(requireContext(), s,Toast.LENGTH_SHORT).show();
    }
}