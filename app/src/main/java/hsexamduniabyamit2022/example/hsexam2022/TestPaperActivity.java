package hsexamduniabyamit2022.example.hsexam2022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TestPaperActivity extends AppCompatActivity {
    private DatabaseReference RootRef;
    private TextView te;
    private RecyclerView recyclerView;
    private ProgressDialog progressDialog;
    private String string="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_paper);
        Intent intent = getIntent ();
        string = intent.getExtras ().getString ( "SUBJECTNODE" );
        te= findViewById(R.id.test_paper_subject);

        RootRef = FirebaseDatabase.getInstance ().getReference ().child("TestPaper").child ( string );
        progressDialog = new ProgressDialog( this);
        progressDialog.setContentView ( R.layout.loading );
        te.setText(string);
        progressDialog.setTitle ( "Please Wait..." );
        progressDialog.setCanceledOnTouchOutside ( false );
        progressDialog.setMessage ( "Tips: Please Cheak your Internet or Wi-fi Connection" );
        recyclerView = findViewById(R.id.test_paper_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


    @Override
    protected void onStart() {
        super.onStart();
        progressDialog.show ();


        FirebaseRecyclerOptions<NotificationsContact> options =
                new FirebaseRecyclerOptions.Builder<NotificationsContact> ()
                        .setQuery(RootRef,NotificationsContact.class)
                        .build ();


        FirebaseRecyclerAdapter<NotificationsContact, StudentViewHolder2> adapter =
                new FirebaseRecyclerAdapter<NotificationsContact, StudentViewHolder2> (options) {
                    @Override
                    protected void onBindViewHolder(@NonNull final StudentViewHolder2 holder, final int position, @NonNull final NotificationsContact model) {


                        holder.name.setText ( model.getName() );
                        progressDialog.dismiss ();




                    }

                    @NonNull
                    @Override
                    public StudentViewHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
                        View view  = LayoutInflater.from ( viewGroup.getContext () ).inflate ( R.layout.notifications_layout,viewGroup,false );
                        StudentViewHolder2 viewHolder  = new StudentViewHolder2(  view);
                        return viewHolder;

                    }
                };
        recyclerView.setAdapter ( adapter );
        adapter.startListening ();




    }


    public static class StudentViewHolder2 extends  RecyclerView.ViewHolder
    {

        TextView name;
        public StudentViewHolder2(@NonNull View itemView) {
            super ( itemView );
            name = itemView.findViewById ( R.id.notifications_news );

        }
    }
}