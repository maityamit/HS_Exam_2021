package hsexamduniabyamit2022.example.hsexam2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.leo.simplearcloader.SimpleArcLoader;

public class PhysicsPracticalActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference StudentRef;
    private SimpleArcLoader simpleArcLoader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_practical);
        StudentRef = FirebaseDatabase.getInstance ().getReference ().child ( "Class12" ).child("Physics").child("Practical");
        simpleArcLoader = findViewById(R.id.loader_prac);



        recyclerView = findViewById ( R.id.Physics_Practical_Recyclerview );
        recyclerView.setLayoutManager ( new LinearLayoutManager( PhysicsPracticalActivity.this));
    }

    @Override
    public void onStart() {
        super.onStart ();

        simpleArcLoader.setVisibility(View.VISIBLE);


        FirebaseRecyclerOptions<Contacts3> options =
                new FirebaseRecyclerOptions.Builder<Contacts3> ()
                        .setQuery ( StudentRef,Contacts3.class )
                        .build ();


        FirebaseRecyclerAdapter<Contacts3, StudentViewHolder4> adapter =
                new FirebaseRecyclerAdapter<Contacts3,StudentViewHolder4> (options) {
                    @Override
                    protected void onBindViewHolder(@NonNull final StudentViewHolder4 holder, final int position, @NonNull final Contacts3 model) {


                        simpleArcLoader.setVisibility(View.GONE);


                        holder.PracticalName.setText ( model.getPracName());
                        holder.PracticalNo.setText ( model.getPracNo());
                        final String string = model.getLink ();


                        holder.itemView.setOnClickListener ( new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent ( PhysicsPracticalActivity.this,pdfviewerActivity.class );
                                intent.putExtra ( "KOR1",string );
                                startActivity ( intent );
                            }
                        } );






                    }

                    @NonNull
                    @Override
                    public StudentViewHolder4 onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                        View view  = LayoutInflater.from ( viewGroup.getContext () ).inflate ( R.layout.physics_practical_layout,viewGroup,false );
                        StudentViewHolder4 viewHolder  = new StudentViewHolder4(  view);
                        return viewHolder;

                    }
                };
        recyclerView.setAdapter ( adapter );
        adapter.startListening ();




    }


    public static class StudentViewHolder4 extends  RecyclerView.ViewHolder
    {

        TextView PracticalName,PracticalNo;
        public StudentViewHolder4(@NonNull View itemView) {
            super ( itemView );
            PracticalName = itemView.findViewById ( R.id.physics_practical_description_textview );
            PracticalNo = itemView.findViewById ( R.id.physics_practical_no_textview);
        }
    }
}