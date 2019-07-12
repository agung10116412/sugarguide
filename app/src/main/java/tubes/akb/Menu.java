package tubes.akb;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Menu extends Fragment {

    public Menu(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.menu, container, false);

        getActivity().setTitle("Sugar Guide");

        return rootView;
    }
}
