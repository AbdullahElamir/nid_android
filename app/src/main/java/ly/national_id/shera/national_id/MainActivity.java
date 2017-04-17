package ly.national_id.shera.national_id;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Snackbar.make(view, "العنوان : راس حسن / طرابلس \n" +
                        " الهاتف : 0217294294 / 0217253253 \n" +
                        "info@nid.gov.ly: البريد الالكتروني", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        String url = "http://info.nid.gov.ly/InfoNid/reqID.aspx";
        WebView view = (WebView) this.findViewById(R.id.showWebSite);



        final ProgressDialog pd = new ProgressDialog(MainActivity.this);
        pd.setMessage("loading");
        pd.show();


        view.getSettings().setUseWideViewPort(true);
        view.getSettings().setLoadWithOverviewMode(true);
        view.getSettings().setSupportZoom(true);
        view.getSettings().setBuiltInZoomControls(true);
        view.getSettings().setDisplayZoomControls(false);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl(url);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do something after 100ms
                pd.dismiss();

            }
        }, 5000);







    }




    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

         if (id == R.id.nid) {

             final ProgressDialog pd = new ProgressDialog(MainActivity.this);
             pd.setMessage("loading");
             pd.show();

             String url = "http://info.nid.gov.ly/InfoNid/reqID.aspx";
             WebView view = (WebView) this.findViewById(R.id.showWebSite);

             view.getSettings().setUseWideViewPort(true);
             view.getSettings().setLoadWithOverviewMode(true);
             view.getSettings().setSupportZoom(true);
             view.getSettings().setBuiltInZoomControls(true);
             view.getSettings().setDisplayZoomControls(false);
             view.getSettings().setJavaScriptEnabled(true);
             view.setWebViewClient(new WebViewClient());
             view.loadUrl(url);
             final Handler handler = new Handler();
             handler.postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     //Do something after 100ms
                     pd.dismiss();

                 }
             }, 5000);

        } else if (id == R.id.nidd) {

             final ProgressDialog pd = new ProgressDialog(MainActivity.this);
             pd.setMessage("loading");
             pd.show();

             String url = "http://passapp.nid.gov.ly/passapp/";
             WebView view = (WebView) this.findViewById(R.id.showWebSite);

             view.getSettings().setUseWideViewPort(true);
             view.getSettings().setLoadWithOverviewMode(true);
             view.getSettings().setSupportZoom(true);
             view.getSettings().setBuiltInZoomControls(true);
             view.getSettings().setDisplayZoomControls(false);
             view.getSettings().setJavaScriptEnabled(true);
             view.setWebViewClient(new WebViewClient());
             view.loadUrl(url);

             final Handler handler = new Handler();
             handler.postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     //Do something after 100ms
                     pd.dismiss();

                 }
             }, 5000);

        } else if (id == R.id.niddd) {
             final ProgressDialog pd = new ProgressDialog(MainActivity.this);
             pd.setMessage("loading");
             pd.show();

             String url = "http://reservation.nid.gov.ly/#/Reserve";
             WebView view = (WebView) this.findViewById(R.id.showWebSite);

             view.getSettings().setUseWideViewPort(true);
             view.getSettings().setLoadWithOverviewMode(true);
             view.getSettings().setSupportZoom(true);
             view.getSettings().setBuiltInZoomControls(true);
             view.getSettings().setDisplayZoomControls(false);
             view.getSettings().setJavaScriptEnabled(true);
             view.setWebViewClient(new WebViewClient());
             view.loadUrl(url);

             final Handler handler = new Handler();
             handler.postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     //Do something after 100ms
                     pd.dismiss();

                 }
             }, 5000);

        } else if (id == R.id.nidddd) {

             final ProgressDialog pd = new ProgressDialog(MainActivity.this);
             pd.setMessage("loading");
             pd.show();

             String url = "https://www.facebook.com/elameer1234";
             WebView view = (WebView) this.findViewById(R.id.showWebSite);

             view.getSettings().setUseWideViewPort(true);
             view.getSettings().setLoadWithOverviewMode(true);
             view.getSettings().setSupportZoom(true);
             view.getSettings().setBuiltInZoomControls(true);
             view.getSettings().setDisplayZoomControls(false);
             view.getSettings().setJavaScriptEnabled(true);
             view.setWebViewClient(new WebViewClient());
             view.loadUrl(url);

             final Handler handler = new Handler();
             handler.postDelayed(new Runnable() {
                 @Override
                 public void run() {
                     //Do something after 100ms
                     pd.dismiss();

                 }
             }, 5000);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
