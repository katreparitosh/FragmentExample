package com.example.hp.fragmentexample;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class listFrag extends ListFragment {

    private UrduWordsListener urduWordsListener;


    @Override
    public void onAttach(Context context) {
        super.onAttach( context );


        try
        {
          urduWordsListener = (UrduWordsListener) context;
        }
        catch(ClassCastException e)
        {
            throw new ClassCastException(context.toString() + "must implement interface called" + "UrduWordsListener!" );
        }
    }

    public listFrag()
    {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated( savedInstanceState );

        setListAdapter( new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1,
                getResources().getStringArray( R.array.names )) );

            urduWordsListener.onWordSelected( 0);
    }

    public  interface UrduWordsListener
    {
        public void onWordSelected(int index);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        urduWordsListener.onWordSelected( position);
  }
}
