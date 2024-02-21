package com.example.cookeasier.ui.dashboard;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cookeasier.R;
import com.example.cookeasier.databinding.FragmentDashboardBinding;

import java.net.URISyntaxException;

public class DashboardFragment extends Fragment {
    TextView result;
    EditText first;
    Button gramOz, ozGram;
    double result0;
    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        first = root.findViewById(R.id.first);
        gramOz = root.findViewById(R.id.gramOz);
        ozGram = root.findViewById(R.id.ozGram);
        result = root.findViewById(R.id.result);

        gramOz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double convert = Double.parseDouble(first.getText().toString());
                result0 = convert * 0.035274;
                result.setText(String.valueOf(result0));
            }
        });

        ozGram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double convert = Double.parseDouble(first.getText().toString());
                result0 = convert / 0.035274;
                result.setText(String.valueOf(result0));
            }
        });
        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}