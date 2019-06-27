# otp
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}




	dependencies {
	        implementation 'com.github.manojoptisoftgit:otpviewlayout:1.0.0'
	}



 
 
 # we can you 
 
    <com.optisoft.otpview.OTPVIEW
      android:id="@+id/otp"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      app:otpViesSize="6"
      app:txtSize="10dp">

  </com.optisoft.otpview.OTPVIEW>
  
  
  # we give size of otp number and size of txt like
  
     app:otpViesSize="6"
 
     app:otpViesSize="4"
  
     app:otpViesSize="3"
   
   
      app:txtSize="10dp"
      
  # we also use methods like
  
 	// is use for otp valid or not
   
       otpview.isValidOtp()
       
       //is use for get otp val
       
            otpview.getOtpVal();
       
   
   
