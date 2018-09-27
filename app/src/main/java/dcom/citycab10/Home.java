package dcom.citycab10;

public class Home {


    DatabaseReference  driversAvailable;

        private void  loadAllAvailableDriver()
        {
            mMap.clear();
                mMap.addMarker(new  MarkerOptions().position(new LatLng(mLastLocation.getLatitude(),mLasrLocation.getLongitude()))
                .title("you"));
        }

    driversAvailable = FirebaseDatabase.getInstance().getReference(Common.driver_tb1);
        driverAvailable.addValueEventListener(new ValueEventListener(){
            public void onDataChange(DataSnapshot dataSnapshot)
        {
             loadAllAvailableDriver();

        }

        public void onCancelled(){

        }
    }
}
