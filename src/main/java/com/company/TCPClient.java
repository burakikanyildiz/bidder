package com.company;

import java.io.*;
import java.net.*;

public class TCPClient {


    public static void main(String [] args) throws IOException {
        String sentence="";
        String modifiedSentence;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

        Socket clientSocket = new Socket("192.168.43.57", 47923);

        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

        BufferedReader inFromServer =  new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while(!sentence.equals("aq")) {
            sentence = inFromUser.readLine();

            outToServer.writeBytes(sentence + "\n");


            modifiedSentence = inFromServer.readLine();

            System.out.println("FROM SERVER: " + modifiedSentence);


        }
        clientSocket.close();

    }

    public void initDB(){



    }


}
