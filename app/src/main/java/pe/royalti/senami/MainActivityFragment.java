package pe.royalti.senami;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] data={
                "Lun 6/23 - Soleado - 31/17",
                "Mar 6/23 - Soleado - 31/17",
                "Mie 6/23 - Soleado - 31/17",
                "Jue 6/23 - Soleado - 31/17"
        };

        List climaPorSemana=new ArrayList(Arrays.asList(data));
        mForecastAdapter =
                new ArrayAdapter(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,climaPorSemana);
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView= (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
