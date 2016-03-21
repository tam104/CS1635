package edu.pitt.cs.tam104.furniturefinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tiffany on 3/20/2016.
 */
public class FavoriteTab extends Fragment
{
    private  RecyclerView rv;
    private  RecyclerView.LayoutManager llm;

        public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
        {
            View view = inflater.inflate(R.layout.favorite_layout, container, false);
            rv = (RecyclerView)view.findViewById(R.id.rv);
            rv.setHasFixedSize(true);

            final FragmentActivity context = getActivity();
            llm = new LinearLayoutManager(context);
            rv.setLayoutManager(llm);

            initializeData(); //Get all the furniture pieces

            return view;
        }

    class Item
    {
        String name;
        String description;
        int photoId;

        Item(String name, String description)
        {
            this.name = name;
            this.description = description;
        }
    }

    private List<Item> items;

    // This method creates an ArrayList that has three Person objects
    // Checkout the project associated with this tutorial on Github if
    // you want to use the same images.
    private void initializeData()
    {
        items = new ArrayList<>();
        items.add(new Item("Emma Wilson", "23 years old"));
        items.add(new Item("Lavery Maiss", "25 years old"));
        items.add(new Item("Lillie Watts", "35 years old"));
    }

}
