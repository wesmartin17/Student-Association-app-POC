package io.github.wesmartin17.cssa_app_seg3125;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.github.wesmartin17.cssa_app_seg3125.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentArticleCard extends Fragment {


    public FragmentArticleCard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article_card, container, false);
    }

}