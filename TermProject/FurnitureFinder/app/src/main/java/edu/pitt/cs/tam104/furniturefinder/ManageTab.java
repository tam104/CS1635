package edu.pitt.cs.tam104.furniturefinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by Tiffany on 3/20/2016.
 */
public class ManageTab extends Fragment
{
    private RecyclerView r_view;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.manage_layout, container, false);

        r_view = (RecyclerView) view.findViewById(R.id.recycler_view);
        r_view.setLayoutManager(new LinearLayoutManager(getActivity()));
        r_view.setAdapter(new RecyclerViewAdapter(getActivity()));
        return view;
    }

}
