package com.ssdiamenssion.demofirebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseInitializer {
	
	@PostConstruct
	private void initializer() {
		FileInputStream serviceAccount = null;
		try {
			serviceAccount = new FileInputStream("./serviceAccountKey.json");
		
				
			FirebaseOptions options = null;
			
			options = new FirebaseOptions.Builder()
			  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
			  .build();
	
			FirebaseApp.initializeApp(options);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


}
