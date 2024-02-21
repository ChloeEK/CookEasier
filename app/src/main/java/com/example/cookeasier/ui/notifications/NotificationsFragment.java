package com.example.cookeasier.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.cookeasier.R;
import com.example.cookeasier.breakfastOptions;
import com.example.cookeasier.databinding.FragmentNotificationsBinding;
import com.example.cookeasier.searchRecipe;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {

    private Button button;
    private FragmentNotificationsBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        button = (Button) root.findViewById(R.id.searchButton);
        button.setOnClickListener(v -> open());

        return root;

    }

    public void open() {
        Intent intent = new Intent(NotificationsFragment.this.getActivity(), searchRecipe.class);

        startActivity(intent);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}