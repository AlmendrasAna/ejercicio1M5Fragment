package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentShowPageBinding;
import com.example.myapplication.databinding.FragmentUrlBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UrlFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UrlFragment extends Fragment {
    private FragmentUrlBinding binding;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UrlFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UrlFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UrlFragment newInstance(String param1, String param2) {
        UrlFragment fragment = new UrlFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentUrlBinding.inflate(getLayoutInflater(), container, false);

        binding.showPageB.setOnClickListener(v -> {
            String url = binding.urlTxt.getText().toString();
            ShowPageFragment.newInstance(url, "");
            getActivity().getSupportFragmentManager().beginTransaction().
        add(R.id.fragmentContainerView, ShowPageFragment.newInstance(url, ""), "").addToBackStack(null).commit();


        });
        return binding.getRoot();


    }

}