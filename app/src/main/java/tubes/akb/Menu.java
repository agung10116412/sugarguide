package tubes.akb;

/* Tanggal : 11 Juli 2019
   Nama    : Agung Nugraha
   Nim     : 10116412
   Kelas   : AKB9-IF9 2016
*/

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
