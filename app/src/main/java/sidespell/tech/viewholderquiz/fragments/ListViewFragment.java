package sidespell.tech.viewholderquiz.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sidespell.tech.viewholderquiz.R;

/**
 * A placeholder fragment containing a {@link android.widget.ListView}.
 */
public class ListViewFragment extends ListFragment {

    private ListView mListView;
    private TextView mTvEmpty;

    public static ListViewFragment newInstance() {
        return new ListViewFragment();
    }

    String[] mMovies = new String[] {
            "Fifty Shades of Black",
            "400 Days",
            "The Revenant",
            "Deadpool",
            "The Boy",
            "Independence Day Resurgence",
            "Diablo",
            "The 5th Wave",
            "Norm of the North",
            "The Forest"
    };

    int[] mImages = new int[]{
            R.drawable.fifty,
            R.drawable.days,
            R.drawable.revenant,
            R.drawable.deadpool,
            R.drawable.boy,
            R.drawable.resurgence,
            R.drawable.diablo,
            R.drawable.wave,
            R.drawable.norm,
            R.drawable.forest
    };
    String[] mGenre = new String[]{
            "Comedy",
            "Suspense",
            "Action",
            "Comedy/Action",
            "Horror",
            "Suspense",
            "Action",
            "Action",
            "Comedy",
            "Horror"
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("title", "Movies : " + mMovies[i]);
            hm.put("movieCP",Integer.toString(mImages[i]));
            hm.put("genre", "genres" +  mGenre[i] );
            aList.add(hm);
        }
        String[] from = { "title","movieCP","genre" };
        int[] to = { R.id.movieCP,R.id.title,R.id.genre};
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.list_item, from, to);
        setListAdapter(adapter);

        View view = inflater.inflate(R.layout.fragment_listview, container, false);
        mListView = (ListView) view.findViewById(R.id.listView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mListView = (ListView) view.findViewById(R.id.listView);
        mTvEmpty = (TextView) view.findViewById(android.R.id.empty);

    }


    
}
