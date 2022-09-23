package com.example.teste_fumator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Adaptador extends FragmentStateAdapter {
    public Adaptador(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public Adaptador(@NonNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
    }

    public Adaptador(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new Perfil();
        }
        return new Registro();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
