package org.owntracks.android.ui.welcome.intro;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.owntracks.android.R;
import org.owntracks.android.databinding.UiWelcomeIntroBinding;
import org.owntracks.android.ui.base.BaseSupportFragment;
import org.owntracks.android.ui.base.viewmodel.NoOpViewModel;
import org.owntracks.android.ui.welcome.WelcomeFragmentMvvm;

import javax.inject.Inject;

public class IntroFragment extends BaseSupportFragment<UiWelcomeIntroBinding, NoOpViewModel> implements WelcomeFragmentMvvm.View {
    @Inject
    public IntroFragment() {
        if(viewModel == null) { fragmentComponent().inject(this); }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(viewModel == null) { fragmentComponent().inject(this);}
        return setAndBindContentView(inflater, container, R.layout.ui_welcome_intro, savedInstanceState);
    }

    @Override
    public void onNextClicked() {
    }

    @Override
    public boolean isNextEnabled() {
        return true;
    }
}
