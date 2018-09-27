package dcom.citycab10;

public class Welcome {

    DatabaseReference onlineRef,currentUserRef;

    onlineRef = FirebaseDatabase.getInstance().getReference().child("info/connected");
    currentUserRef = FirebaseDatabase.getInstance().getReference(Common.driver_tb1)
        .child(FirebaseAuth.getInstance().getCurrentUser().getUid());

    onlineRef.addValueEventListener(new ValueEventListener())
    {
        public void onDatchan(DataSnapshot dataSnapshot)
        {
            currentUserRef.onDisconnect().removeValue();

        }

    }

    if(isOnline)
    {
        FirebaseDatabase.getInstance().getOnline();
    }
    else
    {
        FirebaseDatabse.getInstance().getOffline();
    }
}
