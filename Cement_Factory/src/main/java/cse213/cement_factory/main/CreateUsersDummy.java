package cse213.cement_factory.main;

import cse213.cement_factory.Irtesham_2420891.Plant_Manager.Plant_Manager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateUsersDummy {


    public CreateUsersDummy() throws IOException {
        FileOutputStream fos = new FileOutputStream("Plant_Manager.bin");
        ObjectOutputStream obs = new ObjectOutputStream(fos);

        Plant_Manager PLM1 = new Plant_Manager(101,"Plant Manger","101");
        Plant_Manager PLM2 = new Plant_Manager(102,"Plant Manger","102");
        obs.writeObject(PLM1);
        obs.writeObject(PLM2);
        obs.close();
        fos.close();
    }

}
