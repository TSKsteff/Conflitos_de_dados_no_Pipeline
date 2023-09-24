package br.univali.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcesFile {

    List<String> listOrigin = new ArrayList<>();
    List<String> listNop = new ArrayList<>();

    public void processNop(List<String> list){

        String path = "";

        try(BufferedReader buf = new BufferedReader(new FileReader(path))){

            String line = buf.readLine();
            String linNop = buf.readLine();
            while (line != null){

                // revisar os indeces de cada rigistrador
                String rD = line.substring(2);
                String rS1 = line.substring(2);
                String rS2 = line.substring(2);

                for(int i=0; i<2; i++){
                    listNop.add(
                      ""
                    );
                }
                line = buf.readLine();
            }
        }
        catch (IOException e){

        }
    }

    public void processOrigin(){

        String path = "";

        try (BufferedReader buf = new BufferedReader(new FileReader(path))){

            String line = buf.readLine();

            while (line != null){
                listOrigin.add(line);
                line = buf.readLine();
            }

        }
        catch (IOException e){

        }

    }

}
