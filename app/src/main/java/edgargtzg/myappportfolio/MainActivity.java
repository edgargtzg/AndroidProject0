package edgargtzg.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Launches the Spotify Streamer App.
     * @param view related to the activity.
     */
    public void launchSpotifyStreamerApp(View view) {
        String message = "This button will launch my Spotify Streamer app!";
        Toast toast = Toast.makeText(view.getContext(),message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    /**
     * Launches the Scores App.
     * @param view related to the activity.
     */
    public void launchScoresApp(View view) {
        String message = "This button will launch my Scores app!";
        Toast toast = Toast.makeText(view.getContext(),message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    /**
     * Launches the Library App.
     * @param view related to the activity.
     */
    public void launchLibraryApp(View view) {
        String message = "This button will launch my Library app!";
        Toast toast = Toast.makeText(view.getContext(),message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    /**
     * Launches the Build It Bigger App.
     * @param view related to the activity.
     */
    public void launchBuildItBiggerApp(View view) {
        String message = "This button will launch my Build It Bigger app!";
        Toast toast = Toast.makeText(view.getContext(),message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    /**
     * Launches the XYZ Reader App.
     * @param view related to the activity.
     */
    public void launchXYZReaderApp(View view) {
        String message = "This button will launch my XYZ Reader app!";
        Toast toast = Toast.makeText(view.getContext(),message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    /**
     * Launches the Capstone App.
     * @param view related to the activity.
     */
    public void launchCapstoneApp(View view) {
        String message = "This button will launch my Capstone app!";
        Toast toast = Toast.makeText(view.getContext(),message, Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}
