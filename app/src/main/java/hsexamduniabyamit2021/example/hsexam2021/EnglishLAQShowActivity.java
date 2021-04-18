package hsexamduniabyamit2021.example.hsexam2021;

import android.app.ProgressDialog;
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

public class EnglishLAQShowActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DatabaseReference RootRef;

    private ProgressDialog progressDialog;
    private String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_l_a_q_show);


        Intent intent = getIntent ();
        string = intent.getExtras ().getString ( "KOR1" );

        RootRef= FirebaseDatabase.getInstance ().getReference ().child("Class12").child("English").child ( "LAQ" ).child ( string );

        progressDialog = new ProgressDialog ( EnglishLAQShowActivity.this );




        progressDialog.setContentView ( R.layout.loading );
        progressDialog.setTitle ( "Please Wait" );
        progressDialog.setCanceledOnTouchOutside ( false );
        progressDialog.setMessage ( "Tips: Please Cheak your Internet or Wi-fi Connection" );





        recyclerView = findViewById ( R.id.laqrecycle);
        recyclerView.setLayoutManager ( new LinearLayoutManager(this ) );



    }


    @Override
    protected void onStart() {
        super.onStart ();

        progressDialog.show ();


        FirebaseRecyclerOptions<LAQ> options =
                new FirebaseRecyclerOptions.Builder<LAQ> ()
                        .setQuery ( RootRef,LAQ.class )
                        .build ();


        FirebaseRecyclerAdapter<LAQ, StudentViewHolder2> adapter =
                new FirebaseRecyclerAdapter<LAQ,StudentViewHolder2> (options) {
                    @Override
                    protected void onBindViewHolder(@NonNull final StudentViewHolder2 holder, final int position, @NonNull final LAQ model) {





                        holder.Qn.setText ( model.getQn ());
                        holder.ANs.setText ( model.getAns ());

                        progressDialog.dismiss ();





                    }

                    @NonNull
                    @Override
                    public StudentViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                        View view  = LayoutInflater.from ( viewGroup.getContext () ).inflate ( R.layout.longanswerslayout,viewGroup,false );
                        StudentViewHolder2 viewHolder  = new StudentViewHolder2 (  view);
                        return viewHolder;

                    }
                };
        recyclerView.setAdapter ( adapter );
        adapter.startListening ();




    }


    public static class StudentViewHolder2 extends  RecyclerView.ViewHolder
    {

        TextView Qn,ANs;
        public StudentViewHolder2(@NonNull View itemView) {
            super ( itemView );
            Qn = itemView.findViewById ( R.id.laqqn);
            ANs = itemView.findViewById ( R.id.laqans);

        }
    }
}