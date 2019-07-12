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
import android.widget.RelativeLayout;


public class About extends Fragment {

    public About(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.about, container, false);

        getActivity().setTitle("About Us");

        return view;
    }
}