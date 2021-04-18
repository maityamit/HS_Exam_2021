package hsexamduniabyamit2021.example.hsexam2021;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class StudyFragment extends Fragment {
    private DatabaseReference RootRef;
    private RecyclerView recyclerView;
    private ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate ( R.layout.fragment_study, container, false );


        RootRef = FirebaseDatabase.getInstance ().getReference ().child ( "Blog" );
        progressDialog = new ProgressDialog( getContext());
        progressDialog.setContentView ( R.layout.loading );
        progressDialog.setTitle ( "Please Wait..." );
        progressDialog.setCanceledOnTouchOutside ( false );
        progressDialog.setMessage ( "Tips: Please Cheak your Internet or Wi-fi Connection" );
        recyclerView = view.findViewById(R.id.Notifications_RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
    @Override
    public void onStart() {
        super.onStart ();

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