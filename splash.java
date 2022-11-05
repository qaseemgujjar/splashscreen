new Handler().postDelayed(new Runnable() {

// Using handler with postDelayed called runnable run method

  @Override

     public void run() {

     Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);

      startActivity(i);

 // close this activity

      finish();

         }

       }, 5*1000); // wait for 5 seconds
