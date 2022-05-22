package app.servicio.profesional;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import app.servicio.profesional.R;

import app.servicio.profesional.adapter.RecentsAdapter;
import app.servicio.profesional.adapter.TopPlacesAdapter;
import app.servicio.profesional.model.RecentsData;
import app.servicio.profesional.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ahora aquí agregaremos algunos datos ficticios en nuestra clase de modelo

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("TERAPIAS","Juliaca","Juan Perez",R.drawable.terapias));
        recentsDataList.add(new RecentsData("SICOLOGO","Puno","Armando",R.drawable.terapias2));
        recentsDataList.add(new RecentsData("SICOLOGO","Juliaca","Jose Luis",R.drawable.terapias3));
        recentsDataList.add(new RecentsData("PSIQUIATRA","Juliaca","Francisco",R.drawable.terapias4));
        recentsDataList.add(new RecentsData("PSIQUIATRA","Puno","Alejandra",R.drawable.tearapias4));
        recentsDataList.add(new RecentsData("TERAPIAS","Puno","Belen",R.drawable.terapias));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Psicologo","Juliaca","Zamuel Salvador",R.drawable.psi));
        topPlacesDataList.add(new TopPlacesData("Terapia de recuperacion","Puno","Dr. pedro Mamani",R.drawable.psi4));
        topPlacesDataList.add(new TopPlacesData("Terapia de recuperacion","Azangaro","Ignacio Perez",R.drawable.psi3));
        topPlacesDataList.add(new TopPlacesData("Psicologo","Juliaca","Raymundo Colca",R.drawable.psi2));
        topPlacesDataList.add(new TopPlacesData("Psiquiatra","Huancane","Alex Quispe",R.drawable.psi6));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }

    // Hi all, today we are going to make a holiday tour app.
    // so lets see i will show you what we are going to build
    // so lets get started.
    // before getting started make sure to subscribe and hit the bell i con to get notified
    // everytime i post a video.
    // lets first import image assets
    // Now we will add a recycler view for recents data.
    // lets make a model class first.
    // now we create a adapter class for holding data
    // our adapter class is ready now we will setup recyclerview

    // So we have setup recents items recyclerview
    //Now we do same setup for top places
    // lets do it fast.
    // Now i will add a bottom navigation
    // now we will set the details activity
    // when user click on any of places details activity will open
    // So this app is done.
    // Please like share and subscribe
    // if any question plz do comment
    // Thanks for watching see you in the next tutorial

}
