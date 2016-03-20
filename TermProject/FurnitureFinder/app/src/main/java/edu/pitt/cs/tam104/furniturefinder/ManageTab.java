package edu.pitt.cs.tam104.furniturefinder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by Tiffany on 3/20/2016.
 */
public class ManageTab extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.manage_layout, container, false);
        return view;
    }
}
