package sidespell.tech.viewholderquiz.Controller;

import android.content.Context;
import android.widget.ArrayAdapter;

import sidespell.tech.viewholderquiz.Entities.Movies;

/**
 * Created by User on 1/14/2016.
 */
public class MovieController extends ArrayAdapter<Movies>
{

    public MovieController(Context context, int resource) {
        super(context, resource);
    }
}
