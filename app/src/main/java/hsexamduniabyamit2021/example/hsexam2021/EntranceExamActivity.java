package hsexamduniabyamit2021.example.hsexam2021;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.leo.simplearcloader.SimpleArcLoader;

public class EntranceExamActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private DatabaseReference StudentRef;
    private SimpleArcLoader simpleArcLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance_exam);

        StudentRef = FirebaseDatabase.getInstance ().getReference ().child ( "Entrance" );
        simpleArcLoader = findViewById(R.id.loader2);



        recyclerView = findViewById ( R.id.RecycleAlltheEntrance );
        recyclerView.setLayoutManager ( new LinearLayoutManager( EntranceExamActivity.this));
    }



    @Override
    public void onStart() {
        super.onStart ();

        simpleArcLoader.setVisibility(View.VISIBLE);


        FirebaseRecyclerOptions<Contacts2> options =
                new FirebaseRecyclerOptions.Builder<Contacts2> ()
                        .setQuery ( StudentRef,Contacts2.class )
                        .build ();


        FirebaseRecyclerAdapter<Contacts2, StudentViewHolder3> adapter =
                new FirebaseRecyclerAdapter<Contacts2, StudentViewHolder3> (options) {
                    @Override
                    protected void onBindViewHolder(@NonNull final StudentViewHolder3 holder, final int position, @NonNull final Contacts2 model) {


                        simpleArcLoader.setVisibility(View.GONE);


                        holder.ExamName.setText ( model.getExamName ());
                        holder.ExamType.setText ( model.getExamType ());
                        final String string = model.getLink ();


                        holder.cardView.setOnClickListener ( new View.OnClickListener () {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent ( EntranceExamActivity.this,pdfviewerActivity.class );
                                intent.putExtra ( "KOR1",string );
                                startActivity ( intent );
                            }
                        } );






                    }

                    @NonNull
                    @Override
                    public StudentViewHolder3 onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                        View view  = LayoutInflater.from ( viewGroup.getContext () ).inflate ( R.layout.entranceexamlayout,viewGroup,false );
                        StudentViewHolder3 viewHolder  = new StudentViewHolder3 (  view);
                        return viewHolder;

                    }
                };
        recyclerView.setAdapter ( adapter );
        adapter.startListening ();




    }


    public static class StudentViewHolder3 extends  RecyclerView.ViewHolder
    {

        CardView cardView;
        TextView ExamName,ExamType;
        public StudentViewHolder3(@NonNull View itemView) {
            super ( itemView );
            ExamName = itemView.findViewById ( R.id.entranceexamname );
            ExamType = itemView.findViewById ( R.id.entranceexamtype);
            cardView = itemView.findViewById ( R.id.entranceexamcard );
        }
    }
}